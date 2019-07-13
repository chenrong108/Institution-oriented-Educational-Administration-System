package com.scnu.teach.pojo;

import java.util.ArrayList;
import java.util.List;

public class SimplebookversionlistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SimplebookversionlistExample() {
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

        public Criteria andBookVersionNameIsNull() {
            addCriterion("book_Version_Name is null");
            return (Criteria) this;
        }

        public Criteria andBookVersionNameIsNotNull() {
            addCriterion("book_Version_Name is not null");
            return (Criteria) this;
        }

        public Criteria andBookVersionNameEqualTo(String value) {
            addCriterion("book_Version_Name =", value, "bookVersionName");
            return (Criteria) this;
        }

        public Criteria andBookVersionNameNotEqualTo(String value) {
            addCriterion("book_Version_Name <>", value, "bookVersionName");
            return (Criteria) this;
        }

        public Criteria andBookVersionNameGreaterThan(String value) {
            addCriterion("book_Version_Name >", value, "bookVersionName");
            return (Criteria) this;
        }

        public Criteria andBookVersionNameGreaterThanOrEqualTo(String value) {
            addCriterion("book_Version_Name >=", value, "bookVersionName");
            return (Criteria) this;
        }

        public Criteria andBookVersionNameLessThan(String value) {
            addCriterion("book_Version_Name <", value, "bookVersionName");
            return (Criteria) this;
        }

        public Criteria andBookVersionNameLessThanOrEqualTo(String value) {
            addCriterion("book_Version_Name <=", value, "bookVersionName");
            return (Criteria) this;
        }

        public Criteria andBookVersionNameLike(String value) {
            addCriterion("book_Version_Name like", value, "bookVersionName");
            return (Criteria) this;
        }

        public Criteria andBookVersionNameNotLike(String value) {
            addCriterion("book_Version_Name not like", value, "bookVersionName");
            return (Criteria) this;
        }

        public Criteria andBookVersionNameIn(List<String> values) {
            addCriterion("book_Version_Name in", values, "bookVersionName");
            return (Criteria) this;
        }

        public Criteria andBookVersionNameNotIn(List<String> values) {
            addCriterion("book_Version_Name not in", values, "bookVersionName");
            return (Criteria) this;
        }

        public Criteria andBookVersionNameBetween(String value1, String value2) {
            addCriterion("book_Version_Name between", value1, value2, "bookVersionName");
            return (Criteria) this;
        }

        public Criteria andBookVersionNameNotBetween(String value1, String value2) {
            addCriterion("book_Version_Name not between", value1, value2, "bookVersionName");
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