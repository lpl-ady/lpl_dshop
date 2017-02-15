/*
 * DshopStoreCost.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.bean;

import java.io.Serializable;

/**
 * 店铺费用表
 * @author lpl
 */
public class DshopStoreCost implements Serializable {
    /**
     * 费用编号
     */
    private Integer costId;

    /**
     * 店铺编号
     */
    private Integer storeId;

    /**
     * 卖家编号
     */
    private Integer userId;

    /**
     * 价格
     */
    private Integer costPrice;

    /**
     * 费用备注
     */
    private String costRemark;

    /**
     * 费用状态(0-未结算 1-已结算)
     */
    private Byte costStatus;

    /**
     * 费用发生时间
     */
    private Integer costTime;

    private static final long serialVersionUID = 1L;

    public Integer getCostId() {
        return costId;
    }

    public void setCostId(Integer costId) {
        this.costId = costId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Integer costPrice) {
        this.costPrice = costPrice;
    }

    public String getCostRemark() {
        return costRemark;
    }

    public void setCostRemark(String costRemark) {
        this.costRemark = costRemark == null ? null : costRemark.trim();
    }

    public Byte getCostStatus() {
        return costStatus;
    }

    public void setCostStatus(Byte costStatus) {
        this.costStatus = costStatus;
    }

    public Integer getCostTime() {
        return costTime;
    }

    public void setCostTime(Integer costTime) {
        this.costTime = costTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", costId=").append(costId);
        sb.append(", storeId=").append(storeId);
        sb.append(", userId=").append(userId);
        sb.append(", costPrice=").append(costPrice);
        sb.append(", costRemark=").append(costRemark);
        sb.append(", costStatus=").append(costStatus);
        sb.append(", costTime=").append(costTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}