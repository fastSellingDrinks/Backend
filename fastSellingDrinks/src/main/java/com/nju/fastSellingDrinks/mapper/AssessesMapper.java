package com.nju.fastSellingDrinks.mapper;

import com.nju.fastSellingDrinks.model.Assesses;
import java.util.List;

public interface AssessesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Assesses record);

    Assesses selectByPrimaryKey(Integer id);

    List<Assesses> selectAll();

    int updateByPrimaryKey(Assesses record);
}