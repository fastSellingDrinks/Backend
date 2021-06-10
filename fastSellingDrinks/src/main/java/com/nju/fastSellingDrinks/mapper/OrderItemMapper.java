package com.nju.fastSellingDrinks.mapper;

import com.nju.fastSellingDrinks.model.OrderItem;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderItem record);

    OrderItem selectByPrimaryKey(Integer id);

    List<OrderItem> selectAll();

    int updateByPrimaryKey(OrderItem record);
}