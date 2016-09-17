package com.mulin.ljf.duoduo.model;

import java.io.Serializable;

public class MyBaomingHuodongModel implements Serializable {

	private static final long serialVersionUID = -544114834015370627L;
	private String id;
	private String title;
	private String cover;
	private String zhuban;
	private String stime;
	private String etime;
	private String area;
	private String qiandao;
	private String do_status;
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
	public String getZhuban() {
		return zhuban;
	}
	public void setZhuban(String zhuban) {
		this.zhuban = zhuban;
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
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getQiandao() {
		return qiandao;
	}
	public void setQiandao(String qiandao) {
		this.qiandao = qiandao;
	}
	public String getDo_status() {
		return do_status;
	}
	public void setDo_status(String do_status) {
		this.do_status = do_status;
	}



}
