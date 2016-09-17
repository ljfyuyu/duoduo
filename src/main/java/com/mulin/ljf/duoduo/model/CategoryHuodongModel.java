package com.mulin.ljf.duoduo.model;

import java.io.Serializable;
import java.util.List;

public class CategoryHuodongModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int category_id;
	private String category_name;
	private List<HomepageModel> item;
	
	private List<CommunityModel> setuans;
	private UserDetail user_info;
	private List<MeiriNews> news;

	
	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public List<HomepageModel> getItem() {
		return item;
	}

	public void setItem(List<HomepageModel> item) {
		this.item = item;
	}

	public List<CommunityModel> getSetuans() {
		return setuans;
	}

	public void setSetuans(List<CommunityModel> setuans) {
		this.setuans = setuans;
	}



	public UserDetail getUser_info() {
		return user_info;
	}

	public void setUser_info(UserDetail user_info) {
		this.user_info = user_info;
	}

	public List<MeiriNews> getNews() {
		return news;
	}

	public void setNews(List<MeiriNews> news) {
		this.news = news;
	}

	


}
