package com.mulin.ljf.duoduo.model;

import java.io.Serializable;
import java.util.List;

public class JoinSetuan_xueyuan_zhuanye implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	private String xueyuan_id;
	private String title;
	private List<JoinSetuan_zhuanye> zhuanye;
	public String getXueyuan_id() {
		return xueyuan_id;
	}
	public void setXueyuan_id(String xueyuan_id) {
		this.xueyuan_id = xueyuan_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<JoinSetuan_zhuanye> getZhuanye() {
		return zhuanye;
	}
	public void setZhuanye(List<JoinSetuan_zhuanye> zhuanye) {
		this.zhuanye = zhuanye;
	}
	
	


}
