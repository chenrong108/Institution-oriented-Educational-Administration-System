package com.scnu.teach.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.scnu.ppt.bean.Highmathrja1info;
import com.scnu.ppt.bean.Highmathrja1infoExample;
import com.scnu.ppt.bean.Highmathrja1infoExample.Criteria;
import com.scnu.ppt.bean.KnowledgeProblemSize;
import com.scnu.question.mapper.Highmathrja1infoMapper;
import com.scnu.question.mapper.KonwledgeLevelMapper;
import com.scnu.question.mapper.QuestionAssembleMapper;

@Service
public class KnowledgeService {
	
	@Autowired
	Highmathrja1infoMapper highmathrja1infoMapper;
	
	@Autowired
	KonwledgeLevelMapper konwledgeLevelMapper;
	
	@Autowired
	QuestionAssembleMapper questionAssembleMapper;
	
	
	// 得到id对应的level
	public Highmathrja1info getLevel(Integer knowledgeId) {
		System.out.println("getLevel knowledgeId = " + knowledgeId);
		Highmathrja1infoExample example = new Highmathrja1infoExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(knowledgeId);
		List<Highmathrja1info> list = highmathrja1infoMapper.selectByExample(example);
		if(list.size() != 0) {
		Highmathrja1info highmathrja1info = list.get(0);
		return highmathrja1info;
		}
		
		// 没有找到
		return null;
	}
	
	// 得到level4的知识点列表
	public List<Integer> getLevel4List(Highmathrja1info highmathrja1info){
		
		Integer level = highmathrja1info.getLevel();
		Integer knowledgeId = highmathrja1info.getId();
		System.out.println("level = " + level);
		System.out.println("knowledgeId = " + knowledgeId);
		List<Integer> list = konwledgeLevelMapper.selectLevel4(level, knowledgeId);
		
		//System.out.println(list);
		
		return list;
	}
	
	// 获取题目id
	public List<Integer> getQuestionIdList(List<Integer> level4List, Integer difficultyInfo, Integer questionTypeId){
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(Integer knowledgeId : level4List) {
			
			String knowledgeIdLike = "%" + knowledgeId + "%";
			List<Integer> questionList = questionAssembleMapper.getQuestionId(knowledgeIdLike, difficultyInfo, questionTypeId);
			
			for(Integer questionId : questionList) {  // 去重
				set.add(questionId);
			}
			
		}
		
		List<Integer> list = new ArrayList<Integer>();
		for(Integer id : set) {
			list.add(id);
		}
		
		return list;
		
	}
	
	// 查询所有知识点的问题id交集
	public List<Integer> getFinalQuestionId(List<Integer> knowledgeIds, Integer difficultyInfo, Integer questionTypeId){
		// 存储所有的知识点id列表
		List<List<Integer>> questionIdLists = new ArrayList<List<Integer>>();
		for(Integer knowledgeId : knowledgeIds) {
			System.out.println("getFinalQuestionId knowledgeId = " + knowledgeId);
			Highmathrja1info highmathrja1info = getLevel(knowledgeId);
			if(highmathrja1info != null){
			List<Integer> level4List = getLevel4List(highmathrja1info);
			List<Integer> questionIdList = getQuestionIdList(level4List, difficultyInfo, questionTypeId);
			questionIdLists.add(questionIdList);
			}
		}
		
		// 求交集
		if(questionIdLists.size() == 0) {
			return null;
		}else if(questionIdLists.size() == 1) {
			return questionIdLists.get(0);
		}else {  // 交集
			
			List<Integer> questionIdList = questionIdLists.get(0);
			for(int i = 1; i < questionIdLists.size(); i++){
				questionIdList.retainAll(questionIdLists.get(i));
			}
			return questionIdList;
		}	
	}
	
	// solr搜索
	public List<List<Integer>> getSolrListId(List<Integer> knowledgeIds){
		// 存储所有的知识点id列表
		List<List<Integer>> questionIdLists = new ArrayList<List<Integer>>();
		for(Integer knowledgeId : knowledgeIds) {
			System.out.println("getFinalQuestionId knowledgeId = " + knowledgeId);
			Highmathrja1info highmathrja1info = getLevel(knowledgeId);
			if(highmathrja1info != null){
			List<Integer> level4List = getLevel4List(highmathrja1info);
			questionIdLists.add(level4List);
			}
		}
		return questionIdLists;
	}
	
