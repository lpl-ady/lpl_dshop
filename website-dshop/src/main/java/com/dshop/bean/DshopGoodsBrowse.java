/*
 * DshopGoodsBrowse.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.bean;

import java.io.Serializable;

/**
 * 商品浏览历史表
 * @author lpl
 */
public class DshopGoodsBrowse implements Serializable {
    /**
     * 商品ID
     */
    private Integer goodsId;

    /**
     * 会员ID
     */
    private Integer memberId;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品分类
     */
    private Integer cateId;

    /**
     * 商品一级分类
     */
    private Integer cateId1;

    /**
     * 商品二级分类
     */
    private Integer cateId2;

    /**
     * 商品三级分类
     */
    private Integer cateId3;

    /**
     * 浏览时间
     */
    private Integer browseTime;

    /**
     * 扩展1
     */
    private String browseExt1;

    /**
     * 扩展2
     */
    private String browseExt2;

    private static final long serialVersionUID = 1L;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
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

    public Integer getBrowseTime() {
        return browseTime;
    }

    public void setBrowseTime(Integer browseTime) {
        this.browseTime = browseTime;
    }

    public String getBrowseExt1() {
        return browseExt1;
    }

    public void setBrowseExt1(String browseExt1) {
        this.browseExt1 = browseExt1 == null ? null : browseExt1.trim();
    }

    public String getBrowseExt2() {
        return browseExt2;
    }

    public void setBrowseExt2(String browseExt2) {
        this.browseExt2 = browseExt2 == null ? null : browseExt2.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", goodsId=").append(goodsId);
        sb.append(", memberId=").append(memberId);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", cateId=").append(cateId);
        sb.append(", cateId1=").append(cateId1);
        sb.append(", cateId2=").append(cateId2);
        sb.append(", cateId3=").append(cateId3);
        sb.append(", browseTime=").append(browseTime);
        sb.append(", browseExt1=").append(browseExt1);
        sb.append(", browseExt2=").append(browseExt2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}