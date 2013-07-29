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
import javax.persistence.UniqueConstraint;

import com.gojob.framework.persistence.AbstractPersistenceBean;

/**
 * JobTbl generated by hbm2java
 */
@Entity
@Table(name="job_tbl"
    ,catalog="gojob"
    , uniqueConstraints = {@UniqueConstraint(columnNames="cmp_id"), @UniqueConstraint(columnNames="user_id")} 
)
public class JobTbl  extends AbstractPersistenceBean {


     private Integer jobId;
     private UserTbl userTbl;
     private CompanyTbl companyTbl;
     private String contactEmailId;
     private String jobDescription;
     private Date createDate;
     private String contactName;
     private String contactNumber;
     private String experince;
     private String skills;
     private String qualifications;
     private String locations;
     private String roles;
     private String jobHeading;
     private Byte jobConsultancy;
     private Set<JobViewTbl> jobViewTbls = new HashSet<JobViewTbl>(0);

    public JobTbl() {
    }

	
    public JobTbl(UserTbl userTbl) {
        this.userTbl = userTbl;
    }
    public JobTbl(UserTbl userTbl, CompanyTbl companyTbl, String contactEmailId, String jobDescription, Date createDate, String contactName, String contactNumber, String experince, String skills, String qualifications, String locations, String roles, String jobHeading, Byte jobConsultancy, Set<JobViewTbl> jobViewTbls) {
       this.userTbl = userTbl;
       this.companyTbl = companyTbl;
       this.contactEmailId = contactEmailId;
       this.jobDescription = jobDescription;
       this.createDate = createDate;
       this.contactName = contactName;
       this.contactNumber = contactNumber;
       this.experince = experince;
       this.skills = skills;
       this.qualifications = qualifications;
       this.locations = locations;
       this.roles = roles;
       this.jobHeading = jobHeading;
       this.jobConsultancy = jobConsultancy;
       this.jobViewTbls = jobViewTbls;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="job_id", unique=true, nullable=false)
    public Integer getJobId() {
        return this.jobId;
    }
    
    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id", unique=true, nullable=false)
    public UserTbl getUserTbl() {
        return this.userTbl;
    }
    
    public void setUserTbl(UserTbl userTbl) {
        this.userTbl = userTbl;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cmp_id", unique=true)
    public CompanyTbl getCompanyTbl() {
        return this.companyTbl;
    }
    
    public void setCompanyTbl(CompanyTbl companyTbl) {
        this.companyTbl = companyTbl;
    }
    
    @Column(name="contact_email_id", length=300)
    public String getContactEmailId() {
        return this.contactEmailId;
    }
    
    public void setContactEmailId(String contactEmailId) {
        this.contactEmailId = contactEmailId;
    }
    
    @Column(name="job_description", length=3000)
    public String getJobDescription() {
        return this.jobDescription;
    }
    
    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="create_date", length=10)
    public Date getCreateDate() {
        return this.createDate;
    }
    
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    
    @Column(name="contact_name", length=300)
    public String getContactName() {
        return this.contactName;
    }
    
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }
    
    @Column(name="contact_number", length=20)
    public String getContactNumber() {
        return this.contactNumber;
    }
    
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    
    @Column(name="experince", length=300)
    public String getExperince() {
        return this.experince;
    }
    
    public void setExperince(String experince) {
        this.experince = experince;
    }
    
    @Column(name="skills", length=300)
    public String getSkills() {
        return this.skills;
    }
    
    public void setSkills(String skills) {
        this.skills = skills;
    }
    
    @Column(name="qualifications", length=3000)
    public String getQualifications() {
        return this.qualifications;
    }
    
    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }
    
    @Column(name="locations", length=2000)
    public String getLocations() {
        return this.locations;
    }
    
    public void setLocations(String locations) {
        this.locations = locations;
    }
    
    @Column(name="roles", length=300)
    public String getRoles() {
        return this.roles;
    }
    
    public void setRoles(String roles) {
        this.roles = roles;
    }
    
    @Column(name="job_heading", length=1000)
    public String getJobHeading() {
        return this.jobHeading;
    }
    
    public void setJobHeading(String jobHeading) {
        this.jobHeading = jobHeading;
    }
    
    @Column(name="job_consultancy")
    public Byte getJobConsultancy() {
        return this.jobConsultancy;
    }
    
    public void setJobConsultancy(Byte jobConsultancy) {
        this.jobConsultancy = jobConsultancy;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="jobTbl")
    public Set<JobViewTbl> getJobViewTbls() {
        return this.jobViewTbls;
    }
    
    public void setJobViewTbls(Set<JobViewTbl> jobViewTbls) {
        this.jobViewTbls = jobViewTbls;
    }




}


