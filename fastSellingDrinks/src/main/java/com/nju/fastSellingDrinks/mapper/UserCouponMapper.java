package com.nju.fastSellingDrinks.mapper;

import com.nju.fastSellingDrinks.model.UserCoupon;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserCouponMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserCoupon record);

    UserCoupon selectByPrimaryKey(Integer id);

    List<UserCoupon> selectAll();

    int updateByPrimaryKey(UserCoupon record);

    List<UserCoupon> selectByCustomer(Integer customerId);
}