package com.scnu.course.bean;

import java.util.Date;

public class Course {
    private Integer courseId;

    private Integer userId;

    private Integer year;

    private Integer month;

    private Integer date;

    private Date starttime;
    
    private String s_time;
    
    private String e_time;

    private Date endtime;

    private String student;

    private String subject;

    private String gradeId;

    private String status;

    private Integer courseTime;

    private Integer residCourse;

    private String courseTopic;

    private Integer isMadePlan;

    private boolean isCorrected;

    private boolean isSentfeedback;
    
    private Integer counts_day;
    
    private int stime;
    
    private int etime;

    private String gradeName;
    
    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    
    public String getS_time() {
		return s_time;
	}

	public void setS_time(String s_time) {
		this.s_time = s_time;
	}

	public String getE_time() {
		return e_time;
	}

	public void setE_time(String e_time) {
		this.e_time = e_time;
	}

	public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student == null ? null : student.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(Integer courseTime) {
        this.courseTime = courseTime;
    }

    public Integer getResidCourse() {
        return residCourse;
    }

    public void setResidCourse(Integer residCourse) {
        this.residCourse = residCourse;
    }

    public String getCourseTopic() {
        return courseTopic;
    }

    public void setCourseTopic(String courseTopic) {
        this.courseTopic = courseTopic == null ? null : courseTopic.trim();
    }

    public Integer getIsMadePlan() {
        return isMadePlan;
    }

    public void setIsMadePlan(Integer isMadePlan) {
        this.isMadePlan = isMadePlan;
    }

	public boolean isCorrected() {
		return isCorrected;
	}

	public void setCorrected(boolean isCorrected) {
		this.isCorrected = isCorrected;
	}

	public boolean isSentfeedback() {
		return isSentfeedback;
	}

	public void setSentfeedback(boolean isSentfeedback) {
		this.isSentfeedback = isSentfeedback;
	}

	public Integer getCounts_day() {
		return counts_day;
	}

	public void setCounts_day(Integer counts_day) {
		this.counts_day = counts_day;
	}

	public int getStime() {
		return stime;
	}

	public void setStime(int stime) {
		this.stime = stime;
	}

	public int getEtime() {
		return etime;
	}

	public void setEtime(int etime) {
		this.etime = etime;
	}

	public String getGradeName() {
		return gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}
	
	
   
}