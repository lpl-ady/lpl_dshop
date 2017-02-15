package com.dshop.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dshop.bean.DshopGoodsAttribute;
import com.dshop.bean.example.DshopGoodsAttributeExample;
import com.dshop.dao.GoodsAttrDao;
import com.dshop.service.GoodsAttrService;

@Service("goodsAttrService")
public class GoodsAttrServiceImpl implements GoodsAttrService{

	@Resource
	private GoodsAttrDao goodsAttrDao;
	
	@Override
	public int countByExample(DshopGoodsAttributeExample example) {
		return goodsAttrDao.countByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer goodsAttrId) {
		return goodsAttrDao.deleteByPrimaryKey(goodsAttrId);
	}

	@Override
	public int insert(DshopGoodsAttribute record) {
		return goodsAttrDao.insert(record);
	}

	@Override
	public int insertSelective(DshopGoodsAttribute record) {
		return goodsAttrDao.insertSelective(record);
	}

	@Override
	public List<DshopGoodsAttribute> selectByExample(
			DshopGoodsAttributeExample example) {
		return goodsAttrDao.selectByExample(example);
	}

	@Override
	public DshopGoodsAttribute selectByPrimaryKey(Integer goodsAttrId) {
		return goodsAttrDao.selectByPrimaryKey(goodsAttrId);
	}

	@Override
	public int updateByExampleSelective(DshopGoodsAttribute record,
			DshopGoodsAttributeExample example) {
		return goodsAttrDao.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(DshopGoodsAttribute record) {
		return goodsAttrDao.updateByPrimaryKeySelective(record);
	}

}
