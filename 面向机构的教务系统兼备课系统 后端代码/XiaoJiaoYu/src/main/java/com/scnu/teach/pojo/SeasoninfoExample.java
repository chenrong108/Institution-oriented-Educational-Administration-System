package com.scnu.teach.pojo;

import java.util.ArrayList;
import java.util.List;

public class SeasoninfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SeasoninfoExample() {
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

        public Criteria andSeasonIdIsNull() {
            addCriterion("season_Id is null");
            return (Criteria) this;
        }

        public Criteria andSeasonIdIsNotNull() {
            addCriterion("season_Id is not null");
            return (Criteria) this;
        }

        public Criteria andSeasonIdEqualTo(Integer value) {
            addCriterion("season_Id =", value, "seasonId");
            return (Criteria) this;
        }

        public Criteria andSeasonIdNotEqualTo(Integer value) {
            addCriterion("season_Id <>", value, "seasonId");
            return (Criteria) this;
        }

        public Criteria andSeasonIdGreaterThan(Integer value) {
            addCriterion("season_Id >", value, "seasonId");
            return (Criteria) this;
        }

        public Criteria andSeasonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("season_Id >=", value, "seasonId");
            return (Criteria) this;
        }

        public Criteria andSeasonIdLessThan(Integer value) {
            addCriterion("season_Id <", value, "seasonId");
            return (Criteria) this;
        }

        public Criteria andSeasonIdLessThanOrEqualTo(Integer value) {
            addCriterion("season_Id <=", value, "seasonId");
            return (Criteria) this;
        }

        public Criteria andSeasonIdIn(List<Integer> values) {
            addCriterion("season_Id in", values, "seasonId");
            return (Criteria) this;
        }

        public Criteria andSeasonIdNotIn(List<Integer> values) {
            addCriterion("season_Id not in", values, "seasonId");
            return (Criteria) this;
        }

        public Criteria andSeasonIdBetween(Integer value1, Integer value2) {
            addCriterion("season_Id between", value1, value2, "seasonId");
            return (Criteria) this;
        }

        public Criteria andSeasonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("season_Id not between", value1, value2, "seasonId");
            return (Criteria) this;
        }

        public Criteria andSeasonNameIsNull() {
            addCriterion("season_Name is null");
            return (Criteria) this;
        }

        public Criteria andSeasonNameIsNotNull() {
            addCriterion("season_Name is not null");
            return (Criteria) this;
        }

        public Criteria andSeasonNameEqualTo(String value) {
            addCriterion("season_Name =", value, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameNotEqualTo(String value) {
            addCriterion("season_Name <>", value, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameGreaterThan(String value) {
            addCriterion("season_Name >", value, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameGreaterThanOrEqualTo(String value) {
            addCriterion("season_Name >=", value, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameLessThan(String value) {
            addCriterion("season_Name <", value, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameLessThanOrEqualTo(String value) {
            addCriterion("season_Name <=", value, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameLike(String value) {
            addCriterion("season_Name like", value, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameNotLike(String value) {
            addCriterion("season_Name not like", value, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameIn(List<String> values) {
            addCriterion("season_Name in", values, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameNotIn(List<String> values) {
            addCriterion("season_Name not in", values, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameBetween(String value1, String value2) {
            addCriterion("season_Name between", value1, value2, "seasonName");
            return (Criteria) this;
        }

        public Criteria andSeasonNameNotBetween(String value1, String value2) {
            addCriterion("season_Name not between", value1, value2, "seasonName");
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