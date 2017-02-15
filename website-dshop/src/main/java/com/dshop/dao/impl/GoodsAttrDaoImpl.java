package com.dshop.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dshop.bean.DshopGoodsAttribute;
import com.dshop.bean.example.DshopGoodsAttributeExample;
import com.dshop.dao.GoodsAttrDao;
import com.dshop.service.mapper.DshopGoodsAttributeMapper;

@Repository("goodsAttrDao")
@Transactional
public class GoodsAttrDaoImpl implements GoodsAttrDao {

	@Resource
	private DshopGoodsAttributeMapper mapper;
	
	@Override
	public int countByExample(DshopGoodsAttributeExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer goodsAttrId) {
		return mapper.deleteByPrimaryKey(goodsAttrId);
	}

	@Override
	public int insert(DshopGoodsAttribute record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(DshopGoodsAttribute record) {
		return mapper.insertSelective(record);
	}

	@Override
	public List<DshopGoodsAttribute> selectByExample(
			DshopGoodsAttributeExample example) {
		return mapper.selectByExample(example);
	}

	@Override
	public DshopGoodsAttribute selectByPrimaryKey(Integer goodsAttrId) {
		return mapper.selectByPrimaryKey(goodsAttrId);
	}

	@Override
	public int updateByExampleSelective(DshopGoodsAttribute record,
			DshopGoodsAttributeExample example) {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(DshopGoodsAttribute record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

}
