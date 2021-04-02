package com.nju.fastSellingDrinks.service;

import com.github.pagehelper.PageInfo;
import com.nju.fastSellingDrinks.model.Combination;

import java.util.List;

public interface CombinationService {

    int add(Combination combination);

    PageInfo<Combination> selConnAll(Integer combinationId);

    Combination search(Integer combinationId);

    List<Combination> combinationRank();

}
