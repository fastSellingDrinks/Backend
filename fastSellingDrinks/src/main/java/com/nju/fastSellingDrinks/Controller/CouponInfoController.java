package com.nju.fastSellingDrinks.Controller;

import com.github.pagehelper.PageInfo;
import com.nju.fastSellingDrinks.model.CouponInfo;
import com.nju.fastSellingDrinks.service.CouponInfoService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/coupon")
public class CouponInfoController {

    @Resource
    private CouponInfoService couponInfoService;

    @RequestMapping("del/{id}")
    public String del(@PathVariable Integer id){
        couponInfoService.del(id);
        return "success";
    }

    @RequestMapping("add")
    public String add(@RequestBody CouponInfo couponInfo){
        couponInfoService.add(couponInfo);
        return "success";
    }

    @RequestMapping("update")
    public String update(@RequestBody CouponInfo couponInfo){
        couponInfoService.update(couponInfo);
        return "success";
    }

    @RequestMapping("list/{currPage}")
    public PageInfo<CouponInfo> list(@PathVariable Integer currPage){
        return couponInfoService.listAll(currPage);
    }

    @RequestMapping("selAllCoupon")
    public List<CouponInfo> selAllCoupon(){
        return couponInfoService.selAllCoupon();
    }

    @RequestMapping("selectByDes/{description}")
    public CouponInfo selectByDes(@PathVariable String description){
        return couponInfoService.selectByDescription(description);
    }
}
