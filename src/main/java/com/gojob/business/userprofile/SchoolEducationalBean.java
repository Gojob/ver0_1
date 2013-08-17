package com.gojob.business.userprofile;

import java.util.Date;

import com.gojob.framework.business.AbstractBusinessBean;
import com.gojob.persistence.hibernatepojos.InstituteTbl;
import com.gojob.persistence.hibernatepojos.LocationTbl;
import com.gojob.persistence.hibernatepojos.QualificationTbl;

public class SchoolEducationalBean extends AbstractBusinessBean{
	private Integer qmId;
	private QualificationTbl qualificationTbl;
	private LocationTbl locationTbl;
	private InstituteTbl instituteTbl;
	private int qmgId;
	private int qmParentInstId;
	private String qmInstName;
	private Date qmStartDate;

	private Date qmEndDate;
	private Double qmMarksPercentage;
	private Double qmCgpa;
	private String qmParentInstName;

	public Integer getQmId() {
		return qmId;
	}

	public void setQmId(Integer qmId) {
		this.qmId = qmId;
	}

	public QualificationTbl getQualificationTbl() {
		return qualificationTbl;
	}

	public void setQualificationTbl(QualificationTbl qualificationTbl) {
		this.qualificationTbl = qualificationTbl;
	}

	public LocationTbl getLocationTbl() {
		return locationTbl;
	}

	public void setLocationTbl(LocationTbl locationTbl) {
		this.locationTbl = locationTbl;
	}

	public InstituteTbl getInstituteTbl() {
		return instituteTbl;
	}

	public void setInstituteTbl(InstituteTbl instituteTbl) {
		this.instituteTbl = instituteTbl;
	}

	public int getQmgId() {
		return qmgId;
	}

	public void setQmgId(int qmgId) {
		this.qmgId = qmgId;
	}

	public int getQmParentInstId() {
		return qmParentInstId;
	}

	public void setQmParentInstId(int qmParentInstId) {
		this.qmParentInstId = qmParentInstId;
	}

	public String getQmInstName() {
		return qmInstName;
	}

	public void setQmInstName(String qmInstName) {
		this.qmInstName = qmInstName;
	}

	public Date getQmStartDate() {
		return qmStartDate;
	}

	public void setQmStartDate(Date qmStartDate) {
		this.qmStartDate = qmStartDate;
	}

	public Date getQmEndDate() {
		return qmEndDate;
	}

	public void setQmEndDate(Date qmEndDate) {
		this.qmEndDate = qmEndDate;
	}

	public Double getQmMarksPercentage() {
		return qmMarksPercentage;
	}

	public void setQmMarksPercentage(Double qmMarksPercentage) {
		this.qmMarksPercentage = qmMarksPercentage;
	}

	public Double getQmCgpa() {
		return qmCgpa;
	}

	public void setQmCgpa(Double qmCgpa) {
		this.qmCgpa = qmCgpa;
	}

	public String getQmParentInstName() {
		return qmParentInstName;
	}

	public void setQmParentInstName(String qmParentInstName) {
		this.qmParentInstName = qmParentInstName;
	}
}
