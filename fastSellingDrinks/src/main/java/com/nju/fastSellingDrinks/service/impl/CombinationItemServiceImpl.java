package com.nju.fastSellingDrinks.service.impl;

import com.nju.fastSellingDrinks.mapper.CombinationItemMapper;
import com.nju.fastSellingDrinks.model.CombinationItem;
import com.nju.fastSellingDrinks.service.CombinationItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CombinationItemServiceImpl implements CombinationItemService {

    @Autowired
    private CombinationItemMapper combinationItemMapper;


    @Override
    public List<CombinationItem> selectAllCombinationItem(Integer combinationId) {
        return combinationItemMapper.selectByCombination(combinationId);
    }
}
