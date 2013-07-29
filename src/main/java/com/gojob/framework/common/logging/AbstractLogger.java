package com.gojob.framework.common.logging;

import org.apache.log4j.PropertyConfigurator;

import com.gojob.framework.common.FrameworkException;

/*
 * TODO -Wrapping log4j here
 */
public abstract  class AbstractLogger implements AppLogger 
{
	
	AppLogger instance = null;
	protected AbstractLogger()
	{
		
	}
	public void initialise()
	{
		if(instance == null)
		{
			synchronized (AbstractLogger.class) 
			{
				if(instance == null)
				{
					instance = this;
					//PropertyConfigurator.configure("log4j.properties");
				}
			}
		}
		else
		{
			throw new FrameworkException("Logging already initialized");
		}
			
			
		
	}
	public static AppLogger getLogger(Class clazz)
	{
		// Logger.getLogger(clazz)
		return null;
	}
	public void error(String errorString)
	{
		//TODO
		postLog(errorString);
	}

	public  void error(Throwable e)
	{
		//TODO
		postLog(e);
	}
	public  void info(String infoString)
	{
		//TODO
		postLog(infoString);
	}
	public void debug(String debugString)
	{
		//TODO
		postLog(debugString);
	}
	public void trace(String traceString)
	{
		//TODO
		postLog(traceString);
	}
	public void warn(String warnString)
	{
		//TODO
		postLog(warnString);
	}
	
	public abstract void postLog(String errorString);
	public abstract void postLog(Throwable throwable);
	
	
}
