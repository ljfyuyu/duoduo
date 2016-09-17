package com.mulin.ljf.duoduo.model;

import java.util.List;

/**
 * Created by Administrator on 2015/11/14.
 */
public class ClubResponse {

    private int status;
    private String info;
    private List<ClubData> data;
    public List<ClubData> getData() {
        return data;
    }
    public void setData(List<ClubData> data) {
        this.data = data;
    }
    public boolean  getStatus() {
        if(status==0)
        {
            return false;
        }else{
            return true;
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
}
