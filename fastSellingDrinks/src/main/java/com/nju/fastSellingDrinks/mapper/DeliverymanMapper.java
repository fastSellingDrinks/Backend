package com.nju.fastSellingDrinks.mapper;

import com.nju.fastSellingDrinks.model.Deliveryman;
import java.util.List;

public interface DeliverymanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Deliveryman record);

    Deliveryman selectByPrimaryKey(Integer id);

    List<Deliveryman> selectAll();

    int updateByPrimaryKey(Deliveryman record);
}