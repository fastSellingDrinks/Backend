package com.nju.fastSellingDrinks.service;

import com.nju.fastSellingDrinks.model.ActivityCoupon;

import java.util.List;

public interface ActivityCouponService {

    List<ActivityCoupon> selectAllCoupon(Integer activityId);

    void del(Integer id);

    void add(ActivityCoupon activityCoupon);
}
