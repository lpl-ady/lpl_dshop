/*
 * DshopStoreJoin.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 店铺入驻表
 * @author lpl
 */
public class DshopStoreJoin implements Serializable {
    /**
     * 用户编号
     */
    private Integer userId;

    /**
     * 店主用户名
     */
    private String userName;

    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 所在地省ID
     */
    private Integer companyProvinceId;

    /**
     * 公司地址
     */
    private String companyAddress;

    /**
     * 公司详细地址
     */
    private String companyAddressDetail;

    /**
     * 公司电话
     */
    private String companyPhone;

    /**
     * 员工总数
     */
    private Integer companyEmployeeCount;

    /**
     * 注册资金
     */
    private Integer companyRegisteredCapital;

    /**
     * 联系人姓名
     */
    private String contactsName;

    /**
     * 联系人电话
     */
    private String contactsPhone;

    /**
     * 联系人邮箱
     */
    private String contactsEmail;

    /**
     * 营业执照号
     */
    private String businessLicenceNumber;

    /**
     * 营业执所在地
     */
    private String businessLicenceAddress;

    /**
     * 营业执照有效期开始
     */
    private Date businessLicenceStart;

    /**
     * 营业执照有效期结束
     */
    private Date businessLicenceEnd;

    /**
     * 法定经营范围
     */
    private String businessSphere;

    /**
     * 营业执照电子版
     */
    private String businessLicenceNumberElc;

    /**
     * 组织机构代码
     */
    private String organizationCode;

    /**
     * 组织机构代码电子版
     */
    private String organizationCodeElectronic;

    /**
     * 一般纳税人证明
     */
    private String generalTaxpayer;

    /**
     * 银行开户名
     */
    private String bankAccountName;

    /**
     * 公司银行账号
     */
    private String bankAccountNumber;

    /**
     * 开户银行支行名称
     */
    private String bankName;

    /**
     * 支行联行号
     */
    private String bankCode;

    /**
     * 开户银行所在地
     */
    private String bankAddress;

    /**
     * 开户银行许可证电子版
     */
    private String bankLicenceElectronic;

    /**
     * 开户行账号是否为结算账号 1-开户行就是结算账号 2-独立的计算账号
     */
    private Boolean isSettlementAccount;

    /**
     * 结算银行开户名
     */
    private String settlementBankAccountName;

    /**
     * 结算公司银行账号
     */
    private String settlementBankAccountNumber;

    /**
     * 结算开户银行支行名称
     */
    private String settlementBankName;

    /**
     * 结算支行联行号
     */
    private String settlementBankCode;

    /**
     * 结算开户银行所在地
     */
    private String settlementBankAddress;

    /**
     * 税务登记证号
     */
    private String taxRegistrationCertificate;

    /**
     * 纳税人识别号
     */
    private String taxpayerId;

    /**
     * 税务登记证号电子版
     */
    private String taxRegistrationCertifElc;

    /**
     * 卖家账号
     */
    private String sellerName;

    /**
     * 店铺名称
     */
    private String storeName;

    /**
     * 店铺分类编号集合
     */
    private String storeClassIds;

    /**
     * 店铺分类名称集合
     */
    private String storeClassNames;

    /**
     * 申请状态 10-已提交申请 11-缴费完成  20-审核成功 30-审核失败 31-缴费审核失败 40-审核通过开店
     */
    private String joininStatus;

    /**
     * 管理员审核信息
     */
    private String joininMessage;

    /**
     * 开店时长(年)
     */
    private Byte joininYear;

    /**
     * 店铺等级编号
     */
    private Integer gradeId;

    /**
     * 店铺等级名称
     */
    private String gradeName;

    /**
     * 店铺等级下的收费等信息
     */
    private String gradeInfo;

    /**
     * 店铺分类名称
     */
    private String scName;

    /**
     * 店铺分类编号
     */
    private Integer scId;

    /**
     * 店铺分类保证金
     */
    private Integer scBail;

    /**
     * 分类佣金比例
     */
    private String storeClassCommisRates;

