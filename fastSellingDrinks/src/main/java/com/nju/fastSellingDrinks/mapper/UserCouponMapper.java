package com.nju.fastSellingDrinks.mapper;

import com.nju.fastSellingDrinks.model.UserCoupon;
import java.util.List;

public interface UserCouponMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserCoupon record);

    UserCoupon selectByPrimaryKey(Integer id);

    List<UserCoupon> selectAll();

    int updateByPrimaryKey(UserCoupon record);
}