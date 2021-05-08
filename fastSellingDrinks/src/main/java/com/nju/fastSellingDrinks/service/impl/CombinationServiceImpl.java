package com.nju.fastSellingDrinks.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nju.fastSellingDrinks.mapper.CombinationItemMapper;
import com.nju.fastSellingDrinks.mapper.CombinationMapper;
import com.nju.fastSellingDrinks.model.Combination;
import com.nju.fastSellingDrinks.model.CombinationItem;
import com.nju.fastSellingDrinks.util.Define;
import com.nju.fastSellingDrinks.service.CombinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CombinationServiceImpl implements CombinationService {

    @Autowired
    private CombinationItemMapper combinationItemMapper;

    @Autowired
    private CombinationMapper combinationMapper;

    @Override
    public int add(Combination combination) {
        combinationMapper.insert(combination);
        for (CombinationItem combinationItem:combination.getCombinationItem()){
            combinationItemMapper.insert(combinationItem);
        }

        return combination.getId();
    }

    @Override
    public void del(Integer id) {
        combinationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Combination update(Combination combination) {
        combinationMapper.updateByPrimaryKey(combination);
        return combination;
    }

    @Override
    public PageInfo<Combination> selConnAll(Integer currPage) {
        if (currPage==null) currPage=1;
        PageHelper.startPage(currPage,Define.ADMIN_PRODUCT_PAGE_SIZE);
        return new PageInfo<>(combinationMapper.selectConnAll());
    }

    @Override
    public Combination search(Integer combinationId){
        return combinationMapper.selectByPrimaryKey(combinationId);
    }

    @Override
    public List<Combination> combinationRank() {
        return combinationMapper.rankByGrade();
    }

    @Override
    public List<Combination> combinationRankByDiscount() {
        return combinationMapper.rankByDiscount();
    }

    @Override
    public List<Combination> combinationRankBySaleQuantity() {
        return combinationMapper.rankBySaleQuantity();
    }

    @Override
    public PageInfo list(Integer currPage, Combination combination) {
        if (currPage ==null) currPage=1;
        PageHelper.startPage(currPage, Define.ADMIN_PRODUCT_PAGE_SIZE);
        return new PageInfo<>(combinationMapper.select(combination));
    }
}
