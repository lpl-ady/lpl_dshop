package com.dshop.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dshop.bean.DshopGoodsCategory;
import com.dshop.bean.DshopStoreBindCategory;
import com.dshop.bean.example.DshopGoodsCategoryExample;
import com.dshop.dao.CategoryDao;
import com.dshop.service.mapper.DshopGoodsCategoryMapper;

@Repository("categoryDao")
@Transactional
public class CategoryDaoImpl implements CategoryDao {

	@Resource
	private DshopGoodsCategoryMapper mapper;
	
	@Override
	public int countByExample(DshopGoodsCategoryExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int insert(DshopGoodsCategory record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(DshopGoodsCategory record) {
		return mapper.insertSelective(record);
	}

	@Override
	public List<DshopGoodsCategory> selectByExampleWithRowbounds(
			DshopGoodsCategoryExample example, RowBounds rowBounds) {
		return mapper.selectByExampleWithRowbounds(example, rowBounds);
	}

	@Override
	public List<DshopGoodsCategory> selectByExample(DshopGoodsCategoryExample example) {
		return mapper.selectByExample(example);
	}

	@Override
	public List<DshopGoodsCategory> selectStoreBindCategroyByExample(
			DshopStoreBindCategory dbce) {
		return mapper.selectStoreBindCategroyByExample(dbce);
	}

}
