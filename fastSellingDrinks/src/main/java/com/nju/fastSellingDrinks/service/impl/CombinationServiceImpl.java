package com.nju.fastSellingDrinks.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nju.fastSellingDrinks.mapper.CombinationItemMapper;
import com.nju.fastSellingDrinks.mapper.CombinationMapper;
import com.nju.fastSellingDrinks.mapper.OrderInfoMapper;
import com.nju.fastSellingDrinks.model.Combination;
import com.nju.fastSellingDrinks.model.CombinationItem;
import com.nju.fastSellingDrinks.model.OrderInfo;
import com.nju.fastSellingDrinks.util.Define;
import com.nju.fastSellingDrinks.service.CombinationService;
import com.nju.fastSellingDrinks.vo.HistoryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CombinationServiceImpl implements CombinationService {

    @Autowired
    private CombinationItemMapper combinationItemMapper;

    @Autowired
    private CombinationMapper combinationMapper;

    @Autowired
    private OrderInfoMapper orderInfoMapper;

    @Override
    public int add(Combination combination) {
        combinationMapper.insert(combination);
        for (CombinationItem combinationItem:combination.getCombinationItem()){
            combinationItem.setCombinationId(combination.getId());
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
        for(CombinationItem combinationItem:combination.getCombinationItem()){
            combinationItemMapper.updateByPrimaryKey(combinationItem);
        }
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
    public List<Combination> mayBeLike(Integer customerId) {
        List<Combination> combinations = new ArrayList<>();
        List<HistoryVO> productList = orderInfoMapper.selectProductHistory(customerId);
        for(HistoryVO product: productList){
            int id = product.getProductId();
            combinationMapper.selectByProduct(id);

            combinations.addAll(combinationMapper.selectByProduct(id));
        }
        return combinations;
    }

    @Override
    public PageInfo list(Integer currPage, Combination combination) {
        if (currPage ==null) currPage=1;
        PageHelper.startPage(currPage, Define.ADMIN_PRODUCT_PAGE_SIZE);
        return new PageInfo<>(combinationMapper.select(combination));
    }
}
