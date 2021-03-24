package com.nju.fastSellingDrinks.mapper;

import com.nju.fastSellingDrinks.model.Combination;
import java.util.List;

public interface CombinationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Combination record);

    Combination selectByPrimaryKey(Integer id);

    List<Combination> selectAll();

    int updateByPrimaryKey(Combination record);
}