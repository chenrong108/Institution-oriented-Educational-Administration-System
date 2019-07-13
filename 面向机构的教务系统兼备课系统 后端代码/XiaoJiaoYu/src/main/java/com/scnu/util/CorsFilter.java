package com.scnu.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.scnu.bean.JsonUtils;
import com.scnu.bean.UserInfo;
import com.scnu.ppt.bean.Constant;
import com.scnu.ppt.bean.getBeanTool;
import com.scnu.service.JedisClientSingle;
 
//@WebFilter(filterName = "CORSFilter", urlPatterns = {"/*"})
//@Order(value = 1)
//@Configuration         ��3��ע������� ��ͬ��web.xml �����õĹ���ӳ�� ������2ѡ1
@Component
public class CorsFilter implements Filter {
	
	private JedisClientSingle jedisClientSingle;

    public void init(FilterConfig filterConfig) throws ServletException {
 
    }
 

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)throws IOException, ServletException {
        System.out.println("Filter ������ ִ�� ��");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        
        // ��ȡjedisClient�ͻ���
        this.jedisClientSingle = (JedisClientSingle)getBeanTool.getBeanByName("jedisClient");
 
        // ��Ӧ��ͷָ�� ָ�����Է�����Դ��URI·��
        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
 
        //��Ӧ��ͷָ����Ӧ����������Դ��ʱ�����һ�ֻ���ַ���
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE");
 
        //���� �������������������
        response.setHeader("Access-Control-Max-Age", "3600");
 
        //����  ��֧�������ͷ���Զ���  ���Է��ʵ�����ͷ  ���磺Token��
        response.setHeader("Access-Control-Allow-Headers", "Content-Type, x-requested-with, X-Custom-Header, HaiYi-Access-Token, Token");
 
        //�Զ��� ���Ա����ʵ���Ӧͷ
        response.setHeader("Access-Control-Expose-Headers","checkTokenResult");
 
        // ָʾ���������Ӧ�Ƿ���Ա�¶�ڸ�ҳ�档��trueֵ����ʱ�����Ա���¶
        response.setHeader("Access-Control-Allow-Credentials","true");
        
        
        // ���session
        HttpSession session = request.getSession();
        
        Cookie[] cookies = request.getCookies();
        if(cookies != null) {   // �ж�cookie�Ƿ�Ϊ��
        for(Cookie cookie : cookies) {
        	System.out.println("Name : " + cookie.getName());
        	System.out.println("Value : " + cookie.getValue());
        	
        	System.out.println("========================");
        	if(cookie.getName().equals("USER_SESSIONID")) {
        		System.out.println("�ҽ�������cookie������");
        		String sessionValue = cookie.getValue();
        		String userSessionValue = jedisClientSingle.get(Constant.REDIS_JSESSION + sessionValue);
        		if(userSessionValue != null) {
        			// ��redis����Ļ�����Ϣ�ó���
        			UserInfo user = JsonUtils.jsonToPojo(userSessionValue, UserInfo.class);
        			// ����redis�������Ϣ
        			jedisClientSingle.expire(Constant.REDIS_JSESSION + sessionValue, 1800);
        			System.out.println("user = " + user);
        			Integer userId = user.getUserId();
        			String userRealName = user.getRealname();
        			session.setAttribute("userId", userId);
        			session.setAttribute("userRealName", userRealName);
        			// ������session������ѭ��
        			
        		// ����ǰ�˵�cookie��Чʱ��	
        		Cookie redis_Cookie = new Cookie("USER_SESSIONID", sessionValue);
        		       redis_Cookie.setDomain(Constant.DEMAIN);
        		       redis_Cookie.setPath("/");
        			   // redis_Cookie��Чʱ��Ϊ1800s
        		       redis_Cookie.setMaxAge(1800);
        		       response.addCookie(redis_Cookie);
        					
        			   break;
        		}
        	}
        }
        
        }
 
        filterChain.doFilter(servletRequest, servletResponse);
 
    }
 
    public void destroy() {
 
    }
}
 