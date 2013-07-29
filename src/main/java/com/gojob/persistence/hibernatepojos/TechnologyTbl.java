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
 * TechnologyTbl generated by hbm2java
 */
@Entity
@Table(name="technology_tbl"
    ,catalog="gojob"
)
public class TechnologyTbl  extends AbstractPersistenceBean {


     private Integer techId;
     private QualificationTbl qualificationTbl;
     private String techName;
     private Set<ProfessionalTbl> professionalTbls = new HashSet<ProfessionalTbl>(0);

    public TechnologyTbl() {
    }

    public TechnologyTbl(QualificationTbl qualificationTbl, String techName, Set<ProfessionalTbl> professionalTbls) {
       this.qualificationTbl = qualificationTbl;
       this.techName = techName;
       this.professionalTbls = professionalTbls;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="tech_id", unique=true, nullable=false)
    public Integer getTechId() {
        return this.techId;
    }
    
    public void setTechId(Integer techId) {
        this.techId = techId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="qual_id")
    public QualificationTbl getQualificationTbl() {
        return this.qualificationTbl;
    }
    
    public void setQualificationTbl(QualificationTbl qualificationTbl) {
        this.qualificationTbl = qualificationTbl;
    }
    
    @Column(name="tech_name", length=1000)
    public String getTechName() {
        return this.techName;
    }
    
    public void setTechName(String techName) {
        this.techName = techName;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="technologyTbl")
    public Set<ProfessionalTbl> getProfessionalTbls() {
        return this.professionalTbls;
    }
    
    public void setProfessionalTbls(Set<ProfessionalTbl> professionalTbls) {
        this.professionalTbls = professionalTbls;
    }




}

