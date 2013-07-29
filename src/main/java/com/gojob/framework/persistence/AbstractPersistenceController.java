package com.gojob.framework.persistence;

import com.gojob.framework.common.Bean;
import com.gojob.framework.common.Controller;
import com.gojob.framework.common.Persistence;
import com.gojob.framework.persistence.exception.PersistenceException;

public abstract class AbstractPersistenceController<E extends Bean> implements Controller, Persistence
{
	public final void interceptor(Bean bean)
	{
		//Intercept any incoming bean to persistence layer
		System.out.println("Intercepting request in persistence layer");
	}
	
	public void save(Bean bean) throws PersistenceException
	{
		interceptor(bean);
		
		saveBean(bean);
		
		postSave();
	}
	


	public void update(Bean bean) throws PersistenceException
	{
		interceptor(bean);
		
		updateBean(bean);
		
		postUpdate();
	}
	


	public void delete(Bean bean) throws PersistenceException
	{
		interceptor(bean);
		
		deleteBean(bean);
		
		postDelete();
	}
	
	//TODO - Insert method
	
	public void postDelete()
	{
		
	}
	public void postSave()
	{
		
	}
	public void postUpdate()
	{
		
	}

	protected abstract void saveBean(Bean bean);
	
	protected abstract void updateBean(Bean bean);
	
	protected abstract void deleteBean(Bean bean);
	
		
	
}
