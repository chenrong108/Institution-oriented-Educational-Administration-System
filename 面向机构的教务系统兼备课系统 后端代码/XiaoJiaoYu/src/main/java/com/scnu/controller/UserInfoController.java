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
	
	//�޸����룬�ֻ�������֤
	@RequestMapping(value = "/telephoneValidateCode", method = RequestMethod.POST)
	@ResponseBody
	public boolean telephoneValidateCode(HttpServletRequest request, @Param("telephone") String telephone) {
		
		System.out.println("telephoneValidateCode SessionId = " + request.getSession().getId());
		
		// ����ֻ������Ƿ����
		UserInfo user = userInfoService.isExistTelephone(telephone);
		
		HttpSession session = request.getSession();
		// �����ڸ��û�
		if(user == null) {
		   return false;
		}
		
		System.out.println("userLogin SessionId = " + request.getSession().getId());
		// ������ڸ��û�
		// ���������֤�� ������6 λ messageCode  ����108597
		String messageCode = userInfoService.generateRandomCode();
		session.setAttribute("telephone", telephone);
		session.setAttribute("messageCode", messageCode);
		System.out.println(user.getTelephone() + " ����֤��Ϊ : " + session.getAttribute("messageCode"));
		
		//���ð����ƵĶ�����֤���� 
		userInfoService.messageValidate(user.getTelephone(), messageCode);
		// ��֤����Ч��Ϊ10����
		session.setMaxInactiveInterval(600);
		
		return true;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public boolean login(HttpServletRequest request, HttpServletResponse response, @Param("userInfo") UserInfo userInfo) {
		
		response.addHeader("Access-Control-Allow-Origin", "*");
		
		System.out.println("username = " + userInfo.getUsername() + " password = " + userInfo.getPassword());
				
		UserInfo user = userInfoService.login(userInfo);	
		
		// ��¼ʧ��
		if(user == null)
		  return false;
		
//		// �µ�session ���յ�¼���û���1���µ�¼���û�Ҳ��1
//		if(request.getSession().getAttribute("user_Info") == null) {
//			System.out.println("�ҽ���A��");
//			RedisSessionUtil instance = RedisSessionUtil.getInstance();
//			instance.addByDay(request.getSession());
//			instance.addByMonth(request.getSession());
//			
//			// ����յ�¼ �� �µ�¼����
//			//System.out.println("���յ�¼: " + instance.getDayCount() + "��");
//			//System.out.println("�����ۼƵ�¼: " + instance.getMonthCount() + "��");
//		}else {
//			UserInfo user2 = (UserInfo)request.getSession().getAttribute("user_Info");
//			if(user.getUserId() != user2.getUserId()) {
//				System.out.println("����ͬһ����");
//				RedisSessionUtil instance = RedisSessionUtil.getInstance();
//				instance.addByDay(request.getSession());
//				instance.addByMonth(request.getSession());
//			}else {
//				System.out.println("��ͬһ����");
//			}
//		}

		// redis ���������Ϣ   ���沿��   �����ж�
		System.out.println("��¼��userId = " + user.getUserId());
		System.out.println("�Ự���õ�userId = " + request.getSession().getAttribute("userId"));
		
		// ����ȵ�ʱ��
		if(!user.getUserId().equals((Integer)request.getSession().getAttribute("userId"))) {
			
		// ɾ��ԭ����redis�Ự
		Cookie[] cookies = request.getCookies();
		if(cookies != null)
		for(Cookie cookie : cookies) {
		    	
		    	if(cookie.getName().equals("USER_SESSIONID")) {
		    		String cookieValue = cookie.getValue();
		    		jedisClientSingle.del(REDIS_JSESSION + cookieValue);
		    		System.out.println("ԭ����" + cookieValue + "��ɾ���ɹ�");
		    	}
		    	
		}
		
		// ���ɵ��µ�session
		String userRedis = JsonUtils.objectToJson(user);
		String userSession = Constant.generateUID();
		jedisClientSingle.set(REDIS_JSESSION + userSession, userRedis);
		jedisClientSingle.expire(REDIS_JSESSION + userSession, 1800);
		
		System.out.println("Redis SessionId = " + REDIS_JSESSION + userSession);
		
		// ����cookie�Ĵ洢ʱ��
		Cookie cookie = new Cookie("USER_SESSIONID", userSession);
		cookie.setDomain(Constant.DEMAIN);
		cookie.setPath("/");
		cookie.setMaxAge(1800);
	    response.addCookie(cookie);
		}
		
		// ��¼�ɹ�
		return true;
		
	}
	
	// �ֻ���֤���޸�����
	@RequestMapping("/updatePassword")
	@ResponseBody
	public Msg updatePasswordByTelephone(HttpServletRequest request, @Param("telephone") String telephone, @Param("code") String code, @Param("password") String password) {
		
		String messageCode = (String)request.getSession().getAttribute("messageCode");
		String Realtelephone = (String)request.getSession().getAttribute("telephone");
		// ��֤��֤��
		if(messageCode == null || Realtelephone == null)
			return Msg.ValidateFailure();
		
		// ��֤�ɹ�
		if(messageCode.equals(code) && Realtelephone.equals(telephone)){
		int num = userInfoService.UpdatePasswordByTelephone(Realtelephone, password);
		
		    // �޸ĳɹ�
		    if(num >= 1)
		    return Msg.UpdateSuccess();
		    
		    // �޸�ʧ��
		    return Msg.UpdateFailure();
		}
		
		// ��֤ʧ��
		return Msg.ValidateFailure();
		
	}
	
	@RequestMapping(value = "/online", method = RequestMethod.POST)
	@ResponseBody
	public String test(HttpServletRequest request, Integer code) {
		
		System.out.println(request.getSession().getAttribute("test"));
		
		System.out.println("���������");
		System.out.println("code = " + code);
		if(code == 1) {
	    System.out.println("��" + (count++) + "�� " + "time = " + System.currentTimeMillis());
		return "true";
		}
		
		return "false";
	}
	
	
	// α������
	@RequestMapping(value = "/isLogin")   
	@ResponseBody
	public ScnuResult isLogin(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("�����¼״̬�жϿ�����");
		
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
	    		System.out.println(cookieValue + "��ɾ���ɹ�");
	    		
	    	}
	    	
	    }
		
	    if(taf)
		return null;
	    else {
	    // ɾ���Ự
	    request.getSession().invalidate();
	    System.out.println("�Ự�Ѿ�������");
	    return ScnuResult.buildFailure("cooieɾ���ɹ�");
	    }
	}

}
