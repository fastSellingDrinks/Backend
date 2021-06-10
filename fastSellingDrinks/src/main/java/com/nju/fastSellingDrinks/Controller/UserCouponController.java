package com.nju.fastSellingDrinks.Controller;

import com.nju.fastSellingDrinks.model.UserCoupon;
import com.nju.fastSellingDrinks.service.UserCouponService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/userCoupon")
public class UserCouponController {

    @Resource
    private UserCouponService userCouponService;

    @RequestMapping("selectByCustomer/{customerId}")
    public List<UserCoupon> selectByCustomer(@PathVariable Integer customerId){
        return userCouponService.selectByCustomer(customerId);
    }
}
