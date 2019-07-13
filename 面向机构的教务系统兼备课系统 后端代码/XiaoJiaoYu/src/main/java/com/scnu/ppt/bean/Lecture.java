package com.scnu.ppt.bean;

import java.util.Date;

public class Lecture extends LectureKey {
	
    private Integer sectionId;

    private Integer subjectId;

    private Integer businessId;

    private Integer publishVersionId;

    private Integer gradeId;

    private Integer yearId;

    private Integer coporationId;

    private Integer productLineId;

    private Integer seasonId;

    private Integer bookVersionId;

    private Integer textBookId;

    private Integer materialTypeId;

    private Integer classTypeId;

    private Integer adaptiveAreaId;

    private Integer reviewProgressId;

    private Date createTime;

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

    public Integer getCoporationId() {
        return coporationId;
    }

    public void setCoporationId(Integer coporationId) {
        this.coporationId = coporationId;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

	@Override
	public String toString() {
		return "Lecture [sectionId=" + sectionId + ", subjectId=" + subjectId + ", businessId=" + businessId
				+ ", publishVersionId=" + publishVersionId + ", gradeId=" + gradeId + ", yearId=" + yearId
				+ ", coporationId=" + coporationId + ", productLineId=" + productLineId + ", seasonId=" + seasonId
				+ ", bookVersionId=" + bookVersionId + ", textBookId=" + textBookId + ", materialTypeId="
				+ materialTypeId + ", classTypeId=" + classTypeId + ", adaptiveAreaId=" + adaptiveAreaId
				+ ", reviewProgressId=" + reviewProgressId + ", createTime=" + createTime + "]";
	}
    
}