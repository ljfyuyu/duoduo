package com.mulin.ljf.duoduo.model;

import java.io.Serializable;

public class JoinSetuan_user_info implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String uid;
	private String truename;
	private String tel;
	private String xueyan_id;
	private String zhuanye_id;
	private String nianji;
	
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getTruename() {
		return truename;
	}
	public void setTruename(String truename) {
		this.truename = truename;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getXueyan_id() {
		return xueyan_id;
	}
	public void setXueyan_id(String xueyan_id) {
		this.xueyan_id = xueyan_id;
	}
	public String getZhuanye_id() {
		return zhuanye_id;
	}
	public void setZhuanye_id(String zhuanye_id) {
		this.zhuanye_id = zhuanye_id;
	}
	public String getNianji() {
		return nianji;
	}
	public void setNianji(String nianji) {
		this.nianji = nianji;
	}
	
	


}
