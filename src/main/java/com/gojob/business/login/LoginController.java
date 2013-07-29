package com.gojob.business.login;

import java.util.List;

import org.hibernate.Session;

import com.gojob.common.init.CachesUtil;
import com.gojob.framework.business.AbstractBusinessController;
import com.gojob.framework.persistence.util.HibernateUtil;
import com.gojob.persistence.hibernatepojos.UserTbl;

//TODO - Change the return type of boolean to SimpleBean
public class LoginController extends AbstractBusinessController<LoginBean> {

	private LoginBean bean = null;
	public LoginController(LoginBean bean) {
		super(bean);
		this.bean = bean;
	}
	
	public boolean authenticate()
	{
		Session session = HibernateUtil.getSession();
		//TODO -Change the query to fetch only user related data and not all user data
		List<UserTbl> users = session.createQuery("from UserTbl").list();
		
		for(UserTbl user : users)
		{
			if(user.getUserName().equals(bean.getUserName()))
			{
				if(user.getPassword().equals(bean.getPassword()))
						return true;
			}
		}
		
		return false;
	}

	public boolean createUser() {
		
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
			return true;
		}
		catch (Exception e) {
			System.out.println("Operation failed");
			return false;
		}
		
		
	}

}
