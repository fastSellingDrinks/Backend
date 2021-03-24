package com.nju.fastSellingDrinks.model;

import java.util.Date;

public class VipInfo {
    private Integer id;

    private Integer customerId;

    private Integer cardId;

    private Integer vipIntergal;

    private Double reminder;

    private Date startTime;

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

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public Integer getVipIntergal() {
        return vipIntergal;
    }

    public void setVipIntergal(Integer vipIntergal) {
        this.vipIntergal = vipIntergal;
    }

    public Double getReminder() {
        return reminder;
    }

    public void setReminder(Double reminder) {
        this.reminder = reminder;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
}