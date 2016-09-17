package com.mulin.ljf.duoduo.model;

import java.io.Serializable;
import java.util.List;

public class UserInfo_new implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9121757260560150109L;
	private UserInfo user_info;
	private List<JoinSetuan_xueyuan_zhuanye> xueyuan_zhuanye;
	public UserInfo getUser_info() {
		return user_info;
	}
	public void setUser_info(UserInfo user_info) {
		this.user_info = user_info;
	}
	public List<JoinSetuan_xueyuan_zhuanye> getXueyuan_zhuanye() {
		return xueyuan_zhuanye;
	}
	public void setXueyuan_zhuanye(List<JoinSetuan_xueyuan_zhuanye> xueyuan_zhuanye) {
		this.xueyuan_zhuanye = xueyuan_zhuanye;
	}
	
	

}