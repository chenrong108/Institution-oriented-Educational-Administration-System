package com.scnu.question.pojo;

public class QuestionTypeInfo {
    private Integer questionTypeId;

    private String questionTypeName;

    public Integer getQuestionTypeId() {
        return questionTypeId;
    }

    public void setQuestionTypeId(Integer questionTypeId) {
        this.questionTypeId = questionTypeId;
    }

    public String getQuestionTypeName() {
        return questionTypeName;
    }

    public void setQuestionTypeName(String questionTypeName) {
        this.questionTypeName = questionTypeName == null ? null : questionTypeName.trim();
    }

}