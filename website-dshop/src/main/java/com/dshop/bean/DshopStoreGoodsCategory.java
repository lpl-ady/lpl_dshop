/*
 * DshopStoreGoodsCategory.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.bean;

import java.io.Serializable;

/**
 * 店铺商品分类表
 * @author lpl
 */
public class DshopStoreGoodsCategory implements Serializable {
    /**
     * 索引ID
     */
    private Integer sgcId;

    /**
     * 店铺id
     */
    private Integer storeId;

    /**
     * 父级id
     */
    private Integer sgcParentId;

    /**
     * 店铺商品分类名称
     */
    private String sgcCategoryName;

    /**
     * 店铺商品分类状态
     */
    private Boolean sgcStatus;

    /**
     * 商品分类排序
     */
    private Integer sgcSort;

    private static final long serialVersionUID = 1L;

    public Integer getSgcId() {
        return sgcId;
    }

    public void setSgcId(Integer sgcId) {
        this.sgcId = sgcId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getSgcParentId() {
        return sgcParentId;
    }

    public void setSgcParentId(Integer sgcParentId) {
        this.sgcParentId = sgcParentId;
    }

    public String getSgcCategoryName() {
        return sgcCategoryName;
    }

    public void setSgcCategoryName(String sgcCategoryName) {
        this.sgcCategoryName = sgcCategoryName == null ? null : sgcCategoryName.trim();
    }

    public Boolean getSgcStatus() {
        return sgcStatus;
    }

    public void setSgcStatus(Boolean sgcStatus) {
        this.sgcStatus = sgcStatus;
    }

    public Integer getSgcSort() {
        return sgcSort;
    }

    public void setSgcSort(Integer sgcSort) {
        this.sgcSort = sgcSort;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sgcId=").append(sgcId);
        sb.append(", storeId=").append(storeId);
        sb.append(", sgcParentId=").append(sgcParentId);
        sb.append(", sgcCategoryName=").append(sgcCategoryName);
        sb.append(", sgcStatus=").append(sgcStatus);
        sb.append(", sgcSort=").append(sgcSort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}