package com.nju.fastSellingDrinks.mapper;

import com.nju.fastSellingDrinks.model.OrderLogistics;
import java.util.List;

public interface OrderLogisticsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderLogistics record);

    OrderLogistics selectByPrimaryKey(Integer id);

    List<OrderLogistics> selectAll();

    int updateByPrimaryKey(OrderLogistics record);
}