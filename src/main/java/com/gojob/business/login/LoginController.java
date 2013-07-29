package com.gojob.business.login;

import java.util.List;

import org.hibernate.Session;

import com.gojob.common.ResponseUtil;
import com.gojob.common.init.CachesUtil;
import com.gojob.framework.business.AbstractBusinessController;
import com.gojob.framework.business.common.SimpleResponse;
import com.gojob.framework.persistence.util.HibernateUtil;
import com.gojob.persistence.hibernatepojos.UserTbl;

//TODO - Change the return type of boolean to SimpleBean
public class LoginController extends AbstractBusinessController<LoginBean> {

	private LoginBean bean = null;
	public LoginController(LoginBean bean) {
		super(bean);
		this.bean = bean;
	}
	
	public SimpleResponse authenticate()
	{
		
		Session session = HibernateUtil.getSession();
		//TODO -Change the query to fetch only user related data and not all user data
		List<UserTbl> users = session.createQuery("from UserTbl").list();
		
		for(UserTbl user : users)
		{
			if(user.getUserName().equals(bean.getUserName()))
			{
				if(user.getPassword().equals(bean.getPassword()))
				{
					SimpleResponse simpleResponse = ResponseUtil.createSuccessResponse();
					simpleResponse.setStatusString("User " + bean.getUserName() + " successfully logged in ");
					
					return simpleResponse;
				}
			}
		}
		
		SimpleResponse simpleResponse = ResponseUtil.createFailureResponse();
		simpleResponse.setStatusString("Login denied for user " + bean.getUserName());
		return simpleResponse;
	}

	public SimpleResponse createUser() {
		
		try{
			System.out.println("User is asked to be created");
			
			Session session = HibernateUtil.getSession();
			UserTbl userTbl = new UserTbl();
			
			session.beginTransaction();
			
			userTbl.setUserName(bean.getUserName());
			userTbl.setPassword(bean.getPassword());
			userTbl.setUserRoleTbl(CachesUtil.getUserRoleTbl(3));
			userTbl.setDisabledFl((byte)0);
			
			session.save(userTbl);
			
			session.getTransaction().commit();
			
			SimpleResponse simpleResponse = ResponseUtil.createSuccessResponse();
			simpleResponse.setStatusString("User " + bean.getUserName() + " successfully created ");
			
			return simpleResponse;
		}
		catch (Exception e) {

			SimpleResponse simpleResponse = ResponseUtil.createFailureResponse();
			simpleResponse.setStatusString("Failed to create user " + bean.getUserName());
			return simpleResponse;
		}
		
		
	}

}
