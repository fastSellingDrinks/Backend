package com.nju.fastSellingDrinks.service.impl;

import com.nju.fastSellingDrinks.mapper.CombinationMapper;
import com.nju.fastSellingDrinks.mapper.ProductInfoMapper;
import com.nju.fastSellingDrinks.model.Combination;
import com.nju.fastSellingDrinks.model.ProductInfo;
import com.nju.fastSellingDrinks.service.CombinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CombinationServiceImpl implements CombinationService {

    @Autowired
    private ProductInfoMapper productInfoMapper;

    @Autowired
    private CombinationMapper combinationMapper;

    @Override
    public int add(Combination combination) {
        combinationMapper.insert(combination);
        for (ProductInfo productInfo:combination.getProductInfo()){
            productInfoMapper.insert(productInfo);
        }

        return combination.getId();
    }
}
