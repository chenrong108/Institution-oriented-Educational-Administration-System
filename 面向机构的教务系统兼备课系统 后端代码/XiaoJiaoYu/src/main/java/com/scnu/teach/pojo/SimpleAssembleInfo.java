package com.scnu.teach.pojo;

public class SimpleAssembleInfo {
    private Integer assembleId;

    private Integer sectionId;

    private Integer subjectId;

    private Integer publishVersionId;

    private Integer bookVersionId;

    private String info;

    public Integer getAssembleId() {
        return assembleId;
    }

    public void setAssembleId(Integer assembleId) {
        this.assembleId = assembleId;
    }

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

    public Integer getPublishVersionId() {
        return publishVersionId;
    }

    public void setPublishVersionId(Integer publishVersionId) {
        this.publishVersionId = publishVersionId;
    }

    public Integer getBookVersionId() {
        return bookVersionId;
    }

    public void setBookVersionId(Integer bookVersionId) {
        this.bookVersionId = bookVersionId;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }
}