package com.nju.fastSellingDrinks.model;

public class ActivityCoupon {
    private Integer id;

    private Integer activityId;

    private Integer couponId;

    //Julin
    private CouponInfo couponInfo;

    public CouponInfo getCouponInfo() {
        return couponInfo;
    }

    public void setCouponInfo(CouponInfo couponInfo) {
        this.couponInfo = couponInfo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }
}