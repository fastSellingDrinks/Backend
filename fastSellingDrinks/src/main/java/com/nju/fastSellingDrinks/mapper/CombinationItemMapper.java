package com.nju.fastSellingDrinks.mapper;

import com.nju.fastSellingDrinks.model.CombinationItem;
import java.util.List;

public interface CombinationItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CombinationItem record);

    CombinationItem selectByPrimaryKey(Integer id);

    List<CombinationItem> selectAll();

    int updateByPrimaryKey(CombinationItem record);
}