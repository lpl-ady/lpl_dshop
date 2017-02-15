/*
 * DshopGoodsCategory.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.bean;

import java.io.Serializable;

/**
 * 商品类别表
 * @author lpl
 */
public class DshopGoodsCategory implements Serializable {
    /**
     * id
     */
    private Integer cateId;

    /**
     * 分类名称
     */
    private String cateName;

    /**
     * 类型id
     */
    private Integer typeId;

    /**
     * 类型名称
     */
    private String typeName;

    /**
     * 父ID
     */
    private Integer cateParentId;

    /**
     * 佣金比例
     */
    private Float brokerageRate;

    /**
     * 排序
     */
    private Boolean cateSort;

    /**
     * 是否允许发布虚拟商品，1是，0否
     */
    private Byte cateVirtual;

    /**
     * 名称
     */
    private String cateTitle;

    /**
     * 关键词
     */
    private String cateKeywords;

    /**
     * 描述
     */
    private String cateDescription;

    private static final long serialVersionUID = 1L;

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName == null ? null : cateName.trim();
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public Integer getCateParentId() {
        return cateParentId;
    }

    public void setCateParentId(Integer cateParentId) {
        this.cateParentId = cateParentId;
    }

    public Float getBrokerageRate() {
        return brokerageRate;
    }

    public void setBrokerageRate(Float brokerageRate) {
        this.brokerageRate = brokerageRate;
    }

    public Boolean getCateSort() {
        return cateSort;
    }

    public void setCateSort(Boolean cateSort) {
        this.cateSort = cateSort;
    }

    public Byte getCateVirtual() {
        return cateVirtual;
    }

    public void setCateVirtual(Byte cateVirtual) {
        this.cateVirtual = cateVirtual;
    }

    public String getCateTitle() {
        return cateTitle;
    }

    public void setCateTitle(String cateTitle) {
        this.cateTitle = cateTitle == null ? null : cateTitle.trim();
    }

    public String getCateKeywords() {
        return cateKeywords;
    }

    public void setCateKeywords(String cateKeywords) {
        this.cateKeywords = cateKeywords == null ? null : cateKeywords.trim();
    }

    public String getCateDescription() {
        return cateDescription;
    }

    public void setCateDescription(String cateDescription) {
        this.cateDescription = cateDescription == null ? null : cateDescription.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cateId=").append(cateId);
        sb.append(", cateName=").append(cateName);
        sb.append(", typeId=").append(typeId);
        sb.append(", typeName=").append(typeName);
        sb.append(", cateParentId=").append(cateParentId);
        sb.append(", brokerageRate=").append(brokerageRate);
        sb.append(", cateSort=").append(cateSort);
        sb.append(", cateVirtual=").append(cateVirtual);
        sb.append(", cateTitle=").append(cateTitle);
        sb.append(", cateKeywords=").append(cateKeywords);
        sb.append(", cateDescription=").append(cateDescription);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}