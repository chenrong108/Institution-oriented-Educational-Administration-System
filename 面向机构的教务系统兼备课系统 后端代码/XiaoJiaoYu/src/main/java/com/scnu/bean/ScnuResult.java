package com.scnu.bean;

public class ScnuResult {
	
	private  Integer code;
	private  String desc;
	private  Object data;
	private  String success;
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
	
	public static ScnuResult buildSuccess(Object data) {
		ScnuResult result = new ScnuResult();
		result.setCode(200);
		result.setDesc("³É¹¦");
		result.setSuccess("true");
		result.setData(data);
		return result;
	}
	
	public static ScnuResult buildFailure(Object data) {
		ScnuResult result = new ScnuResult();
		result.setCode(400);
		result.setDesc("Ê§°Ü");
		result.setSuccess("false");
		result.setData(data);
		return result;
	}
	
	public static ScnuResult build(Integer code, String desc) {
		ScnuResult result = new ScnuResult();
		result.setCode(code);
		result.setDesc(desc);
		return result;
	}

}
