package com.scnu.teach.pojo;

import java.util.ArrayList;
import java.util.List;

public class ReviewprogressinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReviewprogressinfoExample() {
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

        public Criteria andReviewProgressIdIsNull() {
            addCriterion("review_Progress_Id is null");
            return (Criteria) this;
        }

        public Criteria andReviewProgressIdIsNotNull() {
            addCriterion("review_Progress_Id is not null");
            return (Criteria) this;
        }

        public Criteria andReviewProgressIdEqualTo(Integer value) {
            addCriterion("review_Progress_Id =", value, "reviewProgressId");
            return (Criteria) this;
        }

        public Criteria andReviewProgressIdNotEqualTo(Integer value) {
            addCriterion("review_Progress_Id <>", value, "reviewProgressId");
            return (Criteria) this;
        }

        public Criteria andReviewProgressIdGreaterThan(Integer value) {
            addCriterion("review_Progress_Id >", value, "reviewProgressId");
            return (Criteria) this;
        }

        public Criteria andReviewProgressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("review_Progress_Id >=", value, "reviewProgressId");
            return (Criteria) this;
        }

        public Criteria andReviewProgressIdLessThan(Integer value) {
            addCriterion("review_Progress_Id <", value, "reviewProgressId");
            return (Criteria) this;
        }

        public Criteria andReviewProgressIdLessThanOrEqualTo(Integer value) {
            addCriterion("review_Progress_Id <=", value, "reviewProgressId");
            return (Criteria) this;
        }

        public Criteria andReviewProgressIdIn(List<Integer> values) {
            addCriterion("review_Progress_Id in", values, "reviewProgressId");
            return (Criteria) this;
        }

        public Criteria andReviewProgressIdNotIn(List<Integer> values) {
            addCriterion("review_Progress_Id not in", values, "reviewProgressId");
            return (Criteria) this;
        }

        public Criteria andReviewProgressIdBetween(Integer value1, Integer value2) {
            addCriterion("review_Progress_Id between", value1, value2, "reviewProgressId");
            return (Criteria) this;
        }

        public Criteria andReviewProgressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("review_Progress_Id not between", value1, value2, "reviewProgressId");
            return (Criteria) this;
        }

        public Criteria andReviewProgressNameIsNull() {
            addCriterion("review_Progress_Name is null");
            return (Criteria) this;
        }

        public Criteria andReviewProgressNameIsNotNull() {
            addCriterion("review_Progress_Name is not null");
            return (Criteria) this;
        }

        public Criteria andReviewProgressNameEqualTo(String value) {
            addCriterion("review_Progress_Name =", value, "reviewProgressName");
            return (Criteria) this;
        }

        public Criteria andReviewProgressNameNotEqualTo(String value) {
            addCriterion("review_Progress_Name <>", value, "reviewProgressName");
            return (Criteria) this;
        }

        public Criteria andReviewProgressNameGreaterThan(String value) {
            addCriterion("review_Progress_Name >", value, "reviewProgressName");
            return (Criteria) this;
        }

        public Criteria andReviewProgressNameGreaterThanOrEqualTo(String value) {
            addCriterion("review_Progress_Name >=", value, "reviewProgressName");
            return (Criteria) this;
        }

        public Criteria andReviewProgressNameLessThan(String value) {
            addCriterion("review_Progress_Name <", value, "reviewProgressName");
            return (Criteria) this;
        }

        public Criteria andReviewProgressNameLessThanOrEqualTo(String value) {
            addCriterion("review_Progress_Name <=", value, "reviewProgressName");
            return (Criteria) this;
        }

        public Criteria andReviewProgressNameLike(String value) {
            addCriterion("review_Progress_Name like", value, "reviewProgressName");
            return (Criteria) this;
        }

        public Criteria andReviewProgressNameNotLike(String value) {
            addCriterion("review_Progress_Name not like", value, "reviewProgressName");
            return (Criteria) this;
        }

        public Criteria andReviewProgressNameIn(List<String> values) {
            addCriterion("review_Progress_Name in", values, "reviewProgressName");
            return (Criteria) this;
        }

        public Criteria andReviewProgressNameNotIn(List<String> values) {
            addCriterion("review_Progress_Name not in", values, "reviewProgressName");
            return (Criteria) this;
        }

        public Criteria andReviewProgressNameBetween(String value1, String value2) {
            addCriterion("review_Progress_Name between", value1, value2, "reviewProgressName");
            return (Criteria) this;
        }

        public Criteria andReviewProgressNameNotBetween(String value1, String value2) {
            addCriterion("review_Progress_Name not between", value1, value2, "reviewProgressName");
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