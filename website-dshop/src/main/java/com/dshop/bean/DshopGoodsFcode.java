/*
 * DshopGoodsFcode.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.bean;

import java.io.Serializable;

/**
 * 商品F码
 * @author lpl
 */
public class DshopGoodsFcode implements Serializable {
    /**
     * F码id
     */
    private Integer fcodeId;

    /**
     * 商品ID
     */
    private Integer goodsId;

    /**
     * F码
     */
    private String fcodeCode;

    /**
     * 状态 0未使用，1已使用
     */
    private Byte fcodeStatus;

    /**
     * 扩展1
     */
    private String fcodeExt1;

    /**
     * 扩展2
     */
    private String fcodeExt2;

    private static final long serialVersionUID = 1L;

    public Integer getFcodeId() {
        return fcodeId;
    }

    public void setFcodeId(Integer fcodeId) {
        this.fcodeId = fcodeId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getFcodeCode() {
        return fcodeCode;
    }

    public void setFcodeCode(String fcodeCode) {
        this.fcodeCode = fcodeCode == null ? null : fcodeCode.trim();
    }

    public Byte getFcodeStatus() {
        return fcodeStatus;
    }

    public void setFcodeStatus(Byte fcodeStatus) {
        this.fcodeStatus = fcodeStatus;
    }

    public String getFcodeExt1() {
        return fcodeExt1;
    }

    public void setFcodeExt1(String fcodeExt1) {
        this.fcodeExt1 = fcodeExt1 == null ? null : fcodeExt1.trim();
    }

    public String getFcodeExt2() {
        return fcodeExt2;
    }

    public void setFcodeExt2(String fcodeExt2) {
        this.fcodeExt2 = fcodeExt2 == null ? null : fcodeExt2.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fcodeId=").append(fcodeId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", fcodeCode=").append(fcodeCode);
        sb.append(", fcodeStatus=").append(fcodeStatus);
        sb.append(", fcodeExt1=").append(fcodeExt1);
        sb.append(", fcodeExt2=").append(fcodeExt2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}