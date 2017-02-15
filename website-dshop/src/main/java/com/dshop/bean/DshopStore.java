/*
 * DshopStore.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.bean;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 店铺表
 * @author lpl
 */
public class DshopStore implements Serializable {
    /**
     * 店铺索引id
     */
    private Integer storeId;

    /**
     * 店铺名称
     */
    private String storeName;

    /**
     * 店铺等级
     */
    private Integer gradeId;

    /**
     * 会员id
     */
    private Integer userId;

    /**
     * 会员名称
     */
    private String userName;

    /**
     * 店铺分类
     */
    private Integer storeCategoryId;

    /**
     * 店铺公司名称
     */
    private String storeCompanyName;

    /**
     * 店铺所在省份ID
     */
    private Integer provinceId;

    /**
     * 店铺地址
     */
    private String storeAddress;

    /**
     * 详细地址
     */
    private String storeDetailAddress;

    /**
     * 邮政编码
     */
    private String storeZipcode;

    /**
     * 店铺添加时间
     */
    private String storeAddTime;

    /**
     * 店铺关闭时间
     */
    private String storeCloseTime;

    /**
     * 店铺关闭原因
     */
    private String storeCloseInfo;

    /**
     * 店铺logo
     */
    private String storeLogo;

    /**
     * 店铺横幅
     */
    private String storeBanner;

    /**
     * 店铺头像
     */
    private String storeAvatar;

    /**
     * 店铺seo关键字
     */
    private String storeKeywords;

    /**
     * 店铺seo描述
     */
    private String storeDescription;

    /**
     * QQ
     */
    private String storeQq;

    /**
     * 阿里旺旺
     */
    private String storeWw;

    /**
     * 商家电话
     */
    private String storePhone;

    /**
     * 店铺二级域名
     */
    private String storeDomain;

    /**
     * 二级域名修改次数
     */
    private Boolean storeDomainUpdatecount;

    /**
     * 推荐，0为否，1为是，默认为0
     */
    private Boolean storeRecommend;

    /**
     * 店铺当前主题
     */
    private String storeTheme;

    /**
     * 店铺信用
     */
    private Integer storeCredit;

    /**
     * 描述相符度分数
     */
    private Float storeDescCredit;

    /**
     * 服务态度分数
     */
    private Float storeServiceCredit;

    /**
     * 发货速度分数
     */
    private Float storeDeliveryCredit;

    /**
     * 店铺收藏数量
     */
    private Integer storeCollectCount;

    /**
     * 店铺销量
     */
    private Integer storeSaleCount;

    /**
     * 店铺印章
     */
    private String storeStamp;

    /**
     * 打印订单页面下方说明文字
     */
    private String storePrintDesc;

    /**
     * 工作时间
     */
    private String storeWorkingTime;

    /**
     * 超出该金额免运费，大于0才表示该值有效
     */
    private BigDecimal storeFreePrice;

    /**
     * 店铺装修开关(0-关闭 装修编号-开启)
     */
    private Integer storeDecorationSwitch;

    /**
     * 开启店铺装修时，仅显示店铺装修(1-是 0-否
     */
    private Boolean storeDecorationOnly;

    /**
     * 店铺装修相册图片数量
     */
    private Integer storeDecorationImageCount;

    /**
     * 商铺名称
     */
    private String liveStoreName;

    /**
     * 商家地址
     */
    private String liveStoreAddress;

    /**
     * 商铺电话
     */
    private String liveStoreTel;

    /**
     * 公交线路
     */
    private String liveStoreBus;

    /**
     * 是否自营店铺 1是 0否
     */
    private Byte isOwnShop;

    /**
     * 自营店是否绑定全部分类 0否1是
     */
    private Byte bindAllGc;

    /**
     * 商家兑换码前缀
     */
    private String storeVrcodePrefix;

    /**
     * 手机店铺 页头背景图
     */
    private String mobileTitleImg;

    /**
     * 店铺商品页面左侧显示类型 1默认 2商城相关分类品牌商品推荐
     */
    private Byte leftBarType;

    /**
     * 模板编号
     */
    private Integer template;

    /**
     * 店铺排序
     */
    private Integer storeSort;

    /**
     * 店铺状态，0关闭，1开启，2审核中
     */
    private Boolean storeStatus;

    /**
     * 店铺幻灯片
     */
    private String storeSlide;

    /**
     * 店铺幻灯片链接
     */
    private String storeSlideUrl;

    /**
     * 主营商品
     */
    private String storeMain;

    /**
     * 售前客服
     */
    private String storePreSale;

    /**
     * 售后客服
     */
    private String storeAfterSale;

    /**
     * 手机店铺 轮播图链接地址
     */
    private String mobileSliders;

