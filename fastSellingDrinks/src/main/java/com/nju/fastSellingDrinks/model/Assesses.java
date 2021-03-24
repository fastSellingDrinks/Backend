package com.nju.fastSellingDrinks.model;

public class Assesses {
    private Integer id;

    private Integer orderId;

    private Integer customerId;

    private Integer deliverymanId;

    private Integer deliverymanGrade;

    private Integer orderGrade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getDeliverymanId() {
        return deliverymanId;
    }

    public void setDeliverymanId(Integer deliverymanId) {
        this.deliverymanId = deliverymanId;
    }

    public Integer getDeliverymanGrade() {
        return deliverymanGrade;
    }

    public void setDeliverymanGrade(Integer deliverymanGrade) {
        this.deliverymanGrade = deliverymanGrade;
    }

    public Integer getOrderGrade() {
        return orderGrade;
    }

    public void setOrderGrade(Integer orderGrade) {
        this.orderGrade = orderGrade;
    }
}