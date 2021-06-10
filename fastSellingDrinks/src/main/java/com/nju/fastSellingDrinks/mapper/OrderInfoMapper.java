package com.nju.fastSellingDrinks.mapper;

import com.github.pagehelper.PageInfo;
import com.nju.fastSellingDrinks.model.OrderInfo;
import com.nju.fastSellingDrinks.vo.HistoryVO;
import com.nju.fastSellingDrinks.vo.OrdersSumVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
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
    List<HistoryVO> selectProductHistory(Integer id);

    List<OrderInfo> selectCombinationHistory(Integer id);

    List<OrdersSumVO> sumByYear();

    List<OrdersSumVO> sumByYearCustomer(Integer customer);

    List<OrdersSumVO> sumByWeek();

    List<OrdersSumVO> sumByWeekCustomer(Integer customerId);

    List<OrdersSumVO> sumByDay();

    List<OrdersSumVO> sumByDayCustomer(Integer customerId);
}