package com.mulin.ljf.duoduo.model;

import java.util.List;

public class CourseResponse {
	private int status;
	private String info;
	private List<CourseModel> data;

	public boolean getStatus() {
		if (status == 0) {
			return false;
		} else {
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

	public List<CourseModel> getData() {
		return data;
	}

	public void setData(List<CourseModel> data) {
		this.data = data;
	}

}
