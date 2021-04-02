package com.nju.fastSellingDrinks.Controller;

import com.nju.fastSellingDrinks.model.CustomerInfo;
import com.nju.fastSellingDrinks.service.CustomerInfoService;
import com.nju.fastSellingDrinks.vo.ResultVO;
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

    /**
     * 登录
     * @author Julin
     * @param customerInfo
     * @return
     */
    @RequestMapping("login")
    public ResultVO login(@RequestBody CustomerInfo customerInfo){
        int flag=0;
        CustomerInfo customerInfo1=customerInfoService.selByUsername(customerInfo);
        if (customerInfo1==null){
            flag=1;
        }else{
            if (!customerInfo1.getPassword().equals(customerInfo.getPassword())){
                flag=2;
            }
        }
        return new ResultVO(flag,customerInfo1);
    }
}
