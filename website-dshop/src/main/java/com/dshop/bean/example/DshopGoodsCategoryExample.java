/*
 * DshopGoodsCategoryExample.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.bean.example;

import java.util.ArrayList;
import java.util.List;

public class DshopGoodsCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DshopGoodsCategoryExample() {
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
     * 商品类别表
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

        public Criteria andCateIdIsNull() {
            addCriterion("cate_id is null");
            return (Criteria) this;
        }

        public Criteria andCateIdIsNotNull() {
            addCriterion("cate_id is not null");
            return (Criteria) this;
        }

        public Criteria andCateIdEqualTo(Integer value) {
            addCriterion("cate_id =", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdNotEqualTo(Integer value) {
            addCriterion("cate_id <>", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdGreaterThan(Integer value) {
            addCriterion("cate_id >", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cate_id >=", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdLessThan(Integer value) {
            addCriterion("cate_id <", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdLessThanOrEqualTo(Integer value) {
            addCriterion("cate_id <=", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdIn(List<Integer> values) {
            addCriterion("cate_id in", values, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdNotIn(List<Integer> values) {
            addCriterion("cate_id not in", values, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdBetween(Integer value1, Integer value2) {
            addCriterion("cate_id between", value1, value2, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cate_id not between", value1, value2, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateNameIsNull() {
            addCriterion("cate_name is null");
            return (Criteria) this;
        }

        public Criteria andCateNameIsNotNull() {
            addCriterion("cate_name is not null");
            return (Criteria) this;
        }

        public Criteria andCateNameEqualTo(String value) {
            addCriterion("cate_name =", value, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameNotEqualTo(String value) {
            addCriterion("cate_name <>", value, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameGreaterThan(String value) {
            addCriterion("cate_name >", value, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameGreaterThanOrEqualTo(String value) {
            addCriterion("cate_name >=", value, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameLessThan(String value) {
            addCriterion("cate_name <", value, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameLessThanOrEqualTo(String value) {
            addCriterion("cate_name <=", value, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameLike(String value) {
            addCriterion("cate_name like", value, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameNotLike(String value) {
            addCriterion("cate_name not like", value, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameIn(List<String> values) {
            addCriterion("cate_name in", values, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameNotIn(List<String> values) {
            addCriterion("cate_name not in", values, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameBetween(String value1, String value2) {
            addCriterion("cate_name between", value1, value2, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameNotBetween(String value1, String value2) {
            addCriterion("cate_name not between", value1, value2, "cateName");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNull() {
            addCriterion("type_name is null");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNotNull() {
            addCriterion("type_name is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNameEqualTo(String value) {
            addCriterion("type_name =", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotEqualTo(String value) {
            addCriterion("type_name <>", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThan(String value) {
            addCriterion("type_name >", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("type_name >=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThan(String value) {
            addCriterion("type_name <", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThanOrEqualTo(String value) {
            addCriterion("type_name <=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLike(String value) {
            addCriterion("type_name like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotLike(String value) {
            addCriterion("type_name not like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameIn(List<String> values) {
            addCriterion("type_name in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotIn(List<String> values) {
            addCriterion("type_name not in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameBetween(String value1, String value2) {
            addCriterion("type_name between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotBetween(String value1, String value2) {
            addCriterion("type_name not between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andCateParentIdIsNull() {
            addCriterion("cate_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andCateParentIdIsNotNull() {
            addCriterion("cate_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andCateParentIdEqualTo(Integer value) {
            addCriterion("cate_parent_id =", value, "cateParentId");
            return (Criteria) this;
        }

        public Criteria andCateParentIdNotEqualTo(Integer value) {
            addCriterion("cate_parent_id <>", value, "cateParentId");
            return (Criteria) this;
        }

        public Criteria andCateParentIdGreaterThan(Integer value) {
            addCriterion("cate_parent_id >", value, "cateParentId");
            return (Criteria) this;
        }

        public Criteria andCateParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cate_parent_id >=", value, "cateParentId");
            return (Criteria) this;
        }

        public Criteria andCateParentIdLessThan(Integer value) {
            addCriterion("cate_parent_id <", value, "cateParentId");
            return (Criteria) this;
        }

        public Criteria andCateParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("cate_parent_id <=", value, "cateParentId");
            return (Criteria) this;
        }

        public Criteria andCateParentIdIn(List<Integer> values) {
            addCriterion("cate_parent_id in", values, "cateParentId");
            return (Criteria) this;
        }

        public Criteria andCateParentIdNotIn(List<Integer> values) {
            addCriterion("cate_parent_id not in", values, "cateParentId");
            return (Criteria) this;
        }

        public Criteria andCateParentIdBetween(Integer value1, Integer value2) {
            addCriterion("cate_parent_id between", value1, value2, "cateParentId");
            return (Criteria) this;
        }

        public Criteria andCateParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cate_parent_id not between", value1, value2, "cateParentId");
            return (Criteria) this;
        }

        public Criteria andBrokerageRateIsNull() {
            addCriterion("brokerage_rate is null");
            return (Criteria) this;
        }

        public Criteria andBrokerageRateIsNotNull() {
            addCriterion("brokerage_rate is not null");
            return (Criteria) this;
        }

        public Criteria andBrokerageRateEqualTo(Float value) {
            addCriterion("brokerage_rate =", value, "brokerageRate");
            return (Criteria) this;
        }

        public Criteria andBrokerageRateNotEqualTo(Float value) {
            addCriterion("brokerage_rate <>", value, "brokerageRate");
            return (Criteria) this;
        }

        public Criteria andBrokerageRateGreaterThan(Float value) {
            addCriterion("brokerage_rate >", value, "brokerageRate");
            return (Criteria) this;
        }

        public Criteria andBrokerageRateGreaterThanOrEqualTo(Float value) {
            addCriterion("brokerage_rate >=", value, "brokerageRate");
            return (Criteria) this;
        }

        public Criteria andBrokerageRateLessThan(Float value) {
            addCriterion("brokerage_rate <", value, "brokerageRate");
            return (Criteria) this;
        }

        public Criteria andBrokerageRateLessThanOrEqualTo(Float value) {
            addCriterion("brokerage_rate <=", value, "brokerageRate");
            return (Criteria) this;
        }

        public Criteria andBrokerageRateIn(List<Float> values) {
            addCriterion("brokerage_rate in", values, "brokerageRate");
            return (Criteria) this;
        }

        public Criteria andBrokerageRateNotIn(List<Float> values) {
            addCriterion("brokerage_rate not in", values, "brokerageRate");
            return (Criteria) this;
        }

        public Criteria andBrokerageRateBetween(Float value1, Float value2) {
            addCriterion("brokerage_rate between", value1, value2, "brokerageRate");
            return (Criteria) this;
        }

        public Criteria andBrokerageRateNotBetween(Float value1, Float value2) {
            addCriterion("brokerage_rate not between", value1, value2, "brokerageRate");
            return (Criteria) this;
        }

        public Criteria andCateSortIsNull() {
            addCriterion("cate_sort is null");
            return (Criteria) this;
        }

        public Criteria andCateSortIsNotNull() {
            addCriterion("cate_sort is not null");
            return (Criteria) this;
        }

        public Criteria andCateSortEqualTo(Boolean value) {
            addCriterion("cate_sort =", value, "cateSort");
            return (Criteria) this;
        }

        public Criteria andCateSortNotEqualTo(Boolean value) {
            addCriterion("cate_sort <>", value, "cateSort");
            return (Criteria) this;
        }

        public Criteria andCateSortGreaterThan(Boolean value) {
            addCriterion("cate_sort >", value, "cateSort");
            return (Criteria) this;
        }

        public Criteria andCateSortGreaterThanOrEqualTo(Boolean value) {
            addCriterion("cate_sort >=", value, "cateSort");
            return (Criteria) this;
        }

        public Criteria andCateSortLessThan(Boolean value) {
            addCriterion("cate_sort <", value, "cateSort");
            return (Criteria) this;
        }

        public Criteria andCateSortLessThanOrEqualTo(Boolean value) {
            addCriterion("cate_sort <=", value, "cateSort");
            return (Criteria) this;
        }

        public Criteria andCateSortIn(List<Boolean> values) {
            addCriterion("cate_sort in", values, "cateSort");
            return (Criteria) this;
        }

        public Criteria andCateSortNotIn(List<Boolean> values) {
            addCriterion("cate_sort not in", values, "cateSort");
            return (Criteria) this;
        }

        public Criteria andCateSortBetween(Boolean value1, Boolean value2) {
            addCriterion("cate_sort between", value1, value2, "cateSort");
            return (Criteria) this;
        }

        public Criteria andCateSortNotBetween(Boolean value1, Boolean value2) {
            addCriterion("cate_sort not between", value1, value2, "cateSort");
            return (Criteria) this;
        }

        public Criteria andCateVirtualIsNull() {
            addCriterion("cate_virtual is null");
            return (Criteria) this;
        }

        public Criteria andCateVirtualIsNotNull() {
            addCriterion("cate_virtual is not null");
            return (Criteria) this;
        }

        public Criteria andCateVirtualEqualTo(Byte value) {
            addCriterion("cate_virtual =", value, "cateVirtual");
            return (Criteria) this;
        }

        public Criteria andCateVirtualNotEqualTo(Byte value) {
            addCriterion("cate_virtual <>", value, "cateVirtual");
            return (Criteria) this;
        }

        public Criteria andCateVirtualGreaterThan(Byte value) {
            addCriterion("cate_virtual >", value, "cateVirtual");
            return (Criteria) this;
        }

        public Criteria andCateVirtualGreaterThanOrEqualTo(Byte value) {
            addCriterion("cate_virtual >=", value, "cateVirtual");
            return (Criteria) this;
        }

        public Criteria andCateVirtualLessThan(Byte value) {
            addCriterion("cate_virtual <", value, "cateVirtual");
            return (Criteria) this;
        }

        public Criteria andCateVirtualLessThanOrEqualTo(Byte value) {
            addCriterion("cate_virtual <=", value, "cateVirtual");
            return (Criteria) this;
        }

        public Criteria andCateVirtualIn(List<Byte> values) {
            addCriterion("cate_virtual in", values, "cateVirtual");
            return (Criteria) this;
        }

        public Criteria andCateVirtualNotIn(List<Byte> values) {
            addCriterion("cate_virtual not in", values, "cateVirtual");
            return (Criteria) this;
        }

        public Criteria andCateVirtualBetween(Byte value1, Byte value2) {
            addCriterion("cate_virtual between", value1, value2, "cateVirtual");
            return (Criteria) this;
        }

        public Criteria andCateVirtualNotBetween(Byte value1, Byte value2) {
            addCriterion("cate_virtual not between", value1, value2, "cateVirtual");
            return (Criteria) this;
        }

        public Criteria andCateTitleIsNull() {
            addCriterion("cate_title is null");
            return (Criteria) this;
        }

        public Criteria andCateTitleIsNotNull() {
            addCriterion("cate_title is not null");
            return (Criteria) this;
        }

        public Criteria andCateTitleEqualTo(String value) {
            addCriterion("cate_title =", value, "cateTitle");
            return (Criteria) this;
        }

        public Criteria andCateTitleNotEqualTo(String value) {
            addCriterion("cate_title <>", value, "cateTitle");
            return (Criteria) this;
        }

        public Criteria andCateTitleGreaterThan(String value) {
            addCriterion("cate_title >", value, "cateTitle");
            return (Criteria) this;
        }

        public Criteria andCateTitleGreaterThanOrEqualTo(String value) {
            addCriterion("cate_title >=", value, "cateTitle");
            return (Criteria) this;
        }

        public Criteria andCateTitleLessThan(String value) {
            addCriterion("cate_title <", value, "cateTitle");
            return (Criteria) this;
        }

        public Criteria andCateTitleLessThanOrEqualTo(String value) {
            addCriterion("cate_title <=", value, "cateTitle");
            return (Criteria) this;
        }

        public Criteria andCateTitleLike(String value) {
            addCriterion("cate_title like", value, "cateTitle");
            return (Criteria) this;
        }

        public Criteria andCateTitleNotLike(String value) {
            addCriterion("cate_title not like", value, "cateTitle");
            return (Criteria) this;
        }

        public Criteria andCateTitleIn(List<String> values) {
            addCriterion("cate_title in", values, "cateTitle");
            return (Criteria) this;
        }

        public Criteria andCateTitleNotIn(List<String> values) {
            addCriterion("cate_title not in", values, "cateTitle");
            return (Criteria) this;
        }

        public Criteria andCateTitleBetween(String value1, String value2) {
            addCriterion("cate_title between", value1, value2, "cateTitle");
            return (Criteria) this;
        }

        public Criteria andCateTitleNotBetween(String value1, String value2) {
            addCriterion("cate_title not between", value1, value2, "cateTitle");
            return (Criteria) this;
        }

        public Criteria andCateKeywordsIsNull() {
            addCriterion("cate_keywords is null");
            return (Criteria) this;
        }

        public Criteria andCateKeywordsIsNotNull() {
            addCriterion("cate_keywords is not null");
            return (Criteria) this;
        }

        public Criteria andCateKeywordsEqualTo(String value) {
            addCriterion("cate_keywords =", value, "cateKeywords");
            return (Criteria) this;
        }

        public Criteria andCateKeywordsNotEqualTo(String value) {
            addCriterion("cate_keywords <>", value, "cateKeywords");
            return (Criteria) this;
        }

        public Criteria andCateKeywordsGreaterThan(String value) {
            addCriterion("cate_keywords >", value, "cateKeywords");
            return (Criteria) this;
        }

        public Criteria andCateKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("cate_keywords >=", value, "cateKeywords");
            return (Criteria) this;
        }

        public Criteria andCateKeywordsLessThan(String value) {
            addCriterion("cate_keywords <", value, "cateKeywords");
            return (Criteria) this;
        }

        public Criteria andCateKeywordsLessThanOrEqualTo(String value) {
            addCriterion("cate_keywords <=", value, "cateKeywords");
            return (Criteria) this;
        }

        public Criteria andCateKeywordsLike(String value) {
            addCriterion("cate_keywords like", value, "cateKeywords");
            return (Criteria) this;
        }

        public Criteria andCateKeywordsNotLike(String value) {
            addCriterion("cate_keywords not like", value, "cateKeywords");
            return (Criteria) this;
        }

        public Criteria andCateKeywordsIn(List<String> values) {
            addCriterion("cate_keywords in", values, "cateKeywords");
            return (Criteria) this;
        }

        public Criteria andCateKeywordsNotIn(List<String> values) {
            addCriterion("cate_keywords not in", values, "cateKeywords");
            return (Criteria) this;
        }

        public Criteria andCateKeywordsBetween(String value1, String value2) {
            addCriterion("cate_keywords between", value1, value2, "cateKeywords");
            return (Criteria) this;
        }

        public Criteria andCateKeywordsNotBetween(String value1, String value2) {
            addCriterion("cate_keywords not between", value1, value2, "cateKeywords");
            return (Criteria) this;
        }

        public Criteria andCateDescriptionIsNull() {
            addCriterion("cate_description is null");
            return (Criteria) this;
        }

        public Criteria andCateDescriptionIsNotNull() {
            addCriterion("cate_description is not null");
            return (Criteria) this;
        }

        public Criteria andCateDescriptionEqualTo(String value) {
            addCriterion("cate_description =", value, "cateDescription");
            return (Criteria) this;
        }

        public Criteria andCateDescriptionNotEqualTo(String value) {
            addCriterion("cate_description <>", value, "cateDescription");
            return (Criteria) this;
        }

        public Criteria andCateDescriptionGreaterThan(String value) {
            addCriterion("cate_description >", value, "cateDescription");
            return (Criteria) this;
        }

        public Criteria andCateDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("cate_description >=", value, "cateDescription");
            return (Criteria) this;
        }

        public Criteria andCateDescriptionLessThan(String value) {
            addCriterion("cate_description <", value, "cateDescription");
            return (Criteria) this;
        }

        public Criteria andCateDescriptionLessThanOrEqualTo(String value) {
            addCriterion("cate_description <=", value, "cateDescription");
            return (Criteria) this;
        }

        public Criteria andCateDescriptionLike(String value) {
            addCriterion("cate_description like", value, "cateDescription");
            return (Criteria) this;
        }

        public Criteria andCateDescriptionNotLike(String value) {
            addCriterion("cate_description not like", value, "cateDescription");
            return (Criteria) this;
        }

        public Criteria andCateDescriptionIn(List<String> values) {
            addCriterion("cate_description in", values, "cateDescription");
            return (Criteria) this;
        }

        public Criteria andCateDescriptionNotIn(List<String> values) {
            addCriterion("cate_description not in", values, "cateDescription");
            return (Criteria) this;
        }

        public Criteria andCateDescriptionBetween(String value1, String value2) {
            addCriterion("cate_description between", value1, value2, "cateDescription");
            return (Criteria) this;
        }

        public Criteria andCateDescriptionNotBetween(String value1, String value2) {
            addCriterion("cate_description not between", value1, value2, "cateDescription");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 商品类别表
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