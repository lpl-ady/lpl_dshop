/*
 * DshopStoreCategoryMapper.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.service.mapper;

import com.dshop.bean.DshopStoreCategory;
import com.dshop.bean.example.DshopStoreCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DshopStoreCategoryMapper {
    int countByExample(DshopStoreCategoryExample example);

    int deleteByExample(DshopStoreCategoryExample example);

    int deleteByPrimaryKey(Integer scId);

    int insert(DshopStoreCategory record);

    int insertSelective(DshopStoreCategory record);

    List<DshopStoreCategory> selectByExampleWithRowbounds(DshopStoreCategoryExample example, RowBounds rowBounds);

    List<DshopStoreCategory> selectByExample(DshopStoreCategoryExample example);

    DshopStoreCategory selectByPrimaryKey(Integer scId);

    int updateByExampleSelective(@Param("record") DshopStoreCategory record, @Param("example") DshopStoreCategoryExample example);

    int updateByExample(@Param("record") DshopStoreCategory record, @Param("example") DshopStoreCategoryExample example);

    int updateByPrimaryKeySelective(DshopStoreCategory record);

    int updateByPrimaryKey(DshopStoreCategory record);
}