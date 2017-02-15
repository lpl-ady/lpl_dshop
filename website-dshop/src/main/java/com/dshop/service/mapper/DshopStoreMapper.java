/*
 * DshopStoreMapper.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.service.mapper;

import com.dshop.bean.DshopStore;
import com.dshop.bean.example.DshopStoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DshopStoreMapper {
    int countByExample(DshopStoreExample example);

    int deleteByExample(DshopStoreExample example);

    int deleteByPrimaryKey(Integer storeId);

    int insert(DshopStore record);

    int insertSelective(DshopStore record);

    List<DshopStore> selectByExampleWithBLOBsWithRowbounds(DshopStoreExample example, RowBounds rowBounds);

    List<DshopStore> selectByExampleWithBLOBs(DshopStoreExample example);

    List<DshopStore> selectByExampleWithRowbounds(DshopStoreExample example, RowBounds rowBounds);

    List<DshopStore> selectByExample(DshopStoreExample example);

    DshopStore selectByPrimaryKey(Integer storeId);

    int updateByExampleSelective(@Param("record") DshopStore record, @Param("example") DshopStoreExample example);

    int updateByExampleWithBLOBs(@Param("record") DshopStore record, @Param("example") DshopStoreExample example);

    int updateByExample(@Param("record") DshopStore record, @Param("example") DshopStoreExample example);

    int updateByPrimaryKeySelective(DshopStore record);

    int updateByPrimaryKeyWithBLOBs(DshopStore record);

    int updateByPrimaryKey(DshopStore record);
}