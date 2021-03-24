package com.nju.fastSellingDrinks.model;

import java.util.Date;

public class ActivityInfo {
    private Integer id;

    private String name;

    private Date startTime;

    private Date endStart;

    private Integer couponId;

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

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }
}