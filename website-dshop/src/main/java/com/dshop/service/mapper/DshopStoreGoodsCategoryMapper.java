/*
 * DshopStoreGoodsCategoryMapper.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.service.mapper;

import com.dshop.bean.DshopStoreGoodsCategory;
import com.dshop.bean.example.DshopStoreGoodsCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DshopStoreGoodsCategoryMapper {
    int countByExample(DshopStoreGoodsCategoryExample example);

    int deleteByExample(DshopStoreGoodsCategoryExample example);

    int deleteByPrimaryKey(Integer sgcId);

    int insert(DshopStoreGoodsCategory record);

    int insertSelective(DshopStoreGoodsCategory record);

    List<DshopStoreGoodsCategory> selectByExampleWithRowbounds(DshopStoreGoodsCategoryExample example, RowBounds rowBounds);

    List<DshopStoreGoodsCategory> selectByExample(DshopStoreGoodsCategoryExample example);

    DshopStoreGoodsCategory selectByPrimaryKey(Integer sgcId);

    int updateByExampleSelective(@Param("record") DshopStoreGoodsCategory record, @Param("example") DshopStoreGoodsCategoryExample example);

    int updateByExample(@Param("record") DshopStoreGoodsCategory record, @Param("example") DshopStoreGoodsCategoryExample example);

    int updateByPrimaryKeySelective(DshopStoreGoodsCategory record);

    int updateByPrimaryKey(DshopStoreGoodsCategory record);
}