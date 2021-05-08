//Author Julin
package com.nju.fastSellingDrinks.service;

import com.github.pagehelper.PageInfo;
import com.nju.fastSellingDrinks.model.Combination;

import java.util.List;

public interface CombinationService {

    int add(Combination combination);

    void del(Integer id);

    Combination update(Combination combination);

    PageInfo<Combination> selConnAll(Integer currPage);

    Combination search(Integer combinationId);

    List<Combination> combinationRank();

    List<Combination> combinationRankByDiscount();

    List<Combination> combinationRankBySaleQuantity();

    PageInfo list(Integer currPage, Combination combination);
}
