package com.scnu.bean;

import java.util.Arrays;
import java.util.List;

import com.scnu.teach.pojo.Adaptiveareainfo;
import com.scnu.teach.pojo.Classtypeinfo;
import com.scnu.teach.pojo.Gradeinfo;
import com.scnu.teach.pojo.Materialtypeinfo;
import com.scnu.teach.pojo.Productlineinfo;
import com.scnu.teach.pojo.Publishversionlist;
import com.scnu.teach.pojo.Reviewprogressinfo;
import com.scnu.teach.pojo.Seasoninfo;
import com.scnu.teach.pojo.Simplebookversionlist;
import com.scnu.teach.pojo.Textbooktypeinfo;
import com.scnu.teach.pojo.Yearinfo;

public class TeachMessage {
	
	private List<Section> sectionList;
	
	private List<Business> businessList;
	
	private List<Yearinfo> yearList;
	
	private List<Productlineinfo> productLineList;
	
	private List<Publishversionlist> simplePublishVersionList;
	
	private List<Seasoninfo> seasonList;
	
	private List<Gradeinfo> gradeList;
	
	private List<Classtypeinfo> classTypeList;
	
	private List<Materialtypeinfo> materialTypeList;
	
	private List<Simplebookversionlist> simpleBookVersionList;
	
	private List<Textbooktypeinfo> textBookTypeList;
	
	private List<Adaptiveareainfo> adaptiveAreaList;
	
	private List<Reviewprogressinfo> reviewProgressList;
	
	public List<Boolean> simpleJudgement = Arrays.asList(false, false);

	public List<Business> getBusinessList() {
		return businessList;
	}

	public void setBusinessList(List<Business> businessList) {
		this.businessList = businessList;
	}

	public List<Simplebookversionlist> getSimpleBookVersionList() {
		return simpleBookVersionList;
	}

	public void setSimpleBookVersionList(List<Simplebookversionlist> simpleBookVersionList) {
		this.simpleBookVersionList = simpleBookVersionList;
	}

	public List<Textbooktypeinfo> getTextBookTypeList() {
		return textBookTypeList;
	}

	public void setTextBookTypeList(List<Textbooktypeinfo> textBookTypeList) {
		this.textBookTypeList = textBookTypeList;
	}

	public List<Adaptiveareainfo> getAdaptiveAreaList() {
		return adaptiveAreaList;
	}

	public void setAdaptiveAreaList(List<Adaptiveareainfo> adaptiveAreaList) {
		this.adaptiveAreaList = adaptiveAreaList;
	}

	public List<Reviewprogressinfo> getReviewProgressList() {
		return reviewProgressList;
	}

	public void setReviewProgressList(List<Reviewprogressinfo> reviewProgressList) {
		this.reviewProgressList = reviewProgressList;
	}

	public List<Classtypeinfo> getClassTypeList() {
		return classTypeList;
	}

	public void setClassTypeList(List<Classtypeinfo> classTypeList) {
		this.classTypeList = classTypeList;
	}

	public List<Materialtypeinfo> getMaterialTypeList() {
		return materialTypeList;
	}

	public void setMaterialTypeList(List<Materialtypeinfo> materialTypeList) {
		this.materialTypeList = materialTypeList;
	}

	public List<Gradeinfo> getGradeList() {
		return gradeList;
	}

	public void setGradeList(List<Gradeinfo> gradeList) {
		this.gradeList = gradeList;
	}

	public List<Section> getSectionList() {
		return sectionList;
	}

	public void setSectionList(List<Section> sectionList) {
		this.sectionList = sectionList;
	}

	public List<Yearinfo> getYearList() {
		return yearList;
	}

	public void setYearList(List<Yearinfo> yearList) {
		this.yearList = yearList;
	}

	public List<Productlineinfo> getProductLineList() {
		return productLineList;
	}

	public void setProductLineList(List<Productlineinfo> productLineList) {
		this.productLineList = productLineList;
	}

	public List<Publishversionlist> getSimplePublishVersionList() {
		return simplePublishVersionList;
	}

	public void setSimplePublishVersionList(List<Publishversionlist> simplePublishVersionList) {
		this.simplePublishVersionList = simplePublishVersionList;
	}

	public List<Seasoninfo> getSeasonList() {
		return seasonList;
	}

	public void setSeasonList(List<Seasoninfo> seasonList) {
		this.seasonList = seasonList;
	}	

}
