package com.mulin.ljf.duoduo.rxJava.entity;



public class SchoolModel {

	private String school_id;
	private String school_name;
	public String getSchool_id() {
		return school_id;
	}
	public void setSchool_id(String school_id) {
		this.school_id = school_id;
	}
	public String getSchool_name() {
		return school_name;
	}
	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}

	public String toString(){
		return "SchoolMode.id="+school_id + " SchoolMode.name="+school_name;
	}
    	 
    	 
}
