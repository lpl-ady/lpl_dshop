/*
 * DshopGoodsGiftMapper.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.service.mapper;

import com.dshop.bean.DshopGoodsGift;
import com.dshop.bean.example.DshopGoodsGiftExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DshopGoodsGiftMapper {
    int countByExample(DshopGoodsGiftExample example);

    int deleteByExample(DshopGoodsGiftExample example);

    int deleteByPrimaryKey(Integer giftId);

    int insert(DshopGoodsGift record);

    int insertSelective(DshopGoodsGift record);

    List<DshopGoodsGift> selectByExampleWithRowbounds(DshopGoodsGiftExample example, RowBounds rowBounds);

    List<DshopGoodsGift> selectByExample(DshopGoodsGiftExample example);

    DshopGoodsGift selectByPrimaryKey(Integer giftId);

    int updateByExampleSelective(@Param("record") DshopGoodsGift record, @Param("example") DshopGoodsGiftExample example);

    int updateByExample(@Param("record") DshopGoodsGift record, @Param("example") DshopGoodsGiftExample example);

    int updateByPrimaryKeySelective(DshopGoodsGift record);

    int updateByPrimaryKey(DshopGoodsGift record);
}