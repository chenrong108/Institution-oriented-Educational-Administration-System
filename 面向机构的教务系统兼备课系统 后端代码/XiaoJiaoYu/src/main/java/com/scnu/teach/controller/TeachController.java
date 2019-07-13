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
		
		
		// ��ȡ���������
		if(json != null) {
		Note note = JsonUtils.jsonToPojo(json, Note.class);
			
		TeachMessage teachMessage = teachService.getCacheTeachMessage(note, userId);  // �鵽��������ݣ�ֱ�ӷ���
		
		return ScnuResult.buildSuccess(teachMessage);
			
		}
		
		// û�л�����߼�
		TeachMessage teachMessage = teachService.getInitTeachMessage(userId);
		ScnuResult result = ScnuResult.buildSuccess(teachMessage);
		
		return result;
	}
	
	
	@RequestMapping("/getRealTeachMessage")
	@ResponseBody
	public ScnuResult getRealTeachMessage(Note note, HttpServletResponse response, HttpServletRequest request){
		
		
		/**
		 * Integer sectionId, Integer subjectId, Integer businessId, 
			    @RequestParam(required=false, defaultValue="0") Integer publishVersionId,@RequestParam(value = "gradeId", required=false, defaultValue="0") Integer gradeId,  // ����Ϊ��ȡ����������Ĳ���
			    Integer yearId, Integer corporationId, Integer productLineId, Integer seasonId,
			    Integer bookVersionId, Integer textBookId, Integer materialTypeId, Integer classTypeId,
			    Integer adaptiveAreaId, Integer reviewProgressId
		 */
		
		/*
		 * ����Ϊ���еĲ���
		 * Integer sectionId, Integer subjectId, Integer businessId, 
	       Integer publishVersionId, Integer gradeId,  // ����Ϊ��ȡ����������Ĳ���
	       Integer yearId, Integer corporationId, Integer productLineId, Integer seasonId,
	       Integer bookVersionId, Integer textBookId, Integer materialId, Integer classTypeId,
	       Integer adaptiveAreaId, Integer reviewProgressId
	       */
		
		Integer userId = (Integer)request.getSession().getAttribute("userId");
		
		// ��ȡ����¼�����Ҫ������
		TeachMessage teachMessage = teachService.getRealTeachMessage(userId, note.getSectionId(), note.getSubjectId(), note.getPublishVersionId(), note.getGradeId(), note.getBookVersionId());
		
		ScnuResult result = ScnuResult.buildSuccess(teachMessage);
		
		System.out.println(note);
		
		String json = JsonUtils.objectToJson(note);
//		
//		// �û�userId���������ݴ��ȥ����
		jedisClientSingle.set(userId+"", json);
		// ������Чʱ���� 1��Сʱ
		//jedisClientSingle.expire(userId+"", expired);
		
		return result;
		
	}
	
	@RequestMapping("/getCacheTeachMessage")
	@ResponseBody
	public ScnuResult getSelectTeachMessage(HttpServletResponse response, HttpServletRequest request){
		
		Integer userId = (Integer)request.getSession().getAttribute("userId");
		String json = jedisClientSingle.get(userId+"");
		
		// �л���
		if(json != null) {
			System.out.println("�ж��л���");
		Note note = JsonUtils.jsonToPojo(json, Note.class);
		System.out.println(note);
		
		// �ѻ�����Ϣ�ó����Ž�ȥ javabean
		Cache cache = teachService.progressNote(note);
		
		return ScnuResult.buildSuccess(cache);	
		
		}
		
		//û�л���	
		return ScnuResult.buildSuccess(null);
		
	}
	
	@RequestMapping(value = "/getTestTeachMessage", produces=MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8")
	@ResponseBody
	public ScnuResult getTestTeachMessage(HttpServletResponse response, HttpServletRequest request){
		
		String json = "{\"username\":\"chenrong\"}";
		System.out.println(json);
		JSONObject jsonObject = JSONObject.parseObject(json);
		ScnuResult result = ScnuResult.buildSuccess(jsonObject);
		//û�л���	
		return result;
		
	}
	
}
