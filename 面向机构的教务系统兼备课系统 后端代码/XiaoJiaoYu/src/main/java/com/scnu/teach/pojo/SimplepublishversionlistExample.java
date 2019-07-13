package com.scnu.teach.pojo;

import java.util.ArrayList;
import java.util.List;

public class SimplepublishversionlistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SimplepublishversionlistExample() {
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

        public Criteria andPublishVersionNameIsNull() {
            addCriterion("publish_Version_Name is null");
            return (Criteria) this;
        }

        public Criteria andPublishVersionNameIsNotNull() {
            addCriterion("publish_Version_Name is not null");
            return (Criteria) this;
        }

        public Criteria andPublishVersionNameEqualTo(String value) {
            addCriterion("publish_Version_Name =", value, "publishVersionName");
            return (Criteria) this;
        }

        public Criteria andPublishVersionNameNotEqualTo(String value) {
            addCriterion("publish_Version_Name <>", value, "publishVersionName");
            return (Criteria) this;
        }

        public Criteria andPublishVersionNameGreaterThan(String value) {
            addCriterion("publish_Version_Name >", value, "publishVersionName");
            return (Criteria) this;
        }

        public Criteria andPublishVersionNameGreaterThanOrEqualTo(String value) {
            addCriterion("publish_Version_Name >=", value, "publishVersionName");
            return (Criteria) this;
        }

        public Criteria andPublishVersionNameLessThan(String value) {
            addCriterion("publish_Version_Name <", value, "publishVersionName");
            return (Criteria) this;
        }

        public Criteria andPublishVersionNameLessThanOrEqualTo(String value) {
            addCriterion("publish_Version_Name <=", value, "publishVersionName");
            return (Criteria) this;
        }

        public Criteria andPublishVersionNameLike(String value) {
            addCriterion("publish_Version_Name like", value, "publishVersionName");
            return (Criteria) this;
        }

        public Criteria andPublishVersionNameNotLike(String value) {
            addCriterion("publish_Version_Name not like", value, "publishVersionName");
            return (Criteria) this;
        }

        public Criteria andPublishVersionNameIn(List<String> values) {
            addCriterion("publish_Version_Name in", values, "publishVersionName");
            return (Criteria) this;
        }

        public Criteria andPublishVersionNameNotIn(List<String> values) {
            addCriterion("publish_Version_Name not in", values, "publishVersionName");
            return (Criteria) this;
        }

        public Criteria andPublishVersionNameBetween(String value1, String value2) {
            addCriterion("publish_Version_Name between", value1, value2, "publishVersionName");
            return (Criteria) this;
        }

        public Criteria andPublishVersionNameNotBetween(String value1, String value2) {
            addCriterion("publish_Version_Name not between", value1, value2, "publishVersionName");
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