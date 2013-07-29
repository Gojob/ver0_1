package com.gojob.business.login;

import java.util.List;

import org.hibernate.Session;

import com.gojob.framework.business.AbstractBusinessController;
import com.gojob.framework.persistence.util.HibernateUtil;
import com.gojob.persistence.hibernatepojos.UserTbl;

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

}
