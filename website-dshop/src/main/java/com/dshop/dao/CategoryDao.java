package com.dshop.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.dshop.bean.DshopGoodsCategory;
import com.dshop.bean.DshopStoreBindCategory;
import com.dshop.bean.example.DshopGoodsCategoryExample;

public interface CategoryDao {

	int countByExample(DshopGoodsCategoryExample example);

    int insert(DshopGoodsCategory record);

    int insertSelective(DshopGoodsCategory record);

    List<DshopGoodsCategory> selectByExampleWithRowbounds(DshopGoodsCategoryExample example, RowBounds rowBounds);

    List<DshopGoodsCategory> selectByExample(DshopGoodsCategoryExample example);

	List<DshopGoodsCategory> selectStoreBindCategroyByExample(
			DshopStoreBindCategory dbce);
}
