/*
 * DshopGoods.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品公共内容表
 * @author lpl
 */
public class DshopGoods implements Serializable {
    /**
     * 商品表id
     */
    private Integer goodsId;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品描述
     */
    private String goodsDesc;

    /**
     * 商品主图
     */
    private String goodsImage;

    /**
     * 商品分类
     */
    private Integer cateId;

    /**
     * 一级分类id
     */
    private Integer cateId1;

    /**
     * 二级分类id
     */
    private Integer cateId2;

    /**
     * 三级分类id
     */
    private Integer cateId3;

    /**
     * 商品分类名称
     */
    private String gcName;

    /**
     * 店铺id
     */
    private Integer storeId;

    /**
     * 店铺名称
     */
    private String storeName;

    /**
     * 属性名称
     */
    private String attrName;

    /**
     * 品牌id
     */
    private Integer brandId;

    /**
     * 品牌名称
     */
    private String brandName;

    /**
     * 类型id
     */
    private Integer typeId;

    /**
     * 商品状态 0默认，1正常，2下架，10违规（禁售）
     */
    private Byte goodsStatus;

    /**
     * 违规原因
     */
    private String goodsStateremark;

    /**
     * 商品审核 1通过，0未通过，10审核中
     */
    private Byte goodsVerify;

    /**
     * 审核失败原因
     */
    private String goodsVerifyremark;

    /**
     * 商品锁定 0未锁，1已锁
     */
    private Byte goodsLock;

    /**
     * 商品促销价格
     */
    private BigDecimal goodsPromotionPrice;

    /**
     * 促销类型 0无促销，1团购，2限时折扣
     */
    private Byte goodsPromotionType;

    /**
     * 商品价格
     */
    private BigDecimal goodsPrice;

    /**
     * 市场价
     */
    private BigDecimal goodsMarketPrice;

    /**
     * 成本价
     */
    private BigDecimal goodsCostPrice;

    /**
     * 折扣
     */
    private Float goodsDiscount;

    /**
     * 商品货号
     */
    private String goodsSerial;

    /**
     * 库存报警值
     */
    private Byte goodsStorageAlarm;

    /**
     * 商品条形码
     */
    private String goodsBarcode;

    /**
     * 运费模板
     */
    private Integer transportId;

    /**
     * 运费模板名称
     */
    private String transportTitle;

    /**
     * 商品推荐 1是，0否，默认为0
     */
    private Byte goodsCommend;

    /**
     * 运费 0为免运费
     */
    private BigDecimal goodsFreight;

    /**
     * 是否开具增值税发票 1是，0否
     */
    private Byte goodsVat;

    /**
     * 一级地区id
     */
    private Integer areaid1;

    /**
     * 二级地区id
     */
    private Integer areaid2;

    /**
     * 店铺分类id 首尾用,隔开
     */
    private String goodsStcids;

    /**
     * 顶部关联板式
     */
    private Integer plateidTop;

    /**
     * 底部关联板式
     */
    private Integer plateidBottom;

    /**
     * 是否为虚拟商品 1是，0否
     */
    private Byte isVirtual;

    /**
     * 虚拟商品有效期
     */
    private Date virtualIndate;

    /**
     * 虚拟商品购买上限
     */
    private Byte virtualLimit;

    /**
     * 是否允许过期退款， 1是，0否
     */
    private Byte virtualInvalidRefund;

    /**
     * 是否是预约商品 1是，0否
     */
    private Byte isAppoint;

    /**
     * 预约商品出售时间
     */
    private Date appointSatedate;

    /**
     * 供应商id
     */
    private Integer supId;

    /**
     * 是否为F码商品 1是，0否
     */
    private Byte isFcode;

    /**
     * 是否是预售商品 1是，0否
     */
    private Byte isPreSell;

    /**
     * 预售商品发货时间
     */
    private Date preSellShipdate;

    /**
     * 是否为预定商品，1是，0否
     */
    private Byte isBook;

    /**
     * 定金金额
     */
    private BigDecimal bookDownPayment;

    /**
     * 尾款金额
     */
    private BigDecimal bookFinalPayment;

    /**
     * 预定结束时间
     */
    private Date bookDownTime;

    /**
     * 预定人数
     */
    private Integer bookBuyers;

