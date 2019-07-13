package com.scnu.teach.pojo;

public class Textbooktypeinfo {
    private Integer textBookId;

    private String textBookName;

    public Integer getTextBookId() {
        return textBookId;
    }

    public void setTextBookId(Integer textBookId) {
        this.textBookId = textBookId;
    }

    public String getTextBookName() {
        return textBookName;
    }

    public void setTextBookName(String textBookName) {
        this.textBookName = textBookName == null ? null : textBookName.trim();
    }
}