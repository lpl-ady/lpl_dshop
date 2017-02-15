/*
 * DshopGoodsCategoryMapper.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.service.mapper;

import com.dshop.bean.DshopGoodsCategory;
import com.dshop.bean.DshopStoreBindCategory;
import com.dshop.bean.example.DshopGoodsCategoryExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DshopGoodsCategoryMapper {
    int countByExample(DshopGoodsCategoryExample example);

    int deleteByExample(DshopGoodsCategoryExample example);

    int deleteByPrimaryKey(Integer cateId);

    int insert(DshopGoodsCategory record);

    int insertSelective(DshopGoodsCategory record);

    List<DshopGoodsCategory> selectByExampleWithRowbounds(DshopGoodsCategoryExample example, RowBounds rowBounds);

    List<DshopGoodsCategory> selectByExample(DshopGoodsCategoryExample example);

    DshopGoodsCategory selectByPrimaryKey(Integer cateId);

    int updateByExampleSelective(@Param("record") DshopGoodsCategory record, @Param("example") DshopGoodsCategoryExample example);

    int updateByExample(@Param("record") DshopGoodsCategory record, @Param("example") DshopGoodsCategoryExample example);

    int updateByPrimaryKeySelective(DshopGoodsCategory record);

    int updateByPrimaryKey(DshopGoodsCategory record);

	List<DshopGoodsCategory> selectStoreBindCategroyByExample(DshopStoreBindCategory dbce);
}