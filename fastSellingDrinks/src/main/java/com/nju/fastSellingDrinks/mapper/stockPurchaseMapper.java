package com.nju.fastSellingDrinks.mapper;

import com.nju.fastSellingDrinks.model.stockPurchase;
import java.util.List;

public interface stockPurchaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(stockPurchase record);

    stockPurchase selectByPrimaryKey(Integer id);

    List<stockPurchase> selectAll();

    int updateByPrimaryKey(stockPurchase record);
}