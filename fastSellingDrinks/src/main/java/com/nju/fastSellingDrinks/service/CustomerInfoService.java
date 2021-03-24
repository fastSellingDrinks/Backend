package com.nju.fastSellingDrinks.service;

import com.nju.fastSellingDrinks.model.CustomerInfo;

public interface CustomerInfoService {

    void add(CustomerInfo customerInfo);

    CustomerInfo search(Integer id);
}
