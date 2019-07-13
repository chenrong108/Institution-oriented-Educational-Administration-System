package com.scnu.bean;

public class UserInfo {
    private Integer userId;

    private String username;

    private String realname;

    private String password;

    private String telephone;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

	public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }
    
    @Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", username=" + username + ", realname=" + realname + ", password="
				+ password + ", telephone=" + telephone + "]";
	}
}