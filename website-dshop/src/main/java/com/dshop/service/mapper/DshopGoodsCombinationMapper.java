/*
 * DshopGoodsCombinationMapper.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.service.mapper;

import com.dshop.bean.DshopGoodsCombination;
import com.dshop.bean.example.DshopGoodsCombinationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DshopGoodsCombinationMapper {
    int countByExample(DshopGoodsCombinationExample example);

    int deleteByExample(DshopGoodsCombinationExample example);

    int deleteByPrimaryKey(Integer combId);

    int insert(DshopGoodsCombination record);

    int insertSelective(DshopGoodsCombination record);

    List<DshopGoodsCombination> selectByExampleWithRowbounds(DshopGoodsCombinationExample example, RowBounds rowBounds);

    List<DshopGoodsCombination> selectByExample(DshopGoodsCombinationExample example);

    DshopGoodsCombination selectByPrimaryKey(Integer combId);

    int updateByExampleSelective(@Param("record") DshopGoodsCombination record, @Param("example") DshopGoodsCombinationExample example);

    int updateByExample(@Param("record") DshopGoodsCombination record, @Param("example") DshopGoodsCombinationExample example);

    int updateByPrimaryKeySelective(DshopGoodsCombination record);

    int updateByPrimaryKey(DshopGoodsCombination record);
}