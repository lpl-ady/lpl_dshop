/*
 * DshopStoreMsgMapper.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.service.mapper;

import com.dshop.bean.DshopStoreMsg;
import com.dshop.bean.example.DshopStoreMsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DshopStoreMsgMapper {
    int countByExample(DshopStoreMsgExample example);

    int deleteByExample(DshopStoreMsgExample example);

    int deleteByPrimaryKey(Integer storeMsgId);

    int insert(DshopStoreMsg record);

    int insertSelective(DshopStoreMsg record);

    List<DshopStoreMsg> selectByExampleWithRowbounds(DshopStoreMsgExample example, RowBounds rowBounds);

    List<DshopStoreMsg> selectByExample(DshopStoreMsgExample example);

    DshopStoreMsg selectByPrimaryKey(Integer storeMsgId);

    int updateByExampleSelective(@Param("record") DshopStoreMsg record, @Param("example") DshopStoreMsgExample example);

    int updateByExample(@Param("record") DshopStoreMsg record, @Param("example") DshopStoreMsgExample example);

    int updateByPrimaryKeySelective(DshopStoreMsg record);

    int updateByPrimaryKey(DshopStoreMsg record);
}