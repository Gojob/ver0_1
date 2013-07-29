package com.gojob.common.init;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;

import com.gojob.framework.common.FrameworkException;
import com.gojob.framework.persistence.util.HibernateUtil;
import com.gojob.persistence.hibernatepojos.UserRoleTbl;

public class CachesUtil {
	List<UserRoleTbl> lstUserRoles = null;
	static Map<Integer,UserRoleTbl> userRoleCache = new HashMap<Integer,UserRoleTbl>();
	public void initialise()
	{
		Session session  = HibernateUtil.getSession();
		
		lstUserRoles = session.createQuery("from UserRoleTbl").list();
		
		loadMaps();
	}
	private void loadMaps() 
	{
		loadUserRoleTables();
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

}
