/*
 * DshopGoodsBrowseMapper.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.service.mapper;

import com.dshop.bean.DshopGoodsBrowse;
import com.dshop.bean.example.DshopGoodsBrowseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DshopGoodsBrowseMapper {
    int countByExample(DshopGoodsBrowseExample example);

    int deleteByExample(DshopGoodsBrowseExample example);

    int deleteByPrimaryKey(@Param("goodsId") Integer goodsId, @Param("memberId") Integer memberId);

    int insert(DshopGoodsBrowse record);

    int insertSelective(DshopGoodsBrowse record);

    List<DshopGoodsBrowse> selectByExampleWithRowbounds(DshopGoodsBrowseExample example, RowBounds rowBounds);

    List<DshopGoodsBrowse> selectByExample(DshopGoodsBrowseExample example);

    DshopGoodsBrowse selectByPrimaryKey(@Param("goodsId") Integer goodsId, @Param("memberId") Integer memberId);

    int updateByExampleSelective(@Param("record") DshopGoodsBrowse record, @Param("example") DshopGoodsBrowseExample example);

    int updateByExample(@Param("record") DshopGoodsBrowse record, @Param("example") DshopGoodsBrowseExample example);

    int updateByPrimaryKeySelective(DshopGoodsBrowse record);

    int updateByPrimaryKey(DshopGoodsBrowse record);
}