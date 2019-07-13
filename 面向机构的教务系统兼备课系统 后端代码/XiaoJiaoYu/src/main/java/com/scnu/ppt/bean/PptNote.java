package com.scnu.ppt.bean;

import java.util.Date;

public class PptNote {
	
	private Integer pptId;
	
	private Integer userId;
	
    private Integer sectionId;
	
	private Integer subjectId;
	
	private Integer businessId;
	
	private Integer publishVersionId;
	
	private Integer gradeId;
	
	private Integer yearId;
	
	private Integer corporationId;
	
	private Integer productLineId;
	
	private Integer seasonId;
	
	private Integer bookVersionId;
	
	private Integer textBookId;
	
	private Integer materialTypeId;
	
	private Integer classTypeId;
	
	private Integer adaptiveAreaId;
	
	private Integer reviewProgressId;
	
	private Date createDate;

	public Integer getSectionId() {
		return sectionId;
	}

	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}

	public Integer getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}

	public Integer getBusinessId() {
		return businessId;
	}

	public void setBusinessId(Integer businessId) {
		this.businessId = businessId;
	}

	public Integer getPublishVersionId() {
		return publishVersionId;
	}

	public void setPublishVersionId(Integer publishVersionId) {
		this.publishVersionId = publishVersionId;
	}

	public Integer getGradeId() {
		return gradeId;
	}

	public void setGradeId(Integer gradeId) {
		this.gradeId = gradeId;
	}

	public Integer getYearId() {
		return yearId;
	}

	public void setYearId(Integer yearId) {
		this.yearId = yearId;
	}

	public Integer getCorporationId() {
		return corporationId;
	}

	public void setCorporationId(Integer corporationId) {
		this.corporationId = corporationId;
	}

	public Integer getProductLineId() {
		return productLineId;
	}

	public void setProductLineId(Integer productLineId) {
		this.productLineId = productLineId;
	}

	public Integer getSeasonId() {
		return seasonId;
	}

	public void setSeasonId(Integer seasonId) {
		this.seasonId = seasonId;
	}

	public Integer getBookVersionId() {
		return bookVersionId;
	}

	public void setBookVersionId(Integer bookVersionId) {
		this.bookVersionId = bookVersionId;
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

	public Integer getPptId() {
		return pptId;
	}

	public void setPptId(Integer pptId) {
		this.pptId = pptId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "PptNote [pptId=" + pptId + ", userId=" + userId + ", sectionId=" + sectionId + ", subjectId="
				+ subjectId + ", businessId=" + businessId + ", publishVersionId=" + publishVersionId + ", gradeId="
				+ gradeId + ", yearId=" + yearId + ", corporationId=" + corporationId + ", productLineId="
				+ productLineId + ", seasonId=" + seasonId + ", bookVersionId=" + bookVersionId + ", textBookId="
				+ textBookId + ", materialTypeId=" + materialTypeId + ", classTypeId=" + classTypeId
				+ ", adaptiveAreaId=" + adaptiveAreaId + ", reviewProgressId=" + reviewProgressId + ", createDate="
				+ createDate + "]";
	}

}
