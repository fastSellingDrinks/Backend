package com.nju.fastSellingDrinks.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nju.fastSellingDrinks.mapper.ActivityInfoMapper;
import com.nju.fastSellingDrinks.model.ActivityInfo;
import com.nju.fastSellingDrinks.model.AddressInfo;
import com.nju.fastSellingDrinks.service.ActivityInfoService;
import com.nju.fastSellingDrinks.util.Define;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityInfoServiceImpl implements ActivityInfoService {

    @Autowired
    private ActivityInfoMapper activityInfoMapper;

    @Override
    public void del(Integer id) {
        activityInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void add(ActivityInfo activityInfo) {
        activityInfoMapper.insert(activityInfo);
    }

    @Override
    public ActivityInfo update(ActivityInfo activityInfo) {
        activityInfoMapper.updateByPrimaryKey(activityInfo);
        return activityInfo;
    }

    @Override
    public PageInfo<ActivityInfo> listAll(Integer currPage) {
        if (currPage==null) currPage=1;
        PageHelper.startPage(currPage, Define.ADMIN_PRODUCT_PAGE_SIZE);
        return new PageInfo<>(activityInfoMapper.selectAll());
    }
}
