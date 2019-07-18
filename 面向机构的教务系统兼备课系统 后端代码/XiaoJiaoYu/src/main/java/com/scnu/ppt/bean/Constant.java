package com.scnu.ppt.bean;

import java.io.File;
import java.util.Random;

import org.springframework.web.context.ContextLoader;

public class Constant {
	
	public static final String ROOT_PATH = ContextLoader.getCurrentWebApplicationContext().getServletContext().getRealPath("").replace("\\",File.separator);
	
	public static final String UPLOAD_ROOT_PATH = "upload";
	
	public static final String UPLOAD_IMAGE_PATH = "image";
	
    public static final String UPLOAD_PPT_PATH="ppt"; 
    
    public static final String DEMAIN = "www.chenrong.xyz";
    
    // ip
    public static final String IP = "www.chenrong.xyz";
    //public static final String IP = "localhost";
    
    public static final String PROTOCOL = "http://";
    
    // solr路径
    public static final String SOLR_URL = PROTOCOL + "localhost" + ":8983/solr/chenrong";
     
    // 上传的路径
    public static final String BASE_URL = PROTOCOL + IP + "/" + UPLOAD_ROOT_PATH;
    
    // 静态图片   端口默认80
    
    public static final String XIAO_PEI_YOU = PROTOCOL + IP + "/ppt/xiaopeiyou.png";
    
    public static final String TWO_TEACHER = PROTOCOL + IP + "/ppt/two_teacher.png";
    
    public static final String TEN = PROTOCOL + IP + "/ppt/ten.png";
    
    public static final String CONTENT_MAKING = PROTOCOL + IP + "/ppt/content_making.png";
    
    // 静态html路径
    public static final String HTML_URL = BASE_URL + "/" + "html/1/index.html"; 
    
    public static final String HTML_URL2 = BASE_URL + "/" + "html/2/index.html"; 
    
    public static final String REDIS_JSESSION = "${REDIS_JSESSION}";
    
    public static String generateUID(){
        Random random = new Random();
        String result="";
        for(int i=0;i<8;i++){
            //首字母不能为0
            result += (random.nextInt(9)+1);
        }
        return result;
    }

}
