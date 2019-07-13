package com.scnu.course.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.scnu.course.bean.DayCounts;
import com.scnu.course.bean.MonthCounts;
import com.mysql.jdbc.PreparedStatement.ParseInfo;
import com.scnu.course.bean.Course;
import com.scnu.course.bean.CourseIn;
import com.scnu.course.bean.CourseInfo;
import com.scnu.course.service.CourseService;

@Controller
@RequestMapping("/course")
public class CourseController {
	
	@Autowired
    private CourseService courseService;
	
	public static boolean isLeapYear(int year){  
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}  
	
	public static String dateToWeek(String datetime) {
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        String[] weekDays = { "周日", "周一", "周二", "周三", "周四", "周五", "周六" };
        Calendar cal = Calendar.getInstance(); // 获得一个日历
        Date datet = null;
        try {
            datet = f.parse(datetime);
            cal.setTime(datet);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1; // 指示一个星期中的某天。
        if (w < 0)
            w = 0;
        return weekDays[w];
    }
	
	
	 	@RequestMapping("/main")  //处理main请求
	    @ResponseBody
	    //添加ResponseBody 注解才能把course对象返回到网页上，通常用来返回JSON数据或者是XML数据
	    public ArrayList<CourseInfo> find(HttpServletRequest request, HttpServletResponse response,
	    		@Param("sYear")Integer sYear,@Param("sMonth")Integer sMonth,@Param("sDate")Integer sDate,
	    		@Param("eYear")Integer eYear,@Param("eMonth")Integer eMonth,@Param("eDate")Integer eDate) throws IOException
	    {
	 		
	 		Integer userId = (Integer)request.getSession().getAttribute("userId");
	    	System.out.println("我进来main了");
//	    	response.addHeader("Access-Control-Allow-Origin", "*");
			
//			System.out.println("userId = " + course.getUserId());
//			System.out.println("year = "+course.getYear());
			
	    	System.out.println("userId = " + userId);
			System.out.println("sYear = "+sYear);
			System.out.println("sMonth = "+sMonth);
			System.out.println("sDate = "+sDate);
			System.out.println("eYear = "+eYear);
			System.out.println("eMonth = "+eMonth);
			System.out.println("eDate = "+eDate);
	    	
	    	ArrayList<Course> list=courseService.find(userId,sYear,sMonth,sDate,eYear,eMonth,eDate);
	    	
//	    	List<CourseInfo> list2=new ArrayList<CourseInfo>();
	    	
	    	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
	    	
	    	for(int i = 0;i<list.size();i++){
	    		if(list.get(i).getStatus().equals("1")){
	    			list.get(i).setStatus("已完成");
	    		}else if(list.get(i).getStatus().equals("0")){
	    			list.get(i).setStatus("未上课");
	    		}
	    		list.get(i).setS_time(sdf.format(list.get(i).getStarttime()));
	    		list.get(i).setE_time(sdf.format(list.get(i).getEndtime()));
	    	}
	    	
	    	ArrayList<CourseInfo> listinfo = new ArrayList<CourseInfo>();
	    	
	    	for(int i = 0;i<list.size();i++){
	    		
	    		System.out.println("gradeName:"+list.get(i).getGradeName());
	    		
	    		CourseInfo courseinfo = new CourseInfo();
	    		courseinfo.setDate(list.get(i).getDate());
	    		courseinfo.setStime(list.get(i).getS_time());
	    		courseinfo.setEtime(list.get(i).getE_time());
	    		courseinfo.setStudent(list.get(i).getStudent());
	    		courseinfo.setSubject(list.get(i).getSubject());
	    		courseinfo.setGrade(list.get(i).getGradeId());
	    		courseinfo.setHour(list.get(i).getResidCourse());
	    		courseinfo.setIsMadePlan(list.get(i).getIsMadePlan());
	    		courseinfo.setCorrected(list.get(i).isCorrected());
	    		courseinfo.setSentFeebBack(list.get(i).isSentfeedback());
	    		courseinfo.setGrade_Name(list.get(i).getGradeName());
	    		
	    		String datetime = list.get(i).getYear()+"-"+list.get(i).getMonth()+"-"+list.get(i).getDate();
	    		
	    		courseinfo.setWeek(dateToWeek(datetime));
	    		
	    		listinfo.add(courseinfo);
	    	}
	    	
//	    	Collections.sort(listinfo);
	    	
	    	System.out.println("我要离开main了");
	    	return listinfo;
	    }
    
    @RequestMapping("/day_counts")
    @ResponseBody
    public List getDayCounts(HttpServletRequest request, HttpServletResponse response, @Param("course") Course course) throws IOException{
    	System.out.println("我进来获取每日课消的地方了");
//    	response.addHeader("Access-Control-Allow-Origin", "*");
    	
//    	DayCounts counts = new DayCounts();

    	Integer userId = (Integer)request.getSession().getAttribute("userId");
    	
    	System.out.println("userId = " + course.getUserId());
    	System.out.println("year = " + course.getYear());
    	System.out.println("month = " + course.getMonth());
    	
    	int counts_day = 0;
    	
    	int totalDay = 0;
    	
    	if (course.getMonth() == 2) {  
            totalDay = isLeapYear(course.getYear()) ? 29 : 28; 
        }else{ 
    		totalDay = (int) (Math.ceil(Math.abs(course.getMonth() - 7.5)) % 2 + 30);  
        }
    	
    	
    	List<Course> list = courseService.getDayCounts(userId,course.getYear(),course.getMonth());
    	System.out.println("size = "+list.size());
//    	System.out.println(list.get(0).getUserId());
    	
    	List<DayCounts> list2 = new ArrayList<DayCounts>();
    	
    	List<DayCounts> list3 = new ArrayList<DayCounts>();
    	for(int i = 0;i<list.size();i++){
    		DayCounts counts = new DayCounts();
    		for(int j = 0;j<list.size();j++){
//        		System.out.println(list.get(i).getUserId());
//        		counts.setUserId(list.get(i).getUserId());
//        		counts.setYear(list.get(i).getYear());
//        		counts.setMonth(list.get(i).getMonth());
        		counts.setDay(list.get(i).getDate());
        		if(list.get(i).getDate() == list.get(j).getDate()){
        			counts_day = counts_day+list.get(i).getCourseTime();
        		}
        		
        	}
    		counts.setCounts_day(counts_day);
    		list2.add(counts);
    		counts_day = 0;
    		System.out.println(list.get(i).getDate());
    	}
    	System.out.println("list2.size :"+list2.size());
    	for(int i = 0;i<list2.size();i++ ){
    		for(int j = list2.size()-1;j>i;j-- ) {
    			if (list2.get(j).getDay()==list2.get(i).getDay()) {
    				list2.remove(j);
    			}
    		}
    		System.out.println(list2.get(i).getDay());
    	}
    	
    	for(int i = 1;i<=totalDay;i++){
    		DayCounts daycounts = new DayCounts(i,0);
    		list3.add(daycounts);
    	}
    	
    	for(int i = 0; i<list2.size(); i++){
    		list3.get(list2.get(i).getDay()-1).setCounts_day(list2.get(i).getCounts_day());
    	}
    	
//    	for(int i =0; i<list3.size(); i++){
//    		System.out.println(list3.get(i).getDay()+"  "+list3.get(i).getCounts_day());
//    	}
    	
    	System.out.println("我出来了");
    	return list3;
    }
    
    @RequestMapping("/month_counts")
    @ResponseBody
    public List getMonthCounts(HttpServletRequest request, HttpServletResponse response, @Param("course") Course course) throws IOException{
    	System.out.println("我进来获取每月课消的地方了");
//    	response.addHeader("Access-Control-Allow-Origin", "*");
    	
//    	MonthCounts counts = new MonthCounts();
    	
    	int counts_month = 0;
    	
    	Integer userId = (Integer)request.getSession().getAttribute("userId");
    	
    	System.out.println("userId = " + course.getUserId());
    	System.out.println("year = " + course.getYear());
    	
    	List<Course> list = courseService.getMonthCounts(userId,course.getYear());
//    	System.out.println(list.size());
    	
    	List<MonthCounts> list2 = new ArrayList<MonthCounts>();
    	List<MonthCounts> list3 = new ArrayList<MonthCounts>();
    	
    	for(int i = 0;i < list.size();i++){
    		MonthCounts counts = new MonthCounts();
    		for(int j = 0;j < list.size();j++){
//        		System.out.println(list.get(i).getUserId());
//        		counts.setUserId(list.get(i).getUserId());
//        		counts.setYear(list.get(i).getYear());
        		counts.setMonth(list.get(i).getMonth());
        		if(list.get(i).getMonth() == list.get(j).getMonth()){
        			counts_month = counts_month+list.get(i).getCourseTime();
        		}
        	}
    		counts.setCounts_month(counts_month);
    		list2.add(counts);
    		counts_month = 0;
    	}

    	for(int i = 0 ; i < list2.size() ; i ++ ){
    		for(int j = list2.size() - 1 ; j > i; j -- ) {
    			if (list2.get(j).getMonth()==list2.get(i).getMonth()) {
    				list2.remove(j);
    			}
    		}
    		System.out.println(list2.get(i).getMonth());
    	}
    	
    	for(int i = 1;i<=12;i++){
    		MonthCounts monthcounts = new MonthCounts(i,0);
    		list3.add(monthcounts);
    	}
    	
    	for(int i = 0; i<list2.size(); i++){
    		list3.get(list2.get(i).getMonth()-1).setCounts_month(list2.get(i).getCounts_month());
    	}
    	
    	for(int i =0; i<list3.size(); i++){
    		System.out.println(list3.get(i).getMonth()+"  "+list3.get(i).getCounts_month());
    	}
    	
    	return list3;
    }
    
    @RequestMapping("/init")
    @ResponseBody
    public List GetInit(HttpServletRequest request, HttpServletResponse response, @Param("course") Course course) throws IOException{
    	
    	Integer userId = (Integer)request.getSession().getAttribute("userId");
		
    	ArrayList<Course> list=courseService.getAll(userId,course.getYear(),course.getMonth());
    	
    	int counts_day = 0;
    	
    	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
    	
    	for(int i = 0;i<list.size();i++){
    		if(list.get(i).getStatus().equals("1")){
    			list.get(i).setStatus("已完成");
    		}else if(list.get(i).getStatus().equals("0")){
    			list.get(i).setStatus("未上课");
    		}
    		list.get(i).setS_time(sdf.format(list.get(i).getStarttime()));
    		list.get(i).setE_time(sdf.format(list.get(i).getEndtime()));
    	}
    	
    	for(int i = 0;i < list.size();i++){
    		for(int j = 0;j < list.size();j++){
        		if(list.get(i).getDate() == list.get(j).getDate()){
        			counts_day = counts_day+list.get(i).getCourseTime();
        		}
        	}
    		list.get(i).setCounts_day(counts_day);
    		counts_day = 0;
    	}
    	
    	return list;
    }
    
 	@RequestMapping("/courseIn")  //处理main请求
    @ResponseBody
    //添加ResponseBody 注解才能把course对象返回到网页上，通常用来返回JSON数据或者是XML数据
    public ArrayList<CourseIn> get(HttpServletRequest request, HttpServletResponse response,
    		@Param("sYear")Integer sYear,@Param("sMonth")Integer sMonth,@Param("sDate")Integer sDate,
    		@Param("eYear")Integer eYear,@Param("eMonth")Integer eMonth,@Param("eDate")Integer eDate) throws IOException
    {
 		
 		Integer userId = (Integer)request.getSession().getAttribute("userId");
    	System.out.println("我进来courseIn了");
//    	response.addHeader("Access-Control-Allow-Origin", "*");
		
//		System.out.println("userId = " + course.getUserId());
//		System.out.println("year = "+course.getYear());
		
    	System.out.println("userId = " + userId);
		System.out.println("sYear = "+sYear);
		System.out.println("sMonth = "+sMonth);
		System.out.println("sDate = "+sDate);
		System.out.println("eYear = "+eYear);
		System.out.println("eMonth = "+eMonth);
		System.out.println("eDate = "+eDate);
    	
    	ArrayList<Course> list=courseService.find(userId,sYear,sMonth,sDate,eYear,eMonth,eDate);
    	
//    	List<CourseInfo> list2=new ArrayList<CourseInfo>();
    	
    	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
    	
    	SimpleDateFormat sd = new SimpleDateFormat("HH");
    	
    	for(int i = 0;i<list.size();i++){
    		if(list.get(i).getStatus().equals("1")){
    			list.get(i).setStatus("已完成");
    		}else if(list.get(i).getStatus().equals("0")){
    			list.get(i).setStatus("未上课");
    		}
    		list.get(i).setS_time(sdf.format(list.get(i).getStarttime()));
    		list.get(i).setE_time(sdf.format(list.get(i).getEndtime()));
 
    		
    		list.get(i).setStime(Integer.parseInt(sd.format(list.get(i).getStarttime())));
    		list.get(i).setEtime(Integer.parseInt(sd.format(list.get(i).getEndtime())));
    	}
    	
    	ArrayList<CourseIn> listinfo = new ArrayList<CourseIn>();
    	
    	for(int i = 0;i<list.size();i++){
    		CourseIn courseIn = new CourseIn();
    		courseIn.setDate(list.get(i).getDate());
    		courseIn.setStartTime(list.get(i).getS_time());
    		courseIn.setEndTime(list.get(i).getE_time());
    		courseIn.setStudent(list.get(i).getStudent());
    		courseIn.setSubject(list.get(i).getSubject());
    		courseIn.setGrade(list.get(i).getGradeId());
    		courseIn.setResidCourse(list.get(i).getResidCourse());
    		courseIn.setIsMadePlan(list.get(i).getIsMadePlan());
    		courseIn.setStatus(list.get(i).getStatus());
    		courseIn.setCourseTopic(list.get(i).getCourseTopic());
    		courseIn.setStime(list.get(i).getStime());
    		courseIn.setEtime(list.get(i).getEtime());
    		courseIn.setGradeName(list.get(i).getGradeName());
    		listinfo.add(courseIn);
    	}
    	
//    	Collections.sort(listinfo);
    	
    	System.out.println("我要离开courseIn了");
    	return listinfo;
    }
    
}

