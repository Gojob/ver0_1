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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.gojob.framework.persistence.AbstractPersistenceBean;

/**
 * LocationTbl generated by hbm2java
 */
@Entity
@Table(name="location_tbl"
    ,catalog="gojob"
)
public class LocationTbl extends AbstractPersistenceBean {


     private Integer locId;
     private LocationTypeTbl locationTypeTbl;
     private String locName;
     private Integer locParentId;
     private Set<ContactTbl> contactTbls = new HashSet<ContactTbl>(0);
     private Set<QualificationMapping> qualificationMappings = new HashSet(0);

    public LocationTbl() {
    }

    public LocationTbl(LocationTypeTbl locationTypeTbl, String locName, Integer locParentId, Set<ContactTbl> contactTbls, Set<QualificationMapping> qualificationMappings) {
       this.locationTypeTbl = locationTypeTbl;
       this.locName = locName;
       this.locParentId = locParentId;
       this.contactTbls = contactTbls;
       this.qualificationMappings = qualificationMappings;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="loc_id", unique=true, nullable=false)
    public Integer getLocId() {
        return this.locId;
    }
    
    public void setLocId(Integer locId) {
        this.locId = locId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="loc_type_id")
    public LocationTypeTbl getLocationTypeTbl() {
        return this.locationTypeTbl;
    }
    
    public void setLocationTypeTbl(LocationTypeTbl locationTypeTbl) {
        this.locationTypeTbl = locationTypeTbl;
    }
    
    @Column(name="loc_name", length=1000)
    public String getLocName() {
        return this.locName;
    }
    
    public void setLocName(String locName) {
        this.locName = locName;
    }
    
    @Column(name="loc_parent_id")
    public Integer getLocParentId() {
        return this.locParentId;
    }
    
    public void setLocParentId(Integer locParentId) {
        this.locParentId = locParentId;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="locationTbl")
    public Set<ContactTbl> getContactTbls() {
        return this.contactTbls;
    }
    
    public void setContactTbls(Set<ContactTbl> contactTbls) {
        this.contactTbls = contactTbls;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="locationTbl")
    public Set<QualificationMapping> getQualificationMappings() {
        return this.qualificationMappings;
    }
    
    public void setQualificationMappings(Set<QualificationMapping> qualificationMappings) {
        this.qualificationMappings = qualificationMappings;
    }




}


