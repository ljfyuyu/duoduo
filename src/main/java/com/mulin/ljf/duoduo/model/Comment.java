package com.mulin.ljf.duoduo.model;

public class Comment {
	private String comment_id;
	private String table;
	private String row_id;
	private String app_uid;
	private String uid;

	private String content;
	private String to_comment_id;
	private String to_uid;

	private String data;

	public String getComment_id() {
		return comment_id;
	}

	public void setComment_id(String comment_id) {
		this.comment_id = comment_id;
	}

	public String getTable() {
		return table;
	}

	public void setTable(String table) {
		this.table = table;
	}

	public String getRow_id() {
		return row_id;
	}

	public void setRow_id(String row_id) {
		this.row_id = row_id;
	}

	public String getApp_uid() {
		return app_uid;
	}

	public void setApp_uid(String app_uid) {
		this.app_uid = app_uid;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTo_comment_id() {
		return to_comment_id;
	}

	public void setTo_comment_id(String to_comment_id) {
		this.to_comment_id = to_comment_id;
	}

	public Comment() {

	}

	public Comment(String comment_id, String table, String row_id, String app_uid, String uid, String content, String to_comment_id, String to_uid, String data, String ctime,
			String is_del, String client_type, String is_audit, String storey, String app_detail_url, String app_detail_summary, User user) {
		super();
		this.comment_id = comment_id;
		this.table = table;
		this.row_id = row_id;
		this.app_uid = app_uid;
		this.uid = uid;
		this.content = content;
		this.to_comment_id = to_comment_id;
		this.to_uid = to_uid;
		this.data = data;
		this.ctime = ctime;
		this.is_del = is_del;
		this.client_type = client_type;
		this.is_audit = is_audit;
		this.storey = storey;
		this.app_detail_url = app_detail_url;
		this.app_detail_summary = app_detail_summary;
		this.user_info = user;
	}

	public String getTo_uid() {
		return to_uid;
	}

	public void setTo_uid(String to_uid) {
		this.to_uid = to_uid;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getCtime() {
		return ctime;
	}

	public void setCtime(String ctime) {
		this.ctime = ctime;
	}

	public String getIs_del() {
		return is_del;
	}

	public void setIs_del(String is_del) {
		this.is_del = is_del;
	}

	public String getClient_type() {
		return client_type;
	}

	public void setClient_type(String client_type) {
		this.client_type = client_type;
	}

	public String getIs_audit() {
		return is_audit;
	}

	public void setIs_audit(String is_audit) {
		this.is_audit = is_audit;
	}

	public String getStorey() {
		return storey;
	}

	public void setStorey(String storey) {
		this.storey = storey;
	}

	public String getApp_detail_url() {
		return app_detail_url;
	}

	public void setApp_detail_url(String app_detail_url) {
		this.app_detail_url = app_detail_url;
	}

	public String getApp_detail_summary() {
		return app_detail_summary;
	}

	public void setApp_detail_summary(String app_detail_summary) {
		this.app_detail_summary = app_detail_summary;
	}



	private String ctime;

	private String is_del;
	private String client_type;

	private String is_audit;

	private String storey;

	private String app_detail_url;
	private String app_detail_summary;
	private User user_info;

	public User getUser_info() {
		return user_info;
	}

	public void setUser_info(User user_info) {
		this.user_info = user_info;
	}

}
