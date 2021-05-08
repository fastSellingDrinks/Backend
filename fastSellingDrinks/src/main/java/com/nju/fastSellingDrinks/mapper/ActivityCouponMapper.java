package com.nju.fastSellingDrinks.mapper;

import com.nju.fastSellingDrinks.model.ActivityCoupon;
import java.util.List;

public interface ActivityCouponMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ActivityCoupon record);

    ActivityCoupon selectByPrimaryKey(Integer id);

    List<ActivityCoupon> selectAll();

    int updateByPrimaryKey(ActivityCoupon record);

    //Julin
    List<ActivityCoupon> selectByActivity(Integer activityId);
}