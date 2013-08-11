package com.gojob.gui;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Date;

import com.gojob.business.userprofile.PersonalBean;
import com.gojob.business.userprofile.PersonalController;
import com.gojob.common.Constants;
import com.gojob.common.init.CachesUtil;
import com.gojob.framework.business.common.SimpleResponse;
import com.gojob.persistence.hibernatepojos.ContactTbl;
import com.gojob.persistence.hibernatepojos.GenderTbl;
import com.gojob.persistence.hibernatepojos.LocationTbl;

public class PersonalUI {

	public static void personalDetails(BufferedReader inp) throws IOException {
		PersonalBean personalBean = new PersonalBean();
		GenderTbl genderBean = new GenderTbl();
		ContactTbl contactBean = new ContactTbl();
		LocationTbl locationTbl = new LocationTbl();
		locationTbl.setLocationTypeTbl(CachesUtil.getLocationTypeTbl(1)); 
		contactBean.setLocationTbl(locationTbl);
		System.out.println("Enter the following details");
		
		System.out.println("FirstName[String]");
		personalBean.setPerFirstName(inp.readLine());
		
		System.out.println("LastName[String]");
		personalBean.setPerLastName(inp.readLine());
		
		System.out.println("Gender[String]");
		genderBean.setGenderType(inp.readLine());
		personalBean.setGenderTbl(CachesUtil.getGenderTbl(1)); 
		
		System.out.println("DateofBirth[Date] in DD/MM/YYYY Format");
		//personalBean.setPerDob(inp.readLine());
		personalBean.setPerDob(new Date());
		
		System.out.println("MobileNumber[String]");
		contactBean.setContactCellNumber(inp.readLine());
		personalBean.setContactTbl(contactBean);
		
		PersonalController personalController = new PersonalController(personalBean,contactBean,genderBean,locationTbl);
		SimpleResponse simpleResponse = personalController.createPersonalDetails();
		
		System.out.println(simpleResponse.getStatusString());
		
		if(simpleResponse.getStatusCode() == Constants.SUCCESS_CODE)
		{
			System.out.println("Success Can go to next Page Congrats!!!!!!!!!!");
		}
		else if(simpleResponse.getStatusCode() == Constants.FAILED_CODE)
		{
			System.out.println("Failed to create personaldetails some pb");
		}
			
		
		
		
	}

}
