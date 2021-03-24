package com.nju.fastSellingDrinks.model;

import java.util.Date;

public class OrderInfo {
    private Integer id;

    private Integer customerId;

    private Date orderTime;

    private Date payTime;

    private Double logisticsFee;

    private Integer productId;

    private Integer productCount;

    private Double productAmountTotal;

    private Double orderAmountTotal;

    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Double getLogisticsFee() {
        return logisticsFee;
    }

    public void setLogisticsFee(Double logisticsFee) {
        this.logisticsFee = logisticsFee;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public Double getProductAmountTotal() {
        return productAmountTotal;
    }

    public void setProductAmountTotal(Double productAmountTotal) {
        this.productAmountTotal = productAmountTotal;
    }

    public Double getOrderAmountTotal() {
        return orderAmountTotal;
    }

    public void setOrderAmountTotal(Double orderAmountTotal) {
        this.orderAmountTotal = orderAmountTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}