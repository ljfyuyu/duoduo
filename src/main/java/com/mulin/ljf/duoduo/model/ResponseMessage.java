package com.mulin.ljf.duoduo.model;

import java.util.List;

public class ResponseMessage {
	private List<MessageModel> data;
	private int status;
	private String info;
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
	public List<MessageModel> getData() {
		return data;
	}
	public void setData(List<MessageModel> data) {
		this.data = data;
	}
	
}
