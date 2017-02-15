/*
 * DshopStoreRepeatOpenMapper.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.service.mapper;

import com.dshop.bean.DshopStoreRepeatOpen;
import com.dshop.bean.example.DshopStoreRepeatOpenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DshopStoreRepeatOpenMapper {
    int countByExample(DshopStoreRepeatOpenExample example);

    int deleteByExample(DshopStoreRepeatOpenExample example);

    int deleteByPrimaryKey(Integer repeatId);

    int insert(DshopStoreRepeatOpen record);

    int insertSelective(DshopStoreRepeatOpen record);

    List<DshopStoreRepeatOpen> selectByExampleWithRowbounds(DshopStoreRepeatOpenExample example, RowBounds rowBounds);

    List<DshopStoreRepeatOpen> selectByExample(DshopStoreRepeatOpenExample example);

    DshopStoreRepeatOpen selectByPrimaryKey(Integer repeatId);

    int updateByExampleSelective(@Param("record") DshopStoreRepeatOpen record, @Param("example") DshopStoreRepeatOpenExample example);

    int updateByExample(@Param("record") DshopStoreRepeatOpen record, @Param("example") DshopStoreRepeatOpenExample example);

    int updateByPrimaryKeySelective(DshopStoreRepeatOpen record);

    int updateByPrimaryKey(DshopStoreRepeatOpen record);
}