package com.scnu.teach.pojo;

import java.util.ArrayList;
import java.util.List;

public class AdaptiveareainfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdaptiveareainfoExample() {
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

        public Criteria andAdaptiveAreaIdIsNull() {
            addCriterion("adaptive_Area_Id is null");
            return (Criteria) this;
        }

        public Criteria andAdaptiveAreaIdIsNotNull() {
            addCriterion("adaptive_Area_Id is not null");
            return (Criteria) this;
        }

        public Criteria andAdaptiveAreaIdEqualTo(Integer value) {
            addCriterion("adaptive_Area_Id =", value, "adaptiveAreaId");
            return (Criteria) this;
        }

        public Criteria andAdaptiveAreaIdNotEqualTo(Integer value) {
            addCriterion("adaptive_Area_Id <>", value, "adaptiveAreaId");
            return (Criteria) this;
        }

        public Criteria andAdaptiveAreaIdGreaterThan(Integer value) {
            addCriterion("adaptive_Area_Id >", value, "adaptiveAreaId");
            return (Criteria) this;
        }

        public Criteria andAdaptiveAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("adaptive_Area_Id >=", value, "adaptiveAreaId");
            return (Criteria) this;
        }

        public Criteria andAdaptiveAreaIdLessThan(Integer value) {
            addCriterion("adaptive_Area_Id <", value, "adaptiveAreaId");
            return (Criteria) this;
        }

        public Criteria andAdaptiveAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("adaptive_Area_Id <=", value, "adaptiveAreaId");
            return (Criteria) this;
        }

        public Criteria andAdaptiveAreaIdIn(List<Integer> values) {
            addCriterion("adaptive_Area_Id in", values, "adaptiveAreaId");
            return (Criteria) this;
        }

        public Criteria andAdaptiveAreaIdNotIn(List<Integer> values) {
            addCriterion("adaptive_Area_Id not in", values, "adaptiveAreaId");
            return (Criteria) this;
        }

        public Criteria andAdaptiveAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("adaptive_Area_Id between", value1, value2, "adaptiveAreaId");
            return (Criteria) this;
        }

        public Criteria andAdaptiveAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("adaptive_Area_Id not between", value1, value2, "adaptiveAreaId");
            return (Criteria) this;
        }

        public Criteria andAdaptiveAreaNameIsNull() {
            addCriterion("adaptive_Area_Name is null");
            return (Criteria) this;
        }

        public Criteria andAdaptiveAreaNameIsNotNull() {
            addCriterion("adaptive_Area_Name is not null");
            return (Criteria) this;
        }

        public Criteria andAdaptiveAreaNameEqualTo(String value) {
            addCriterion("adaptive_Area_Name =", value, "adaptiveAreaName");
            return (Criteria) this;
        }

        public Criteria andAdaptiveAreaNameNotEqualTo(String value) {
            addCriterion("adaptive_Area_Name <>", value, "adaptiveAreaName");
            return (Criteria) this;
        }

        public Criteria andAdaptiveAreaNameGreaterThan(String value) {
            addCriterion("adaptive_Area_Name >", value, "adaptiveAreaName");
            return (Criteria) this;
        }

        public Criteria andAdaptiveAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("adaptive_Area_Name >=", value, "adaptiveAreaName");
            return (Criteria) this;
        }

        public Criteria andAdaptiveAreaNameLessThan(String value) {
            addCriterion("adaptive_Area_Name <", value, "adaptiveAreaName");
            return (Criteria) this;
        }

        public Criteria andAdaptiveAreaNameLessThanOrEqualTo(String value) {
            addCriterion("adaptive_Area_Name <=", value, "adaptiveAreaName");
            return (Criteria) this;
        }

        public Criteria andAdaptiveAreaNameLike(String value) {
            addCriterion("adaptive_Area_Name like", value, "adaptiveAreaName");
            return (Criteria) this;
        }

        public Criteria andAdaptiveAreaNameNotLike(String value) {
            addCriterion("adaptive_Area_Name not like", value, "adaptiveAreaName");
            return (Criteria) this;
        }

        public Criteria andAdaptiveAreaNameIn(List<String> values) {
            addCriterion("adaptive_Area_Name in", values, "adaptiveAreaName");
            return (Criteria) this;
        }

        public Criteria andAdaptiveAreaNameNotIn(List<String> values) {
            addCriterion("adaptive_Area_Name not in", values, "adaptiveAreaName");
            return (Criteria) this;
        }

        public Criteria andAdaptiveAreaNameBetween(String value1, String value2) {
            addCriterion("adaptive_Area_Name between", value1, value2, "adaptiveAreaName");
            return (Criteria) this;
        }

        public Criteria andAdaptiveAreaNameNotBetween(String value1, String value2) {
            addCriterion("adaptive_Area_Name not between", value1, value2, "adaptiveAreaName");
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