/*
 * DshopAdmin.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.bean;

import java.io.Serializable;

/**
 * 管理员表
 * @author lpl
 */
public class DshopAdmin implements Serializable {
    /**
     * 管理员ID
     */
    private Integer adminId;

    /**
     * 管理员名称
     */
    private String adminName;

    /**
     * 管理员头像
     */
    private String adminImage;

    /**
     * 管理员密码
     */
    private String adminPassword;

    /**
     * 注册时间
     */
    private Integer adminRegisterTime;

    /**
     * 登录次数
     */
    private Integer adminLoginNum;

    /**
     * 是否超级管理员
     */
    private Boolean adminIsSuper;

    /**
     * 权限组ID
     */
    private Short adminGid;

    /**
     * 管理员常用操作
     */
    private String adminQuickLink;

    private static final long serialVersionUID = 1L;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getAdminImage() {
        return adminImage;
    }

    public void setAdminImage(String adminImage) {
        this.adminImage = adminImage == null ? null : adminImage.trim();
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }

    public Integer getAdminRegisterTime() {
        return adminRegisterTime;
    }

    public void setAdminRegisterTime(Integer adminRegisterTime) {
        this.adminRegisterTime = adminRegisterTime;
    }

    public Integer getAdminLoginNum() {
        return adminLoginNum;
    }

    public void setAdminLoginNum(Integer adminLoginNum) {
        this.adminLoginNum = adminLoginNum;
    }

    public Boolean getAdminIsSuper() {
        return adminIsSuper;
    }

    public void setAdminIsSuper(Boolean adminIsSuper) {
        this.adminIsSuper = adminIsSuper;
    }

    public Short getAdminGid() {
        return adminGid;
    }

    public void setAdminGid(Short adminGid) {
        this.adminGid = adminGid;
    }

    public String getAdminQuickLink() {
        return adminQuickLink;
    }

    public void setAdminQuickLink(String adminQuickLink) {
        this.adminQuickLink = adminQuickLink == null ? null : adminQuickLink.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", adminId=").append(adminId);
        sb.append(", adminName=").append(adminName);
        sb.append(", adminImage=").append(adminImage);
        sb.append(", adminPassword=").append(adminPassword);
        sb.append(", adminRegisterTime=").append(adminRegisterTime);
        sb.append(", adminLoginNum=").append(adminLoginNum);
        sb.append(", adminIsSuper=").append(adminIsSuper);
        sb.append(", adminGid=").append(adminGid);
        sb.append(", adminQuickLink=").append(adminQuickLink);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}