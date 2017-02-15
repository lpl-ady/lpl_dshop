/*
 * DshopStoreBindCategory.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.bean;

import java.io.Serializable;

/**
 * 店铺可发布商品类目表
 * @author lpl
 */
public class DshopStoreBindCategory implements Serializable {
    private Integer sbcId;

    /**
     * 店铺ID
     */
    private Integer storeId;

    /**
     * 佣金比例
     */
    private Byte commisRate;

    /**
     * 一级分类
     */
    private Integer cateId1;

    /**
     * 二级分类
     */
    private Integer cateId2;

    /**
     * 三级分类
     */
    private Integer cateId3;

    /**
     * 状态0审核中1已审核 2平台自营店铺
     */
    private Byte sbcStatus;

    private static final long serialVersionUID = 1L;

    public Integer getSbcId() {
        return sbcId;
    }

    public void setSbcId(Integer sbcId) {
        this.sbcId = sbcId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Byte getCommisRate() {
        return commisRate;
    }

    public void setCommisRate(Byte commisRate) {
        this.commisRate = commisRate;
    }

    public Integer getCateId1() {
        return cateId1;
    }

    public void setCateId1(Integer cateId1) {
        this.cateId1 = cateId1;
    }

    public Integer getCateId2() {
        return cateId2;
    }

    public void setCateId2(Integer cateId2) {
        this.cateId2 = cateId2;
    }

    public Integer getCateId3() {
        return cateId3;
    }

    public void setCateId3(Integer cateId3) {
        this.cateId3 = cateId3;
    }

    public Byte getSbcStatus() {
        return sbcStatus;
    }

    public void setSbcStatus(Byte sbcStatus) {
        this.sbcStatus = sbcStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sbcId=").append(sbcId);
        sb.append(", storeId=").append(storeId);
        sb.append(", commisRate=").append(commisRate);
        sb.append(", cateId1=").append(cateId1);
        sb.append(", cateId2=").append(cateId2);
        sb.append(", cateId3=").append(cateId3);
        sb.append(", sbcStatus=").append(sbcStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}