package com.scnu.course.bean;

public class MonthCounts {
	
	private int counts_month;
	
//	private int year;
	
	private int month;
	
//	private int userId;
	
	public MonthCounts(){
		
	}
	
	public MonthCounts(int month,int counts_month){
		this.month = month;
		this.counts_month = counts_month;
	}
	
	public int getCounts_month() {
		return counts_month;
	}

	public void setCounts_month(int counts_month) {
		this.counts_month = counts_month;
	}

//	public int getYear() {
//		return year;
//	}
//
//	public void setYear(int year) {
//		this.year = year;
//	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

//	public int getUserId() {
//		return userId;
//	}
//
//	public void setUserId(int userId) {
//		this.userId = userId;
//	}
	
	

}
