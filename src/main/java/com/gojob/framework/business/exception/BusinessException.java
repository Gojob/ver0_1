package com.gojob.framework.business.exception;

import com.gojob.framework.common.Business;
import com.gojob.framework.common.logging.AppLogger;
import com.gojob.framework.common.logging.LoggingHelper;

public class BusinessException extends Exception implements Business
{
	private static final long serialVersionUID = 1L;
	
	AppLogger log = LoggingHelper.getLogger(BusinessException.class);
	
	public BusinessException(Throwable e)
	{
			log.error(e);
	}
	public BusinessException(String exceptionString)
	{
			log.error(exceptionString);
	}
	
}
