package com.dshop.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.dshop.bean.DshopGoods;
import com.dshop.bean.example.DshopGoodsExample;

public interface GoodsDao {

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

    int updateByExampleSelective(DshopGoods record, DshopGoodsExample example);

    int updateByExampleWithBLOBs(DshopGoods record, DshopGoodsExample example);

    int updateByExample(DshopGoods record, DshopGoodsExample example);

    int updateByPrimaryKeySelective(DshopGoods record);

    int updateByPrimaryKeyWithBLOBs(DshopGoods record);

    int updateByPrimaryKey(DshopGoods record);
}
