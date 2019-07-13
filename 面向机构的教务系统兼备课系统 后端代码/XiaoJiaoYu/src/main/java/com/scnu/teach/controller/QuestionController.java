package com.scnu.teach.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.scnu.bean.ScnuResult;
import com.scnu.ppt.bean.KnowledgeProblemSize;
import com.scnu.teach.service.KnowledgeService;

@Controller
@RequestMapping("/tea_api/question")
public class QuestionController {
	
	@Autowired
	private KnowledgeService knowledgeService;
	
	@RequestMapping("/getQuestionDetail")
	@ResponseBody
	public ScnuResult getQuestionDetail(@RequestBody(required=false) String knowledgeIdList) {
		
		System.out.println("knowledgeIdList = " + knowledgeIdList);
		JSONObject json = JSONObject.parseObject(knowledgeIdList);
		Integer sectionId = (Integer)json.get("sectionId");
		Integer subjectId = (Integer)json.get("subjectId");
		Integer publishVersionId = (Integer)json.get("publishVersionId");
		Integer bookVersionId = (Integer)json.get("bookVersionId");
		Integer pn = (Integer)json.get("pn");
		Integer difficultyInfo = (Integer)json.get("difficultyInfo");
		Integer questionTypeId = (Integer)json.get("questionTypeId");
		JSONArray list = (JSONArray)json.get("knowledgeIds");
		System.out.println("JSONArray" + list);
		List<Integer> knowledgeIds = new ArrayList<Integer>();
		
		// 给knowledgeIds赋值
		if(list == null || list.size() == 0) {
			knowledgeIds = null;
		}else {
			for(Object i : list) {
				knowledgeIds.add((Integer)i);
			}
		}
		
		if(pn == null) {
			pn = 1;
		}
		
		System.out.println("pn = " + pn);
		System.out.println("sectionId = " + sectionId + " subjectId = " + subjectId + " publishVerisonId = " + publishVersionId + " bookVersionId = " + bookVersionId);
		
		if(sectionId==null || subjectId==null || publishVersionId==null || bookVersionId == null) {
			return ScnuResult.buildSuccess(null);
		}
		
		// 最先判断是否是一本书 高中数学必修1
		if(sectionId.intValue() ==17 && subjectId.intValue()==20 && publishVersionId.intValue()==17 && bookVersionId.intValue() == 424) {
		// 前端发json过来
		// 默认为空
		System.out.println("knowledgeIds " + knowledgeIds);
		
		PageInfo pageInfo = knowledgeService.getQuestions(knowledgeIds, pn, difficultyInfo, questionTypeId);
		
		return ScnuResult.buildSuccess(pageInfo);
		}
		
		// 不是指定的书本
		return ScnuResult.buildSuccess(null);
		
	}
	
	@RequestMapping("/getProblemSize")
	@ResponseBody
	public ScnuResult getPromblemSize(Integer sectionId, Integer subjectId, Integer publishVersionId, Integer  bookVersionId, Integer knowledgeId){
	
        System.out.println("sectionId = " + sectionId + " subjectId = " + subjectId + " publishVerisonId = " + publishVersionId + " bookVersionId = " + bookVersionId);
		if(sectionId==null || subjectId==null || publishVersionId==null || bookVersionId == null) {
			return ScnuResult.buildSuccess(null);
		}
		
		// 最先判断是否是一本书 高中数学必修1
		if(sectionId.intValue() ==17 && subjectId.intValue()==20 && publishVersionId.intValue()==17 && bookVersionId.intValue() == 424) {
			
			List<Integer> knowledgeIds = new ArrayList<Integer>();
			if(knowledgeId == null) {
				knowledgeIds = knowledgeService.getInitKownlegeIds();
			}else {
				knowledgeIds = knowledgeService.getNextLevelKownlegeIds(knowledgeId);
			}
			
			// 查找知识点的问题数量
			List<KnowledgeProblemSize> problemSizelist = knowledgeService.getProblemSize(knowledgeIds);
	        return ScnuResult.buildSuccess(problemSizelist);
		
		}
		
		return ScnuResult.buildSuccess(null);
	}
	
}