	// 查询问题的
	public List<String> getQuestionsDetail(List<Integer> FinalQuestionIdList){
		
		List<String> questionsDetailList = questionAssembleMapper.getQuestionDetailList(FinalQuestionIdList);
		return questionsDetailList;
		
	}
	
	// 返回所有的问题 
	public List<String> getAllQuestionDetail(Integer difficultyInfo, Integer questionTypeId){
		
		List<String> questionsDetailList = questionAssembleMapper.getAllQuestionDetailList(difficultyInfo, questionTypeId);
		return questionsDetailList;
	}
	
	// 返回所有的问题的Id
	public List<Integer> getAllQuestionDetailId(Integer difficultyInfo, Integer questionTypeId){
			
			List<Integer> questionsDetailListId = questionAssembleMapper.getAllQuestionDetailListId(difficultyInfo, questionTypeId);
			return questionsDetailListId;
	}
	
	// 根据知识点Ids查询问题  并且进行分页
	public PageInfo getQuestions(List<Integer> knowledgeIds, Integer pn, Integer difficultyInfo, Integer questionTypeId){
		List<Object> getQuestions = new ArrayList<Object>();
		List<String> questionsDetail = new ArrayList<String>();
		List<Integer> finalQuestionId = new ArrayList<Integer>();
		
		if(knowledgeIds == null) {   // 查询全部
			
			// 默认10条数据一个分页
			PageHelper.startPage(pn, 10);
			questionsDetail =  getAllQuestionDetail(difficultyInfo, questionTypeId);
		}else {
			
			finalQuestionId = getFinalQuestionId(knowledgeIds, difficultyInfo, questionTypeId);
			//System.out.println("finalQuestionId " + finalQuestionId);
			System.out.println("finalQuestionId Size = " + finalQuestionId.size());
			if(finalQuestionId != null && finalQuestionId.size() != 0){
				
			// 默认10条数据一个分页
			PageHelper.startPage(pn, 10);
		    questionsDetail = getQuestionsDetail(finalQuestionId);
			}
		}
		
		// 不存在的情况
		if(questionsDetail == null || questionsDetail.size() == 0)
		return null;
		
		PageInfo pageInfo = new PageInfo(questionsDetail);
		
		// 字符转json
		if(questionsDetail != null)
		for(String detail : questionsDetail) {
		Object jsonObject = JSONObject.parse(detail);
		getQuestions.add(jsonObject);
		}
		
		pageInfo.setList(getQuestions);
		
		return pageInfo;
	}
	
	// 查询所有知识点id对应的问题数量
		public List<KnowledgeProblemSize> getProblemSize(List<Integer> knowledgeIds){
			// 存储所有的知识点id的问题数量
			System.out.println("我进入知识点问题数量查询");
			List<KnowledgeProblemSize> problemSizeLists = new ArrayList<KnowledgeProblemSize>();
			for(Integer knowledgeId : knowledgeIds) {
				System.out.println("getProblemSize knowledgeId = " + knowledgeId);
				Highmathrja1info highmathrja1info = getLevel(knowledgeId);
				if(highmathrja1info != null){
				List<Integer> level4List = getLevel4List(highmathrja1info);
				// 不按照难度、问题类型查找
				Integer difficultyInfo = null;
				Integer questionTypeId = null;
				List<Integer> questionIdList = getQuestionIdList(level4List, difficultyInfo, questionTypeId);
				Integer size;
				
				if(questionIdList == null) {
					size = 0;
				}else {
					size = questionIdList.size();
				}
				
				KnowledgeProblemSize knowledgeProblemSize = new KnowledgeProblemSize();
				knowledgeProblemSize.setKnowledgeId(knowledgeId);
				knowledgeProblemSize.setProblemSize(size);
				problemSizeLists.add(knowledgeProblemSize);
				}
			}
				
			return problemSizeLists;
		}
		
		// 得到初始化的首层节点
		public List<Integer> getInitKownlegeIds(){
			
			return konwledgeLevelMapper.getInitKownlegeIds();
			
		}
			
		// 得到初始的或者下一层的知识点列表
		public List<Integer> getNextLevelKownlegeIds(Integer knowledgeId){
			
			//得到知识点的对应的层数
			Highmathrja1info info = getLevel(knowledgeId);
			Integer level = info.getLevel();
			Integer nextLevel = level + 1;
			
			return konwledgeLevelMapper.getNextLevelKownlegeIds(level, knowledgeId, nextLevel);
		}
		
}