    private static final long serialVersionUID = 1L;

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getStoreCategoryId() {
        return storeCategoryId;
    }

    public void setStoreCategoryId(Integer storeCategoryId) {
        this.storeCategoryId = storeCategoryId;
    }

    public String getStoreCompanyName() {
        return storeCompanyName;
    }

    public void setStoreCompanyName(String storeCompanyName) {
        this.storeCompanyName = storeCompanyName == null ? null : storeCompanyName.trim();
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress == null ? null : storeAddress.trim();
    }

    public String getStoreDetailAddress() {
        return storeDetailAddress;
    }

    public void setStoreDetailAddress(String storeDetailAddress) {
        this.storeDetailAddress = storeDetailAddress == null ? null : storeDetailAddress.trim();
    }

    public String getStoreZipcode() {
        return storeZipcode;
    }

    public void setStoreZipcode(String storeZipcode) {
        this.storeZipcode = storeZipcode == null ? null : storeZipcode.trim();
    }

    public String getStoreAddTime() {
        return storeAddTime;
    }

    public void setStoreAddTime(String storeAddTime) {
        this.storeAddTime = storeAddTime == null ? null : storeAddTime.trim();
    }

    public String getStoreCloseTime() {
        return storeCloseTime;
    }

    public void setStoreCloseTime(String storeCloseTime) {
        this.storeCloseTime = storeCloseTime == null ? null : storeCloseTime.trim();
    }

    public String getStoreCloseInfo() {
        return storeCloseInfo;
    }

    public void setStoreCloseInfo(String storeCloseInfo) {
        this.storeCloseInfo = storeCloseInfo == null ? null : storeCloseInfo.trim();
    }

    public String getStoreLogo() {
        return storeLogo;
    }

    public void setStoreLogo(String storeLogo) {
        this.storeLogo = storeLogo == null ? null : storeLogo.trim();
    }

    public String getStoreBanner() {
        return storeBanner;
    }

    public void setStoreBanner(String storeBanner) {
        this.storeBanner = storeBanner == null ? null : storeBanner.trim();
    }

    public String getStoreAvatar() {
        return storeAvatar;
    }

    public void setStoreAvatar(String storeAvatar) {
        this.storeAvatar = storeAvatar == null ? null : storeAvatar.trim();
    }

    public String getStoreKeywords() {
        return storeKeywords;
    }

    public void setStoreKeywords(String storeKeywords) {
        this.storeKeywords = storeKeywords == null ? null : storeKeywords.trim();
    }

    public String getStoreDescription() {
        return storeDescription;
    }

    public void setStoreDescription(String storeDescription) {
        this.storeDescription = storeDescription == null ? null : storeDescription.trim();
    }

    public String getStoreQq() {
        return storeQq;
    }

    public void setStoreQq(String storeQq) {
        this.storeQq = storeQq == null ? null : storeQq.trim();
    }

    public String getStoreWw() {
        return storeWw;
    }

    public void setStoreWw(String storeWw) {
        this.storeWw = storeWw == null ? null : storeWw.trim();
    }

    public String getStorePhone() {
        return storePhone;
    }

    public void setStorePhone(String storePhone) {
        this.storePhone = storePhone == null ? null : storePhone.trim();
    }

    public String getStoreDomain() {
        return storeDomain;
    }

    public void setStoreDomain(String storeDomain) {
        this.storeDomain = storeDomain == null ? null : storeDomain.trim();
    }

    public Boolean getStoreDomainUpdatecount() {
        return storeDomainUpdatecount;
    }

    public void setStoreDomainUpdatecount(Boolean storeDomainUpdatecount) {
        this.storeDomainUpdatecount = storeDomainUpdatecount;
    }

    public Boolean getStoreRecommend() {
        return storeRecommend;
    }

    public void setStoreRecommend(Boolean storeRecommend) {
        this.storeRecommend = storeRecommend;
    }

    public String getStoreTheme() {
        return storeTheme;
    }

    public void setStoreTheme(String storeTheme) {
        this.storeTheme = storeTheme == null ? null : storeTheme.trim();
    }

    public Integer getStoreCredit() {
        return storeCredit;
    }

    public void setStoreCredit(Integer storeCredit) {
        this.storeCredit = storeCredit;
    }

    public Float getStoreDescCredit() {
        return storeDescCredit;
    }

    public void setStoreDescCredit(Float storeDescCredit) {
        this.storeDescCredit = storeDescCredit;
    }

    public Float getStoreServiceCredit() {
        return storeServiceCredit;
    }

    public void setStoreServiceCredit(Float storeServiceCredit) {
        this.storeServiceCredit = storeServiceCredit;
    }

