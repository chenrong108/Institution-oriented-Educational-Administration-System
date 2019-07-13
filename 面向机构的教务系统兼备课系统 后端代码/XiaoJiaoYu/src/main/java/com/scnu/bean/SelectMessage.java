package com.scnu.bean;

import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.scnu.teach.pojo.Simplebookversionlist;
import com.scnu.teach.pojo.Simplepublishversionlist;
import com.scnu.teach.pojo.Simplesectionlist;
import com.scnu.teach.pojo.Simplesubjectlist;

public class SelectMessage {
	
	public List<Simplesectionlist> simpleSectionList;
	
	public List<Simplesubjectlist> simpleSubjectList;
	
	public List<Simplepublishversionlist> simplePublishVersionList;
	
	public List<Simplebookversionlist> simpleBookVersionList;
	
	public List<Judgement> simpleJudgement;
	
	public QuestionMessage questionMessage;
	
	public QuestionMessage getQuestionMessage() {
		return questionMessage;
	}

	public void setQuestionMessage(QuestionMessage questionMessage) {
		this.questionMessage = questionMessage;
	}

	public Object treeJson;

	public Object getTreeJson() {
		return treeJson;
	}

	public void setTreeJson(Object treeJson) {
		this.treeJson = treeJson;
	}

	public List<Simplesectionlist> getSimpleSectionList() {
		return simpleSectionList;
	}

	public void setSimpleSectionList(List<Simplesectionlist> simpleSectionList) {
		this.simpleSectionList = simpleSectionList;
	}

	public List<Simplesubjectlist> getSimpleSubjectList() {
		return simpleSubjectList;
	}

	public void setSimpleSubjectList(List<Simplesubjectlist> simpleSubjectList) {
		this.simpleSubjectList = simpleSubjectList;
	}

	public List<Simplepublishversionlist> getSimplePublishVersionList() {
		return simplePublishVersionList;
	}

	public void setSimplePublishVersionList(List<Simplepublishversionlist> simplePublishVersionList) {
		this.simplePublishVersionList = simplePublishVersionList;
	}

	public List<Simplebookversionlist> getSimpleBookVersionList() {
		return simpleBookVersionList;
	}

	public void setSimpleBookVersionList(List<Simplebookversionlist> simpleBookVersionList) {
		this.simpleBookVersionList = simpleBookVersionList;
	}

	public List<Judgement> getSimpleJudgement() {
		return simpleJudgement;
	}

	public void setSimpleJudgement(List<Judgement> simpleJudgement) {
		this.simpleJudgement = simpleJudgement;
	}
	
}
