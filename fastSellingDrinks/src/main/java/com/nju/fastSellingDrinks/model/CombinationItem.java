package com.nju.fastSellingDrinks.model;

public class CombinationItem {
    private Integer id;

    private Integer combinationId;

    private Integer productId;

    private Double price;

    private Integer num;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCombinationId() {
        return combinationId;
    }

    public void setCombinationId(Integer combinationId) {
        this.combinationId = combinationId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}