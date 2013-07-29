package com.gojob.framework.business.exception;

import com.gojob.framework.common.Business;
import com.gojob.framework.common.logging.AppLogger;
import com.gojob.framework.common.logging.LoggingHelper;

public class BusinessRuntimeException  extends RuntimeException implements Business
{
	AppLogger log = LoggingHelper.getLogger(BusinessRuntimeException.class);
	public BusinessRuntimeException(Throwable e)
	{
		log.error(e);
	}
	public BusinessRuntimeException(String exceptionString)
	{
		log.error(exceptionString);
	}
}
