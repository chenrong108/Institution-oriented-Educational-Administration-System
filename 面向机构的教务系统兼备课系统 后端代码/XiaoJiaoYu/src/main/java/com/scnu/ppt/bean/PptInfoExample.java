package com.scnu.ppt.bean;

import java.util.ArrayList;
import java.util.List;

public class PptInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PptInfoExample() {
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

        public Criteria andPptIdIsNull() {
            addCriterion("ppt_Id is null");
            return (Criteria) this;
        }

        public Criteria andPptIdIsNotNull() {
            addCriterion("ppt_Id is not null");
            return (Criteria) this;
        }

        public Criteria andPptIdEqualTo(Integer value) {
            addCriterion("ppt_Id =", value, "pptId");
            return (Criteria) this;
        }

        public Criteria andPptIdNotEqualTo(Integer value) {
            addCriterion("ppt_Id <>", value, "pptId");
            return (Criteria) this;
        }

        public Criteria andPptIdGreaterThan(Integer value) {
            addCriterion("ppt_Id >", value, "pptId");
            return (Criteria) this;
        }

        public Criteria andPptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ppt_Id >=", value, "pptId");
            return (Criteria) this;
        }

        public Criteria andPptIdLessThan(Integer value) {
            addCriterion("ppt_Id <", value, "pptId");
            return (Criteria) this;
        }

        public Criteria andPptIdLessThanOrEqualTo(Integer value) {
            addCriterion("ppt_Id <=", value, "pptId");
            return (Criteria) this;
        }

        public Criteria andPptIdIn(List<Integer> values) {
            addCriterion("ppt_Id in", values, "pptId");
            return (Criteria) this;
        }

        public Criteria andPptIdNotIn(List<Integer> values) {
            addCriterion("ppt_Id not in", values, "pptId");
            return (Criteria) this;
        }

        public Criteria andPptIdBetween(Integer value1, Integer value2) {
            addCriterion("ppt_Id between", value1, value2, "pptId");
            return (Criteria) this;
        }

        public Criteria andPptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ppt_Id not between", value1, value2, "pptId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_Id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_Id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_Id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_Id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_Id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_Id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_Id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_Id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_Id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_Id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_Id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_Id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andPptNameIsNull() {
            addCriterion("ppt_Name is null");
            return (Criteria) this;
        }

        public Criteria andPptNameIsNotNull() {
            addCriterion("ppt_Name is not null");
            return (Criteria) this;
        }

        public Criteria andPptNameEqualTo(String value) {
            addCriterion("ppt_Name =", value, "pptName");
            return (Criteria) this;
        }

        public Criteria andPptNameNotEqualTo(String value) {
            addCriterion("ppt_Name <>", value, "pptName");
            return (Criteria) this;
        }

        public Criteria andPptNameGreaterThan(String value) {
            addCriterion("ppt_Name >", value, "pptName");
            return (Criteria) this;
        }

        public Criteria andPptNameGreaterThanOrEqualTo(String value) {
            addCriterion("ppt_Name >=", value, "pptName");
            return (Criteria) this;
        }

        public Criteria andPptNameLessThan(String value) {
            addCriterion("ppt_Name <", value, "pptName");
            return (Criteria) this;
        }

        public Criteria andPptNameLessThanOrEqualTo(String value) {
            addCriterion("ppt_Name <=", value, "pptName");
            return (Criteria) this;
        }

        public Criteria andPptNameLike(String value) {
            addCriterion("ppt_Name like", value, "pptName");
            return (Criteria) this;
        }

        public Criteria andPptNameNotLike(String value) {
            addCriterion("ppt_Name not like", value, "pptName");
            return (Criteria) this;
        }

        public Criteria andPptNameIn(List<String> values) {
            addCriterion("ppt_Name in", values, "pptName");
            return (Criteria) this;
        }

        public Criteria andPptNameNotIn(List<String> values) {
            addCriterion("ppt_Name not in", values, "pptName");
            return (Criteria) this;
        }

        public Criteria andPptNameBetween(String value1, String value2) {
            addCriterion("ppt_Name between", value1, value2, "pptName");
            return (Criteria) this;
        }

        public Criteria andPptNameNotBetween(String value1, String value2) {
            addCriterion("ppt_Name not between", value1, value2, "pptName");
            return (Criteria) this;
        }

        public Criteria andPptImgIsNull() {
            addCriterion("ppt_Img is null");
            return (Criteria) this;
        }

        public Criteria andPptImgIsNotNull() {
            addCriterion("ppt_Img is not null");
            return (Criteria) this;
        }

        public Criteria andPptImgEqualTo(String value) {
            addCriterion("ppt_Img =", value, "pptImg");
            return (Criteria) this;
        }

        public Criteria andPptImgNotEqualTo(String value) {
            addCriterion("ppt_Img <>", value, "pptImg");
            return (Criteria) this;
        }

        public Criteria andPptImgGreaterThan(String value) {
            addCriterion("ppt_Img >", value, "pptImg");
            return (Criteria) this;
        }

        public Criteria andPptImgGreaterThanOrEqualTo(String value) {
            addCriterion("ppt_Img >=", value, "pptImg");
            return (Criteria) this;
        }

        public Criteria andPptImgLessThan(String value) {
            addCriterion("ppt_Img <", value, "pptImg");
            return (Criteria) this;
        }

        public Criteria andPptImgLessThanOrEqualTo(String value) {
            addCriterion("ppt_Img <=", value, "pptImg");
            return (Criteria) this;
        }

        public Criteria andPptImgLike(String value) {
            addCriterion("ppt_Img like", value, "pptImg");
            return (Criteria) this;
        }

        public Criteria andPptImgNotLike(String value) {
            addCriterion("ppt_Img not like", value, "pptImg");
            return (Criteria) this;
        }

        public Criteria andPptImgIn(List<String> values) {
            addCriterion("ppt_Img in", values, "pptImg");
            return (Criteria) this;
        }

        public Criteria andPptImgNotIn(List<String> values) {
            addCriterion("ppt_Img not in", values, "pptImg");
            return (Criteria) this;
        }

        public Criteria andPptImgBetween(String value1, String value2) {
            addCriterion("ppt_Img between", value1, value2, "pptImg");
            return (Criteria) this;
        }

        public Criteria andPptImgNotBetween(String value1, String value2) {
            addCriterion("ppt_Img not between", value1, value2, "pptImg");
            return (Criteria) this;
        }

        public Criteria andPptHrefIsNull() {
            addCriterion("ppt_Href is null");
            return (Criteria) this;
        }

        public Criteria andPptHrefIsNotNull() {
            addCriterion("ppt_Href is not null");
            return (Criteria) this;
        }

        public Criteria andPptHrefEqualTo(String value) {
            addCriterion("ppt_Href =", value, "pptHref");
            return (Criteria) this;
        }

        public Criteria andPptHrefNotEqualTo(String value) {
            addCriterion("ppt_Href <>", value, "pptHref");
            return (Criteria) this;
        }

        public Criteria andPptHrefGreaterThan(String value) {
            addCriterion("ppt_Href >", value, "pptHref");
            return (Criteria) this;
        }

        public Criteria andPptHrefGreaterThanOrEqualTo(String value) {
            addCriterion("ppt_Href >=", value, "pptHref");
            return (Criteria) this;
        }

        public Criteria andPptHrefLessThan(String value) {
            addCriterion("ppt_Href <", value, "pptHref");
            return (Criteria) this;
        }

        public Criteria andPptHrefLessThanOrEqualTo(String value) {
            addCriterion("ppt_Href <=", value, "pptHref");
            return (Criteria) this;
        }

        public Criteria andPptHrefLike(String value) {
            addCriterion("ppt_Href like", value, "pptHref");
            return (Criteria) this;
        }

        public Criteria andPptHrefNotLike(String value) {
            addCriterion("ppt_Href not like", value, "pptHref");
            return (Criteria) this;
        }

        public Criteria andPptHrefIn(List<String> values) {
            addCriterion("ppt_Href in", values, "pptHref");
            return (Criteria) this;
        }

        public Criteria andPptHrefNotIn(List<String> values) {
            addCriterion("ppt_Href not in", values, "pptHref");
            return (Criteria) this;
        }

        public Criteria andPptHrefBetween(String value1, String value2) {
            addCriterion("ppt_Href between", value1, value2, "pptHref");
            return (Criteria) this;
        }

        public Criteria andPptHrefNotBetween(String value1, String value2) {
            addCriterion("ppt_Href not between", value1, value2, "pptHref");
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