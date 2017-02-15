package com.dshop.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dshop.bean.DshopGoods;
import com.dshop.bean.example.DshopGoodsExample;
import com.dshop.dao.GoodsDao;
import com.dshop.service.mapper.DshopGoodsMapper;

@Repository("goodsDao")  
@Transactional
public class GoodsDaoImpl implements GoodsDao {

	@Resource
	private DshopGoodsMapper dshopGoodsMapper;

	@Override
	public int countByExample(DshopGoodsExample example) {
		return dshopGoodsMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(DshopGoodsExample example) {
		return dshopGoodsMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer goodsId) {
		return dshopGoodsMapper.deleteByPrimaryKey(goodsId);
	}

	@Override
	public int insert(DshopGoods record) {
		return dshopGoodsMapper.insert(record);
	}

	@Override
	public int insertSelective(DshopGoods record) {
		return dshopGoodsMapper.insertSelective(record);
	}

	@Override
	public List<DshopGoods> selectByExampleWithBLOBsWithRowbounds(
			DshopGoodsExample example, RowBounds rowBounds) {
		return dshopGoodsMapper.selectByExampleWithBLOBsWithRowbounds(example, rowBounds);
	}

	@Override
	public List<DshopGoods> selectByExampleWithBLOBs(DshopGoodsExample example) {
		return dshopGoodsMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public List<DshopGoods> selectByExampleWithRowbounds(
			DshopGoodsExample example, RowBounds rowBounds) {
		return dshopGoodsMapper.selectByExampleWithRowbounds(example, rowBounds);
	}

	@Override
	public List<DshopGoods> selectByExample(DshopGoodsExample example) {
		return dshopGoodsMapper.selectByExample(example);
	}

	@Override
	public DshopGoods selectByPrimaryKey(Integer goodsId) {
		return dshopGoodsMapper.selectByPrimaryKey(goodsId);
	}

	@Override
	public int updateByExampleSelective(DshopGoods record,
			DshopGoodsExample example) {
		return dshopGoodsMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExampleWithBLOBs(DshopGoods record,
			DshopGoodsExample example) {
		return dshopGoodsMapper.updateByExampleWithBLOBs(record, example);
	}

	@Override
	public int updateByExample(DshopGoods record, DshopGoodsExample example) {
		return dshopGoodsMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(DshopGoods record) {
		return dshopGoodsMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(DshopGoods record) {
		return dshopGoodsMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(DshopGoods record) {
		return dshopGoodsMapper.updateByPrimaryKey(record);
	}
	
	
}
