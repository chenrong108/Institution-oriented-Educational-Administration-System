package com.scnu.question.pojo;

import java.util.ArrayList;
import java.util.List;

public class QuestionTypeInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionTypeInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andQuestionTypeIdIsNull() {
            addCriterion("question_Type_Id is null");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdIsNotNull() {
            addCriterion("question_Type_Id is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdEqualTo(Integer value) {
            addCriterion("question_Type_Id =", value, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdNotEqualTo(Integer value) {
            addCriterion("question_Type_Id <>", value, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdGreaterThan(Integer value) {
            addCriterion("question_Type_Id >", value, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("question_Type_Id >=", value, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdLessThan(Integer value) {
            addCriterion("question_Type_Id <", value, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("question_Type_Id <=", value, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdIn(List<Integer> values) {
            addCriterion("question_Type_Id in", values, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdNotIn(List<Integer> values) {
            addCriterion("question_Type_Id not in", values, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("question_Type_Id between", value1, value2, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("question_Type_Id not between", value1, value2, "questionTypeId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNameIsNull() {
            addCriterion("question_Type_Name is null");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNameIsNotNull() {
            addCriterion("question_Type_Name is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNameEqualTo(String value) {
            addCriterion("question_Type_Name =", value, "questionTypeName");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNameNotEqualTo(String value) {
            addCriterion("question_Type_Name <>", value, "questionTypeName");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNameGreaterThan(String value) {
            addCriterion("question_Type_Name >", value, "questionTypeName");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("question_Type_Name >=", value, "questionTypeName");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNameLessThan(String value) {
            addCriterion("question_Type_Name <", value, "questionTypeName");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNameLessThanOrEqualTo(String value) {
            addCriterion("question_Type_Name <=", value, "questionTypeName");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNameLike(String value) {
            addCriterion("question_Type_Name like", value, "questionTypeName");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNameNotLike(String value) {
            addCriterion("question_Type_Name not like", value, "questionTypeName");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNameIn(List<String> values) {
            addCriterion("question_Type_Name in", values, "questionTypeName");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNameNotIn(List<String> values) {
            addCriterion("question_Type_Name not in", values, "questionTypeName");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNameBetween(String value1, String value2) {
            addCriterion("question_Type_Name between", value1, value2, "questionTypeName");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNameNotBetween(String value1, String value2) {
            addCriterion("question_Type_Name not between", value1, value2, "questionTypeName");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeSubjectidIsNull() {
            addCriterion("question_Type_subjectId is null");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeSubjectidIsNotNull() {
            addCriterion("question_Type_subjectId is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeSubjectidEqualTo(Integer value) {
            addCriterion("question_Type_subjectId =", value, "questionTypeSubjectid");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeSubjectidNotEqualTo(Integer value) {
            addCriterion("question_Type_subjectId <>", value, "questionTypeSubjectid");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeSubjectidGreaterThan(Integer value) {
            addCriterion("question_Type_subjectId >", value, "questionTypeSubjectid");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeSubjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("question_Type_subjectId >=", value, "questionTypeSubjectid");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeSubjectidLessThan(Integer value) {
            addCriterion("question_Type_subjectId <", value, "questionTypeSubjectid");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeSubjectidLessThanOrEqualTo(Integer value) {
            addCriterion("question_Type_subjectId <=", value, "questionTypeSubjectid");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeSubjectidIn(List<Integer> values) {
            addCriterion("question_Type_subjectId in", values, "questionTypeSubjectid");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeSubjectidNotIn(List<Integer> values) {
            addCriterion("question_Type_subjectId not in", values, "questionTypeSubjectid");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeSubjectidBetween(Integer value1, Integer value2) {
            addCriterion("question_Type_subjectId between", value1, value2, "questionTypeSubjectid");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeSubjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("question_Type_subjectId not between", value1, value2, "questionTypeSubjectid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}