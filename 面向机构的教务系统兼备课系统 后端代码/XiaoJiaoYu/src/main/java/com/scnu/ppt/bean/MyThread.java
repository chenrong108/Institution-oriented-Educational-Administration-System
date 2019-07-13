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
    	System.out.println("pptInfoMapper 为空");
    }else {
    	System.out.println("pptInfoMapper 不为空");
    }
    
    // 更新数据库的内容
    pptInfoMapper.updateByPrimaryKeySelective(pptInfo);
    
    // 线程休眠60s
    try {
		Thread.sleep(60000);
		if(jedisClientSingle.hincr("count", userId+"")%2 != 0)  // 单数选第一个
		{
			pptInfo.setHtmlUrl(Constant.HTML_URL);
		    System.out.println("选择第一个html");
		}
		else     // 双数选第二个
		{
		pptInfo.setHtmlUrl(Constant.HTML_URL2);
		System.out.println("选择第二个html");
		}
		// 再次更新数据库的内容 htmlUrl
		System.out.println("htmlUrl更新成功");
		pptInfoMapper.updateByPrimaryKeySelective(pptInfo);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
	}

}
