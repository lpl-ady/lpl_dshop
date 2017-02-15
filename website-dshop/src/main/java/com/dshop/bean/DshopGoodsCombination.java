/*
 * DshopGoodsCombination.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.bean;

import java.io.Serializable;

/**
 * 商品推荐组合表
 * @author lpl
 */
public class DshopGoodsCombination implements Serializable {
    /**
     * 推荐组合id 
     */
    private Integer combId;

    /**
     * 主商品id
     */
    private Integer goodsId;

    /**
     * 推荐组合商品id
     */
    private Integer combGoodsid;

    /**
     * 扩展1
     */
    private String combExt1;

    /**
     * 扩展2
     */
    private String combExt2;

    private static final long serialVersionUID = 1L;

    public Integer getCombId() {
        return combId;
    }

    public void setCombId(Integer combId) {
        this.combId = combId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getCombGoodsid() {
        return combGoodsid;
    }

    public void setCombGoodsid(Integer combGoodsid) {
        this.combGoodsid = combGoodsid;
    }

    public String getCombExt1() {
        return combExt1;
    }

    public void setCombExt1(String combExt1) {
        this.combExt1 = combExt1 == null ? null : combExt1.trim();
    }

    public String getCombExt2() {
        return combExt2;
    }

    public void setCombExt2(String combExt2) {
        this.combExt2 = combExt2 == null ? null : combExt2.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", combId=").append(combId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", combGoodsid=").append(combGoodsid);
        sb.append(", combExt1=").append(combExt1);
        sb.append(", combExt2=").append(combExt2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}