package com.nju.fastSellingDrinks.service.impl;

import com.nju.fastSellingDrinks.mapper.ActivityCouponMapper;
import com.nju.fastSellingDrinks.model.ActivityCoupon;
import com.nju.fastSellingDrinks.service.ActivityCouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityCouponServiceImpl implements ActivityCouponService {

    @Autowired
    private ActivityCouponMapper activityCouponMapper;

    @Override
    public List<ActivityCoupon> selectAllCoupon(Integer activityId) {
        return activityCouponMapper.selectByActivity(activityId);
    }

    @Override
    public void del(Integer id) {
        activityCouponMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void add(ActivityCoupon activityCoupon) {
        activityCouponMapper.insert(activityCoupon);
    }
}
