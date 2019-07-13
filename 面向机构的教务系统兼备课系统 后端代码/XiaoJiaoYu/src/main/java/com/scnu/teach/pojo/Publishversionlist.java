package com.scnu.teach.pojo;

public class Publishversionlist {
    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer publishVersionId) {
        this.id = publishVersionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String publishVersionName) {
        this.name = publishVersionName == null ? null : publishVersionName.trim();
    }
}