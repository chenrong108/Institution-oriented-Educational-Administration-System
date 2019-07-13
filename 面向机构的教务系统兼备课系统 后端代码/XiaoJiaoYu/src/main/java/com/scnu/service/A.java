package com.scnu.service;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;

public class A {
	
	public class SendSms {
		
		public void main(String[] args) {
			DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAIGK67sA0a2fGl", "vAlG06WfuYOPEjRjhdV1Gj00ehJW3W");
			IAcsClient client = new DefaultAcsClient(profile);
			CommonRequest request = new CommonRequest();
			request.setMethod(MethodType.POST);
			request.setDomain("dysmsapi.aliyuncs.com");
			request.setVersion("2017-05-25");
			request.setAction("SendSms");
			request.putQueryParameter("RegionId", "cn-hangzhou");
			request.putQueryParameter("PhoneNumbers", "18718031863");
			request.putQueryParameter("SignName", "Reaphook");
			request.putQueryParameter("TemplateCode", "SMS_169640574");
			try {
				CommonResponse response = client.getCommonResponse(request);
				System.out.println(response.getData());
			} catch (ServerException e) {
				e.printStackTrace();
			} catch (ClientException e) {
				e.printStackTrace();
			}
		}
	}

}
