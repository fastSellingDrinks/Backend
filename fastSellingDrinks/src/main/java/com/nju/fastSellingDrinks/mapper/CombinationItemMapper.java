package com.nju.fastSellingDrinks.mapper;

import com.nju.fastSellingDrinks.model.CombinationItem;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CombinationItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CombinationItem record);

    CombinationItem selectByPrimaryKey(Integer id);

    List<CombinationItem> selectAll();

    int updateByPrimaryKey(CombinationItem record);

    //根据套餐id查询套餐明细
    //Julin
    List<CombinationItem> selectByCombination(Integer combinationId);
}