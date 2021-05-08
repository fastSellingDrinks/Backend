package com.nju.fastSellingDrinks.vo;

public class OrdersSumVO {

    //需要统计的用户ＩＤ
    private Integer customerId;

    //需要统计的年
    private Integer year;

    //返回的统计结果（月）
    private Integer month;

    //返回的统计结果（消费金额）
    private Double total;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
