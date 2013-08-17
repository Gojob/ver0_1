package com.gojob.gui;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Date;

import com.gojob.business.userprofile.PersonalController;
import com.gojob.business.userprofile.SchoolEducationalBean;
import com.gojob.business.userprofile.SchoolEducationalController;
import com.gojob.common.Constants;
import com.gojob.common.init.CachesUtil;
import com.gojob.framework.business.common.SimpleResponse;
import com.gojob.persistence.hibernatepojos.InstituteTbl;
import com.gojob.persistence.hibernatepojos.LocationTbl;
import com.gojob.persistence.hibernatepojos.QualificationTbl;

public class SchoolEducationalUI {

	
	public static void schoolEducationalDetails(BufferedReader inp) throws Exception,IOException
	{
		@SuppressWarnings("unused")
		SchoolEducationalBean schoolEducationalBean = new SchoolEducationalBean(); 
		 QualificationTbl qualificationTbl = new QualificationTbl();
		 LocationTbl locationTbl = new LocationTbl();
		 InstituteTbl instituteTbl = new InstituteTbl();
		 
		 schoolEducationalBean.setQualificationTbl(CachesUtil.getQualificationTypeTbl(1));
		 schoolEducationalBean.setLocationTbl(CachesUtil.getLocationTbl(1));
		 schoolEducationalBean.setInstituteTbl(CachesUtil.getInstituteTbl(1));
		 //qualificationTbl.setQualId(CachesUtil.getLocationTypeTbl(1)); 
		 
		 /*
		 private String qmInstName;
			private Date qmStartDate;

			private Date qmEndDate;
			private Double qmMarksPercentage;
			private Double qmCgpa;
			private String qmParentInstName;*/
		 
		 
		 
		 System.out.println("Enter the following details");
			
			System.out.println("Institute Name[String]");
			schoolEducationalBean.setQmInstName(inp.readLine());
			
			System.out.println("Start Date[String]");
			schoolEducationalBean.setQmStartDate(new Date());
			
			System.out.println("End Date[String]");
			schoolEducationalBean.setQmEndDate(new Date());
			
			System.out.println("Marks Percentage [Double]");
			schoolEducationalBean.setQmMarksPercentage(Double.parseDouble(inp.readLine()));
			
			System.out.println("Cgpa [String]");
			schoolEducationalBean.setQmCgpa(Double.parseDouble(inp.readLine()));
			
			System.out.println("Parent Institute Name[String]");
			schoolEducationalBean.setQmParentInstName(inp.readLine());
			
			
			SchoolEducationalController schoolEducationalController = new SchoolEducationalController(schoolEducationalBean);
			SimpleResponse simpleResponse = schoolEducationalController.createschoolEducationalDetails();
			
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
		// Cache For Quali,Loc,Institute
		
		
		
		
	
	
	

