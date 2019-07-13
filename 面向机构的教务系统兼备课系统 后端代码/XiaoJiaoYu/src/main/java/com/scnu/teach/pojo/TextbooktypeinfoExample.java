package com.scnu.teach.pojo;

import java.util.ArrayList;
import java.util.List;

public class TextbooktypeinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TextbooktypeinfoExample() {
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

        public Criteria andTextBookIdIsNull() {
            addCriterion("text_Book_Id is null");
            return (Criteria) this;
        }

        public Criteria andTextBookIdIsNotNull() {
            addCriterion("text_Book_Id is not null");
            return (Criteria) this;
        }

        public Criteria andTextBookIdEqualTo(Integer value) {
            addCriterion("text_Book_Id =", value, "textBookId");
            return (Criteria) this;
        }

        public Criteria andTextBookIdNotEqualTo(Integer value) {
            addCriterion("text_Book_Id <>", value, "textBookId");
            return (Criteria) this;
        }

        public Criteria andTextBookIdGreaterThan(Integer value) {
            addCriterion("text_Book_Id >", value, "textBookId");
            return (Criteria) this;
        }

        public Criteria andTextBookIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("text_Book_Id >=", value, "textBookId");
            return (Criteria) this;
        }

        public Criteria andTextBookIdLessThan(Integer value) {
            addCriterion("text_Book_Id <", value, "textBookId");
            return (Criteria) this;
        }

        public Criteria andTextBookIdLessThanOrEqualTo(Integer value) {
            addCriterion("text_Book_Id <=", value, "textBookId");
            return (Criteria) this;
        }

        public Criteria andTextBookIdIn(List<Integer> values) {
            addCriterion("text_Book_Id in", values, "textBookId");
            return (Criteria) this;
        }

        public Criteria andTextBookIdNotIn(List<Integer> values) {
            addCriterion("text_Book_Id not in", values, "textBookId");
            return (Criteria) this;
        }

        public Criteria andTextBookIdBetween(Integer value1, Integer value2) {
            addCriterion("text_Book_Id between", value1, value2, "textBookId");
            return (Criteria) this;
        }

        public Criteria andTextBookIdNotBetween(Integer value1, Integer value2) {
            addCriterion("text_Book_Id not between", value1, value2, "textBookId");
            return (Criteria) this;
        }

        public Criteria andTextBookNameIsNull() {
            addCriterion("text_Book_Name is null");
            return (Criteria) this;
        }

        public Criteria andTextBookNameIsNotNull() {
            addCriterion("text_Book_Name is not null");
            return (Criteria) this;
        }

        public Criteria andTextBookNameEqualTo(String value) {
            addCriterion("text_Book_Name =", value, "textBookName");
            return (Criteria) this;
        }

        public Criteria andTextBookNameNotEqualTo(String value) {
            addCriterion("text_Book_Name <>", value, "textBookName");
            return (Criteria) this;
        }

        public Criteria andTextBookNameGreaterThan(String value) {
            addCriterion("text_Book_Name >", value, "textBookName");
            return (Criteria) this;
        }

        public Criteria andTextBookNameGreaterThanOrEqualTo(String value) {
            addCriterion("text_Book_Name >=", value, "textBookName");
            return (Criteria) this;
        }

        public Criteria andTextBookNameLessThan(String value) {
            addCriterion("text_Book_Name <", value, "textBookName");
            return (Criteria) this;
        }

        public Criteria andTextBookNameLessThanOrEqualTo(String value) {
            addCriterion("text_Book_Name <=", value, "textBookName");
            return (Criteria) this;
        }

        public Criteria andTextBookNameLike(String value) {
            addCriterion("text_Book_Name like", value, "textBookName");
            return (Criteria) this;
        }

        public Criteria andTextBookNameNotLike(String value) {
            addCriterion("text_Book_Name not like", value, "textBookName");
            return (Criteria) this;
        }

        public Criteria andTextBookNameIn(List<String> values) {
            addCriterion("text_Book_Name in", values, "textBookName");
            return (Criteria) this;
        }

        public Criteria andTextBookNameNotIn(List<String> values) {
            addCriterion("text_Book_Name not in", values, "textBookName");
            return (Criteria) this;
        }

        public Criteria andTextBookNameBetween(String value1, String value2) {
            addCriterion("text_Book_Name between", value1, value2, "textBookName");
            return (Criteria) this;
        }

        public Criteria andTextBookNameNotBetween(String value1, String value2) {
            addCriterion("text_Book_Name not between", value1, value2, "textBookName");
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