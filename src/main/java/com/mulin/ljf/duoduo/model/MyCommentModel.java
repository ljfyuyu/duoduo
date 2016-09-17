package com.mulin.ljf.duoduo.model;

import java.io.Serializable;
import java.util.List;

public class MyCommentModel implements Serializable {

	private static final long serialVersionUID = -544114834015370627L;
	private String sum_money;
	private List<MyCommentHuodongModel> comment;
	public String getSum_money() {
		return sum_money;
	}
	public void setSum_money(String sum_money) {
		this.sum_money = sum_money;
	}
	public List<MyCommentHuodongModel> getComment() {
		return comment;
	}
	public void setComment(List<MyCommentHuodongModel> comment) {
		this.comment = comment;
	}
	
}
