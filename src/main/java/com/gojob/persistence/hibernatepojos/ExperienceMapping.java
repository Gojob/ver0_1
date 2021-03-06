package com.gojob.persistence.hibernatepojos;
// Generated 14 Jul, 2013 5:55:47 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.gojob.framework.persistence.AbstractPersistenceBean;

/**
 * ExperienceMapping generated by hbm2java
 */
@Entity
@Table(name="experience_mapping"
    ,catalog="gojob"
)
public class ExperienceMapping extends AbstractPersistenceBean {


     private Integer exmId;
     private RoleTbl roleTbl;
     private CompanyTbl companyTbl;
     private MappingGroup mappingGroup;
     private String exmCompanyName;
     private String exmRoleName;
     private Date exmStartDate;
     private Date exmEndDate;

    public ExperienceMapping() {
    }

	
    public ExperienceMapping(RoleTbl roleTbl, CompanyTbl companyTbl, MappingGroup mappingGroup) {
        this.roleTbl = roleTbl;
        this.companyTbl = companyTbl;
        this.mappingGroup = mappingGroup;
    }
    public ExperienceMapping(RoleTbl roleTbl, CompanyTbl companyTbl, MappingGroup mappingGroup, String exmCompanyName, String exmRoleName, Date exmStartDate, Date exmEndDate) {
       this.roleTbl = roleTbl;
       this.companyTbl = companyTbl;
       this.mappingGroup = mappingGroup;
       this.exmCompanyName = exmCompanyName;
       this.exmRoleName = exmRoleName;
       this.exmStartDate = exmStartDate;
       this.exmEndDate = exmEndDate;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="exm_id", unique=true, nullable=false)
    public Integer getExmId() {
        return this.exmId;
    }
    
    public void setExmId(Integer exmId) {
        this.exmId = exmId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="role_id", nullable=false)
    public RoleTbl getRoleTbl() {
        return this.roleTbl;
    }
    
    public void setRoleTbl(RoleTbl roleTbl) {
        this.roleTbl = roleTbl;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cmp_id", nullable=false)
    public CompanyTbl getCompanyTbl() {
        return this.companyTbl;
    }
    
    public void setCompanyTbl(CompanyTbl companyTbl) {
        this.companyTbl = companyTbl;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="mg_id", nullable=false)
    public MappingGroup getMappingGroup() {
        return this.mappingGroup;
    }
    
    public void setMappingGroup(MappingGroup mappingGroup) {
        this.mappingGroup = mappingGroup;
    }
    
    @Column(name="exm_company_name", length=300)
    public String getExmCompanyName() {
        return this.exmCompanyName;
    }
    
    public void setExmCompanyName(String exmCompanyName) {
        this.exmCompanyName = exmCompanyName;
    }
    
    @Column(name="exm_role_name", length=300)
    public String getExmRoleName() {
        return this.exmRoleName;
    }
    
    public void setExmRoleName(String exmRoleName) {
        this.exmRoleName = exmRoleName;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="exm_start_date", length=10)
    public Date getExmStartDate() {
        return this.exmStartDate;
    }
    
    public void setExmStartDate(Date exmStartDate) {
        this.exmStartDate = exmStartDate;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="exm_end_date", length=10)
    public Date getExmEndDate() {
        return this.exmEndDate;
    }
    
    public void setExmEndDate(Date exmEndDate) {
        this.exmEndDate = exmEndDate;
    }




}


