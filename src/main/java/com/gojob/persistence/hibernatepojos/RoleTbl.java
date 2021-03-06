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
 * RoleTbl generated by hbm2java
 */
@Entity
@Table(name="role_tbl"
    ,catalog="gojob"
)
public class RoleTbl  extends AbstractPersistenceBean {


     private Integer roleId;
     private String roleName;
     private Set<ExperienceMapping> experienceMappings = new HashSet<ExperienceMapping>(0);

    public RoleTbl() {
    }

    public RoleTbl(String roleName, Set<ExperienceMapping> experienceMappings) {
       this.roleName = roleName;
       this.experienceMappings = experienceMappings;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="role_id", unique=true, nullable=false)
    public Integer getRoleId() {
        return this.roleId;
    }
    
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
    
    @Column(name="role_name", length=500)
    public String getRoleName() {
        return this.roleName;
    }
    
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="roleTbl")
    public Set<ExperienceMapping> getExperienceMappings() {
        return this.experienceMappings;
    }
    
    public void setExperienceMappings(Set<ExperienceMapping> experienceMappings) {
        this.experienceMappings = experienceMappings;
    }




}


