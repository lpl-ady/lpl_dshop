/*
 * DshopStoreBindCategoryMapper.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.service.mapper;

import com.dshop.bean.DshopStoreBindCategory;
import com.dshop.bean.example.DshopStoreBindCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DshopStoreBindCategoryMapper {
    int countByExample(DshopStoreBindCategoryExample example);

    int deleteByExample(DshopStoreBindCategoryExample example);

    int deleteByPrimaryKey(Integer sbcId);

    int insert(DshopStoreBindCategory record);

    int insertSelective(DshopStoreBindCategory record);

    List<DshopStoreBindCategory> selectByExampleWithRowbounds(DshopStoreBindCategoryExample example, RowBounds rowBounds);

    List<DshopStoreBindCategory> selectByExample(DshopStoreBindCategoryExample example);

    DshopStoreBindCategory selectByPrimaryKey(Integer sbcId);

    int updateByExampleSelective(@Param("record") DshopStoreBindCategory record, @Param("example") DshopStoreBindCategoryExample example);

    int updateByExample(@Param("record") DshopStoreBindCategory record, @Param("example") DshopStoreBindCategoryExample example);

    int updateByPrimaryKeySelective(DshopStoreBindCategory record);

    int updateByPrimaryKey(DshopStoreBindCategory record);
}