    /**
     * 付款凭证
     */
    private String payingMoneyCertificate;

    /**
     * 付款凭证说明
     */
    private String payingMoneyCertifExp;

    /**
     * 付款金额
     */
    private BigDecimal payingAmount;

    /**
     * 法人身份证正面
     */
    private String idCardFront;

    /**
     * 法人身份证反面
     */
    private String idCardVerso;

    /**
     * 授权书
     */
    private String impowerBook;

    /**
     * 代收款证明
     */
    private String collectionProve;

    /**
     * 合同ID
     */
    private String storeContractId;

    /**
     * 合同文件
     */
    private String storeContractFile;

    /**
     * 商标注册证明
     */
    private String brandImage;

    /**
     * 商标权人出具的授权书
     */
    private String trademarksImpowerBook;

    /**
     * 质检报告
     */
    private String qualityControlReport;

    private static final long serialVersionUID = 1L;

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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public Integer getCompanyProvinceId() {
        return companyProvinceId;
    }

    public void setCompanyProvinceId(Integer companyProvinceId) {
        this.companyProvinceId = companyProvinceId;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress == null ? null : companyAddress.trim();
    }

    public String getCompanyAddressDetail() {
        return companyAddressDetail;
    }

    public void setCompanyAddressDetail(String companyAddressDetail) {
        this.companyAddressDetail = companyAddressDetail == null ? null : companyAddressDetail.trim();
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone == null ? null : companyPhone.trim();
    }

    public Integer getCompanyEmployeeCount() {
        return companyEmployeeCount;
    }

    public void setCompanyEmployeeCount(Integer companyEmployeeCount) {
        this.companyEmployeeCount = companyEmployeeCount;
    }

    public Integer getCompanyRegisteredCapital() {
        return companyRegisteredCapital;
    }

    public void setCompanyRegisteredCapital(Integer companyRegisteredCapital) {
        this.companyRegisteredCapital = companyRegisteredCapital;
    }

    public String getContactsName() {
        return contactsName;
    }

    public void setContactsName(String contactsName) {
        this.contactsName = contactsName == null ? null : contactsName.trim();
    }

    public String getContactsPhone() {
        return contactsPhone;
    }

    public void setContactsPhone(String contactsPhone) {
        this.contactsPhone = contactsPhone == null ? null : contactsPhone.trim();
    }

    public String getContactsEmail() {
        return contactsEmail;
    }

    public void setContactsEmail(String contactsEmail) {
        this.contactsEmail = contactsEmail == null ? null : contactsEmail.trim();
    }

    public String getBusinessLicenceNumber() {
        return businessLicenceNumber;
    }

    public void setBusinessLicenceNumber(String businessLicenceNumber) {
        this.businessLicenceNumber = businessLicenceNumber == null ? null : businessLicenceNumber.trim();
    }

    public String getBusinessLicenceAddress() {
        return businessLicenceAddress;
    }

    public void setBusinessLicenceAddress(String businessLicenceAddress) {
        this.businessLicenceAddress = businessLicenceAddress == null ? null : businessLicenceAddress.trim();
    }

    public Date getBusinessLicenceStart() {
        return businessLicenceStart;
    }

    public void setBusinessLicenceStart(Date businessLicenceStart) {
        this.businessLicenceStart = businessLicenceStart;
    }

    public Date getBusinessLicenceEnd() {
        return businessLicenceEnd;
    }

    public void setBusinessLicenceEnd(Date businessLicenceEnd) {
        this.businessLicenceEnd = businessLicenceEnd;
    }

    public String getBusinessSphere() {
        return businessSphere;
    }

    public void setBusinessSphere(String businessSphere) {
        this.businessSphere = businessSphere == null ? null : businessSphere.trim();
    }

    public String getBusinessLicenceNumberElc() {
        return businessLicenceNumberElc;
    }

