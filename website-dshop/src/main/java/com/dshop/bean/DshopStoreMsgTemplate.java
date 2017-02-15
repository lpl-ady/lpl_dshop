/*
 * DshopStoreMsgTemplate.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.bean;

import java.io.Serializable;

/**
 * 商家消息模板
 * @author lpl
 */
public class DshopStoreMsgTemplate implements Serializable {
    /**
     * 模板编码
     */
    private String smtCode;

    /**
     * 模板名称
     */
    private String smtName;

    /**
     * 站内信开关，0关，1开，2强制开启
     */
    private Byte smtMessageSwitch;

    /**
     * 站内信内容
     */
    private String smtMessageContent;

    /**
     * 短信开关，0关，1开，2强制开启
     */
    private Byte smtShortSwitch;

    /**
     * 短信内容
     */
    private String smtShortContent;

    /**
     * 邮件开关，0关，1开，2强制开启
     */
    private Byte smtMailSwitch;

    /**
     * 邮件标题
     */
    private String smtMailSubject;

    /**
     * 邮件内容
     */
    private String smtMailContent;

    private static final long serialVersionUID = 1L;

    public String getSmtCode() {
        return smtCode;
    }

    public void setSmtCode(String smtCode) {
        this.smtCode = smtCode == null ? null : smtCode.trim();
    }

    public String getSmtName() {
        return smtName;
    }

    public void setSmtName(String smtName) {
        this.smtName = smtName == null ? null : smtName.trim();
    }

    public Byte getSmtMessageSwitch() {
        return smtMessageSwitch;
    }

    public void setSmtMessageSwitch(Byte smtMessageSwitch) {
        this.smtMessageSwitch = smtMessageSwitch;
    }

    public String getSmtMessageContent() {
        return smtMessageContent;
    }

    public void setSmtMessageContent(String smtMessageContent) {
        this.smtMessageContent = smtMessageContent == null ? null : smtMessageContent.trim();
    }

    public Byte getSmtShortSwitch() {
        return smtShortSwitch;
    }

    public void setSmtShortSwitch(Byte smtShortSwitch) {
        this.smtShortSwitch = smtShortSwitch;
    }

    public String getSmtShortContent() {
        return smtShortContent;
    }

    public void setSmtShortContent(String smtShortContent) {
        this.smtShortContent = smtShortContent == null ? null : smtShortContent.trim();
    }

    public Byte getSmtMailSwitch() {
        return smtMailSwitch;
    }

    public void setSmtMailSwitch(Byte smtMailSwitch) {
        this.smtMailSwitch = smtMailSwitch;
    }

    public String getSmtMailSubject() {
        return smtMailSubject;
    }

    public void setSmtMailSubject(String smtMailSubject) {
        this.smtMailSubject = smtMailSubject == null ? null : smtMailSubject.trim();
    }

    public String getSmtMailContent() {
        return smtMailContent;
    }

    public void setSmtMailContent(String smtMailContent) {
        this.smtMailContent = smtMailContent == null ? null : smtMailContent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", smtCode=").append(smtCode);
        sb.append(", smtName=").append(smtName);
        sb.append(", smtMessageSwitch=").append(smtMessageSwitch);
        sb.append(", smtMessageContent=").append(smtMessageContent);
        sb.append(", smtShortSwitch=").append(smtShortSwitch);
        sb.append(", smtShortContent=").append(smtShortContent);
        sb.append(", smtMailSwitch=").append(smtMailSwitch);
        sb.append(", smtMailSubject=").append(smtMailSubject);
        sb.append(", smtMailContent=").append(smtMailContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}