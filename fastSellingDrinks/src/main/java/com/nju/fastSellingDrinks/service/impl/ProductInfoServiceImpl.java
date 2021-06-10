package com.nju.fastSellingDrinks.service.impl;

import com.nju.fastSellingDrinks.mapper.ProductInfoMapper;
import com.nju.fastSellingDrinks.model.ProductInfo;
import com.nju.fastSellingDrinks.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductInfoServiceImpl implements ProductInfoService {

    @Autowired
    private ProductInfoMapper productInfoMapper;

    @Override
    public List<ProductInfo> productRank() {
        return productInfoMapper.rankByGrade();
    }

    @Override
    public List<ProductInfo> selectAll() {
        return productInfoMapper.selectAll();
    }

    @Override
    public ProductInfo selectById(Integer id) {
        return productInfoMapper.selectByPrimaryKey(id);
    }
}
