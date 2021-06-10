package com.nju.fastSellingDrinks.service;

import com.github.pagehelper.PageInfo;
import com.nju.fastSellingDrinks.model.ActivityInfo;

public interface ActivityInfoService {

    void del(Integer id);

    void add(ActivityInfo activityInfo);

    ActivityInfo update(ActivityInfo activityInfo);

    PageInfo<ActivityInfo> listAll(Integer currPage);

    ActivityInfo search(Integer activityId);

    ActivityInfo selectByCouponId(Integer couponId);
}
