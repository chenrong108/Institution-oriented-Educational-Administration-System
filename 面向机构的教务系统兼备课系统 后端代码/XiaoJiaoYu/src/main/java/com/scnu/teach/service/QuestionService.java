package com.scnu.teach.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scnu.bean.QuestionMessage;
import com.scnu.question.mapper.DifiicultyInfoMapper;
import com.scnu.question.mapper.QuestionTypeInfoMapper;
import com.scnu.question.mapper.ResourceCategoryInfoMapper;
import com.scnu.question.mapper.TikuInfoMapper;
import com.scnu.question.mapper.YearProblemInfoMapper;
import com.scnu.question.pojo.DifiicultyInfo;
import com.scnu.question.pojo.DifiicultyInfoExample;
import com.scnu.question.pojo.QuestionTypeInfo;
import com.scnu.question.pojo.QuestionTypeInfoExample;
import com.scnu.question.pojo.QuestionTypeInfoExample.Criteria;
import com.scnu.question.pojo.ResourceCategoryInfo;
import com.scnu.question.pojo.TikuInfo;
import com.scnu.question.pojo.TikuInfoExample;
import com.scnu.question.pojo.YearProblemInfo;
import com.scnu.question.pojo.YearProblemInfoExample;

@Service
public class QuestionService {
	
	@Autowired
	private TikuInfoMapper tikuInfoMapper;
	
	@Autowired
	private YearProblemInfoMapper yearProblemInfoMapper;
	
	@Autowired
	private DifiicultyInfoMapper difiicultyInfoMapper;
	
	@Autowired
	private QuestionTypeInfoMapper questionTypeInfoMapper;
	
	@Autowired
	private ResourceCategoryInfoMapper resourceCategoryInfoMapper;
	
	
	
	
	// ��ȡ���
	public List<TikuInfo> getTikuInfoList(){
		
		TikuInfoExample example = new TikuInfoExample();
		
		List<TikuInfo> list = tikuInfoMapper.selectByExample(example);
		
		return list;
	}
	
	  
	// ��ȡ����    subjectIdӰ��
	public List<QuestionTypeInfo> getQuestionTypeInfoList(Integer subjectId){
		
		QuestionTypeInfoExample example = new QuestionTypeInfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andQuestionTypeSubjectidEqualTo(subjectId);
		List<QuestionTypeInfo> list = questionTypeInfoMapper.selectByExample(example);
		
		return list;
	}
	
	// ��ȡ�Ѷ�
	public List<DifiicultyInfo> getDifficultyInfoList(){
		
		DifiicultyInfoExample example = new DifiicultyInfoExample();
		
		List<DifiicultyInfo> list = difiicultyInfoMapper.selectByExample(example);
		
		return list;
	}
	
	
	// ��ȡ��Դ  sectionIdӰ��
	public List<ResourceCategoryInfo> getResourceCategoryInfoList(Integer sectionId){
		
		List<ResourceCategoryInfo> list = resourceCategoryInfoMapper.selectByPrimaryKey(sectionId);
		
		return list;
	}
	
	
	// ��ȡ���
	public List<YearProblemInfo> getYearProblemInfoList(){
         
		YearProblemInfoExample example = new YearProblemInfoExample();
		
		List<YearProblemInfo> list = yearProblemInfoMapper.selectByExample(example);
		
		return list;
	}
	
	// ͨ��sectionId��subjectId��ȡ���������    ��ʼ����ʱ��
	public QuestionMessage getAllMessage(Integer sectionId, Integer subjectId) {
		
		QuestionMessage message = new QuestionMessage();
		message.setTikuList(getTikuInfoList());
		message.setQuestionTypeList(getQuestionTypeInfoList(subjectId));
		message.setDifficultyList(getDifficultyInfoList());
		message.setResourceCategoryList(getResourceCategoryInfoList(sectionId));
		message.setYearProblemList(getYearProblemInfoList());
		return message;
	}
	
	
	// ��ȡ���ָı������
	public QuestionMessage getPartMessage(Integer sectionId, Integer subjectId) {
	   QuestionMessage message = new QuestionMessage();
	   message.setQuestionTypeList(getQuestionTypeInfoList(subjectId));
	   message.setResourceCategoryList(getResourceCategoryInfoList(sectionId));
	   return message;
	}
	
	
}
