package com.nju.fastSellingDrinks.mapper;

import com.nju.fastSellingDrinks.model.CouponInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CouponInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CouponInfo record);

    CouponInfo selectByPrimaryKey(Integer id);

    List<CouponInfo> selectAll();

    int updateByPrimaryKey(CouponInfo record);

    CouponInfo selectByDescription(String description);

    List<CouponInfo> selectByCustomer(Integer customerId);
}