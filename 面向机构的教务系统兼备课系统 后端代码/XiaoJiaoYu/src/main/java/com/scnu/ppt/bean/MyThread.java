package com.scnu.ppt.bean;

import org.springframework.web.multipart.MultipartFile;

import com.scnu.question.mapper.PptInfoMapper;
import com.scnu.service.JedisClientSingle;
import com.scnu.teach.service.PPTService;

public class MyThread implements Runnable{
	
	private PPTService pptService = new PPTService();
	
	private MultipartFile file;
	
	private Integer pptId;
	
	private Integer userId;
	
	private PptInfoMapper pptInfoMapper;
	
	private JedisClientSingle jedisClientSingle;
	
	public MyThread(MultipartFile file, Integer pptId, Integer userId) {
		this.file = file;
		this.pptId = pptId;
		this.userId = userId;
		this.pptInfoMapper = (PptInfoMapper)getBeanTool.getBeanByName("pptInfoMapper");
		this.jedisClientSingle = (JedisClientSingle)getBeanTool.getBeanByName("jedisClient");
	}

	public void run() {
		
	PptInfo pptInfo = pptService.processPPT(file, pptId, userId);
    
    if(pptInfoMapper == null) {
    	System.out.println("pptInfoMapper Ϊ��");
    }else {
    	System.out.println("pptInfoMapper ��Ϊ��");
    }
    
    // �������ݿ������
    pptInfoMapper.updateByPrimaryKeySelective(pptInfo);
    
    // �߳�����60s
    try {
		Thread.sleep(60000);
		if(jedisClientSingle.hincr("count", userId+"")%2 != 0)  // ����ѡ��һ��
		{
			pptInfo.setHtmlUrl(Constant.HTML_URL);
		    System.out.println("ѡ���һ��html");
		}
		else     // ˫��ѡ�ڶ���
		{
		pptInfo.setHtmlUrl(Constant.HTML_URL2);
		System.out.println("ѡ��ڶ���html");
		}
		// �ٴθ������ݿ������ htmlUrl
		System.out.println("htmlUrl���³ɹ�");
		pptInfoMapper.updateByPrimaryKeySelective(pptInfo);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
	}

}
