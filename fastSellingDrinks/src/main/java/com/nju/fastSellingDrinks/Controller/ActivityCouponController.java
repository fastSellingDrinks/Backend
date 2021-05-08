package com.nju.fastSellingDrinks.Controller;

import com.nju.fastSellingDrinks.model.ActivityCoupon;
import com.nju.fastSellingDrinks.service.ActivityCouponService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/activityCoupon")
public class ActivityCouponController {

    @Resource
    private ActivityCouponService activityCouponService;

    @RequestMapping("list/{activityId}")
    public List<ActivityCoupon> list(@PathVariable Integer activityId){
        return activityCouponService.selectAllCoupon(activityId);
    }

    @RequestMapping("del/{id}")
    public int del(@PathVariable Integer id){
        activityCouponService.del(id);
        return id;
    }

    @RequestMapping("add")
    public String add(@RequestBody ActivityCoupon activityCoupon){
        activityCouponService.add(activityCoupon);
        return "success";
    }
}
