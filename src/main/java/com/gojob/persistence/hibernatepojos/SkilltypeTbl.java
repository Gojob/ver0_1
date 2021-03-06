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
 * SkilltypeTbl generated by hbm2java
 */
@Entity
@Table(name="skilltype_tbl"
    ,catalog="gojob"
)
public class SkilltypeTbl  extends AbstractPersistenceBean {


     private Integer skillTypeId;
     private String skillTypeName;
     private Set<SkillMapping> skillMappings = new HashSet<SkillMapping>(0);

    public SkilltypeTbl() {
    }

    public SkilltypeTbl(String skillTypeName, Set<SkillMapping> skillMappings) {
       this.skillTypeName = skillTypeName;
       this.skillMappings = skillMappings;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="skill_type_id", unique=true, nullable=false)
    public Integer getSkillTypeId() {
        return this.skillTypeId;
    }
    
    public void setSkillTypeId(Integer skillTypeId) {
        this.skillTypeId = skillTypeId;
    }
    
    @Column(name="skill_type_name", length=300)
    public String getSkillTypeName() {
        return this.skillTypeName;
    }
    
    public void setSkillTypeName(String skillTypeName) {
        this.skillTypeName = skillTypeName;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="skilltypeTbl")
    public Set<SkillMapping> getSkillMappings() {
        return this.skillMappings;
    }
    
    public void setSkillMappings(Set<SkillMapping> skillMappings) {
        this.skillMappings = skillMappings;
    }




}


