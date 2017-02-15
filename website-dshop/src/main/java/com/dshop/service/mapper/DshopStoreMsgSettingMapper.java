/*
 * DshopStoreMsgSettingMapper.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.service.mapper;

import com.dshop.bean.DshopStoreMsgSetting;
import com.dshop.bean.example.DshopStoreMsgSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DshopStoreMsgSettingMapper {
    int countByExample(DshopStoreMsgSettingExample example);

    int deleteByExample(DshopStoreMsgSettingExample example);

    int deleteByPrimaryKey(String smtCode);

    int insert(DshopStoreMsgSetting record);

    int insertSelective(DshopStoreMsgSetting record);

    List<DshopStoreMsgSetting> selectByExampleWithRowbounds(DshopStoreMsgSettingExample example, RowBounds rowBounds);

    List<DshopStoreMsgSetting> selectByExample(DshopStoreMsgSettingExample example);

    DshopStoreMsgSetting selectByPrimaryKey(String smtCode);

    int updateByExampleSelective(@Param("record") DshopStoreMsgSetting record, @Param("example") DshopStoreMsgSettingExample example);

    int updateByExample(@Param("record") DshopStoreMsgSetting record, @Param("example") DshopStoreMsgSettingExample example);

    int updateByPrimaryKeySelective(DshopStoreMsgSetting record);

    int updateByPrimaryKey(DshopStoreMsgSetting record);
}