    public Float getStoreDeliveryCredit() {
        return storeDeliveryCredit;
    }

    public void setStoreDeliveryCredit(Float storeDeliveryCredit) {
        this.storeDeliveryCredit = storeDeliveryCredit;
    }

    public Integer getStoreCollectCount() {
        return storeCollectCount;
    }

    public void setStoreCollectCount(Integer storeCollectCount) {
        this.storeCollectCount = storeCollectCount;
    }

    public Integer getStoreSaleCount() {
        return storeSaleCount;
    }

    public void setStoreSaleCount(Integer storeSaleCount) {
        this.storeSaleCount = storeSaleCount;
    }

    public String getStoreStamp() {
        return storeStamp;
    }

    public void setStoreStamp(String storeStamp) {
        this.storeStamp = storeStamp == null ? null : storeStamp.trim();
    }

    public String getStorePrintDesc() {
        return storePrintDesc;
    }

    public void setStorePrintDesc(String storePrintDesc) {
        this.storePrintDesc = storePrintDesc == null ? null : storePrintDesc.trim();
    }

    public String getStoreWorkingTime() {
        return storeWorkingTime;
    }

    public void setStoreWorkingTime(String storeWorkingTime) {
        this.storeWorkingTime = storeWorkingTime == null ? null : storeWorkingTime.trim();
    }

    public BigDecimal getStoreFreePrice() {
        return storeFreePrice;
    }

    public void setStoreFreePrice(BigDecimal storeFreePrice) {
        this.storeFreePrice = storeFreePrice;
    }

    public Integer getStoreDecorationSwitch() {
        return storeDecorationSwitch;
    }

    public void setStoreDecorationSwitch(Integer storeDecorationSwitch) {
        this.storeDecorationSwitch = storeDecorationSwitch;
    }

    public Boolean getStoreDecorationOnly() {
        return storeDecorationOnly;
    }

    public void setStoreDecorationOnly(Boolean storeDecorationOnly) {
        this.storeDecorationOnly = storeDecorationOnly;
    }

    public Integer getStoreDecorationImageCount() {
        return storeDecorationImageCount;
    }

    public void setStoreDecorationImageCount(Integer storeDecorationImageCount) {
        this.storeDecorationImageCount = storeDecorationImageCount;
    }

    public String getLiveStoreName() {
        return liveStoreName;
    }

    public void setLiveStoreName(String liveStoreName) {
        this.liveStoreName = liveStoreName == null ? null : liveStoreName.trim();
    }

    public String getLiveStoreAddress() {
        return liveStoreAddress;
    }

    public void setLiveStoreAddress(String liveStoreAddress) {
        this.liveStoreAddress = liveStoreAddress == null ? null : liveStoreAddress.trim();
    }

    public String getLiveStoreTel() {
        return liveStoreTel;
    }

    public void setLiveStoreTel(String liveStoreTel) {
        this.liveStoreTel = liveStoreTel == null ? null : liveStoreTel.trim();
    }

    public String getLiveStoreBus() {
        return liveStoreBus;
    }

    public void setLiveStoreBus(String liveStoreBus) {
        this.liveStoreBus = liveStoreBus == null ? null : liveStoreBus.trim();
    }

    public Byte getIsOwnShop() {
        return isOwnShop;
    }

    public void setIsOwnShop(Byte isOwnShop) {
        this.isOwnShop = isOwnShop;
    }

    public Byte getBindAllGc() {
        return bindAllGc;
    }

    public void setBindAllGc(Byte bindAllGc) {
        this.bindAllGc = bindAllGc;
    }

    public String getStoreVrcodePrefix() {
        return storeVrcodePrefix;
    }

    public void setStoreVrcodePrefix(String storeVrcodePrefix) {
        this.storeVrcodePrefix = storeVrcodePrefix == null ? null : storeVrcodePrefix.trim();
    }

    public String getMobileTitleImg() {
        return mobileTitleImg;
    }

    public void setMobileTitleImg(String mobileTitleImg) {
        this.mobileTitleImg = mobileTitleImg == null ? null : mobileTitleImg.trim();
    }

    public Byte getLeftBarType() {
        return leftBarType;
    }

    public void setLeftBarType(Byte leftBarType) {
        this.leftBarType = leftBarType;
    }

    public Integer getTemplate() {
        return template;
    }

    public void setTemplate(Integer template) {
        this.template = template;
    }

    public Integer getStoreSort() {
        return storeSort;
    }

    public void setStoreSort(Integer storeSort) {
        this.storeSort = storeSort;
    }

    public Boolean getStoreStatus() {
        return storeStatus;
    }

    public void setStoreStatus(Boolean storeStatus) {
        this.storeStatus = storeStatus;
    }

    public String getStoreSlide() {
        return storeSlide;
    }

