package com.mulin.ljf.duoduo.model;

import java.io.Serializable;
import java.util.List;

public class SetuanDetail implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4518383984667845715L;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
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
	public int getCan_join() {
		return can_join;
	}
	public void setCan_join(int can_join) {
		this.can_join = can_join;
	}
	public String getWeburl() {
		return weburl;
	}
	public void setWeburl(String weburl) {
		this.weburl = weburl;
	}
	public List<HuodongTitle> getHuodongs() {
		return huodongs;
	}
	public void setHuodongs(List<HuodongTitle> huodongs) {
		this.huodongs = huodongs;
	}
	private String id;
	private String cover;
	private String title;
	private String shuoshuo;
	private int can_join;
	private String weburl;
	private List<HuodongTitle> huodongs;
	
}
