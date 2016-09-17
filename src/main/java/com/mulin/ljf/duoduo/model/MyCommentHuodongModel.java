package com.mulin.ljf.duoduo.model;

import java.io.Serializable;

public class MyCommentHuodongModel implements Serializable {

	private static final long serialVersionUID = -544114834015370627L;
	private String huodong_id;
	private String title;
	private String cover;
	private String money;
	private String content;
	private String ctime;
	public String getHuodong_id() {
		return huodong_id;
	}
	public void setHuodong_id(String huodong_id) {
		this.huodong_id = huodong_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCtime() {
		return ctime;
	}
	public void setCtime(String ctime) {
		this.ctime = ctime;
	}
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}

}
