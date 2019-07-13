package com.scnu.course.mapper;


import java.util.ArrayList;


import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.scnu.course.bean.Course;
import com.scnu.course.bean.CourseExample;

public interface CourseMapper {
	
	int countByExample(CourseExample example);

	int deleteByExample(CourseExample example);

	int deleteByPrimaryKey(Integer courseId);

	int insert(Course record);

	int insertSelective(Course record);
	
	List<Course> selectByExample(CourseExample example);

	Course selectByPrimaryKey(Integer courseId);

	int updateByExampleSelective(@Param("record") Course record, @Param("example") CourseExample example);

	int updateByExample(@Param("record") Course record, @Param("example") CourseExample example);

	int updateByPrimaryKeySelective(Course record);

	int updateByPrimaryKey(Course record);
	
	public ArrayList<Course> findAll(Integer courseId);

	public List<Course> getDayCounts(@Param("userId") Integer userId,@Param("year") Integer year,@Param("month") Integer month);
	
	public List<Course> getMonthCounts(@Param("userId") Integer userId,@Param("year") Integer year);
	
	public ArrayList<Course> getAll(@Param("userId") Integer userId,@Param("year") Integer year,@Param("month") Integer month);
	
	public ArrayList<Course> findyear(@Param("userId")Integer userId,
			@Param("syear")Integer syear,@Param("smonth")Integer smonth,@Param("sday")Integer sday,
			@Param("eyear")Integer eyear,@Param("emonth")Integer emonth,@Param("eday")Integer eday);
	
	public ArrayList<Course> findmonth(@Param("userId")Integer userId,
			@Param("syear")Integer syear,@Param("smonth")Integer smonth,@Param("sday")Integer sday,
			@Param("eyear")Integer eyear,@Param("emonth")Integer emonth,@Param("eday")Integer eday);
	
	public ArrayList<Course> findday(@Param("userId")Integer userId,
			@Param("syear")Integer syear,@Param("smonth")Integer smonth,@Param("sday")Integer sday,
			@Param("eyear")Integer eyear,@Param("emonth")Integer emonth,@Param("eday")Integer eday);
	
	
}