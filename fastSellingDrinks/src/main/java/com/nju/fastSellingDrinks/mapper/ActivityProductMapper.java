package com.nju.fastSellingDrinks.mapper;

import com.nju.fastSellingDrinks.model.ActivityProduct;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivityProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ActivityProduct record);

    ActivityProduct selectByPrimaryKey(Integer id);

    List<ActivityProduct> selectAll();

    int updateByPrimaryKey(ActivityProduct record);
}