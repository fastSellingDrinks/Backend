package com.nju.fastSellingDrinks.mapper;

import com.github.pagehelper.PageInfo;
import com.nju.fastSellingDrinks.model.Combination;
import java.util.List;

public interface CombinationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Combination record);

    Combination selectByPrimaryKey(Integer id);

    List<Combination> selectAll();

    int updateByPrimaryKey(Combination record);

    //Julin
    //根据套餐id查询所有套餐内所有商品
    List<Combination> selectConnAll(Integer combinationId);

    //Julin
    //评分排行
    List<Combination> rankByGrade();

}