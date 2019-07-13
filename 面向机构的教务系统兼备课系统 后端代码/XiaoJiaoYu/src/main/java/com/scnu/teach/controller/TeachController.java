package com.scnu.teach.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.scnu.bean.Cache;
import com.scnu.bean.Note;
import com.scnu.bean.ScnuResult;
import com.scnu.bean.Section;
import com.scnu.bean.Subject;
import com.scnu.bean.TeachMessage;
import com.scnu.service.JedisClientSingle;
import com.scnu.teach.service.TeachService;
import com.scnu.util.JsonUtils;

@Controller
@RequestMapping("/teach")
public class TeachController {

	@Autowired
	private TeachService teachService;
	
	@Autowired
	private JedisClientSingle jedisClientSingle;
	
	//private final Integer expired = 3600; 
	
	@RequestMapping("/getSectionList")
	@ResponseBody
	public List<Section> getSectionList(Integer userId, HttpServletResponse response, HttpServletRequest request){
		
		List<Section> list = teachService.getSectionList(userId);
		for(Section section : list) {
			System.out.println(section.getSectionName());
			for(Subject subject : section.getChildren()) {
				System.out.println(subject.getSubjectName());
			}
		}
		
		return list;
	}
	
	@RequestMapping("/getInitTeachMessage")
	@ResponseBody
	public ScnuResult getInitTeachMessage(HttpServletResponse response, HttpServletRequest request){
		
		
		Integer userId = (Integer)request.getSession().getAttribute("userId");
		
		String json = jedisClientSingle.get(userId+"");
		
		
		// 获取缓存的内容
		if(json != null) {
		Note note = JsonUtils.jsonToPojo(json, Note.class);
			
		TeachMessage teachMessage = teachService.getCacheTeachMessage(note, userId);  // 查到缓存的数据，直接返回
		
		return ScnuResult.buildSuccess(teachMessage);
			
		}
		
		// 没有缓存的逻辑
		TeachMessage teachMessage = teachService.getInitTeachMessage(userId);
		ScnuResult result = ScnuResult.buildSuccess(teachMessage);
		
		return result;
	}
	
	
	@RequestMapping("/getRealTeachMessage")
	@ResponseBody
	public ScnuResult getRealTeachMessage(Note note, HttpServletResponse response, HttpServletRequest request){
		
		
		/**
		 * Integer sectionId, Integer subjectId, Integer businessId, 
			    @RequestParam(required=false, defaultValue="0") Integer publishVersionId,@RequestParam(value = "gradeId", required=false, defaultValue="0") Integer gradeId,  // 以上为获取数据所必须的参数
			    Integer yearId, Integer corporationId, Integer productLineId, Integer seasonId,
			    Integer bookVersionId, Integer textBookId, Integer materialTypeId, Integer classTypeId,
			    Integer adaptiveAreaId, Integer reviewProgressId
		 */
		
		/*
		 * 以下为所有的参数
		 * Integer sectionId, Integer subjectId, Integer businessId, 
	       Integer publishVersionId, Integer gradeId,  // 以上为获取数据所必须的参数
	       Integer yearId, Integer corporationId, Integer productLineId, Integer seasonId,
	       Integer bookVersionId, Integer textBookId, Integer materialId, Integer classTypeId,
	       Integer adaptiveAreaId, Integer reviewProgressId
	       */
		
		Integer userId = (Integer)request.getSession().getAttribute("userId");
		
		// 获取点击事件所需要的数据
		TeachMessage teachMessage = teachService.getRealTeachMessage(userId, note.getSectionId(), note.getSubjectId(), note.getPublishVersionId(), note.getGradeId(), note.getBookVersionId());
		
		ScnuResult result = ScnuResult.buildSuccess(teachMessage);
		
		System.out.println(note);
		
		String json = JsonUtils.objectToJson(note);
//		
//		// 用户userId绑定最后的数据存进去缓存
		jedisClientSingle.set(userId+"", json);
		// 设置有效时间是 1个小时
		//jedisClientSingle.expire(userId+"", expired);
		
		return result;
		
	}
	
	@RequestMapping("/getCacheTeachMessage")
	@ResponseBody
	public ScnuResult getSelectTeachMessage(HttpServletResponse response, HttpServletRequest request){
		
		Integer userId = (Integer)request.getSession().getAttribute("userId");
		String json = jedisClientSingle.get(userId+"");
		
		// 有缓存
		if(json != null) {
			System.out.println("判断有缓存");
		Note note = JsonUtils.jsonToPojo(json, Note.class);
		System.out.println(note);
		
		// 把缓存信息拿出来放进去 javabean
		Cache cache = teachService.progressNote(note);
		
		return ScnuResult.buildSuccess(cache);	
		
		}
		
		//没有缓存	
		return ScnuResult.buildSuccess(null);
		
	}
	
	@RequestMapping(value = "/getTestTeachMessage", produces=MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8")
	@ResponseBody
	public ScnuResult getTestTeachMessage(HttpServletResponse response, HttpServletRequest request){
		
		String json = "{\"username\":\"chenrong\"}";
		System.out.println(json);
		JSONObject jsonObject = JSONObject.parseObject(json);
		ScnuResult result = ScnuResult.buildSuccess(jsonObject);
		//没有缓存	
		return result;
		
	}
	
}
