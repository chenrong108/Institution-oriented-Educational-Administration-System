package com.scnu.bean;

import java.util.Arrays;
import java.util.List;

// 存放常量
public class Const {
	
	public final static boolean SUCCESS = true;
	
	public final static boolean FAILURE = false;
	
	public final static List<String> ClassType = Arrays.asList("班课", "星火10人课堂", "晓培优", "晓双师");
	
	public final static List<String> schoolA = Arrays.asList("标准版", "东莞分公司", "佛山分公司",
			"中山分公司", "惠州分公司", "顺德分公司", "江门分公司" );
	
	public final static List<String> schoolB = Arrays.asList("标准版", "培优广州分校", "培优佛山分校",
			"培优东莞分校", "培优中山分校", "培优南宁分校", "培优南昌分校" );
	
	public final static List<String> schoolC = Arrays.asList("标准版", "双师清远分校", "双师东莞分校",
			"双师江门分校", "双师中山分校", "双师惠州分校", "双师佛山分校" );
	
	public final static List<String> version = Arrays.asList("苏教版", "人教A版", "北师大版", "人教B版");
	
	public final static List<String> Year = Arrays.asList("2019", "2018", "2017");
	
	public final static List<String> Duration = Arrays.asList("长期班", "短期班");
	
	public final static List<String> Season = Arrays.asList("暑假", "秋季", "寒假", "春季");
	
	public final static List<FirstType> bookVersion = Arrays.asList(new FirstType("424", "bookVersion_424", "bookVersion", "必修一"),
			new FirstType("425", "bookVersion_425", "bookVersion", "必修二"), new FirstType("426", "bookVersion_426", "bookVersion", "必修三"),
			new FirstType("427", "bookVersion_427", "bookVersion", "必修四"), new FirstType("428", "bookVersion_428", "bookVersion", "必修五"),
			new FirstType("429", "bookVersion_429", "bookVersion", "选修1-1"), new FirstType("430", "bookVersion_430", "bookVersion", "选修1-2"),
			new FirstType("431", "bookVersion_431", "bookVersion", "选修2-1"), new FirstType("432", "bookVersion_432", "bookVersion", "选修2-2"));
	
	
	public final static List<FirstType> classes = Arrays.asList(new FirstType("4", "classType_4", "classType", "基础班"),
			new FirstType("1", "classType_1", "classType", "提高班"), new FirstType("2", "classType_2", "classType", "尖子班"),
			new FirstType("5", "classType_5", "classType", "创新B班"), new FirstType("3", "classType_3", "classType", "满分目标班"),
			new FirstType("6", "classType_6", "classType", "创新A班"), new FirstType("7", "classType_7", "classType", "基础班"),
			new FirstType("8", "classType_8", "classType", "实验班"));
	
	public final static List<FirstType> sceneType = Arrays.asList(new FirstType("1", "sceneType_1", "sceneType", "预习"), new FirstType("2", "sceneType_2", "sceneType", "复习"));
	
	public final static List<FirstType> Grade = Arrays.asList(new FirstType("10", "grade_10", "grade", "高一"), new FirstType("11", "grade_11", "grade", "高二"), new FirstType("12", "grade_12", "grade", "高三"));
	
	public final static List<FirstType> materialType = Arrays.asList(new FirstType("1", "materialTypeId_1", "materialTypeId", "A型教材"),
			new FirstType("2", "materialTypeId_2", "materialTypeId", "B型教材"), new FirstType("3", "materialTypeId_3", "materialTypeId", "C型教材"),
			new FirstType("4", "materialTypeId_4", "materialTypeId", "X型教材"), new FirstType("5", "materialTypeId_5", "materialTypeId", "Y型教材"),
			new FirstType("6", "materialTypeId_6", "materialTypeId", "Z型教材"), new FirstType("7", "materialTypeId_7", "materialTypeId", "S型教材"),
			new FirstType("8", "materialTypeId_8", "materialTypeId", "E型教材"), new FirstType("9", "materialTypeId_9", "materialTypeId", "Xb型教材"),
			new FirstType("10", "materialTypeId_10", "materialTypeId", "Xc型教材"), new FirstType("11", "materialTypeId_11", "materialTypeId", "Q型教材"));
	
	public final static List<FirstType> reviewProgress = Arrays.asList(new FirstType("1", "reviewProgress_1", "reviewProgress", "一轮复习"),
			new FirstType("2", "reviewProgress_2", "reviewProgress", "二轮复习"), new FirstType("3", "reviewProgress_3", "reviewProgress", "三轮复习"));
	
	public final static List<FirstType> adaptiveAreas = Arrays.asList(new FirstType("308", "adaptiveAreas_308", "adaptiveAreas", "上海卷"),
			new FirstType("309", "adaptiveAreas_309", "adaptiveAreas", "福建卷"), new FirstType("310", "adaptiveAreas_310", "adaptiveAreas", "全国III卷"),
			new FirstType("311", "adaptiveAreas_311", "adaptiveAreas", "全国II卷"), new FirstType("312", "adaptiveAreas_312", "adaptiveAreas", "全国I卷"),
			new FirstType("313", "adaptiveAreas_313", "adaptiveAreas", "北京卷"), new FirstType("314", "adaptiveAreas_314", "adaptiveAreas", "江苏卷"),
			new FirstType("315", "adaptiveAreas_315", "adaptiveAreas", "浙江卷"), new FirstType("316", "adaptiveAreas_316", "adaptiveAreas", "海南卷"));
	
	
//	public final static List<Section> section = Arrays.asList(new Section("2", "section_2", "section", "初中", Arrays.asList(new FirstType("5", "subject_5", "section_2", "数学"), new FirstType("8", "subject_8", "section_2", "物理"))),
//			new Section("3", "section_3", "section", "高中", Arrays.asList(new FirstType("14", "subject_14", "section_3", "数学"), new FirstType("17", "subject_17", "section_3", "物理"))));
	

}
