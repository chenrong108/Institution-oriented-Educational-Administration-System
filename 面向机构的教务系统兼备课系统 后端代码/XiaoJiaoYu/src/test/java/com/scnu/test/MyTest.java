package com.scnu.test;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;

public class MyTest {
	
	public static void main(String[] args) throws Exception{
		//1.��������
		SolrServer solrServer = new HttpSolrServer("http://localhost:8983/solr/chenrong");
	    //2.������ѯ���
	    SolrQuery query = new SolrQuery("id:1");
	    //3.���ò�ѯ����
	    //4.ִ�в�ѯ
	    QueryResponse queryResponse = solrServer.query(query);
	    //5.ȡ�ĵ��б�public class SolrDocumentList extends ArrayList<SolrDocument>
	    SolrDocumentList documentList = queryResponse.getResults();
	    for(SolrDocument solrDocument : documentList){
	        //ȡ�����ĵ���Ϣ
	        System.out.println("id:"+solrDocument.get("id")+" ");
	        System.out.println("username:"+solrDocument.get("username")+" ");
	        System.out.println("password:"+solrDocument.get("password")+" ");
	      }
	}
    

}
