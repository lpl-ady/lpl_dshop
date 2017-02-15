/*
 * DshopGoodsFcodeMapper.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.service.mapper;

import com.dshop.bean.DshopGoodsFcode;
import com.dshop.bean.example.DshopGoodsFcodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DshopGoodsFcodeMapper {
    int countByExample(DshopGoodsFcodeExample example);

    int deleteByExample(DshopGoodsFcodeExample example);

    int deleteByPrimaryKey(Integer fcodeId);

    int insert(DshopGoodsFcode record);

    int insertSelective(DshopGoodsFcode record);

    List<DshopGoodsFcode> selectByExampleWithRowbounds(DshopGoodsFcodeExample example, RowBounds rowBounds);

    List<DshopGoodsFcode> selectByExample(DshopGoodsFcodeExample example);

    DshopGoodsFcode selectByPrimaryKey(Integer fcodeId);

    int updateByExampleSelective(@Param("record") DshopGoodsFcode record, @Param("example") DshopGoodsFcodeExample example);

    int updateByExample(@Param("record") DshopGoodsFcode record, @Param("example") DshopGoodsFcodeExample example);

    int updateByPrimaryKeySelective(DshopGoodsFcode record);

    int updateByPrimaryKey(DshopGoodsFcode record);
}