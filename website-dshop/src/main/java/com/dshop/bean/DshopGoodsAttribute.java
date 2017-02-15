/*
 * DshopGoodsAttribute.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.bean;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * @author lpl
 */
public class DshopGoodsAttribute implements Serializable {
    private Integer goodsAttrId;

    private Integer goodsId;

    private String goodsAttrName;

    private String goodsAttrValue;

    private BigDecimal goodsAttrCostprice;

    private BigDecimal goodsAttrToprice;

    private Integer goodsAttrStock;

    private static final long serialVersionUID = 1L;

    public Integer getGoodsAttrId() {
        return goodsAttrId;
    }

    public void setGoodsAttrId(Integer goodsAttrId) {
        this.goodsAttrId = goodsAttrId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsAttrName() {
        return goodsAttrName;
    }

    public void setGoodsAttrName(String goodsAttrName) {
        this.goodsAttrName = goodsAttrName == null ? null : goodsAttrName.trim();
    }

    public String getGoodsAttrValue() {
        return goodsAttrValue;
    }

    public void setGoodsAttrValue(String goodsAttrValue) {
        this.goodsAttrValue = goodsAttrValue == null ? null : goodsAttrValue.trim();
    }

    public BigDecimal getGoodsAttrCostprice() {
        return goodsAttrCostprice;
    }

    public void setGoodsAttrCostprice(BigDecimal goodsAttrCostprice) {
        this.goodsAttrCostprice = goodsAttrCostprice;
    }

    public BigDecimal getGoodsAttrToprice() {
        return goodsAttrToprice;
    }

    public void setGoodsAttrToprice(BigDecimal goodsAttrToprice) {
        this.goodsAttrToprice = goodsAttrToprice;
    }

    public Integer getGoodsAttrStock() {
        return goodsAttrStock;
    }

    public void setGoodsAttrStock(Integer goodsAttrStock) {
        this.goodsAttrStock = goodsAttrStock;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", goodsAttrId=").append(goodsAttrId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsAttrName=").append(goodsAttrName);
        sb.append(", goodsAttrValue=").append(goodsAttrValue);
        sb.append(", goodsAttrCostprice=").append(goodsAttrCostprice);
        sb.append(", goodsAttrToprice=").append(goodsAttrToprice);
        sb.append(", goodsAttrStock=").append(goodsAttrStock);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}