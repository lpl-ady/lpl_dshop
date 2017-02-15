/*
 * DshopStoreMsgTemplateMapper.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.service.mapper;

import com.dshop.bean.DshopStoreMsgTemplate;
import com.dshop.bean.example.DshopStoreMsgTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DshopStoreMsgTemplateMapper {
    int countByExample(DshopStoreMsgTemplateExample example);

    int deleteByExample(DshopStoreMsgTemplateExample example);

    int deleteByPrimaryKey(String smtCode);

    int insert(DshopStoreMsgTemplate record);

    int insertSelective(DshopStoreMsgTemplate record);

    List<DshopStoreMsgTemplate> selectByExampleWithBLOBsWithRowbounds(DshopStoreMsgTemplateExample example, RowBounds rowBounds);

    List<DshopStoreMsgTemplate> selectByExampleWithBLOBs(DshopStoreMsgTemplateExample example);

    List<DshopStoreMsgTemplate> selectByExampleWithRowbounds(DshopStoreMsgTemplateExample example, RowBounds rowBounds);

    List<DshopStoreMsgTemplate> selectByExample(DshopStoreMsgTemplateExample example);

    DshopStoreMsgTemplate selectByPrimaryKey(String smtCode);

    int updateByExampleSelective(@Param("record") DshopStoreMsgTemplate record, @Param("example") DshopStoreMsgTemplateExample example);

    int updateByExampleWithBLOBs(@Param("record") DshopStoreMsgTemplate record, @Param("example") DshopStoreMsgTemplateExample example);

    int updateByExample(@Param("record") DshopStoreMsgTemplate record, @Param("example") DshopStoreMsgTemplateExample example);

    int updateByPrimaryKeySelective(DshopStoreMsgTemplate record);

    int updateByPrimaryKeyWithBLOBs(DshopStoreMsgTemplate record);

    int updateByPrimaryKey(DshopStoreMsgTemplate record);
}