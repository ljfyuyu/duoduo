package com.mulin.ljf.duoduo.model;

import java.util.List;

/**
 * Created by Administrator on 2015/11/13.
 */
public class CommentResponse {
    private int status;
    private String info;
    private List<CommentData> data;
    public boolean getStatus() {
        if(status==1)
        {
            return true;
        }else
        {
            return false;
        }

    }
    public void setStatus(int status) {
        this.status = status;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
    public List<CommentData> getData() {
        return data;
    }
    public void setData(List<CommentData> data) {
        this.data = data;
    }
}
