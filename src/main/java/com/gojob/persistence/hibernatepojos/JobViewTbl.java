package com.gojob.persistence.hibernatepojos;
// Generated 14 Jul, 2013 5:55:47 PM by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.gojob.framework.persistence.AbstractPersistenceBean;

/**
 * JobViewTbl generated by hbm2java
 */
@Entity
@Table(name="job_view_tbl"
    ,catalog="gojob"
)
public class JobViewTbl  extends AbstractPersistenceBean {


     private Integer jobViewId;
     private UserTbl userTbl;
     private JobTbl jobTbl;
     private Byte favoriteFl;
     private Byte shortlistedFl;

    public JobViewTbl() {
    }

    public JobViewTbl(UserTbl userTbl, JobTbl jobTbl, Byte favoriteFl, Byte shortlistedFl) {
       this.userTbl = userTbl;
       this.jobTbl = jobTbl;
       this.favoriteFl = favoriteFl;
       this.shortlistedFl = shortlistedFl;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="job_view_id", unique=true, nullable=false)
    public Integer getJobViewId() {
        return this.jobViewId;
    }
    
    public void setJobViewId(Integer jobViewId) {
        this.jobViewId = jobViewId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id")
    public UserTbl getUserTbl() {
        return this.userTbl;
    }
    
    public void setUserTbl(UserTbl userTbl) {
        this.userTbl = userTbl;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="job_id")
    public JobTbl getJobTbl() {
        return this.jobTbl;
    }
    
    public void setJobTbl(JobTbl jobTbl) {
        this.jobTbl = jobTbl;
    }
    
    @Column(name="favorite_fl")
    public Byte getFavoriteFl() {
        return this.favoriteFl;
    }
    
    public void setFavoriteFl(Byte favoriteFl) {
        this.favoriteFl = favoriteFl;
    }
    
    @Column(name="shortlisted_fl")
    public Byte getShortlistedFl() {
        return this.shortlistedFl;
    }
    
    public void setShortlistedFl(Byte shortlistedFl) {
        this.shortlistedFl = shortlistedFl;
    }




}


