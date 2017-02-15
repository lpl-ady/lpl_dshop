/*
 * DshopGoodsImagesMapper.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.service.mapper;

import com.dshop.bean.DshopGoodsImages;
import com.dshop.bean.example.DshopGoodsImagesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DshopGoodsImagesMapper {
    int countByExample(DshopGoodsImagesExample example);

    int deleteByExample(DshopGoodsImagesExample example);

    int deleteByPrimaryKey(Integer goodsImageId);

    int insert(DshopGoodsImages record);

    int insertSelective(DshopGoodsImages record);

    List<DshopGoodsImages> selectByExampleWithRowbounds(DshopGoodsImagesExample example, RowBounds rowBounds);

    List<DshopGoodsImages> selectByExample(DshopGoodsImagesExample example);

    DshopGoodsImages selectByPrimaryKey(Integer goodsImageId);

    int updateByExampleSelective(@Param("record") DshopGoodsImages record, @Param("example") DshopGoodsImagesExample example);

    int updateByExample(@Param("record") DshopGoodsImages record, @Param("example") DshopGoodsImagesExample example);

    int updateByPrimaryKeySelective(DshopGoodsImages record);

    int updateByPrimaryKey(DshopGoodsImages record);
}