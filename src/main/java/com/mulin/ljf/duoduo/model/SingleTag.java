package com.mulin.ljf.duoduo.model;

import java.io.Serializable;

public class SingleTag implements Serializable{
	private String title;
	private String id;
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
