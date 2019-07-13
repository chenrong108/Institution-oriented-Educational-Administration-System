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
		// ������ⱻ���أ�Redis���û������������£� ֱ�ӷ���ʧ�ܣ�������ҪΪ�˼��� Controller���ѹ��
		HttpSession session = request.getSession();
		
		UserInfo user = (UserInfo)session.getAttribute("user_Info");

		// ���û��Ǵ��ڵ�¼״̬�� ��������������Ч��
		if(session.getAttribute("user_Info") != null) {
			
		//System.out.println("�����������");
		RedisSessionUtil instance = RedisSessionUtil.getInstance();
		instance.updateExpire(user.getUserId().toString() , user.getRealname());
		
		// ��������
	    //System.out.println("name = " + instance.getKey(session.getId()));

		}

		return false;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// ��������
		
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// ��������
		
	}

}
