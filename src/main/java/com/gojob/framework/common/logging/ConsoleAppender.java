package com.gojob.framework.common.logging;

/*
 * Mechanism to redirect log to console too , after loggin is done.
 */
public class ConsoleAppender extends AbstractLogger
{

	//to append log to console aswell
	public ConsoleAppender()
	{
		System.out.println("Using console appender");
	}
	
	
	@Override
	public void postLog(String errorString)
	{
		System.out.println(errorString);
	}

	@Override
	public void postLog(Throwable throwable)
	{
		throwable.printStackTrace();
	}

}
