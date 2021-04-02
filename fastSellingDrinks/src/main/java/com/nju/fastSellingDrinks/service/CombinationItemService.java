package com.nju.fastSellingDrinks.service;

import com.nju.fastSellingDrinks.model.CombinationItem;

import java.util.List;

public interface CombinationItemService {

    /*
    根据套餐id查询套餐明细
     */
    List<CombinationItem> selectAllCombinationItem(Integer combinationId);
}
