/*
 * DshopGoodsMapper.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.service.mapper;

import com.dshop.bean.DshopGoods;
import com.dshop.bean.example.DshopGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DshopGoodsMapper {
    int countByExample(DshopGoodsExample example);

    int deleteByExample(DshopGoodsExample example);

    int deleteByPrimaryKey(Integer goodsId);

    int insert(DshopGoods record);

    int insertSelective(DshopGoods record);

    List<DshopGoods> selectByExampleWithBLOBsWithRowbounds(DshopGoodsExample example, RowBounds rowBounds);

    List<DshopGoods> selectByExampleWithBLOBs(DshopGoodsExample example);

    List<DshopGoods> selectByExampleWithRowbounds(DshopGoodsExample example, RowBounds rowBounds);

    List<DshopGoods> selectByExample(DshopGoodsExample example);

    DshopGoods selectByPrimaryKey(Integer goodsId);

    int updateByExampleSelective(@Param("record") DshopGoods record, @Param("example") DshopGoodsExample example);

    int updateByExampleWithBLOBs(@Param("record") DshopGoods record, @Param("example") DshopGoodsExample example);

    int updateByExample(@Param("record") DshopGoods record, @Param("example") DshopGoodsExample example);

    int updateByPrimaryKeySelective(DshopGoods record);

    int updateByPrimaryKeyWithBLOBs(DshopGoods record);

    int updateByPrimaryKey(DshopGoods record);
}