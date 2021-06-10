package com.nju.fastSellingDrinks.Controller;

import com.github.pagehelper.PageInfo;
import com.nju.fastSellingDrinks.model.ActivityInfo;
import com.nju.fastSellingDrinks.service.ActivityInfoService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/activity")
public class ActivityInfoController {

    @Resource
    private ActivityInfoService activityInfoService;

    @RequestMapping("del/{id}")
    public int del(@PathVariable Integer id){
        activityInfoService.del(id);
        return id;
    }

    @RequestMapping("add")
    public String add(@RequestBody ActivityInfo activityInfo){
        activityInfoService.add(activityInfo);
        return "success";
    }

    @RequestMapping("update")
    public String update(@RequestBody ActivityInfo activityInfo){
        activityInfoService.update(activityInfo);
        return "success";
    }

    @RequestMapping("list/{currPage}")
    public PageInfo<ActivityInfo> list(@PathVariable Integer currPage){
        return activityInfoService.listAll(currPage);
    }

    @RequestMapping("search/{activityId}")
    public ActivityInfo search(@PathVariable Integer activityId){
        return activityInfoService.search(activityId);
    }

    @RequestMapping("selectByCouponId/{couponId}")
    public ActivityInfo selectByCouponId(@PathVariable Integer couponId){
        return activityInfoService.selectByCouponId(couponId);
    }
}
