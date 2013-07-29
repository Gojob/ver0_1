package com.gojob.framework.common;

import com.gojob.framework.common.logging.AppLogger;
import com.gojob.framework.common.logging.LoggingHelper;


public class FrameworkException extends RuntimeException
{
	private static final long serialVersionUID = 1L;

	public FrameworkException(String err)
	{
		AppLogger loggable = LoggingHelper.getLogger(FrameworkException.class);
		if(loggable != null)
		{
			loggable.error(err);
		}
		else
		{
			System.out.println(err);
		}
	}
	
	public FrameworkException(Throwable e)
	{
		AppLogger loggable = LoggingHelper.getLogger(FrameworkException.class);
		if(loggable != null)
		{
			loggable.error(e);
		}
		else
		{
			e.printStackTrace();
		}
	}
}
