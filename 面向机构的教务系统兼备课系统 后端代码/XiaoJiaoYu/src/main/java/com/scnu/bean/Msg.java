package com.scnu.bean;

// 登录验证模块的信息返回
public class Msg {
	
	public boolean bool;
	
	public int status;

	public boolean isBool() {
		return bool;
	}

	public void setBool(boolean bool) {
		this.bool = bool;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	// 验证失败
	public static Msg ValidateFailure() {
		Msg msg = new Msg();
		  msg.setBool(Const.FAILURE);
		  msg.setStatus(0);
          return msg;
	}
	
	// 修改密码失败
	public static Msg UpdateFailure() {
		Msg msg = new Msg();
		  msg.setBool(Const.FAILURE);
		  msg.setStatus(100);
          return msg;
	}
	
	// 修改密码成功
	public static Msg UpdateSuccess() {
		Msg msg = new Msg();
		  msg.setBool(Const.SUCCESS);
		  msg.setStatus(200);
          return msg;
	}

}
