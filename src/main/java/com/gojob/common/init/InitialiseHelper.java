package com.gojob.common.init;

import com.gojob.framework.common.logging.AbstractLogger;
import com.gojob.framework.common.logging.ConsoleAppender;
import com.gojob.framework.persistence.util.HibernateUtil;

public class InitialiseHelper
{
	public static void initialise()
	{
		intialiseLogger();
		
		intialiseDB();
		
		CachesUtil cacheUtil = new CachesUtil();
		cacheUtil.initialise();
		
		//TODO initialise cache	 by narendra
	}
	
	public static void intialiseLogger()
	{
		System.out.println("Initialising logger");
		//Initialising log4j
		AbstractLogger logger = new ConsoleAppender();
		logger.initialise();
	}
	
	public static void intialiseDB()
	{
		System.out.println("Initialising DB");
		
		HibernateUtil.initialise();
	}

}
