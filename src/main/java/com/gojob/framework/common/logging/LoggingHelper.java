package com.gojob.framework.common.logging;

//Helper for logging.Mainly to get logger
public class LoggingHelper 
{
	public static AppLogger getLogger(Class clazz)
	{
		return AbstractLogger.getLogger(clazz);
	}
	
	
	
}