    public void setStoreSlide(String storeSlide) {
        this.storeSlide = storeSlide == null ? null : storeSlide.trim();
    }

    public String getStoreSlideUrl() {
        return storeSlideUrl;
    }

    public void setStoreSlideUrl(String storeSlideUrl) {
        this.storeSlideUrl = storeSlideUrl == null ? null : storeSlideUrl.trim();
    }

    public String getStoreMain() {
        return storeMain;
    }

    public void setStoreMain(String storeMain) {
        this.storeMain = storeMain == null ? null : storeMain.trim();
    }

    public String getStorePreSale() {
        return storePreSale;
    }

    public void setStorePreSale(String storePreSale) {
        this.storePreSale = storePreSale == null ? null : storePreSale.trim();
    }

    public String getStoreAfterSale() {
        return storeAfterSale;
    }

    public void setStoreAfterSale(String storeAfterSale) {
        this.storeAfterSale = storeAfterSale == null ? null : storeAfterSale.trim();
    }

    public String getMobileSliders() {
        return mobileSliders;
    }

    public void setMobileSliders(String mobileSliders) {
        this.mobileSliders = mobileSliders == null ? null : mobileSliders.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", storeId=").append(storeId);
        sb.append(", storeName=").append(storeName);
        sb.append(", gradeId=").append(gradeId);
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", storeCategoryId=").append(storeCategoryId);
        sb.append(", storeCompanyName=").append(storeCompanyName);
        sb.append(", provinceId=").append(provinceId);
        sb.append(", storeAddress=").append(storeAddress);
        sb.append(", storeDetailAddress=").append(storeDetailAddress);
        sb.append(", storeZipcode=").append(storeZipcode);
        sb.append(", storeAddTime=").append(storeAddTime);
        sb.append(", storeCloseTime=").append(storeCloseTime);
        sb.append(", storeCloseInfo=").append(storeCloseInfo);
        sb.append(", storeLogo=").append(storeLogo);
        sb.append(", storeBanner=").append(storeBanner);
        sb.append(", storeAvatar=").append(storeAvatar);
        sb.append(", storeKeywords=").append(storeKeywords);
        sb.append(", storeDescription=").append(storeDescription);
        sb.append(", storeQq=").append(storeQq);
        sb.append(", storeWw=").append(storeWw);
        sb.append(", storePhone=").append(storePhone);
        sb.append(", storeDomain=").append(storeDomain);
        sb.append(", storeDomainUpdatecount=").append(storeDomainUpdatecount);
        sb.append(", storeRecommend=").append(storeRecommend);
        sb.append(", storeTheme=").append(storeTheme);
        sb.append(", storeCredit=").append(storeCredit);
        sb.append(", storeDescCredit=").append(storeDescCredit);
        sb.append(", storeServiceCredit=").append(storeServiceCredit);
        sb.append(", storeDeliveryCredit=").append(storeDeliveryCredit);
        sb.append(", storeCollectCount=").append(storeCollectCount);
        sb.append(", storeSaleCount=").append(storeSaleCount);
        sb.append(", storeStamp=").append(storeStamp);
        sb.append(", storePrintDesc=").append(storePrintDesc);
        sb.append(", storeWorkingTime=").append(storeWorkingTime);
        sb.append(", storeFreePrice=").append(storeFreePrice);
        sb.append(", storeDecorationSwitch=").append(storeDecorationSwitch);
        sb.append(", storeDecorationOnly=").append(storeDecorationOnly);
        sb.append(", storeDecorationImageCount=").append(storeDecorationImageCount);
        sb.append(", liveStoreName=").append(liveStoreName);
        sb.append(", liveStoreAddress=").append(liveStoreAddress);
        sb.append(", liveStoreTel=").append(liveStoreTel);
        sb.append(", liveStoreBus=").append(liveStoreBus);
        sb.append(", isOwnShop=").append(isOwnShop);
        sb.append(", bindAllGc=").append(bindAllGc);
        sb.append(", storeVrcodePrefix=").append(storeVrcodePrefix);
        sb.append(", mobileTitleImg=").append(mobileTitleImg);
        sb.append(", leftBarType=").append(leftBarType);
        sb.append(", template=").append(template);
        sb.append(", storeSort=").append(storeSort);
        sb.append(", storeStatus=").append(storeStatus);
        sb.append(", storeSlide=").append(storeSlide);
        sb.append(", storeSlideUrl=").append(storeSlideUrl);
        sb.append(", storeMain=").append(storeMain);
        sb.append(", storePreSale=").append(storePreSale);
        sb.append(", storeAfterSale=").append(storeAfterSale);
        sb.append(", mobileSliders=").append(mobileSliders);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}