package com.scnu.course.bean;

public class CourseInfo{
	
	private int date;
	
	private String stime;
	
	private String etime;
	
	private String student;
	
	private String subject;
	
	private String grade;
	
	private int hour;
	
	private int isMadePlan;
	
	private boolean isCorrected;
	
	private boolean isSentFeebBack;
	
	private String week;
	
	private String grade_Name;

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String getStime() {
		return stime;
	}

	public void setStime(String stime) {
		this.stime = stime;
	}

	public String getEtime() {
		return etime;
	}

	public void setEtime(String etime) {
		this.etime = etime;
	}

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getIsMadePlan() {
		return isMadePlan;
	}

	public void setIsMadePlan(int isMadePlan) {
		this.isMadePlan = isMadePlan;
	}

	public boolean isCorrected() {
		return isCorrected;
	}

	public void setCorrected(boolean isCorrected) {
		this.isCorrected = isCorrected;
	}

	public boolean isSentFeebBack() {
		return isSentFeebBack;
	}

	public void setSentFeebBack(boolean isSentFeebBack) {
		this.isSentFeebBack = isSentFeebBack;
	}


	public String getWeek() {
		return week;
	}

	public void setWeek(String week) {
		this.week = week;
	}

	public String getGrade_Name() {
		return grade_Name;
	}

	public void setGrade_Name(String grade_Name) {
		this.grade_Name = grade_Name;
	}
	

//	public int compareTo(CourseInfo courseinfo) {
//		// TODO Auto-generated method stub
//		return this.data - courseinfo.getData();
//	}
	
	
}
