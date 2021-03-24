package com.nju.fastSellingDrinks.Controller;

import com.nju.fastSellingDrinks.model.CustomerInfo;
import com.nju.fastSellingDrinks.service.CustomerInfoService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/customer")
public class CustomerInfoController {

    @Resource
    private CustomerInfoService customerInfoService;

    /**
     * 新增顾客
     * @author Julin
     * @param customerInfo
     * @return
     */
    @RequestMapping("add")
    public String add(@RequestBody CustomerInfo customerInfo){
        customerInfoService.add(customerInfo);
        return "succ";
    }

    /**
     * 根据id搜索某顾客
     * @author Julin
     * @param id
     * @return
     */
    @RequestMapping("search/{id}")
    public CustomerInfo search(@PathVariable Integer id){
        return customerInfoService.search(id);
    }
}
