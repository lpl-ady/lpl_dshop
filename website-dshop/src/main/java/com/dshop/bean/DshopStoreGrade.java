/*
 * DshopStoreGrade.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.bean;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 店铺等级表
 * @author lpl
 */
public class DshopStoreGrade implements Serializable {
    /**
     * 索引ID
     */
    private Integer gradeId;

    /**
     * 等级名称
     */
    private String gradeName;

    /**
     * 允许发布的商品数量
     */
    private Integer gradeGoodsLimit;

    /**
     * 允许上传图片数量
     */
    private Integer gradeAlbumLimit;

    /**
     * 上传空间大小，单位MB
     */
    private Integer gradeSpaceLimit;

    /**
     * 选择店铺模板套数
     */
    private Byte gradeTemplateNumber;

    /**
     * 模板内容
     */
    private String gradeTemplate;

    /**
     * 开店费用(元/年)
     */
    private BigDecimal gradePrice;

    /**
     * 附加功能
     */
    private String gradeFunction;

    /**
     * 级别，数目越大级别越高
     */
    private Byte gradeSort;

    /**
     * 申请说明
     */
    private String gradeDescription;

    private static final long serialVersionUID = 1L;

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName == null ? null : gradeName.trim();
    }

    public Integer getGradeGoodsLimit() {
        return gradeGoodsLimit;
    }

    public void setGradeGoodsLimit(Integer gradeGoodsLimit) {
        this.gradeGoodsLimit = gradeGoodsLimit;
    }

    public Integer getGradeAlbumLimit() {
        return gradeAlbumLimit;
    }

    public void setGradeAlbumLimit(Integer gradeAlbumLimit) {
        this.gradeAlbumLimit = gradeAlbumLimit;
    }

    public Integer getGradeSpaceLimit() {
        return gradeSpaceLimit;
    }

    public void setGradeSpaceLimit(Integer gradeSpaceLimit) {
        this.gradeSpaceLimit = gradeSpaceLimit;
    }

    public Byte getGradeTemplateNumber() {
        return gradeTemplateNumber;
    }

    public void setGradeTemplateNumber(Byte gradeTemplateNumber) {
        this.gradeTemplateNumber = gradeTemplateNumber;
    }

    public String getGradeTemplate() {
        return gradeTemplate;
    }

    public void setGradeTemplate(String gradeTemplate) {
        this.gradeTemplate = gradeTemplate == null ? null : gradeTemplate.trim();
    }

    public BigDecimal getGradePrice() {
        return gradePrice;
    }

    public void setGradePrice(BigDecimal gradePrice) {
        this.gradePrice = gradePrice;
    }

    public String getGradeFunction() {
        return gradeFunction;
    }

    public void setGradeFunction(String gradeFunction) {
        this.gradeFunction = gradeFunction == null ? null : gradeFunction.trim();
    }

    public Byte getGradeSort() {
        return gradeSort;
    }

    public void setGradeSort(Byte gradeSort) {
        this.gradeSort = gradeSort;
    }

    public String getGradeDescription() {
        return gradeDescription;
    }

    public void setGradeDescription(String gradeDescription) {
        this.gradeDescription = gradeDescription == null ? null : gradeDescription.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gradeId=").append(gradeId);
        sb.append(", gradeName=").append(gradeName);
        sb.append(", gradeGoodsLimit=").append(gradeGoodsLimit);
        sb.append(", gradeAlbumLimit=").append(gradeAlbumLimit);
        sb.append(", gradeSpaceLimit=").append(gradeSpaceLimit);
        sb.append(", gradeTemplateNumber=").append(gradeTemplateNumber);
        sb.append(", gradeTemplate=").append(gradeTemplate);
        sb.append(", gradePrice=").append(gradePrice);
        sb.append(", gradeFunction=").append(gradeFunction);
        sb.append(", gradeSort=").append(gradeSort);
        sb.append(", gradeDescription=").append(gradeDescription);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}