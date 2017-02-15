/*
 * DshopAdminMapper.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.service.mapper;

import com.dshop.bean.DshopAdmin;
import com.dshop.bean.example.DshopAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DshopAdminMapper {
    int countByExample(DshopAdminExample example);

    int deleteByExample(DshopAdminExample example);

    int deleteByPrimaryKey(Integer adminId);

    int insert(DshopAdmin record);

    int insertSelective(DshopAdmin record);

    List<DshopAdmin> selectByExampleWithRowbounds(DshopAdminExample example, RowBounds rowBounds);

    List<DshopAdmin> selectByExample(DshopAdminExample example);

    DshopAdmin selectByPrimaryKey(Integer adminId);

    int updateByExampleSelective(@Param("record") DshopAdmin record, @Param("example") DshopAdminExample example);

    int updateByExample(@Param("record") DshopAdmin record, @Param("example") DshopAdminExample example);

    int updateByPrimaryKeySelective(DshopAdmin record);

    int updateByPrimaryKey(DshopAdmin record);
}