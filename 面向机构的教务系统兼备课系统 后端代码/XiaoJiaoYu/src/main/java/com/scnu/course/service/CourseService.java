package com.scnu.course.service;

import java.io.IOException;


import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scnu.course.bean.Course;
import com.scnu.course.mapper.CourseMapper;

@Service
public class CourseService {

	@Autowired
    private CourseMapper courseMapper; //用AutoWired注入DB层
	

	public ArrayList<Course> findAll(Integer userId) throws IOException
	{
		return courseMapper.findAll(userId);
	}
	
	public List<Course> getDayCounts(Integer userId, Integer year, Integer month) {
		return courseMapper.getDayCounts(userId,year,month);
	}
	
	public List<Course> getMonthCounts(Integer userId, Integer year) {
		return courseMapper.getMonthCounts(userId,year);
	}
	
	public ArrayList<Course> getAll(Integer userId,Integer year,Integer month){
		return courseMapper.getAll(userId,year,month);
	}
	
	public ArrayList<Course> find(Integer userId,Integer syear,Integer smonth,Integer sday,Integer eyear,Integer emonth,Integer eday) throws IOException{
		if(syear.intValue() != eyear.intValue()){
			System.out.println(syear);
			System.out.println(eyear);
			System.out.println("我进来跨年了");
			return courseMapper.findyear(userId, syear, smonth, sday, eyear, emonth, eday);
		}
		else if(smonth.intValue() != emonth.intValue()){
			System.out.println("我进来跨月了");
			return courseMapper.findmonth(userId, syear, smonth, sday, eyear, emonth, eday);
		}else{
			System.out.println("我在同年同月，不用跨");
			return courseMapper.findday(userId,syear,smonth,sday,eyear,emonth,eday);
		}
	}
}
