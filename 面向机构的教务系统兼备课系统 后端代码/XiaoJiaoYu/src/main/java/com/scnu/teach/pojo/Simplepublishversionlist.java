package com.scnu.teach.pojo;

public class Simplepublishversionlist {
    private Integer publishVersionId;

    private String publishVersionName;

    public Integer getPublishVersionId() {
        return publishVersionId;
    }

    public void setPublishVersionId(Integer publishVersionId) {
        this.publishVersionId = publishVersionId;
    }

    public String getPublishVersionName() {
        return publishVersionName;
    }

    public void setPublishVersionName(String publishVersionName) {
        this.publishVersionName = publishVersionName == null ? null : publishVersionName.trim();
    }
}