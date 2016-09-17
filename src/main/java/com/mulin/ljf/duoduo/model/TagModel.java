package com.mulin.ljf.duoduo.model;

import java.util.List;

public class TagModel {
	private int status;
	private String info;
	private List<TagList> data;
	public boolean  getStatus() {
		if(status==0)
		{
			return false;
		}else{
			return true;
		}
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public List<TagList> getData() {
		return data;
	}
	public void setData(List<TagList> data) {
		this.data = data;
	}
}
