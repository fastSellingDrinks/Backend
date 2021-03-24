package com.nju.fastSellingDrinks.model;

import java.util.Date;

public class OrderLogistics {
    private Integer id;

    private Integer orderId;

    private Integer deliverymanId;

    private String expressNo;

    private String name;

    private String address;

    private String phone;

    private Date predictArriveTime;

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

    public Integer getDeliverymanId() {
        return deliverymanId;
    }

    public void setDeliverymanId(Integer deliverymanId) {
        this.deliverymanId = deliverymanId;
    }

    public String getExpressNo() {
        return expressNo;
    }

    public void setExpressNo(String expressNo) {
        this.expressNo = expressNo == null ? null : expressNo.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Date getPredictArriveTime() {
        return predictArriveTime;
    }

    public void setPredictArriveTime(Date predictArriveTime) {
        this.predictArriveTime = predictArriveTime;
    }
}