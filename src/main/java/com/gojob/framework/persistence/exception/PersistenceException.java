package com.gojob.framework.persistence.exception;

import com.gojob.framework.common.Persistence;
import com.gojob.framework.common.logging.AppLogger;
import com.gojob.framework.common.logging.LoggingHelper;

public class PersistenceException extends Exception implements Persistence
{
	AppLogger log = LoggingHelper.getLogger(PersistenceException.class);
	PersistenceException(Throwable e)
	{
			log.error(e);
	}
	PersistenceException(String errorString)
	{
			log.error(errorString);
	}
}
