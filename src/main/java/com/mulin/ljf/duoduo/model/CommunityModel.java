package com.mulin.ljf.duoduo.model;

import java.io.Serializable;
import java.util.List;

public class CommunityModel implements Serializable {
	private String id;
	private String sch_id;
	private String setuan_category_id;
	private String title;
	private String cover;
	private String shuoshuo;
	private String attach_id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSch_id() {
		return sch_id;
	}

	public void setSch_id(String sch_id) {
		this.sch_id = sch_id;
	}

	public String getSetuan_category_id() {
		return setuan_category_id;
	}

	public void setSetuan_category_id(String setuan_category_id) {
		this.setuan_category_id = setuan_category_id;
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

	public String getShuoshuo() {
		return shuoshuo;
	}

	public void setShuoshuo(String shuoshuo) {
		this.shuoshuo = shuoshuo;
	}

	public String getAttach_id() {
		return attach_id;
	}

	public void setAttach_id(String attach_id) {
		this.attach_id = attach_id;
	}

	public String getSummery() {
		return summery;
	}

	public void setSummery(String summery) {
		this.summery = summery;
	}

	public String getBiaoqian_id() {
		return biaoqian_id;
	}

	public void setBiaoqian_id(String biaoqian_id) {
		this.biaoqian_id = biaoqian_id;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getIs_del() {
		return is_del;
	}

	public void setIs_del(String is_del) {
		this.is_del = is_del;
	}

	public String getCtime() {
		return ctime;
	}

	public void setCtime(String ctime) {
		this.ctime = ctime;
	}

	public String getCover_path() {
		return cover_path;
	}

	public void setCover_path(String cover_path) {
		this.cover_path = cover_path;
	}

	private String summery;
	private String biaoqian_id;
	private String uid;
	private String is_del;
	private String ctime;
	private String sch_name;

	public String getSch_name() {
		return sch_name;
	}

	public void setSch_name(String sch_name) {
		this.sch_name = sch_name;
	}

	private String cover_path;
	private List<String> attach_photo_path;

	public List<String> getAttach_photo_path() {
		return attach_photo_path;
	}

	public void setAttach_photo_path(List<String> attach_photo_path) {
		this.attach_photo_path = attach_photo_path;
	}
}
