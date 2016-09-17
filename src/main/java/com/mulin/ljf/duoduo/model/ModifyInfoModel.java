package com.mulin.ljf.duoduo.model;

import java.io.Serializable;

public class ModifyInfoModel  implements Serializable  {
	private String head;
	private String hint;
	private String param;
	private String value;

	public ModifyInfoModel() {
	}

	public String getValue() {
		if(value.isEmpty())return ""; else return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getParam() {
		return param;
	}
	public void setParam(String param) {
		this.param = param;
	}
	public String getHint() {
		return hint;
	}
	public void setHint(String hint) {
		this.hint = hint;
	}
	private String url;
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	private String text;
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
}
