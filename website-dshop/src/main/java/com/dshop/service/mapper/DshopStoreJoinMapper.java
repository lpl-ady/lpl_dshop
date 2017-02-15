/*
 * DshopStoreJoinMapper.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.service.mapper;

import com.dshop.bean.DshopStoreJoin;
import com.dshop.bean.example.DshopStoreJoinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DshopStoreJoinMapper {
    int countByExample(DshopStoreJoinExample example);

    int deleteByExample(DshopStoreJoinExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(DshopStoreJoin record);

    int insertSelective(DshopStoreJoin record);

    List<DshopStoreJoin> selectByExampleWithRowbounds(DshopStoreJoinExample example, RowBounds rowBounds);

    List<DshopStoreJoin> selectByExample(DshopStoreJoinExample example);

    DshopStoreJoin selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") DshopStoreJoin record, @Param("example") DshopStoreJoinExample example);

    int updateByExample(@Param("record") DshopStoreJoin record, @Param("example") DshopStoreJoinExample example);

    int updateByPrimaryKeySelective(DshopStoreJoin record);

    int updateByPrimaryKey(DshopStoreJoin record);
}