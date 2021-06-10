package com.nju.fastSellingDrinks.mapper;

import com.nju.fastSellingDrinks.model.ProductInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductInfo record);

    ProductInfo selectByPrimaryKey(Integer id);

    List<ProductInfo> selectAll();

    int updateByPrimaryKey(ProductInfo record);

    //Julin
    List<ProductInfo> rankByGrade();
}