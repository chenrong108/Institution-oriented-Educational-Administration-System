package com.scnu.bean;

import java.util.Arrays;
import java.util.List;

// ��ų���
public class Const {
	
	public final static boolean SUCCESS = true;
	
	public final static boolean FAILURE = false;
	
	public final static List<String> ClassType = Arrays.asList("���", "�ǻ�10�˿���", "������", "��˫ʦ");
	
	public final static List<String> schoolA = Arrays.asList("��׼��", "��ݸ�ֹ�˾", "��ɽ�ֹ�˾",
			"��ɽ�ֹ�˾", "���ݷֹ�˾", "˳�·ֹ�˾", "���ŷֹ�˾" );
	
	public final static List<String> schoolB = Arrays.asList("��׼��", "���Ź��ݷ�У", "���ŷ�ɽ��У",
			"���Ŷ�ݸ��У", "������ɽ��У", "����������У", "�����ϲ���У" );
	
	public final static List<String> schoolC = Arrays.asList("��׼��", "˫ʦ��Զ��У", "˫ʦ��ݸ��У",
			"˫ʦ���ŷ�У", "˫ʦ��ɽ��У", "˫ʦ���ݷ�У", "˫ʦ��ɽ��У" );
	
	public final static List<String> version = Arrays.asList("�ս̰�", "�˽�A��", "��ʦ���", "�˽�B��");
	
	public final static List<String> Year = Arrays.asList("2019", "2018", "2017");
	
	public final static List<String> Duration = Arrays.asList("���ڰ�", "���ڰ�");
	
	public final static List<String> Season = Arrays.asList("���", "�＾", "����", "����");
	
	public final static List<FirstType> bookVersion = Arrays.asList(new FirstType("424", "bookVersion_424", "bookVersion", "����һ"),
			new FirstType("425", "bookVersion_425", "bookVersion", "���޶�"), new FirstType("426", "bookVersion_426", "bookVersion", "������"),
			new FirstType("427", "bookVersion_427", "bookVersion", "������"), new FirstType("428", "bookVersion_428", "bookVersion", "������"),
			new FirstType("429", "bookVersion_429", "bookVersion", "ѡ��1-1"), new FirstType("430", "bookVersion_430", "bookVersion", "ѡ��1-2"),
			new FirstType("431", "bookVersion_431", "bookVersion", "ѡ��2-1"), new FirstType("432", "bookVersion_432", "bookVersion", "ѡ��2-2"));
	
	
	public final static List<FirstType> classes = Arrays.asList(new FirstType("4", "classType_4", "classType", "������"),
			new FirstType("1", "classType_1", "classType", "��߰�"), new FirstType("2", "classType_2", "classType", "���Ӱ�"),
			new FirstType("5", "classType_5", "classType", "����B��"), new FirstType("3", "classType_3", "classType", "����Ŀ���"),
			new FirstType("6", "classType_6", "classType", "����A��"), new FirstType("7", "classType_7", "classType", "������"),
			new FirstType("8", "classType_8", "classType", "ʵ���"));
	
	public final static List<FirstType> sceneType = Arrays.asList(new FirstType("1", "sceneType_1", "sceneType", "Ԥϰ"), new FirstType("2", "sceneType_2", "sceneType", "��ϰ"));
	
	public final static List<FirstType> Grade = Arrays.asList(new FirstType("10", "grade_10", "grade", "��һ"), new FirstType("11", "grade_11", "grade", "�߶�"), new FirstType("12", "grade_12", "grade", "����"));
	
	public final static List<FirstType> materialType = Arrays.asList(new FirstType("1", "materialTypeId_1", "materialTypeId", "A�ͽ̲�"),
			new FirstType("2", "materialTypeId_2", "materialTypeId", "B�ͽ̲�"), new FirstType("3", "materialTypeId_3", "materialTypeId", "C�ͽ̲�"),
			new FirstType("4", "materialTypeId_4", "materialTypeId", "X�ͽ̲�"), new FirstType("5", "materialTypeId_5", "materialTypeId", "Y�ͽ̲�"),
			new FirstType("6", "materialTypeId_6", "materialTypeId", "Z�ͽ̲�"), new FirstType("7", "materialTypeId_7", "materialTypeId", "S�ͽ̲�"),
			new FirstType("8", "materialTypeId_8", "materialTypeId", "E�ͽ̲�"), new FirstType("9", "materialTypeId_9", "materialTypeId", "Xb�ͽ̲�"),
			new FirstType("10", "materialTypeId_10", "materialTypeId", "Xc�ͽ̲�"), new FirstType("11", "materialTypeId_11", "materialTypeId", "Q�ͽ̲�"));
	
	public final static List<FirstType> reviewProgress = Arrays.asList(new FirstType("1", "reviewProgress_1", "reviewProgress", "һ�ָ�ϰ"),
			new FirstType("2", "reviewProgress_2", "reviewProgress", "���ָ�ϰ"), new FirstType("3", "reviewProgress_3", "reviewProgress", "���ָ�ϰ"));
	
	public final static List<FirstType> adaptiveAreas = Arrays.asList(new FirstType("308", "adaptiveAreas_308", "adaptiveAreas", "�Ϻ���"),
			new FirstType("309", "adaptiveAreas_309", "adaptiveAreas", "������"), new FirstType("310", "adaptiveAreas_310", "adaptiveAreas", "ȫ��III��"),
			new FirstType("311", "adaptiveAreas_311", "adaptiveAreas", "ȫ��II��"), new FirstType("312", "adaptiveAreas_312", "adaptiveAreas", "ȫ��I��"),
			new FirstType("313", "adaptiveAreas_313", "adaptiveAreas", "������"), new FirstType("314", "adaptiveAreas_314", "adaptiveAreas", "���վ�"),
			new FirstType("315", "adaptiveAreas_315", "adaptiveAreas", "�㽭��"), new FirstType("316", "adaptiveAreas_316", "adaptiveAreas", "���Ͼ�"));
	
	
//	public final static List<Section> section = Arrays.asList(new Section("2", "section_2", "section", "����", Arrays.asList(new FirstType("5", "subject_5", "section_2", "��ѧ"), new FirstType("8", "subject_8", "section_2", "����"))),
//			new Section("3", "section_3", "section", "����", Arrays.asList(new FirstType("14", "subject_14", "section_3", "��ѧ"), new FirstType("17", "subject_17", "section_3", "����"))));
	

}
