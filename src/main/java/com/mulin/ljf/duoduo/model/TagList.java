package com.mulin.ljf.duoduo.model;

import java.io.Serializable;
import java.util.List;

public class TagList implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ptitle;
	private boolean checked=false;
	public List<SingleTag> son;
	public boolean isChecked() {
		return checked;
	}
	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	public String getPtitle() {
		return ptitle;
	}
	public void setPtitle(String ptitle) {
		this.ptitle = ptitle;
	}
	public List<SingleTag> getSon() {
		return son;
	}
	public void setSon(List<SingleTag> son) {
		this.son = son;
	}
}
