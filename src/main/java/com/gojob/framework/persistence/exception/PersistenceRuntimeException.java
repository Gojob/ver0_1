package com.gojob.framework.persistence.exception;

import com.gojob.framework.common.Persistence;
import com.gojob.framework.common.logging.AppLogger;
import com.gojob.framework.common.logging.LoggingHelper;

public class PersistenceRuntimeException extends RuntimeException implements Persistence
{
	AppLogger log = LoggingHelper.getLogger(PersistenceRuntimeException.class);
	PersistenceRuntimeException(Throwable e)
	{
			log.error(e);
	}
	PersistenceRuntimeException(String errorString)
	{
			log.error(errorString);
	}
}
