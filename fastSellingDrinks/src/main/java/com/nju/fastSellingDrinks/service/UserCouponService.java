package com.nju.fastSellingDrinks.service;

import com.nju.fastSellingDrinks.model.UserCoupon;

import java.util.List;

public interface UserCouponService {

    List<UserCoupon> selectByCustomer(Integer customerId);
}
