package com.mulin.ljf.duoduo.model;

import java.io.Serializable;

public class HuodongHistoryModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -544114834015370627L;
	private String id;
	private String title;
	private String cover;
	private String ctime;
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
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
	public String getCtime() {
		return ctime;
	}
	public void setCtime(String ctime) {
		this.ctime = ctime;
	}



}
