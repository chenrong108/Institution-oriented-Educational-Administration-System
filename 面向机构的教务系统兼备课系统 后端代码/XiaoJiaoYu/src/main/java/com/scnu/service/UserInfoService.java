package com.scnu.service;

import java.util.Random;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.scnu.bean.UserInfo;
import com.scnu.dao.UserInfoMapper;

@Service
public class UserInfoService {
	
	private char[] codeSequence = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
	
	@Autowired
	UserInfoMapper userInfoMapper;
	
	// 若存在号码返回UserInfo，否则返回null
	public UserInfo isExistTelephone(String telephone) {
		return userInfoMapper.selectByTelephone(telephone);
	}
	
	
	public UserInfo login(@Param("userInfo") UserInfo userInfo) {
		
		return userInfoMapper.selectByUsernameOrTelephone(userInfo);
	}
	
	// 随机成功6位验证码
	public String generateRandomCode() {
		
		StringBuffer sb = new StringBuffer("");
		Random random = new Random();
		for(int i = 0; i < 6; i++) {
			String strRandom = String.valueOf(codeSequence[random.nextInt(10)]);
			sb.append(strRandom);
		}
		
		String code = sb.toString();
		return code;
	}
	
	// 阿里云短信验证码服务
	public void messageValidate(String telephone, String code) {
		

        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAIGK67sA0a2fGl", "vAlG06WfuYOPEjRjhdV1Gj00ehJW3W");
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        //request.setProtocol(ProtocolType.HTTPS);
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("PhoneNumbers", telephone);
        request.putQueryParameter("SignName", "Reaphook");
        request.putQueryParameter("TemplateCode", "SMS_169640574");
        request.putQueryParameter("TemplateParam", "{\"code\":\"" + code + "\"}");
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
		
	}
	
	
	// 通过手机验证码修改密码
	public int UpdatePasswordByTelephone(String telephone, String password) {
		
		return userInfoMapper.UpdatePasswordByTelephone(telephone, password);
		
	}
	

}
