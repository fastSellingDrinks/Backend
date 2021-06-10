package com.nju.fastSellingDrinks.model;

import java.util.Date;
import java.util.List;

public class ActivityInfo {
    private Integer id;

    private String name;

    private Date startTime;

    private Date endStart;


    //Julin 一对多关联
    private List<ActivityCoupon> activityCoupon;

    public List<ActivityCoupon> getActivityCoupon() {
        return activityCoupon;
    }

    public void setActivityCoupon(List<ActivityCoupon> activityCoupon) {
        this.activityCoupon = activityCoupon;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndStart() {
        return endStart;
    }

    public void setEndStart(Date endStart) {
        this.endStart = endStart;
    }

}