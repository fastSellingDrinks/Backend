package com.nju.fastSellingDrinks.service;

import com.nju.fastSellingDrinks.model.OrderInfo;
import com.nju.fastSellingDrinks.vo.OrdersSumVO;

import java.util.List;

public interface OrderInfoService {

    //Julin
    List<OrdersSumVO> sumByMonth(OrdersSumVO ordersSumVO);

    //Julin
    List<OrdersSumVO> sumByMonthCustomer(OrdersSumVO ordersSumVO);

    //Julin
    List<OrderInfo> selectProductHistory(Integer id);

    List<OrderInfo> selectCombinationHistory(Integer id);
}
