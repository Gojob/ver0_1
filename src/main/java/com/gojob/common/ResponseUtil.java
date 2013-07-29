package com.gojob.common;

import com.gojob.framework.business.common.SimpleResponse;

public class ResponseUtil {
	public static SimpleResponse createSuccessResponse()
	{
		SimpleResponse simpleResponse = new SimpleResponse();
		simpleResponse.setStatusCode(Constants.SUCCESS_CODE);
		
		return simpleResponse;
	}
	
	public static SimpleResponse createFailureResponse()
	{
		SimpleResponse simpleResponse = new SimpleResponse();
		simpleResponse.setStatusCode(Constants.FAILED_CODE);
		
		return simpleResponse;
	}
}
