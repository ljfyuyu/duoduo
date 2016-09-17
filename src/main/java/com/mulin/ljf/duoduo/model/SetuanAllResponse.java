package com.mulin.ljf.duoduo.model;

import java.util.List;


public class SetuanAllResponse {

    private int status;
    private String info;
    private List<SetuanAll> data;
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
	public List<SetuanAll> getData() {
		return data;
	}
	public void setData(List<SetuanAll> data) {
		this.data = data;
	}
}
