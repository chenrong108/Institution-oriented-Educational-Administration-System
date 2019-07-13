package com.scnu.teach.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.scnu.bean.ScnuResult;
import com.scnu.bean.SelectMessage;
import com.scnu.bean.Subject;
import com.scnu.ppt.bean.Constant;
import com.scnu.teach.service.QuestionService;
import com.scnu.teach.service.SelectService;
import com.scnu.util.JsonUtils;

@Controller
@RequestMapping("/tea_api/select")
public class SelectController {
	
	@Autowired
	private SelectService selectService;
	
	@Autowired
	private QuestionService questionService;
	
	@RequestMapping(value = "/getSelectionList")
	@ResponseBody
	public ScnuResult getSelectionList(Integer sectionId, Integer subjectId, Integer publishVersionId, Integer bookVersionId,  HttpServletResponse response){
		
		System.out.println("我进来getList");
		
		// 1 表示不用返回treeJson
		ScnuResult result = selectService.getSelectionList(sectionId, subjectId, publishVersionId, bookVersionId, 1);
		
		return result;
	}
	
	@RequestMapping(value = "/init")
	@ResponseBody
	public ScnuResult getInitSelectionList(HttpServletRequest request, HttpServletResponse response){
		
		System.out.println("我进来初始化了");
		
		ScnuResult result;
		
		System.out.println("sessionId = " + request.getSession().getId());
		
		if(request.getSession().getAttribute("sectionId") != null) {
			
		   HttpSession session = request.getSession();
		   System.out.println("getInitSelectionList  sectionId = " +  (Integer)session.getAttribute("sectionId"));
		   result = selectService.getSelectionList((Integer)session.getAttribute("sectionId"), (Integer)session.getAttribute("subjectId"), 
				   (Integer)session.getAttribute("publishVersionId"), (Integer)session.getAttribute("bookVersionId"), 0);
		}
		else
		// 默认高中，都是第一个
		   result = selectService.getSelectionList(-1, -1, -1, -1, 0);
		
		return result;
	}
	
	@RequestMapping(value = "/save", produces=MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8")
	@ResponseBody
	public String saveSectionList(Integer sectionId, Integer subjectId, Integer publishVersionId, Integer bookVersionId, HttpServletRequest request, HttpServletResponse response, String callback){
		
		System.out.println("我进来保存列表了");
		
		HttpSession session = request.getSession();
		
		System.out.println("callback = " + callback);
		
		session.setAttribute("sectionId", sectionId);
		session.setAttribute("subjectId", subjectId);
		session.setAttribute("publishVersionId", publishVersionId);
		session.setAttribute("bookVersionId", bookVersionId);
		
		System.out.println("saveSessionId = " + request.getSession().getId());
		System.out.println("sectionId = " + sectionId);
		System.out.println("subjectId = " + subjectId);
		System.out.println("publishVersionId = " + publishVersionId);
		System.out.println("bookVersionId = " + bookVersionId);
		// 返回cookie
		Cookie cookie = new Cookie("JSESSIONID", session.getId());
		    cookie.setDomain(Constant.DEMAIN);
		    cookie.setPath("/");
		    // cookie有效时间为1800s
		    cookie.setMaxAge(1800);
	    response.addCookie(cookie);

	    
	    // 返回树的treeJson   调用 line = 0的服务
	    String treeJson = selectService.getTreeJson(sectionId, subjectId, publishVersionId, bookVersionId);
	    JSONObject jsonObject = JSONObject.parseObject(treeJson);
	    SelectMessage selectMessage = new SelectMessage();
	    if(jsonObject != null)
	    selectMessage.setTreeJson(jsonObject);
	    
	    // 保存时额外给变动题型信息
	    System.out.println("题型信息填充成功 保存");
	    selectMessage.setQuestionMessage(questionService.getPartMessage(sectionId, subjectId));
	    
	    
		// 保存成功
		ScnuResult result = ScnuResult.buildSuccess(selectMessage);
		
		String json = JsonUtils.objectToJson(result);
		
		return callback + "(" + json + ");";
		
	}
	
	@RequestMapping(value = "/test", produces=MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8")
	@ResponseBody
	public String testCookie(String callback, HttpServletRequest request, HttpServletResponse response){
		
		System.out.println("我进来测试列表了");
		
		System.out.println("callback = " + callback);
		
		HttpSession session = request.getSession();
		
		Cookie cookie = new Cookie("JSESSIONID", session.getId());
		// 设置域为ip
	    cookie.setDomain(Constant.DEMAIN);
	    cookie.setPath("/");
	    cookie.setMaxAge(1800);
	    response.addCookie(cookie);
		
		Gson gson = new Gson();
		Subject subject = new Subject();
		subject.setSubjectId(1);
		subject.setSubjectName("chenrong");
		System.out.println(gson.toJson(subject));
		String j = callback + "(" + gson.toJson(subject) + ");";
		System.out.println(j);
		return j;		
	}	

}
