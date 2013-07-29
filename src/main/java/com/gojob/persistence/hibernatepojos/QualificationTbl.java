package com.gojob.persistence.hibernatepojos;
// Generated 14 Jul, 2013 5:55:47 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.gojob.framework.persistence.AbstractPersistenceBean;

/**
 * QualificationTbl generated by hbm2java
 */
@Entity
@Table(name="qualification_tbl"
    ,catalog="gojob"
)
public class QualificationTbl extends AbstractPersistenceBean {


     private Integer qualId;
     private String qualiName;
     private Set<InstituteTbl> instituteTbls = new HashSet<InstituteTbl>(0);
     private Set<ProfileTbl> profileTbls = new HashSet<ProfileTbl>(0);
     private Set<QualificationMapping> qualificationMappings = new HashSet<QualificationMapping>(0);
     private Set<TechnologyTbl> technologyTbls = new HashSet<TechnologyTbl>(0);

    public QualificationTbl() {
    }

    public QualificationTbl(String qualiName, Set<InstituteTbl> instituteTbls, Set<ProfileTbl> profileTbls, Set<QualificationMapping> qualificationMappings, Set<TechnologyTbl> technologyTbls) {
       this.qualiName = qualiName;
       this.instituteTbls = instituteTbls;
       this.profileTbls = profileTbls;
       this.qualificationMappings = qualificationMappings;
       this.technologyTbls = technologyTbls;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="qual_id", unique=true, nullable=false)
    public Integer getQualId() {
        return this.qualId;
    }
    
    public void setQualId(Integer qualId) {
        this.qualId = qualId;
    }
    
    @Column(name="quali_name", length=1000)
    public String getQualiName() {
        return this.qualiName;
    }
    
    public void setQualiName(String qualiName) {
        this.qualiName = qualiName;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="qualificationTbl")
    public Set<InstituteTbl> getInstituteTbls() {
        return this.instituteTbls;
    }
    
    public void setInstituteTbls(Set<InstituteTbl> instituteTbls) {
        this.instituteTbls = instituteTbls;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="qualificationTbl")
    public Set<ProfileTbl> getProfileTbls() {
        return this.profileTbls;
    }
    
    public void setProfileTbls(Set<ProfileTbl> profileTbls) {
        this.profileTbls = profileTbls;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="qualificationTbl")
    public Set<QualificationMapping> getQualificationMappings() {
        return this.qualificationMappings;
    }
    
    public void setQualificationMappings(Set<QualificationMapping> qualificationMappings) {
        this.qualificationMappings = qualificationMappings;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="qualificationTbl")
    public Set<TechnologyTbl> getTechnologyTbls() {
        return this.technologyTbls;
    }
    
    public void setTechnologyTbls(Set<TechnologyTbl> technologyTbls) {
        this.technologyTbls = technologyTbls;
    }




}

