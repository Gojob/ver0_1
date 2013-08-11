package com.gojob.business.userprofile;

import org.hibernate.Session;

import com.gojob.common.ResponseUtil;
import com.gojob.common.init.CachesUtil;
import com.gojob.framework.business.AbstractBusinessController;
import com.gojob.framework.business.common.SimpleResponse;
import com.gojob.framework.persistence.util.HibernateUtil;
import com.gojob.persistence.hibernatepojos.ContactTbl;
import com.gojob.persistence.hibernatepojos.GenderTbl;
import com.gojob.persistence.hibernatepojos.LocationTbl;
import com.gojob.persistence.hibernatepojos.PersonalTbl;
import com.gojob.persistence.hibernatepojos.UserTbl;

public class PersonalController extends AbstractBusinessController<PersonalBean>{
	PersonalBean personalBean = null;
	ContactTbl contactTbl = null;
	GenderTbl genderTbl = null;
	LocationTbl locationTbl = null;
	public PersonalController(PersonalBean personalBean,ContactTbl contactTbl,GenderTbl genderTbl,LocationTbl locationTbl) {
		super(personalBean);
		this.personalBean = personalBean;
		this.contactTbl = contactTbl;
		this.genderTbl = genderTbl;
		this.locationTbl = locationTbl;
		// TODO Auto-generated constructor stub
	}
	
	public SimpleResponse createPersonalDetails() {
		try{
			System.out.println("User's Personal Details is asked to be created");
			
			Session session = HibernateUtil.getSession();
			PersonalTbl personalTbl = new PersonalTbl();
			
			session.beginTransaction();
			
			personalTbl.setPerFirstName(personalBean.getPerFirstName());
			personalTbl.setPerLastName(personalBean.getPerLastName());
			personalTbl.setGenderTbl(CachesUtil.getGenderTbl(1)); 
			personalTbl.setPerDob(personalBean.getPerDob());
			personalTbl.setContactTbl(personalBean.getContactTbl());
			session.save(locationTbl);
			session.save(contactTbl);
			session.save(personalTbl);
			
			session.getTransaction().commit();
			
			SimpleResponse simpleResponse = ResponseUtil.createSuccessResponse();
			simpleResponse.setStatusString("User Personal Details successfully created ");
			
			return simpleResponse;
		}
		catch (Exception e) {
			e.printStackTrace();
			SimpleResponse simpleResponse = ResponseUtil.createFailureResponse();
			simpleResponse.setStatusString("Failed to create user's PersonalDetails" );
			return simpleResponse;
		}
	}
}
