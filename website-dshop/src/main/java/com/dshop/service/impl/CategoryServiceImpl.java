package com.dshop.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import com.dshop.bean.DshopGoodsCategory;
import com.dshop.bean.DshopStoreBindCategory;
import com.dshop.bean.example.DshopGoodsCategoryExample;
import com.dshop.dao.CategoryDao;
import com.dshop.service.CategoryService;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {

	@Resource
	private CategoryDao categoryDao;
	
	@Override
	public int countByExample(DshopGoodsCategoryExample example) {
		return categoryDao.countByExample(example);
	}

	@Override
	public int insert(DshopGoodsCategory record) {
		return categoryDao.insert(record);
	}

	@Override
	public int insertSelective(DshopGoodsCategory record) {
		return categoryDao.insertSelective(record);
	}

	@Override
	public List<DshopGoodsCategory> selectByExampleWithRowbounds(
			DshopGoodsCategoryExample example, RowBounds rowBounds) {
		return categoryDao.selectByExampleWithRowbounds(example, rowBounds);
	}

	@Override
	public List<DshopGoodsCategory> selectByExample(DshopGoodsCategoryExample example) {
		return categoryDao.selectByExample(example);
	}

	@Override
	public List<DshopGoodsCategory> selectStoreBindCategroyByExample(
			DshopStoreBindCategory dbce) {
		return categoryDao.selectStoreBindCategroyByExample(dbce);
	}

}
