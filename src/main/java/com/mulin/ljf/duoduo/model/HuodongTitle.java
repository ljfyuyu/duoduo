package com.mulin.ljf.duoduo.model;

import java.io.Serializable;

public class HuodongTitle implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -480426239781396085L;
	private String id;
	private String title;
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
	public String getCtime() {
		return ctime;
	}
	public void setCtime(String ctime) {
		this.ctime = ctime;
	}
	 


}
