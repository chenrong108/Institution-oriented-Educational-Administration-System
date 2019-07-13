package com.scnu.teach.pojo;

public class Adaptiveareainfo {
    private Integer adaptiveAreaId;

    private String adaptiveAreaName;

    public Integer getAdaptiveAreaId() {
        return adaptiveAreaId;
    }

    public void setAdaptiveAreaId(Integer adaptiveAreaId) {
        this.adaptiveAreaId = adaptiveAreaId;
    }

    public String getAdaptiveAreaName() {
        return adaptiveAreaName;
    }

    public void setAdaptiveAreaName(String adaptiveAreaName) {
        this.adaptiveAreaName = adaptiveAreaName == null ? null : adaptiveAreaName.trim();
    }
}