package com.nju.fastSellingDrinks.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nju.fastSellingDrinks.mapper.CouponInfoMapper;
import com.nju.fastSellingDrinks.model.CouponInfo;
import com.nju.fastSellingDrinks.service.CouponInfoService;
import com.nju.fastSellingDrinks.util.Define;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CouponInfoServiceImpl implements CouponInfoService {

    @Autowired
    private CouponInfoMapper couponInfoMapper;

    @Override
    public void del(Integer id) {
        couponInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void add(CouponInfo couponInfo) {
        couponInfoMapper.insert(couponInfo);
    }

    @Override
    public CouponInfo update(CouponInfo couponInfo) {
        couponInfoMapper.updateByPrimaryKey(couponInfo);
        return couponInfo;
    }

    @Override
    public PageInfo<CouponInfo> listAll(Integer currPage) {
        if (currPage==null) currPage=1;
        PageHelper.startPage(currPage, Define.ADMIN_PRODUCT_PAGE_SIZE);
        return new PageInfo<>(couponInfoMapper.selectAll());
    }
}
