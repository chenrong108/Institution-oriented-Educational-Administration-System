package com.scnu.teach.pojo;

import java.util.ArrayList;
import java.util.List;

public class SimpleAssembleInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SimpleAssembleInfoExample() {
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

        public Criteria andAssembleIdIsNull() {
            addCriterion("assemble_Id is null");
            return (Criteria) this;
        }

        public Criteria andAssembleIdIsNotNull() {
            addCriterion("assemble_Id is not null");
            return (Criteria) this;
        }

        public Criteria andAssembleIdEqualTo(Integer value) {
            addCriterion("assemble_Id =", value, "assembleId");
            return (Criteria) this;
        }

        public Criteria andAssembleIdNotEqualTo(Integer value) {
            addCriterion("assemble_Id <>", value, "assembleId");
            return (Criteria) this;
        }

        public Criteria andAssembleIdGreaterThan(Integer value) {
            addCriterion("assemble_Id >", value, "assembleId");
            return (Criteria) this;
        }

        public Criteria andAssembleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("assemble_Id >=", value, "assembleId");
            return (Criteria) this;
        }

        public Criteria andAssembleIdLessThan(Integer value) {
            addCriterion("assemble_Id <", value, "assembleId");
            return (Criteria) this;
        }

        public Criteria andAssembleIdLessThanOrEqualTo(Integer value) {
            addCriterion("assemble_Id <=", value, "assembleId");
            return (Criteria) this;
        }

        public Criteria andAssembleIdIn(List<Integer> values) {
            addCriterion("assemble_Id in", values, "assembleId");
            return (Criteria) this;
        }

        public Criteria andAssembleIdNotIn(List<Integer> values) {
            addCriterion("assemble_Id not in", values, "assembleId");
            return (Criteria) this;
        }

        public Criteria andAssembleIdBetween(Integer value1, Integer value2) {
            addCriterion("assemble_Id between", value1, value2, "assembleId");
            return (Criteria) this;
        }

        public Criteria andAssembleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("assemble_Id not between", value1, value2, "assembleId");
            return (Criteria) this;
        }

        public Criteria andSectionIdIsNull() {
            addCriterion("section_Id is null");
            return (Criteria) this;
        }

        public Criteria andSectionIdIsNotNull() {
            addCriterion("section_Id is not null");
            return (Criteria) this;
        }

        public Criteria andSectionIdEqualTo(Integer value) {
            addCriterion("section_Id =", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdNotEqualTo(Integer value) {
            addCriterion("section_Id <>", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdGreaterThan(Integer value) {
            addCriterion("section_Id >", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("section_Id >=", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdLessThan(Integer value) {
            addCriterion("section_Id <", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdLessThanOrEqualTo(Integer value) {
            addCriterion("section_Id <=", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdIn(List<Integer> values) {
            addCriterion("section_Id in", values, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdNotIn(List<Integer> values) {
            addCriterion("section_Id not in", values, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdBetween(Integer value1, Integer value2) {
            addCriterion("section_Id between", value1, value2, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("section_Id not between", value1, value2, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNull() {
            addCriterion("subject_Id is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNotNull() {
            addCriterion("subject_Id is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdEqualTo(Integer value) {
            addCriterion("subject_Id =", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotEqualTo(Integer value) {
            addCriterion("subject_Id <>", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThan(Integer value) {
            addCriterion("subject_Id >", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("subject_Id >=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThan(Integer value) {
            addCriterion("subject_Id <", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("subject_Id <=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIn(List<Integer> values) {
            addCriterion("subject_Id in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotIn(List<Integer> values) {
            addCriterion("subject_Id not in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdBetween(Integer value1, Integer value2) {
            addCriterion("subject_Id between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("subject_Id not between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andPublishVersionIdIsNull() {
            addCriterion("publish_Version_Id is null");
            return (Criteria) this;
        }

        public Criteria andPublishVersionIdIsNotNull() {
            addCriterion("publish_Version_Id is not null");
            return (Criteria) this;
        }

        public Criteria andPublishVersionIdEqualTo(Integer value) {
            addCriterion("publish_Version_Id =", value, "publishVersionId");
            return (Criteria) this;
        }

        public Criteria andPublishVersionIdNotEqualTo(Integer value) {
            addCriterion("publish_Version_Id <>", value, "publishVersionId");
            return (Criteria) this;
        }

        public Criteria andPublishVersionIdGreaterThan(Integer value) {
            addCriterion("publish_Version_Id >", value, "publishVersionId");
            return (Criteria) this;
        }

        public Criteria andPublishVersionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("publish_Version_Id >=", value, "publishVersionId");
            return (Criteria) this;
        }

        public Criteria andPublishVersionIdLessThan(Integer value) {
            addCriterion("publish_Version_Id <", value, "publishVersionId");
            return (Criteria) this;
        }

        public Criteria andPublishVersionIdLessThanOrEqualTo(Integer value) {
            addCriterion("publish_Version_Id <=", value, "publishVersionId");
            return (Criteria) this;
        }

        public Criteria andPublishVersionIdIn(List<Integer> values) {
            addCriterion("publish_Version_Id in", values, "publishVersionId");
            return (Criteria) this;
        }

        public Criteria andPublishVersionIdNotIn(List<Integer> values) {
            addCriterion("publish_Version_Id not in", values, "publishVersionId");
            return (Criteria) this;
        }

        public Criteria andPublishVersionIdBetween(Integer value1, Integer value2) {
            addCriterion("publish_Version_Id between", value1, value2, "publishVersionId");
            return (Criteria) this;
        }

        public Criteria andPublishVersionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("publish_Version_Id not between", value1, value2, "publishVersionId");
            return (Criteria) this;
        }

        public Criteria andBookVersionIdIsNull() {
            addCriterion("book_Version_Id is null");
            return (Criteria) this;
        }

        public Criteria andBookVersionIdIsNotNull() {
            addCriterion("book_Version_Id is not null");
            return (Criteria) this;
        }

        public Criteria andBookVersionIdEqualTo(Integer value) {
            addCriterion("book_Version_Id =", value, "bookVersionId");
            return (Criteria) this;
        }

        public Criteria andBookVersionIdNotEqualTo(Integer value) {
            addCriterion("book_Version_Id <>", value, "bookVersionId");
            return (Criteria) this;
        }

        public Criteria andBookVersionIdGreaterThan(Integer value) {
            addCriterion("book_Version_Id >", value, "bookVersionId");
            return (Criteria) this;
        }

        public Criteria andBookVersionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_Version_Id >=", value, "bookVersionId");
            return (Criteria) this;
        }

        public Criteria andBookVersionIdLessThan(Integer value) {
            addCriterion("book_Version_Id <", value, "bookVersionId");
            return (Criteria) this;
        }

        public Criteria andBookVersionIdLessThanOrEqualTo(Integer value) {
            addCriterion("book_Version_Id <=", value, "bookVersionId");
            return (Criteria) this;
        }

        public Criteria andBookVersionIdIn(List<Integer> values) {
            addCriterion("book_Version_Id in", values, "bookVersionId");
            return (Criteria) this;
        }

        public Criteria andBookVersionIdNotIn(List<Integer> values) {
            addCriterion("book_Version_Id not in", values, "bookVersionId");
            return (Criteria) this;
        }

        public Criteria andBookVersionIdBetween(Integer value1, Integer value2) {
            addCriterion("book_Version_Id between", value1, value2, "bookVersionId");
            return (Criteria) this;
        }

        public Criteria andBookVersionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("book_Version_Id not between", value1, value2, "bookVersionId");
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