package com.scnu.bean;

import java.util.List;

import com.scnu.question.pojo.DifiicultyInfo;
import com.scnu.question.pojo.QuestionTypeInfo;
import com.scnu.question.pojo.ResourceCategoryInfo;
import com.scnu.question.pojo.TikuInfo;
import com.scnu.question.pojo.YearProblemInfo;

public class QuestionMessage {
	
	private List<TikuInfo> tikuList;
	
	private List<QuestionTypeInfo> questionTypeList;
	
	private List<DifiicultyInfo> difficultyList;
	
	private List<ResourceCategoryInfo> resourceCategoryList;
	
	private List<YearProblemInfo> yearProblemList;

	public List<TikuInfo> getTikuList() {
		return tikuList;
	}

	public void setTikuList(List<TikuInfo> tikuList) {
		this.tikuList = tikuList;
	}

	public List<QuestionTypeInfo> getQuestionTypeList() {
		return questionTypeList;
	}

	public void setQuestionTypeList(List<QuestionTypeInfo> questionTypeList) {
		this.questionTypeList = questionTypeList;
	}

	public List<DifiicultyInfo> getDifficultyList() {
		return difficultyList;
	}

	public void setDifficultyList(List<DifiicultyInfo> difficultyList) {
		this.difficultyList = difficultyList;
	}

	public List<ResourceCategoryInfo> getResourceCategoryList() {
		return resourceCategoryList;
	}

	public void setResourceCategoryList(List<ResourceCategoryInfo> resourceCategoryList) {
		this.resourceCategoryList = resourceCategoryList;
	}

	public List<YearProblemInfo> getYearProblemList() {
		return yearProblemList;
	}

	public void setYearProblemList(List<YearProblemInfo> yearProblemList) {
		this.yearProblemList = yearProblemList;
	}

}
