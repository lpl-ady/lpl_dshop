/*
 * DshopStoreCategory.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.bean;

import java.io.Serializable;

/**
 * 店铺分类表
 * @author lpl
 */
public class DshopStoreCategory implements Serializable {
    /**
     * 索引ID
     */
    private Integer scId;

    /**
     * 分类名称
     */
    private String scName;

    /**
     * 保证金数额
     */
    private Integer scBail;

    /**
     * 排序
     */
    private Boolean scSort;

    private static final long serialVersionUID = 1L;

    public Integer getScId() {
        return scId;
    }

    public void setScId(Integer scId) {
        this.scId = scId;
    }

    public String getScName() {
        return scName;
    }

    public void setScName(String scName) {
        this.scName = scName == null ? null : scName.trim();
    }

    public Integer getScBail() {
        return scBail;
    }

    public void setScBail(Integer scBail) {
        this.scBail = scBail;
    }

    public Boolean getScSort() {
        return scSort;
    }

    public void setScSort(Boolean scSort) {
        this.scSort = scSort;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", scId=").append(scId);
        sb.append(", scName=").append(scName);
        sb.append(", scBail=").append(scBail);
        sb.append(", scSort=").append(scSort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}