    public void setBusinessLicenceNumberElc(String businessLicenceNumberElc) {
        this.businessLicenceNumberElc = businessLicenceNumberElc == null ? null : businessLicenceNumberElc.trim();
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode == null ? null : organizationCode.trim();
    }

    public String getOrganizationCodeElectronic() {
        return organizationCodeElectronic;
    }

    public void setOrganizationCodeElectronic(String organizationCodeElectronic) {
        this.organizationCodeElectronic = organizationCodeElectronic == null ? null : organizationCodeElectronic.trim();
    }

    public String getGeneralTaxpayer() {
        return generalTaxpayer;
    }

    public void setGeneralTaxpayer(String generalTaxpayer) {
        this.generalTaxpayer = generalTaxpayer == null ? null : generalTaxpayer.trim();
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName == null ? null : bankAccountName.trim();
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber == null ? null : bankAccountNumber.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress == null ? null : bankAddress.trim();
    }

    public String getBankLicenceElectronic() {
        return bankLicenceElectronic;
    }

    public void setBankLicenceElectronic(String bankLicenceElectronic) {
        this.bankLicenceElectronic = bankLicenceElectronic == null ? null : bankLicenceElectronic.trim();
    }

    public Boolean getIsSettlementAccount() {
        return isSettlementAccount;
    }

    public void setIsSettlementAccount(Boolean isSettlementAccount) {
        this.isSettlementAccount = isSettlementAccount;
    }

    public String getSettlementBankAccountName() {
        return settlementBankAccountName;
    }

    public void setSettlementBankAccountName(String settlementBankAccountName) {
        this.settlementBankAccountName = settlementBankAccountName == null ? null : settlementBankAccountName.trim();
    }

    public String getSettlementBankAccountNumber() {
        return settlementBankAccountNumber;
    }

    public void setSettlementBankAccountNumber(String settlementBankAccountNumber) {
        this.settlementBankAccountNumber = settlementBankAccountNumber == null ? null : settlementBankAccountNumber.trim();
    }

    public String getSettlementBankName() {
        return settlementBankName;
    }

    public void setSettlementBankName(String settlementBankName) {
        this.settlementBankName = settlementBankName == null ? null : settlementBankName.trim();
    }

    public String getSettlementBankCode() {
        return settlementBankCode;
    }

    public void setSettlementBankCode(String settlementBankCode) {
        this.settlementBankCode = settlementBankCode == null ? null : settlementBankCode.trim();
    }

    public String getSettlementBankAddress() {
        return settlementBankAddress;
    }

    public void setSettlementBankAddress(String settlementBankAddress) {
        this.settlementBankAddress = settlementBankAddress == null ? null : settlementBankAddress.trim();
    }

    public String getTaxRegistrationCertificate() {
        return taxRegistrationCertificate;
    }

    public void setTaxRegistrationCertificate(String taxRegistrationCertificate) {
        this.taxRegistrationCertificate = taxRegistrationCertificate == null ? null : taxRegistrationCertificate.trim();
    }

    public String getTaxpayerId() {
        return taxpayerId;
    }

    public void setTaxpayerId(String taxpayerId) {
        this.taxpayerId = taxpayerId == null ? null : taxpayerId.trim();
    }

    public String getTaxRegistrationCertifElc() {
        return taxRegistrationCertifElc;
    }

