package com.scnu.course.bean;

public class DayCounts {
	
	private int counts_day;
	
//	private int year;
//	
//	private int month;
	
	private int day;
	
//	private int userId;

	public DayCounts(){
		
	}
	
	public DayCounts(int day,int counts_day){
		this.day = day;
		this.counts_day = counts_day;
	}
	
	public int getCounts_day() {
		return counts_day;
	}

	public void setCounts_day(int counts_day) {
		this.counts_day = counts_day;
	}

//
//	public int getYear() {
//		return year;
//	}
//
//	public void setYear(int year) {
//		this.year = year;
//	}
//
//	public int getMonth() {
//		return month;
//	}
//
//	public void setMonth(int month) {
//		this.month = month;
//	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

//	public int getUserId() {
//		return userId;
//	}
//
//	public void setUserId(int userId) {
//		this.userId = userId;
//	}

}
