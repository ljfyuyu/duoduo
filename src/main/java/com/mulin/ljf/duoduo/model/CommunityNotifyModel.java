package com.mulin.ljf.duoduo.model;

import java.util.List;

public class CommunityNotifyModel {
	private String id;
	private String is_school;
	private String title;
	private String shuoshuo;
	
	
	
	private List<CommunityNotifyTongzhi> news;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<CommunityNotifyTongzhi> getNews() {
		return news;
	}
	public void setNews(List<CommunityNotifyTongzhi> news) {
		this.news = news;
	}
	public String getIs_school() {
		return is_school;
	}
	public void setIs_school(String is_school) {
		this.is_school = is_school;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getShuoshuo() {
		return shuoshuo;
	}
	public void setShuoshuo(String shuoshuo) {
		this.shuoshuo = shuoshuo;
	}

	
}
