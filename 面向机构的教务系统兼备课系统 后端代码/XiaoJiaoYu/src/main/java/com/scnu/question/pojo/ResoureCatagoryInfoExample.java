package com.scnu.question.pojo;

import java.util.ArrayList;
import java.util.List;

public class ResoureCatagoryInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResoureCatagoryInfoExample() {
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

        public Criteria andResoureCatagoryIdIsNull() {
            addCriterion("resoure_Catagory_Id is null");
            return (Criteria) this;
        }

        public Criteria andResoureCatagoryIdIsNotNull() {
            addCriterion("resoure_Catagory_Id is not null");
            return (Criteria) this;
        }

        public Criteria andResoureCatagoryIdEqualTo(Integer value) {
            addCriterion("resoure_Catagory_Id =", value, "resoureCatagoryId");
            return (Criteria) this;
        }

        public Criteria andResoureCatagoryIdNotEqualTo(Integer value) {
            addCriterion("resoure_Catagory_Id <>", value, "resoureCatagoryId");
            return (Criteria) this;
        }

        public Criteria andResoureCatagoryIdGreaterThan(Integer value) {
            addCriterion("resoure_Catagory_Id >", value, "resoureCatagoryId");
            return (Criteria) this;
        }

        public Criteria andResoureCatagoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("resoure_Catagory_Id >=", value, "resoureCatagoryId");
            return (Criteria) this;
        }

        public Criteria andResoureCatagoryIdLessThan(Integer value) {
            addCriterion("resoure_Catagory_Id <", value, "resoureCatagoryId");
            return (Criteria) this;
        }

        public Criteria andResoureCatagoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("resoure_Catagory_Id <=", value, "resoureCatagoryId");
            return (Criteria) this;
        }

        public Criteria andResoureCatagoryIdIn(List<Integer> values) {
            addCriterion("resoure_Catagory_Id in", values, "resoureCatagoryId");
            return (Criteria) this;
        }

        public Criteria andResoureCatagoryIdNotIn(List<Integer> values) {
            addCriterion("resoure_Catagory_Id not in", values, "resoureCatagoryId");
            return (Criteria) this;
        }

        public Criteria andResoureCatagoryIdBetween(Integer value1, Integer value2) {
            addCriterion("resoure_Catagory_Id between", value1, value2, "resoureCatagoryId");
            return (Criteria) this;
        }

        public Criteria andResoureCatagoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("resoure_Catagory_Id not between", value1, value2, "resoureCatagoryId");
            return (Criteria) this;
        }

        public Criteria andResoureCatagoryNameIsNull() {
            addCriterion("resoure_Catagory_Name is null");
            return (Criteria) this;
        }

        public Criteria andResoureCatagoryNameIsNotNull() {
            addCriterion("resoure_Catagory_Name is not null");
            return (Criteria) this;
        }

        public Criteria andResoureCatagoryNameEqualTo(String value) {
            addCriterion("resoure_Catagory_Name =", value, "resoureCatagoryName");
            return (Criteria) this;
        }

        public Criteria andResoureCatagoryNameNotEqualTo(String value) {
            addCriterion("resoure_Catagory_Name <>", value, "resoureCatagoryName");
            return (Criteria) this;
        }

        public Criteria andResoureCatagoryNameGreaterThan(String value) {
            addCriterion("resoure_Catagory_Name >", value, "resoureCatagoryName");
            return (Criteria) this;
        }

        public Criteria andResoureCatagoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("resoure_Catagory_Name >=", value, "resoureCatagoryName");
            return (Criteria) this;
        }

        public Criteria andResoureCatagoryNameLessThan(String value) {
            addCriterion("resoure_Catagory_Name <", value, "resoureCatagoryName");
            return (Criteria) this;
        }

        public Criteria andResoureCatagoryNameLessThanOrEqualTo(String value) {
            addCriterion("resoure_Catagory_Name <=", value, "resoureCatagoryName");
            return (Criteria) this;
        }

        public Criteria andResoureCatagoryNameLike(String value) {
            addCriterion("resoure_Catagory_Name like", value, "resoureCatagoryName");
            return (Criteria) this;
        }

        public Criteria andResoureCatagoryNameNotLike(String value) {
            addCriterion("resoure_Catagory_Name not like", value, "resoureCatagoryName");
            return (Criteria) this;
        }

        public Criteria andResoureCatagoryNameIn(List<String> values) {
            addCriterion("resoure_Catagory_Name in", values, "resoureCatagoryName");
            return (Criteria) this;
        }

        public Criteria andResoureCatagoryNameNotIn(List<String> values) {
            addCriterion("resoure_Catagory_Name not in", values, "resoureCatagoryName");
            return (Criteria) this;
        }

        public Criteria andResoureCatagoryNameBetween(String value1, String value2) {
            addCriterion("resoure_Catagory_Name between", value1, value2, "resoureCatagoryName");
            return (Criteria) this;
        }

        public Criteria andResoureCatagoryNameNotBetween(String value1, String value2) {
            addCriterion("resoure_Catagory_Name not between", value1, value2, "resoureCatagoryName");
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