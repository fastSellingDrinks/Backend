package com.nju.fastSellingDrinks.service;

import com.nju.fastSellingDrinks.model.ProductInfo;

import java.util.List;

public interface ProductInfoService {

    //Julin
    List<ProductInfo> productRank();

    List<ProductInfo> selectAll();

    ProductInfo selectById(Integer id);
}
