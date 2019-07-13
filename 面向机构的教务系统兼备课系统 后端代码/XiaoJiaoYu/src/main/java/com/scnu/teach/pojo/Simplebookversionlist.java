package com.scnu.teach.pojo;

public class Simplebookversionlist {
    private Integer bookVersionId;

    private String bookVersionName;

    public Integer getBookVersionId() {
        return bookVersionId;
    }

    public void setBookVersionId(Integer bookVersionId) {
        this.bookVersionId = bookVersionId;
    }

    public String getBookVersionName() {
        return bookVersionName;
    }

    public void setBookVersionName(String bookVersionName) {
        this.bookVersionName = bookVersionName == null ? null : bookVersionName.trim();
    }
}