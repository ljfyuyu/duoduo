package com.mulin.ljf.duoduo.model;

import java.util.List;

public class College {
	private String xueyuan_id;
	private String title;
	private List<MajorModel> zhuanye;
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
	public List<MajorModel> getZhuanye() {
		return zhuanye;
	}
	public void setZhuanye(List<MajorModel> zhuanye) {
		this.zhuanye = zhuanye;
	}
	
}
