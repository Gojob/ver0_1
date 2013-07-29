package com.gojob.framework.common;

public interface Controller<E extends Bean>
{
	void interceptor(E bean);
	
	
}
