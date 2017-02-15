package com.dshop.service.impl;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import com.dshop.bean.DshopGoods;
import com.dshop.bean.example.DshopGoodsExample;
import com.dshop.dao.GoodsDao;
import com.dshop.service.GoodsService;

@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {

	@Resource
	private GoodsDao goodsDao;

	@Override
	public int countByExample(DshopGoodsExample example) {
		return goodsDao.countByExample(example);
	}

	@Override
	public int deleteByExample(DshopGoodsExample example) {
		return goodsDao.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer goodsId) {
		return goodsDao.deleteByPrimaryKey(goodsId);
	}

	@Override
	public int insert(DshopGoods record) {
		return goodsDao.insert(record);
	}

	@Override
	public int insertSelective(DshopGoods record) {
		record.setGoodsVerify((byte)10);
		record.setGoodsDiscount(0f);
		if(null != record){
			 Class clazz = (Class)record.getClass();
			 Field[] fields= clazz.getDeclaredFields();
			 for(Field field : fields){
				 field.setAccessible(true);
				 try {
					String type = field.getType().toString();
					if(type.endsWith("String")){
						Object obj = field.get(record);
						if(null == obj)
							field.set(record, "");
					}else if(type.endsWith("int") || type.endsWith("Integer")){
						Object obj = field.get(record);
						if(null == obj)
							field.set(record,0);
					}else if(type.endsWith("byte") || type.endsWith("Byte")){
						Object obj = field.get(record);
						if(null == obj)
							field.set(record,(byte)0);
					}else if(type.endsWith("BigDecimal")){
						Object obj = field.get(record);
						if(null == obj)
							field.set(record,new BigDecimal(0));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			 }
		}
		return goodsDao.insertSelective(record);
	}

	@Override
	public List<DshopGoods> selectByExampleWithBLOBsWithRowbounds(
			DshopGoodsExample example, RowBounds rowBounds) {
		return goodsDao.selectByExampleWithBLOBsWithRowbounds(example, rowBounds);
	}

	@Override
	public List<DshopGoods> selectByExampleWithBLOBs(DshopGoodsExample example) {
		return goodsDao.selectByExampleWithBLOBs(example);
	}

	@Override
	public List<DshopGoods> selectByExampleWithRowbounds(
			DshopGoodsExample example, RowBounds rowBounds) {
		return goodsDao.selectByExampleWithRowbounds(example, rowBounds);
	}

	@Override
	public List<DshopGoods> selectByExample(DshopGoodsExample example) {
		return goodsDao.selectByExample(example);
	}

	@Override
	public DshopGoods selectByPrimaryKey(Integer goodsId) {
		return goodsDao.selectByPrimaryKey(goodsId);
	}

	@Override
	public int updateByExampleSelective(DshopGoods record,
			DshopGoodsExample example) {
		return goodsDao.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExampleWithBLOBs(DshopGoods record,
			DshopGoodsExample example) {
		return goodsDao.updateByExampleWithBLOBs(record, example);
	}

	@Override
	public int updateByExample(DshopGoods record, DshopGoodsExample example) {
		return goodsDao.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(DshopGoods record) {
		return goodsDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(DshopGoods record) {
		return goodsDao.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(DshopGoods record) {
		return goodsDao.updateByPrimaryKey(record);
	}
}
