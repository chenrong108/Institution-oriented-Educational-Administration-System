package com.scnu.ppt.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LectureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LectureExample() {
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

        public Criteria andSubjectIdIsNull() {
            addCriterion("subject_Id is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNotNull() {
            addCriterion("subject_Id is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdEqualTo(Integer value) {
            addCriterion("subject_Id =", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotEqualTo(Integer value) {
            addCriterion("subject_Id <>", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThan(Integer value) {
            addCriterion("subject_Id >", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("subject_Id >=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThan(Integer value) {
            addCriterion("subject_Id <", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("subject_Id <=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIn(List<Integer> values) {
            addCriterion("subject_Id in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotIn(List<Integer> values) {
            addCriterion("subject_Id not in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdBetween(Integer value1, Integer value2) {
            addCriterion("subject_Id between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("subject_Id not between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIsNull() {
            addCriterion("business_Id is null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIsNotNull() {
            addCriterion("business_Id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdEqualTo(Integer value) {
            addCriterion("business_Id =", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotEqualTo(Integer value) {
            addCriterion("business_Id <>", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThan(Integer value) {
            addCriterion("business_Id >", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_Id >=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThan(Integer value) {
            addCriterion("business_Id <", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThanOrEqualTo(Integer value) {
            addCriterion("business_Id <=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIn(List<Integer> values) {
            addCriterion("business_Id in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotIn(List<Integer> values) {
            addCriterion("business_Id not in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdBetween(Integer value1, Integer value2) {
            addCriterion("business_Id between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotBetween(Integer value1, Integer value2) {
            addCriterion("business_Id not between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andPublishVersionIdIsNull() {
            addCriterion("publish_Version_Id is null");
            return (Criteria) this;
        }

        public Criteria andPublishVersionIdIsNotNull() {
            addCriterion("publish_Version_Id is not null");
            return (Criteria) this;
        }

        public Criteria andPublishVersionIdEqualTo(Integer value) {
            addCriterion("publish_Version_Id =", value, "publishVersionId");
            return (Criteria) this;
        }

        public Criteria andPublishVersionIdNotEqualTo(Integer value) {
            addCriterion("publish_Version_Id <>", value, "publishVersionId");
            return (Criteria) this;
        }

        public Criteria andPublishVersionIdGreaterThan(Integer value) {
            addCriterion("publish_Version_Id >", value, "publishVersionId");
            return (Criteria) this;
        }

        public Criteria andPublishVersionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("publish_Version_Id >=", value, "publishVersionId");
            return (Criteria) this;
        }

        public Criteria andPublishVersionIdLessThan(Integer value) {
            addCriterion("publish_Version_Id <", value, "publishVersionId");
            return (Criteria) this;
        }

        public Criteria andPublishVersionIdLessThanOrEqualTo(Integer value) {
            addCriterion("publish_Version_Id <=", value, "publishVersionId");
            return (Criteria) this;
        }

        public Criteria andPublishVersionIdIn(List<Integer> values) {
            addCriterion("publish_Version_Id in", values, "publishVersionId");
            return (Criteria) this;
        }

        public Criteria andPublishVersionIdNotIn(List<Integer> values) {
            addCriterion("publish_Version_Id not in", values, "publishVersionId");
            return (Criteria) this;
        }

        public Criteria andPublishVersionIdBetween(Integer value1, Integer value2) {
            addCriterion("publish_Version_Id between", value1, value2, "publishVersionId");
            return (Criteria) this;
        }

        public Criteria andPublishVersionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("publish_Version_Id not between", value1, value2, "publishVersionId");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNull() {
            addCriterion("grade_Id is null");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNotNull() {
            addCriterion("grade_Id is not null");
            return (Criteria) this;
        }

        public Criteria andGradeIdEqualTo(Integer value) {
            addCriterion("grade_Id =", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotEqualTo(Integer value) {
            addCriterion("grade_Id <>", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThan(Integer value) {
            addCriterion("grade_Id >", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade_Id >=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThan(Integer value) {
            addCriterion("grade_Id <", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThanOrEqualTo(Integer value) {
            addCriterion("grade_Id <=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdIn(List<Integer> values) {
            addCriterion("grade_Id in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotIn(List<Integer> values) {
            addCriterion("grade_Id not in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdBetween(Integer value1, Integer value2) {
            addCriterion("grade_Id between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("grade_Id not between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andYearIdIsNull() {
            addCriterion("year_Id is null");
            return (Criteria) this;
        }

        public Criteria andYearIdIsNotNull() {
            addCriterion("year_Id is not null");
            return (Criteria) this;
        }

        public Criteria andYearIdEqualTo(Integer value) {
            addCriterion("year_Id =", value, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdNotEqualTo(Integer value) {
            addCriterion("year_Id <>", value, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdGreaterThan(Integer value) {
            addCriterion("year_Id >", value, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("year_Id >=", value, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdLessThan(Integer value) {
            addCriterion("year_Id <", value, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdLessThanOrEqualTo(Integer value) {
            addCriterion("year_Id <=", value, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdIn(List<Integer> values) {
            addCriterion("year_Id in", values, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdNotIn(List<Integer> values) {
            addCriterion("year_Id not in", values, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdBetween(Integer value1, Integer value2) {
            addCriterion("year_Id between", value1, value2, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdNotBetween(Integer value1, Integer value2) {
            addCriterion("year_Id not between", value1, value2, "yearId");
            return (Criteria) this;
        }

        public Criteria andCoporationIdIsNull() {
            addCriterion("coporation_Id is null");
            return (Criteria) this;
        }

        public Criteria andCoporationIdIsNotNull() {
            addCriterion("coporation_Id is not null");
            return (Criteria) this;
        }

        public Criteria andCoporationIdEqualTo(Integer value) {
            addCriterion("coporation_Id =", value, "coporationId");
            return (Criteria) this;
        }

        public Criteria andCoporationIdNotEqualTo(Integer value) {
            addCriterion("coporation_Id <>", value, "coporationId");
            return (Criteria) this;
        }

        public Criteria andCoporationIdGreaterThan(Integer value) {
            addCriterion("coporation_Id >", value, "coporationId");
            return (Criteria) this;
        }

        public Criteria andCoporationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("coporation_Id >=", value, "coporationId");
            return (Criteria) this;
        }

        public Criteria andCoporationIdLessThan(Integer value) {
            addCriterion("coporation_Id <", value, "coporationId");
            return (Criteria) this;
        }

        public Criteria andCoporationIdLessThanOrEqualTo(Integer value) {
            addCriterion("coporation_Id <=", value, "coporationId");
            return (Criteria) this;
        }

        public Criteria andCoporationIdIn(List<Integer> values) {
            addCriterion("coporation_Id in", values, "coporationId");
            return (Criteria) this;
        }

        public Criteria andCoporationIdNotIn(List<Integer> values) {
            addCriterion("coporation_Id not in", values, "coporationId");
            return (Criteria) this;
        }

        public Criteria andCoporationIdBetween(Integer value1, Integer value2) {
            addCriterion("coporation_Id between", value1, value2, "coporationId");
            return (Criteria) this;
        }

        public Criteria andCoporationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("coporation_Id not between", value1, value2, "coporationId");
            return (Criteria) this;
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

        public Criteria andBookVersionIdIsNull() {
            addCriterion("book_Version_Id is null");
            return (Criteria) this;
        }

        public Criteria andBookVersionIdIsNotNull() {
            addCriterion("book_Version_Id is not null");
            return (Criteria) this;
        }

        public Criteria andBookVersionIdEqualTo(Integer value) {
            addCriterion("book_Version_Id =", value, "bookVersionId");
            return (Criteria) this;
        }

        public Criteria andBookVersionIdNotEqualTo(Integer value) {
            addCriterion("book_Version_Id <>", value, "bookVersionId");
            return (Criteria) this;
        }

        public Criteria andBookVersionIdGreaterThan(Integer value) {
            addCriterion("book_Version_Id >", value, "bookVersionId");
            return (Criteria) this;
        }

        public Criteria andBookVersionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_Version_Id >=", value, "bookVersionId");
            return (Criteria) this;
        }

        public Criteria andBookVersionIdLessThan(Integer value) {
            addCriterion("book_Version_Id <", value, "bookVersionId");
            return (Criteria) this;
        }

        public Criteria andBookVersionIdLessThanOrEqualTo(Integer value) {
            addCriterion("book_Version_Id <=", value, "bookVersionId");
            return (Criteria) this;
        }

        public Criteria andBookVersionIdIn(List<Integer> values) {
            addCriterion("book_Version_Id in", values, "bookVersionId");
            return (Criteria) this;
        }

        public Criteria andBookVersionIdNotIn(List<Integer> values) {
            addCriterion("book_Version_Id not in", values, "bookVersionId");
            return (Criteria) this;
        }

        public Criteria andBookVersionIdBetween(Integer value1, Integer value2) {
            addCriterion("book_Version_Id between", value1, value2, "bookVersionId");
            return (Criteria) this;
        }

        public Criteria andBookVersionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("book_Version_Id not between", value1, value2, "bookVersionId");
            return (Criteria) this;
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

        public Criteria andMaterialTypeIdIsNull() {
            addCriterion("material_Type_Id is null");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIdIsNotNull() {
            addCriterion("material_Type_Id is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIdEqualTo(Integer value) {
            addCriterion("material_Type_Id =", value, "materialTypeId");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIdNotEqualTo(Integer value) {
            addCriterion("material_Type_Id <>", value, "materialTypeId");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIdGreaterThan(Integer value) {
            addCriterion("material_Type_Id >", value, "materialTypeId");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("material_Type_Id >=", value, "materialTypeId");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIdLessThan(Integer value) {
            addCriterion("material_Type_Id <", value, "materialTypeId");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("material_Type_Id <=", value, "materialTypeId");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIdIn(List<Integer> values) {
            addCriterion("material_Type_Id in", values, "materialTypeId");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIdNotIn(List<Integer> values) {
            addCriterion("material_Type_Id not in", values, "materialTypeId");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("material_Type_Id between", value1, value2, "materialTypeId");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("material_Type_Id not between", value1, value2, "materialTypeId");
            return (Criteria) this;
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_Time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_Time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_Time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_Time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_Time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_Time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_Time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_Time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_Time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_Time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_Time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_Time not between", value1, value2, "createTime");
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