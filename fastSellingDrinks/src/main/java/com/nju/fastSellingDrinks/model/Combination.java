package com.nju.fastSellingDrinks.model;

import java.util.List;

public class Combination {
    private Integer id;

    private String name;

    private Double primaryPrice;

    private Double price;

    private Integer stockQuantity;

    private Integer saleQuantity;

    private Double grade;

    //Julin 一对多关联

    private List<CombinationItem> combinationItem;

    public List<CombinationItem> getCombinationItem() {
        return combinationItem;
    }

    public void setCombinationItem(List<CombinationItem> combinationItem) {
        this.combinationItem = combinationItem;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Double getPrimaryPrice() {
        return primaryPrice;
    }

    public void setPrimaryPrice(Double primaryPrice) {
        this.primaryPrice = primaryPrice;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public Integer getSaleQuantity() {
        return saleQuantity;
    }

    public void setSaleQuantity(Integer saleQuantity) {
        this.saleQuantity = saleQuantity;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }
}