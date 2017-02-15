/*
 * DshopStoreCostMapper.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.service.mapper;

import com.dshop.bean.DshopStoreCost;
import com.dshop.bean.example.DshopStoreCostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DshopStoreCostMapper {
    int countByExample(DshopStoreCostExample example);

    int deleteByExample(DshopStoreCostExample example);

    int deleteByPrimaryKey(Integer costId);

    int insert(DshopStoreCost record);

    int insertSelective(DshopStoreCost record);

    List<DshopStoreCost> selectByExampleWithRowbounds(DshopStoreCostExample example, RowBounds rowBounds);

    List<DshopStoreCost> selectByExample(DshopStoreCostExample example);

    DshopStoreCost selectByPrimaryKey(Integer costId);

    int updateByExampleSelective(@Param("record") DshopStoreCost record, @Param("example") DshopStoreCostExample example);

    int updateByExample(@Param("record") DshopStoreCost record, @Param("example") DshopStoreCostExample example);

    int updateByPrimaryKeySelective(DshopStoreCost record);

    int updateByPrimaryKey(DshopStoreCost record);
}