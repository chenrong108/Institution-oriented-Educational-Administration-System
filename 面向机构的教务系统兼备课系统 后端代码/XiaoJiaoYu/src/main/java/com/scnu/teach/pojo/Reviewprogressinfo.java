package com.scnu.teach.pojo;

public class Reviewprogressinfo {
    private Integer reviewProgressId;

    private String reviewProgressName;

    public Integer getReviewProgressId() {
        return reviewProgressId;
    }

    public void setReviewProgressId(Integer reviewProgressId) {
        this.reviewProgressId = reviewProgressId;
    }

    public String getReviewProgressName() {
        return reviewProgressName;
    }

    public void setReviewProgressName(String reviewProgressName) {
        this.reviewProgressName = reviewProgressName == null ? null : reviewProgressName.trim();
    }
}