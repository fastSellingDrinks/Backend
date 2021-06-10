package com.nju.fastSellingDrinks.mapper;

import com.nju.fastSellingDrinks.model.ActivityInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivityInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ActivityInfo record);

    ActivityInfo selectByPrimaryKey(Integer id);

    List<ActivityInfo> selectAll();

    int updateByPrimaryKey(ActivityInfo record);

    ActivityInfo selectByCouponId(Integer couponId);
}