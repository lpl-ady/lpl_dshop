/*
 * DshopStoreMsg.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.bean;

import java.io.Serializable;

/**
 * 店铺消息表
 * @author lpl
 */
public class DshopStoreMsg implements Serializable {
    /**
     * 店铺消息id
     */
    private Integer storeMsgId;

    /**
     * 模板编码
     */
    private String smtCode;

    /**
     * 消息内容
     */
    private String storeMsgContent;

    /**
     * 发送时间
     */
    private Integer storeMsgAddTime;

    /**
     * 店铺id
     */
    private Integer storeId;

    /**
     * 消息状态,0为未读,1为已读
     */
    private Boolean storeMsgStatus;

    /**
     * 已读卖家id
     */
    private String storeMsgReadUserid;

    /**
     * 阅读时间
     */
    private Integer storeMsgReadTime;

    private static final long serialVersionUID = 1L;

    public Integer getStoreMsgId() {
        return storeMsgId;
    }

    public void setStoreMsgId(Integer storeMsgId) {
        this.storeMsgId = storeMsgId;
    }

    public String getSmtCode() {
        return smtCode;
    }

    public void setSmtCode(String smtCode) {
        this.smtCode = smtCode == null ? null : smtCode.trim();
    }

    public String getStoreMsgContent() {
        return storeMsgContent;
    }

    public void setStoreMsgContent(String storeMsgContent) {
        this.storeMsgContent = storeMsgContent == null ? null : storeMsgContent.trim();
    }

    public Integer getStoreMsgAddTime() {
        return storeMsgAddTime;
    }

    public void setStoreMsgAddTime(Integer storeMsgAddTime) {
        this.storeMsgAddTime = storeMsgAddTime;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Boolean getStoreMsgStatus() {
        return storeMsgStatus;
    }

    public void setStoreMsgStatus(Boolean storeMsgStatus) {
        this.storeMsgStatus = storeMsgStatus;
    }

    public String getStoreMsgReadUserid() {
        return storeMsgReadUserid;
    }

    public void setStoreMsgReadUserid(String storeMsgReadUserid) {
        this.storeMsgReadUserid = storeMsgReadUserid == null ? null : storeMsgReadUserid.trim();
    }

    public Integer getStoreMsgReadTime() {
        return storeMsgReadTime;
    }

    public void setStoreMsgReadTime(Integer storeMsgReadTime) {
        this.storeMsgReadTime = storeMsgReadTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", storeMsgId=").append(storeMsgId);
        sb.append(", smtCode=").append(smtCode);
        sb.append(", storeMsgContent=").append(storeMsgContent);
        sb.append(", storeMsgAddTime=").append(storeMsgAddTime);
        sb.append(", storeId=").append(storeId);
        sb.append(", storeMsgStatus=").append(storeMsgStatus);
        sb.append(", storeMsgReadUserid=").append(storeMsgReadUserid);
        sb.append(", storeMsgReadTime=").append(storeMsgReadTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}