package com.scnu.teach.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProductlineinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductlineinfoExample() {
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

        public Criteria andProductLineIdIsNull() {
            addCriterion("product_Line_Id is null");
            return (Criteria) this;
        }

        public Criteria andProductLineIdIsNotNull() {
            addCriterion("product_Line_Id is not null");
            return (Criteria) this;
        }

        public Criteria andProductLineIdEqualTo(Integer value) {
            addCriterion("product_Line_Id =", value, "productLineId");
            return (Criteria) this;
        }

        public Criteria andProductLineIdNotEqualTo(Integer value) {
            addCriterion("product_Line_Id <>", value, "productLineId");
            return (Criteria) this;
        }

        public Criteria andProductLineIdGreaterThan(Integer value) {
            addCriterion("product_Line_Id >", value, "productLineId");
            return (Criteria) this;
        }

        public Criteria andProductLineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_Line_Id >=", value, "productLineId");
            return (Criteria) this;
        }

        public Criteria andProductLineIdLessThan(Integer value) {
            addCriterion("product_Line_Id <", value, "productLineId");
            return (Criteria) this;
        }

        public Criteria andProductLineIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_Line_Id <=", value, "productLineId");
            return (Criteria) this;
        }

        public Criteria andProductLineIdIn(List<Integer> values) {
            addCriterion("product_Line_Id in", values, "productLineId");
            return (Criteria) this;
        }

        public Criteria andProductLineIdNotIn(List<Integer> values) {
            addCriterion("product_Line_Id not in", values, "productLineId");
            return (Criteria) this;
        }

        public Criteria andProductLineIdBetween(Integer value1, Integer value2) {
            addCriterion("product_Line_Id between", value1, value2, "productLineId");
            return (Criteria) this;
        }

        public Criteria andProductLineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_Line_Id not between", value1, value2, "productLineId");
            return (Criteria) this;
        }

        public Criteria andProductLineNameIsNull() {
            addCriterion("product_Line_Name is null");
            return (Criteria) this;
        }

        public Criteria andProductLineNameIsNotNull() {
            addCriterion("product_Line_Name is not null");
            return (Criteria) this;
        }

        public Criteria andProductLineNameEqualTo(String value) {
            addCriterion("product_Line_Name =", value, "productLineName");
            return (Criteria) this;
        }

        public Criteria andProductLineNameNotEqualTo(String value) {
            addCriterion("product_Line_Name <>", value, "productLineName");
            return (Criteria) this;
        }

        public Criteria andProductLineNameGreaterThan(String value) {
            addCriterion("product_Line_Name >", value, "productLineName");
            return (Criteria) this;
        }

        public Criteria andProductLineNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_Line_Name >=", value, "productLineName");
            return (Criteria) this;
        }

        public Criteria andProductLineNameLessThan(String value) {
            addCriterion("product_Line_Name <", value, "productLineName");
            return (Criteria) this;
        }

        public Criteria andProductLineNameLessThanOrEqualTo(String value) {
            addCriterion("product_Line_Name <=", value, "productLineName");
            return (Criteria) this;
        }

        public Criteria andProductLineNameLike(String value) {
            addCriterion("product_Line_Name like", value, "productLineName");
            return (Criteria) this;
        }

        public Criteria andProductLineNameNotLike(String value) {
            addCriterion("product_Line_Name not like", value, "productLineName");
            return (Criteria) this;
        }

        public Criteria andProductLineNameIn(List<String> values) {
            addCriterion("product_Line_Name in", values, "productLineName");
            return (Criteria) this;
        }

        public Criteria andProductLineNameNotIn(List<String> values) {
            addCriterion("product_Line_Name not in", values, "productLineName");
            return (Criteria) this;
        }

        public Criteria andProductLineNameBetween(String value1, String value2) {
            addCriterion("product_Line_Name between", value1, value2, "productLineName");
            return (Criteria) this;
        }

        public Criteria andProductLineNameNotBetween(String value1, String value2) {
            addCriterion("product_Line_Name not between", value1, value2, "productLineName");
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