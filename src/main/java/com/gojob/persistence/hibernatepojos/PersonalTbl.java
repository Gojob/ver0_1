package com.gojob.persistence.hibernatepojos;
// Generated 14 Jul, 2013 5:55:47 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.gojob.framework.persistence.AbstractPersistenceBean;

/**
 * PersonalTbl generated by hbm2java
 */
@Entity
@Table(name="personal_tbl"
    ,catalog="gojob"
)
public class PersonalTbl extends AbstractPersistenceBean {


     private Integer perId;
     private GenderTbl genderTbl;
     private ContactTbl contactTbl;
     private String perFirstName;
     private String perLastName;
     private Date perDob;
     private String perImage;
     private Byte perDisability;
     private Set<ProfileTbl> profileTbls = new HashSet<ProfileTbl>(0);

    public PersonalTbl() {
    }

	
    public PersonalTbl(GenderTbl genderTbl, String perFirstName) {
        this.genderTbl = genderTbl;
        this.perFirstName = perFirstName;
    }
    public PersonalTbl(GenderTbl genderTbl, ContactTbl contactTbl, String perFirstName, String perLastName, Date perDob, String perImage, Byte perDisability, Set<ProfileTbl> profileTbls) {
       this.genderTbl = genderTbl;
       this.contactTbl = contactTbl;
       this.perFirstName = perFirstName;
       this.perLastName = perLastName;
       this.perDob = perDob;
       this.perImage = perImage;
       this.perDisability = perDisability;
       this.profileTbls = profileTbls;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="per_id", unique=true, nullable=false)
    public Integer getPerId() {
        return this.perId;
    }
    
    public void setPerId(Integer perId) {
        this.perId = perId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="per_gender_id", nullable=false)
    public GenderTbl getGenderTbl() {
        return this.genderTbl;
    }
    
    public void setGenderTbl(GenderTbl genderTbl) {
        this.genderTbl = genderTbl;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="contact_id")
    public ContactTbl getContactTbl() {
        return this.contactTbl;
    }
    
    public void setContactTbl(ContactTbl contactTbl) {
        this.contactTbl = contactTbl;
    }
    
    @Column(name="per_first_name", nullable=false, length=30)
    public String getPerFirstName() {
        return this.perFirstName;
    }
    
    public void setPerFirstName(String perFirstName) {
        this.perFirstName = perFirstName;
    }
    
    @Column(name="per_last_name", length=30)
    public String getPerLastName() {
        return this.perLastName;
    }
    
    public void setPerLastName(String perLastName) {
        this.perLastName = perLastName;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="per_dob", length=10)
    public Date getPerDob() {
        return this.perDob;
    }
    
    public void setPerDob(Date perDob) {
        this.perDob = perDob;
    }
    
    @Column(name="per_image", length=500)
    public String getPerImage() {
        return this.perImage;
    }
    
    public void setPerImage(String perImage) {
        this.perImage = perImage;
    }
    
    @Column(name="per_disability")
    public Byte getPerDisability() {
        return this.perDisability;
    }
    
    public void setPerDisability(Byte perDisability) {
        this.perDisability = perDisability;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="personalTbl")
    public Set<ProfileTbl> getProfileTbls() {
        return this.profileTbls;
    }
    
    public void setProfileTbls(Set<ProfileTbl> profileTbls) {
        this.profileTbls = profileTbls;
    }




}


