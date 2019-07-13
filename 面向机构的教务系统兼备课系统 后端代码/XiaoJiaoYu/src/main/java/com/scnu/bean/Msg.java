package com.scnu.bean;

// ��¼��֤ģ�����Ϣ����
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
	
	// ��֤ʧ��
	public static Msg ValidateFailure() {
		Msg msg = new Msg();
		  msg.setBool(Const.FAILURE);
		  msg.setStatus(0);
          return msg;
	}
	
	// �޸�����ʧ��
	public static Msg UpdateFailure() {
		Msg msg = new Msg();
		  msg.setBool(Const.FAILURE);
		  msg.setStatus(100);
          return msg;
	}
	
	// �޸�����ɹ�
	public static Msg UpdateSuccess() {
		Msg msg = new Msg();
		  msg.setBool(Const.SUCCESS);
		  msg.setStatus(200);
          return msg;
	}

}
