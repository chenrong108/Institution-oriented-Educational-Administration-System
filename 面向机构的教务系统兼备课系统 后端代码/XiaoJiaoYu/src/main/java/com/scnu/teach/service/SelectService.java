package com.scnu.teach.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.scnu.bean.Judgement;
import com.scnu.bean.QuestionMessage;
import com.scnu.bean.ScnuResult;
import com.scnu.bean.SelectMessage;
import com.scnu.teach.mapper.SimpleAssembleInfoMapper;
import com.scnu.teach.mapper.SimpleassembleMapper;
import com.scnu.teach.pojo.SimpleAssembleInfoExample;
import com.scnu.teach.pojo.SimpleAssembleInfoExample.Criteria;
import com.scnu.teach.pojo.Simplebookversionlist;
import com.scnu.teach.pojo.Simplepublishversionlist;
import com.scnu.teach.pojo.Simplesectionlist;
import com.scnu.teach.pojo.Simplesubjectlist;

@Service
public class SelectService {
	
	@Autowired
	private SimpleassembleMapper simpleassembleMapper;
	
	@Autowired
	private SimpleAssembleInfoMapper simpleAssembleInfoMapper;
	
	@Autowired
	private QuestionService questionService;
	
	
	// �õ�ѧ��
	public List<Simplesectionlist> getSectionList(){
		List<Simplesectionlist> list = simpleassembleMapper.getSectionList();
		return list;
	}

	// �õ���Ŀ
	public List<Simplesubjectlist> getSubjectList(Integer sectionId){
		List<Simplesubjectlist> list = simpleassembleMapper.getSubjectList(sectionId);
		return list;
	}
	
	// �õ�����
	public List<Simplepublishversionlist> getPublishVersionList(Integer sectionId, Integer subjectId){
		List<Simplepublishversionlist> list = simpleassembleMapper.getPublishVersionList(sectionId, subjectId);
		return list;
	}
	
	// �õ��鱾��Ϣ
	public List<Simplebookversionlist> getBookVersionList(Integer sectionId, Integer subjectId, Integer publishVersionId){
		List<Simplebookversionlist> list = simpleassembleMapper.getBookVersionList(sectionId, subjectId, publishVersionId);
		return list;
	}
	
	// �õ�treeJson�ַ���
	public String getTreeJson(Integer sectionId, Integer subjectId, Integer publishVersionId, Integer bookVersionId){
		
		SimpleAssembleInfoExample example = new SimpleAssembleInfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andSectionIdEqualTo(sectionId);
		criteria.andSubjectIdEqualTo(subjectId);
		criteria.andPublishVersionIdEqualTo(publishVersionId);
		criteria.andBookVersionIdEqualTo(bookVersionId);
		String json = simpleAssembleInfoMapper.selectByExampleWithBLOBs(example);
		
		return json;
	}
	
	public ScnuResult getSelectionList(Integer sectionId, Integer subjectId, Integer publishVersionId, Integer bookVersionId, Integer line) {
		
		// ��line > 4 �������κζ���
		if(line > 4)
		return null;
		
		SelectMessage selectMessage = new SelectMessage();
		List<Judgement> simpleJudgement = new ArrayList<Judgement>();

	
		int temp = 0;
		boolean tag = true;
		selectMessage.simpleSectionList = getSectionList();
		Judgement judgement = new Judgement();
		for(Simplesectionlist section : selectMessage.simpleSectionList) {
			if(temp == 0) {
				temp = section.getSectionId();
				judgement.setId(-1);
				judgement.setName(section.getSectionName());
			}
			if(section.getSectionId().equals(sectionId)) {
				judgement.setId(section.getSectionId());
				judgement.setName(section.getSectionName());
				tag = false;
				break;
			}
		}
		if(tag)
		sectionId = temp;
		System.out.println(judgement.getName());
		simpleJudgement.add(judgement);
		
		Judgement judgement2 = new Judgement();
		// �жϴ���������ֵ�Ƿ���Ȼ����
		selectMessage.simpleSubjectList = getSubjectList(sectionId);
		// ��ʱ�����洢��һ��ֵ
		temp = 0;
	    tag = true;
		 for(Simplesubjectlist subject : selectMessage.simpleSubjectList) {
			      if(temp == 0){
			      temp = subject.getSubjectId();
			      // Ĭ�ϵ�����
			      judgement2.setId(-1);
				  judgement2.setName(subject.getSubjectName());
			      }
			      if(subject.getSubjectId().equals(subjectId)) {
			    	  judgement2.setId(subject.getSubjectId());
					  judgement2.setName(subject.getSubjectName());
			    	  tag = false;
			    	  break;
			      }
		 }
		 if(tag)
		 subjectId = temp;
		 System.out.println(judgement2.getName());
		 simpleJudgement.add(judgement2);
		 
		 
		 Judgement judgement3 = new Judgement();
		// �жϴ���������ֵ�Ƿ���Ȼ����
		selectMessage.simplePublishVersionList = getPublishVersionList(sectionId, subjectId);
		// ��ʱ�����洢��һ��ֵ
		 temp = 0;
		 tag = true;
		 for(Simplepublishversionlist publishVersion : selectMessage.simplePublishVersionList) {
			      if(temp == 0) {
			      temp = publishVersion.getPublishVersionId();
			      judgement3.setId(-1);
				  judgement3.setName(publishVersion.getPublishVersionName());
			      }
			      if(publishVersion.getPublishVersionId().equals(publishVersionId)) {
			    	  judgement3.setId(publishVersion.getPublishVersionId());
					  judgement3.setName(publishVersion.getPublishVersionName());
			    	  tag = false;
			    	  break;
			      }
		 }
		 if(tag)
		 publishVersionId = temp;
		 System.out.println(judgement3.getName());
		 simpleJudgement.add(judgement3);
		
		 Judgement judgement4 = new Judgement();
		 temp = 0;
		 tag = true;
		// �жϴ���������ֵ�Ƿ���Ȼ����
				selectMessage.simpleBookVersionList = getBookVersionList(sectionId, subjectId, publishVersionId);

				 for(Simplebookversionlist bookVersion : selectMessage.simpleBookVersionList) {
					 
					 if(temp == 0) {
						  temp = bookVersion.getBookVersionId();
					      judgement4.setId(-1);
						  judgement4.setName(bookVersion.getBookVersionName());
					 }

					      if(bookVersion.getBookVersionId().equals(bookVersionId)) {
					    	  judgement4.setId(bookVersion.getBookVersionId());
							  judgement4.setName(bookVersion.getBookVersionName());
							  tag = false;
					    	  break;
					      }
				 }
		if(tag)
		bookVersionId = temp;
		
		System.out.println(judgement4.getName());
		simpleJudgement.add(judgement4);	 
		
		for(Judgement j : simpleJudgement) {
			System.out.println(j.getId() + "  " + j.getName());
		}
		
		selectMessage.simpleJudgement = simpleJudgement;
		
		// �ж� line �Ƿ����0 �� �����Ƿ����treeJSON , 0 ����� 1 �����
		if(line == 0) {
			
			// ��ѯtreeJson����
			String json = getTreeJson(sectionId, subjectId, publishVersionId, bookVersionId);
			JSONObject jsonObject = JSONObject.parseObject(json);
			selectMessage.setTreeJson(jsonObject);
			
		}
		
		// ��ʼ����������Ϣ����ȥ
		System.out.println("������Ϣ���ɹ� ��ʼ��");
		selectMessage.setQuestionMessage(questionService.getAllMessage(sectionId, subjectId));
		
		ScnuResult result = ScnuResult.buildSuccess(selectMessage);
		return result;
	}
}
