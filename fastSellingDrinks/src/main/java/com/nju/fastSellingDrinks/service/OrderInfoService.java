package com.nju.fastSellingDrinks.service;

import com.nju.fastSellingDrinks.model.OrderInfo;
import com.nju.fastSellingDrinks.vo.HistoryVO;
import com.nju.fastSellingDrinks.vo.OrdersSumVO;

import java.util.List;

public interface OrderInfoService {

    //Julin
    List<OrdersSumVO> sumByMonth(OrdersSumVO ordersSumVO);

    //Julin
    List<OrdersSumVO> sumByMonthCustomer(OrdersSumVO ordersSumVO);

    //Julin
    List<HistoryVO> selectProductHistory(Integer id);

    List<OrderInfo> selectCombinationHistory(Integer id);

    List<OrdersSumVO> sumByYear();

    List<OrdersSumVO> sumByYearCustomer(Integer customerId);

    List<OrdersSumVO> sumByWeek();

    List<OrdersSumVO> sumByWeekCustomer(Integer customerId);

    List<OrdersSumVO> sumByDay();

    List<OrdersSumVO> sumByDayCustomer(Integer customerId);
}
