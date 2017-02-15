package com.dshop.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dshop.bean.DshopAdmin;
import com.dshop.bean.example.DshopAdminExample;
import com.dshop.dao.AdminDao;
import com.dshop.service.mapper.DshopAdminMapper;

@Repository("adminDao")
@Transactional
public class AdminDaoImpl implements AdminDao {

	@Resource
	private DshopAdminMapper dshopAdminMapper;
	
	@Override
	public int countByExample(DshopAdminExample example) {
		return dshopAdminMapper.countByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer adminId) {
		return dshopAdminMapper.deleteByPrimaryKey(adminId);
	}

	@Override
	public int insert(DshopAdmin record) {
		return dshopAdminMapper.insert(record);
	}

	@Override
	public int insertSelective(DshopAdmin record) {
		return dshopAdminMapper.insertSelective(record);
	}

	@Override
	public List<DshopAdmin> selectByExampleWithRowbounds(
			DshopAdminExample example, RowBounds rowBounds) {
		return dshopAdminMapper.selectByExampleWithRowbounds(example, rowBounds);
	}

	@Override
	public List<DshopAdmin> selectByExample(DshopAdminExample example) {
		return dshopAdminMapper.selectByExample(example);
	}

	@Override
	public DshopAdmin selectByPrimaryKey(Integer adminId) {
		return dshopAdminMapper.selectByPrimaryKey(adminId);
	}

	@Override
	public int updateByPrimaryKey(DshopAdmin record) {
		return dshopAdminMapper.updateByPrimaryKey(record);
	}

}
