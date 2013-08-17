package com.gojob.business.userprofile;

import org.hibernate.Session;

import com.gojob.common.ResponseUtil;
import com.gojob.framework.business.AbstractBusinessController;
import com.gojob.framework.business.common.SimpleResponse;
import com.gojob.framework.persistence.util.HibernateUtil;
import com.gojob.persistence.hibernatepojos.ProfessionalTbl;

public class ProfessionalController extends AbstractBusinessController<ProfessionalBean>{
	ProfessionalBean professionalBean = new ProfessionalBean();
	public ProfessionalController(ProfessionalBean bean) {
		super(bean);
		this.professionalBean = bean;
		// TODO Auto-generated constructor stub
	}

	public SimpleResponse createProfessionalDetails() {
		Session session = HibernateUtil.getSession();
		
		ProfessionalTbl professionalTbl = new ProfessionalTbl();
		session.beginTransaction();
		professionalTbl.setCertmapMgId(professionalBean.getCertmapMgId()) ;
		professionalTbl.setExmMgId(professionalBean.getExmMgId()) ;
		professionalTbl.setSkillMgId(professionalBean.getSkillMgId()) ;
		professionalTbl.setPrfResume(professionalBean.getPrfResume()) ;
		professionalTbl.setPrfTotalWorkEx(professionalBean.getPrfTotalWorkEx()) ;
		professionalTbl.setIndustryTbl(professionalBean.getIndustryTbl()) ;
		professionalTbl.setTechnologyTbl(professionalBean.getTechnologyTbl()) ;
		SimpleResponse simpleResponse = ResponseUtil.createSuccessResponse();
		simpleResponse.setStatusString("User Professional Details successfully created");
		
		
		session.save(professionalTbl);
		session.getTransaction().commit();
		return simpleResponse;
		
	}

}
