package com.nju.fastSellingDrinks.Controller;

import com.nju.fastSellingDrinks.model.OrderInfo;
import com.nju.fastSellingDrinks.service.OrderInfoService;
import com.nju.fastSellingDrinks.vo.HistoryVO;
import com.nju.fastSellingDrinks.vo.OrdersSumVO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderInfoController {

    @Resource
    private OrderInfoService orderInfoService;

    /**
     * 统计指定年份每个月的消费金额
     * @Author Julin
     */
    @RequestMapping("sumByMonth")
    public List<OrdersSumVO> sumByMonth(@RequestBody OrdersSumVO ordersSumVO){
        return orderInfoService.sumByMonth(ordersSumVO);
    }

    /**
     * 根据顾客统计指定年份每个月的消费金额
     * @Author Julin
     */
    @RequestMapping("sumByMonthCustomer")
    public List<OrdersSumVO> sumByMonthCustomer(@RequestBody OrdersSumVO ordersSumVO){
        return orderInfoService.sumByMonthCustomer(ordersSumVO);
    }

    /**
     * @Author Julin
     * @param id
     * @return
     */
    @RequestMapping("selectProductHistory/{id}")
    public List<HistoryVO> selectProductHistory(@PathVariable Integer id){

        return orderInfoService.selectProductHistory(id);
    }

    /**
     * @Author Julin
     * @param id
     * @return
     */
    @RequestMapping("selectCombinationHistory/{id}")
    public List<OrderInfo> selectCombinationHistory(@PathVariable Integer id){
        return orderInfoService.selectCombinationHistory(id);
    }

    @RequestMapping("sumByYear")
    public List<OrdersSumVO> sumByYear(){
        return orderInfoService.sumByYear();
    }

    @RequestMapping("sumByYearCustomer/{customerId}")
    public List<OrdersSumVO> sumByYearCustomer(@PathVariable Integer customerId){
        return orderInfoService.sumByYearCustomer(customerId);
    }

    @RequestMapping("sumByWeek")
    public List<OrdersSumVO> sumByWeek(){
        return orderInfoService.sumByWeek();
    }

    @RequestMapping("sumByWeekCustomer/{customerId}")
    public List<OrdersSumVO> sumByWeekCustomer(@PathVariable Integer customerId){
        return orderInfoService.sumByWeekCustomer(customerId);
    }

    @RequestMapping("sumByDay")
    public List<OrdersSumVO> sumByDay(){
        return orderInfoService.sumByDay();
    }

    @RequestMapping("sumByDayCustomer/{customerId}")
    public List<OrdersSumVO> sumByDayCustomer(@PathVariable Integer customerId){
        return orderInfoService.sumByDayCustomer(customerId);
    }


}
