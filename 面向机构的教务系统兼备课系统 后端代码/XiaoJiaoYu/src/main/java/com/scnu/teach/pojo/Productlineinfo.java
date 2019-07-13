package com.scnu.teach.pojo;

public class Productlineinfo {
    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer productLineId) {
        this.id = productLineId;
    }

    public String getName() {
        return name;
    }

    public void setName(String productLineName) {
        this.name = productLineName == null ? null : productLineName.trim();
    }
}