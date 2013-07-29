package com.gojob.framework.business;

import com.gojob.framework.common.Business;
import com.gojob.framework.common.Controller;

public  class AbstractBusinessController<E extends AbstractBusinessBean> implements Controller<AbstractBusinessBean> , Business
{

	public AbstractBusinessController(E bean)
	{
		interceptor(bean);
	}
	
	
	public void interceptor(AbstractBusinessBean bean)
	{
		//Intercept any incoming bean to business layer-- mainly for privilege check and common work before
		//catering any request..User object inside Bean will be useful for this.
		
		
		//System.out.println("Intercepting request in business layer");
	}


	
	

	
	

}
