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
			System.out.println("OPTIONS方法不拦截");
			return true;
		}
		
		System.out.println("我进来拦截器了");
		if(request.getSession().getAttribute("userId") != null) {
			System.out.println("处于登录状态");
			return true;
		}
		
		// 验证失败 的情况，返回
		System.out.println("处于未登录状态");
		//response.reset();
		response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json;charset=UTF-8");
        PrintWriter pw = response.getWriter();
        // 没有登录信息
        pw.write(JsonUtils.objectToJson(ScnuResult.buildFailure("还没有登录")));
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
