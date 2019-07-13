package com.scnu.teach.pojo;

public class Seasoninfo {
    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer seasonId) {
        this.id = seasonId;
    }

    public String getName() {
        return name;
    }

    public void setName(String seasonName) {
        this.name = seasonName == null ? null : seasonName.trim();
    }
}