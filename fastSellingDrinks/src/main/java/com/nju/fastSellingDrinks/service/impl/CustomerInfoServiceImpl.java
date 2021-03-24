package com.nju.fastSellingDrinks.service.impl;

import com.nju.fastSellingDrinks.mapper.CustomerInfoMapper;
import com.nju.fastSellingDrinks.model.CustomerInfo;
import com.nju.fastSellingDrinks.service.CustomerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerInfoServiceImpl implements CustomerInfoService {

    @Autowired
    private CustomerInfoMapper customerInfoMapper;

    /**
     * 添加顾客
     * @author Julin
     * @param customerInfo
     */
    @Override
    public void add(CustomerInfo customerInfo) {
        customerInfoMapper.insert(customerInfo);
    }

    @Override
    public CustomerInfo search(Integer id) {
        return customerInfoMapper.selectByPrimaryKey(id);
    }
}
