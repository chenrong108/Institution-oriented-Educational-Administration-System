package com.scnu.bean;

import java.util.List;

public class Business {
	
	private Integer id;
	
	private String name;
	
	private List<Corporation> children;

	public List<Corporation> getChildren() {
		return children;
	}

	public void setChildren(List<Corporation> children) {
		this.children = children;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer businessId) {
		this.id = businessId;
	}

	public String getName() {
		return name;
	}

	public void setName(String businessName) {
		this.name = businessName;
	}

}
