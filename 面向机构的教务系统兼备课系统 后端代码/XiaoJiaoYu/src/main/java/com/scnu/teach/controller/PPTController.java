package com.scnu.teach.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONObject;
import com.scnu.bean.ScnuResult;
import com.scnu.ppt.bean.Lecture;
import com.scnu.ppt.bean.PPTMessage;
import com.scnu.ppt.bean.PptInfo;
import com.scnu.teach.service.PPTService;

@Controller
@RequestMapping("/teach/ppt")
public class PPTController {
	
	@Autowired
	private PPTService pptService;
	
	@RequestMapping("/upload")
	@ResponseBody
	public ScnuResult upload(@RequestParam("uploadedfile") MultipartFile file, Lecture lecture, HttpServletRequest request, HttpServletResponse response) {

		System.out.println("�ҽ���upload�ϴ���");
		System.out.println(lecture);
		
		System.out.println("upload sessionUserId = " + request.getSession().getAttribute("userId"));
		
		Integer userId = (Integer)request.getSession().getAttribute("userId");
		
		System.out.println("�ļ��Ƿ�Ϊ��: ");
		
		System.out.println(file.isEmpty());
		
		PptInfo pptInfo = pptService.createPPTMessage(userId, file, lecture);
		
		return ScnuResult.buildSuccess(pptInfo);
		
	}
	
	@RequestMapping("/getPPTMessageList")
	@ResponseBody
	public ScnuResult getPPTMessageList(Lecture lecture, HttpServletRequest request, HttpServletResponse response){
		
		System.out.println("�ҽ���getPPTMessageList�ϴ���");
		System.out.println("getPPTMessageList sessionUserId = " + request.getSession().getAttribute("userId"));
		
		System.out.println(lecture);
	
		Integer userId = (Integer)request.getSession().getAttribute("userId");
		
		lecture.setUserId(userId);
		
		PPTMessage pptMessage = null;
		
		try {
		pptMessage = pptService.getPPTMessageList(lecture);
		}catch(Exception e) {
			e.printStackTrace();
			return ScnuResult.buildSuccess("�������쳣");
		}
		
		return 	ScnuResult.buildSuccess(pptMessage);
		
	}
	
	@RequestMapping("/deletePPT")
	@ResponseBody
	public ScnuResult deletePPT(Integer pptId, HttpServletRequest request, HttpServletResponse response){
		
		System.out.println("�ҽ���deletePPT�ϴ���");
		System.out.println("deletePPT sessionUserId = " + request.getSession().getAttribute("userId"));
		
		Integer userId = (Integer)request.getSession().getAttribute("userId");
		
		System.out.println("pptId = " + pptId);
		
		boolean taf = pptService.deletePPT(pptId, userId);
		
		// ʧ��
		if(!taf) 
		return null;
		
		// �ɹ�
		return 	ScnuResult.buildSuccess(null);
		
	}
	
	// �õ� �б��ѯ��pptInfo List��Ϣ
	@RequestMapping("/queryLessonBrief")
	@ResponseBody
	public ScnuResult getPptInfoList(@RequestBody String prepareIds, HttpServletRequest request, HttpServletResponse response) {
		
		Integer userId = (Integer)request.getSession().getAttribute("userId");
		
		System.out.println("queryLessonBrief sessionUserId = " + request.getSession().getAttribute("userId"));
		
		System.out.println(prepareIds);
		if(prepareIds == null)
		return null;
		
		JSONObject object= JSONObject.parseObject(prepareIds);
		@SuppressWarnings("unchecked")
		List<String> pptListString = (List<String>)object.get("prepareIds");
		// ���ַ�������ת��ΪInteger����
		List<Integer> pptList = new ArrayList<Integer>();
		
		for(String a : pptListString) {
			pptList.add(Integer.parseInt(a));
		}
		
		System.out.println("��ѯpptInfo���б�");
		
		List<PptInfo> pptInfoList = pptService.getPptInfoList(pptList , userId);
		
		return ScnuResult.buildSuccess(pptInfoList);
	}
	
	@RequestMapping("/queryLessonDetail")
	@ResponseBody
	public ScnuResult getPptInfoDetail(Integer pptId, HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("queryLessonDetail sessionUserId = " + request.getSession().getAttribute("userId"));
		
		
		Integer userId = (Integer)request.getSession().getAttribute("userId");
		
		String detail = pptService.getPptInfoDetail(pptId, userId);
		
		System.out.println("��������ɹ�");
		
		return ScnuResult.buildSuccess(detail);
	}
	
	@RequestMapping("/getDownLoadPPT")
	@ResponseBody
	public ScnuResult getDownLoadPPT(Integer pptId, HttpServletRequest request, HttpServletResponse response ) {
		
		Integer userId = (Integer)request.getSession().getAttribute("userId");
		
		System.out.println("����  pptId = " + pptId);
		
		// �������ֵ
		if(pptId == null) {
			return ScnuResult.buildSuccess("pptId��ֵΪnull");
		}
		
		PptInfo pptInfo = pptService.getDownLoadUrl(pptId, userId);
		
		// ��Ҫ���ppt�ż���ִ��
		if(pptInfo == null)
		return null;
		
		String path = pptInfo.getPptHref();
		String fileName = pptInfo.getPptName();
		
		System.out.println("����·��Ϊ: " + path);
		
		if(path == null) {
			try {
				response.sendRedirect("/error.html");
				return null;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		File file = new File(path);
		System.out.println("fileName = " + fileName);

		// �ļ�������
		if(!file.exists()){
		        try {
					response.sendError(404, "��Ҫ���ص��ļ�û�ҵ�");
					return null;
				} catch (IOException e) {
					
					e.printStackTrace();
				}
		}else {
			
		try {
			//������Ӧͷ�Ϳͻ��˱����ļ���
			response.setCharacterEncoding("utf-8");
		    response.setContentType("application/x-msdownload");
		    response.setHeader("Content-Disposition", "attachment;filename=\"" + new String(fileName.getBytes("gbk"), "iso8859-1") + "\"");
		    
			InputStream inputStream = new FileInputStream(file);
			//�������ز���
	        ServletOutputStream os = response.getOutputStream();
	        
	        //ѭ��д�������
	        byte[] b = new byte[2048];
	        int length;
	        while ((length = inputStream.read(b)) != -1) {
	            os.write(b, 0, length);
	        }
	        
	     // ������Ҫ�رա�
	        os.close();
	        inputStream.close();
	        
	        System.out.println("���سɹ�");
		} catch (Exception e){
			e.printStackTrace();
		}
	  }
		return ScnuResult.buildSuccess("���سɹ�");
	}

}
