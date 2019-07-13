package com.scnu.ppt.bean;

import java.util.List;

public class PPTMessage {
	
	private List<Integer> prepareIds;
	
	private List<PptInfo> prepareList;

	public List<Integer> getPrepareIds() {
		return prepareIds;
	}

	public void setPrepareIds(List<Integer> prepareIds) {
		this.prepareIds = prepareIds;
	}

	public List<PptInfo> getPrepareList() {
		return prepareList;
	}

	public void setPrepareList(List<PptInfo> prepareList) {
		this.prepareList = prepareList;
	}

}
