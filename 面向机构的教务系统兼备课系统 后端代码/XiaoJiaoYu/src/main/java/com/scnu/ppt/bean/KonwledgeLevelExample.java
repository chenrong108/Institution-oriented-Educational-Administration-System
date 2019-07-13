package com.scnu.ppt.bean;

import java.util.ArrayList;
import java.util.List;

public class KonwledgeLevelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KonwledgeLevelExample() {
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

        public Criteria andKownledgeIdIsNull() {
            addCriterion("kownledge_Id is null");
            return (Criteria) this;
        }

        public Criteria andKownledgeIdIsNotNull() {
            addCriterion("kownledge_Id is not null");
            return (Criteria) this;
        }

        public Criteria andKownledgeIdEqualTo(Integer value) {
            addCriterion("kownledge_Id =", value, "kownledgeId");
            return (Criteria) this;
        }

        public Criteria andKownledgeIdNotEqualTo(Integer value) {
            addCriterion("kownledge_Id <>", value, "kownledgeId");
            return (Criteria) this;
        }

        public Criteria andKownledgeIdGreaterThan(Integer value) {
            addCriterion("kownledge_Id >", value, "kownledgeId");
            return (Criteria) this;
        }

        public Criteria andKownledgeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("kownledge_Id >=", value, "kownledgeId");
            return (Criteria) this;
        }

        public Criteria andKownledgeIdLessThan(Integer value) {
            addCriterion("kownledge_Id <", value, "kownledgeId");
            return (Criteria) this;
        }

        public Criteria andKownledgeIdLessThanOrEqualTo(Integer value) {
            addCriterion("kownledge_Id <=", value, "kownledgeId");
            return (Criteria) this;
        }

        public Criteria andKownledgeIdIn(List<Integer> values) {
            addCriterion("kownledge_Id in", values, "kownledgeId");
            return (Criteria) this;
        }

        public Criteria andKownledgeIdNotIn(List<Integer> values) {
            addCriterion("kownledge_Id not in", values, "kownledgeId");
            return (Criteria) this;
        }

        public Criteria andKownledgeIdBetween(Integer value1, Integer value2) {
            addCriterion("kownledge_Id between", value1, value2, "kownledgeId");
            return (Criteria) this;
        }

        public Criteria andKownledgeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("kownledge_Id not between", value1, value2, "kownledgeId");
            return (Criteria) this;
        }

        public Criteria andLevel1IsNull() {
            addCriterion("level1 is null");
            return (Criteria) this;
        }

        public Criteria andLevel1IsNotNull() {
            addCriterion("level1 is not null");
            return (Criteria) this;
        }

        public Criteria andLevel1EqualTo(Integer value) {
            addCriterion("level1 =", value, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1NotEqualTo(Integer value) {
            addCriterion("level1 <>", value, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1GreaterThan(Integer value) {
            addCriterion("level1 >", value, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1GreaterThanOrEqualTo(Integer value) {
            addCriterion("level1 >=", value, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1LessThan(Integer value) {
            addCriterion("level1 <", value, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1LessThanOrEqualTo(Integer value) {
            addCriterion("level1 <=", value, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1In(List<Integer> values) {
            addCriterion("level1 in", values, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1NotIn(List<Integer> values) {
            addCriterion("level1 not in", values, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1Between(Integer value1, Integer value2) {
            addCriterion("level1 between", value1, value2, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel1NotBetween(Integer value1, Integer value2) {
            addCriterion("level1 not between", value1, value2, "level1");
            return (Criteria) this;
        }

        public Criteria andLevel2IsNull() {
            addCriterion("level2 is null");
            return (Criteria) this;
        }

        public Criteria andLevel2IsNotNull() {
            addCriterion("level2 is not null");
            return (Criteria) this;
        }

        public Criteria andLevel2EqualTo(Integer value) {
            addCriterion("level2 =", value, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2NotEqualTo(Integer value) {
            addCriterion("level2 <>", value, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2GreaterThan(Integer value) {
            addCriterion("level2 >", value, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2GreaterThanOrEqualTo(Integer value) {
            addCriterion("level2 >=", value, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2LessThan(Integer value) {
            addCriterion("level2 <", value, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2LessThanOrEqualTo(Integer value) {
            addCriterion("level2 <=", value, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2In(List<Integer> values) {
            addCriterion("level2 in", values, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2NotIn(List<Integer> values) {
            addCriterion("level2 not in", values, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2Between(Integer value1, Integer value2) {
            addCriterion("level2 between", value1, value2, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel2NotBetween(Integer value1, Integer value2) {
            addCriterion("level2 not between", value1, value2, "level2");
            return (Criteria) this;
        }

        public Criteria andLevel3IsNull() {
            addCriterion("level3 is null");
            return (Criteria) this;
        }

        public Criteria andLevel3IsNotNull() {
            addCriterion("level3 is not null");
            return (Criteria) this;
        }

        public Criteria andLevel3EqualTo(Integer value) {
            addCriterion("level3 =", value, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3NotEqualTo(Integer value) {
            addCriterion("level3 <>", value, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3GreaterThan(Integer value) {
            addCriterion("level3 >", value, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3GreaterThanOrEqualTo(Integer value) {
            addCriterion("level3 >=", value, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3LessThan(Integer value) {
            addCriterion("level3 <", value, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3LessThanOrEqualTo(Integer value) {
            addCriterion("level3 <=", value, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3In(List<Integer> values) {
            addCriterion("level3 in", values, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3NotIn(List<Integer> values) {
            addCriterion("level3 not in", values, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3Between(Integer value1, Integer value2) {
            addCriterion("level3 between", value1, value2, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel3NotBetween(Integer value1, Integer value2) {
            addCriterion("level3 not between", value1, value2, "level3");
            return (Criteria) this;
        }

        public Criteria andLevel4IsNull() {
            addCriterion("level4 is null");
            return (Criteria) this;
        }

        public Criteria andLevel4IsNotNull() {
            addCriterion("level4 is not null");
            return (Criteria) this;
        }

        public Criteria andLevel4EqualTo(Integer value) {
            addCriterion("level4 =", value, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4NotEqualTo(Integer value) {
            addCriterion("level4 <>", value, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4GreaterThan(Integer value) {
            addCriterion("level4 >", value, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4GreaterThanOrEqualTo(Integer value) {
            addCriterion("level4 >=", value, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4LessThan(Integer value) {
            addCriterion("level4 <", value, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4LessThanOrEqualTo(Integer value) {
            addCriterion("level4 <=", value, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4In(List<Integer> values) {
            addCriterion("level4 in", values, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4NotIn(List<Integer> values) {
            addCriterion("level4 not in", values, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4Between(Integer value1, Integer value2) {
            addCriterion("level4 between", value1, value2, "level4");
            return (Criteria) this;
        }

        public Criteria andLevel4NotBetween(Integer value1, Integer value2) {
            addCriterion("level4 not between", value1, value2, "level4");
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