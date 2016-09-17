package com.mulin.ljf.duoduo.model;

import java.util.List;

public class CommunityListModel {
	private List<CommunityModel> setuan=null;
	public List<CommunityModel> getSetuan() {
		return setuan;
	}
	public void setSetuan(List<CommunityModel> setuan) {
		this.setuan = setuan;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCtime() {
		return ctime;
	}
	public void setCtime(String ctime) {
		this.ctime = ctime;
	}
	private String title;
	private String id;
	private String ctime;
	
	

}
