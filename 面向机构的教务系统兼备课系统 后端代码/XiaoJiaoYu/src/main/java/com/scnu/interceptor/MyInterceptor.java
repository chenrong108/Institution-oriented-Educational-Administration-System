package com.scnu.interceptor;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.scnu.bean.JsonUtils;
import com.scnu.bean.ScnuResult;

public class MyInterceptor implements HandlerInterceptor {

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		if(request.getMethod().equalsIgnoreCase("OPTIONS")) {
			System.out.println("OPTIONS����������");
			return true;
		}
		
		System.out.println("�ҽ�����������");
		if(request.getSession().getAttribute("userId") != null) {
			System.out.println("���ڵ�¼״̬");
			return true;
		}
		
		// ��֤ʧ�� �����������
		System.out.println("����δ��¼״̬");
		//response.reset();
		response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json;charset=UTF-8");
        PrintWriter pw = response.getWriter();
        // û�е�¼��Ϣ
        pw.write(JsonUtils.objectToJson(ScnuResult.buildFailure("��û�е�¼")));
        pw.flush();
        pw.close();
		
		return false;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		

	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	

	}

}
