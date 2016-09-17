package com.mulin.ljf.duoduo.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by TyssenLove on 2015/10/6.
 */
public class CourseDetailModel implements Serializable {
    private String id;
    private String uid;
    private String sch_id;
    private String title;
    private String classroom;
    private String teacher;
    private String week;
    private String day;
    private String start_jiesu;
    private String jiesu_num;
    private String stime;
    private String etime;
    private String is_del;
    private String ctime;
    private List<Classmates> tongxue;
    private String jiesu;
    private int tongxue_count;

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

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getStart_jiesu() {
        return start_jiesu;
    }

    public void setStart_jiesu(String start_jiesu) {
        this.start_jiesu = start_jiesu;
    }

    public String getJiesu_num() {
        return jiesu_num;
    }

    public void setJiesu_num(String jiesu_num) {
        this.jiesu_num = jiesu_num;
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

    public List<Classmates> getTongxue() {
        return tongxue;
    }

    public void setTongxue(List<Classmates> tongxue) {
        this.tongxue = tongxue;
    }

    public String getJiesu() {
        return jiesu;
    }

    public void setJiesu(String jiesu) {
        this.jiesu = jiesu;
    }

    public int getTongxue_count() {
        return tongxue_count;
    }

    public void setTongxue_count(int tongxue_count) {
        this.tongxue_count = tongxue_count;
    }
}
