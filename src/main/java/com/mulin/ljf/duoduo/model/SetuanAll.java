package com.mulin.ljf.duoduo.model;

import java.util.List;


public class SetuanAll {

	private String id;
	private String title;
	private String ctime;
	private List<Setuan> setuan;
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
	public List<Setuan> getSetuan() {
		return setuan;
	}
	public void setSetuan(List<Setuan> setuan) {
		this.setuan = setuan;
	}

}
