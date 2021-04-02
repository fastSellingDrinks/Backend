package com.nju.fastSellingDrinks.mapper;

import com.nju.fastSellingDrinks.model.ProductInfo;
import java.util.List;

public interface ProductInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductInfo record);

    ProductInfo selectByPrimaryKey(Integer id);

    List<ProductInfo> selectAll();

    int updateByPrimaryKey(ProductInfo record);

    //Julin
    List<ProductInfo> rankByGrade();
}