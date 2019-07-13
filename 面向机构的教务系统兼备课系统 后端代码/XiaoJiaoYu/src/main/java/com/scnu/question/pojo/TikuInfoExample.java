package com.scnu.question.pojo;

import java.util.ArrayList;
import java.util.List;

public class TikuInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TikuInfoExample() {
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

        public Criteria andTikuIdIsNull() {
            addCriterion("tiku_Id is null");
            return (Criteria) this;
        }

        public Criteria andTikuIdIsNotNull() {
            addCriterion("tiku_Id is not null");
            return (Criteria) this;
        }

        public Criteria andTikuIdEqualTo(Integer value) {
            addCriterion("tiku_Id =", value, "tikuId");
            return (Criteria) this;
        }

        public Criteria andTikuIdNotEqualTo(Integer value) {
            addCriterion("tiku_Id <>", value, "tikuId");
            return (Criteria) this;
        }

        public Criteria andTikuIdGreaterThan(Integer value) {
            addCriterion("tiku_Id >", value, "tikuId");
            return (Criteria) this;
        }

        public Criteria andTikuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tiku_Id >=", value, "tikuId");
            return (Criteria) this;
        }

        public Criteria andTikuIdLessThan(Integer value) {
            addCriterion("tiku_Id <", value, "tikuId");
            return (Criteria) this;
        }

        public Criteria andTikuIdLessThanOrEqualTo(Integer value) {
            addCriterion("tiku_Id <=", value, "tikuId");
            return (Criteria) this;
        }

        public Criteria andTikuIdIn(List<Integer> values) {
            addCriterion("tiku_Id in", values, "tikuId");
            return (Criteria) this;
        }

        public Criteria andTikuIdNotIn(List<Integer> values) {
            addCriterion("tiku_Id not in", values, "tikuId");
            return (Criteria) this;
        }

        public Criteria andTikuIdBetween(Integer value1, Integer value2) {
            addCriterion("tiku_Id between", value1, value2, "tikuId");
            return (Criteria) this;
        }

        public Criteria andTikuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tiku_Id not between", value1, value2, "tikuId");
            return (Criteria) this;
        }

        public Criteria andTikuNameIsNull() {
            addCriterion("tiku_Name is null");
            return (Criteria) this;
        }

        public Criteria andTikuNameIsNotNull() {
            addCriterion("tiku_Name is not null");
            return (Criteria) this;
        }

        public Criteria andTikuNameEqualTo(String value) {
            addCriterion("tiku_Name =", value, "tikuName");
            return (Criteria) this;
        }

        public Criteria andTikuNameNotEqualTo(String value) {
            addCriterion("tiku_Name <>", value, "tikuName");
            return (Criteria) this;
        }

        public Criteria andTikuNameGreaterThan(String value) {
            addCriterion("tiku_Name >", value, "tikuName");
            return (Criteria) this;
        }

        public Criteria andTikuNameGreaterThanOrEqualTo(String value) {
            addCriterion("tiku_Name >=", value, "tikuName");
            return (Criteria) this;
        }

        public Criteria andTikuNameLessThan(String value) {
            addCriterion("tiku_Name <", value, "tikuName");
            return (Criteria) this;
        }

        public Criteria andTikuNameLessThanOrEqualTo(String value) {
            addCriterion("tiku_Name <=", value, "tikuName");
            return (Criteria) this;
        }

        public Criteria andTikuNameLike(String value) {
            addCriterion("tiku_Name like", value, "tikuName");
            return (Criteria) this;
        }

        public Criteria andTikuNameNotLike(String value) {
            addCriterion("tiku_Name not like", value, "tikuName");
            return (Criteria) this;
        }

        public Criteria andTikuNameIn(List<String> values) {
            addCriterion("tiku_Name in", values, "tikuName");
            return (Criteria) this;
        }

        public Criteria andTikuNameNotIn(List<String> values) {
            addCriterion("tiku_Name not in", values, "tikuName");
            return (Criteria) this;
        }

        public Criteria andTikuNameBetween(String value1, String value2) {
            addCriterion("tiku_Name between", value1, value2, "tikuName");
            return (Criteria) this;
        }

        public Criteria andTikuNameNotBetween(String value1, String value2) {
            addCriterion("tiku_Name not between", value1, value2, "tikuName");
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