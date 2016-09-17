package com.mulin.ljf.duoduo.model;

import java.io.Serializable;
import java.util.List;

public class JoinSetuan implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private List<JoinSetuan_xueyuan_zhuanye> xueyuan_zhuanye;
	private JoinSetuan_user_info user_info;
	public List<JoinSetuan_xueyuan_zhuanye> getXueyuan_zhuanye() {
		return xueyuan_zhuanye;
	}
	public void setXueyuan_zhuanye(List<JoinSetuan_xueyuan_zhuanye> xueyuan_zhuanye) {
		this.xueyuan_zhuanye = xueyuan_zhuanye;
	}
	public JoinSetuan_user_info getUser_info() {
		return user_info;
	}
	public void setUser_info(JoinSetuan_user_info user_info) {
		this.user_info = user_info;
	}
	


}
