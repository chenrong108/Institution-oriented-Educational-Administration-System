package com.scnu.teach.pojo;

public class Gradeinfo {
    private Integer gradeId;

    private String gradeName;

    private Integer type;

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gardeId) {
        this.gradeId = gardeId;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName == null ? null : gradeName.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}