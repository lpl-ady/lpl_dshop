/*
 * DshopStoreGradeMapper.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.service.mapper;

import com.dshop.bean.DshopStoreGrade;
import com.dshop.bean.example.DshopStoreGradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DshopStoreGradeMapper {
    int countByExample(DshopStoreGradeExample example);

    int deleteByExample(DshopStoreGradeExample example);

    int deleteByPrimaryKey(Integer gradeId);

    int insert(DshopStoreGrade record);

    int insertSelective(DshopStoreGrade record);

    List<DshopStoreGrade> selectByExampleWithBLOBsWithRowbounds(DshopStoreGradeExample example, RowBounds rowBounds);

    List<DshopStoreGrade> selectByExampleWithBLOBs(DshopStoreGradeExample example);

    List<DshopStoreGrade> selectByExampleWithRowbounds(DshopStoreGradeExample example, RowBounds rowBounds);

    List<DshopStoreGrade> selectByExample(DshopStoreGradeExample example);

    DshopStoreGrade selectByPrimaryKey(Integer gradeId);

    int updateByExampleSelective(@Param("record") DshopStoreGrade record, @Param("example") DshopStoreGradeExample example);

    int updateByExampleWithBLOBs(@Param("record") DshopStoreGrade record, @Param("example") DshopStoreGradeExample example);

    int updateByExample(@Param("record") DshopStoreGrade record, @Param("example") DshopStoreGradeExample example);

    int updateByPrimaryKeySelective(DshopStoreGrade record);

    int updateByPrimaryKeyWithBLOBs(DshopStoreGrade record);

    int updateByPrimaryKey(DshopStoreGrade record);
}