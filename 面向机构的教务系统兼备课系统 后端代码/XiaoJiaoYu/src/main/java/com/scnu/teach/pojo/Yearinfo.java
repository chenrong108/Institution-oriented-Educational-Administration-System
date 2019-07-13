package com.scnu.teach.pojo;

public class Yearinfo {
    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer yearId) {
        this.id = yearId;
    }

    public String getName() {
        return name;
    }

    public void setName(String yearName) {
        this.name = yearName == null ? null : yearName.trim();
    }
}