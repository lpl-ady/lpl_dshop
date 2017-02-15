/*
 * DshopStoreExample.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.bean.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DshopStoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DshopStoreExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 店铺表
     * @author lpl
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(Integer value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(Integer value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(Integer value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(Integer value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<Integer> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<Integer> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNull() {
            addCriterion("store_name is null");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNotNull() {
            addCriterion("store_name is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNameEqualTo(String value) {
            addCriterion("store_name =", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotEqualTo(String value) {
            addCriterion("store_name <>", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThan(String value) {
            addCriterion("store_name >", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("store_name >=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThan(String value) {
            addCriterion("store_name <", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThanOrEqualTo(String value) {
            addCriterion("store_name <=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLike(String value) {
            addCriterion("store_name like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotLike(String value) {
            addCriterion("store_name not like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameIn(List<String> values) {
            addCriterion("store_name in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotIn(List<String> values) {
            addCriterion("store_name not in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameBetween(String value1, String value2) {
            addCriterion("store_name between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotBetween(String value1, String value2) {
            addCriterion("store_name not between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNull() {
            addCriterion("grade_id is null");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNotNull() {
            addCriterion("grade_id is not null");
            return (Criteria) this;
        }

        public Criteria andGradeIdEqualTo(Integer value) {
            addCriterion("grade_id =", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotEqualTo(Integer value) {
            addCriterion("grade_id <>", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThan(Integer value) {
            addCriterion("grade_id >", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade_id >=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThan(Integer value) {
            addCriterion("grade_id <", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThanOrEqualTo(Integer value) {
            addCriterion("grade_id <=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdIn(List<Integer> values) {
            addCriterion("grade_id in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotIn(List<Integer> values) {
            addCriterion("grade_id not in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdBetween(Integer value1, Integer value2) {
            addCriterion("grade_id between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("grade_id not between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andStoreCategoryIdIsNull() {
            addCriterion("store_category_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreCategoryIdIsNotNull() {
            addCriterion("store_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreCategoryIdEqualTo(Integer value) {
            addCriterion("store_category_id =", value, "storeCategoryId");
            return (Criteria) this;
        }

        public Criteria andStoreCategoryIdNotEqualTo(Integer value) {
            addCriterion("store_category_id <>", value, "storeCategoryId");
            return (Criteria) this;
        }

        public Criteria andStoreCategoryIdGreaterThan(Integer value) {
            addCriterion("store_category_id >", value, "storeCategoryId");
            return (Criteria) this;
        }

        public Criteria andStoreCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_category_id >=", value, "storeCategoryId");
            return (Criteria) this;
        }

        public Criteria andStoreCategoryIdLessThan(Integer value) {
            addCriterion("store_category_id <", value, "storeCategoryId");
            return (Criteria) this;
        }

        public Criteria andStoreCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("store_category_id <=", value, "storeCategoryId");
            return (Criteria) this;
        }

        public Criteria andStoreCategoryIdIn(List<Integer> values) {
            addCriterion("store_category_id in", values, "storeCategoryId");
            return (Criteria) this;
        }

        public Criteria andStoreCategoryIdNotIn(List<Integer> values) {
            addCriterion("store_category_id not in", values, "storeCategoryId");
            return (Criteria) this;
        }

        public Criteria andStoreCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("store_category_id between", value1, value2, "storeCategoryId");
            return (Criteria) this;
        }

        public Criteria andStoreCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("store_category_id not between", value1, value2, "storeCategoryId");
            return (Criteria) this;
        }

        public Criteria andStoreCompanyNameIsNull() {
            addCriterion("store_company_name is null");
            return (Criteria) this;
        }

        public Criteria andStoreCompanyNameIsNotNull() {
            addCriterion("store_company_name is not null");
            return (Criteria) this;
        }

        public Criteria andStoreCompanyNameEqualTo(String value) {
            addCriterion("store_company_name =", value, "storeCompanyName");
            return (Criteria) this;
        }

        public Criteria andStoreCompanyNameNotEqualTo(String value) {
            addCriterion("store_company_name <>", value, "storeCompanyName");
            return (Criteria) this;
        }

        public Criteria andStoreCompanyNameGreaterThan(String value) {
            addCriterion("store_company_name >", value, "storeCompanyName");
            return (Criteria) this;
        }

        public Criteria andStoreCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("store_company_name >=", value, "storeCompanyName");
            return (Criteria) this;
        }

        public Criteria andStoreCompanyNameLessThan(String value) {
            addCriterion("store_company_name <", value, "storeCompanyName");
            return (Criteria) this;
        }

        public Criteria andStoreCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("store_company_name <=", value, "storeCompanyName");
            return (Criteria) this;
        }

        public Criteria andStoreCompanyNameLike(String value) {
            addCriterion("store_company_name like", value, "storeCompanyName");
            return (Criteria) this;
        }

        public Criteria andStoreCompanyNameNotLike(String value) {
            addCriterion("store_company_name not like", value, "storeCompanyName");
            return (Criteria) this;
        }

        public Criteria andStoreCompanyNameIn(List<String> values) {
            addCriterion("store_company_name in", values, "storeCompanyName");
            return (Criteria) this;
        }

        public Criteria andStoreCompanyNameNotIn(List<String> values) {
            addCriterion("store_company_name not in", values, "storeCompanyName");
            return (Criteria) this;
        }

        public Criteria andStoreCompanyNameBetween(String value1, String value2) {
            addCriterion("store_company_name between", value1, value2, "storeCompanyName");
            return (Criteria) this;
        }

        public Criteria andStoreCompanyNameNotBetween(String value1, String value2) {
            addCriterion("store_company_name not between", value1, value2, "storeCompanyName");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNull() {
            addCriterion("province_id is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNotNull() {
            addCriterion("province_id is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdEqualTo(Integer value) {
            addCriterion("province_id =", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotEqualTo(Integer value) {
            addCriterion("province_id <>", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThan(Integer value) {
            addCriterion("province_id >", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("province_id >=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThan(Integer value) {
            addCriterion("province_id <", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThanOrEqualTo(Integer value) {
            addCriterion("province_id <=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIn(List<Integer> values) {
            addCriterion("province_id in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotIn(List<Integer> values) {
            addCriterion("province_id not in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdBetween(Integer value1, Integer value2) {
            addCriterion("province_id between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("province_id not between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andStoreAddressIsNull() {
            addCriterion("store_address is null");
            return (Criteria) this;
        }

        public Criteria andStoreAddressIsNotNull() {
            addCriterion("store_address is not null");
            return (Criteria) this;
        }

        public Criteria andStoreAddressEqualTo(String value) {
            addCriterion("store_address =", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressNotEqualTo(String value) {
            addCriterion("store_address <>", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressGreaterThan(String value) {
            addCriterion("store_address >", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressGreaterThanOrEqualTo(String value) {
            addCriterion("store_address >=", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressLessThan(String value) {
            addCriterion("store_address <", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressLessThanOrEqualTo(String value) {
            addCriterion("store_address <=", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressLike(String value) {
            addCriterion("store_address like", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressNotLike(String value) {
            addCriterion("store_address not like", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressIn(List<String> values) {
            addCriterion("store_address in", values, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressNotIn(List<String> values) {
            addCriterion("store_address not in", values, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressBetween(String value1, String value2) {
            addCriterion("store_address between", value1, value2, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressNotBetween(String value1, String value2) {
            addCriterion("store_address not between", value1, value2, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreDetailAddressIsNull() {
            addCriterion("store_detail_address is null");
            return (Criteria) this;
        }

        public Criteria andStoreDetailAddressIsNotNull() {
            addCriterion("store_detail_address is not null");
            return (Criteria) this;
        }

        public Criteria andStoreDetailAddressEqualTo(String value) {
            addCriterion("store_detail_address =", value, "storeDetailAddress");
            return (Criteria) this;
        }

        public Criteria andStoreDetailAddressNotEqualTo(String value) {
            addCriterion("store_detail_address <>", value, "storeDetailAddress");
            return (Criteria) this;
        }

        public Criteria andStoreDetailAddressGreaterThan(String value) {
            addCriterion("store_detail_address >", value, "storeDetailAddress");
            return (Criteria) this;
        }

        public Criteria andStoreDetailAddressGreaterThanOrEqualTo(String value) {
            addCriterion("store_detail_address >=", value, "storeDetailAddress");
            return (Criteria) this;
        }

        public Criteria andStoreDetailAddressLessThan(String value) {
            addCriterion("store_detail_address <", value, "storeDetailAddress");
            return (Criteria) this;
        }

        public Criteria andStoreDetailAddressLessThanOrEqualTo(String value) {
            addCriterion("store_detail_address <=", value, "storeDetailAddress");
            return (Criteria) this;
        }

        public Criteria andStoreDetailAddressLike(String value) {
            addCriterion("store_detail_address like", value, "storeDetailAddress");
            return (Criteria) this;
        }

        public Criteria andStoreDetailAddressNotLike(String value) {
            addCriterion("store_detail_address not like", value, "storeDetailAddress");
            return (Criteria) this;
        }

        public Criteria andStoreDetailAddressIn(List<String> values) {
            addCriterion("store_detail_address in", values, "storeDetailAddress");
            return (Criteria) this;
        }

        public Criteria andStoreDetailAddressNotIn(List<String> values) {
            addCriterion("store_detail_address not in", values, "storeDetailAddress");
            return (Criteria) this;
        }

        public Criteria andStoreDetailAddressBetween(String value1, String value2) {
            addCriterion("store_detail_address between", value1, value2, "storeDetailAddress");
            return (Criteria) this;
        }

        public Criteria andStoreDetailAddressNotBetween(String value1, String value2) {
            addCriterion("store_detail_address not between", value1, value2, "storeDetailAddress");
            return (Criteria) this;
        }

        public Criteria andStoreZipcodeIsNull() {
            addCriterion("store_zipcode is null");
            return (Criteria) this;
        }

        public Criteria andStoreZipcodeIsNotNull() {
            addCriterion("store_zipcode is not null");
            return (Criteria) this;
        }

        public Criteria andStoreZipcodeEqualTo(String value) {
            addCriterion("store_zipcode =", value, "storeZipcode");
            return (Criteria) this;
        }

        public Criteria andStoreZipcodeNotEqualTo(String value) {
            addCriterion("store_zipcode <>", value, "storeZipcode");
            return (Criteria) this;
        }

        public Criteria andStoreZipcodeGreaterThan(String value) {
            addCriterion("store_zipcode >", value, "storeZipcode");
            return (Criteria) this;
        }

        public Criteria andStoreZipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("store_zipcode >=", value, "storeZipcode");
            return (Criteria) this;
        }

        public Criteria andStoreZipcodeLessThan(String value) {
            addCriterion("store_zipcode <", value, "storeZipcode");
            return (Criteria) this;
        }

        public Criteria andStoreZipcodeLessThanOrEqualTo(String value) {
            addCriterion("store_zipcode <=", value, "storeZipcode");
            return (Criteria) this;
        }

        public Criteria andStoreZipcodeLike(String value) {
            addCriterion("store_zipcode like", value, "storeZipcode");
            return (Criteria) this;
        }

        public Criteria andStoreZipcodeNotLike(String value) {
            addCriterion("store_zipcode not like", value, "storeZipcode");
            return (Criteria) this;
        }

        public Criteria andStoreZipcodeIn(List<String> values) {
            addCriterion("store_zipcode in", values, "storeZipcode");
            return (Criteria) this;
        }

        public Criteria andStoreZipcodeNotIn(List<String> values) {
            addCriterion("store_zipcode not in", values, "storeZipcode");
            return (Criteria) this;
        }

        public Criteria andStoreZipcodeBetween(String value1, String value2) {
            addCriterion("store_zipcode between", value1, value2, "storeZipcode");
            return (Criteria) this;
        }

        public Criteria andStoreZipcodeNotBetween(String value1, String value2) {
            addCriterion("store_zipcode not between", value1, value2, "storeZipcode");
            return (Criteria) this;
        }

        public Criteria andStoreAddTimeIsNull() {
            addCriterion("store_add_time is null");
            return (Criteria) this;
        }

        public Criteria andStoreAddTimeIsNotNull() {
            addCriterion("store_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andStoreAddTimeEqualTo(String value) {
            addCriterion("store_add_time =", value, "storeAddTime");
            return (Criteria) this;
        }

        public Criteria andStoreAddTimeNotEqualTo(String value) {
            addCriterion("store_add_time <>", value, "storeAddTime");
            return (Criteria) this;
        }

        public Criteria andStoreAddTimeGreaterThan(String value) {
            addCriterion("store_add_time >", value, "storeAddTime");
            return (Criteria) this;
        }

        public Criteria andStoreAddTimeGreaterThanOrEqualTo(String value) {
            addCriterion("store_add_time >=", value, "storeAddTime");
            return (Criteria) this;
        }

        public Criteria andStoreAddTimeLessThan(String value) {
            addCriterion("store_add_time <", value, "storeAddTime");
            return (Criteria) this;
        }

        public Criteria andStoreAddTimeLessThanOrEqualTo(String value) {
            addCriterion("store_add_time <=", value, "storeAddTime");
            return (Criteria) this;
        }

        public Criteria andStoreAddTimeLike(String value) {
            addCriterion("store_add_time like", value, "storeAddTime");
            return (Criteria) this;
        }

        public Criteria andStoreAddTimeNotLike(String value) {
            addCriterion("store_add_time not like", value, "storeAddTime");
            return (Criteria) this;
        }

        public Criteria andStoreAddTimeIn(List<String> values) {
            addCriterion("store_add_time in", values, "storeAddTime");
            return (Criteria) this;
        }

        public Criteria andStoreAddTimeNotIn(List<String> values) {
            addCriterion("store_add_time not in", values, "storeAddTime");
            return (Criteria) this;
        }

        public Criteria andStoreAddTimeBetween(String value1, String value2) {
            addCriterion("store_add_time between", value1, value2, "storeAddTime");
            return (Criteria) this;
        }

        public Criteria andStoreAddTimeNotBetween(String value1, String value2) {
            addCriterion("store_add_time not between", value1, value2, "storeAddTime");
            return (Criteria) this;
        }

        public Criteria andStoreCloseTimeIsNull() {
            addCriterion("store_close_time is null");
            return (Criteria) this;
        }

        public Criteria andStoreCloseTimeIsNotNull() {
            addCriterion("store_close_time is not null");
            return (Criteria) this;
        }

        public Criteria andStoreCloseTimeEqualTo(String value) {
            addCriterion("store_close_time =", value, "storeCloseTime");
            return (Criteria) this;
        }

        public Criteria andStoreCloseTimeNotEqualTo(String value) {
            addCriterion("store_close_time <>", value, "storeCloseTime");
            return (Criteria) this;
        }

        public Criteria andStoreCloseTimeGreaterThan(String value) {
            addCriterion("store_close_time >", value, "storeCloseTime");
            return (Criteria) this;
        }

        public Criteria andStoreCloseTimeGreaterThanOrEqualTo(String value) {
            addCriterion("store_close_time >=", value, "storeCloseTime");
            return (Criteria) this;
        }

        public Criteria andStoreCloseTimeLessThan(String value) {
            addCriterion("store_close_time <", value, "storeCloseTime");
            return (Criteria) this;
        }

        public Criteria andStoreCloseTimeLessThanOrEqualTo(String value) {
            addCriterion("store_close_time <=", value, "storeCloseTime");
            return (Criteria) this;
        }

        public Criteria andStoreCloseTimeLike(String value) {
            addCriterion("store_close_time like", value, "storeCloseTime");
            return (Criteria) this;
        }

        public Criteria andStoreCloseTimeNotLike(String value) {
            addCriterion("store_close_time not like", value, "storeCloseTime");
            return (Criteria) this;
        }

        public Criteria andStoreCloseTimeIn(List<String> values) {
            addCriterion("store_close_time in", values, "storeCloseTime");
            return (Criteria) this;
        }

        public Criteria andStoreCloseTimeNotIn(List<String> values) {
            addCriterion("store_close_time not in", values, "storeCloseTime");
            return (Criteria) this;
        }

        public Criteria andStoreCloseTimeBetween(String value1, String value2) {
            addCriterion("store_close_time between", value1, value2, "storeCloseTime");
            return (Criteria) this;
        }

        public Criteria andStoreCloseTimeNotBetween(String value1, String value2) {
            addCriterion("store_close_time not between", value1, value2, "storeCloseTime");
            return (Criteria) this;
        }

        public Criteria andStoreCloseInfoIsNull() {
            addCriterion("store_close_info is null");
            return (Criteria) this;
        }

        public Criteria andStoreCloseInfoIsNotNull() {
            addCriterion("store_close_info is not null");
            return (Criteria) this;
        }

        public Criteria andStoreCloseInfoEqualTo(String value) {
            addCriterion("store_close_info =", value, "storeCloseInfo");
            return (Criteria) this;
        }

        public Criteria andStoreCloseInfoNotEqualTo(String value) {
            addCriterion("store_close_info <>", value, "storeCloseInfo");
            return (Criteria) this;
        }

        public Criteria andStoreCloseInfoGreaterThan(String value) {
            addCriterion("store_close_info >", value, "storeCloseInfo");
            return (Criteria) this;
        }

        public Criteria andStoreCloseInfoGreaterThanOrEqualTo(String value) {
            addCriterion("store_close_info >=", value, "storeCloseInfo");
            return (Criteria) this;
        }

        public Criteria andStoreCloseInfoLessThan(String value) {
            addCriterion("store_close_info <", value, "storeCloseInfo");
            return (Criteria) this;
        }

        public Criteria andStoreCloseInfoLessThanOrEqualTo(String value) {
            addCriterion("store_close_info <=", value, "storeCloseInfo");
            return (Criteria) this;
        }

        public Criteria andStoreCloseInfoLike(String value) {
            addCriterion("store_close_info like", value, "storeCloseInfo");
            return (Criteria) this;
        }

        public Criteria andStoreCloseInfoNotLike(String value) {
            addCriterion("store_close_info not like", value, "storeCloseInfo");
            return (Criteria) this;
        }

        public Criteria andStoreCloseInfoIn(List<String> values) {
            addCriterion("store_close_info in", values, "storeCloseInfo");
            return (Criteria) this;
        }

        public Criteria andStoreCloseInfoNotIn(List<String> values) {
            addCriterion("store_close_info not in", values, "storeCloseInfo");
            return (Criteria) this;
        }

        public Criteria andStoreCloseInfoBetween(String value1, String value2) {
            addCriterion("store_close_info between", value1, value2, "storeCloseInfo");
            return (Criteria) this;
        }

        public Criteria andStoreCloseInfoNotBetween(String value1, String value2) {
            addCriterion("store_close_info not between", value1, value2, "storeCloseInfo");
            return (Criteria) this;
        }

        public Criteria andStoreLogoIsNull() {
            addCriterion("store_logo is null");
            return (Criteria) this;
        }

        public Criteria andStoreLogoIsNotNull() {
            addCriterion("store_logo is not null");
            return (Criteria) this;
        }

        public Criteria andStoreLogoEqualTo(String value) {
            addCriterion("store_logo =", value, "storeLogo");
            return (Criteria) this;
        }

        public Criteria andStoreLogoNotEqualTo(String value) {
            addCriterion("store_logo <>", value, "storeLogo");
            return (Criteria) this;
        }

        public Criteria andStoreLogoGreaterThan(String value) {
            addCriterion("store_logo >", value, "storeLogo");
            return (Criteria) this;
        }

        public Criteria andStoreLogoGreaterThanOrEqualTo(String value) {
            addCriterion("store_logo >=", value, "storeLogo");
            return (Criteria) this;
        }

        public Criteria andStoreLogoLessThan(String value) {
            addCriterion("store_logo <", value, "storeLogo");
            return (Criteria) this;
        }

        public Criteria andStoreLogoLessThanOrEqualTo(String value) {
            addCriterion("store_logo <=", value, "storeLogo");
            return (Criteria) this;
        }

        public Criteria andStoreLogoLike(String value) {
            addCriterion("store_logo like", value, "storeLogo");
            return (Criteria) this;
        }

        public Criteria andStoreLogoNotLike(String value) {
            addCriterion("store_logo not like", value, "storeLogo");
            return (Criteria) this;
        }

        public Criteria andStoreLogoIn(List<String> values) {
            addCriterion("store_logo in", values, "storeLogo");
            return (Criteria) this;
        }

        public Criteria andStoreLogoNotIn(List<String> values) {
            addCriterion("store_logo not in", values, "storeLogo");
            return (Criteria) this;
        }

        public Criteria andStoreLogoBetween(String value1, String value2) {
            addCriterion("store_logo between", value1, value2, "storeLogo");
            return (Criteria) this;
        }

        public Criteria andStoreLogoNotBetween(String value1, String value2) {
            addCriterion("store_logo not between", value1, value2, "storeLogo");
            return (Criteria) this;
        }

        public Criteria andStoreBannerIsNull() {
            addCriterion("store_banner is null");
            return (Criteria) this;
        }

        public Criteria andStoreBannerIsNotNull() {
            addCriterion("store_banner is not null");
            return (Criteria) this;
        }

        public Criteria andStoreBannerEqualTo(String value) {
            addCriterion("store_banner =", value, "storeBanner");
            return (Criteria) this;
        }

        public Criteria andStoreBannerNotEqualTo(String value) {
            addCriterion("store_banner <>", value, "storeBanner");
            return (Criteria) this;
        }

        public Criteria andStoreBannerGreaterThan(String value) {
            addCriterion("store_banner >", value, "storeBanner");
            return (Criteria) this;
        }

        public Criteria andStoreBannerGreaterThanOrEqualTo(String value) {
            addCriterion("store_banner >=", value, "storeBanner");
            return (Criteria) this;
        }

        public Criteria andStoreBannerLessThan(String value) {
            addCriterion("store_banner <", value, "storeBanner");
            return (Criteria) this;
        }

        public Criteria andStoreBannerLessThanOrEqualTo(String value) {
            addCriterion("store_banner <=", value, "storeBanner");
            return (Criteria) this;
        }

        public Criteria andStoreBannerLike(String value) {
            addCriterion("store_banner like", value, "storeBanner");
            return (Criteria) this;
        }

        public Criteria andStoreBannerNotLike(String value) {
            addCriterion("store_banner not like", value, "storeBanner");
            return (Criteria) this;
        }

        public Criteria andStoreBannerIn(List<String> values) {
            addCriterion("store_banner in", values, "storeBanner");
            return (Criteria) this;
        }

        public Criteria andStoreBannerNotIn(List<String> values) {
            addCriterion("store_banner not in", values, "storeBanner");
            return (Criteria) this;
        }

        public Criteria andStoreBannerBetween(String value1, String value2) {
            addCriterion("store_banner between", value1, value2, "storeBanner");
            return (Criteria) this;
        }

        public Criteria andStoreBannerNotBetween(String value1, String value2) {
            addCriterion("store_banner not between", value1, value2, "storeBanner");
            return (Criteria) this;
        }

        public Criteria andStoreAvatarIsNull() {
            addCriterion("store_avatar is null");
            return (Criteria) this;
        }

        public Criteria andStoreAvatarIsNotNull() {
            addCriterion("store_avatar is not null");
            return (Criteria) this;
        }

        public Criteria andStoreAvatarEqualTo(String value) {
            addCriterion("store_avatar =", value, "storeAvatar");
            return (Criteria) this;
        }

        public Criteria andStoreAvatarNotEqualTo(String value) {
            addCriterion("store_avatar <>", value, "storeAvatar");
            return (Criteria) this;
        }

        public Criteria andStoreAvatarGreaterThan(String value) {
            addCriterion("store_avatar >", value, "storeAvatar");
            return (Criteria) this;
        }

        public Criteria andStoreAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("store_avatar >=", value, "storeAvatar");
            return (Criteria) this;
        }

        public Criteria andStoreAvatarLessThan(String value) {
            addCriterion("store_avatar <", value, "storeAvatar");
            return (Criteria) this;
        }

        public Criteria andStoreAvatarLessThanOrEqualTo(String value) {
            addCriterion("store_avatar <=", value, "storeAvatar");
            return (Criteria) this;
        }

        public Criteria andStoreAvatarLike(String value) {
            addCriterion("store_avatar like", value, "storeAvatar");
            return (Criteria) this;
        }

        public Criteria andStoreAvatarNotLike(String value) {
            addCriterion("store_avatar not like", value, "storeAvatar");
            return (Criteria) this;
        }

        public Criteria andStoreAvatarIn(List<String> values) {
            addCriterion("store_avatar in", values, "storeAvatar");
            return (Criteria) this;
        }

        public Criteria andStoreAvatarNotIn(List<String> values) {
            addCriterion("store_avatar not in", values, "storeAvatar");
            return (Criteria) this;
        }

        public Criteria andStoreAvatarBetween(String value1, String value2) {
            addCriterion("store_avatar between", value1, value2, "storeAvatar");
            return (Criteria) this;
        }

        public Criteria andStoreAvatarNotBetween(String value1, String value2) {
            addCriterion("store_avatar not between", value1, value2, "storeAvatar");
            return (Criteria) this;
        }

        public Criteria andStoreKeywordsIsNull() {
            addCriterion("store_keywords is null");
            return (Criteria) this;
        }

        public Criteria andStoreKeywordsIsNotNull() {
            addCriterion("store_keywords is not null");
            return (Criteria) this;
        }

        public Criteria andStoreKeywordsEqualTo(String value) {
            addCriterion("store_keywords =", value, "storeKeywords");
            return (Criteria) this;
        }

        public Criteria andStoreKeywordsNotEqualTo(String value) {
            addCriterion("store_keywords <>", value, "storeKeywords");
            return (Criteria) this;
        }

        public Criteria andStoreKeywordsGreaterThan(String value) {
            addCriterion("store_keywords >", value, "storeKeywords");
            return (Criteria) this;
        }

        public Criteria andStoreKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("store_keywords >=", value, "storeKeywords");
            return (Criteria) this;
        }

        public Criteria andStoreKeywordsLessThan(String value) {
            addCriterion("store_keywords <", value, "storeKeywords");
            return (Criteria) this;
        }

        public Criteria andStoreKeywordsLessThanOrEqualTo(String value) {
            addCriterion("store_keywords <=", value, "storeKeywords");
            return (Criteria) this;
        }

        public Criteria andStoreKeywordsLike(String value) {
            addCriterion("store_keywords like", value, "storeKeywords");
            return (Criteria) this;
        }

        public Criteria andStoreKeywordsNotLike(String value) {
            addCriterion("store_keywords not like", value, "storeKeywords");
            return (Criteria) this;
        }

        public Criteria andStoreKeywordsIn(List<String> values) {
            addCriterion("store_keywords in", values, "storeKeywords");
            return (Criteria) this;
        }

        public Criteria andStoreKeywordsNotIn(List<String> values) {
            addCriterion("store_keywords not in", values, "storeKeywords");
            return (Criteria) this;
        }

        public Criteria andStoreKeywordsBetween(String value1, String value2) {
            addCriterion("store_keywords between", value1, value2, "storeKeywords");
            return (Criteria) this;
        }

        public Criteria andStoreKeywordsNotBetween(String value1, String value2) {
            addCriterion("store_keywords not between", value1, value2, "storeKeywords");
            return (Criteria) this;
        }

        public Criteria andStoreDescriptionIsNull() {
            addCriterion("store_description is null");
            return (Criteria) this;
        }

        public Criteria andStoreDescriptionIsNotNull() {
            addCriterion("store_description is not null");
            return (Criteria) this;
        }

        public Criteria andStoreDescriptionEqualTo(String value) {
            addCriterion("store_description =", value, "storeDescription");
            return (Criteria) this;
        }

        public Criteria andStoreDescriptionNotEqualTo(String value) {
            addCriterion("store_description <>", value, "storeDescription");
            return (Criteria) this;
        }

        public Criteria andStoreDescriptionGreaterThan(String value) {
            addCriterion("store_description >", value, "storeDescription");
            return (Criteria) this;
        }

        public Criteria andStoreDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("store_description >=", value, "storeDescription");
            return (Criteria) this;
        }

        public Criteria andStoreDescriptionLessThan(String value) {
            addCriterion("store_description <", value, "storeDescription");
            return (Criteria) this;
        }

        public Criteria andStoreDescriptionLessThanOrEqualTo(String value) {
            addCriterion("store_description <=", value, "storeDescription");
            return (Criteria) this;
        }

        public Criteria andStoreDescriptionLike(String value) {
            addCriterion("store_description like", value, "storeDescription");
            return (Criteria) this;
        }

        public Criteria andStoreDescriptionNotLike(String value) {
            addCriterion("store_description not like", value, "storeDescription");
            return (Criteria) this;
        }

        public Criteria andStoreDescriptionIn(List<String> values) {
            addCriterion("store_description in", values, "storeDescription");
            return (Criteria) this;
        }

        public Criteria andStoreDescriptionNotIn(List<String> values) {
            addCriterion("store_description not in", values, "storeDescription");
            return (Criteria) this;
        }

        public Criteria andStoreDescriptionBetween(String value1, String value2) {
            addCriterion("store_description between", value1, value2, "storeDescription");
            return (Criteria) this;
        }

        public Criteria andStoreDescriptionNotBetween(String value1, String value2) {
            addCriterion("store_description not between", value1, value2, "storeDescription");
            return (Criteria) this;
        }

        public Criteria andStoreQqIsNull() {
            addCriterion("store_qq is null");
            return (Criteria) this;
        }

        public Criteria andStoreQqIsNotNull() {
            addCriterion("store_qq is not null");
            return (Criteria) this;
        }

        public Criteria andStoreQqEqualTo(String value) {
            addCriterion("store_qq =", value, "storeQq");
            return (Criteria) this;
        }

        public Criteria andStoreQqNotEqualTo(String value) {
            addCriterion("store_qq <>", value, "storeQq");
            return (Criteria) this;
        }

        public Criteria andStoreQqGreaterThan(String value) {
            addCriterion("store_qq >", value, "storeQq");
            return (Criteria) this;
        }

        public Criteria andStoreQqGreaterThanOrEqualTo(String value) {
            addCriterion("store_qq >=", value, "storeQq");
            return (Criteria) this;
        }

        public Criteria andStoreQqLessThan(String value) {
            addCriterion("store_qq <", value, "storeQq");
            return (Criteria) this;
        }

        public Criteria andStoreQqLessThanOrEqualTo(String value) {
            addCriterion("store_qq <=", value, "storeQq");
            return (Criteria) this;
        }

        public Criteria andStoreQqLike(String value) {
            addCriterion("store_qq like", value, "storeQq");
            return (Criteria) this;
        }

        public Criteria andStoreQqNotLike(String value) {
            addCriterion("store_qq not like", value, "storeQq");
            return (Criteria) this;
        }

        public Criteria andStoreQqIn(List<String> values) {
            addCriterion("store_qq in", values, "storeQq");
            return (Criteria) this;
        }

        public Criteria andStoreQqNotIn(List<String> values) {
            addCriterion("store_qq not in", values, "storeQq");
            return (Criteria) this;
        }

        public Criteria andStoreQqBetween(String value1, String value2) {
            addCriterion("store_qq between", value1, value2, "storeQq");
            return (Criteria) this;
        }

        public Criteria andStoreQqNotBetween(String value1, String value2) {
            addCriterion("store_qq not between", value1, value2, "storeQq");
            return (Criteria) this;
        }

        public Criteria andStoreWwIsNull() {
            addCriterion("store_ww is null");
            return (Criteria) this;
        }

        public Criteria andStoreWwIsNotNull() {
            addCriterion("store_ww is not null");
            return (Criteria) this;
        }

        public Criteria andStoreWwEqualTo(String value) {
            addCriterion("store_ww =", value, "storeWw");
            return (Criteria) this;
        }

        public Criteria andStoreWwNotEqualTo(String value) {
            addCriterion("store_ww <>", value, "storeWw");
            return (Criteria) this;
        }

        public Criteria andStoreWwGreaterThan(String value) {
            addCriterion("store_ww >", value, "storeWw");
            return (Criteria) this;
        }

        public Criteria andStoreWwGreaterThanOrEqualTo(String value) {
            addCriterion("store_ww >=", value, "storeWw");
            return (Criteria) this;
        }

        public Criteria andStoreWwLessThan(String value) {
            addCriterion("store_ww <", value, "storeWw");
            return (Criteria) this;
        }

        public Criteria andStoreWwLessThanOrEqualTo(String value) {
            addCriterion("store_ww <=", value, "storeWw");
            return (Criteria) this;
        }

        public Criteria andStoreWwLike(String value) {
            addCriterion("store_ww like", value, "storeWw");
            return (Criteria) this;
        }

        public Criteria andStoreWwNotLike(String value) {
            addCriterion("store_ww not like", value, "storeWw");
            return (Criteria) this;
        }

        public Criteria andStoreWwIn(List<String> values) {
            addCriterion("store_ww in", values, "storeWw");
            return (Criteria) this;
        }

        public Criteria andStoreWwNotIn(List<String> values) {
            addCriterion("store_ww not in", values, "storeWw");
            return (Criteria) this;
        }

        public Criteria andStoreWwBetween(String value1, String value2) {
            addCriterion("store_ww between", value1, value2, "storeWw");
            return (Criteria) this;
        }

        public Criteria andStoreWwNotBetween(String value1, String value2) {
            addCriterion("store_ww not between", value1, value2, "storeWw");
            return (Criteria) this;
        }

        public Criteria andStorePhoneIsNull() {
            addCriterion("store_phone is null");
            return (Criteria) this;
        }

        public Criteria andStorePhoneIsNotNull() {
            addCriterion("store_phone is not null");
            return (Criteria) this;
        }

        public Criteria andStorePhoneEqualTo(String value) {
            addCriterion("store_phone =", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneNotEqualTo(String value) {
            addCriterion("store_phone <>", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneGreaterThan(String value) {
            addCriterion("store_phone >", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("store_phone >=", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneLessThan(String value) {
            addCriterion("store_phone <", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneLessThanOrEqualTo(String value) {
            addCriterion("store_phone <=", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneLike(String value) {
            addCriterion("store_phone like", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneNotLike(String value) {
            addCriterion("store_phone not like", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneIn(List<String> values) {
            addCriterion("store_phone in", values, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneNotIn(List<String> values) {
            addCriterion("store_phone not in", values, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneBetween(String value1, String value2) {
            addCriterion("store_phone between", value1, value2, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneNotBetween(String value1, String value2) {
            addCriterion("store_phone not between", value1, value2, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStoreDomainIsNull() {
            addCriterion("store_domain is null");
            return (Criteria) this;
        }

        public Criteria andStoreDomainIsNotNull() {
            addCriterion("store_domain is not null");
            return (Criteria) this;
        }

        public Criteria andStoreDomainEqualTo(String value) {
            addCriterion("store_domain =", value, "storeDomain");
            return (Criteria) this;
        }

        public Criteria andStoreDomainNotEqualTo(String value) {
            addCriterion("store_domain <>", value, "storeDomain");
            return (Criteria) this;
        }

        public Criteria andStoreDomainGreaterThan(String value) {
            addCriterion("store_domain >", value, "storeDomain");
            return (Criteria) this;
        }

        public Criteria andStoreDomainGreaterThanOrEqualTo(String value) {
            addCriterion("store_domain >=", value, "storeDomain");
            return (Criteria) this;
        }

        public Criteria andStoreDomainLessThan(String value) {
            addCriterion("store_domain <", value, "storeDomain");
            return (Criteria) this;
        }

        public Criteria andStoreDomainLessThanOrEqualTo(String value) {
            addCriterion("store_domain <=", value, "storeDomain");
            return (Criteria) this;
        }

        public Criteria andStoreDomainLike(String value) {
            addCriterion("store_domain like", value, "storeDomain");
            return (Criteria) this;
        }

        public Criteria andStoreDomainNotLike(String value) {
            addCriterion("store_domain not like", value, "storeDomain");
            return (Criteria) this;
        }

        public Criteria andStoreDomainIn(List<String> values) {
            addCriterion("store_domain in", values, "storeDomain");
            return (Criteria) this;
        }

        public Criteria andStoreDomainNotIn(List<String> values) {
            addCriterion("store_domain not in", values, "storeDomain");
            return (Criteria) this;
        }

        public Criteria andStoreDomainBetween(String value1, String value2) {
            addCriterion("store_domain between", value1, value2, "storeDomain");
            return (Criteria) this;
        }

        public Criteria andStoreDomainNotBetween(String value1, String value2) {
            addCriterion("store_domain not between", value1, value2, "storeDomain");
            return (Criteria) this;
        }

        public Criteria andStoreDomainUpdatecountIsNull() {
            addCriterion("store_domain_updatecount is null");
            return (Criteria) this;
        }

        public Criteria andStoreDomainUpdatecountIsNotNull() {
            addCriterion("store_domain_updatecount is not null");
            return (Criteria) this;
        }

        public Criteria andStoreDomainUpdatecountEqualTo(Boolean value) {
            addCriterion("store_domain_updatecount =", value, "storeDomainUpdatecount");
            return (Criteria) this;
        }

        public Criteria andStoreDomainUpdatecountNotEqualTo(Boolean value) {
            addCriterion("store_domain_updatecount <>", value, "storeDomainUpdatecount");
            return (Criteria) this;
        }

        public Criteria andStoreDomainUpdatecountGreaterThan(Boolean value) {
            addCriterion("store_domain_updatecount >", value, "storeDomainUpdatecount");
            return (Criteria) this;
        }

        public Criteria andStoreDomainUpdatecountGreaterThanOrEqualTo(Boolean value) {
            addCriterion("store_domain_updatecount >=", value, "storeDomainUpdatecount");
            return (Criteria) this;
        }

        public Criteria andStoreDomainUpdatecountLessThan(Boolean value) {
            addCriterion("store_domain_updatecount <", value, "storeDomainUpdatecount");
            return (Criteria) this;
        }

        public Criteria andStoreDomainUpdatecountLessThanOrEqualTo(Boolean value) {
            addCriterion("store_domain_updatecount <=", value, "storeDomainUpdatecount");
            return (Criteria) this;
        }

        public Criteria andStoreDomainUpdatecountIn(List<Boolean> values) {
            addCriterion("store_domain_updatecount in", values, "storeDomainUpdatecount");
            return (Criteria) this;
        }

        public Criteria andStoreDomainUpdatecountNotIn(List<Boolean> values) {
            addCriterion("store_domain_updatecount not in", values, "storeDomainUpdatecount");
            return (Criteria) this;
        }

        public Criteria andStoreDomainUpdatecountBetween(Boolean value1, Boolean value2) {
            addCriterion("store_domain_updatecount between", value1, value2, "storeDomainUpdatecount");
            return (Criteria) this;
        }

        public Criteria andStoreDomainUpdatecountNotBetween(Boolean value1, Boolean value2) {
            addCriterion("store_domain_updatecount not between", value1, value2, "storeDomainUpdatecount");
            return (Criteria) this;
        }

        public Criteria andStoreRecommendIsNull() {
            addCriterion("store_recommend is null");
            return (Criteria) this;
        }

        public Criteria andStoreRecommendIsNotNull() {
            addCriterion("store_recommend is not null");
            return (Criteria) this;
        }

        public Criteria andStoreRecommendEqualTo(Boolean value) {
            addCriterion("store_recommend =", value, "storeRecommend");
            return (Criteria) this;
        }

        public Criteria andStoreRecommendNotEqualTo(Boolean value) {
            addCriterion("store_recommend <>", value, "storeRecommend");
            return (Criteria) this;
        }

        public Criteria andStoreRecommendGreaterThan(Boolean value) {
            addCriterion("store_recommend >", value, "storeRecommend");
            return (Criteria) this;
        }

        public Criteria andStoreRecommendGreaterThanOrEqualTo(Boolean value) {
            addCriterion("store_recommend >=", value, "storeRecommend");
            return (Criteria) this;
        }

        public Criteria andStoreRecommendLessThan(Boolean value) {
            addCriterion("store_recommend <", value, "storeRecommend");
            return (Criteria) this;
        }

        public Criteria andStoreRecommendLessThanOrEqualTo(Boolean value) {
            addCriterion("store_recommend <=", value, "storeRecommend");
            return (Criteria) this;
        }

        public Criteria andStoreRecommendIn(List<Boolean> values) {
            addCriterion("store_recommend in", values, "storeRecommend");
            return (Criteria) this;
        }

        public Criteria andStoreRecommendNotIn(List<Boolean> values) {
            addCriterion("store_recommend not in", values, "storeRecommend");
            return (Criteria) this;
        }

        public Criteria andStoreRecommendBetween(Boolean value1, Boolean value2) {
            addCriterion("store_recommend between", value1, value2, "storeRecommend");
            return (Criteria) this;
        }

        public Criteria andStoreRecommendNotBetween(Boolean value1, Boolean value2) {
            addCriterion("store_recommend not between", value1, value2, "storeRecommend");
            return (Criteria) this;
        }

        public Criteria andStoreThemeIsNull() {
            addCriterion("store_theme is null");
            return (Criteria) this;
        }

        public Criteria andStoreThemeIsNotNull() {
            addCriterion("store_theme is not null");
            return (Criteria) this;
        }

        public Criteria andStoreThemeEqualTo(String value) {
            addCriterion("store_theme =", value, "storeTheme");
            return (Criteria) this;
        }

        public Criteria andStoreThemeNotEqualTo(String value) {
            addCriterion("store_theme <>", value, "storeTheme");
            return (Criteria) this;
        }

        public Criteria andStoreThemeGreaterThan(String value) {
            addCriterion("store_theme >", value, "storeTheme");
            return (Criteria) this;
        }

        public Criteria andStoreThemeGreaterThanOrEqualTo(String value) {
            addCriterion("store_theme >=", value, "storeTheme");
            return (Criteria) this;
        }

        public Criteria andStoreThemeLessThan(String value) {
            addCriterion("store_theme <", value, "storeTheme");
            return (Criteria) this;
        }

        public Criteria andStoreThemeLessThanOrEqualTo(String value) {
            addCriterion("store_theme <=", value, "storeTheme");
            return (Criteria) this;
        }

        public Criteria andStoreThemeLike(String value) {
            addCriterion("store_theme like", value, "storeTheme");
            return (Criteria) this;
        }

        public Criteria andStoreThemeNotLike(String value) {
            addCriterion("store_theme not like", value, "storeTheme");
            return (Criteria) this;
        }

        public Criteria andStoreThemeIn(List<String> values) {
            addCriterion("store_theme in", values, "storeTheme");
            return (Criteria) this;
        }

        public Criteria andStoreThemeNotIn(List<String> values) {
            addCriterion("store_theme not in", values, "storeTheme");
            return (Criteria) this;
        }

        public Criteria andStoreThemeBetween(String value1, String value2) {
            addCriterion("store_theme between", value1, value2, "storeTheme");
            return (Criteria) this;
        }

        public Criteria andStoreThemeNotBetween(String value1, String value2) {
            addCriterion("store_theme not between", value1, value2, "storeTheme");
            return (Criteria) this;
        }

        public Criteria andStoreCreditIsNull() {
            addCriterion("store_credit is null");
            return (Criteria) this;
        }

        public Criteria andStoreCreditIsNotNull() {
            addCriterion("store_credit is not null");
            return (Criteria) this;
        }

        public Criteria andStoreCreditEqualTo(Integer value) {
            addCriterion("store_credit =", value, "storeCredit");
            return (Criteria) this;
        }

        public Criteria andStoreCreditNotEqualTo(Integer value) {
            addCriterion("store_credit <>", value, "storeCredit");
            return (Criteria) this;
        }

        public Criteria andStoreCreditGreaterThan(Integer value) {
            addCriterion("store_credit >", value, "storeCredit");
            return (Criteria) this;
        }

        public Criteria andStoreCreditGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_credit >=", value, "storeCredit");
            return (Criteria) this;
        }

        public Criteria andStoreCreditLessThan(Integer value) {
            addCriterion("store_credit <", value, "storeCredit");
            return (Criteria) this;
        }

        public Criteria andStoreCreditLessThanOrEqualTo(Integer value) {
            addCriterion("store_credit <=", value, "storeCredit");
            return (Criteria) this;
        }

        public Criteria andStoreCreditIn(List<Integer> values) {
            addCriterion("store_credit in", values, "storeCredit");
            return (Criteria) this;
        }

        public Criteria andStoreCreditNotIn(List<Integer> values) {
            addCriterion("store_credit not in", values, "storeCredit");
            return (Criteria) this;
        }

        public Criteria andStoreCreditBetween(Integer value1, Integer value2) {
            addCriterion("store_credit between", value1, value2, "storeCredit");
            return (Criteria) this;
        }

        public Criteria andStoreCreditNotBetween(Integer value1, Integer value2) {
            addCriterion("store_credit not between", value1, value2, "storeCredit");
            return (Criteria) this;
        }

        public Criteria andStoreDescCreditIsNull() {
            addCriterion("store_desc_credit is null");
            return (Criteria) this;
        }

        public Criteria andStoreDescCreditIsNotNull() {
            addCriterion("store_desc_credit is not null");
            return (Criteria) this;
        }

        public Criteria andStoreDescCreditEqualTo(Float value) {
            addCriterion("store_desc_credit =", value, "storeDescCredit");
            return (Criteria) this;
        }

        public Criteria andStoreDescCreditNotEqualTo(Float value) {
            addCriterion("store_desc_credit <>", value, "storeDescCredit");
            return (Criteria) this;
        }

        public Criteria andStoreDescCreditGreaterThan(Float value) {
            addCriterion("store_desc_credit >", value, "storeDescCredit");
            return (Criteria) this;
        }

        public Criteria andStoreDescCreditGreaterThanOrEqualTo(Float value) {
            addCriterion("store_desc_credit >=", value, "storeDescCredit");
            return (Criteria) this;
        }

        public Criteria andStoreDescCreditLessThan(Float value) {
            addCriterion("store_desc_credit <", value, "storeDescCredit");
            return (Criteria) this;
        }

        public Criteria andStoreDescCreditLessThanOrEqualTo(Float value) {
            addCriterion("store_desc_credit <=", value, "storeDescCredit");
            return (Criteria) this;
        }

        public Criteria andStoreDescCreditIn(List<Float> values) {
            addCriterion("store_desc_credit in", values, "storeDescCredit");
            return (Criteria) this;
        }

        public Criteria andStoreDescCreditNotIn(List<Float> values) {
            addCriterion("store_desc_credit not in", values, "storeDescCredit");
            return (Criteria) this;
        }

        public Criteria andStoreDescCreditBetween(Float value1, Float value2) {
            addCriterion("store_desc_credit between", value1, value2, "storeDescCredit");
            return (Criteria) this;
        }

        public Criteria andStoreDescCreditNotBetween(Float value1, Float value2) {
            addCriterion("store_desc_credit not between", value1, value2, "storeDescCredit");
            return (Criteria) this;
        }

        public Criteria andStoreServiceCreditIsNull() {
            addCriterion("store_service_credit is null");
            return (Criteria) this;
        }

        public Criteria andStoreServiceCreditIsNotNull() {
            addCriterion("store_service_credit is not null");
            return (Criteria) this;
        }

        public Criteria andStoreServiceCreditEqualTo(Float value) {
            addCriterion("store_service_credit =", value, "storeServiceCredit");
            return (Criteria) this;
        }

        public Criteria andStoreServiceCreditNotEqualTo(Float value) {
            addCriterion("store_service_credit <>", value, "storeServiceCredit");
            return (Criteria) this;
        }

        public Criteria andStoreServiceCreditGreaterThan(Float value) {
            addCriterion("store_service_credit >", value, "storeServiceCredit");
            return (Criteria) this;
        }

        public Criteria andStoreServiceCreditGreaterThanOrEqualTo(Float value) {
            addCriterion("store_service_credit >=", value, "storeServiceCredit");
            return (Criteria) this;
        }

        public Criteria andStoreServiceCreditLessThan(Float value) {
            addCriterion("store_service_credit <", value, "storeServiceCredit");
            return (Criteria) this;
        }

        public Criteria andStoreServiceCreditLessThanOrEqualTo(Float value) {
            addCriterion("store_service_credit <=", value, "storeServiceCredit");
            return (Criteria) this;
        }

        public Criteria andStoreServiceCreditIn(List<Float> values) {
            addCriterion("store_service_credit in", values, "storeServiceCredit");
            return (Criteria) this;
        }

        public Criteria andStoreServiceCreditNotIn(List<Float> values) {
            addCriterion("store_service_credit not in", values, "storeServiceCredit");
            return (Criteria) this;
        }

        public Criteria andStoreServiceCreditBetween(Float value1, Float value2) {
            addCriterion("store_service_credit between", value1, value2, "storeServiceCredit");
            return (Criteria) this;
        }

        public Criteria andStoreServiceCreditNotBetween(Float value1, Float value2) {
            addCriterion("store_service_credit not between", value1, value2, "storeServiceCredit");
            return (Criteria) this;
        }

        public Criteria andStoreDeliveryCreditIsNull() {
            addCriterion("store_delivery_credit is null");
            return (Criteria) this;
        }

        public Criteria andStoreDeliveryCreditIsNotNull() {
            addCriterion("store_delivery_credit is not null");
            return (Criteria) this;
        }

        public Criteria andStoreDeliveryCreditEqualTo(Float value) {
            addCriterion("store_delivery_credit =", value, "storeDeliveryCredit");
            return (Criteria) this;
        }

        public Criteria andStoreDeliveryCreditNotEqualTo(Float value) {
            addCriterion("store_delivery_credit <>", value, "storeDeliveryCredit");
            return (Criteria) this;
        }

        public Criteria andStoreDeliveryCreditGreaterThan(Float value) {
            addCriterion("store_delivery_credit >", value, "storeDeliveryCredit");
            return (Criteria) this;
        }

        public Criteria andStoreDeliveryCreditGreaterThanOrEqualTo(Float value) {
            addCriterion("store_delivery_credit >=", value, "storeDeliveryCredit");
            return (Criteria) this;
        }

        public Criteria andStoreDeliveryCreditLessThan(Float value) {
            addCriterion("store_delivery_credit <", value, "storeDeliveryCredit");
            return (Criteria) this;
        }

        public Criteria andStoreDeliveryCreditLessThanOrEqualTo(Float value) {
            addCriterion("store_delivery_credit <=", value, "storeDeliveryCredit");
            return (Criteria) this;
        }

        public Criteria andStoreDeliveryCreditIn(List<Float> values) {
            addCriterion("store_delivery_credit in", values, "storeDeliveryCredit");
            return (Criteria) this;
        }

        public Criteria andStoreDeliveryCreditNotIn(List<Float> values) {
            addCriterion("store_delivery_credit not in", values, "storeDeliveryCredit");
            return (Criteria) this;
        }

        public Criteria andStoreDeliveryCreditBetween(Float value1, Float value2) {
            addCriterion("store_delivery_credit between", value1, value2, "storeDeliveryCredit");
            return (Criteria) this;
        }

        public Criteria andStoreDeliveryCreditNotBetween(Float value1, Float value2) {
            addCriterion("store_delivery_credit not between", value1, value2, "storeDeliveryCredit");
            return (Criteria) this;
        }

        public Criteria andStoreCollectCountIsNull() {
            addCriterion("store_collect_count is null");
            return (Criteria) this;
        }

        public Criteria andStoreCollectCountIsNotNull() {
            addCriterion("store_collect_count is not null");
            return (Criteria) this;
        }

        public Criteria andStoreCollectCountEqualTo(Integer value) {
            addCriterion("store_collect_count =", value, "storeCollectCount");
            return (Criteria) this;
        }

        public Criteria andStoreCollectCountNotEqualTo(Integer value) {
            addCriterion("store_collect_count <>", value, "storeCollectCount");
            return (Criteria) this;
        }

        public Criteria andStoreCollectCountGreaterThan(Integer value) {
            addCriterion("store_collect_count >", value, "storeCollectCount");
            return (Criteria) this;
        }

        public Criteria andStoreCollectCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_collect_count >=", value, "storeCollectCount");
            return (Criteria) this;
        }

        public Criteria andStoreCollectCountLessThan(Integer value) {
            addCriterion("store_collect_count <", value, "storeCollectCount");
            return (Criteria) this;
        }

        public Criteria andStoreCollectCountLessThanOrEqualTo(Integer value) {
            addCriterion("store_collect_count <=", value, "storeCollectCount");
            return (Criteria) this;
        }

        public Criteria andStoreCollectCountIn(List<Integer> values) {
            addCriterion("store_collect_count in", values, "storeCollectCount");
            return (Criteria) this;
        }

        public Criteria andStoreCollectCountNotIn(List<Integer> values) {
            addCriterion("store_collect_count not in", values, "storeCollectCount");
            return (Criteria) this;
        }

        public Criteria andStoreCollectCountBetween(Integer value1, Integer value2) {
            addCriterion("store_collect_count between", value1, value2, "storeCollectCount");
            return (Criteria) this;
        }

        public Criteria andStoreCollectCountNotBetween(Integer value1, Integer value2) {
            addCriterion("store_collect_count not between", value1, value2, "storeCollectCount");
            return (Criteria) this;
        }

        public Criteria andStoreSaleCountIsNull() {
            addCriterion("store_sale_count is null");
            return (Criteria) this;
        }

        public Criteria andStoreSaleCountIsNotNull() {
            addCriterion("store_sale_count is not null");
            return (Criteria) this;
        }

        public Criteria andStoreSaleCountEqualTo(Integer value) {
            addCriterion("store_sale_count =", value, "storeSaleCount");
            return (Criteria) this;
        }

        public Criteria andStoreSaleCountNotEqualTo(Integer value) {
            addCriterion("store_sale_count <>", value, "storeSaleCount");
            return (Criteria) this;
        }

        public Criteria andStoreSaleCountGreaterThan(Integer value) {
            addCriterion("store_sale_count >", value, "storeSaleCount");
            return (Criteria) this;
        }

        public Criteria andStoreSaleCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_sale_count >=", value, "storeSaleCount");
            return (Criteria) this;
        }

        public Criteria andStoreSaleCountLessThan(Integer value) {
            addCriterion("store_sale_count <", value, "storeSaleCount");
            return (Criteria) this;
        }

        public Criteria andStoreSaleCountLessThanOrEqualTo(Integer value) {
            addCriterion("store_sale_count <=", value, "storeSaleCount");
            return (Criteria) this;
        }

        public Criteria andStoreSaleCountIn(List<Integer> values) {
            addCriterion("store_sale_count in", values, "storeSaleCount");
            return (Criteria) this;
        }

        public Criteria andStoreSaleCountNotIn(List<Integer> values) {
            addCriterion("store_sale_count not in", values, "storeSaleCount");
            return (Criteria) this;
        }

        public Criteria andStoreSaleCountBetween(Integer value1, Integer value2) {
            addCriterion("store_sale_count between", value1, value2, "storeSaleCount");
            return (Criteria) this;
        }

        public Criteria andStoreSaleCountNotBetween(Integer value1, Integer value2) {
            addCriterion("store_sale_count not between", value1, value2, "storeSaleCount");
            return (Criteria) this;
        }

        public Criteria andStoreStampIsNull() {
            addCriterion("store_stamp is null");
            return (Criteria) this;
        }

        public Criteria andStoreStampIsNotNull() {
            addCriterion("store_stamp is not null");
            return (Criteria) this;
        }

        public Criteria andStoreStampEqualTo(String value) {
            addCriterion("store_stamp =", value, "storeStamp");
            return (Criteria) this;
        }

        public Criteria andStoreStampNotEqualTo(String value) {
            addCriterion("store_stamp <>", value, "storeStamp");
            return (Criteria) this;
        }

        public Criteria andStoreStampGreaterThan(String value) {
            addCriterion("store_stamp >", value, "storeStamp");
            return (Criteria) this;
        }

        public Criteria andStoreStampGreaterThanOrEqualTo(String value) {
            addCriterion("store_stamp >=", value, "storeStamp");
            return (Criteria) this;
        }

        public Criteria andStoreStampLessThan(String value) {
            addCriterion("store_stamp <", value, "storeStamp");
            return (Criteria) this;
        }

        public Criteria andStoreStampLessThanOrEqualTo(String value) {
            addCriterion("store_stamp <=", value, "storeStamp");
            return (Criteria) this;
        }

        public Criteria andStoreStampLike(String value) {
            addCriterion("store_stamp like", value, "storeStamp");
            return (Criteria) this;
        }

        public Criteria andStoreStampNotLike(String value) {
            addCriterion("store_stamp not like", value, "storeStamp");
            return (Criteria) this;
        }

        public Criteria andStoreStampIn(List<String> values) {
            addCriterion("store_stamp in", values, "storeStamp");
            return (Criteria) this;
        }

        public Criteria andStoreStampNotIn(List<String> values) {
            addCriterion("store_stamp not in", values, "storeStamp");
            return (Criteria) this;
        }

        public Criteria andStoreStampBetween(String value1, String value2) {
            addCriterion("store_stamp between", value1, value2, "storeStamp");
            return (Criteria) this;
        }

        public Criteria andStoreStampNotBetween(String value1, String value2) {
            addCriterion("store_stamp not between", value1, value2, "storeStamp");
            return (Criteria) this;
        }

        public Criteria andStorePrintDescIsNull() {
            addCriterion("store_print_desc is null");
            return (Criteria) this;
        }

        public Criteria andStorePrintDescIsNotNull() {
            addCriterion("store_print_desc is not null");
            return (Criteria) this;
        }

        public Criteria andStorePrintDescEqualTo(String value) {
            addCriterion("store_print_desc =", value, "storePrintDesc");
            return (Criteria) this;
        }

        public Criteria andStorePrintDescNotEqualTo(String value) {
            addCriterion("store_print_desc <>", value, "storePrintDesc");
            return (Criteria) this;
        }

        public Criteria andStorePrintDescGreaterThan(String value) {
            addCriterion("store_print_desc >", value, "storePrintDesc");
            return (Criteria) this;
        }

        public Criteria andStorePrintDescGreaterThanOrEqualTo(String value) {
            addCriterion("store_print_desc >=", value, "storePrintDesc");
            return (Criteria) this;
        }

        public Criteria andStorePrintDescLessThan(String value) {
            addCriterion("store_print_desc <", value, "storePrintDesc");
            return (Criteria) this;
        }

        public Criteria andStorePrintDescLessThanOrEqualTo(String value) {
            addCriterion("store_print_desc <=", value, "storePrintDesc");
            return (Criteria) this;
        }

        public Criteria andStorePrintDescLike(String value) {
            addCriterion("store_print_desc like", value, "storePrintDesc");
            return (Criteria) this;
        }

        public Criteria andStorePrintDescNotLike(String value) {
            addCriterion("store_print_desc not like", value, "storePrintDesc");
            return (Criteria) this;
        }

        public Criteria andStorePrintDescIn(List<String> values) {
            addCriterion("store_print_desc in", values, "storePrintDesc");
            return (Criteria) this;
        }

        public Criteria andStorePrintDescNotIn(List<String> values) {
            addCriterion("store_print_desc not in", values, "storePrintDesc");
            return (Criteria) this;
        }

        public Criteria andStorePrintDescBetween(String value1, String value2) {
            addCriterion("store_print_desc between", value1, value2, "storePrintDesc");
            return (Criteria) this;
        }

        public Criteria andStorePrintDescNotBetween(String value1, String value2) {
            addCriterion("store_print_desc not between", value1, value2, "storePrintDesc");
            return (Criteria) this;
        }

        public Criteria andStoreWorkingTimeIsNull() {
            addCriterion("store_working_time is null");
            return (Criteria) this;
        }

        public Criteria andStoreWorkingTimeIsNotNull() {
            addCriterion("store_working_time is not null");
            return (Criteria) this;
        }

        public Criteria andStoreWorkingTimeEqualTo(String value) {
            addCriterion("store_working_time =", value, "storeWorkingTime");
            return (Criteria) this;
        }

        public Criteria andStoreWorkingTimeNotEqualTo(String value) {
            addCriterion("store_working_time <>", value, "storeWorkingTime");
            return (Criteria) this;
        }

        public Criteria andStoreWorkingTimeGreaterThan(String value) {
            addCriterion("store_working_time >", value, "storeWorkingTime");
            return (Criteria) this;
        }

        public Criteria andStoreWorkingTimeGreaterThanOrEqualTo(String value) {
            addCriterion("store_working_time >=", value, "storeWorkingTime");
            return (Criteria) this;
        }

        public Criteria andStoreWorkingTimeLessThan(String value) {
            addCriterion("store_working_time <", value, "storeWorkingTime");
            return (Criteria) this;
        }

        public Criteria andStoreWorkingTimeLessThanOrEqualTo(String value) {
            addCriterion("store_working_time <=", value, "storeWorkingTime");
            return (Criteria) this;
        }

        public Criteria andStoreWorkingTimeLike(String value) {
            addCriterion("store_working_time like", value, "storeWorkingTime");
            return (Criteria) this;
        }

        public Criteria andStoreWorkingTimeNotLike(String value) {
            addCriterion("store_working_time not like", value, "storeWorkingTime");
            return (Criteria) this;
        }

        public Criteria andStoreWorkingTimeIn(List<String> values) {
            addCriterion("store_working_time in", values, "storeWorkingTime");
            return (Criteria) this;
        }

        public Criteria andStoreWorkingTimeNotIn(List<String> values) {
            addCriterion("store_working_time not in", values, "storeWorkingTime");
            return (Criteria) this;
        }

        public Criteria andStoreWorkingTimeBetween(String value1, String value2) {
            addCriterion("store_working_time between", value1, value2, "storeWorkingTime");
            return (Criteria) this;
        }

        public Criteria andStoreWorkingTimeNotBetween(String value1, String value2) {
            addCriterion("store_working_time not between", value1, value2, "storeWorkingTime");
            return (Criteria) this;
        }

        public Criteria andStoreFreePriceIsNull() {
            addCriterion("store_free_price is null");
            return (Criteria) this;
        }

        public Criteria andStoreFreePriceIsNotNull() {
            addCriterion("store_free_price is not null");
            return (Criteria) this;
        }

        public Criteria andStoreFreePriceEqualTo(BigDecimal value) {
            addCriterion("store_free_price =", value, "storeFreePrice");
            return (Criteria) this;
        }

        public Criteria andStoreFreePriceNotEqualTo(BigDecimal value) {
            addCriterion("store_free_price <>", value, "storeFreePrice");
            return (Criteria) this;
        }

        public Criteria andStoreFreePriceGreaterThan(BigDecimal value) {
            addCriterion("store_free_price >", value, "storeFreePrice");
            return (Criteria) this;
        }

        public Criteria andStoreFreePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("store_free_price >=", value, "storeFreePrice");
            return (Criteria) this;
        }

        public Criteria andStoreFreePriceLessThan(BigDecimal value) {
            addCriterion("store_free_price <", value, "storeFreePrice");
            return (Criteria) this;
        }

        public Criteria andStoreFreePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("store_free_price <=", value, "storeFreePrice");
            return (Criteria) this;
        }

        public Criteria andStoreFreePriceIn(List<BigDecimal> values) {
            addCriterion("store_free_price in", values, "storeFreePrice");
            return (Criteria) this;
        }

        public Criteria andStoreFreePriceNotIn(List<BigDecimal> values) {
            addCriterion("store_free_price not in", values, "storeFreePrice");
            return (Criteria) this;
        }

        public Criteria andStoreFreePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("store_free_price between", value1, value2, "storeFreePrice");
            return (Criteria) this;
        }

        public Criteria andStoreFreePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("store_free_price not between", value1, value2, "storeFreePrice");
            return (Criteria) this;
        }

        public Criteria andStoreDecorationSwitchIsNull() {
            addCriterion("store_decoration_switch is null");
            return (Criteria) this;
        }

        public Criteria andStoreDecorationSwitchIsNotNull() {
            addCriterion("store_decoration_switch is not null");
            return (Criteria) this;
        }

        public Criteria andStoreDecorationSwitchEqualTo(Integer value) {
            addCriterion("store_decoration_switch =", value, "storeDecorationSwitch");
            return (Criteria) this;
        }

        public Criteria andStoreDecorationSwitchNotEqualTo(Integer value) {
            addCriterion("store_decoration_switch <>", value, "storeDecorationSwitch");
            return (Criteria) this;
        }

        public Criteria andStoreDecorationSwitchGreaterThan(Integer value) {
            addCriterion("store_decoration_switch >", value, "storeDecorationSwitch");
            return (Criteria) this;
        }

        public Criteria andStoreDecorationSwitchGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_decoration_switch >=", value, "storeDecorationSwitch");
            return (Criteria) this;
        }

        public Criteria andStoreDecorationSwitchLessThan(Integer value) {
            addCriterion("store_decoration_switch <", value, "storeDecorationSwitch");
            return (Criteria) this;
        }

        public Criteria andStoreDecorationSwitchLessThanOrEqualTo(Integer value) {
            addCriterion("store_decoration_switch <=", value, "storeDecorationSwitch");
            return (Criteria) this;
        }

        public Criteria andStoreDecorationSwitchIn(List<Integer> values) {
            addCriterion("store_decoration_switch in", values, "storeDecorationSwitch");
            return (Criteria) this;
        }

        public Criteria andStoreDecorationSwitchNotIn(List<Integer> values) {
            addCriterion("store_decoration_switch not in", values, "storeDecorationSwitch");
            return (Criteria) this;
        }

        public Criteria andStoreDecorationSwitchBetween(Integer value1, Integer value2) {
            addCriterion("store_decoration_switch between", value1, value2, "storeDecorationSwitch");
            return (Criteria) this;
        }

        public Criteria andStoreDecorationSwitchNotBetween(Integer value1, Integer value2) {
            addCriterion("store_decoration_switch not between", value1, value2, "storeDecorationSwitch");
            return (Criteria) this;
        }

        public Criteria andStoreDecorationOnlyIsNull() {
            addCriterion("store_decoration_only is null");
            return (Criteria) this;
        }

        public Criteria andStoreDecorationOnlyIsNotNull() {
            addCriterion("store_decoration_only is not null");
            return (Criteria) this;
        }

        public Criteria andStoreDecorationOnlyEqualTo(Boolean value) {
            addCriterion("store_decoration_only =", value, "storeDecorationOnly");
            return (Criteria) this;
        }

        public Criteria andStoreDecorationOnlyNotEqualTo(Boolean value) {
            addCriterion("store_decoration_only <>", value, "storeDecorationOnly");
            return (Criteria) this;
        }

        public Criteria andStoreDecorationOnlyGreaterThan(Boolean value) {
            addCriterion("store_decoration_only >", value, "storeDecorationOnly");
            return (Criteria) this;
        }

        public Criteria andStoreDecorationOnlyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("store_decoration_only >=", value, "storeDecorationOnly");
            return (Criteria) this;
        }

        public Criteria andStoreDecorationOnlyLessThan(Boolean value) {
            addCriterion("store_decoration_only <", value, "storeDecorationOnly");
            return (Criteria) this;
        }

        public Criteria andStoreDecorationOnlyLessThanOrEqualTo(Boolean value) {
            addCriterion("store_decoration_only <=", value, "storeDecorationOnly");
            return (Criteria) this;
        }

        public Criteria andStoreDecorationOnlyIn(List<Boolean> values) {
            addCriterion("store_decoration_only in", values, "storeDecorationOnly");
            return (Criteria) this;
        }

        public Criteria andStoreDecorationOnlyNotIn(List<Boolean> values) {
            addCriterion("store_decoration_only not in", values, "storeDecorationOnly");
            return (Criteria) this;
        }

        public Criteria andStoreDecorationOnlyBetween(Boolean value1, Boolean value2) {
            addCriterion("store_decoration_only between", value1, value2, "storeDecorationOnly");
            return (Criteria) this;
        }

        public Criteria andStoreDecorationOnlyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("store_decoration_only not between", value1, value2, "storeDecorationOnly");
            return (Criteria) this;
        }

        public Criteria andStoreDecorationImageCountIsNull() {
            addCriterion("store_decoration_image_count is null");
            return (Criteria) this;
        }

        public Criteria andStoreDecorationImageCountIsNotNull() {
            addCriterion("store_decoration_image_count is not null");
            return (Criteria) this;
        }

        public Criteria andStoreDecorationImageCountEqualTo(Integer value) {
            addCriterion("store_decoration_image_count =", value, "storeDecorationImageCount");
            return (Criteria) this;
        }

        public Criteria andStoreDecorationImageCountNotEqualTo(Integer value) {
            addCriterion("store_decoration_image_count <>", value, "storeDecorationImageCount");
            return (Criteria) this;
        }

        public Criteria andStoreDecorationImageCountGreaterThan(Integer value) {
            addCriterion("store_decoration_image_count >", value, "storeDecorationImageCount");
            return (Criteria) this;
        }

        public Criteria andStoreDecorationImageCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_decoration_image_count >=", value, "storeDecorationImageCount");
            return (Criteria) this;
        }

        public Criteria andStoreDecorationImageCountLessThan(Integer value) {
            addCriterion("store_decoration_image_count <", value, "storeDecorationImageCount");
            return (Criteria) this;
        }

        public Criteria andStoreDecorationImageCountLessThanOrEqualTo(Integer value) {
            addCriterion("store_decoration_image_count <=", value, "storeDecorationImageCount");
            return (Criteria) this;
        }

        public Criteria andStoreDecorationImageCountIn(List<Integer> values) {
            addCriterion("store_decoration_image_count in", values, "storeDecorationImageCount");
            return (Criteria) this;
        }

        public Criteria andStoreDecorationImageCountNotIn(List<Integer> values) {
            addCriterion("store_decoration_image_count not in", values, "storeDecorationImageCount");
            return (Criteria) this;
        }

        public Criteria andStoreDecorationImageCountBetween(Integer value1, Integer value2) {
            addCriterion("store_decoration_image_count between", value1, value2, "storeDecorationImageCount");
            return (Criteria) this;
        }

        public Criteria andStoreDecorationImageCountNotBetween(Integer value1, Integer value2) {
            addCriterion("store_decoration_image_count not between", value1, value2, "storeDecorationImageCount");
            return (Criteria) this;
        }

        public Criteria andLiveStoreNameIsNull() {
            addCriterion("live_store_name is null");
            return (Criteria) this;
        }

        public Criteria andLiveStoreNameIsNotNull() {
            addCriterion("live_store_name is not null");
            return (Criteria) this;
        }

        public Criteria andLiveStoreNameEqualTo(String value) {
            addCriterion("live_store_name =", value, "liveStoreName");
            return (Criteria) this;
        }

        public Criteria andLiveStoreNameNotEqualTo(String value) {
            addCriterion("live_store_name <>", value, "liveStoreName");
            return (Criteria) this;
        }

        public Criteria andLiveStoreNameGreaterThan(String value) {
            addCriterion("live_store_name >", value, "liveStoreName");
            return (Criteria) this;
        }

        public Criteria andLiveStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("live_store_name >=", value, "liveStoreName");
            return (Criteria) this;
        }

        public Criteria andLiveStoreNameLessThan(String value) {
            addCriterion("live_store_name <", value, "liveStoreName");
            return (Criteria) this;
        }

        public Criteria andLiveStoreNameLessThanOrEqualTo(String value) {
            addCriterion("live_store_name <=", value, "liveStoreName");
            return (Criteria) this;
        }

        public Criteria andLiveStoreNameLike(String value) {
            addCriterion("live_store_name like", value, "liveStoreName");
            return (Criteria) this;
        }

        public Criteria andLiveStoreNameNotLike(String value) {
            addCriterion("live_store_name not like", value, "liveStoreName");
            return (Criteria) this;
        }

        public Criteria andLiveStoreNameIn(List<String> values) {
            addCriterion("live_store_name in", values, "liveStoreName");
            return (Criteria) this;
        }

        public Criteria andLiveStoreNameNotIn(List<String> values) {
            addCriterion("live_store_name not in", values, "liveStoreName");
            return (Criteria) this;
        }

        public Criteria andLiveStoreNameBetween(String value1, String value2) {
            addCriterion("live_store_name between", value1, value2, "liveStoreName");
            return (Criteria) this;
        }

        public Criteria andLiveStoreNameNotBetween(String value1, String value2) {
            addCriterion("live_store_name not between", value1, value2, "liveStoreName");
            return (Criteria) this;
        }

        public Criteria andLiveStoreAddressIsNull() {
            addCriterion("live_store_address is null");
            return (Criteria) this;
        }

        public Criteria andLiveStoreAddressIsNotNull() {
            addCriterion("live_store_address is not null");
            return (Criteria) this;
        }

        public Criteria andLiveStoreAddressEqualTo(String value) {
            addCriterion("live_store_address =", value, "liveStoreAddress");
            return (Criteria) this;
        }

        public Criteria andLiveStoreAddressNotEqualTo(String value) {
            addCriterion("live_store_address <>", value, "liveStoreAddress");
            return (Criteria) this;
        }

        public Criteria andLiveStoreAddressGreaterThan(String value) {
            addCriterion("live_store_address >", value, "liveStoreAddress");
            return (Criteria) this;
        }

        public Criteria andLiveStoreAddressGreaterThanOrEqualTo(String value) {
            addCriterion("live_store_address >=", value, "liveStoreAddress");
            return (Criteria) this;
        }

        public Criteria andLiveStoreAddressLessThan(String value) {
            addCriterion("live_store_address <", value, "liveStoreAddress");
            return (Criteria) this;
        }

        public Criteria andLiveStoreAddressLessThanOrEqualTo(String value) {
            addCriterion("live_store_address <=", value, "liveStoreAddress");
            return (Criteria) this;
        }

        public Criteria andLiveStoreAddressLike(String value) {
            addCriterion("live_store_address like", value, "liveStoreAddress");
            return (Criteria) this;
        }

        public Criteria andLiveStoreAddressNotLike(String value) {
            addCriterion("live_store_address not like", value, "liveStoreAddress");
            return (Criteria) this;
        }

        public Criteria andLiveStoreAddressIn(List<String> values) {
            addCriterion("live_store_address in", values, "liveStoreAddress");
            return (Criteria) this;
        }

        public Criteria andLiveStoreAddressNotIn(List<String> values) {
            addCriterion("live_store_address not in", values, "liveStoreAddress");
            return (Criteria) this;
        }

        public Criteria andLiveStoreAddressBetween(String value1, String value2) {
            addCriterion("live_store_address between", value1, value2, "liveStoreAddress");
            return (Criteria) this;
        }

        public Criteria andLiveStoreAddressNotBetween(String value1, String value2) {
            addCriterion("live_store_address not between", value1, value2, "liveStoreAddress");
            return (Criteria) this;
        }

        public Criteria andLiveStoreTelIsNull() {
            addCriterion("live_store_tel is null");
            return (Criteria) this;
        }

        public Criteria andLiveStoreTelIsNotNull() {
            addCriterion("live_store_tel is not null");
            return (Criteria) this;
        }

        public Criteria andLiveStoreTelEqualTo(String value) {
            addCriterion("live_store_tel =", value, "liveStoreTel");
            return (Criteria) this;
        }

        public Criteria andLiveStoreTelNotEqualTo(String value) {
            addCriterion("live_store_tel <>", value, "liveStoreTel");
            return (Criteria) this;
        }

        public Criteria andLiveStoreTelGreaterThan(String value) {
            addCriterion("live_store_tel >", value, "liveStoreTel");
            return (Criteria) this;
        }

        public Criteria andLiveStoreTelGreaterThanOrEqualTo(String value) {
            addCriterion("live_store_tel >=", value, "liveStoreTel");
            return (Criteria) this;
        }

        public Criteria andLiveStoreTelLessThan(String value) {
            addCriterion("live_store_tel <", value, "liveStoreTel");
            return (Criteria) this;
        }

        public Criteria andLiveStoreTelLessThanOrEqualTo(String value) {
            addCriterion("live_store_tel <=", value, "liveStoreTel");
            return (Criteria) this;
        }

        public Criteria andLiveStoreTelLike(String value) {
            addCriterion("live_store_tel like", value, "liveStoreTel");
            return (Criteria) this;
        }

        public Criteria andLiveStoreTelNotLike(String value) {
            addCriterion("live_store_tel not like", value, "liveStoreTel");
            return (Criteria) this;
        }

        public Criteria andLiveStoreTelIn(List<String> values) {
            addCriterion("live_store_tel in", values, "liveStoreTel");
            return (Criteria) this;
        }

        public Criteria andLiveStoreTelNotIn(List<String> values) {
            addCriterion("live_store_tel not in", values, "liveStoreTel");
            return (Criteria) this;
        }

        public Criteria andLiveStoreTelBetween(String value1, String value2) {
            addCriterion("live_store_tel between", value1, value2, "liveStoreTel");
            return (Criteria) this;
        }

        public Criteria andLiveStoreTelNotBetween(String value1, String value2) {
            addCriterion("live_store_tel not between", value1, value2, "liveStoreTel");
            return (Criteria) this;
        }

        public Criteria andLiveStoreBusIsNull() {
            addCriterion("live_store_bus is null");
            return (Criteria) this;
        }

        public Criteria andLiveStoreBusIsNotNull() {
            addCriterion("live_store_bus is not null");
            return (Criteria) this;
        }

        public Criteria andLiveStoreBusEqualTo(String value) {
            addCriterion("live_store_bus =", value, "liveStoreBus");
            return (Criteria) this;
        }

        public Criteria andLiveStoreBusNotEqualTo(String value) {
            addCriterion("live_store_bus <>", value, "liveStoreBus");
            return (Criteria) this;
        }

        public Criteria andLiveStoreBusGreaterThan(String value) {
            addCriterion("live_store_bus >", value, "liveStoreBus");
            return (Criteria) this;
        }

        public Criteria andLiveStoreBusGreaterThanOrEqualTo(String value) {
            addCriterion("live_store_bus >=", value, "liveStoreBus");
            return (Criteria) this;
        }

        public Criteria andLiveStoreBusLessThan(String value) {
            addCriterion("live_store_bus <", value, "liveStoreBus");
            return (Criteria) this;
        }

        public Criteria andLiveStoreBusLessThanOrEqualTo(String value) {
            addCriterion("live_store_bus <=", value, "liveStoreBus");
            return (Criteria) this;
        }

        public Criteria andLiveStoreBusLike(String value) {
            addCriterion("live_store_bus like", value, "liveStoreBus");
            return (Criteria) this;
        }

        public Criteria andLiveStoreBusNotLike(String value) {
            addCriterion("live_store_bus not like", value, "liveStoreBus");
            return (Criteria) this;
        }

        public Criteria andLiveStoreBusIn(List<String> values) {
            addCriterion("live_store_bus in", values, "liveStoreBus");
            return (Criteria) this;
        }

        public Criteria andLiveStoreBusNotIn(List<String> values) {
            addCriterion("live_store_bus not in", values, "liveStoreBus");
            return (Criteria) this;
        }

        public Criteria andLiveStoreBusBetween(String value1, String value2) {
            addCriterion("live_store_bus between", value1, value2, "liveStoreBus");
            return (Criteria) this;
        }

        public Criteria andLiveStoreBusNotBetween(String value1, String value2) {
            addCriterion("live_store_bus not between", value1, value2, "liveStoreBus");
            return (Criteria) this;
        }

        public Criteria andIsOwnShopIsNull() {
            addCriterion("is_own_shop is null");
            return (Criteria) this;
        }

        public Criteria andIsOwnShopIsNotNull() {
            addCriterion("is_own_shop is not null");
            return (Criteria) this;
        }

        public Criteria andIsOwnShopEqualTo(Byte value) {
            addCriterion("is_own_shop =", value, "isOwnShop");
            return (Criteria) this;
        }

        public Criteria andIsOwnShopNotEqualTo(Byte value) {
            addCriterion("is_own_shop <>", value, "isOwnShop");
            return (Criteria) this;
        }

        public Criteria andIsOwnShopGreaterThan(Byte value) {
            addCriterion("is_own_shop >", value, "isOwnShop");
            return (Criteria) this;
        }

        public Criteria andIsOwnShopGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_own_shop >=", value, "isOwnShop");
            return (Criteria) this;
        }

        public Criteria andIsOwnShopLessThan(Byte value) {
            addCriterion("is_own_shop <", value, "isOwnShop");
            return (Criteria) this;
        }

        public Criteria andIsOwnShopLessThanOrEqualTo(Byte value) {
            addCriterion("is_own_shop <=", value, "isOwnShop");
            return (Criteria) this;
        }

        public Criteria andIsOwnShopIn(List<Byte> values) {
            addCriterion("is_own_shop in", values, "isOwnShop");
            return (Criteria) this;
        }

        public Criteria andIsOwnShopNotIn(List<Byte> values) {
            addCriterion("is_own_shop not in", values, "isOwnShop");
            return (Criteria) this;
        }

        public Criteria andIsOwnShopBetween(Byte value1, Byte value2) {
            addCriterion("is_own_shop between", value1, value2, "isOwnShop");
            return (Criteria) this;
        }

        public Criteria andIsOwnShopNotBetween(Byte value1, Byte value2) {
            addCriterion("is_own_shop not between", value1, value2, "isOwnShop");
            return (Criteria) this;
        }

        public Criteria andBindAllGcIsNull() {
            addCriterion("bind_all_gc is null");
            return (Criteria) this;
        }

        public Criteria andBindAllGcIsNotNull() {
            addCriterion("bind_all_gc is not null");
            return (Criteria) this;
        }

        public Criteria andBindAllGcEqualTo(Byte value) {
            addCriterion("bind_all_gc =", value, "bindAllGc");
            return (Criteria) this;
        }

        public Criteria andBindAllGcNotEqualTo(Byte value) {
            addCriterion("bind_all_gc <>", value, "bindAllGc");
            return (Criteria) this;
        }

        public Criteria andBindAllGcGreaterThan(Byte value) {
            addCriterion("bind_all_gc >", value, "bindAllGc");
            return (Criteria) this;
        }

        public Criteria andBindAllGcGreaterThanOrEqualTo(Byte value) {
            addCriterion("bind_all_gc >=", value, "bindAllGc");
            return (Criteria) this;
        }

        public Criteria andBindAllGcLessThan(Byte value) {
            addCriterion("bind_all_gc <", value, "bindAllGc");
            return (Criteria) this;
        }

        public Criteria andBindAllGcLessThanOrEqualTo(Byte value) {
            addCriterion("bind_all_gc <=", value, "bindAllGc");
            return (Criteria) this;
        }

        public Criteria andBindAllGcIn(List<Byte> values) {
            addCriterion("bind_all_gc in", values, "bindAllGc");
            return (Criteria) this;
        }

        public Criteria andBindAllGcNotIn(List<Byte> values) {
            addCriterion("bind_all_gc not in", values, "bindAllGc");
            return (Criteria) this;
        }

        public Criteria andBindAllGcBetween(Byte value1, Byte value2) {
            addCriterion("bind_all_gc between", value1, value2, "bindAllGc");
            return (Criteria) this;
        }

        public Criteria andBindAllGcNotBetween(Byte value1, Byte value2) {
            addCriterion("bind_all_gc not between", value1, value2, "bindAllGc");
            return (Criteria) this;
        }

        public Criteria andStoreVrcodePrefixIsNull() {
            addCriterion("store_vrcode_prefix is null");
            return (Criteria) this;
        }

        public Criteria andStoreVrcodePrefixIsNotNull() {
            addCriterion("store_vrcode_prefix is not null");
            return (Criteria) this;
        }

        public Criteria andStoreVrcodePrefixEqualTo(String value) {
            addCriterion("store_vrcode_prefix =", value, "storeVrcodePrefix");
            return (Criteria) this;
        }

        public Criteria andStoreVrcodePrefixNotEqualTo(String value) {
            addCriterion("store_vrcode_prefix <>", value, "storeVrcodePrefix");
            return (Criteria) this;
        }

        public Criteria andStoreVrcodePrefixGreaterThan(String value) {
            addCriterion("store_vrcode_prefix >", value, "storeVrcodePrefix");
            return (Criteria) this;
        }

        public Criteria andStoreVrcodePrefixGreaterThanOrEqualTo(String value) {
            addCriterion("store_vrcode_prefix >=", value, "storeVrcodePrefix");
            return (Criteria) this;
        }

        public Criteria andStoreVrcodePrefixLessThan(String value) {
            addCriterion("store_vrcode_prefix <", value, "storeVrcodePrefix");
            return (Criteria) this;
        }

        public Criteria andStoreVrcodePrefixLessThanOrEqualTo(String value) {
            addCriterion("store_vrcode_prefix <=", value, "storeVrcodePrefix");
            return (Criteria) this;
        }

        public Criteria andStoreVrcodePrefixLike(String value) {
            addCriterion("store_vrcode_prefix like", value, "storeVrcodePrefix");
            return (Criteria) this;
        }

        public Criteria andStoreVrcodePrefixNotLike(String value) {
            addCriterion("store_vrcode_prefix not like", value, "storeVrcodePrefix");
            return (Criteria) this;
        }

        public Criteria andStoreVrcodePrefixIn(List<String> values) {
            addCriterion("store_vrcode_prefix in", values, "storeVrcodePrefix");
            return (Criteria) this;
        }

        public Criteria andStoreVrcodePrefixNotIn(List<String> values) {
            addCriterion("store_vrcode_prefix not in", values, "storeVrcodePrefix");
            return (Criteria) this;
        }

        public Criteria andStoreVrcodePrefixBetween(String value1, String value2) {
            addCriterion("store_vrcode_prefix between", value1, value2, "storeVrcodePrefix");
            return (Criteria) this;
        }

        public Criteria andStoreVrcodePrefixNotBetween(String value1, String value2) {
            addCriterion("store_vrcode_prefix not between", value1, value2, "storeVrcodePrefix");
            return (Criteria) this;
        }

        public Criteria andMobileTitleImgIsNull() {
            addCriterion("mobile_title_img is null");
            return (Criteria) this;
        }

        public Criteria andMobileTitleImgIsNotNull() {
            addCriterion("mobile_title_img is not null");
            return (Criteria) this;
        }

        public Criteria andMobileTitleImgEqualTo(String value) {
            addCriterion("mobile_title_img =", value, "mobileTitleImg");
            return (Criteria) this;
        }

        public Criteria andMobileTitleImgNotEqualTo(String value) {
            addCriterion("mobile_title_img <>", value, "mobileTitleImg");
            return (Criteria) this;
        }

        public Criteria andMobileTitleImgGreaterThan(String value) {
            addCriterion("mobile_title_img >", value, "mobileTitleImg");
            return (Criteria) this;
        }

        public Criteria andMobileTitleImgGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_title_img >=", value, "mobileTitleImg");
            return (Criteria) this;
        }

        public Criteria andMobileTitleImgLessThan(String value) {
            addCriterion("mobile_title_img <", value, "mobileTitleImg");
            return (Criteria) this;
        }

        public Criteria andMobileTitleImgLessThanOrEqualTo(String value) {
            addCriterion("mobile_title_img <=", value, "mobileTitleImg");
            return (Criteria) this;
        }

        public Criteria andMobileTitleImgLike(String value) {
            addCriterion("mobile_title_img like", value, "mobileTitleImg");
            return (Criteria) this;
        }

        public Criteria andMobileTitleImgNotLike(String value) {
            addCriterion("mobile_title_img not like", value, "mobileTitleImg");
            return (Criteria) this;
        }

        public Criteria andMobileTitleImgIn(List<String> values) {
            addCriterion("mobile_title_img in", values, "mobileTitleImg");
            return (Criteria) this;
        }

        public Criteria andMobileTitleImgNotIn(List<String> values) {
            addCriterion("mobile_title_img not in", values, "mobileTitleImg");
            return (Criteria) this;
        }

        public Criteria andMobileTitleImgBetween(String value1, String value2) {
            addCriterion("mobile_title_img between", value1, value2, "mobileTitleImg");
            return (Criteria) this;
        }

        public Criteria andMobileTitleImgNotBetween(String value1, String value2) {
            addCriterion("mobile_title_img not between", value1, value2, "mobileTitleImg");
            return (Criteria) this;
        }

        public Criteria andLeftBarTypeIsNull() {
            addCriterion("left_bar_type is null");
            return (Criteria) this;
        }

        public Criteria andLeftBarTypeIsNotNull() {
            addCriterion("left_bar_type is not null");
            return (Criteria) this;
        }

        public Criteria andLeftBarTypeEqualTo(Byte value) {
            addCriterion("left_bar_type =", value, "leftBarType");
            return (Criteria) this;
        }

        public Criteria andLeftBarTypeNotEqualTo(Byte value) {
            addCriterion("left_bar_type <>", value, "leftBarType");
            return (Criteria) this;
        }

        public Criteria andLeftBarTypeGreaterThan(Byte value) {
            addCriterion("left_bar_type >", value, "leftBarType");
            return (Criteria) this;
        }

        public Criteria andLeftBarTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("left_bar_type >=", value, "leftBarType");
            return (Criteria) this;
        }

        public Criteria andLeftBarTypeLessThan(Byte value) {
            addCriterion("left_bar_type <", value, "leftBarType");
            return (Criteria) this;
        }

        public Criteria andLeftBarTypeLessThanOrEqualTo(Byte value) {
            addCriterion("left_bar_type <=", value, "leftBarType");
            return (Criteria) this;
        }

        public Criteria andLeftBarTypeIn(List<Byte> values) {
            addCriterion("left_bar_type in", values, "leftBarType");
            return (Criteria) this;
        }

        public Criteria andLeftBarTypeNotIn(List<Byte> values) {
            addCriterion("left_bar_type not in", values, "leftBarType");
            return (Criteria) this;
        }

        public Criteria andLeftBarTypeBetween(Byte value1, Byte value2) {
            addCriterion("left_bar_type between", value1, value2, "leftBarType");
            return (Criteria) this;
        }

        public Criteria andLeftBarTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("left_bar_type not between", value1, value2, "leftBarType");
            return (Criteria) this;
        }

        public Criteria andTemplateIsNull() {
            addCriterion("template is null");
            return (Criteria) this;
        }

        public Criteria andTemplateIsNotNull() {
            addCriterion("template is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateEqualTo(Integer value) {
            addCriterion("template =", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateNotEqualTo(Integer value) {
            addCriterion("template <>", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateGreaterThan(Integer value) {
            addCriterion("template >", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateGreaterThanOrEqualTo(Integer value) {
            addCriterion("template >=", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateLessThan(Integer value) {
            addCriterion("template <", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateLessThanOrEqualTo(Integer value) {
            addCriterion("template <=", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateIn(List<Integer> values) {
            addCriterion("template in", values, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateNotIn(List<Integer> values) {
            addCriterion("template not in", values, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateBetween(Integer value1, Integer value2) {
            addCriterion("template between", value1, value2, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateNotBetween(Integer value1, Integer value2) {
            addCriterion("template not between", value1, value2, "template");
            return (Criteria) this;
        }

        public Criteria andStoreSortIsNull() {
            addCriterion("store_sort is null");
            return (Criteria) this;
        }

        public Criteria andStoreSortIsNotNull() {
            addCriterion("store_sort is not null");
            return (Criteria) this;
        }

        public Criteria andStoreSortEqualTo(Integer value) {
            addCriterion("store_sort =", value, "storeSort");
            return (Criteria) this;
        }

        public Criteria andStoreSortNotEqualTo(Integer value) {
            addCriterion("store_sort <>", value, "storeSort");
            return (Criteria) this;
        }

        public Criteria andStoreSortGreaterThan(Integer value) {
            addCriterion("store_sort >", value, "storeSort");
            return (Criteria) this;
        }

        public Criteria andStoreSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_sort >=", value, "storeSort");
            return (Criteria) this;
        }

        public Criteria andStoreSortLessThan(Integer value) {
            addCriterion("store_sort <", value, "storeSort");
            return (Criteria) this;
        }

        public Criteria andStoreSortLessThanOrEqualTo(Integer value) {
            addCriterion("store_sort <=", value, "storeSort");
            return (Criteria) this;
        }

        public Criteria andStoreSortIn(List<Integer> values) {
            addCriterion("store_sort in", values, "storeSort");
            return (Criteria) this;
        }

        public Criteria andStoreSortNotIn(List<Integer> values) {
            addCriterion("store_sort not in", values, "storeSort");
            return (Criteria) this;
        }

        public Criteria andStoreSortBetween(Integer value1, Integer value2) {
            addCriterion("store_sort between", value1, value2, "storeSort");
            return (Criteria) this;
        }

        public Criteria andStoreSortNotBetween(Integer value1, Integer value2) {
            addCriterion("store_sort not between", value1, value2, "storeSort");
            return (Criteria) this;
        }

        public Criteria andStoreStatusIsNull() {
            addCriterion("store_status is null");
            return (Criteria) this;
        }

        public Criteria andStoreStatusIsNotNull() {
            addCriterion("store_status is not null");
            return (Criteria) this;
        }

        public Criteria andStoreStatusEqualTo(Boolean value) {
            addCriterion("store_status =", value, "storeStatus");
            return (Criteria) this;
        }

        public Criteria andStoreStatusNotEqualTo(Boolean value) {
            addCriterion("store_status <>", value, "storeStatus");
            return (Criteria) this;
        }

        public Criteria andStoreStatusGreaterThan(Boolean value) {
            addCriterion("store_status >", value, "storeStatus");
            return (Criteria) this;
        }

        public Criteria andStoreStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("store_status >=", value, "storeStatus");
            return (Criteria) this;
        }

        public Criteria andStoreStatusLessThan(Boolean value) {
            addCriterion("store_status <", value, "storeStatus");
            return (Criteria) this;
        }

        public Criteria andStoreStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("store_status <=", value, "storeStatus");
            return (Criteria) this;
        }

        public Criteria andStoreStatusIn(List<Boolean> values) {
            addCriterion("store_status in", values, "storeStatus");
            return (Criteria) this;
        }

        public Criteria andStoreStatusNotIn(List<Boolean> values) {
            addCriterion("store_status not in", values, "storeStatus");
            return (Criteria) this;
        }

        public Criteria andStoreStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("store_status between", value1, value2, "storeStatus");
            return (Criteria) this;
        }

        public Criteria andStoreStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("store_status not between", value1, value2, "storeStatus");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 店铺表
     * @author lpl
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}