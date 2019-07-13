package com.scnu.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.scnu.bean.Msg;
import com.scnu.bean.ScnuResult;
import com.scnu.bean.UserInfo;
import com.scnu.ppt.bean.Constant;
import com.scnu.service.JedisClientSingle;
import com.scnu.service.UserInfoService;
import com.scnu.util.JsonUtils;

@Controller
@RequestMapping("/user")
public class UserInfoController {
	
	public static int count = 0;
	
	@Autowired
	UserInfoService userInfoService;
	
	@Autowired
	private JedisClientSingle jedisClientSingle;
	
	@Value("${REDIS_JSESSION}")
	private String REDIS_JSESSION;
	
	//修改密码，手机号码验证
	@RequestMapping(value = "/telephoneValidateCode", method = RequestMethod.POST)
	@ResponseBody
	public boolean telephoneValidateCode(HttpServletRequest request, @Param("telephone") String telephone) {
		
		System.out.println("telephoneValidateCode SessionId = " + request.getSession().getId());
		
		// 检查手机号码是否存在
		UserInfo user = userInfoService.isExistTelephone(telephone);
		
		HttpSession session = request.getSession();
		// 不存在该用户
		if(user == null) {
		   return false;
		}
		
		System.out.println("userLogin SessionId = " + request.getSession().getId());
		// 否则存在该用户
		// 随机生成验证码 ，返回6 位 messageCode  例如108597
		String messageCode = userInfoService.generateRandomCode();
		session.setAttribute("telephone", telephone);
		session.setAttribute("messageCode", messageCode);
		System.out.println(user.getTelephone() + " 的验证码为 : " + session.getAttribute("messageCode"));
		
		//调用阿里云的短信验证服务 
		userInfoService.messageValidate(user.getTelephone(), messageCode);
		// 验证码有效期为10分钟
		session.setMaxInactiveInterval(600);
		
		return true;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public boolean login(HttpServletRequest request, HttpServletResponse response, @Param("userInfo") UserInfo userInfo) {
		
		response.addHeader("Access-Control-Allow-Origin", "*");
		
		System.out.println("username = " + userInfo.getUsername() + " password = " + userInfo.getPassword());
				
		UserInfo user = userInfoService.login(userInfo);	
		
		// 登录失败
		if(user == null)
		  return false;
		
//		// 新的session ，日登录的用户加1，月登录的用户也加1
//		if(request.getSession().getAttribute("user_Info") == null) {
//			System.out.println("我进来A了");
//			RedisSessionUtil instance = RedisSessionUtil.getInstance();
//			instance.addByDay(request.getSession());
//			instance.addByMonth(request.getSession());
//			
//			// 输出日登录 、 月登录人数
//			//System.out.println("当日登录: " + instance.getDayCount() + "人");
//			//System.out.println("当月累计登录: " + instance.getMonthCount() + "人");
//		}else {
//			UserInfo user2 = (UserInfo)request.getSession().getAttribute("user_Info");
//			if(user.getUserId() != user2.getUserId()) {
//				System.out.println("不是同一个人");
//				RedisSessionUtil instance = RedisSessionUtil.getInstance();
//				instance.addByDay(request.getSession());
//				instance.addByMonth(request.getSession());
//			}else {
//				System.out.println("是同一个人");
//			}
//		}

		// redis 保存个人信息   缓存部分   先做判断
		System.out.println("登录的userId = " + user.getUserId());
		System.out.println("会话设置的userId = " + request.getSession().getAttribute("userId"));
		
		// 不相等的时候
		if(!user.getUserId().equals((Integer)request.getSession().getAttribute("userId"))) {
			
		// 删除原来的redis会话
		Cookie[] cookies = request.getCookies();
		if(cookies != null)
		for(Cookie cookie : cookies) {
		    	
		    	if(cookie.getName().equals("USER_SESSIONID")) {
		    		String cookieValue = cookie.getValue();
		    		jedisClientSingle.del(REDIS_JSESSION + cookieValue);
		    		System.out.println("原来的" + cookieValue + "被删除成功");
		    	}
		    	
		}
		
		// 生成的新的session
		String userRedis = JsonUtils.objectToJson(user);
		String userSession = Constant.generateUID();
		jedisClientSingle.set(REDIS_JSESSION + userSession, userRedis);
		jedisClientSingle.expire(REDIS_JSESSION + userSession, 1800);
		
		System.out.println("Redis SessionId = " + REDIS_JSESSION + userSession);
		
		// 更新cookie的存储时间
		Cookie cookie = new Cookie("USER_SESSIONID", userSession);
		cookie.setDomain(Constant.DEMAIN);
		cookie.setPath("/");
		cookie.setMaxAge(1800);
	    response.addCookie(cookie);
		}
		
		// 登录成功
		return true;
		
	}
	
	// 手机验证码修改密码
	@RequestMapping("/updatePassword")
	@ResponseBody
	public Msg updatePasswordByTelephone(HttpServletRequest request, @Param("telephone") String telephone, @Param("code") String code, @Param("password") String password) {
		
		String messageCode = (String)request.getSession().getAttribute("messageCode");
		String Realtelephone = (String)request.getSession().getAttribute("telephone");
		// 验证验证码
		if(messageCode == null || Realtelephone == null)
			return Msg.ValidateFailure();
		
		// 验证成功
		if(messageCode.equals(code) && Realtelephone.equals(telephone)){
		int num = userInfoService.UpdatePasswordByTelephone(Realtelephone, password);
		
		    // 修改成功
		    if(num >= 1)
		    return Msg.UpdateSuccess();
		    
		    // 修改失败
		    return Msg.UpdateFailure();
		}
		
		// 验证失败
		return Msg.ValidateFailure();
		
	}
	
	@RequestMapping(value = "/online", method = RequestMethod.POST)
	@ResponseBody
	public String test(HttpServletRequest request, Integer code) {
		
		System.out.println(request.getSession().getAttribute("test"));
		
		System.out.println("心跳包检测");
		System.out.println("code = " + code);
		if(code == 1) {
	    System.out.println("第" + (count++) + "次 " + "time = " + System.currentTimeMillis());
		return "true";
		}
		
		return "false";
	}
	
	
	// 伪拦截器
	@RequestMapping(value = "/isLogin")   
	@ResponseBody
	public ScnuResult isLogin(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("进入登录状态判断控制器");
		
		if(request.getSession().getAttribute("userId") == null)
		return ScnuResult.buildFailure(false);
		
		return ScnuResult.buildSuccess(true);
		
	}
	
	
	@RequestMapping(value = "/deleteSession")
	@ResponseBody
	public ScnuResult deleteSession(HttpServletRequest request, HttpServletResponse response) {
		
		Cookie[] cookies = request.getCookies();
		boolean taf = true;
	    for(Cookie cookie : cookies) {
	    	
	    	if(cookie.getName().equals("USER_SESSIONID")) {
	    		taf = false;
	    		String cookieValue = cookie.getValue();
	    		jedisClientSingle.del(REDIS_JSESSION + cookieValue);
	    		System.out.println(cookieValue + "被删除成功");
	    		
	    	}
	    	
	    }
		
	    if(taf)
		return null;
	    else {
	    // 删除会话
	    request.getSession().invalidate();
	    System.out.println("会话已经被销毁");
	    return ScnuResult.buildFailure("cooie删除成功");
	    }
	}

}
