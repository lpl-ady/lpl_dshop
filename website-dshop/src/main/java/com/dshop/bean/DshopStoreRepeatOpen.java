/*
 * DshopStoreRepeatOpen.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.bean;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 店铺续签表
 * @author lpl
 */
public class DshopStoreRepeatOpen implements Serializable {
    private Integer repeatId;

    /**
     * 店铺ID
     */
    private Integer repeatStoreId;

    /**
     * 店铺名字
     */
    private String repeatStoreName;

    /**
     * 店铺等级ID
     */
    private Short repeatGradeId;

    /**
     * 等级名称
     */
    private String repeatGradeName;

    /**
     * 等级收费(元/年)
     */
    private BigDecimal repeatGradePrice;

    /**
     * 续签时长(年)
     */
    private Byte repeatYear;

    /**
     * 有效期开始时间
     */
    private Integer repeatStartTime;

    /**
     * 有效期结束时间
     */
    private Integer repeatEndTime;

    /**
     * 应付总金额
     */
    private BigDecimal repeatPayAmount;

    /**
     * 付款凭证
     */
    private String repeatPayCert;

    /**
     * 付款凭证说明
     */
    private String repeatPayCertExplain;

    /**
     * 记录创建时间
     */
    private Integer repeatCreateTime;

    /**
     * 状态0默认,1审核中,2审核通过
     */
    private Byte repeatStatus;

    private static final long serialVersionUID = 1L;

    public Integer getRepeatId() {
        return repeatId;
    }

    public void setRepeatId(Integer repeatId) {
        this.repeatId = repeatId;
    }

    public Integer getRepeatStoreId() {
        return repeatStoreId;
    }

    public void setRepeatStoreId(Integer repeatStoreId) {
        this.repeatStoreId = repeatStoreId;
    }

    public String getRepeatStoreName() {
        return repeatStoreName;
    }

    public void setRepeatStoreName(String repeatStoreName) {
        this.repeatStoreName = repeatStoreName == null ? null : repeatStoreName.trim();
    }

    public Short getRepeatGradeId() {
        return repeatGradeId;
    }

    public void setRepeatGradeId(Short repeatGradeId) {
        this.repeatGradeId = repeatGradeId;
    }

    public String getRepeatGradeName() {
        return repeatGradeName;
    }

    public void setRepeatGradeName(String repeatGradeName) {
        this.repeatGradeName = repeatGradeName == null ? null : repeatGradeName.trim();
    }

    public BigDecimal getRepeatGradePrice() {
        return repeatGradePrice;
    }

    public void setRepeatGradePrice(BigDecimal repeatGradePrice) {
        this.repeatGradePrice = repeatGradePrice;
    }

    public Byte getRepeatYear() {
        return repeatYear;
    }

    public void setRepeatYear(Byte repeatYear) {
        this.repeatYear = repeatYear;
    }

    public Integer getRepeatStartTime() {
        return repeatStartTime;
    }

    public void setRepeatStartTime(Integer repeatStartTime) {
        this.repeatStartTime = repeatStartTime;
    }

    public Integer getRepeatEndTime() {
        return repeatEndTime;
    }

    public void setRepeatEndTime(Integer repeatEndTime) {
        this.repeatEndTime = repeatEndTime;
    }

    public BigDecimal getRepeatPayAmount() {
        return repeatPayAmount;
    }

    public void setRepeatPayAmount(BigDecimal repeatPayAmount) {
        this.repeatPayAmount = repeatPayAmount;
    }

    public String getRepeatPayCert() {
        return repeatPayCert;
    }

    public void setRepeatPayCert(String repeatPayCert) {
        this.repeatPayCert = repeatPayCert == null ? null : repeatPayCert.trim();
    }

    public String getRepeatPayCertExplain() {
        return repeatPayCertExplain;
    }

    public void setRepeatPayCertExplain(String repeatPayCertExplain) {
        this.repeatPayCertExplain = repeatPayCertExplain == null ? null : repeatPayCertExplain.trim();
    }

    public Integer getRepeatCreateTime() {
        return repeatCreateTime;
    }

    public void setRepeatCreateTime(Integer repeatCreateTime) {
        this.repeatCreateTime = repeatCreateTime;
    }

    public Byte getRepeatStatus() {
        return repeatStatus;
    }

    public void setRepeatStatus(Byte repeatStatus) {
        this.repeatStatus = repeatStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", repeatId=").append(repeatId);
        sb.append(", repeatStoreId=").append(repeatStoreId);
        sb.append(", repeatStoreName=").append(repeatStoreName);
        sb.append(", repeatGradeId=").append(repeatGradeId);
        sb.append(", repeatGradeName=").append(repeatGradeName);
        sb.append(", repeatGradePrice=").append(repeatGradePrice);
        sb.append(", repeatYear=").append(repeatYear);
        sb.append(", repeatStartTime=").append(repeatStartTime);
        sb.append(", repeatEndTime=").append(repeatEndTime);
        sb.append(", repeatPayAmount=").append(repeatPayAmount);
        sb.append(", repeatPayCert=").append(repeatPayCert);
        sb.append(", repeatPayCertExplain=").append(repeatPayCertExplain);
        sb.append(", repeatCreateTime=").append(repeatCreateTime);
        sb.append(", repeatStatus=").append(repeatStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}