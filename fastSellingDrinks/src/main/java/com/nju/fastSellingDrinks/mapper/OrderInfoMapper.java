package com.nju.fastSellingDrinks.mapper;

import com.github.pagehelper.PageInfo;
import com.nju.fastSellingDrinks.model.OrderInfo;
import com.nju.fastSellingDrinks.vo.OrdersSumVO;

import java.util.List;

public interface OrderInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderInfo record);

    OrderInfo selectByPrimaryKey(Integer id);

    List<OrderInfo> selectAll();

    int updateByPrimaryKey(OrderInfo record);


    //Julin
    List<OrdersSumVO> sumByMonth(OrdersSumVO ordersSumVO);

    //Julin
    List<OrdersSumVO> sumByMonthCustomer(OrdersSumVO ordersSumVO);

    //Julin
    List<OrderInfo> selectProductHistory(Integer id);

    List<OrderInfo> selectCombinationHistory(Integer id);
}