package com.scnu.course.mapper;

import java.util.ArrayList;

import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andCourseIdIsNull() {
            addCriterion("course_Id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("course_Id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(Integer value) {
            addCriterion("course_Id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(Integer value) {
            addCriterion("course_Id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(Integer value) {
            addCriterion("course_Id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_Id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(Integer value) {
            addCriterion("course_Id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(Integer value) {
            addCriterion("course_Id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<Integer> values) {
            addCriterion("course_Id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<Integer> values) {
            addCriterion("course_Id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(Integer value1, Integer value2) {
            addCriterion("course_Id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("course_Id not between", value1, value2, "courseId");
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

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(Integer value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(Integer value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(Integer value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(Integer value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(Integer value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<Integer> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<Integer> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(Integer value1, Integer value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(Integer value1, Integer value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andMonthIsNull() {
            addCriterion("month is null");
            return (Criteria) this;
        }

        public Criteria andMonthIsNotNull() {
            addCriterion("month is not null");
            return (Criteria) this;
        }

        public Criteria andMonthEqualTo(Integer value) {
            addCriterion("month =", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotEqualTo(Integer value) {
            addCriterion("month <>", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThan(Integer value) {
            addCriterion("month >", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("month >=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThan(Integer value) {
            addCriterion("month <", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThanOrEqualTo(Integer value) {
            addCriterion("month <=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthIn(List<Integer> values) {
            addCriterion("month in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotIn(List<Integer> values) {
            addCriterion("month not in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthBetween(Integer value1, Integer value2) {
            addCriterion("month between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("month not between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Integer value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Integer value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Integer value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Integer value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Integer value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Integer> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Integer> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Integer value1, Integer value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Integer value1, Integer value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Integer value) {
            addCriterion("startTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Integer value) {
            addCriterion("startTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Integer value) {
            addCriterion("startTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("startTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Integer value) {
            addCriterion("startTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Integer value) {
            addCriterion("startTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Integer> values) {
            addCriterion("startTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Integer> values) {
            addCriterion("startTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Integer value1, Integer value2) {
            addCriterion("startTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Integer value1, Integer value2) {
            addCriterion("startTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Integer value) {
            addCriterion("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Integer value) {
            addCriterion("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Integer value) {
            addCriterion("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Integer value) {
            addCriterion("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Integer value) {
            addCriterion("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Integer> values) {
            addCriterion("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Integer> values) {
            addCriterion("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Integer value1, Integer value2) {
            addCriterion("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("endTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andStudentIsNull() {
            addCriterion("student is null");
            return (Criteria) this;
        }

        public Criteria andStudentIsNotNull() {
            addCriterion("student is not null");
            return (Criteria) this;
        }

        public Criteria andStudentEqualTo(String value) {
            addCriterion("student =", value, "student");
            return (Criteria) this;
        }

        public Criteria andStudentNotEqualTo(String value) {
            addCriterion("student <>", value, "student");
            return (Criteria) this;
        }

        public Criteria andStudentGreaterThan(String value) {
            addCriterion("student >", value, "student");
            return (Criteria) this;
        }

        public Criteria andStudentGreaterThanOrEqualTo(String value) {
            addCriterion("student >=", value, "student");
            return (Criteria) this;
        }

        public Criteria andStudentLessThan(String value) {
            addCriterion("student <", value, "student");
            return (Criteria) this;
        }

        public Criteria andStudentLessThanOrEqualTo(String value) {
            addCriterion("student <=", value, "student");
            return (Criteria) this;
        }

        public Criteria andStudentLike(String value) {
            addCriterion("student like", value, "student");
            return (Criteria) this;
        }

        public Criteria andStudentNotLike(String value) {
            addCriterion("student not like", value, "student");
            return (Criteria) this;
        }

        public Criteria andStudentIn(List<String> values) {
            addCriterion("student in", values, "student");
            return (Criteria) this;
        }

        public Criteria andStudentNotIn(List<String> values) {
            addCriterion("student not in", values, "student");
            return (Criteria) this;
        }

        public Criteria andStudentBetween(String value1, String value2) {
            addCriterion("student between", value1, value2, "student");
            return (Criteria) this;
        }

        public Criteria andStudentNotBetween(String value1, String value2) {
            addCriterion("student not between", value1, value2, "student");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNull() {
            addCriterion("subject is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNotNull() {
            addCriterion("subject is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectEqualTo(String value) {
            addCriterion("subject =", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotEqualTo(String value) {
            addCriterion("subject <>", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThan(String value) {
            addCriterion("subject >", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("subject >=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThan(String value) {
            addCriterion("subject <", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThanOrEqualTo(String value) {
            addCriterion("subject <=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLike(String value) {
            addCriterion("subject like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotLike(String value) {
            addCriterion("subject not like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectIn(List<String> values) {
            addCriterion("subject in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotIn(List<String> values) {
            addCriterion("subject not in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectBetween(String value1, String value2) {
            addCriterion("subject between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotBetween(String value1, String value2) {
            addCriterion("subject not between", value1, value2, "subject");
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andResidCourseIsNull() {
            addCriterion("resid_Course is null");
            return (Criteria) this;
        }

        public Criteria andResidCourseIsNotNull() {
            addCriterion("resid_Course is not null");
            return (Criteria) this;
        }

        public Criteria andResidCourseEqualTo(Integer value) {
            addCriterion("resid_Course =", value, "residCourse");
            return (Criteria) this;
        }

        public Criteria andResidCourseNotEqualTo(Integer value) {
            addCriterion("resid_Course <>", value, "residCourse");
            return (Criteria) this;
        }

        public Criteria andResidCourseGreaterThan(Integer value) {
            addCriterion("resid_Course >", value, "residCourse");
            return (Criteria) this;
        }

        public Criteria andResidCourseGreaterThanOrEqualTo(Integer value) {
            addCriterion("resid_Course >=", value, "residCourse");
            return (Criteria) this;
        }

        public Criteria andResidCourseLessThan(Integer value) {
            addCriterion("resid_Course <", value, "residCourse");
            return (Criteria) this;
        }

        public Criteria andResidCourseLessThanOrEqualTo(Integer value) {
            addCriterion("resid_Course <=", value, "residCourse");
            return (Criteria) this;
        }

        public Criteria andResidCourseIn(List<Integer> values) {
            addCriterion("resid_Course in", values, "residCourse");
            return (Criteria) this;
        }

        public Criteria andResidCourseNotIn(List<Integer> values) {
            addCriterion("resid_Course not in", values, "residCourse");
            return (Criteria) this;
        }

        public Criteria andResidCourseBetween(Integer value1, Integer value2) {
            addCriterion("resid_Course between", value1, value2, "residCourse");
            return (Criteria) this;
        }

        public Criteria andResidCourseNotBetween(Integer value1, Integer value2) {
            addCriterion("resid_Course not between", value1, value2, "residCourse");
            return (Criteria) this;
        }

        public Criteria andIsMadePlanIsNull() {
            addCriterion("is_Made_Plan is null");
            return (Criteria) this;
        }

        public Criteria andIsMadePlanIsNotNull() {
            addCriterion("is_Made_Plan is not null");
            return (Criteria) this;
        }

        public Criteria andIsMadePlanEqualTo(Integer value) {
            addCriterion("is_Made_Plan =", value, "isMadePlan");
            return (Criteria) this;
        }

        public Criteria andIsMadePlanNotEqualTo(Integer value) {
            addCriterion("is_Made_Plan <>", value, "isMadePlan");
            return (Criteria) this;
        }

        public Criteria andIsMadePlanGreaterThan(Integer value) {
            addCriterion("is_Made_Plan >", value, "isMadePlan");
            return (Criteria) this;
        }

        public Criteria andIsMadePlanGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_Made_Plan >=", value, "isMadePlan");
            return (Criteria) this;
        }

        public Criteria andIsMadePlanLessThan(Integer value) {
            addCriterion("is_Made_Plan <", value, "isMadePlan");
            return (Criteria) this;
        }

        public Criteria andIsMadePlanLessThanOrEqualTo(Integer value) {
            addCriterion("is_Made_Plan <=", value, "isMadePlan");
            return (Criteria) this;
        }

        public Criteria andIsMadePlanIn(List<Integer> values) {
            addCriterion("is_Made_Plan in", values, "isMadePlan");
            return (Criteria) this;
        }

        public Criteria andIsMadePlanNotIn(List<Integer> values) {
            addCriterion("is_Made_Plan not in", values, "isMadePlan");
            return (Criteria) this;
        }

        public Criteria andIsMadePlanBetween(Integer value1, Integer value2) {
            addCriterion("is_Made_Plan between", value1, value2, "isMadePlan");
            return (Criteria) this;
        }

        public Criteria andIsMadePlanNotBetween(Integer value1, Integer value2) {
            addCriterion("is_Made_Plan not between", value1, value2, "isMadePlan");
            return (Criteria) this;
        }

        public Criteria andIsCorrectedIsNull() {
            addCriterion("is_Corrected is null");
            return (Criteria) this;
        }

        public Criteria andIsCorrectedIsNotNull() {
            addCriterion("is_Corrected is not null");
            return (Criteria) this;
        }

        public Criteria andIsCorrectedEqualTo(Integer value) {
            addCriterion("is_Corrected =", value, "isCorrected");
            return (Criteria) this;
        }

        public Criteria andIsCorrectedNotEqualTo(Integer value) {
            addCriterion("is_Corrected <>", value, "isCorrected");
            return (Criteria) this;
        }

        public Criteria andIsCorrectedGreaterThan(Integer value) {
            addCriterion("is_Corrected >", value, "isCorrected");
            return (Criteria) this;
        }

        public Criteria andIsCorrectedGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_Corrected >=", value, "isCorrected");
            return (Criteria) this;
        }

        public Criteria andIsCorrectedLessThan(Integer value) {
            addCriterion("is_Corrected <", value, "isCorrected");
            return (Criteria) this;
        }

        public Criteria andIsCorrectedLessThanOrEqualTo(Integer value) {
            addCriterion("is_Corrected <=", value, "isCorrected");
            return (Criteria) this;
        }

        public Criteria andIsCorrectedIn(List<Integer> values) {
            addCriterion("is_Corrected in", values, "isCorrected");
            return (Criteria) this;
        }

        public Criteria andIsCorrectedNotIn(List<Integer> values) {
            addCriterion("is_Corrected not in", values, "isCorrected");
            return (Criteria) this;
        }

        public Criteria andIsCorrectedBetween(Integer value1, Integer value2) {
            addCriterion("is_Corrected between", value1, value2, "isCorrected");
            return (Criteria) this;
        }

        public Criteria andIsCorrectedNotBetween(Integer value1, Integer value2) {
            addCriterion("is_Corrected not between", value1, value2, "isCorrected");
            return (Criteria) this;
        }

        public Criteria andIsSentfeedbackIsNull() {
            addCriterion("is_SentFeedback is null");
            return (Criteria) this;
        }

        public Criteria andIsSentfeedbackIsNotNull() {
            addCriterion("is_SentFeedback is not null");
            return (Criteria) this;
        }

        public Criteria andIsSentfeedbackEqualTo(Integer value) {
            addCriterion("is_SentFeedback =", value, "isSentfeedback");
            return (Criteria) this;
        }

        public Criteria andIsSentfeedbackNotEqualTo(Integer value) {
            addCriterion("is_SentFeedback <>", value, "isSentfeedback");
            return (Criteria) this;
        }

        public Criteria andIsSentfeedbackGreaterThan(Integer value) {
            addCriterion("is_SentFeedback >", value, "isSentfeedback");
            return (Criteria) this;
        }

        public Criteria andIsSentfeedbackGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_SentFeedback >=", value, "isSentfeedback");
            return (Criteria) this;
        }

        public Criteria andIsSentfeedbackLessThan(Integer value) {
            addCriterion("is_SentFeedback <", value, "isSentfeedback");
            return (Criteria) this;
        }

        public Criteria andIsSentfeedbackLessThanOrEqualTo(Integer value) {
            addCriterion("is_SentFeedback <=", value, "isSentfeedback");
            return (Criteria) this;
        }

        public Criteria andIsSentfeedbackIn(List<Integer> values) {
            addCriterion("is_SentFeedback in", values, "isSentfeedback");
            return (Criteria) this;
        }

        public Criteria andIsSentfeedbackNotIn(List<Integer> values) {
            addCriterion("is_SentFeedback not in", values, "isSentfeedback");
            return (Criteria) this;
        }

        public Criteria andIsSentfeedbackBetween(Integer value1, Integer value2) {
            addCriterion("is_SentFeedback between", value1, value2, "isSentfeedback");
            return (Criteria) this;
        }

        public Criteria andIsSentfeedbackNotBetween(Integer value1, Integer value2) {
            addCriterion("is_SentFeedback not between", value1, value2, "isSentfeedback");
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