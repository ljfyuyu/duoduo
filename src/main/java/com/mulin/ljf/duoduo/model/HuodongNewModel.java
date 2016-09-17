package com.mulin.ljf.duoduo.model;

import java.io.Serializable;
import java.util.List;

public class HuodongNewModel implements Serializable {
	private String id;
	private String sch_id;
	private String title;
	private String cover;
	private String gallery;
	private List<HuodongPic> gallery_a;
	private String stime;
	private String etime;
	private String deadline;
	private String zhuban_id;
	private String xieban_id;
	private String zanzhushang;
	private String need_user_info;
	private String need_shenhe;
	private String join_status;
	private String is_need_baoming;
	
	
	public HuodongNewModel() {
	}

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
	public String getDeadline() {
		return deadline;
	}
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	public String getZhuban_id() {
		return zhuban_id;
	}
	public void setZhuban_id(String zhuban_id) {
		this.zhuban_id = zhuban_id;
	}
	public String getXieban_id() {
		return xieban_id;
	}
	public void setXieban_id(String xieban_id) {
		this.xieban_id = xieban_id;
	}
	public String getZanzhushang() {
		return zanzhushang;
	}
	public void setZanzhushang(String zanzhushang) {
		this.zanzhushang = zanzhushang;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getReadnum() {
		return readnum;
	}
	public void setReadnum(String readnum) {
		this.readnum = readnum;
	}
	public String getBaoming_num() {
		return baoming_num;
	}
	public void setBaoming_num(String baoming_num) {
		this.baoming_num = baoming_num;
	}
	public String getDigg_num() {
		return digg_num;
	}
	public void setDigg_num(String digg_num) {
		this.digg_num = digg_num;
	}
	public String getComment_num() {
		return comment_num;
	}
	public void setComment_num(String comment_num) {
		this.comment_num = comment_num;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
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
	public String getZhuban_name() {
		return zhuban_name;
	}
	public void setZhuban_name(String zhuban_name) {
		this.zhuban_name = zhuban_name;
	}
	public String getZhuban_cover() {
		return zhuban_cover;
	}
	public void setZhuban_cover(String zhuban_cover) {
		this.zhuban_cover = zhuban_cover;
	}
	public String getXieban_name() {
		return xieban_name;
	}
	public void setXieban_name(String xieban_name) {
		this.xieban_name = xieban_name;
	}
	private String area;
	private String readnum;
	private String baoming_num;
	private String digg_num;
	private String comment_num;
	private String content;
	private String uid;
	private String is_del;
	private String ctime;
	private String cover_path;
	private String zhuban_name;
	private String zhuban_cover;
	private String xieban_name;
	private String do_status;
	private String comment_username;
	private String comment_content;

	private String is_need_money;
	private String need_money;
	private String got_money;


	public List<HuodongComment> getComment() {
		return comment;
	}

	public void setComment(List<HuodongComment> comment) {
		this.comment = comment;
	}

	private List<HuodongComment> comment;

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


	public List<HuodongPic> getGallery_a() {
		return gallery_a;
	}

	public void setGallery_a(List<HuodongPic> gallery_a) {
		this.gallery_a = gallery_a;
	}

	public String getGallery() {
		return gallery;
	}

	public void setGallery(String gallery) {
		this.gallery = gallery;
	}

	public String getIs_need_money() {
		return is_need_money;
	}

	public void setIs_need_money(String is_need_money) {
		this.is_need_money = is_need_money;
	}

	public String getNeed_money() {
		return need_money;
	}

	public void setNeed_money(String need_money) {
		this.need_money = need_money;
	}

	public String getGot_money() {
		return got_money;
	}

	public void setGot_money(String got_money) {
		this.got_money = got_money;
	}

	public String getNeed_user_info() {
		return need_user_info;
	}

	public void setNeed_user_info(String need_user_info) {
		this.need_user_info = need_user_info;
	}

	public String getNeed_shenhe() {
		return need_shenhe;
	}

	public void setNeed_shenhe(String need_shenhe) {
		this.need_shenhe = need_shenhe;
	}

	public String getJoin_status() {
		return join_status;
	}

	public void setJoin_status(String join_status) {
		this.join_status = join_status;
	}

	public String getIs_need_baoming() {
		return is_need_baoming;
	}

	public void setIs_need_baoming(String is_need_baoming) {
		this.is_need_baoming = is_need_baoming;
	}
}
