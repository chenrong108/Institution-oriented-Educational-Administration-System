package com.scnu.bean;

import java.util.List;

import com.scnu.teach.pojo.Simplebookversionlist;

// 该类用于课程备课信息的返回  data
public class Message {
	
	private List<String> classType;
	
	private List<String> source;
	
	private List<String> year;
	
	private List<String> duration;
	
	private List<String> version;
	
	private List<String> season;
	
	// 后面待修改
	//private List<Section> section;
	
	private List<FirstType> grade;
	
	private List<Simplebookversionlist> simplebookversionlist;
	
	private List<FirstType> sceneType;
	
	private List<FirstType> adaptiveAreas;
	
	private List<FirstType> reviewProgress;
	
	private List<FirstType> classes;
	
	private List<FirstType> materialType;

	
}
