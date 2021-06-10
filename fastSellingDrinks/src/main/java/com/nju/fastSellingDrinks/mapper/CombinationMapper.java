package com.nju.fastSellingDrinks.mapper;

import com.github.pagehelper.PageInfo;
import com.nju.fastSellingDrinks.model.Combination;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CombinationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Combination record);

    Combination selectByPrimaryKey(Integer id);

    List<Combination> select(Combination combination);

    int updateByPrimaryKey(Combination record);

    //Julin
    //查询所有套餐内所有商品
    List<Combination> selectConnAll();

    //Julin
    //套餐推荐
    List<Combination> rankByGrade();

    List<Combination> rankByDiscount();

    List<Combination> rankBySaleQuantity();

    List<Combination> selectByProduct(Integer customerId);

}