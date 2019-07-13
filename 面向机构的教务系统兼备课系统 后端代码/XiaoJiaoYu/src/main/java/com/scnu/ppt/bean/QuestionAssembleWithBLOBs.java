package com.scnu.ppt.bean;

public class QuestionAssembleWithBLOBs extends QuestionAssemble {
    private String questionSelect;

    private String questionContain;

    public String getQuestionSelect() {
        return questionSelect;
    }

    public void setQuestionSelect(String questionSelect) {
        this.questionSelect = questionSelect == null ? null : questionSelect.trim();
    }

    public String getQuestionContain() {
        return questionContain;
    }

    public void setQuestionContain(String questionContain) {
        this.questionContain = questionContain == null ? null : questionContain.trim();
    }
}