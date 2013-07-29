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
 * MappingGroup generated by hbm2java
 */
@Entity
@Table(name="mapping_group"
    ,catalog="gojob"
)
public class MappingGroup  extends AbstractPersistenceBean{


     private Integer mgId;
     private Set<EducationTbl> educationTbls = new HashSet<EducationTbl>(0);
     private Set<CertificateMappingTbl> certificateMappingTbls = new HashSet<CertificateMappingTbl>(0);
     private Set<ExperienceMapping> experienceMappings = new HashSet<ExperienceMapping>(0);
     private Set<SkillMapping> skillMappings = new HashSet<SkillMapping>(0);
     private Set<LinkTbl> linkTbls = new HashSet<LinkTbl>(0);

    public MappingGroup() {
    }

    public MappingGroup(Set<EducationTbl> educationTbls, Set<CertificateMappingTbl> certificateMappingTbls, Set<ExperienceMapping> experienceMappings, Set<SkillMapping> skillMappings, Set<LinkTbl> linkTbls) {
       this.educationTbls = educationTbls;
       this.certificateMappingTbls = certificateMappingTbls;
       this.experienceMappings = experienceMappings;
       this.skillMappings = skillMappings;
       this.linkTbls = linkTbls;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="mg_id", unique=true, nullable=false)
    public Integer getMgId() {
        return this.mgId;
    }
    
    public void setMgId(Integer mgId) {
        this.mgId = mgId;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="mappingGroup")
    public Set<EducationTbl> getEducationTbls() {
        return this.educationTbls;
    }
    
    public void setEducationTbls(Set<EducationTbl> educationTbls) {
        this.educationTbls = educationTbls;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="mappingGroup")
    public Set<CertificateMappingTbl> getCertificateMappingTbls() {
        return this.certificateMappingTbls;
    }
    
    public void setCertificateMappingTbls(Set<CertificateMappingTbl> certificateMappingTbls) {
        this.certificateMappingTbls = certificateMappingTbls;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="mappingGroup")
    public Set<ExperienceMapping> getExperienceMappings() {
        return this.experienceMappings;
    }
    
    public void setExperienceMappings(Set<ExperienceMapping> experienceMappings) {
        this.experienceMappings = experienceMappings;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="mappingGroup")
    public Set<SkillMapping> getSkillMappings() {
        return this.skillMappings;
    }
    
    public void setSkillMappings(Set<SkillMapping> skillMappings) {
        this.skillMappings = skillMappings;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="mappingGroup")
    public Set<LinkTbl> getLinkTbls() {
        return this.linkTbls;
    }
    
    public void setLinkTbls(Set<LinkTbl> linkTbls) {
        this.linkTbls = linkTbls;
    }




}


