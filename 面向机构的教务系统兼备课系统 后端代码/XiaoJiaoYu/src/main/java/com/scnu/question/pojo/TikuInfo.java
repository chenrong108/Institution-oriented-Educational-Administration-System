package com.scnu.question.pojo;

public class TikuInfo {
    private Integer tikuId;

    private String tikuName;

    public Integer getTikuId() {
        return tikuId;
    }

    public void setTikuId(Integer tikuId) {
        this.tikuId = tikuId;
    }

    public String getTikuName() {
        return tikuName;
    }

    public void setTikuName(String tikuName) {
        this.tikuName = tikuName == null ? null : tikuName.trim();
    }
}