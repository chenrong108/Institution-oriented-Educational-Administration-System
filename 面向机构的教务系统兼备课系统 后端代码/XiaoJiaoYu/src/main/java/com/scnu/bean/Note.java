package com.scnu.bean;

public class Note {
	
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

	@Override
	public String toString() {
		return "Note [sectionId=" + sectionId + ", subjectId=" + subjectId + ", businessId=" + businessId
				+ ", publishVersionId=" + publishVersionId + ", gradeId=" + gradeId + ", yearId=" + yearId
				+ ", corporationId=" + corporationId + ", productLineId=" + productLineId + ", seasonId=" + seasonId
				+ ", bookVersionId=" + bookVersionId + ", textBookId=" + textBookId + ", materialTypeId="
				+ materialTypeId + ", classTypeId=" + classTypeId + ", adaptiveAreaId=" + adaptiveAreaId
				+ ", reviewProgressId=" + reviewProgressId + "]";
	}

}