    /**
     * 是否拥有赠品
     */
    private Byte isHaveGift;

    /**
     * 好评星级
     */
    private Byte commentGoodStar;

    /**
     * 评论数
     */
    private Integer commentCount;

    /**
     * 商品点击数量
     */
    private Integer goodsClickCount;

    /**
     * 销售数量
     */
    private Integer goodsSaleCount;

    /**
     * 收藏数量
     */
    private Integer goodsCollectCount;

    /**
     * 是否为平台自营
     */
    private Byte isOwnShop;

    /**
     * 商品添加时间
     */
    private Date goodsAddTime;

    /**
     * 商品编辑时间
     */
    private Date goodsEditTime;

    /**
     * 上架时间
     */
    private Date goodsSellTime;

    /**
     * 商品模块
     */
    private Integer template;

    /**
     * 电子券
     */
    private Integer goodsIntegral;

    /**
     * 是否是定制商品
     */
    private Integer isTailorMade;

    /**
     * 扩展1
     */
    private String goodsExt1;

    /**
     * 扩展2
     */
    private String goodsExt2;

    /**
     * 扩展3
     */
    private String goodsExt3;

    /**
     * 属性值
     */
    private String attrValue;

    /**
     * 商品属性
     */
    private String goodsAttr;

    /**
     * 商品自定义属性
     */
    private String goodsCustom;

    /**
     * 商品内容
     */
    private String goodsBody;

    /**
     * 手机端商品描述
     */
    private String mobileBody;

    /**
     * 扩展JSON
     */
    private String goodsJson;

    private static final long serialVersionUID = 1L;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public String getGoodsImage() {
        return goodsImage;
    }

    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage;
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

    public String getGcName() {
        return gcName;
    }

