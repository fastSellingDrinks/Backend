package com.nju.fastSellingDrinks.service.impl;

import com.nju.fastSellingDrinks.mapper.OrderInfoMapper;
import com.nju.fastSellingDrinks.model.OrderInfo;
import com.nju.fastSellingDrinks.service.OrderInfoService;
import com.nju.fastSellingDrinks.vo.HistoryVO;
import com.nju.fastSellingDrinks.vo.OrdersSumVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderInfoServiceImpl implements OrderInfoService {

    @Autowired
    private OrderInfoMapper orderInfoMapper;

    //Julin
    @Override
    public List<OrdersSumVO> sumByMonth(OrdersSumVO ordersSumVO) {
        return orderInfoMapper.sumByMonth(ordersSumVO);
    }

    //Julin
    @Override
    public List<OrdersSumVO> sumByMonthCustomer(OrdersSumVO ordersSumVO) {
        return orderInfoMapper.sumByMonthCustomer(ordersSumVO);
    }

    /**
     * 根据顾客id查询该顾客买过的所有商品
     * @param id
     * @return
     */
    @Override
    public List<HistoryVO> selectProductHistory(Integer id) {
        return orderInfoMapper.selectProductHistory(id);
    }

    /**
     * 根据顾客id查询该顾客买过的所有套餐
     * @param id
     * @return
     */
    @Override
    public List<OrderInfo> selectCombinationHistory(Integer id) {
        return orderInfoMapper.selectCombinationHistory(id);
    }

    @Override
    public List<OrdersSumVO> sumByYear() {
        return orderInfoMapper.sumByYear();
    }

    @Override
    public List<OrdersSumVO> sumByYearCustomer(Integer customerId) {
        return orderInfoMapper.sumByYearCustomer(customerId);
    }

    @Override
    public List<OrdersSumVO> sumByWeek() {
        return orderInfoMapper.sumByWeek();
    }

    @Override
    public List<OrdersSumVO> sumByWeekCustomer(Integer customerId) {
        return orderInfoMapper.sumByWeekCustomer(customerId);
    }

    @Override
    public List<OrdersSumVO> sumByDay() {
        return orderInfoMapper.sumByDay();
    }

    @Override
    public List<OrdersSumVO> sumByDayCustomer(Integer customerId) {
        return orderInfoMapper.sumByDayCustomer(customerId);
    }
}
