package com.scnu.teach.pojo;

import java.util.ArrayList;
import java.util.List;

public class ClasstypeinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClasstypeinfoExample() {
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

        public Criteria andClassTypeIdIsNull() {
            addCriterion("class_Type_Id is null");
            return (Criteria) this;
        }

        public Criteria andClassTypeIdIsNotNull() {
            addCriterion("class_Type_Id is not null");
            return (Criteria) this;
        }

        public Criteria andClassTypeIdEqualTo(Integer value) {
            addCriterion("class_Type_Id =", value, "classTypeId");
            return (Criteria) this;
        }

        public Criteria andClassTypeIdNotEqualTo(Integer value) {
            addCriterion("class_Type_Id <>", value, "classTypeId");
            return (Criteria) this;
        }

        public Criteria andClassTypeIdGreaterThan(Integer value) {
            addCriterion("class_Type_Id >", value, "classTypeId");
            return (Criteria) this;
        }

        public Criteria andClassTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_Type_Id >=", value, "classTypeId");
            return (Criteria) this;
        }

        public Criteria andClassTypeIdLessThan(Integer value) {
            addCriterion("class_Type_Id <", value, "classTypeId");
            return (Criteria) this;
        }

        public Criteria andClassTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("class_Type_Id <=", value, "classTypeId");
            return (Criteria) this;
        }

        public Criteria andClassTypeIdIn(List<Integer> values) {
            addCriterion("class_Type_Id in", values, "classTypeId");
            return (Criteria) this;
        }

        public Criteria andClassTypeIdNotIn(List<Integer> values) {
            addCriterion("class_Type_Id not in", values, "classTypeId");
            return (Criteria) this;
        }

        public Criteria andClassTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("class_Type_Id between", value1, value2, "classTypeId");
            return (Criteria) this;
        }

        public Criteria andClassTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("class_Type_Id not between", value1, value2, "classTypeId");
            return (Criteria) this;
        }

        public Criteria andClassTypeNameIsNull() {
            addCriterion("class_Type_Name is null");
            return (Criteria) this;
        }

        public Criteria andClassTypeNameIsNotNull() {
            addCriterion("class_Type_Name is not null");
            return (Criteria) this;
        }

        public Criteria andClassTypeNameEqualTo(String value) {
            addCriterion("class_Type_Name =", value, "classTypeName");
            return (Criteria) this;
        }

        public Criteria andClassTypeNameNotEqualTo(String value) {
            addCriterion("class_Type_Name <>", value, "classTypeName");
            return (Criteria) this;
        }

        public Criteria andClassTypeNameGreaterThan(String value) {
            addCriterion("class_Type_Name >", value, "classTypeName");
            return (Criteria) this;
        }

        public Criteria andClassTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("class_Type_Name >=", value, "classTypeName");
            return (Criteria) this;
        }

        public Criteria andClassTypeNameLessThan(String value) {
            addCriterion("class_Type_Name <", value, "classTypeName");
            return (Criteria) this;
        }

        public Criteria andClassTypeNameLessThanOrEqualTo(String value) {
            addCriterion("class_Type_Name <=", value, "classTypeName");
            return (Criteria) this;
        }

        public Criteria andClassTypeNameLike(String value) {
            addCriterion("class_Type_Name like", value, "classTypeName");
            return (Criteria) this;
        }

        public Criteria andClassTypeNameNotLike(String value) {
            addCriterion("class_Type_Name not like", value, "classTypeName");
            return (Criteria) this;
        }

        public Criteria andClassTypeNameIn(List<String> values) {
            addCriterion("class_Type_Name in", values, "classTypeName");
            return (Criteria) this;
        }

        public Criteria andClassTypeNameNotIn(List<String> values) {
            addCriterion("class_Type_Name not in", values, "classTypeName");
            return (Criteria) this;
        }

        public Criteria andClassTypeNameBetween(String value1, String value2) {
            addCriterion("class_Type_Name between", value1, value2, "classTypeName");
            return (Criteria) this;
        }

        public Criteria andClassTypeNameNotBetween(String value1, String value2) {
            addCriterion("class_Type_Name not between", value1, value2, "classTypeName");
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