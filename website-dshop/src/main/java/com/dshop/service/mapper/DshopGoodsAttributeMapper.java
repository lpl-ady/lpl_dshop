/*
 * DshopGoodsAttributeMapper.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.service.mapper;

import com.dshop.bean.DshopGoodsAttribute;
import com.dshop.bean.example.DshopGoodsAttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DshopGoodsAttributeMapper {
    int countByExample(DshopGoodsAttributeExample example);

    int deleteByExample(DshopGoodsAttributeExample example);

    int deleteByPrimaryKey(Integer goodsAttrId);

    int insert(DshopGoodsAttribute record);

    int insertSelective(DshopGoodsAttribute record);

    List<DshopGoodsAttribute> selectByExampleWithRowbounds(DshopGoodsAttributeExample example, RowBounds rowBounds);

    List<DshopGoodsAttribute> selectByExample(DshopGoodsAttributeExample example);

    DshopGoodsAttribute selectByPrimaryKey(Integer goodsAttrId);

    int updateByExampleSelective(@Param("record") DshopGoodsAttribute record, @Param("example") DshopGoodsAttributeExample example);

    int updateByExample(@Param("record") DshopGoodsAttribute record, @Param("example") DshopGoodsAttributeExample example);

    int updateByPrimaryKeySelective(DshopGoodsAttribute record);

    int updateByPrimaryKey(DshopGoodsAttribute record);
}