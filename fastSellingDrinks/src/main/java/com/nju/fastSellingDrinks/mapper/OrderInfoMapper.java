package com.nju.fastSellingDrinks.mapper;

import com.nju.fastSellingDrinks.model.OrderInfo;
import java.util.List;

public interface OrderInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderInfo record);

    OrderInfo selectByPrimaryKey(Integer id);

    List<OrderInfo> selectAll();

    int updateByPrimaryKey(OrderInfo record);
}