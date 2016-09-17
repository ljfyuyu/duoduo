package com.mulin.ljf.duoduo.model;

public class Response {
	private int status;
	private String info;
	private String data;
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
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
}
