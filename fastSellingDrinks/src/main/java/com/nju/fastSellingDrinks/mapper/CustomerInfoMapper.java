package com.nju.fastSellingDrinks.mapper;

import com.nju.fastSellingDrinks.model.CustomerInfo;
import java.util.List;

public interface CustomerInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerInfo record);

    CustomerInfo selectByPrimaryKey(Integer id);

    List<CustomerInfo> selectAll();

    int updateByPrimaryKey(CustomerInfo record);
}