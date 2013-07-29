package com.gojob.framework.persistence.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.gojob.framework.common.FrameworkException;

public class HibernateUtil 
{
	private static boolean initialised = false;
	
	private static  SessionFactory sessionFactory =null;
	
	public static void initialise()
	{
		if(!initialised)
		{
			synchronized(HibernateUtil.class)
			{
				if(!initialised)
				{
					sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
					initialised = true;
				}
			}
		}
		else
		{
			throw new FrameworkException("Hibernate already initialized");
		}
		
	}
	
	//method commented to remove compilation error.
	//method to get hibernate session
	public static Session getSession()
	{
		return sessionFactory.openSession();
	}
	
	public static void closeSession(Session session)
	{
		session.close();
	}
	
	
	
	
}
