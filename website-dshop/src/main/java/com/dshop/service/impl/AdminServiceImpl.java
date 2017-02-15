package com.dshop.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import com.dshop.bean.DshopAdmin;
import com.dshop.bean.example.DshopAdminExample;
import com.dshop.dao.AdminDao;
import com.dshop.service.AdminService;

@Service("adminService")
public class AdminServiceImpl implements AdminService {

	@Resource
	private AdminDao adminDao;
	
	@Override
	public int countByExample(DshopAdminExample example) {
		return adminDao.countByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer adminId) {
		return adminDao.deleteByPrimaryKey(adminId);
	}

	@Override
	public int insert(DshopAdmin record) {
		return adminDao.insert(record);
	}

	@Override
	public int insertSelective(DshopAdmin record) {
		return adminDao.insertSelective(record);
	}

	@Override
	public List<DshopAdmin> selectByExampleWithRowbounds(
			DshopAdminExample example, RowBounds rowBounds) {
		return adminDao.selectByExampleWithRowbounds(example, rowBounds);
	}

	@Override
	public List<DshopAdmin> selectByExample(DshopAdminExample example) {
		return adminDao.selectByExample(example);
	}

	@Override
	public DshopAdmin selectByPrimaryKey(Integer adminId) {
		return adminDao.selectByPrimaryKey(adminId);
	}

	@Override
	public int updateByPrimaryKey(DshopAdmin record) {
		return adminDao.updateByPrimaryKey(record);
	}

}
