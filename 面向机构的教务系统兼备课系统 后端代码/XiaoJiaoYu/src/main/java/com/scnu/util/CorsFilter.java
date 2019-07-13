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
//@Configuration         这3个注解的作用 等同与web.xml 中配置的过滤映射 ，可以2选1
@Component
public class CorsFilter implements Filter {
	
	private JedisClientSingle jedisClientSingle;

    public void init(FilterConfig filterConfig) throws ServletException {
 
    }
 

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)throws IOException, ServletException {
        System.out.println("Filter 过滤器 执行 了");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        
        // 获取jedisClient客户端
        this.jedisClientSingle = (JedisClientSingle)getBeanTool.getBeanByName("jedisClient");
 
        // 响应标头指定 指定可以访问资源的URI路径
        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
 
        //响应标头指定响应访问所述资源到时允许的一种或多种方法
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE");
 
        //设置 缓存可以生存的最大秒数
        response.setHeader("Access-Control-Max-Age", "3600");
 
        //设置  受支持请求标头（自定义  可以访问的请求头  例如：Token）
        response.setHeader("Access-Control-Allow-Headers", "Content-Type, x-requested-with, X-Custom-Header, HaiYi-Access-Token, Token");
 
        //自定义 可以被访问的响应头
        response.setHeader("Access-Control-Expose-Headers","checkTokenResult");
 
        // 指示的请求的响应是否可以暴露于该页面。当true值返回时它可以被暴露
        response.setHeader("Access-Control-Allow-Credentials","true");
        
        
        // 添加session
        HttpSession session = request.getSession();
        
        Cookie[] cookies = request.getCookies();
        if(cookies != null) {   // 判断cookie是否为空
        for(Cookie cookie : cookies) {
        	System.out.println("Name : " + cookie.getName());
        	System.out.println("Value : " + cookie.getValue());
        	
        	System.out.println("========================");
        	if(cookie.getName().equals("USER_SESSIONID")) {
        		System.out.println("我进来更新cookie的流程");
        		String sessionValue = cookie.getValue();
        		String userSessionValue = jedisClientSingle.get(Constant.REDIS_JSESSION + sessionValue);
        		if(userSessionValue != null) {
        			// 把redis里面的缓存信息拿出来
        			UserInfo user = JsonUtils.jsonToPojo(userSessionValue, UserInfo.class);
        			// 更新redis缓存的信息
        			jedisClientSingle.expire(Constant.REDIS_JSESSION + sessionValue, 1800);
        			System.out.println("user = " + user);
        			Integer userId = user.getUserId();
        			String userRealName = user.getRealname();
        			session.setAttribute("userId", userId);
        			session.setAttribute("userRealName", userRealName);
        			// 设置完session后跳出循环
        			
        		// 更新前端的cookie有效时间	
        		Cookie redis_Cookie = new Cookie("USER_SESSIONID", sessionValue);
        		       redis_Cookie.setDomain(Constant.DEMAIN);
        		       redis_Cookie.setPath("/");
        			   // redis_Cookie有效时间为1800s
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
 