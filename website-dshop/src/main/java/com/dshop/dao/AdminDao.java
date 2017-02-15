package com.dshop.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.dshop.bean.DshopAdmin;
import com.dshop.bean.example.DshopAdminExample;

public interface AdminDao {

	int countByExample(DshopAdminExample example);

    int deleteByPrimaryKey(Integer adminId);

    int insert(DshopAdmin record);
    
    int insertSelective(DshopAdmin record);

    List<DshopAdmin> selectByExampleWithRowbounds(DshopAdminExample example, RowBounds rowBounds);

    List<DshopAdmin> selectByExample(DshopAdminExample example);

    DshopAdmin selectByPrimaryKey(Integer adminId);

    int updateByPrimaryKey(DshopAdmin record);
}
