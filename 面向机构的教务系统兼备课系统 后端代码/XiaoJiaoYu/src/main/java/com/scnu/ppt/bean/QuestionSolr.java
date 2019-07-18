package com.scnu.ppt.bean;

import org.apache.solr.common.SolrDocumentList;

public class QuestionSolr {
	
	public SolrDocumentList solrDocumentList;
	
	public Integer pageSize;
	
	public Long length;

	public SolrDocumentList getSolrDocumentList() {
		return solrDocumentList;
	}

	public void setSolrDocumentList(SolrDocumentList solrDocumentList) {
		this.solrDocumentList = solrDocumentList;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Long getLength() {
		return length;
	}

	public void setLength(Long length) {
		this.length = length;
	}

}