    public void setGcName(String gcName) {
        this.gcName = gcName;
    }

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
        this.storeName = storeName;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Byte getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(Byte goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public String getGoodsStateremark() {
        return goodsStateremark;
    }

    public void setGoodsStateremark(String goodsStateremark) {
        this.goodsStateremark = goodsStateremark;
    }

    public Byte getGoodsVerify() {
        return goodsVerify;
    }

    public void setGoodsVerify(Byte goodsVerify) {
        this.goodsVerify = goodsVerify;
    }

    public String getGoodsVerifyremark() {
        return goodsVerifyremark;
    }

    public void setGoodsVerifyremark(String goodsVerifyremark) {
        this.goodsVerifyremark = goodsVerifyremark;
    }

    public Byte getGoodsLock() {
        return goodsLock;
    }

    public void setGoodsLock(Byte goodsLock) {
        this.goodsLock = goodsLock;
    }

    public BigDecimal getGoodsPromotionPrice() {
        return goodsPromotionPrice;
    }

    public void setGoodsPromotionPrice(BigDecimal goodsPromotionPrice) {
        this.goodsPromotionPrice = goodsPromotionPrice;
    }

    public Byte getGoodsPromotionType() {
        return goodsPromotionType;
    }

    public void setGoodsPromotionType(Byte goodsPromotionType) {
        this.goodsPromotionType = goodsPromotionType;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public BigDecimal getGoodsMarketPrice() {
        return goodsMarketPrice;
    }

    public void setGoodsMarketPrice(BigDecimal goodsMarketPrice) {
        this.goodsMarketPrice = goodsMarketPrice;
    }

    public BigDecimal getGoodsCostPrice() {
        return goodsCostPrice;
    }

    public void setGoodsCostPrice(BigDecimal goodsCostPrice) {
        this.goodsCostPrice = goodsCostPrice;
    }

    public Float getGoodsDiscount() {
        return goodsDiscount;
    }

    public void setGoodsDiscount(Float goodsDiscount) {
        this.goodsDiscount = goodsDiscount;
    }

    public String getGoodsSerial() {
        return goodsSerial;
    }

    public void setGoodsSerial(String goodsSerial) {
        this.goodsSerial = goodsSerial;
    }

    public Byte getGoodsStorageAlarm() {
        return goodsStorageAlarm;
    }

    public void setGoodsStorageAlarm(Byte goodsStorageAlarm) {
        this.goodsStorageAlarm = goodsStorageAlarm;
    }

    public String getGoodsBarcode() {
        return goodsBarcode;
    }

    public void setGoodsBarcode(String goodsBarcode) {
        this.goodsBarcode = goodsBarcode;
    }

    public Integer getTransportId() {
        return transportId;
    }

    public void setTransportId(Integer transportId) {
        this.transportId = transportId;
    }

    public String getTransportTitle() {
        return transportTitle;
    }

    public void setTransportTitle(String transportTitle) {
        this.transportTitle = transportTitle;
    }

    public Byte getGoodsCommend() {
        return goodsCommend;
    }

    public void setGoodsCommend(Byte goodsCommend) {
        this.goodsCommend = goodsCommend;
    }

    public BigDecimal getGoodsFreight() {
        return goodsFreight;
    }

    public void setGoodsFreight(BigDecimal goodsFreight) {
        this.goodsFreight = goodsFreight;
    }

    public Byte getGoodsVat() {
        return goodsVat;
    }

    public void setGoodsVat(Byte goodsVat) {
        this.goodsVat = goodsVat;
    }

    public Integer getAreaid1() {
        return areaid1;
    }

    public void setAreaid1(Integer areaid1) {
        this.areaid1 = areaid1;
    }

    public Integer getAreaid2() {
        return areaid2;
    }

    public void setAreaid2(Integer areaid2) {
        this.areaid2 = areaid2;
    }

    public String getGoodsStcids() {
        return goodsStcids;
    }

    public void setGoodsStcids(String goodsStcids) {
        this.goodsStcids = goodsStcids;
    }

    public Integer getPlateidTop() {
        return plateidTop;
    }

    public void setPlateidTop(Integer plateidTop) {
        this.plateidTop = plateidTop;
    }

    public Integer getPlateidBottom() {
        return plateidBottom;
    }

    public void setPlateidBottom(Integer plateidBottom) {
        this.plateidBottom = plateidBottom;
    }

    public Byte getIsVirtual() {
        return isVirtual;
    }

    public void setIsVirtual(Byte isVirtual) {
        this.isVirtual = isVirtual;
    }

    public Date getVirtualIndate() {
        return virtualIndate;
    }

    public void setVirtualIndate(Date virtualIndate) {
        this.virtualIndate = virtualIndate;
    }

    public Byte getVirtualLimit() {
        return virtualLimit;
    }

    public void setVirtualLimit(Byte virtualLimit) {
        this.virtualLimit = virtualLimit;
    }

    public Byte getVirtualInvalidRefund() {
        return virtualInvalidRefund;
    }

    public void setVirtualInvalidRefund(Byte virtualInvalidRefund) {
        this.virtualInvalidRefund = virtualInvalidRefund;
    }

    public Byte getIsAppoint() {
        return isAppoint;
    }

    public void setIsAppoint(Byte isAppoint) {
        this.isAppoint = isAppoint;
    }

    public Date getAppointSatedate() {
        return appointSatedate;
    }

    public void setAppointSatedate(Date appointSatedate) {
        this.appointSatedate = appointSatedate;
    }

    public Integer getSupId() {
        return supId;
    }

    public void setSupId(Integer supId) {
        this.supId = supId;
    }

    public Byte getIsFcode() {
        return isFcode;
    }

    public void setIsFcode(Byte isFcode) {
        this.isFcode = isFcode;
    }

    public Byte getIsPreSell() {
        return isPreSell;
    }

    public void setIsPreSell(Byte isPreSell) {
        this.isPreSell = isPreSell;
    }

    public Date getPreSellShipdate() {
        return preSellShipdate;
    }

    public void setPreSellShipdate(Date preSellShipdate) {
        this.preSellShipdate = preSellShipdate;
    }

    public Byte getIsBook() {
        return isBook;
    }

    public void setIsBook(Byte isBook) {
        this.isBook = isBook;
    }

    public BigDecimal getBookDownPayment() {
        return bookDownPayment;
    }

    public void setBookDownPayment(BigDecimal bookDownPayment) {
        this.bookDownPayment = bookDownPayment;
    }

    public BigDecimal getBookFinalPayment() {
        return bookFinalPayment;
    }

    public void setBookFinalPayment(BigDecimal bookFinalPayment) {
        this.bookFinalPayment = bookFinalPayment;
    }

    public Date getBookDownTime() {
        return bookDownTime;
    }

    public void setBookDownTime(Date bookDownTime) {
        this.bookDownTime = bookDownTime;
    }

    public Integer getBookBuyers() {
        return bookBuyers;
    }

    public void setBookBuyers(Integer bookBuyers) {
        this.bookBuyers = bookBuyers;
    }

    public Byte getIsHaveGift() {
        return isHaveGift;
    }

    public void setIsHaveGift(Byte isHaveGift) {
        this.isHaveGift = isHaveGift;
    }

    public Byte getCommentGoodStar() {
        return commentGoodStar;
    }

    public void setCommentGoodStar(Byte commentGoodStar) {
        this.commentGoodStar = commentGoodStar;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getGoodsClickCount() {
        return goodsClickCount;
    }

    public void setGoodsClickCount(Integer goodsClickCount) {
        this.goodsClickCount = goodsClickCount;
    }

    public Integer getGoodsSaleCount() {
        return goodsSaleCount;
    }

    public void setGoodsSaleCount(Integer goodsSaleCount) {
        this.goodsSaleCount = goodsSaleCount;
    }

    public Integer getGoodsCollectCount() {
        return goodsCollectCount;
    }

    public void setGoodsCollectCount(Integer goodsCollectCount) {
        this.goodsCollectCount = goodsCollectCount;
    }

    public Byte getIsOwnShop() {
        return isOwnShop;
    }

    public void setIsOwnShop(Byte isOwnShop) {
        this.isOwnShop = isOwnShop;
    }

    public Date getGoodsAddTime() {
        return goodsAddTime;
    }

    public void setGoodsAddTime(Date goodsAddTime) {
        this.goodsAddTime = goodsAddTime;
    }

    public Date getGoodsEditTime() {
        return goodsEditTime;
    }

    public void setGoodsEditTime(Date goodsEditTime) {
        this.goodsEditTime = goodsEditTime;
    }

    public Date getGoodsSellTime() {
        return goodsSellTime;
    }

    public void setGoodsSellTime(Date goodsSellTime) {
        this.goodsSellTime = goodsSellTime;
    }

    public Integer getTemplate() {
        return template;
    }

    public void setTemplate(Integer template) {
        this.template = template;
    }

    public Integer getGoodsIntegral() {
        return goodsIntegral;
    }

    public void setGoodsIntegral(Integer goodsIntegral) {
        this.goodsIntegral = goodsIntegral;
    }

    public Integer getIsTailorMade() {
        return isTailorMade;
    }

    public void setIsTailorMade(Integer isTailorMade) {
        this.isTailorMade = isTailorMade;
    }

    public String getGoodsExt1() {
        return goodsExt1;
    }

    public void setGoodsExt1(String goodsExt1) {
        this.goodsExt1 = goodsExt1;
    }

    public String getGoodsExt2() {
        return goodsExt2;
    }

    public void setGoodsExt2(String goodsExt2) {
        this.goodsExt2 = goodsExt2;
    }

    public String getGoodsExt3() {
        return goodsExt3;
    }

    public void setGoodsExt3(String goodsExt3) {
        this.goodsExt3 = goodsExt3;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }

    public String getGoodsAttr() {
        return goodsAttr;
    }

    public void setGoodsAttr(String goodsAttr) {
        this.goodsAttr = goodsAttr;
    }

    public String getGoodsCustom() {
        return goodsCustom;
    }

    public void setGoodsCustom(String goodsCustom) {
        this.goodsCustom = goodsCustom;
    }

    public String getGoodsBody() {
        return goodsBody;
    }

    public void setGoodsBody(String goodsBody) {
        this.goodsBody = goodsBody;
    }

    public String getMobileBody() {
        return mobileBody;
    }

    public void setMobileBody(String mobileBody) {
        this.mobileBody = mobileBody;
    }

    public String getGoodsJson() {
        return goodsJson;
    }

    public void setGoodsJson(String goodsJson) {
        this.goodsJson = goodsJson;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", goodsDesc=").append(goodsDesc);
        sb.append(", goodsImage=").append(goodsImage);
        sb.append(", cateId=").append(cateId);
        sb.append(", cateId1=").append(cateId1);
        sb.append(", cateId2=").append(cateId2);
        sb.append(", cateId3=").append(cateId3);
        sb.append(", gcName=").append(gcName);
        sb.append(", storeId=").append(storeId);
        sb.append(", storeName=").append(storeName);
        sb.append(", attrName=").append(attrName);
        sb.append(", brandId=").append(brandId);
        sb.append(", brandName=").append(brandName);
        sb.append(", typeId=").append(typeId);
        sb.append(", goodsStatus=").append(goodsStatus);
        sb.append(", goodsStateremark=").append(goodsStateremark);
        sb.append(", goodsVerify=").append(goodsVerify);
        sb.append(", goodsVerifyremark=").append(goodsVerifyremark);
        sb.append(", goodsLock=").append(goodsLock);
        sb.append(", goodsPromotionPrice=").append(goodsPromotionPrice);
        sb.append(", goodsPromotionType=").append(goodsPromotionType);
        sb.append(", goodsPrice=").append(goodsPrice);
        sb.append(", goodsMarketPrice=").append(goodsMarketPrice);
        sb.append(", goodsCostPrice=").append(goodsCostPrice);
        sb.append(", goodsDiscount=").append(goodsDiscount);
        sb.append(", goodsSerial=").append(goodsSerial);
        sb.append(", goodsStorageAlarm=").append(goodsStorageAlarm);
        sb.append(", goodsBarcode=").append(goodsBarcode);
        sb.append(", transportId=").append(transportId);
        sb.append(", transportTitle=").append(transportTitle);
        sb.append(", goodsCommend=").append(goodsCommend);
        sb.append(", goodsFreight=").append(goodsFreight);
        sb.append(", goodsVat=").append(goodsVat);
        sb.append(", areaid1=").append(areaid1);
        sb.append(", areaid2=").append(areaid2);
        sb.append(", goodsStcids=").append(goodsStcids);
        sb.append(", plateidTop=").append(plateidTop);
        sb.append(", plateidBottom=").append(plateidBottom);
        sb.append(", isVirtual=").append(isVirtual);
        sb.append(", virtualIndate=").append(virtualIndate);
        sb.append(", virtualLimit=").append(virtualLimit);
        sb.append(", virtualInvalidRefund=").append(virtualInvalidRefund);
        sb.append(", isAppoint=").append(isAppoint);
        sb.append(", appointSatedate=").append(appointSatedate);
        sb.append(", supId=").append(supId);
        sb.append(", isFcode=").append(isFcode);
        sb.append(", isPreSell=").append(isPreSell);
        sb.append(", preSellShipdate=").append(preSellShipdate);
        sb.append(", isBook=").append(isBook);
        sb.append(", bookDownPayment=").append(bookDownPayment);
        sb.append(", bookFinalPayment=").append(bookFinalPayment);
        sb.append(", bookDownTime=").append(bookDownTime);
        sb.append(", bookBuyers=").append(bookBuyers);
        sb.append(", isHaveGift=").append(isHaveGift);
        sb.append(", commentGoodStar=").append(commentGoodStar);
        sb.append(", commentCount=").append(commentCount);
        sb.append(", goodsClickCount=").append(goodsClickCount);
        sb.append(", goodsSaleCount=").append(goodsSaleCount);
        sb.append(", goodsCollectCount=").append(goodsCollectCount);
        sb.append(", isOwnShop=").append(isOwnShop);
        sb.append(", goodsAddTime=").append(goodsAddTime);
        sb.append(", goodsEditTime=").append(goodsEditTime);
        sb.append(", goodsSellTime=").append(goodsSellTime);
        sb.append(", template=").append(template);
        sb.append(", goodsIntegral=").append(goodsIntegral);
        sb.append(", isTailorMade=").append(isTailorMade);
        sb.append(", goodsExt1=").append(goodsExt1);
        sb.append(", goodsExt2=").append(goodsExt2);
        sb.append(", goodsExt3=").append(goodsExt3);
        sb.append(", attrValue=").append(attrValue);
        sb.append(", goodsAttr=").append(goodsAttr);
        sb.append(", goodsCustom=").append(goodsCustom);
        sb.append(", goodsBody=").append(goodsBody);
        sb.append(", mobileBody=").append(mobileBody);
        sb.append(", goodsJson=").append(goodsJson);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}