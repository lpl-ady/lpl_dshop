/*
 * DshopGoodsGift.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.bean;

import java.io.Serializable;

/**
 * 商品赠品表
 * @author lpl
 */
public class DshopGoodsGift implements Serializable {
    /**
     * 赠品id 
     */
    private Integer giftId;

    /**
     * 主商品id
     */
    private Integer goodsId;

    /**
     * 赠品商品id 
     */
    private Integer giftGoodsId;

    /**
     * 赠品名称
     */
    private String giftGoodsName;

    /**
     * 赠品图片
     */
    private String giftGoodsImage;

    /**
     * 赠品数量
     */
    private Byte giftAmount;

    /**
     * 扩展1
     */
    private String giftExt1;

    /**
     * 扩展2
     */
    private String giftExt2;

    private static final long serialVersionUID = 1L;

    public Integer getGiftId() {
        return giftId;
    }

    public void setGiftId(Integer giftId) {
        this.giftId = giftId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getGiftGoodsId() {
        return giftGoodsId;
    }

    public void setGiftGoodsId(Integer giftGoodsId) {
        this.giftGoodsId = giftGoodsId;
    }

    public String getGiftGoodsName() {
        return giftGoodsName;
    }

    public void setGiftGoodsName(String giftGoodsName) {
        this.giftGoodsName = giftGoodsName == null ? null : giftGoodsName.trim();
    }

    public String getGiftGoodsImage() {
        return giftGoodsImage;
    }

    public void setGiftGoodsImage(String giftGoodsImage) {
        this.giftGoodsImage = giftGoodsImage == null ? null : giftGoodsImage.trim();
    }

    public Byte getGiftAmount() {
        return giftAmount;
    }

    public void setGiftAmount(Byte giftAmount) {
        this.giftAmount = giftAmount;
    }

    public String getGiftExt1() {
        return giftExt1;
    }

    public void setGiftExt1(String giftExt1) {
        this.giftExt1 = giftExt1 == null ? null : giftExt1.trim();
    }

    public String getGiftExt2() {
        return giftExt2;
    }

    public void setGiftExt2(String giftExt2) {
        this.giftExt2 = giftExt2 == null ? null : giftExt2.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", giftId=").append(giftId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", giftGoodsId=").append(giftGoodsId);
        sb.append(", giftGoodsName=").append(giftGoodsName);
        sb.append(", giftGoodsImage=").append(giftGoodsImage);
        sb.append(", giftAmount=").append(giftAmount);
        sb.append(", giftExt1=").append(giftExt1);
        sb.append(", giftExt2=").append(giftExt2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}