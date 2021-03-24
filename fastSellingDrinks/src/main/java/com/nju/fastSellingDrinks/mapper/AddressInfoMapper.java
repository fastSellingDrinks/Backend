package com.nju.fastSellingDrinks.mapper;

import com.nju.fastSellingDrinks.model.AddressInfo;
import java.util.List;

public interface AddressInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AddressInfo record);

    AddressInfo selectByPrimaryKey(Integer id);

    List<AddressInfo> selectAll();

    int updateByPrimaryKey(AddressInfo record);
}