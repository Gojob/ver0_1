package com.gojob.business.userprofile;

import java.util.Date;

import org.hibernate.Session;

import com.gojob.common.ResponseUtil;
import com.gojob.common.init.CachesUtil;
import com.gojob.framework.business.AbstractBusinessController;
import com.gojob.framework.business.common.SimpleResponse;
import com.gojob.framework.persistence.util.HibernateUtil;
import com.gojob.persistence.hibernatepojos.PersonalTbl;
import com.gojob.persistence.hibernatepojos.QualificationMapping;

public class SchoolEducationalController extends AbstractBusinessController<SchoolEducationalBean>{
	SchoolEducationalBean schoolEducationalBean = null;
	public SchoolEducationalController(SchoolEducationalBean bean) {
		super(bean);
		this.schoolEducationalBean = bean;
		
	}
	public SimpleResponse createschoolEducationalDetails() {
		

		System.out.println("User's School Educational Details is asked to be created");
		
		Session session = HibernateUtil.getSession();
		QualificationMapping qualificationMappingTbl = new QualificationMapping();
		
		session.beginTransaction();

		qualificationMappingTbl.setQmInstName(schoolEducationalBean.getQmInstName());

		qualificationMappingTbl.setQmStartDate(schoolEducationalBean.getQmStartDate());

		qualificationMappingTbl.setQmEndDate(schoolEducationalBean.getQmEndDate());

		qualificationMappingTbl.setQmMarksPercentage(schoolEducationalBean.getQmMarksPercentage());
		
		qualificationMappingTbl.setQmCgpa(schoolEducationalBean.getQmCgpa());
		
		qualificationMappingTbl.setQmParentInstName(schoolEducationalBean.getQmParentInstName());
		
		qualificationMappingTbl.setInstituteTbl(schoolEducationalBean.getInstituteTbl());
		qualificationMappingTbl.setLocationTbl(schoolEducationalBean.getLocationTbl());
		qualificationMappingTbl.setQualificationTbl(schoolEducationalBean.getQualificationTbl());

	
		session.save(qualificationMappingTbl);
		
		session.getTransaction().commit();
		
		SimpleResponse simpleResponse = ResponseUtil.createSuccessResponse();
		simpleResponse.setStatusString("User Educational Details successfully created");
		
		return simpleResponse;
	
	}

}
