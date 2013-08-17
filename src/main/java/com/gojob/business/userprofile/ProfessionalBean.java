package com.gojob.business.userprofile;

import java.util.HashSet;
import java.util.Set;

import com.gojob.framework.business.AbstractBusinessBean;
import com.gojob.persistence.hibernatepojos.IndustryTbl;
import com.gojob.persistence.hibernatepojos.ProfileTbl;
import com.gojob.persistence.hibernatepojos.TechnologyTbl;

public class ProfessionalBean extends AbstractBusinessBean{


    private Integer prfId;
    private IndustryTbl industryTbl;
    private TechnologyTbl technologyTbl;
    private int exmMgId;
    private int skillMgId;
    private int certmapMgId;
    private String prfResume;
    private String prfTotalWorkEx;
    private Set<ProfileTbl> profileTbls = new HashSet<ProfileTbl>(0);
	public Integer getPrfId() {
		return prfId;
	}
	public void setPrfId(Integer prfId) {
		this.prfId = prfId;
	}
	public IndustryTbl getIndustryTbl() {
		return industryTbl;
	}
	public void setIndustryTbl(IndustryTbl industryTbl) {
		this.industryTbl = industryTbl;
	}
	public TechnologyTbl getTechnologyTbl() {
		return technologyTbl;
	}
	public void setTechnologyTbl(TechnologyTbl technologyTbl) {
		this.technologyTbl = technologyTbl;
	}
	public int getExmMgId() {
		return exmMgId;
	}
	public void setExmMgId(int exmMgId) {
		this.exmMgId = exmMgId;
	}
	public int getSkillMgId() {
		return skillMgId;
	}
	public void setSkillMgId(int skillMgId) {
		this.skillMgId = skillMgId;
	}
	public int getCertmapMgId() {
		return certmapMgId;
	}
	public void setCertmapMgId(int certmapMgId) {
		this.certmapMgId = certmapMgId;
	}
	public String getPrfResume() {
		return prfResume;
	}
	public void setPrfResume(String prfResume) {
		this.prfResume = prfResume;
	}
	public String getPrfTotalWorkEx() {
		return prfTotalWorkEx;
	}
	public void setPrfTotalWorkEx(String prfTotalWorkEx) {
		this.prfTotalWorkEx = prfTotalWorkEx;
	}
	public Set<ProfileTbl> getProfileTbls() {
		return profileTbls;
	}
	public void setProfileTbls(Set<ProfileTbl> profileTbls) {
		this.profileTbls = profileTbls;
	}
    
    
}
