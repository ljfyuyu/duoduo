package com.mulin.ljf.duoduo.model;

public class HeaderModel {
	private int status;
	private String info;
	private UserDetail data;
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
	public UserDetail getData() {
		return data;
	}
	public void setData(UserDetail data) {
		this.data = data;
	}
	
}
