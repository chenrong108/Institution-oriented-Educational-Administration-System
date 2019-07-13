package com.scnu.question.pojo;

public class DifiicultyInfo {
    private Integer difficultyInfo;

    private String difficultyName;

    public Integer getDifficultyInfo() {
        return difficultyInfo;
    }

    public void setDifficultyInfo(Integer difficultyInfo) {
        this.difficultyInfo = difficultyInfo;
    }

    public String getDifficultyName() {
        return difficultyName;
    }

    public void setDifficultyName(String difficultyName) {
        this.difficultyName = difficultyName == null ? null : difficultyName.trim();
    }
}