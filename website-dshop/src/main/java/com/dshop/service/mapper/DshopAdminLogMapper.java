/*
 * DshopAdminLogMapper.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.service.mapper;

import com.dshop.bean.DshopAdminLog;
import com.dshop.bean.example.DshopAdminLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DshopAdminLogMapper {
    int countByExample(DshopAdminLogExample example);

    int deleteByExample(DshopAdminLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(DshopAdminLog record);

    int insertSelective(DshopAdminLog record);

    List<DshopAdminLog> selectByExampleWithRowbounds(DshopAdminLogExample example, RowBounds rowBounds);

    List<DshopAdminLog> selectByExample(DshopAdminLogExample example);

    DshopAdminLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") DshopAdminLog record, @Param("example") DshopAdminLogExample example);

    int updateByExample(@Param("record") DshopAdminLog record, @Param("example") DshopAdminLogExample example);

    int updateByPrimaryKeySelective(DshopAdminLog record);

    int updateByPrimaryKey(DshopAdminLog record);
}