    public void setTaxRegistrationCertifElc(String taxRegistrationCertifElc) {
        this.taxRegistrationCertifElc = taxRegistrationCertifElc == null ? null : taxRegistrationCertifElc.trim();
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName == null ? null : sellerName.trim();
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public String getStoreClassIds() {
        return storeClassIds;
    }

    public void setStoreClassIds(String storeClassIds) {
        this.storeClassIds = storeClassIds == null ? null : storeClassIds.trim();
    }

    public String getStoreClassNames() {
        return storeClassNames;
    }

    public void setStoreClassNames(String storeClassNames) {
        this.storeClassNames = storeClassNames == null ? null : storeClassNames.trim();
    }

    public String getJoininStatus() {
        return joininStatus;
    }

    public void setJoininStatus(String joininStatus) {
        this.joininStatus = joininStatus == null ? null : joininStatus.trim();
    }

    public String getJoininMessage() {
        return joininMessage;
    }

    public void setJoininMessage(String joininMessage) {
        this.joininMessage = joininMessage == null ? null : joininMessage.trim();
    }

    public Byte getJoininYear() {
        return joininYear;
    }

    public void setJoininYear(Byte joininYear) {
        this.joininYear = joininYear;
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName == null ? null : gradeName.trim();
    }

    public String getGradeInfo() {
        return gradeInfo;
    }

    public void setGradeInfo(String gradeInfo) {
        this.gradeInfo = gradeInfo == null ? null : gradeInfo.trim();
    }

    public String getScName() {
        return scName;
    }

    public void setScName(String scName) {
        this.scName = scName == null ? null : scName.trim();
    }

    public Integer getScId() {
        return scId;
    }

    public void setScId(Integer scId) {
        this.scId = scId;
    }

    public Integer getScBail() {
        return scBail;
    }

    public void setScBail(Integer scBail) {
        this.scBail = scBail;
    }

    public String getStoreClassCommisRates() {
        return storeClassCommisRates;
    }

    public void setStoreClassCommisRates(String storeClassCommisRates) {
        this.storeClassCommisRates = storeClassCommisRates == null ? null : storeClassCommisRates.trim();
    }

    public String getPayingMoneyCertificate() {
        return payingMoneyCertificate;
    }

    public void setPayingMoneyCertificate(String payingMoneyCertificate) {
        this.payingMoneyCertificate = payingMoneyCertificate == null ? null : payingMoneyCertificate.trim();
    }

    public String getPayingMoneyCertifExp() {
        return payingMoneyCertifExp;
    }

    public void setPayingMoneyCertifExp(String payingMoneyCertifExp) {
        this.payingMoneyCertifExp = payingMoneyCertifExp == null ? null : payingMoneyCertifExp.trim();
    }

    public BigDecimal getPayingAmount() {
        return payingAmount;
    }

    public void setPayingAmount(BigDecimal payingAmount) {
        this.payingAmount = payingAmount;
    }

    public String getIdCardFront() {
        return idCardFront;
    }

    public void setIdCardFront(String idCardFront) {
        this.idCardFront = idCardFront == null ? null : idCardFront.trim();
    }

    public String getIdCardVerso() {
        return idCardVerso;
    }

    public void setIdCardVerso(String idCardVerso) {
        this.idCardVerso = idCardVerso == null ? null : idCardVerso.trim();
    }

    public String getImpowerBook() {
        return impowerBook;
    }

    public void setImpowerBook(String impowerBook) {
        this.impowerBook = impowerBook == null ? null : impowerBook.trim();
    }

    public String getCollectionProve() {
        return collectionProve;
    }

    public void setCollectionProve(String collectionProve) {
        this.collectionProve = collectionProve == null ? null : collectionProve.trim();
    }

    public String getStoreContractId() {
        return storeContractId;
    }

    public void setStoreContractId(String storeContractId) {
        this.storeContractId = storeContractId == null ? null : storeContractId.trim();
    }

    public String getStoreContractFile() {
        return storeContractFile;
    }

    public void setStoreContractFile(String storeContractFile) {
        this.storeContractFile = storeContractFile == null ? null : storeContractFile.trim();
    }

    public String getBrandImage() {
        return brandImage;
    }

    public void setBrandImage(String brandImage) {
        this.brandImage = brandImage == null ? null : brandImage.trim();
    }

    public String getTrademarksImpowerBook() {
        return trademarksImpowerBook;
    }

    public void setTrademarksImpowerBook(String trademarksImpowerBook) {
        this.trademarksImpowerBook = trademarksImpowerBook == null ? null : trademarksImpowerBook.trim();
    }

    public String getQualityControlReport() {
        return qualityControlReport;
    }

    public void setQualityControlReport(String qualityControlReport) {
        this.qualityControlReport = qualityControlReport == null ? null : qualityControlReport.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", companyName=").append(companyName);
        sb.append(", companyProvinceId=").append(companyProvinceId);
        sb.append(", companyAddress=").append(companyAddress);
        sb.append(", companyAddressDetail=").append(companyAddressDetail);
        sb.append(", companyPhone=").append(companyPhone);
        sb.append(", companyEmployeeCount=").append(companyEmployeeCount);
        sb.append(", companyRegisteredCapital=").append(companyRegisteredCapital);
        sb.append(", contactsName=").append(contactsName);
        sb.append(", contactsPhone=").append(contactsPhone);
        sb.append(", contactsEmail=").append(contactsEmail);
        sb.append(", businessLicenceNumber=").append(businessLicenceNumber);
        sb.append(", businessLicenceAddress=").append(businessLicenceAddress);
        sb.append(", businessLicenceStart=").append(businessLicenceStart);
        sb.append(", businessLicenceEnd=").append(businessLicenceEnd);
        sb.append(", businessSphere=").append(businessSphere);
        sb.append(", businessLicenceNumberElc=").append(businessLicenceNumberElc);
        sb.append(", organizationCode=").append(organizationCode);
        sb.append(", organizationCodeElectronic=").append(organizationCodeElectronic);
        sb.append(", generalTaxpayer=").append(generalTaxpayer);
        sb.append(", bankAccountName=").append(bankAccountName);
        sb.append(", bankAccountNumber=").append(bankAccountNumber);
        sb.append(", bankName=").append(bankName);
        sb.append(", bankCode=").append(bankCode);
        sb.append(", bankAddress=").append(bankAddress);
        sb.append(", bankLicenceElectronic=").append(bankLicenceElectronic);
        sb.append(", isSettlementAccount=").append(isSettlementAccount);
        sb.append(", settlementBankAccountName=").append(settlementBankAccountName);
        sb.append(", settlementBankAccountNumber=").append(settlementBankAccountNumber);
        sb.append(", settlementBankName=").append(settlementBankName);
        sb.append(", settlementBankCode=").append(settlementBankCode);
        sb.append(", settlementBankAddress=").append(settlementBankAddress);
        sb.append(", taxRegistrationCertificate=").append(taxRegistrationCertificate);
        sb.append(", taxpayerId=").append(taxpayerId);
        sb.append(", taxRegistrationCertifElc=").append(taxRegistrationCertifElc);
        sb.append(", sellerName=").append(sellerName);
        sb.append(", storeName=").append(storeName);
        sb.append(", storeClassIds=").append(storeClassIds);
        sb.append(", storeClassNames=").append(storeClassNames);
        sb.append(", joininStatus=").append(joininStatus);
        sb.append(", joininMessage=").append(joininMessage);
        sb.append(", joininYear=").append(joininYear);
        sb.append(", gradeId=").append(gradeId);
        sb.append(", gradeName=").append(gradeName);
        sb.append(", gradeInfo=").append(gradeInfo);
        sb.append(", scName=").append(scName);
        sb.append(", scId=").append(scId);
        sb.append(", scBail=").append(scBail);
        sb.append(", storeClassCommisRates=").append(storeClassCommisRates);
        sb.append(", payingMoneyCertificate=").append(payingMoneyCertificate);
        sb.append(", payingMoneyCertifExp=").append(payingMoneyCertifExp);
        sb.append(", payingAmount=").append(payingAmount);
        sb.append(", idCardFront=").append(idCardFront);
        sb.append(", idCardVerso=").append(idCardVerso);
        sb.append(", impowerBook=").append(impowerBook);
        sb.append(", collectionProve=").append(collectionProve);
        sb.append(", storeContractId=").append(storeContractId);
        sb.append(", storeContractFile=").append(storeContractFile);
        sb.append(", brandImage=").append(brandImage);
        sb.append(", trademarksImpowerBook=").append(trademarksImpowerBook);
        sb.append(", qualityControlReport=").append(qualityControlReport);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}