package com.mulin.ljf.duoduo.model;

import java.io.Serializable;

public class JoinSetuan_zhuanye implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String zhuanye_id;
	private String title;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getZhuanye_id() {
		return zhuanye_id;
	}
	public void setZhuanye_id(String zhuanye_id) {
		this.zhuanye_id = zhuanye_id;
	}
	

}
