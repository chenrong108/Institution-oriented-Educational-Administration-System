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
	
	
	
	
	// 获取题库
	public List<TikuInfo> getTikuInfoList(){
		
		TikuInfoExample example = new TikuInfoExample();
		
		List<TikuInfo> list = tikuInfoMapper.selectByExample(example);
		
		return list;
	}
	
	  
	// 获取题型    subjectId影响
	public List<QuestionTypeInfo> getQuestionTypeInfoList(Integer subjectId){
		
		QuestionTypeInfoExample example = new QuestionTypeInfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andQuestionTypeSubjectidEqualTo(subjectId);
		List<QuestionTypeInfo> list = questionTypeInfoMapper.selectByExample(example);
		
		return list;
	}
	
	// 获取难度
	public List<DifiicultyInfo> getDifficultyInfoList(){
		
		DifiicultyInfoExample example = new DifiicultyInfoExample();
		
		List<DifiicultyInfo> list = difiicultyInfoMapper.selectByExample(example);
		
		return list;
	}
	
	
	// 获取来源  sectionId影响
	public List<ResourceCategoryInfo> getResourceCategoryInfoList(Integer sectionId){
		
		List<ResourceCategoryInfo> list = resourceCategoryInfoMapper.selectByPrimaryKey(sectionId);
		
		return list;
	}
	
	
	// 获取年份
	public List<YearProblemInfo> getYearProblemInfoList(){
         
		YearProblemInfoExample example = new YearProblemInfoExample();
		
		List<YearProblemInfo> list = yearProblemInfoMapper.selectByExample(example);
		
		return list;
	}
	
	// 通过sectionId、subjectId获取上面的内容    初始化的时候
	public QuestionMessage getAllMessage(Integer sectionId, Integer subjectId) {
		
		QuestionMessage message = new QuestionMessage();
		message.setTikuList(getTikuInfoList());
		message.setQuestionTypeList(getQuestionTypeInfoList(subjectId));
		message.setDifficultyList(getDifficultyInfoList());
		message.setResourceCategoryList(getResourceCategoryInfoList(sectionId));
		message.setYearProblemList(getYearProblemInfoList());
		return message;
	}
	
	
	// 获取部分改变的内容
	public QuestionMessage getPartMessage(Integer sectionId, Integer subjectId) {
	   QuestionMessage message = new QuestionMessage();
	   message.setQuestionTypeList(getQuestionTypeInfoList(subjectId));
	   message.setResourceCategoryList(getResourceCategoryInfoList(sectionId));
	   return message;
	}
	
	
}
