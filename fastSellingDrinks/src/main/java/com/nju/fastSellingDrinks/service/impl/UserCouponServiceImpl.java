package com.nju.fastSellingDrinks.service.impl;

import com.nju.fastSellingDrinks.mapper.UserCouponMapper;
import com.nju.fastSellingDrinks.model.UserCoupon;
import com.nju.fastSellingDrinks.service.UserCouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserCouponServiceImpl implements UserCouponService {

    @Autowired
    private UserCouponMapper userCouponMapper;

    @Override
    public List<UserCoupon> selectByCustomer(Integer customerId) {
        return userCouponMapper.selectByCustomer(customerId);
    }
}
