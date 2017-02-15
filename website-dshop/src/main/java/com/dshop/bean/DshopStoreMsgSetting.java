/*
 * DshopStoreMsgSetting.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.bean;

import java.io.Serializable;

/**
 * 店铺消息接收设置
 * @author lpl
 */
public class DshopStoreMsgSetting implements Serializable {
    /**
     * 模板编码
     */
    private String smtCode;

    /**
     * 店铺id
     */
    private Integer storeId;

    /**
     * 站内信接收开关，0关闭，1开启
     */
    private Byte smsMessageSwitch;

    /**
     * 短消息接收开关，0关闭，1开启
     */
    private Byte smsShortSwitch;

    /**
     * 邮件接收开关，0关闭，1开启
     */
    private Byte smsMailSwitch;

    /**
     * 手机号码
     */
    private String smsShortNumber;

    /**
     * 邮箱号码
     */
    private String smsMailNumber;

    private static final long serialVersionUID = 1L;

    public String getSmtCode() {
        return smtCode;
    }

    public void setSmtCode(String smtCode) {
        this.smtCode = smtCode == null ? null : smtCode.trim();
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Byte getSmsMessageSwitch() {
        return smsMessageSwitch;
    }

    public void setSmsMessageSwitch(Byte smsMessageSwitch) {
        this.smsMessageSwitch = smsMessageSwitch;
    }

    public Byte getSmsShortSwitch() {
        return smsShortSwitch;
    }

    public void setSmsShortSwitch(Byte smsShortSwitch) {
        this.smsShortSwitch = smsShortSwitch;
    }

    public Byte getSmsMailSwitch() {
        return smsMailSwitch;
    }

    public void setSmsMailSwitch(Byte smsMailSwitch) {
        this.smsMailSwitch = smsMailSwitch;
    }

    public String getSmsShortNumber() {
        return smsShortNumber;
    }

    public void setSmsShortNumber(String smsShortNumber) {
        this.smsShortNumber = smsShortNumber == null ? null : smsShortNumber.trim();
    }

    public String getSmsMailNumber() {
        return smsMailNumber;
    }

    public void setSmsMailNumber(String smsMailNumber) {
        this.smsMailNumber = smsMailNumber == null ? null : smsMailNumber.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", smtCode=").append(smtCode);
        sb.append(", storeId=").append(storeId);
        sb.append(", smsMessageSwitch=").append(smsMessageSwitch);
        sb.append(", smsShortSwitch=").append(smsShortSwitch);
        sb.append(", smsMailSwitch=").append(smsMailSwitch);
        sb.append(", smsShortNumber=").append(smsShortNumber);
        sb.append(", smsMailNumber=").append(smsMailNumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}