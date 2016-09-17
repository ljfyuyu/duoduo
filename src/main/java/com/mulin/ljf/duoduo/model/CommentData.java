package com.mulin.ljf.duoduo.model;


/**
 * Created by Administrator on 2015/11/13.
 */
public class CommentData {
    private String id;
    private String uid;
    private String huodong_id;
    private String content;
    private String digg_num;
    private String ctime;
    private UserCommentInfo userInfo;

    public CommentData() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getHuodongId() {
        return huodong_id;
    }

    public void setHuodongId(String huodong_id) {
        this.huodong_id = huodong_id;
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

    public String getDiggNum() {
        return digg_num;
    }

    public void setDiggNum(String digg_num) {
        this.digg_num = digg_num;
    }

    public UserCommentInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserCommentInfo userInfo) {
        this.userInfo = userInfo;
    }
}
