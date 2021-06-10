package com.nju.fastSellingDrinks.mapper;

import com.nju.fastSellingDrinks.model.CustomerInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerInfo record);

    CustomerInfo selectByPrimaryKey(Integer id);

    List<CustomerInfo> selectAll();

    int updateByPrimaryKey(CustomerInfo record);

    CustomerInfo selectByUsername(String username);
}