package com.nju.fastSellingDrinks.mapper;

import com.nju.fastSellingDrinks.model.ActivityInfo;
import java.util.List;

public interface ActivityInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ActivityInfo record);

    ActivityInfo selectByPrimaryKey(Integer id);

    List<ActivityInfo> selectAll();

    int updateByPrimaryKey(ActivityInfo record);
}