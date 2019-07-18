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
	
	
	// �õ�id��Ӧ��level
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
		
		// û���ҵ�
		return null;
	}
	
	// �õ�level4��֪ʶ���б�
	public List<Integer> getLevel4List(Highmathrja1info highmathrja1info){
		
		Integer level = highmathrja1info.getLevel();
		Integer knowledgeId = highmathrja1info.getId();
		System.out.println("level = " + level);
		System.out.println("knowledgeId = " + knowledgeId);
		List<Integer> list = konwledgeLevelMapper.selectLevel4(level, knowledgeId);
		
		//System.out.println(list);
		
		return list;
	}
	
	// ��ȡ��Ŀid
	public List<Integer> getQuestionIdList(List<Integer> level4List, Integer difficultyInfo, Integer questionTypeId){
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(Integer knowledgeId : level4List) {
			
			String knowledgeIdLike = "%" + knowledgeId + "%";
			List<Integer> questionList = questionAssembleMapper.getQuestionId(knowledgeIdLike, difficultyInfo, questionTypeId);
			
			for(Integer questionId : questionList) {  // ȥ��
				set.add(questionId);
			}
			
		}
		
		List<Integer> list = new ArrayList<Integer>();
		for(Integer id : set) {
			list.add(id);
		}
		
		return list;
		
	}
	
	// ��ѯ����֪ʶ�������id����
	public List<Integer> getFinalQuestionId(List<Integer> knowledgeIds, Integer difficultyInfo, Integer questionTypeId){
		// �洢���е�֪ʶ��id�б�
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
		
		// �󽻼�
		if(questionIdLists.size() == 0) {
			return null;
		}else if(questionIdLists.size() == 1) {
			return questionIdLists.get(0);
		}else {  // ����
			
			List<Integer> questionIdList = questionIdLists.get(0);
			for(int i = 1; i < questionIdLists.size(); i++){
				questionIdList.retainAll(questionIdLists.get(i));
			}
			return questionIdList;
		}	
	}
	
	// solr����
	public List<List<Integer>> getSolrListId(List<Integer> knowledgeIds){
		// �洢���е�֪ʶ��id�б�
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
	
	// ��ѯ�����
	public List<String> getQuestionsDetail(List<Integer> FinalQuestionIdList){
		
		List<String> questionsDetailList = questionAssembleMapper.getQuestionDetailList(FinalQuestionIdList);
		return questionsDetailList;
		
	}
	
	// �������е����� 
	public List<String> getAllQuestionDetail(Integer difficultyInfo, Integer questionTypeId){
		
		List<String> questionsDetailList = questionAssembleMapper.getAllQuestionDetailList(difficultyInfo, questionTypeId);
		return questionsDetailList;
	}
	
	// �������е������Id
	public List<Integer> getAllQuestionDetailId(Integer difficultyInfo, Integer questionTypeId){
			
			List<Integer> questionsDetailListId = questionAssembleMapper.getAllQuestionDetailListId(difficultyInfo, questionTypeId);
			return questionsDetailListId;
	}
	
	// ����֪ʶ��Ids��ѯ����  ���ҽ��з�ҳ
	public PageInfo getQuestions(List<Integer> knowledgeIds, Integer pn, Integer difficultyInfo, Integer questionTypeId){
		List<Object> getQuestions = new ArrayList<Object>();
		List<String> questionsDetail = new ArrayList<String>();
		List<Integer> finalQuestionId = new ArrayList<Integer>();
		
		if(knowledgeIds == null) {   // ��ѯȫ��
			
			// Ĭ��10������һ����ҳ
			PageHelper.startPage(pn, 10);
			questionsDetail =  getAllQuestionDetail(difficultyInfo, questionTypeId);
		}else {
			
			finalQuestionId = getFinalQuestionId(knowledgeIds, difficultyInfo, questionTypeId);
			//System.out.println("finalQuestionId " + finalQuestionId);
			System.out.println("finalQuestionId Size = " + finalQuestionId.size());
			if(finalQuestionId != null && finalQuestionId.size() != 0){
				
			// Ĭ��10������һ����ҳ
			PageHelper.startPage(pn, 10);
		    questionsDetail = getQuestionsDetail(finalQuestionId);
			}
		}
		
		// �����ڵ����
		if(questionsDetail == null || questionsDetail.size() == 0)
		return null;
		
		PageInfo pageInfo = new PageInfo(questionsDetail);
		
		// �ַ�תjson
		if(questionsDetail != null)
		for(String detail : questionsDetail) {
		Object jsonObject = JSONObject.parse(detail);
		getQuestions.add(jsonObject);
		}
		
		pageInfo.setList(getQuestions);
		
		return pageInfo;
	}
	
	// ��ѯ����֪ʶ��id��Ӧ����������
		public List<KnowledgeProblemSize> getProblemSize(List<Integer> knowledgeIds){
			// �洢���е�֪ʶ��id����������
			System.out.println("�ҽ���֪ʶ������������ѯ");
			List<KnowledgeProblemSize> problemSizeLists = new ArrayList<KnowledgeProblemSize>();
			for(Integer knowledgeId : knowledgeIds) {
				System.out.println("getProblemSize knowledgeId = " + knowledgeId);
				Highmathrja1info highmathrja1info = getLevel(knowledgeId);
				if(highmathrja1info != null){
				List<Integer> level4List = getLevel4List(highmathrja1info);
				// �������Ѷȡ��������Ͳ���
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
		
		// �õ���ʼ�����ײ�ڵ�
		public List<Integer> getInitKownlegeIds(){
			
			return konwledgeLevelMapper.getInitKownlegeIds();
			
		}
			
		// �õ���ʼ�Ļ�����һ���֪ʶ���б�
		public List<Integer> getNextLevelKownlegeIds(Integer knowledgeId){
			
			//�õ�֪ʶ��Ķ�Ӧ�Ĳ���
			Highmathrja1info info = getLevel(knowledgeId);
			Integer level = info.getLevel();
			Integer nextLevel = level + 1;
			
			return konwledgeLevelMapper.getNextLevelKownlegeIds(level, knowledgeId, nextLevel);
		}
		
}
