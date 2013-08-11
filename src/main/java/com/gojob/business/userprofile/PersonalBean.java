package com.gojob.business.userprofile;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.gojob.framework.business.AbstractBusinessBean;
import com.gojob.persistence.hibernatepojos.ContactTbl;
import com.gojob.persistence.hibernatepojos.GenderTbl;
import com.gojob.persistence.hibernatepojos.ProfileTbl;

public class PersonalBean extends AbstractBusinessBean{
	private GenderTbl genderTbl;
    private ContactTbl contactTbl;
    private String perFirstName;
    private String perLastName;
    private Date perDob;
    private String perImage;
    private Byte perDisability;
    private Set<ProfileTbl> profileTbls = new HashSet<ProfileTbl>(0);

    private Integer perId;
    
    public Integer getPerId() {
		return perId;
	}
	public void setPerId(Integer perId) {
		this.perId = perId;
	}
	public GenderTbl getGenderTbl() {
		return genderTbl;
	}
	public void setGenderTbl(GenderTbl genderTbl) {
		this.genderTbl = genderTbl;
	}
	public ContactTbl getContactTbl() {
		return contactTbl;
	}
	public void setContactTbl(ContactTbl contactTbl) {
		this.contactTbl = contactTbl;
	}
	public String getPerFirstName() {
		return perFirstName;
	}
	public void setPerFirstName(String perFirstName) {
		this.perFirstName = perFirstName;
	}
	public String getPerLastName() {
		return perLastName;
	}
	public void setPerLastName(String perLastName) {
		this.perLastName = perLastName;
	}
	public Date getPerDob() {
		return perDob;
	}
	public void setPerDob(Date perDob) {
		this.perDob = perDob;
	}
	public String getPerImage() {
		return perImage;
	}
	public void setPerImage(String perImage) {
		this.perImage = perImage;
	}
	public Byte getPerDisability() {
		return perDisability;
	}
	public void setPerDisability(Byte perDisability) {
		this.perDisability = perDisability;
	}
	public Set<ProfileTbl> getProfileTbls() {
		return profileTbls;
	}
	public void setProfileTbls(Set<ProfileTbl> profileTbls) {
		this.profileTbls = profileTbls;
	}
	

}
