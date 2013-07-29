package com.gojob.business.dummy;

import com.gojob.framework.business.AbstractBusinessController;
import com.gojob.framework.persistence.AbstractPersistenceBean;
import com.gojob.framework.persistence.AbstractPersistenceController;
import com.gojob.framework.persistence.HibernateObjectController;
import com.gojob.framework.persistence.exception.PersistenceException;
import com.gojob.persistence.dummy.DummyTable2;
import com.gojob.persistence.dummy.DummyTable1;

public class DummyProfileController extends AbstractBusinessController<DummyProfileBean>
{
	DummyProfileBean  businessBean;
	public DummyProfileController(DummyProfileBean bean)
	{
		super(bean);
		this.businessBean = bean;
		
	}
	
	public boolean saveUserProfile() throws PersistenceException
	{
		System.out.println("Found that we need to update 3 tables");
		System.out.println("Processing ...");
		
		System.out.println("Copying in to DummyTable1 ,DummyTable2..");
		
		DummyTable2 dt2 = new DummyTable2();
		DummyTable1 dt1 = new DummyTable1();
		
		//instead of below logic get the controller from a factory
		AbstractPersistenceController<AbstractPersistenceBean> controller = new HibernateObjectController();
		
		controller.save(dt1);
		controller.save(dt2);
		
		
		
		return false;
	}	
	
}
