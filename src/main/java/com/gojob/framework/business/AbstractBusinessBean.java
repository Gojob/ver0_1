package com.gojob.framework.business;

import java.util.HashMap;
import java.util.Map;

import com.gojob.framework.business.common.User;
import com.gojob.framework.common.Bean;
import com.gojob.framework.common.Business;

public class AbstractBusinessBean implements Bean , Business
{
	//TODO -Need to finalize on the common things need for Business layer .
	//those entities can be set in this class
	
	
	private User loggedUser; //user profile
	private String operation; //method to call in the business controller
	private Map<String , Object> parameters = new HashMap<String, Object>(); //to pass parameters to method which not part of concrete bean

	public User getLoggedUser()
	{
		return loggedUser;
	}

	public void setLoggedUser(User loggedUser)
	{
		this.loggedUser = loggedUser;
	}

	public String getOperation()
	{
		return operation;
	}

	public void setOperation(String operation)
	{
		this.operation = operation;
	}
	
}
