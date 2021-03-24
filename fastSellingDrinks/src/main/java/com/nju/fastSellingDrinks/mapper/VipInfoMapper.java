package com.nju.fastSellingDrinks.mapper;

import com.nju.fastSellingDrinks.model.VipInfo;
import java.util.List;

public interface VipInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VipInfo record);

    VipInfo selectByPrimaryKey(Integer id);

    List<VipInfo> selectAll();

    int updateByPrimaryKey(VipInfo record);
}