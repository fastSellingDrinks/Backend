package com.nju.fastSellingDrinks.mapper;

import com.nju.fastSellingDrinks.model.CouponInfo;
import java.util.List;

public interface CouponInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CouponInfo record);

    CouponInfo selectByPrimaryKey(Integer id);

    List<CouponInfo> selectAll();

    int updateByPrimaryKey(CouponInfo record);
}