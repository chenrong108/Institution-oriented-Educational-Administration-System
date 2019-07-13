package com.scnu.teach.pojo;

public class Classtypeinfo {
    private Integer classTypeId;

    private String classTypeName;

    public Integer getClassTypeId() {
        return classTypeId;
    }

    public void setClassTypeId(Integer classTypeId) {
        this.classTypeId = classTypeId;
    }

    public String getClassTypeName() {
        return classTypeName;
    }

    public void setClassTypeName(String classTypeName) {
        this.classTypeName = classTypeName == null ? null : classTypeName.trim();
    }
}