package com.dshop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dshop.bean.DshopGoodsAttribute;
import com.dshop.bean.example.DshopGoodsAttributeExample;

public interface GoodsAttrDao {

	int countByExample(DshopGoodsAttributeExample example);

    int deleteByPrimaryKey(Integer goodsAttrId);

    int insert(DshopGoodsAttribute record);

    int insertSelective(DshopGoodsAttribute record);

    List<DshopGoodsAttribute> selectByExample(DshopGoodsAttributeExample example);

    DshopGoodsAttribute selectByPrimaryKey(Integer goodsAttrId);

    int updateByExampleSelective(@Param("record") DshopGoodsAttribute record, @Param("example") DshopGoodsAttributeExample example);

    int updateByPrimaryKeySelective(DshopGoodsAttribute record);

}
