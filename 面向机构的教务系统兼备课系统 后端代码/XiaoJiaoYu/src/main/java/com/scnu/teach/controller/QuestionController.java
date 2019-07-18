package com.scnu.teach.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrQuery.ORDER;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.scnu.bean.ScnuResult;
import com.scnu.ppt.bean.Constant;
import com.scnu.ppt.bean.KnowledgeProblemSize;
import com.scnu.ppt.bean.QuestionSolr;
import com.scnu.ppt.bean.getBeanTool;
import com.scnu.service.JedisClientSingle;
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
		System.out.println("JSONArray = " + list);
		List<Integer> knowledgeIds = new ArrayList<Integer>();
		
		// ��knowledgeIds��ֵ
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
		
		// �����ж��Ƿ���һ���� ������ѧ����1
		if(sectionId.intValue() ==17 && subjectId.intValue()==20 && publishVersionId.intValue()==17 && bookVersionId.intValue() == 424) {
		// ǰ�˷�json����
		// Ĭ��Ϊ��
		System.out.println("knowledgeIds " + knowledgeIds);
		
		PageInfo pageInfo = knowledgeService.getQuestions(knowledgeIds, pn, difficultyInfo, questionTypeId);
		
		return ScnuResult.buildSuccess(pageInfo);
		}
		
		// ����ָ�����鱾
		return ScnuResult.buildSuccess(null);
		
	}
	
	@RequestMapping("/getProblemSize")
	@ResponseBody
	public ScnuResult getPromblemSize(Integer sectionId, Integer subjectId, Integer publishVersionId, Integer  bookVersionId, Integer knowledgeId){
	
        System.out.println("sectionId = " + sectionId + " subjectId = " + subjectId + " publishVerisonId = " + publishVersionId + " bookVersionId = " + bookVersionId);
		if(sectionId==null || subjectId==null || publishVersionId==null || bookVersionId == null) {
			return ScnuResult.buildSuccess(null);
		}
		
		// �����ж��Ƿ���һ���� ������ѧ����1
		if(sectionId.intValue() ==17 && subjectId.intValue()==20 && publishVersionId.intValue()==17 && bookVersionId.intValue() == 424) {
			
			List<Integer> knowledgeIds = new ArrayList<Integer>();
			if(knowledgeId == null) {
				knowledgeIds = knowledgeService.getInitKownlegeIds();
			}else {
				knowledgeIds = knowledgeService.getNextLevelKownlegeIds(knowledgeId);
			}
			
			// ����֪ʶ�����������
			List<KnowledgeProblemSize> problemSizelist = knowledgeService.getProblemSize(knowledgeIds);
	        return ScnuResult.buildSuccess(problemSizelist);
		
		}
		
		return ScnuResult.buildSuccess(null);
	}
	
	public HttpSolrClient getHttpSolrClient() {
		HttpSolrClient httpSolrClient = new HttpSolrClient.Builder(Constant.SOLR_URL)
	            .withConnectionTimeout(10000)
	            .withSocketTimeout(60000)
	            .build();
		return httpSolrClient;
	}
	
	@RequestMapping("/getQueryProblems")
	@ResponseBody
	public ScnuResult queryPageData(@RequestBody(required=false) String knowledgeIdList){
		
		System.out.println("knowledgeIdList = " + knowledgeIdList);
		JSONObject json = JSONObject.parseObject(knowledgeIdList);
		Integer sectionId = (Integer)json.get("sectionId");
		Integer subjectId = (Integer)json.get("subjectId");
		Integer publishVersionId = (Integer)json.get("publishVersionId");
		Integer bookVersionId = (Integer)json.get("bookVersionId");
		Integer pn = (Integer)json.get("pn");
		Integer difficultyInfo = (Integer)json.get("difficultyInfo");
		Integer questionTypeId = (Integer)json.get("questionTypeId");
		String order = (String)json.get("order");
		String questionContain = (String)json.get("questionContain");
		JSONArray list = (JSONArray)json.get("knowledgeIds");
		System.out.println("JSONArray" + list);
		List<Integer> knowledgeIds = new ArrayList<Integer>();
		
		// �������ݴ��ڣ��ҷǷ�, ���ؿ�ֵ
		if(questionContain != null && questionContain.matches("<?[a-zA-Z0-9]*>?"))
			return ScnuResult.buildSuccess(null);
		
		
		// ��knowledgeIds��ֵ
		if(list == null || list.size() == 0) {
			knowledgeIds = null;
		}else {
			for(Object i : list) {
				knowledgeIds.add((Integer)i);
			}
		}
        
		if(sectionId==null || subjectId==null || publishVersionId==null || bookVersionId == null) {
			return ScnuResult.buildSuccess(null);
		}
		
		if(sectionId.intValue() ==17 && subjectId.intValue()==20 && publishVersionId.intValue()==17 && bookVersionId.intValue() == 424){
		// ǰ������ҳ����
		if(pn == null || pn <= 1)
			pn = 0;
		else
			pn = pn - 1;
		
		List<List<Integer>> finalQuestionId = new ArrayList<List<Integer>>();
		
		if(knowledgeIds != null) {
			finalQuestionId = knowledgeService.getSolrListId(knowledgeIds);
		}
		
		System.out.println("finalQuestionId = " + finalQuestionId);
        
        HttpSolrClient httpSolrClient = getHttpSolrClient();
		try {
        	Integer row = 10;
			QuestionSolr questionSolr = new QuestionSolr();
	        SolrQuery query = new SolrQuery();
	        //�趨��ѯ�ֶ�  
	        query.set("q", "*:*");
	        //������������
	        if(finalQuestionId.size() != 0)
	        for(List<Integer> list1 : finalQuestionId) {
	        	// ��װfq
	            StringBuilder sb = new StringBuilder();
	            if(list1.size() != 0){
	            for(Integer question_select : list1) {
	            	sb.append("question_select:" + question_select + " and ");
	            }
	            String queryStr = sb.toString();
	            System.out.println("queryStr = " + queryStr);
	            query.set("fq", queryStr);
	            }
	        }
	        if(difficultyInfo != null) {
	        	query.set("fq", "question_difficult:" + difficultyInfo);
	        }
	        if(questionTypeId != null) {
	        	query.set("fq", "question_Type_Id:" + questionTypeId);
	        }
	        //����������
	        if(questionContain != null)
	        query.set("fq", "question_contain:" + questionContain);
	        
	        // �����ֶ�
	        if(order != null) {
	        	if(order.equals("desc")) {
	        		System.out.println("desc");
	        		query.setSort("useCount", ORDER.desc);
	        	}else if(order.equals("asc")) {
	        		System.out.println("asc");
	        		query.setSort("useCount", ORDER.asc);
	        	}
	        }
	        
	        //ָ�����ؽ���ֶ�  
	        query.setIncludeScore(true);  
	        //��ҳ��ʼҳ��  
	        query.setStart(pn);  
	        //�趨���ؼ�¼����Ĭ��Ϊ10��  
	        query.setRows(row);  
	        
	        QueryResponse response = httpSolrClient.query(query);   
	        SolrDocumentList solrList = response.getResults();
	        for(SolrDocument document : solrList) {
	           String question_contain = (String)document.get("question_contain");
	           Object jsonObject = JSONObject.parse(question_contain);
	           document.setField("question_contain", jsonObject);
	        }
	        questionSolr.setSolrDocumentList(solrList);
	        questionSolr.setLength(solrList.getNumFound());
	        questionSolr.setPageSize(row);
	        
	        return ScnuResult.buildSuccess(questionSolr);
	        
	    	} catch (Exception e) {
			e.printStackTrace();
		 }
	  }
	  return ScnuResult.buildSuccess(null);
  }
	
}
