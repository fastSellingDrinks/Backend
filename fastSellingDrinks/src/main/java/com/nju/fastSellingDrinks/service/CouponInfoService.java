package com.nju.fastSellingDrinks.service;

import com.github.pagehelper.PageInfo;
import com.nju.fastSellingDrinks.model.CouponInfo;

public interface CouponInfoService {

    void del(Integer id);

    void add(CouponInfo couponInfo);

    CouponInfo update(CouponInfo couponInfo);

    PageInfo<CouponInfo> listAll(Integer currPage);
}
