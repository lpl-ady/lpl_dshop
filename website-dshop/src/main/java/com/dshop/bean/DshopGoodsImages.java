/*
 * DshopGoodsImages.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.bean;

import java.io.Serializable;

/**
 * 商品图片
 * @author lpl
 */
public class DshopGoodsImages implements Serializable {
    /**
     * 商品图片id
     */
    private Integer goodsImageId;

    /**
     * 商品id
     */
    private Integer goodsId;

    /**
     * 店铺id
     */
    private Integer storeId;

    /**
     * 商品属性id
     */
    private Integer goodsAttrId;

    /**
     * 商品图片
     */
    private String goodsImage;

    /**
     * 排序
     */
    private Byte goodsImageSort;

    /**
     * 扩展1
     */
    private String goodsImageExt1;

    /**
     * 扩展2
     */
    private String goodsImageExt2;

    private static final long serialVersionUID = 1L;

    public Integer getGoodsImageId() {
        return goodsImageId;
    }

    public void setGoodsImageId(Integer goodsImageId) {
        this.goodsImageId = goodsImageId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getGoodsAttrId() {
        return goodsAttrId;
    }

    public void setGoodsAttrId(Integer goodsAttrId) {
        this.goodsAttrId = goodsAttrId;
    }

    public String getGoodsImage() {
        return goodsImage;
    }

    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage == null ? null : goodsImage.trim();
    }

    public Byte getGoodsImageSort() {
        return goodsImageSort;
    }

    public void setGoodsImageSort(Byte goodsImageSort) {
        this.goodsImageSort = goodsImageSort;
    }

    public String getGoodsImageExt1() {
        return goodsImageExt1;
    }

    public void setGoodsImageExt1(String goodsImageExt1) {
        this.goodsImageExt1 = goodsImageExt1 == null ? null : goodsImageExt1.trim();
    }

    public String getGoodsImageExt2() {
        return goodsImageExt2;
    }

    public void setGoodsImageExt2(String goodsImageExt2) {
        this.goodsImageExt2 = goodsImageExt2 == null ? null : goodsImageExt2.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", goodsImageId=").append(goodsImageId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", storeId=").append(storeId);
        sb.append(", goodsAttrId=").append(goodsAttrId);
        sb.append(", goodsImage=").append(goodsImage);
        sb.append(", goodsImageSort=").append(goodsImageSort);
        sb.append(", goodsImageExt1=").append(goodsImageExt1);
        sb.append(", goodsImageExt2=").append(goodsImageExt2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}