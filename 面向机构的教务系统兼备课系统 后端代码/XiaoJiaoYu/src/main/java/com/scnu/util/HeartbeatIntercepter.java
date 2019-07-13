package com.scnu.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.scnu.bean.UserInfo;

public class HeartbeatIntercepter implements HandlerInterceptor{

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// 心跳检测被拦截，Redis的用户在线人数更新， 直接返回失败，拦截主要为了减轻 Controller层的压力
		HttpSession session = request.getSession();
		
		UserInfo user = (UserInfo)session.getAttribute("user_Info");

		// 该用户是处于登录状态， 更新心跳检测的有效期
		if(session.getAttribute("user_Info") != null) {
			
		//System.out.println("进入心跳检测");
		RedisSessionUtil instance = RedisSessionUtil.getInstance();
		instance.updateExpire(user.getUserId().toString() , user.getRealname());
		
		// 不会乱码
	    //System.out.println("name = " + instance.getKey(session.getId()));

		}

		return false;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// 不作处理
		
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// 不作处理
		
	}

}
