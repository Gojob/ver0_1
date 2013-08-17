package com.gojob.common.init;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;

import com.gojob.framework.common.FrameworkException;
import com.gojob.framework.persistence.util.HibernateUtil;
import com.gojob.persistence.hibernatepojos.GenderTbl;
import com.gojob.persistence.hibernatepojos.IndustryTbl;
import com.gojob.persistence.hibernatepojos.InstituteTbl;
import com.gojob.persistence.hibernatepojos.LocationTbl;
import com.gojob.persistence.hibernatepojos.LocationTypeTbl;
import com.gojob.persistence.hibernatepojos.QualificationTbl;
import com.gojob.persistence.hibernatepojos.TechnologyTbl;
import com.gojob.persistence.hibernatepojos.UserRoleTbl;

public class CachesUtil {
	List<UserRoleTbl> lstUserRoles = null;
	List<GenderTbl> lstGenders = null;
	List<LocationTypeTbl> lstLocationTypes = null;
	
	List<QualificationTbl> lstQualifications = null;
	List<LocationTbl> lstLocations = null;
	List<InstituteTbl> lstInstitutes = null;
	
	List<IndustryTbl> lstIndustries = null;
	List<TechnologyTbl> lstTechnologies = null;
	
	
	
	static Map<Integer,UserRoleTbl> userRoleCache = new HashMap<Integer,UserRoleTbl>();
	static Map<Integer,GenderTbl> genderTblCache = new HashMap<Integer,GenderTbl>();
	static Map<Integer,LocationTypeTbl> locationTypeCache = new HashMap<Integer,LocationTypeTbl>();
	
	static Map<Integer,QualificationTbl> qualificationTblCache = new HashMap<Integer,QualificationTbl>();
	static Map<Integer,LocationTbl> locationTblCache = new HashMap<Integer,LocationTbl>();
	static Map<Integer,InstituteTbl> instituteTblCache = new HashMap<Integer,InstituteTbl>();
	
	
	static Map<Integer,IndustryTbl> industryTblCache = new HashMap<Integer,IndustryTbl>();
	static Map<Integer,TechnologyTbl> technologyTblCache = new HashMap<Integer,TechnologyTbl>();
	
	
	public void initialise()
	{
		Session session  = HibernateUtil.getSession();
		
		lstUserRoles = session.createQuery("from UserRoleTbl").list();
		lstGenders = session.createQuery("from GenderTbl").list();
		lstLocationTypes = session.createQuery("from LocationTypeTbl").list();
		lstQualifications = session.createQuery("from QualificationTbl").list();
		lstLocations = session.createQuery("from LocationTbl").list();
		lstInstitutes = session.createQuery("from InstituteTbl").list();
		
		lstIndustries = session.createQuery("from IndustryTbl").list();
		lstTechnologies = session.createQuery("from TechnologyTbl").list();
		loadMaps();
	}
	private void loadMaps() 
	{
		loadUserRoleTables();
		loadGenderTables();
		loadLocationTypes();
		loadQualifications();
		loadLocations();
		loadInstitutes(); 
		loadTechnologies();
		loadIndustries();
	}
	private void loadIndustries() {
		if(lstIndustries == null)
		{
			throw new FrameworkException("Cache not initialized");
		}
		
		for(IndustryTbl industryTbl : lstIndustries)
		{
			//System.out.println("Gen-->"+genderTbl.getGenderId()); 
			industryTblCache.put(industryTbl.getIndId(), industryTbl);
		}
	}
	private void loadTechnologies() {
		if(lstTechnologies == null)
		{
			throw new FrameworkException("Cache not initialized");
		}
		
		for(TechnologyTbl technologyTbl : lstTechnologies)
		{
			//System.out.println("Gen-->"+genderTbl.getGenderId()); 
			technologyTblCache.put(technologyTbl.getTechId(), technologyTbl);
		}
	}
	private void loadInstitutes() {
		if(lstInstitutes == null)
		{
			throw new FrameworkException("Cache not initialized");
		}
		
		for(InstituteTbl instituteTbl : lstInstitutes)
		{
			//System.out.println("Gen-->"+genderTbl.getGenderId()); 
			instituteTblCache.put(instituteTbl.getInstId(), instituteTbl);
		}
	}
	private void loadLocations() {
		if(lstLocations == null)
		{
			throw new FrameworkException("Cache not initialized");
		}
		for(LocationTbl locationTbl : lstLocations)
		{
			//System.out.println("Gen-->"+genderTbl.getGenderId()); 
			locationTblCache.put(locationTbl.getLocId(), locationTbl);
		}
		
	}
	private void loadQualifications() {
		// TODO Auto-generated method stub
		
		if(lstQualifications == null)
		{
			throw new FrameworkException("Cache not initialized");
		}
		for(QualificationTbl qualificationTbl : lstQualifications)
		{
			//System.out.println("Gen-->"+genderTbl.getGenderId()); 
			qualificationTblCache.put(qualificationTbl.getQualId(), qualificationTbl);
		}
		
	}
	private void loadGenderTables() {
		
		if(lstGenders == null)
		{
			throw new FrameworkException("Cache not initialized");
		}
		
		for(GenderTbl genderTbl : lstGenders)
		{
			//System.out.println("Gen-->"+genderTbl.getGenderId()); 
			genderTblCache.put(genderTbl.getGenderId(), genderTbl);
		}
	}
	private void loadLocationTypes() {
		if(lstLocationTypes == null)
		{
			throw new FrameworkException("Cache not initialized");
		}
		
		for(LocationTypeTbl locationTypeTbl : lstLocationTypes)
		{
			locationTypeCache.put(locationTypeTbl.getLocTypeId(), locationTypeTbl);
		}
		
	}
	private void loadUserRoleTables() {
		if(lstUserRoles == null)
		{
			throw new FrameworkException("Cache not initialized");
		}
		
		for(UserRoleTbl userRole : lstUserRoles)
		{
			userRoleCache.put(userRole.getUserRoleId(), userRole);
		}
	}
	
	public static UserRoleTbl getUserRoleTbl(Integer id)
	{
		return userRoleCache.get(id);
	}
	
	public static GenderTbl getGenderTbl(Integer id)
	{
		return genderTblCache.get(id);
	}
	
	public static LocationTypeTbl getLocationTypeTbl(Integer id)
	{
		return locationTypeCache.get(id);
	}
	public static QualificationTbl getQualificationTypeTbl(int id) {
		// TODO Auto-generated method stub
		return qualificationTblCache.get(id); 
	}
	public static LocationTbl getLocationTbl(int id) {
		// TODO Auto-generated method stub
		return locationTblCache.get(id); 
	}
	public static InstituteTbl getInstituteTbl(int id) {
		// TODO Auto-generated method stub
		return instituteTblCache.get(id); 
	}
	public static IndustryTbl getIndustryTbl(int id) {
		// TODO Auto
		return industryTblCache.get(id); 
	}
	public static TechnologyTbl getTechnologyTbl(int id) {
		// TODO Auto-generated method stub
		return technologyTblCache.get(id); 
	}

}
