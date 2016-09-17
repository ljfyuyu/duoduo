package com.mulin.ljf.duoduo.model;

import java.io.Serializable;

public class HomepageModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2589723666450005221L;
	private String id;
	private String title;
	private String cover;
	private String stime;
	private String etime;
	private String zhuban;
	private String do_status;
	private String comment_username;
	private String comment_content;
	
    	 
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
	public String getStime() {
		return stime;
	}
	public void setStime(String stime) {
		this.stime = stime;
	}
	public String getEtime() {
		return etime;
	}
	public void setEtime(String etime) {
		this.etime = etime;
	}
	public String getZhuban() {
		return zhuban;
	}
	public void setZhuban(String zhuban) {
		this.zhuban = zhuban;
	}
	public String getDo_status() {
		return do_status;
	}
	public void setDo_status(String do_status) {
		this.do_status = do_status;
	}
	public String getComment_username() {
		return comment_username;
	}
	public void setComment_username(String comment_username) {
		this.comment_username = comment_username;
	}
	public String getComment_content() {
		return comment_content;
	}
	public void setComment_content(String comment_content) {
		this.comment_content = comment_content;
	}

}
