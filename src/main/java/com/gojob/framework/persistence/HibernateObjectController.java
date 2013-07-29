package com.gojob.framework.persistence;

import com.gojob.framework.common.Bean;

//Generic controller to do all DB operation on Hibernate object , similar has to made for HQL
public class HibernateObjectController extends AbstractPersistenceController<AbstractPersistenceBean>
{

	//TODO - Refractor to use AbstractPersistenceBean instead of Bean in the below methods and in AbstractPersistenceController
	@Override
	protected void saveBean(Bean bean)
	{//it will take only the things which extends Bean
		System.out.println("saving  to DB");
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void updateBean(Bean bean)
	{
		System.out.println("updating  to DB");
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void deleteBean(Bean bean)
	{
		System.out.println("deleting from DB");
		// TODO Auto-generated method stub
		
	}

}
