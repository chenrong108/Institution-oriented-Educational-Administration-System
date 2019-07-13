package com.scnu.bean;

import com.scnu.teach.pojo.Productlineinfo;
import com.scnu.teach.pojo.Publishversionlist;
import com.scnu.teach.pojo.Seasoninfo;
import com.scnu.teach.pojo.Simplesectionlist;
import com.scnu.teach.pojo.Simplesubjectlist;
import com.scnu.teach.pojo.Yearinfo;

public class Cache {
	
	private Simplesectionlist section;
	
	private Simplesubjectlist subject;
	
	private Business business;
	
	private Corporation corporation;
	
	private Yearinfo year;
	
	private Productlineinfo productLine;
	
	private Publishversionlist publishVersion;
	
	private Seasoninfo season;
	
	private Integer bookVersionId;
	
	private Integer gradeId;
	
    private Integer textBookId;
	
	private Integer materialTypeId;
	
	private Integer classTypeId;
	
	private Integer adaptiveAreaId;
	
	private Integer reviewProgressId;

	public Simplesectionlist getSection() {
		return section;
	}

	public void setSection(Simplesectionlist section) {
		this.section = section;
	}

	public Simplesubjectlist getSubject() {
		return subject;
	}

	public void setSubject(Simplesubjectlist subject) {
		this.subject = subject;
	}
	
	public Business getBusiness() {
		return business;
	}

	public void setBusiness(Business business) {
		this.business = business;
	}

	public Corporation getCorporation() {
		return corporation;
	}

	public void setCorporation(Corporation corporation) {
		this.corporation = corporation;
	}

	public Yearinfo getYear() {
		return year;
	}

	public void setYear(Yearinfo year) {
		this.year = year;
	}

	public Productlineinfo getProductLine() {
		return productLine;
	}

	public void setProductLine(Productlineinfo productLine) {
		this.productLine = productLine;
	}

	public Publishversionlist getPublishVersion() {
		return publishVersion;
	}

	public void setPublishVersion(Publishversionlist publishVersion) {
		this.publishVersion = publishVersion;
	}

	public Integer getBookVersionId() {
		return bookVersionId;
	}

	public void setBookVersionId(Integer bookVersionId) {
		this.bookVersionId = bookVersionId;
	}

	public Seasoninfo getSeason() {
		return season;
	}

	public void setSeason(Seasoninfo season) {
		this.season = season;
	}

	public Integer getGradeId() {
		return gradeId;
	}

	public void setGradeId(Integer gradeId) {
		this.gradeId = gradeId;
	}

	public Integer getTextBookId() {
		return textBookId;
	}

	public void setTextBookId(Integer textBookId) {
		this.textBookId = textBookId;
	}

	public Integer getMaterialTypeId() {
		return materialTypeId;
	}

	public void setMaterialTypeId(Integer materialTypeId) {
		this.materialTypeId = materialTypeId;
	}

	public Integer getClassTypeId() {
		return classTypeId;
	}

	public void setClassTypeId(Integer classTypeId) {
		this.classTypeId = classTypeId;
	}

	public Integer getAdaptiveAreaId() {
		return adaptiveAreaId;
	}

	public void setAdaptiveAreaId(Integer adaptiveAreaId) {
		this.adaptiveAreaId = adaptiveAreaId;
	}

	public Integer getReviewProgressId() {
		return reviewProgressId;
	}

	public void setReviewProgressId(Integer reviewProgressId) {
		this.reviewProgressId = reviewProgressId;
	}

}
