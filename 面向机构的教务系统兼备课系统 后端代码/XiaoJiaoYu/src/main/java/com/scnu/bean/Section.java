package com.scnu.bean;

import java.util.List;

public class Section {
	
	private Integer sectionId;
	
	private String sectionName;
	
	private List<Subject> children;

	public Integer getSectionId() {
		return sectionId;
	}

	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	public List<Subject> getChildren() {
		return children;
	}

	public void setChildren(List<Subject> children) {
		this.children = children;
	}

}
