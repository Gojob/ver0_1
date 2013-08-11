package com.gojob.common.init;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;

import com.gojob.framework.common.FrameworkException;
import com.gojob.framework.persistence.util.HibernateUtil;
import com.gojob.persistence.hibernatepojos.GenderTbl;
import com.gojob.persistence.hibernatepojos.LocationTypeTbl;
import com.gojob.persistence.hibernatepojos.UserRoleTbl;

public class CachesUtil {
	List<UserRoleTbl> lstUserRoles = null;
	List<GenderTbl> lstGenders = null;
	List<LocationTypeTbl> lstLocationTypes = null;
	static Map<Integer,UserRoleTbl> userRoleCache = new HashMap<Integer,UserRoleTbl>();
	static Map<Integer,GenderTbl> genderTblCache = new HashMap<Integer,GenderTbl>();
	static Map<Integer,LocationTypeTbl> locationTypeCache = new HashMap<Integer,LocationTypeTbl>();
	
	public void initialise()
	{
		Session session  = HibernateUtil.getSession();
		
		lstUserRoles = session.createQuery("from UserRoleTbl").list();
		lstGenders = session.createQuery("from GenderTbl").list();
		lstLocationTypes = session.createQuery("from LocationTypeTbl").list();
		
		loadMaps();
	}
	private void loadMaps() 
	{
		loadUserRoleTables();
		loadGenderTables();
		loadLocationTypes();
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

}
