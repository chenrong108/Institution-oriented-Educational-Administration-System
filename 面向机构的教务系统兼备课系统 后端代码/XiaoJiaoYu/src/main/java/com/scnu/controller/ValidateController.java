package com.scnu.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.scnu.bean.ValidateCode;

@Controller
@RequestMapping("/validate")
public class ValidateController {
	
	@RequestMapping(value = "/random", method = RequestMethod.POST)
	@ResponseBody
	// 返回随机验证码的base64
	public String validateCode(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		// 不让浏览器缓存
		resp.setHeader("Cache-Control", "no-cache");  
		resp.setDateHeader("Expires", 0);
		
		// 存储验证码的信息
		HttpSession session = req.getSession();
		ValidateCode vCode = new ValidateCode(110,30,4,0);
		session.setAttribute("code", vCode.getCode());
		
		ByteArrayOutputStream out=new ByteArrayOutputStream();
		String base64bytes = vCode.writeBase64(out);
		
		//System.out.println("code = " + session.getAttribute("code"));
		//String src = "data:image/png;base64," + base64bytes;
		
		return base64bytes;
	}
	
	@RequestMapping(value = "/authentication", method = RequestMethod.POST)
	@ResponseBody
	// 检验验证码填写是否正确
	public boolean authenticationCode(HttpServletRequest req, @Param("inputCode") String inputCode) {
		
		String code = (String)req.getSession().getAttribute("code");
		inputCode = inputCode.toUpperCase();
		
		if(code.equals(inputCode))
			return true;
		
		return false;
	}

}
