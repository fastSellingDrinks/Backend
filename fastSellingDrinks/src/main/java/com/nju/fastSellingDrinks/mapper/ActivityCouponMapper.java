package com.nju.fastSellingDrinks.mapper;

import com.nju.fastSellingDrinks.model.ActivityCoupon;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivityCouponMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ActivityCoupon record);

    ActivityCoupon selectByPrimaryKey(Integer id);

    List<ActivityCoupon> selectAll();

    int updateByPrimaryKey(ActivityCoupon record);

    //Julin
    List<ActivityCoupon> selectByActivity(Integer activityId);
}