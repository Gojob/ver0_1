package com.gojob.gui;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.gojob.business.userprofile.ProfessionalBean;
import com.gojob.business.userprofile.ProfessionalController;
import com.gojob.business.userprofile.SchoolEducationalBean;
import com.gojob.business.userprofile.SchoolEducationalController;
import com.gojob.common.Constants;
import com.gojob.common.init.CachesUtil;
import com.gojob.framework.business.AbstractBusinessController;
import com.gojob.framework.business.common.SimpleResponse;
import com.gojob.persistence.hibernatepojos.IndustryTbl;
import com.gojob.persistence.hibernatepojos.InstituteTbl;
import com.gojob.persistence.hibernatepojos.LocationTbl;
import com.gojob.persistence.hibernatepojos.ProfileTbl;
import com.gojob.persistence.hibernatepojos.QualificationTbl;
import com.gojob.persistence.hibernatepojos.TechnologyTbl;

public class ProfessionalUI extends AbstractBusinessController<ProfessionalBean> {

	public ProfessionalUI(ProfessionalBean bean) {
		super(bean);
		// TODO Auto-generated constructor stub
	}

	public static void professionalDetails(BufferedReader inp) throws IOException {

		@SuppressWarnings("unused")
		ProfessionalBean professionalBean = new ProfessionalBean(); 
		

	   /*  private Integer prfId;
	     private IndustryTbl industryTbl;
	     private TechnologyTbl technologyTbl;
	     private int exmMgId;
	     private int skillMgId;
	     private int certmapMgId;
	     private String prfResume;
	     private String prfTotalWorkEx;
	     private Set<ProfileTbl> profileTbls = new HashSet<ProfileTbl>(0);*/
		
		IndustryTbl industryTbl = new IndustryTbl();
		TechnologyTbl technologyTbl = new TechnologyTbl();
		professionalBean.setIndustryTbl(CachesUtil.getIndustryTbl(1));
		professionalBean.setTechnologyTbl(CachesUtil.getTechnologyTbl(1));
		//professionalBean.set
		
		//ProfileTbl profileTbls = new ProfileTbl();
		
		 
		 System.out.println("Enter the following details");
			
			System.out.println("Exam Mapping Id[Integer]");
			professionalBean.setExmMgId(1);
			System.out.println("Skill Mapping Id[Integer]");
			professionalBean.setSkillMgId(1);
			
			System.out.println("Certification Id [Integer]");
			professionalBean.setCertmapMgId(1);
			
			System.out.println("Resume Name [String]");
			professionalBean.setPrfResume(inp.readLine());
			
			System.out.println("Work Exp [String]");
			professionalBean.setPrfTotalWorkEx(inp.readLine()); 
			
			/*System.out.println("Parent Institute Name[String]");
			schoolEducationalBean.setQmParentInstName(inp.readLine());*/
			
			
			ProfessionalController professionalController = new ProfessionalController(professionalBean);
			SimpleResponse simpleResponse = professionalController.createProfessionalDetails();
			
			System.out.println(simpleResponse.getStatusString());
			
			if(simpleResponse.getStatusCode() == Constants.SUCCESS_CODE)
			{
				System.out.println("Success Can go to next Page Congrats!!!!!!!!!!");
				try {
					ProfessionalUI.professionalDetails(inp);
				} catch (Exception e) { 
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if(simpleResponse.getStatusCode() == Constants.FAILED_CODE)
			{
				System.out.println("Failed to create personaldetails some pb");
			}

		 
		 
	
	}

}
