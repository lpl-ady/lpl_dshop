/*
 * DshopGoodsExample.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.bean.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DshopGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DshopGoodsExample() {
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
     * 商品公共内容表
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

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsDescIsNull() {
            addCriterion("goods_desc is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDescIsNotNull() {
            addCriterion("goods_desc is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDescEqualTo(String value) {
            addCriterion("goods_desc =", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescNotEqualTo(String value) {
            addCriterion("goods_desc <>", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescGreaterThan(String value) {
            addCriterion("goods_desc >", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescGreaterThanOrEqualTo(String value) {
            addCriterion("goods_desc >=", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescLessThan(String value) {
            addCriterion("goods_desc <", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescLessThanOrEqualTo(String value) {
            addCriterion("goods_desc <=", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescLike(String value) {
            addCriterion("goods_desc like", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescNotLike(String value) {
            addCriterion("goods_desc not like", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescIn(List<String> values) {
            addCriterion("goods_desc in", values, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescNotIn(List<String> values) {
            addCriterion("goods_desc not in", values, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescBetween(String value1, String value2) {
            addCriterion("goods_desc between", value1, value2, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescNotBetween(String value1, String value2) {
            addCriterion("goods_desc not between", value1, value2, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIsNull() {
            addCriterion("goods_image is null");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIsNotNull() {
            addCriterion("goods_image is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsImageEqualTo(String value) {
            addCriterion("goods_image =", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNotEqualTo(String value) {
            addCriterion("goods_image <>", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageGreaterThan(String value) {
            addCriterion("goods_image >", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageGreaterThanOrEqualTo(String value) {
            addCriterion("goods_image >=", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageLessThan(String value) {
            addCriterion("goods_image <", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageLessThanOrEqualTo(String value) {
            addCriterion("goods_image <=", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageLike(String value) {
            addCriterion("goods_image like", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNotLike(String value) {
            addCriterion("goods_image not like", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIn(List<String> values) {
            addCriterion("goods_image in", values, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNotIn(List<String> values) {
            addCriterion("goods_image not in", values, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageBetween(String value1, String value2) {
            addCriterion("goods_image between", value1, value2, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNotBetween(String value1, String value2) {
            addCriterion("goods_image not between", value1, value2, "goodsImage");
            return (Criteria) this;
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

        public Criteria andCateId1IsNull() {
            addCriterion("cate_id1 is null");
            return (Criteria) this;
        }

        public Criteria andCateId1IsNotNull() {
            addCriterion("cate_id1 is not null");
            return (Criteria) this;
        }

        public Criteria andCateId1EqualTo(Integer value) {
            addCriterion("cate_id1 =", value, "cateId1");
            return (Criteria) this;
        }

        public Criteria andCateId1NotEqualTo(Integer value) {
            addCriterion("cate_id1 <>", value, "cateId1");
            return (Criteria) this;
        }

        public Criteria andCateId1GreaterThan(Integer value) {
            addCriterion("cate_id1 >", value, "cateId1");
            return (Criteria) this;
        }

        public Criteria andCateId1GreaterThanOrEqualTo(Integer value) {
            addCriterion("cate_id1 >=", value, "cateId1");
            return (Criteria) this;
        }

        public Criteria andCateId1LessThan(Integer value) {
            addCriterion("cate_id1 <", value, "cateId1");
            return (Criteria) this;
        }

        public Criteria andCateId1LessThanOrEqualTo(Integer value) {
            addCriterion("cate_id1 <=", value, "cateId1");
            return (Criteria) this;
        }

        public Criteria andCateId1In(List<Integer> values) {
            addCriterion("cate_id1 in", values, "cateId1");
            return (Criteria) this;
        }

        public Criteria andCateId1NotIn(List<Integer> values) {
            addCriterion("cate_id1 not in", values, "cateId1");
            return (Criteria) this;
        }

        public Criteria andCateId1Between(Integer value1, Integer value2) {
            addCriterion("cate_id1 between", value1, value2, "cateId1");
            return (Criteria) this;
        }

        public Criteria andCateId1NotBetween(Integer value1, Integer value2) {
            addCriterion("cate_id1 not between", value1, value2, "cateId1");
            return (Criteria) this;
        }

        public Criteria andCateId2IsNull() {
            addCriterion("cate_id2 is null");
            return (Criteria) this;
        }

        public Criteria andCateId2IsNotNull() {
            addCriterion("cate_id2 is not null");
            return (Criteria) this;
        }

        public Criteria andCateId2EqualTo(Integer value) {
            addCriterion("cate_id2 =", value, "cateId2");
            return (Criteria) this;
        }

        public Criteria andCateId2NotEqualTo(Integer value) {
            addCriterion("cate_id2 <>", value, "cateId2");
            return (Criteria) this;
        }

        public Criteria andCateId2GreaterThan(Integer value) {
            addCriterion("cate_id2 >", value, "cateId2");
            return (Criteria) this;
        }

        public Criteria andCateId2GreaterThanOrEqualTo(Integer value) {
            addCriterion("cate_id2 >=", value, "cateId2");
            return (Criteria) this;
        }

        public Criteria andCateId2LessThan(Integer value) {
            addCriterion("cate_id2 <", value, "cateId2");
            return (Criteria) this;
        }

        public Criteria andCateId2LessThanOrEqualTo(Integer value) {
            addCriterion("cate_id2 <=", value, "cateId2");
            return (Criteria) this;
        }

        public Criteria andCateId2In(List<Integer> values) {
            addCriterion("cate_id2 in", values, "cateId2");
            return (Criteria) this;
        }

        public Criteria andCateId2NotIn(List<Integer> values) {
            addCriterion("cate_id2 not in", values, "cateId2");
            return (Criteria) this;
        }

        public Criteria andCateId2Between(Integer value1, Integer value2) {
            addCriterion("cate_id2 between", value1, value2, "cateId2");
            return (Criteria) this;
        }

        public Criteria andCateId2NotBetween(Integer value1, Integer value2) {
            addCriterion("cate_id2 not between", value1, value2, "cateId2");
            return (Criteria) this;
        }

        public Criteria andCateId3IsNull() {
            addCriterion("cate_id3 is null");
            return (Criteria) this;
        }

        public Criteria andCateId3IsNotNull() {
            addCriterion("cate_id3 is not null");
            return (Criteria) this;
        }

        public Criteria andCateId3EqualTo(Integer value) {
            addCriterion("cate_id3 =", value, "cateId3");
            return (Criteria) this;
        }

        public Criteria andCateId3NotEqualTo(Integer value) {
            addCriterion("cate_id3 <>", value, "cateId3");
            return (Criteria) this;
        }

        public Criteria andCateId3GreaterThan(Integer value) {
            addCriterion("cate_id3 >", value, "cateId3");
            return (Criteria) this;
        }

        public Criteria andCateId3GreaterThanOrEqualTo(Integer value) {
            addCriterion("cate_id3 >=", value, "cateId3");
            return (Criteria) this;
        }

        public Criteria andCateId3LessThan(Integer value) {
            addCriterion("cate_id3 <", value, "cateId3");
            return (Criteria) this;
        }

        public Criteria andCateId3LessThanOrEqualTo(Integer value) {
            addCriterion("cate_id3 <=", value, "cateId3");
            return (Criteria) this;
        }

        public Criteria andCateId3In(List<Integer> values) {
            addCriterion("cate_id3 in", values, "cateId3");
            return (Criteria) this;
        }

        public Criteria andCateId3NotIn(List<Integer> values) {
            addCriterion("cate_id3 not in", values, "cateId3");
            return (Criteria) this;
        }

        public Criteria andCateId3Between(Integer value1, Integer value2) {
            addCriterion("cate_id3 between", value1, value2, "cateId3");
            return (Criteria) this;
        }

        public Criteria andCateId3NotBetween(Integer value1, Integer value2) {
            addCriterion("cate_id3 not between", value1, value2, "cateId3");
            return (Criteria) this;
        }

        public Criteria andGcNameIsNull() {
            addCriterion("gc_name is null");
            return (Criteria) this;
        }

        public Criteria andGcNameIsNotNull() {
            addCriterion("gc_name is not null");
            return (Criteria) this;
        }

        public Criteria andGcNameEqualTo(String value) {
            addCriterion("gc_name =", value, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameNotEqualTo(String value) {
            addCriterion("gc_name <>", value, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameGreaterThan(String value) {
            addCriterion("gc_name >", value, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameGreaterThanOrEqualTo(String value) {
            addCriterion("gc_name >=", value, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameLessThan(String value) {
            addCriterion("gc_name <", value, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameLessThanOrEqualTo(String value) {
            addCriterion("gc_name <=", value, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameLike(String value) {
            addCriterion("gc_name like", value, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameNotLike(String value) {
            addCriterion("gc_name not like", value, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameIn(List<String> values) {
            addCriterion("gc_name in", values, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameNotIn(List<String> values) {
            addCriterion("gc_name not in", values, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameBetween(String value1, String value2) {
            addCriterion("gc_name between", value1, value2, "gcName");
            return (Criteria) this;
        }

        public Criteria andGcNameNotBetween(String value1, String value2) {
            addCriterion("gc_name not between", value1, value2, "gcName");
            return (Criteria) this;
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

        public Criteria andAttrNameIsNull() {
            addCriterion("attr_name is null");
            return (Criteria) this;
        }

        public Criteria andAttrNameIsNotNull() {
            addCriterion("attr_name is not null");
            return (Criteria) this;
        }

        public Criteria andAttrNameEqualTo(String value) {
            addCriterion("attr_name =", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameNotEqualTo(String value) {
            addCriterion("attr_name <>", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameGreaterThan(String value) {
            addCriterion("attr_name >", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameGreaterThanOrEqualTo(String value) {
            addCriterion("attr_name >=", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameLessThan(String value) {
            addCriterion("attr_name <", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameLessThanOrEqualTo(String value) {
            addCriterion("attr_name <=", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameLike(String value) {
            addCriterion("attr_name like", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameNotLike(String value) {
            addCriterion("attr_name not like", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameIn(List<String> values) {
            addCriterion("attr_name in", values, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameNotIn(List<String> values) {
            addCriterion("attr_name not in", values, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameBetween(String value1, String value2) {
            addCriterion("attr_name between", value1, value2, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameNotBetween(String value1, String value2) {
            addCriterion("attr_name not between", value1, value2, "attrName");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Integer value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Integer value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Integer value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Integer value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Integer value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Integer> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Integer> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Integer value1, Integer value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNull() {
            addCriterion("brand_name is null");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNotNull() {
            addCriterion("brand_name is not null");
            return (Criteria) this;
        }

        public Criteria andBrandNameEqualTo(String value) {
            addCriterion("brand_name =", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotEqualTo(String value) {
            addCriterion("brand_name <>", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThan(String value) {
            addCriterion("brand_name >", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("brand_name >=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThan(String value) {
            addCriterion("brand_name <", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThanOrEqualTo(String value) {
            addCriterion("brand_name <=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLike(String value) {
            addCriterion("brand_name like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotLike(String value) {
            addCriterion("brand_name not like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameIn(List<String> values) {
            addCriterion("brand_name in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotIn(List<String> values) {
            addCriterion("brand_name not in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameBetween(String value1, String value2) {
            addCriterion("brand_name between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotBetween(String value1, String value2) {
            addCriterion("brand_name not between", value1, value2, "brandName");
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

        public Criteria andGoodsStatusIsNull() {
            addCriterion("goods_status is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIsNotNull() {
            addCriterion("goods_status is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusEqualTo(Byte value) {
            addCriterion("goods_status =", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotEqualTo(Byte value) {
            addCriterion("goods_status <>", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusGreaterThan(Byte value) {
            addCriterion("goods_status >", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("goods_status >=", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusLessThan(Byte value) {
            addCriterion("goods_status <", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusLessThanOrEqualTo(Byte value) {
            addCriterion("goods_status <=", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIn(List<Byte> values) {
            addCriterion("goods_status in", values, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotIn(List<Byte> values) {
            addCriterion("goods_status not in", values, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusBetween(Byte value1, Byte value2) {
            addCriterion("goods_status between", value1, value2, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("goods_status not between", value1, value2, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStateremarkIsNull() {
            addCriterion("goods_stateremark is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStateremarkIsNotNull() {
            addCriterion("goods_stateremark is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStateremarkEqualTo(String value) {
            addCriterion("goods_stateremark =", value, "goodsStateremark");
            return (Criteria) this;
        }

        public Criteria andGoodsStateremarkNotEqualTo(String value) {
            addCriterion("goods_stateremark <>", value, "goodsStateremark");
            return (Criteria) this;
        }

        public Criteria andGoodsStateremarkGreaterThan(String value) {
            addCriterion("goods_stateremark >", value, "goodsStateremark");
            return (Criteria) this;
        }

        public Criteria andGoodsStateremarkGreaterThanOrEqualTo(String value) {
            addCriterion("goods_stateremark >=", value, "goodsStateremark");
            return (Criteria) this;
        }

        public Criteria andGoodsStateremarkLessThan(String value) {
            addCriterion("goods_stateremark <", value, "goodsStateremark");
            return (Criteria) this;
        }

        public Criteria andGoodsStateremarkLessThanOrEqualTo(String value) {
            addCriterion("goods_stateremark <=", value, "goodsStateremark");
            return (Criteria) this;
        }

        public Criteria andGoodsStateremarkLike(String value) {
            addCriterion("goods_stateremark like", value, "goodsStateremark");
            return (Criteria) this;
        }

        public Criteria andGoodsStateremarkNotLike(String value) {
            addCriterion("goods_stateremark not like", value, "goodsStateremark");
            return (Criteria) this;
        }

        public Criteria andGoodsStateremarkIn(List<String> values) {
            addCriterion("goods_stateremark in", values, "goodsStateremark");
            return (Criteria) this;
        }

        public Criteria andGoodsStateremarkNotIn(List<String> values) {
            addCriterion("goods_stateremark not in", values, "goodsStateremark");
            return (Criteria) this;
        }

        public Criteria andGoodsStateremarkBetween(String value1, String value2) {
            addCriterion("goods_stateremark between", value1, value2, "goodsStateremark");
            return (Criteria) this;
        }

        public Criteria andGoodsStateremarkNotBetween(String value1, String value2) {
            addCriterion("goods_stateremark not between", value1, value2, "goodsStateremark");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyIsNull() {
            addCriterion("goods_verify is null");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyIsNotNull() {
            addCriterion("goods_verify is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyEqualTo(Byte value) {
            addCriterion("goods_verify =", value, "goodsVerify");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyNotEqualTo(Byte value) {
            addCriterion("goods_verify <>", value, "goodsVerify");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyGreaterThan(Byte value) {
            addCriterion("goods_verify >", value, "goodsVerify");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyGreaterThanOrEqualTo(Byte value) {
            addCriterion("goods_verify >=", value, "goodsVerify");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyLessThan(Byte value) {
            addCriterion("goods_verify <", value, "goodsVerify");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyLessThanOrEqualTo(Byte value) {
            addCriterion("goods_verify <=", value, "goodsVerify");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyIn(List<Byte> values) {
            addCriterion("goods_verify in", values, "goodsVerify");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyNotIn(List<Byte> values) {
            addCriterion("goods_verify not in", values, "goodsVerify");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyBetween(Byte value1, Byte value2) {
            addCriterion("goods_verify between", value1, value2, "goodsVerify");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyNotBetween(Byte value1, Byte value2) {
            addCriterion("goods_verify not between", value1, value2, "goodsVerify");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyremarkIsNull() {
            addCriterion("goods_verifyremark is null");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyremarkIsNotNull() {
            addCriterion("goods_verifyremark is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyremarkEqualTo(String value) {
            addCriterion("goods_verifyremark =", value, "goodsVerifyremark");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyremarkNotEqualTo(String value) {
            addCriterion("goods_verifyremark <>", value, "goodsVerifyremark");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyremarkGreaterThan(String value) {
            addCriterion("goods_verifyremark >", value, "goodsVerifyremark");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyremarkGreaterThanOrEqualTo(String value) {
            addCriterion("goods_verifyremark >=", value, "goodsVerifyremark");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyremarkLessThan(String value) {
            addCriterion("goods_verifyremark <", value, "goodsVerifyremark");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyremarkLessThanOrEqualTo(String value) {
            addCriterion("goods_verifyremark <=", value, "goodsVerifyremark");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyremarkLike(String value) {
            addCriterion("goods_verifyremark like", value, "goodsVerifyremark");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyremarkNotLike(String value) {
            addCriterion("goods_verifyremark not like", value, "goodsVerifyremark");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyremarkIn(List<String> values) {
            addCriterion("goods_verifyremark in", values, "goodsVerifyremark");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyremarkNotIn(List<String> values) {
            addCriterion("goods_verifyremark not in", values, "goodsVerifyremark");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyremarkBetween(String value1, String value2) {
            addCriterion("goods_verifyremark between", value1, value2, "goodsVerifyremark");
            return (Criteria) this;
        }

        public Criteria andGoodsVerifyremarkNotBetween(String value1, String value2) {
            addCriterion("goods_verifyremark not between", value1, value2, "goodsVerifyremark");
            return (Criteria) this;
        }

        public Criteria andGoodsLockIsNull() {
            addCriterion("goods_lock is null");
            return (Criteria) this;
        }

        public Criteria andGoodsLockIsNotNull() {
            addCriterion("goods_lock is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsLockEqualTo(Byte value) {
            addCriterion("goods_lock =", value, "goodsLock");
            return (Criteria) this;
        }

        public Criteria andGoodsLockNotEqualTo(Byte value) {
            addCriterion("goods_lock <>", value, "goodsLock");
            return (Criteria) this;
        }

        public Criteria andGoodsLockGreaterThan(Byte value) {
            addCriterion("goods_lock >", value, "goodsLock");
            return (Criteria) this;
        }

        public Criteria andGoodsLockGreaterThanOrEqualTo(Byte value) {
            addCriterion("goods_lock >=", value, "goodsLock");
            return (Criteria) this;
        }

        public Criteria andGoodsLockLessThan(Byte value) {
            addCriterion("goods_lock <", value, "goodsLock");
            return (Criteria) this;
        }

        public Criteria andGoodsLockLessThanOrEqualTo(Byte value) {
            addCriterion("goods_lock <=", value, "goodsLock");
            return (Criteria) this;
        }

        public Criteria andGoodsLockIn(List<Byte> values) {
            addCriterion("goods_lock in", values, "goodsLock");
            return (Criteria) this;
        }

        public Criteria andGoodsLockNotIn(List<Byte> values) {
            addCriterion("goods_lock not in", values, "goodsLock");
            return (Criteria) this;
        }

        public Criteria andGoodsLockBetween(Byte value1, Byte value2) {
            addCriterion("goods_lock between", value1, value2, "goodsLock");
            return (Criteria) this;
        }

        public Criteria andGoodsLockNotBetween(Byte value1, Byte value2) {
            addCriterion("goods_lock not between", value1, value2, "goodsLock");
            return (Criteria) this;
        }

        public Criteria andGoodsPromotionPriceIsNull() {
            addCriterion("goods_promotion_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPromotionPriceIsNotNull() {
            addCriterion("goods_promotion_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPromotionPriceEqualTo(BigDecimal value) {
            addCriterion("goods_promotion_price =", value, "goodsPromotionPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPromotionPriceNotEqualTo(BigDecimal value) {
            addCriterion("goods_promotion_price <>", value, "goodsPromotionPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPromotionPriceGreaterThan(BigDecimal value) {
            addCriterion("goods_promotion_price >", value, "goodsPromotionPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPromotionPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_promotion_price >=", value, "goodsPromotionPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPromotionPriceLessThan(BigDecimal value) {
            addCriterion("goods_promotion_price <", value, "goodsPromotionPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPromotionPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_promotion_price <=", value, "goodsPromotionPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPromotionPriceIn(List<BigDecimal> values) {
            addCriterion("goods_promotion_price in", values, "goodsPromotionPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPromotionPriceNotIn(List<BigDecimal> values) {
            addCriterion("goods_promotion_price not in", values, "goodsPromotionPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPromotionPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_promotion_price between", value1, value2, "goodsPromotionPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPromotionPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_promotion_price not between", value1, value2, "goodsPromotionPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPromotionTypeIsNull() {
            addCriterion("goods_promotion_type is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPromotionTypeIsNotNull() {
            addCriterion("goods_promotion_type is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPromotionTypeEqualTo(Byte value) {
            addCriterion("goods_promotion_type =", value, "goodsPromotionType");
            return (Criteria) this;
        }

        public Criteria andGoodsPromotionTypeNotEqualTo(Byte value) {
            addCriterion("goods_promotion_type <>", value, "goodsPromotionType");
            return (Criteria) this;
        }

        public Criteria andGoodsPromotionTypeGreaterThan(Byte value) {
            addCriterion("goods_promotion_type >", value, "goodsPromotionType");
            return (Criteria) this;
        }

        public Criteria andGoodsPromotionTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("goods_promotion_type >=", value, "goodsPromotionType");
            return (Criteria) this;
        }

        public Criteria andGoodsPromotionTypeLessThan(Byte value) {
            addCriterion("goods_promotion_type <", value, "goodsPromotionType");
            return (Criteria) this;
        }

        public Criteria andGoodsPromotionTypeLessThanOrEqualTo(Byte value) {
            addCriterion("goods_promotion_type <=", value, "goodsPromotionType");
            return (Criteria) this;
        }

        public Criteria andGoodsPromotionTypeIn(List<Byte> values) {
            addCriterion("goods_promotion_type in", values, "goodsPromotionType");
            return (Criteria) this;
        }

        public Criteria andGoodsPromotionTypeNotIn(List<Byte> values) {
            addCriterion("goods_promotion_type not in", values, "goodsPromotionType");
            return (Criteria) this;
        }

        public Criteria andGoodsPromotionTypeBetween(Byte value1, Byte value2) {
            addCriterion("goods_promotion_type between", value1, value2, "goodsPromotionType");
            return (Criteria) this;
        }

        public Criteria andGoodsPromotionTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("goods_promotion_type not between", value1, value2, "goodsPromotionType");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNull() {
            addCriterion("goods_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNotNull() {
            addCriterion("goods_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceEqualTo(BigDecimal value) {
            addCriterion("goods_price =", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotEqualTo(BigDecimal value) {
            addCriterion("goods_price <>", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThan(BigDecimal value) {
            addCriterion("goods_price >", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price >=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThan(BigDecimal value) {
            addCriterion("goods_price <", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price <=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIn(List<BigDecimal> values) {
            addCriterion("goods_price in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotIn(List<BigDecimal> values) {
            addCriterion("goods_price not in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price not between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketPriceIsNull() {
            addCriterion("goods_market_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketPriceIsNotNull() {
            addCriterion("goods_market_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketPriceEqualTo(BigDecimal value) {
            addCriterion("goods_market_price =", value, "goodsMarketPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketPriceNotEqualTo(BigDecimal value) {
            addCriterion("goods_market_price <>", value, "goodsMarketPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketPriceGreaterThan(BigDecimal value) {
            addCriterion("goods_market_price >", value, "goodsMarketPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_market_price >=", value, "goodsMarketPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketPriceLessThan(BigDecimal value) {
            addCriterion("goods_market_price <", value, "goodsMarketPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_market_price <=", value, "goodsMarketPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketPriceIn(List<BigDecimal> values) {
            addCriterion("goods_market_price in", values, "goodsMarketPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketPriceNotIn(List<BigDecimal> values) {
            addCriterion("goods_market_price not in", values, "goodsMarketPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_market_price between", value1, value2, "goodsMarketPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsMarketPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_market_price not between", value1, value2, "goodsMarketPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsCostPriceIsNull() {
            addCriterion("goods_cost_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCostPriceIsNotNull() {
            addCriterion("goods_cost_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCostPriceEqualTo(BigDecimal value) {
            addCriterion("goods_cost_price =", value, "goodsCostPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsCostPriceNotEqualTo(BigDecimal value) {
            addCriterion("goods_cost_price <>", value, "goodsCostPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsCostPriceGreaterThan(BigDecimal value) {
            addCriterion("goods_cost_price >", value, "goodsCostPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsCostPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_cost_price >=", value, "goodsCostPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsCostPriceLessThan(BigDecimal value) {
            addCriterion("goods_cost_price <", value, "goodsCostPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsCostPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_cost_price <=", value, "goodsCostPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsCostPriceIn(List<BigDecimal> values) {
            addCriterion("goods_cost_price in", values, "goodsCostPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsCostPriceNotIn(List<BigDecimal> values) {
            addCriterion("goods_cost_price not in", values, "goodsCostPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsCostPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_cost_price between", value1, value2, "goodsCostPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsCostPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_cost_price not between", value1, value2, "goodsCostPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountIsNull() {
            addCriterion("goods_discount is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountIsNotNull() {
            addCriterion("goods_discount is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountEqualTo(Float value) {
            addCriterion("goods_discount =", value, "goodsDiscount");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountNotEqualTo(Float value) {
            addCriterion("goods_discount <>", value, "goodsDiscount");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountGreaterThan(Float value) {
            addCriterion("goods_discount >", value, "goodsDiscount");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountGreaterThanOrEqualTo(Float value) {
            addCriterion("goods_discount >=", value, "goodsDiscount");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountLessThan(Float value) {
            addCriterion("goods_discount <", value, "goodsDiscount");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountLessThanOrEqualTo(Float value) {
            addCriterion("goods_discount <=", value, "goodsDiscount");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountIn(List<Float> values) {
            addCriterion("goods_discount in", values, "goodsDiscount");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountNotIn(List<Float> values) {
            addCriterion("goods_discount not in", values, "goodsDiscount");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountBetween(Float value1, Float value2) {
            addCriterion("goods_discount between", value1, value2, "goodsDiscount");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountNotBetween(Float value1, Float value2) {
            addCriterion("goods_discount not between", value1, value2, "goodsDiscount");
            return (Criteria) this;
        }

        public Criteria andGoodsSerialIsNull() {
            addCriterion("goods_serial is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSerialIsNotNull() {
            addCriterion("goods_serial is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSerialEqualTo(String value) {
            addCriterion("goods_serial =", value, "goodsSerial");
            return (Criteria) this;
        }

        public Criteria andGoodsSerialNotEqualTo(String value) {
            addCriterion("goods_serial <>", value, "goodsSerial");
            return (Criteria) this;
        }

        public Criteria andGoodsSerialGreaterThan(String value) {
            addCriterion("goods_serial >", value, "goodsSerial");
            return (Criteria) this;
        }

        public Criteria andGoodsSerialGreaterThanOrEqualTo(String value) {
            addCriterion("goods_serial >=", value, "goodsSerial");
            return (Criteria) this;
        }

        public Criteria andGoodsSerialLessThan(String value) {
            addCriterion("goods_serial <", value, "goodsSerial");
            return (Criteria) this;
        }

        public Criteria andGoodsSerialLessThanOrEqualTo(String value) {
            addCriterion("goods_serial <=", value, "goodsSerial");
            return (Criteria) this;
        }

        public Criteria andGoodsSerialLike(String value) {
            addCriterion("goods_serial like", value, "goodsSerial");
            return (Criteria) this;
        }

        public Criteria andGoodsSerialNotLike(String value) {
            addCriterion("goods_serial not like", value, "goodsSerial");
            return (Criteria) this;
        }

        public Criteria andGoodsSerialIn(List<String> values) {
            addCriterion("goods_serial in", values, "goodsSerial");
            return (Criteria) this;
        }

        public Criteria andGoodsSerialNotIn(List<String> values) {
            addCriterion("goods_serial not in", values, "goodsSerial");
            return (Criteria) this;
        }

        public Criteria andGoodsSerialBetween(String value1, String value2) {
            addCriterion("goods_serial between", value1, value2, "goodsSerial");
            return (Criteria) this;
        }

        public Criteria andGoodsSerialNotBetween(String value1, String value2) {
            addCriterion("goods_serial not between", value1, value2, "goodsSerial");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageAlarmIsNull() {
            addCriterion("goods_storage_alarm is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageAlarmIsNotNull() {
            addCriterion("goods_storage_alarm is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageAlarmEqualTo(Byte value) {
            addCriterion("goods_storage_alarm =", value, "goodsStorageAlarm");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageAlarmNotEqualTo(Byte value) {
            addCriterion("goods_storage_alarm <>", value, "goodsStorageAlarm");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageAlarmGreaterThan(Byte value) {
            addCriterion("goods_storage_alarm >", value, "goodsStorageAlarm");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageAlarmGreaterThanOrEqualTo(Byte value) {
            addCriterion("goods_storage_alarm >=", value, "goodsStorageAlarm");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageAlarmLessThan(Byte value) {
            addCriterion("goods_storage_alarm <", value, "goodsStorageAlarm");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageAlarmLessThanOrEqualTo(Byte value) {
            addCriterion("goods_storage_alarm <=", value, "goodsStorageAlarm");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageAlarmIn(List<Byte> values) {
            addCriterion("goods_storage_alarm in", values, "goodsStorageAlarm");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageAlarmNotIn(List<Byte> values) {
            addCriterion("goods_storage_alarm not in", values, "goodsStorageAlarm");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageAlarmBetween(Byte value1, Byte value2) {
            addCriterion("goods_storage_alarm between", value1, value2, "goodsStorageAlarm");
            return (Criteria) this;
        }

        public Criteria andGoodsStorageAlarmNotBetween(Byte value1, Byte value2) {
            addCriterion("goods_storage_alarm not between", value1, value2, "goodsStorageAlarm");
            return (Criteria) this;
        }

        public Criteria andGoodsBarcodeIsNull() {
            addCriterion("goods_barcode is null");
            return (Criteria) this;
        }

        public Criteria andGoodsBarcodeIsNotNull() {
            addCriterion("goods_barcode is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsBarcodeEqualTo(String value) {
            addCriterion("goods_barcode =", value, "goodsBarcode");
            return (Criteria) this;
        }

        public Criteria andGoodsBarcodeNotEqualTo(String value) {
            addCriterion("goods_barcode <>", value, "goodsBarcode");
            return (Criteria) this;
        }

        public Criteria andGoodsBarcodeGreaterThan(String value) {
            addCriterion("goods_barcode >", value, "goodsBarcode");
            return (Criteria) this;
        }

        public Criteria andGoodsBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_barcode >=", value, "goodsBarcode");
            return (Criteria) this;
        }

        public Criteria andGoodsBarcodeLessThan(String value) {
            addCriterion("goods_barcode <", value, "goodsBarcode");
            return (Criteria) this;
        }

        public Criteria andGoodsBarcodeLessThanOrEqualTo(String value) {
            addCriterion("goods_barcode <=", value, "goodsBarcode");
            return (Criteria) this;
        }

        public Criteria andGoodsBarcodeLike(String value) {
            addCriterion("goods_barcode like", value, "goodsBarcode");
            return (Criteria) this;
        }

        public Criteria andGoodsBarcodeNotLike(String value) {
            addCriterion("goods_barcode not like", value, "goodsBarcode");
            return (Criteria) this;
        }

        public Criteria andGoodsBarcodeIn(List<String> values) {
            addCriterion("goods_barcode in", values, "goodsBarcode");
            return (Criteria) this;
        }

        public Criteria andGoodsBarcodeNotIn(List<String> values) {
            addCriterion("goods_barcode not in", values, "goodsBarcode");
            return (Criteria) this;
        }

        public Criteria andGoodsBarcodeBetween(String value1, String value2) {
            addCriterion("goods_barcode between", value1, value2, "goodsBarcode");
            return (Criteria) this;
        }

        public Criteria andGoodsBarcodeNotBetween(String value1, String value2) {
            addCriterion("goods_barcode not between", value1, value2, "goodsBarcode");
            return (Criteria) this;
        }

        public Criteria andTransportIdIsNull() {
            addCriterion("transport_id is null");
            return (Criteria) this;
        }

        public Criteria andTransportIdIsNotNull() {
            addCriterion("transport_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransportIdEqualTo(Integer value) {
            addCriterion("transport_id =", value, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdNotEqualTo(Integer value) {
            addCriterion("transport_id <>", value, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdGreaterThan(Integer value) {
            addCriterion("transport_id >", value, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("transport_id >=", value, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdLessThan(Integer value) {
            addCriterion("transport_id <", value, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdLessThanOrEqualTo(Integer value) {
            addCriterion("transport_id <=", value, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdIn(List<Integer> values) {
            addCriterion("transport_id in", values, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdNotIn(List<Integer> values) {
            addCriterion("transport_id not in", values, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdBetween(Integer value1, Integer value2) {
            addCriterion("transport_id between", value1, value2, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportIdNotBetween(Integer value1, Integer value2) {
            addCriterion("transport_id not between", value1, value2, "transportId");
            return (Criteria) this;
        }

        public Criteria andTransportTitleIsNull() {
            addCriterion("transport_title is null");
            return (Criteria) this;
        }

        public Criteria andTransportTitleIsNotNull() {
            addCriterion("transport_title is not null");
            return (Criteria) this;
        }

        public Criteria andTransportTitleEqualTo(String value) {
            addCriterion("transport_title =", value, "transportTitle");
            return (Criteria) this;
        }

        public Criteria andTransportTitleNotEqualTo(String value) {
            addCriterion("transport_title <>", value, "transportTitle");
            return (Criteria) this;
        }

        public Criteria andTransportTitleGreaterThan(String value) {
            addCriterion("transport_title >", value, "transportTitle");
            return (Criteria) this;
        }

        public Criteria andTransportTitleGreaterThanOrEqualTo(String value) {
            addCriterion("transport_title >=", value, "transportTitle");
            return (Criteria) this;
        }

        public Criteria andTransportTitleLessThan(String value) {
            addCriterion("transport_title <", value, "transportTitle");
            return (Criteria) this;
        }

        public Criteria andTransportTitleLessThanOrEqualTo(String value) {
            addCriterion("transport_title <=", value, "transportTitle");
            return (Criteria) this;
        }

        public Criteria andTransportTitleLike(String value) {
            addCriterion("transport_title like", value, "transportTitle");
            return (Criteria) this;
        }

        public Criteria andTransportTitleNotLike(String value) {
            addCriterion("transport_title not like", value, "transportTitle");
            return (Criteria) this;
        }

        public Criteria andTransportTitleIn(List<String> values) {
            addCriterion("transport_title in", values, "transportTitle");
            return (Criteria) this;
        }

        public Criteria andTransportTitleNotIn(List<String> values) {
            addCriterion("transport_title not in", values, "transportTitle");
            return (Criteria) this;
        }

        public Criteria andTransportTitleBetween(String value1, String value2) {
            addCriterion("transport_title between", value1, value2, "transportTitle");
            return (Criteria) this;
        }

        public Criteria andTransportTitleNotBetween(String value1, String value2) {
            addCriterion("transport_title not between", value1, value2, "transportTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsCommendIsNull() {
            addCriterion("goods_commend is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCommendIsNotNull() {
            addCriterion("goods_commend is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCommendEqualTo(Byte value) {
            addCriterion("goods_commend =", value, "goodsCommend");
            return (Criteria) this;
        }

        public Criteria andGoodsCommendNotEqualTo(Byte value) {
            addCriterion("goods_commend <>", value, "goodsCommend");
            return (Criteria) this;
        }

        public Criteria andGoodsCommendGreaterThan(Byte value) {
            addCriterion("goods_commend >", value, "goodsCommend");
            return (Criteria) this;
        }

        public Criteria andGoodsCommendGreaterThanOrEqualTo(Byte value) {
            addCriterion("goods_commend >=", value, "goodsCommend");
            return (Criteria) this;
        }

        public Criteria andGoodsCommendLessThan(Byte value) {
            addCriterion("goods_commend <", value, "goodsCommend");
            return (Criteria) this;
        }

        public Criteria andGoodsCommendLessThanOrEqualTo(Byte value) {
            addCriterion("goods_commend <=", value, "goodsCommend");
            return (Criteria) this;
        }

        public Criteria andGoodsCommendIn(List<Byte> values) {
            addCriterion("goods_commend in", values, "goodsCommend");
            return (Criteria) this;
        }

        public Criteria andGoodsCommendNotIn(List<Byte> values) {
            addCriterion("goods_commend not in", values, "goodsCommend");
            return (Criteria) this;
        }

        public Criteria andGoodsCommendBetween(Byte value1, Byte value2) {
            addCriterion("goods_commend between", value1, value2, "goodsCommend");
            return (Criteria) this;
        }

        public Criteria andGoodsCommendNotBetween(Byte value1, Byte value2) {
            addCriterion("goods_commend not between", value1, value2, "goodsCommend");
            return (Criteria) this;
        }

        public Criteria andGoodsFreightIsNull() {
            addCriterion("goods_freight is null");
            return (Criteria) this;
        }

        public Criteria andGoodsFreightIsNotNull() {
            addCriterion("goods_freight is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsFreightEqualTo(BigDecimal value) {
            addCriterion("goods_freight =", value, "goodsFreight");
            return (Criteria) this;
        }

        public Criteria andGoodsFreightNotEqualTo(BigDecimal value) {
            addCriterion("goods_freight <>", value, "goodsFreight");
            return (Criteria) this;
        }

        public Criteria andGoodsFreightGreaterThan(BigDecimal value) {
            addCriterion("goods_freight >", value, "goodsFreight");
            return (Criteria) this;
        }

        public Criteria andGoodsFreightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_freight >=", value, "goodsFreight");
            return (Criteria) this;
        }

        public Criteria andGoodsFreightLessThan(BigDecimal value) {
            addCriterion("goods_freight <", value, "goodsFreight");
            return (Criteria) this;
        }

        public Criteria andGoodsFreightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_freight <=", value, "goodsFreight");
            return (Criteria) this;
        }

        public Criteria andGoodsFreightIn(List<BigDecimal> values) {
            addCriterion("goods_freight in", values, "goodsFreight");
            return (Criteria) this;
        }

        public Criteria andGoodsFreightNotIn(List<BigDecimal> values) {
            addCriterion("goods_freight not in", values, "goodsFreight");
            return (Criteria) this;
        }

        public Criteria andGoodsFreightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_freight between", value1, value2, "goodsFreight");
            return (Criteria) this;
        }

        public Criteria andGoodsFreightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_freight not between", value1, value2, "goodsFreight");
            return (Criteria) this;
        }

        public Criteria andGoodsVatIsNull() {
            addCriterion("goods_vat is null");
            return (Criteria) this;
        }

        public Criteria andGoodsVatIsNotNull() {
            addCriterion("goods_vat is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsVatEqualTo(Byte value) {
            addCriterion("goods_vat =", value, "goodsVat");
            return (Criteria) this;
        }

        public Criteria andGoodsVatNotEqualTo(Byte value) {
            addCriterion("goods_vat <>", value, "goodsVat");
            return (Criteria) this;
        }

        public Criteria andGoodsVatGreaterThan(Byte value) {
            addCriterion("goods_vat >", value, "goodsVat");
            return (Criteria) this;
        }

        public Criteria andGoodsVatGreaterThanOrEqualTo(Byte value) {
            addCriterion("goods_vat >=", value, "goodsVat");
            return (Criteria) this;
        }

        public Criteria andGoodsVatLessThan(Byte value) {
            addCriterion("goods_vat <", value, "goodsVat");
            return (Criteria) this;
        }

        public Criteria andGoodsVatLessThanOrEqualTo(Byte value) {
            addCriterion("goods_vat <=", value, "goodsVat");
            return (Criteria) this;
        }

        public Criteria andGoodsVatIn(List<Byte> values) {
            addCriterion("goods_vat in", values, "goodsVat");
            return (Criteria) this;
        }

        public Criteria andGoodsVatNotIn(List<Byte> values) {
            addCriterion("goods_vat not in", values, "goodsVat");
            return (Criteria) this;
        }

        public Criteria andGoodsVatBetween(Byte value1, Byte value2) {
            addCriterion("goods_vat between", value1, value2, "goodsVat");
            return (Criteria) this;
        }

        public Criteria andGoodsVatNotBetween(Byte value1, Byte value2) {
            addCriterion("goods_vat not between", value1, value2, "goodsVat");
            return (Criteria) this;
        }

        public Criteria andAreaid1IsNull() {
            addCriterion("areaid1 is null");
            return (Criteria) this;
        }

        public Criteria andAreaid1IsNotNull() {
            addCriterion("areaid1 is not null");
            return (Criteria) this;
        }

        public Criteria andAreaid1EqualTo(Integer value) {
            addCriterion("areaid1 =", value, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1NotEqualTo(Integer value) {
            addCriterion("areaid1 <>", value, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1GreaterThan(Integer value) {
            addCriterion("areaid1 >", value, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1GreaterThanOrEqualTo(Integer value) {
            addCriterion("areaid1 >=", value, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1LessThan(Integer value) {
            addCriterion("areaid1 <", value, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1LessThanOrEqualTo(Integer value) {
            addCriterion("areaid1 <=", value, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1In(List<Integer> values) {
            addCriterion("areaid1 in", values, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1NotIn(List<Integer> values) {
            addCriterion("areaid1 not in", values, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1Between(Integer value1, Integer value2) {
            addCriterion("areaid1 between", value1, value2, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid1NotBetween(Integer value1, Integer value2) {
            addCriterion("areaid1 not between", value1, value2, "areaid1");
            return (Criteria) this;
        }

        public Criteria andAreaid2IsNull() {
            addCriterion("areaid2 is null");
            return (Criteria) this;
        }

        public Criteria andAreaid2IsNotNull() {
            addCriterion("areaid2 is not null");
            return (Criteria) this;
        }

        public Criteria andAreaid2EqualTo(Integer value) {
            addCriterion("areaid2 =", value, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2NotEqualTo(Integer value) {
            addCriterion("areaid2 <>", value, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2GreaterThan(Integer value) {
            addCriterion("areaid2 >", value, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2GreaterThanOrEqualTo(Integer value) {
            addCriterion("areaid2 >=", value, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2LessThan(Integer value) {
            addCriterion("areaid2 <", value, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2LessThanOrEqualTo(Integer value) {
            addCriterion("areaid2 <=", value, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2In(List<Integer> values) {
            addCriterion("areaid2 in", values, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2NotIn(List<Integer> values) {
            addCriterion("areaid2 not in", values, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2Between(Integer value1, Integer value2) {
            addCriterion("areaid2 between", value1, value2, "areaid2");
            return (Criteria) this;
        }

        public Criteria andAreaid2NotBetween(Integer value1, Integer value2) {
            addCriterion("areaid2 not between", value1, value2, "areaid2");
            return (Criteria) this;
        }

        public Criteria andGoodsStcidsIsNull() {
            addCriterion("goods_stcids is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStcidsIsNotNull() {
            addCriterion("goods_stcids is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStcidsEqualTo(String value) {
            addCriterion("goods_stcids =", value, "goodsStcids");
            return (Criteria) this;
        }

        public Criteria andGoodsStcidsNotEqualTo(String value) {
            addCriterion("goods_stcids <>", value, "goodsStcids");
            return (Criteria) this;
        }

        public Criteria andGoodsStcidsGreaterThan(String value) {
            addCriterion("goods_stcids >", value, "goodsStcids");
            return (Criteria) this;
        }

        public Criteria andGoodsStcidsGreaterThanOrEqualTo(String value) {
            addCriterion("goods_stcids >=", value, "goodsStcids");
            return (Criteria) this;
        }

        public Criteria andGoodsStcidsLessThan(String value) {
            addCriterion("goods_stcids <", value, "goodsStcids");
            return (Criteria) this;
        }

        public Criteria andGoodsStcidsLessThanOrEqualTo(String value) {
            addCriterion("goods_stcids <=", value, "goodsStcids");
            return (Criteria) this;
        }

        public Criteria andGoodsStcidsLike(String value) {
            addCriterion("goods_stcids like", value, "goodsStcids");
            return (Criteria) this;
        }

        public Criteria andGoodsStcidsNotLike(String value) {
            addCriterion("goods_stcids not like", value, "goodsStcids");
            return (Criteria) this;
        }

        public Criteria andGoodsStcidsIn(List<String> values) {
            addCriterion("goods_stcids in", values, "goodsStcids");
            return (Criteria) this;
        }

        public Criteria andGoodsStcidsNotIn(List<String> values) {
            addCriterion("goods_stcids not in", values, "goodsStcids");
            return (Criteria) this;
        }

        public Criteria andGoodsStcidsBetween(String value1, String value2) {
            addCriterion("goods_stcids between", value1, value2, "goodsStcids");
            return (Criteria) this;
        }

        public Criteria andGoodsStcidsNotBetween(String value1, String value2) {
            addCriterion("goods_stcids not between", value1, value2, "goodsStcids");
            return (Criteria) this;
        }

        public Criteria andPlateidTopIsNull() {
            addCriterion("plateid_top is null");
            return (Criteria) this;
        }

        public Criteria andPlateidTopIsNotNull() {
            addCriterion("plateid_top is not null");
            return (Criteria) this;
        }

        public Criteria andPlateidTopEqualTo(Integer value) {
            addCriterion("plateid_top =", value, "plateidTop");
            return (Criteria) this;
        }

        public Criteria andPlateidTopNotEqualTo(Integer value) {
            addCriterion("plateid_top <>", value, "plateidTop");
            return (Criteria) this;
        }

        public Criteria andPlateidTopGreaterThan(Integer value) {
            addCriterion("plateid_top >", value, "plateidTop");
            return (Criteria) this;
        }

        public Criteria andPlateidTopGreaterThanOrEqualTo(Integer value) {
            addCriterion("plateid_top >=", value, "plateidTop");
            return (Criteria) this;
        }

        public Criteria andPlateidTopLessThan(Integer value) {
            addCriterion("plateid_top <", value, "plateidTop");
            return (Criteria) this;
        }

        public Criteria andPlateidTopLessThanOrEqualTo(Integer value) {
            addCriterion("plateid_top <=", value, "plateidTop");
            return (Criteria) this;
        }

        public Criteria andPlateidTopIn(List<Integer> values) {
            addCriterion("plateid_top in", values, "plateidTop");
            return (Criteria) this;
        }

        public Criteria andPlateidTopNotIn(List<Integer> values) {
            addCriterion("plateid_top not in", values, "plateidTop");
            return (Criteria) this;
        }

        public Criteria andPlateidTopBetween(Integer value1, Integer value2) {
            addCriterion("plateid_top between", value1, value2, "plateidTop");
            return (Criteria) this;
        }

        public Criteria andPlateidTopNotBetween(Integer value1, Integer value2) {
            addCriterion("plateid_top not between", value1, value2, "plateidTop");
            return (Criteria) this;
        }

        public Criteria andPlateidBottomIsNull() {
            addCriterion("plateid_bottom is null");
            return (Criteria) this;
        }

        public Criteria andPlateidBottomIsNotNull() {
            addCriterion("plateid_bottom is not null");
            return (Criteria) this;
        }

        public Criteria andPlateidBottomEqualTo(Integer value) {
            addCriterion("plateid_bottom =", value, "plateidBottom");
            return (Criteria) this;
        }

        public Criteria andPlateidBottomNotEqualTo(Integer value) {
            addCriterion("plateid_bottom <>", value, "plateidBottom");
            return (Criteria) this;
        }

        public Criteria andPlateidBottomGreaterThan(Integer value) {
            addCriterion("plateid_bottom >", value, "plateidBottom");
            return (Criteria) this;
        }

        public Criteria andPlateidBottomGreaterThanOrEqualTo(Integer value) {
            addCriterion("plateid_bottom >=", value, "plateidBottom");
            return (Criteria) this;
        }

        public Criteria andPlateidBottomLessThan(Integer value) {
            addCriterion("plateid_bottom <", value, "plateidBottom");
            return (Criteria) this;
        }

        public Criteria andPlateidBottomLessThanOrEqualTo(Integer value) {
            addCriterion("plateid_bottom <=", value, "plateidBottom");
            return (Criteria) this;
        }

        public Criteria andPlateidBottomIn(List<Integer> values) {
            addCriterion("plateid_bottom in", values, "plateidBottom");
            return (Criteria) this;
        }

        public Criteria andPlateidBottomNotIn(List<Integer> values) {
            addCriterion("plateid_bottom not in", values, "plateidBottom");
            return (Criteria) this;
        }

        public Criteria andPlateidBottomBetween(Integer value1, Integer value2) {
            addCriterion("plateid_bottom between", value1, value2, "plateidBottom");
            return (Criteria) this;
        }

        public Criteria andPlateidBottomNotBetween(Integer value1, Integer value2) {
            addCriterion("plateid_bottom not between", value1, value2, "plateidBottom");
            return (Criteria) this;
        }

        public Criteria andIsVirtualIsNull() {
            addCriterion("is_virtual is null");
            return (Criteria) this;
        }

        public Criteria andIsVirtualIsNotNull() {
            addCriterion("is_virtual is not null");
            return (Criteria) this;
        }

        public Criteria andIsVirtualEqualTo(Byte value) {
            addCriterion("is_virtual =", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualNotEqualTo(Byte value) {
            addCriterion("is_virtual <>", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualGreaterThan(Byte value) {
            addCriterion("is_virtual >", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_virtual >=", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualLessThan(Byte value) {
            addCriterion("is_virtual <", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualLessThanOrEqualTo(Byte value) {
            addCriterion("is_virtual <=", value, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualIn(List<Byte> values) {
            addCriterion("is_virtual in", values, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualNotIn(List<Byte> values) {
            addCriterion("is_virtual not in", values, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualBetween(Byte value1, Byte value2) {
            addCriterion("is_virtual between", value1, value2, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andIsVirtualNotBetween(Byte value1, Byte value2) {
            addCriterion("is_virtual not between", value1, value2, "isVirtual");
            return (Criteria) this;
        }

        public Criteria andVirtualIndateIsNull() {
            addCriterion("virtual_indate is null");
            return (Criteria) this;
        }

        public Criteria andVirtualIndateIsNotNull() {
            addCriterion("virtual_indate is not null");
            return (Criteria) this;
        }

        public Criteria andVirtualIndateEqualTo(Date value) {
            addCriterion("virtual_indate =", value, "virtualIndate");
            return (Criteria) this;
        }

        public Criteria andVirtualIndateNotEqualTo(Date value) {
            addCriterion("virtual_indate <>", value, "virtualIndate");
            return (Criteria) this;
        }

        public Criteria andVirtualIndateGreaterThan(Date value) {
            addCriterion("virtual_indate >", value, "virtualIndate");
            return (Criteria) this;
        }

        public Criteria andVirtualIndateGreaterThanOrEqualTo(Date value) {
            addCriterion("virtual_indate >=", value, "virtualIndate");
            return (Criteria) this;
        }

        public Criteria andVirtualIndateLessThan(Date value) {
            addCriterion("virtual_indate <", value, "virtualIndate");
            return (Criteria) this;
        }

        public Criteria andVirtualIndateLessThanOrEqualTo(Date value) {
            addCriterion("virtual_indate <=", value, "virtualIndate");
            return (Criteria) this;
        }

        public Criteria andVirtualIndateIn(List<Date> values) {
            addCriterion("virtual_indate in", values, "virtualIndate");
            return (Criteria) this;
        }

        public Criteria andVirtualIndateNotIn(List<Date> values) {
            addCriterion("virtual_indate not in", values, "virtualIndate");
            return (Criteria) this;
        }

        public Criteria andVirtualIndateBetween(Date value1, Date value2) {
            addCriterion("virtual_indate between", value1, value2, "virtualIndate");
            return (Criteria) this;
        }

        public Criteria andVirtualIndateNotBetween(Date value1, Date value2) {
            addCriterion("virtual_indate not between", value1, value2, "virtualIndate");
            return (Criteria) this;
        }

        public Criteria andVirtualLimitIsNull() {
            addCriterion("virtual_limit is null");
            return (Criteria) this;
        }

        public Criteria andVirtualLimitIsNotNull() {
            addCriterion("virtual_limit is not null");
            return (Criteria) this;
        }

        public Criteria andVirtualLimitEqualTo(Byte value) {
            addCriterion("virtual_limit =", value, "virtualLimit");
            return (Criteria) this;
        }

        public Criteria andVirtualLimitNotEqualTo(Byte value) {
            addCriterion("virtual_limit <>", value, "virtualLimit");
            return (Criteria) this;
        }

        public Criteria andVirtualLimitGreaterThan(Byte value) {
            addCriterion("virtual_limit >", value, "virtualLimit");
            return (Criteria) this;
        }

        public Criteria andVirtualLimitGreaterThanOrEqualTo(Byte value) {
            addCriterion("virtual_limit >=", value, "virtualLimit");
            return (Criteria) this;
        }

        public Criteria andVirtualLimitLessThan(Byte value) {
            addCriterion("virtual_limit <", value, "virtualLimit");
            return (Criteria) this;
        }

        public Criteria andVirtualLimitLessThanOrEqualTo(Byte value) {
            addCriterion("virtual_limit <=", value, "virtualLimit");
            return (Criteria) this;
        }

        public Criteria andVirtualLimitIn(List<Byte> values) {
            addCriterion("virtual_limit in", values, "virtualLimit");
            return (Criteria) this;
        }

        public Criteria andVirtualLimitNotIn(List<Byte> values) {
            addCriterion("virtual_limit not in", values, "virtualLimit");
            return (Criteria) this;
        }

        public Criteria andVirtualLimitBetween(Byte value1, Byte value2) {
            addCriterion("virtual_limit between", value1, value2, "virtualLimit");
            return (Criteria) this;
        }

        public Criteria andVirtualLimitNotBetween(Byte value1, Byte value2) {
            addCriterion("virtual_limit not between", value1, value2, "virtualLimit");
            return (Criteria) this;
        }

        public Criteria andVirtualInvalidRefundIsNull() {
            addCriterion("virtual_invalid_refund is null");
            return (Criteria) this;
        }

        public Criteria andVirtualInvalidRefundIsNotNull() {
            addCriterion("virtual_invalid_refund is not null");
            return (Criteria) this;
        }

        public Criteria andVirtualInvalidRefundEqualTo(Byte value) {
            addCriterion("virtual_invalid_refund =", value, "virtualInvalidRefund");
            return (Criteria) this;
        }

        public Criteria andVirtualInvalidRefundNotEqualTo(Byte value) {
            addCriterion("virtual_invalid_refund <>", value, "virtualInvalidRefund");
            return (Criteria) this;
        }

        public Criteria andVirtualInvalidRefundGreaterThan(Byte value) {
            addCriterion("virtual_invalid_refund >", value, "virtualInvalidRefund");
            return (Criteria) this;
        }

        public Criteria andVirtualInvalidRefundGreaterThanOrEqualTo(Byte value) {
            addCriterion("virtual_invalid_refund >=", value, "virtualInvalidRefund");
            return (Criteria) this;
        }

        public Criteria andVirtualInvalidRefundLessThan(Byte value) {
            addCriterion("virtual_invalid_refund <", value, "virtualInvalidRefund");
            return (Criteria) this;
        }

        public Criteria andVirtualInvalidRefundLessThanOrEqualTo(Byte value) {
            addCriterion("virtual_invalid_refund <=", value, "virtualInvalidRefund");
            return (Criteria) this;
        }

        public Criteria andVirtualInvalidRefundIn(List<Byte> values) {
            addCriterion("virtual_invalid_refund in", values, "virtualInvalidRefund");
            return (Criteria) this;
        }

        public Criteria andVirtualInvalidRefundNotIn(List<Byte> values) {
            addCriterion("virtual_invalid_refund not in", values, "virtualInvalidRefund");
            return (Criteria) this;
        }

        public Criteria andVirtualInvalidRefundBetween(Byte value1, Byte value2) {
            addCriterion("virtual_invalid_refund between", value1, value2, "virtualInvalidRefund");
            return (Criteria) this;
        }

        public Criteria andVirtualInvalidRefundNotBetween(Byte value1, Byte value2) {
            addCriterion("virtual_invalid_refund not between", value1, value2, "virtualInvalidRefund");
            return (Criteria) this;
        }

        public Criteria andIsAppointIsNull() {
            addCriterion("is_appoint is null");
            return (Criteria) this;
        }

        public Criteria andIsAppointIsNotNull() {
            addCriterion("is_appoint is not null");
            return (Criteria) this;
        }

        public Criteria andIsAppointEqualTo(Byte value) {
            addCriterion("is_appoint =", value, "isAppoint");
            return (Criteria) this;
        }

        public Criteria andIsAppointNotEqualTo(Byte value) {
            addCriterion("is_appoint <>", value, "isAppoint");
            return (Criteria) this;
        }

        public Criteria andIsAppointGreaterThan(Byte value) {
            addCriterion("is_appoint >", value, "isAppoint");
            return (Criteria) this;
        }

        public Criteria andIsAppointGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_appoint >=", value, "isAppoint");
            return (Criteria) this;
        }

        public Criteria andIsAppointLessThan(Byte value) {
            addCriterion("is_appoint <", value, "isAppoint");
            return (Criteria) this;
        }

        public Criteria andIsAppointLessThanOrEqualTo(Byte value) {
            addCriterion("is_appoint <=", value, "isAppoint");
            return (Criteria) this;
        }

        public Criteria andIsAppointIn(List<Byte> values) {
            addCriterion("is_appoint in", values, "isAppoint");
            return (Criteria) this;
        }

        public Criteria andIsAppointNotIn(List<Byte> values) {
            addCriterion("is_appoint not in", values, "isAppoint");
            return (Criteria) this;
        }

        public Criteria andIsAppointBetween(Byte value1, Byte value2) {
            addCriterion("is_appoint between", value1, value2, "isAppoint");
            return (Criteria) this;
        }

        public Criteria andIsAppointNotBetween(Byte value1, Byte value2) {
            addCriterion("is_appoint not between", value1, value2, "isAppoint");
            return (Criteria) this;
        }

        public Criteria andAppointSatedateIsNull() {
            addCriterion("appoint_satedate is null");
            return (Criteria) this;
        }

        public Criteria andAppointSatedateIsNotNull() {
            addCriterion("appoint_satedate is not null");
            return (Criteria) this;
        }

        public Criteria andAppointSatedateEqualTo(Date value) {
            addCriterion("appoint_satedate =", value, "appointSatedate");
            return (Criteria) this;
        }

        public Criteria andAppointSatedateNotEqualTo(Date value) {
            addCriterion("appoint_satedate <>", value, "appointSatedate");
            return (Criteria) this;
        }

        public Criteria andAppointSatedateGreaterThan(Date value) {
            addCriterion("appoint_satedate >", value, "appointSatedate");
            return (Criteria) this;
        }

        public Criteria andAppointSatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("appoint_satedate >=", value, "appointSatedate");
            return (Criteria) this;
        }

        public Criteria andAppointSatedateLessThan(Date value) {
            addCriterion("appoint_satedate <", value, "appointSatedate");
            return (Criteria) this;
        }

        public Criteria andAppointSatedateLessThanOrEqualTo(Date value) {
            addCriterion("appoint_satedate <=", value, "appointSatedate");
            return (Criteria) this;
        }

        public Criteria andAppointSatedateIn(List<Date> values) {
            addCriterion("appoint_satedate in", values, "appointSatedate");
            return (Criteria) this;
        }

        public Criteria andAppointSatedateNotIn(List<Date> values) {
            addCriterion("appoint_satedate not in", values, "appointSatedate");
            return (Criteria) this;
        }

        public Criteria andAppointSatedateBetween(Date value1, Date value2) {
            addCriterion("appoint_satedate between", value1, value2, "appointSatedate");
            return (Criteria) this;
        }

        public Criteria andAppointSatedateNotBetween(Date value1, Date value2) {
            addCriterion("appoint_satedate not between", value1, value2, "appointSatedate");
            return (Criteria) this;
        }

        public Criteria andSupIdIsNull() {
            addCriterion("sup_id is null");
            return (Criteria) this;
        }

        public Criteria andSupIdIsNotNull() {
            addCriterion("sup_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupIdEqualTo(Integer value) {
            addCriterion("sup_id =", value, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdNotEqualTo(Integer value) {
            addCriterion("sup_id <>", value, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdGreaterThan(Integer value) {
            addCriterion("sup_id >", value, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sup_id >=", value, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdLessThan(Integer value) {
            addCriterion("sup_id <", value, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdLessThanOrEqualTo(Integer value) {
            addCriterion("sup_id <=", value, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdIn(List<Integer> values) {
            addCriterion("sup_id in", values, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdNotIn(List<Integer> values) {
            addCriterion("sup_id not in", values, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdBetween(Integer value1, Integer value2) {
            addCriterion("sup_id between", value1, value2, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sup_id not between", value1, value2, "supId");
            return (Criteria) this;
        }

        public Criteria andIsFcodeIsNull() {
            addCriterion("is_fcode is null");
            return (Criteria) this;
        }

        public Criteria andIsFcodeIsNotNull() {
            addCriterion("is_fcode is not null");
            return (Criteria) this;
        }

        public Criteria andIsFcodeEqualTo(Byte value) {
            addCriterion("is_fcode =", value, "isFcode");
            return (Criteria) this;
        }

        public Criteria andIsFcodeNotEqualTo(Byte value) {
            addCriterion("is_fcode <>", value, "isFcode");
            return (Criteria) this;
        }

        public Criteria andIsFcodeGreaterThan(Byte value) {
            addCriterion("is_fcode >", value, "isFcode");
            return (Criteria) this;
        }

        public Criteria andIsFcodeGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_fcode >=", value, "isFcode");
            return (Criteria) this;
        }

        public Criteria andIsFcodeLessThan(Byte value) {
            addCriterion("is_fcode <", value, "isFcode");
            return (Criteria) this;
        }

        public Criteria andIsFcodeLessThanOrEqualTo(Byte value) {
            addCriterion("is_fcode <=", value, "isFcode");
            return (Criteria) this;
        }

        public Criteria andIsFcodeIn(List<Byte> values) {
            addCriterion("is_fcode in", values, "isFcode");
            return (Criteria) this;
        }

        public Criteria andIsFcodeNotIn(List<Byte> values) {
            addCriterion("is_fcode not in", values, "isFcode");
            return (Criteria) this;
        }

        public Criteria andIsFcodeBetween(Byte value1, Byte value2) {
            addCriterion("is_fcode between", value1, value2, "isFcode");
            return (Criteria) this;
        }

        public Criteria andIsFcodeNotBetween(Byte value1, Byte value2) {
            addCriterion("is_fcode not between", value1, value2, "isFcode");
            return (Criteria) this;
        }

        public Criteria andIsPreSellIsNull() {
            addCriterion("is_pre_sell is null");
            return (Criteria) this;
        }

        public Criteria andIsPreSellIsNotNull() {
            addCriterion("is_pre_sell is not null");
            return (Criteria) this;
        }

        public Criteria andIsPreSellEqualTo(Byte value) {
            addCriterion("is_pre_sell =", value, "isPreSell");
            return (Criteria) this;
        }

        public Criteria andIsPreSellNotEqualTo(Byte value) {
            addCriterion("is_pre_sell <>", value, "isPreSell");
            return (Criteria) this;
        }

        public Criteria andIsPreSellGreaterThan(Byte value) {
            addCriterion("is_pre_sell >", value, "isPreSell");
            return (Criteria) this;
        }

        public Criteria andIsPreSellGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_pre_sell >=", value, "isPreSell");
            return (Criteria) this;
        }

        public Criteria andIsPreSellLessThan(Byte value) {
            addCriterion("is_pre_sell <", value, "isPreSell");
            return (Criteria) this;
        }

        public Criteria andIsPreSellLessThanOrEqualTo(Byte value) {
            addCriterion("is_pre_sell <=", value, "isPreSell");
            return (Criteria) this;
        }

        public Criteria andIsPreSellIn(List<Byte> values) {
            addCriterion("is_pre_sell in", values, "isPreSell");
            return (Criteria) this;
        }

        public Criteria andIsPreSellNotIn(List<Byte> values) {
            addCriterion("is_pre_sell not in", values, "isPreSell");
            return (Criteria) this;
        }

        public Criteria andIsPreSellBetween(Byte value1, Byte value2) {
            addCriterion("is_pre_sell between", value1, value2, "isPreSell");
            return (Criteria) this;
        }

        public Criteria andIsPreSellNotBetween(Byte value1, Byte value2) {
            addCriterion("is_pre_sell not between", value1, value2, "isPreSell");
            return (Criteria) this;
        }

        public Criteria andPreSellShipdateIsNull() {
            addCriterion("pre_sell_shipdate is null");
            return (Criteria) this;
        }

        public Criteria andPreSellShipdateIsNotNull() {
            addCriterion("pre_sell_shipdate is not null");
            return (Criteria) this;
        }

        public Criteria andPreSellShipdateEqualTo(Date value) {
            addCriterion("pre_sell_shipdate =", value, "preSellShipdate");
            return (Criteria) this;
        }

        public Criteria andPreSellShipdateNotEqualTo(Date value) {
            addCriterion("pre_sell_shipdate <>", value, "preSellShipdate");
            return (Criteria) this;
        }

        public Criteria andPreSellShipdateGreaterThan(Date value) {
            addCriterion("pre_sell_shipdate >", value, "preSellShipdate");
            return (Criteria) this;
        }

        public Criteria andPreSellShipdateGreaterThanOrEqualTo(Date value) {
            addCriterion("pre_sell_shipdate >=", value, "preSellShipdate");
            return (Criteria) this;
        }

        public Criteria andPreSellShipdateLessThan(Date value) {
            addCriterion("pre_sell_shipdate <", value, "preSellShipdate");
            return (Criteria) this;
        }

        public Criteria andPreSellShipdateLessThanOrEqualTo(Date value) {
            addCriterion("pre_sell_shipdate <=", value, "preSellShipdate");
            return (Criteria) this;
        }

        public Criteria andPreSellShipdateIn(List<Date> values) {
            addCriterion("pre_sell_shipdate in", values, "preSellShipdate");
            return (Criteria) this;
        }

        public Criteria andPreSellShipdateNotIn(List<Date> values) {
            addCriterion("pre_sell_shipdate not in", values, "preSellShipdate");
            return (Criteria) this;
        }

        public Criteria andPreSellShipdateBetween(Date value1, Date value2) {
            addCriterion("pre_sell_shipdate between", value1, value2, "preSellShipdate");
            return (Criteria) this;
        }

        public Criteria andPreSellShipdateNotBetween(Date value1, Date value2) {
            addCriterion("pre_sell_shipdate not between", value1, value2, "preSellShipdate");
            return (Criteria) this;
        }

        public Criteria andIsBookIsNull() {
            addCriterion("is_book is null");
            return (Criteria) this;
        }

        public Criteria andIsBookIsNotNull() {
            addCriterion("is_book is not null");
            return (Criteria) this;
        }

        public Criteria andIsBookEqualTo(Byte value) {
            addCriterion("is_book =", value, "isBook");
            return (Criteria) this;
        }

        public Criteria andIsBookNotEqualTo(Byte value) {
            addCriterion("is_book <>", value, "isBook");
            return (Criteria) this;
        }

        public Criteria andIsBookGreaterThan(Byte value) {
            addCriterion("is_book >", value, "isBook");
            return (Criteria) this;
        }

        public Criteria andIsBookGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_book >=", value, "isBook");
            return (Criteria) this;
        }

        public Criteria andIsBookLessThan(Byte value) {
            addCriterion("is_book <", value, "isBook");
            return (Criteria) this;
        }

        public Criteria andIsBookLessThanOrEqualTo(Byte value) {
            addCriterion("is_book <=", value, "isBook");
            return (Criteria) this;
        }

        public Criteria andIsBookIn(List<Byte> values) {
            addCriterion("is_book in", values, "isBook");
            return (Criteria) this;
        }

        public Criteria andIsBookNotIn(List<Byte> values) {
            addCriterion("is_book not in", values, "isBook");
            return (Criteria) this;
        }

        public Criteria andIsBookBetween(Byte value1, Byte value2) {
            addCriterion("is_book between", value1, value2, "isBook");
            return (Criteria) this;
        }

        public Criteria andIsBookNotBetween(Byte value1, Byte value2) {
            addCriterion("is_book not between", value1, value2, "isBook");
            return (Criteria) this;
        }

        public Criteria andBookDownPaymentIsNull() {
            addCriterion("book_down_payment is null");
            return (Criteria) this;
        }

        public Criteria andBookDownPaymentIsNotNull() {
            addCriterion("book_down_payment is not null");
            return (Criteria) this;
        }

        public Criteria andBookDownPaymentEqualTo(BigDecimal value) {
            addCriterion("book_down_payment =", value, "bookDownPayment");
            return (Criteria) this;
        }

        public Criteria andBookDownPaymentNotEqualTo(BigDecimal value) {
            addCriterion("book_down_payment <>", value, "bookDownPayment");
            return (Criteria) this;
        }

        public Criteria andBookDownPaymentGreaterThan(BigDecimal value) {
            addCriterion("book_down_payment >", value, "bookDownPayment");
            return (Criteria) this;
        }

        public Criteria andBookDownPaymentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("book_down_payment >=", value, "bookDownPayment");
            return (Criteria) this;
        }

        public Criteria andBookDownPaymentLessThan(BigDecimal value) {
            addCriterion("book_down_payment <", value, "bookDownPayment");
            return (Criteria) this;
        }

        public Criteria andBookDownPaymentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("book_down_payment <=", value, "bookDownPayment");
            return (Criteria) this;
        }

        public Criteria andBookDownPaymentIn(List<BigDecimal> values) {
            addCriterion("book_down_payment in", values, "bookDownPayment");
            return (Criteria) this;
        }

        public Criteria andBookDownPaymentNotIn(List<BigDecimal> values) {
            addCriterion("book_down_payment not in", values, "bookDownPayment");
            return (Criteria) this;
        }

        public Criteria andBookDownPaymentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("book_down_payment between", value1, value2, "bookDownPayment");
            return (Criteria) this;
        }

        public Criteria andBookDownPaymentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("book_down_payment not between", value1, value2, "bookDownPayment");
            return (Criteria) this;
        }

        public Criteria andBookFinalPaymentIsNull() {
            addCriterion("book_final_payment is null");
            return (Criteria) this;
        }

        public Criteria andBookFinalPaymentIsNotNull() {
            addCriterion("book_final_payment is not null");
            return (Criteria) this;
        }

        public Criteria andBookFinalPaymentEqualTo(BigDecimal value) {
            addCriterion("book_final_payment =", value, "bookFinalPayment");
            return (Criteria) this;
        }

        public Criteria andBookFinalPaymentNotEqualTo(BigDecimal value) {
            addCriterion("book_final_payment <>", value, "bookFinalPayment");
            return (Criteria) this;
        }

        public Criteria andBookFinalPaymentGreaterThan(BigDecimal value) {
            addCriterion("book_final_payment >", value, "bookFinalPayment");
            return (Criteria) this;
        }

        public Criteria andBookFinalPaymentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("book_final_payment >=", value, "bookFinalPayment");
            return (Criteria) this;
        }

        public Criteria andBookFinalPaymentLessThan(BigDecimal value) {
            addCriterion("book_final_payment <", value, "bookFinalPayment");
            return (Criteria) this;
        }

        public Criteria andBookFinalPaymentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("book_final_payment <=", value, "bookFinalPayment");
            return (Criteria) this;
        }

        public Criteria andBookFinalPaymentIn(List<BigDecimal> values) {
            addCriterion("book_final_payment in", values, "bookFinalPayment");
            return (Criteria) this;
        }

        public Criteria andBookFinalPaymentNotIn(List<BigDecimal> values) {
            addCriterion("book_final_payment not in", values, "bookFinalPayment");
            return (Criteria) this;
        }

        public Criteria andBookFinalPaymentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("book_final_payment between", value1, value2, "bookFinalPayment");
            return (Criteria) this;
        }

        public Criteria andBookFinalPaymentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("book_final_payment not between", value1, value2, "bookFinalPayment");
            return (Criteria) this;
        }

        public Criteria andBookDownTimeIsNull() {
            addCriterion("book_down_time is null");
            return (Criteria) this;
        }

        public Criteria andBookDownTimeIsNotNull() {
            addCriterion("book_down_time is not null");
            return (Criteria) this;
        }

        public Criteria andBookDownTimeEqualTo(Date value) {
            addCriterion("book_down_time =", value, "bookDownTime");
            return (Criteria) this;
        }

        public Criteria andBookDownTimeNotEqualTo(Date value) {
            addCriterion("book_down_time <>", value, "bookDownTime");
            return (Criteria) this;
        }

        public Criteria andBookDownTimeGreaterThan(Date value) {
            addCriterion("book_down_time >", value, "bookDownTime");
            return (Criteria) this;
        }

        public Criteria andBookDownTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("book_down_time >=", value, "bookDownTime");
            return (Criteria) this;
        }

        public Criteria andBookDownTimeLessThan(Date value) {
            addCriterion("book_down_time <", value, "bookDownTime");
            return (Criteria) this;
        }

        public Criteria andBookDownTimeLessThanOrEqualTo(Date value) {
            addCriterion("book_down_time <=", value, "bookDownTime");
            return (Criteria) this;
        }

        public Criteria andBookDownTimeIn(List<Date> values) {
            addCriterion("book_down_time in", values, "bookDownTime");
            return (Criteria) this;
        }

        public Criteria andBookDownTimeNotIn(List<Date> values) {
            addCriterion("book_down_time not in", values, "bookDownTime");
            return (Criteria) this;
        }

        public Criteria andBookDownTimeBetween(Date value1, Date value2) {
            addCriterion("book_down_time between", value1, value2, "bookDownTime");
            return (Criteria) this;
        }

        public Criteria andBookDownTimeNotBetween(Date value1, Date value2) {
            addCriterion("book_down_time not between", value1, value2, "bookDownTime");
            return (Criteria) this;
        }

        public Criteria andBookBuyersIsNull() {
            addCriterion("book_buyers is null");
            return (Criteria) this;
        }

        public Criteria andBookBuyersIsNotNull() {
            addCriterion("book_buyers is not null");
            return (Criteria) this;
        }

        public Criteria andBookBuyersEqualTo(Integer value) {
            addCriterion("book_buyers =", value, "bookBuyers");
            return (Criteria) this;
        }

        public Criteria andBookBuyersNotEqualTo(Integer value) {
            addCriterion("book_buyers <>", value, "bookBuyers");
            return (Criteria) this;
        }

        public Criteria andBookBuyersGreaterThan(Integer value) {
            addCriterion("book_buyers >", value, "bookBuyers");
            return (Criteria) this;
        }

        public Criteria andBookBuyersGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_buyers >=", value, "bookBuyers");
            return (Criteria) this;
        }

        public Criteria andBookBuyersLessThan(Integer value) {
            addCriterion("book_buyers <", value, "bookBuyers");
            return (Criteria) this;
        }

        public Criteria andBookBuyersLessThanOrEqualTo(Integer value) {
            addCriterion("book_buyers <=", value, "bookBuyers");
            return (Criteria) this;
        }

        public Criteria andBookBuyersIn(List<Integer> values) {
            addCriterion("book_buyers in", values, "bookBuyers");
            return (Criteria) this;
        }

        public Criteria andBookBuyersNotIn(List<Integer> values) {
            addCriterion("book_buyers not in", values, "bookBuyers");
            return (Criteria) this;
        }

        public Criteria andBookBuyersBetween(Integer value1, Integer value2) {
            addCriterion("book_buyers between", value1, value2, "bookBuyers");
            return (Criteria) this;
        }

        public Criteria andBookBuyersNotBetween(Integer value1, Integer value2) {
            addCriterion("book_buyers not between", value1, value2, "bookBuyers");
            return (Criteria) this;
        }

        public Criteria andIsHaveGiftIsNull() {
            addCriterion("is_have_gift is null");
            return (Criteria) this;
        }

        public Criteria andIsHaveGiftIsNotNull() {
            addCriterion("is_have_gift is not null");
            return (Criteria) this;
        }

        public Criteria andIsHaveGiftEqualTo(Byte value) {
            addCriterion("is_have_gift =", value, "isHaveGift");
            return (Criteria) this;
        }

        public Criteria andIsHaveGiftNotEqualTo(Byte value) {
            addCriterion("is_have_gift <>", value, "isHaveGift");
            return (Criteria) this;
        }

        public Criteria andIsHaveGiftGreaterThan(Byte value) {
            addCriterion("is_have_gift >", value, "isHaveGift");
            return (Criteria) this;
        }

        public Criteria andIsHaveGiftGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_have_gift >=", value, "isHaveGift");
            return (Criteria) this;
        }

        public Criteria andIsHaveGiftLessThan(Byte value) {
            addCriterion("is_have_gift <", value, "isHaveGift");
            return (Criteria) this;
        }

        public Criteria andIsHaveGiftLessThanOrEqualTo(Byte value) {
            addCriterion("is_have_gift <=", value, "isHaveGift");
            return (Criteria) this;
        }

        public Criteria andIsHaveGiftIn(List<Byte> values) {
            addCriterion("is_have_gift in", values, "isHaveGift");
            return (Criteria) this;
        }

        public Criteria andIsHaveGiftNotIn(List<Byte> values) {
            addCriterion("is_have_gift not in", values, "isHaveGift");
            return (Criteria) this;
        }

        public Criteria andIsHaveGiftBetween(Byte value1, Byte value2) {
            addCriterion("is_have_gift between", value1, value2, "isHaveGift");
            return (Criteria) this;
        }

        public Criteria andIsHaveGiftNotBetween(Byte value1, Byte value2) {
            addCriterion("is_have_gift not between", value1, value2, "isHaveGift");
            return (Criteria) this;
        }

        public Criteria andCommentGoodStarIsNull() {
            addCriterion("comment_good_star is null");
            return (Criteria) this;
        }

        public Criteria andCommentGoodStarIsNotNull() {
            addCriterion("comment_good_star is not null");
            return (Criteria) this;
        }

        public Criteria andCommentGoodStarEqualTo(Byte value) {
            addCriterion("comment_good_star =", value, "commentGoodStar");
            return (Criteria) this;
        }

        public Criteria andCommentGoodStarNotEqualTo(Byte value) {
            addCriterion("comment_good_star <>", value, "commentGoodStar");
            return (Criteria) this;
        }

        public Criteria andCommentGoodStarGreaterThan(Byte value) {
            addCriterion("comment_good_star >", value, "commentGoodStar");
            return (Criteria) this;
        }

        public Criteria andCommentGoodStarGreaterThanOrEqualTo(Byte value) {
            addCriterion("comment_good_star >=", value, "commentGoodStar");
            return (Criteria) this;
        }

        public Criteria andCommentGoodStarLessThan(Byte value) {
            addCriterion("comment_good_star <", value, "commentGoodStar");
            return (Criteria) this;
        }

        public Criteria andCommentGoodStarLessThanOrEqualTo(Byte value) {
            addCriterion("comment_good_star <=", value, "commentGoodStar");
            return (Criteria) this;
        }

        public Criteria andCommentGoodStarIn(List<Byte> values) {
            addCriterion("comment_good_star in", values, "commentGoodStar");
            return (Criteria) this;
        }

        public Criteria andCommentGoodStarNotIn(List<Byte> values) {
            addCriterion("comment_good_star not in", values, "commentGoodStar");
            return (Criteria) this;
        }

        public Criteria andCommentGoodStarBetween(Byte value1, Byte value2) {
            addCriterion("comment_good_star between", value1, value2, "commentGoodStar");
            return (Criteria) this;
        }

        public Criteria andCommentGoodStarNotBetween(Byte value1, Byte value2) {
            addCriterion("comment_good_star not between", value1, value2, "commentGoodStar");
            return (Criteria) this;
        }

        public Criteria andCommentCountIsNull() {
            addCriterion("comment_count is null");
            return (Criteria) this;
        }

        public Criteria andCommentCountIsNotNull() {
            addCriterion("comment_count is not null");
            return (Criteria) this;
        }

        public Criteria andCommentCountEqualTo(Integer value) {
            addCriterion("comment_count =", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotEqualTo(Integer value) {
            addCriterion("comment_count <>", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountGreaterThan(Integer value) {
            addCriterion("comment_count >", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_count >=", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountLessThan(Integer value) {
            addCriterion("comment_count <", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountLessThanOrEqualTo(Integer value) {
            addCriterion("comment_count <=", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountIn(List<Integer> values) {
            addCriterion("comment_count in", values, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotIn(List<Integer> values) {
            addCriterion("comment_count not in", values, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountBetween(Integer value1, Integer value2) {
            addCriterion("comment_count between", value1, value2, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_count not between", value1, value2, "commentCount");
            return (Criteria) this;
        }

        public Criteria andGoodsClickCountIsNull() {
            addCriterion("goods_click_count is null");
            return (Criteria) this;
        }

        public Criteria andGoodsClickCountIsNotNull() {
            addCriterion("goods_click_count is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsClickCountEqualTo(Integer value) {
            addCriterion("goods_click_count =", value, "goodsClickCount");
            return (Criteria) this;
        }

        public Criteria andGoodsClickCountNotEqualTo(Integer value) {
            addCriterion("goods_click_count <>", value, "goodsClickCount");
            return (Criteria) this;
        }

        public Criteria andGoodsClickCountGreaterThan(Integer value) {
            addCriterion("goods_click_count >", value, "goodsClickCount");
            return (Criteria) this;
        }

        public Criteria andGoodsClickCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_click_count >=", value, "goodsClickCount");
            return (Criteria) this;
        }

        public Criteria andGoodsClickCountLessThan(Integer value) {
            addCriterion("goods_click_count <", value, "goodsClickCount");
            return (Criteria) this;
        }

        public Criteria andGoodsClickCountLessThanOrEqualTo(Integer value) {
            addCriterion("goods_click_count <=", value, "goodsClickCount");
            return (Criteria) this;
        }

        public Criteria andGoodsClickCountIn(List<Integer> values) {
            addCriterion("goods_click_count in", values, "goodsClickCount");
            return (Criteria) this;
        }

        public Criteria andGoodsClickCountNotIn(List<Integer> values) {
            addCriterion("goods_click_count not in", values, "goodsClickCount");
            return (Criteria) this;
        }

        public Criteria andGoodsClickCountBetween(Integer value1, Integer value2) {
            addCriterion("goods_click_count between", value1, value2, "goodsClickCount");
            return (Criteria) this;
        }

        public Criteria andGoodsClickCountNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_click_count not between", value1, value2, "goodsClickCount");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleCountIsNull() {
            addCriterion("goods_sale_count is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleCountIsNotNull() {
            addCriterion("goods_sale_count is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleCountEqualTo(Integer value) {
            addCriterion("goods_sale_count =", value, "goodsSaleCount");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleCountNotEqualTo(Integer value) {
            addCriterion("goods_sale_count <>", value, "goodsSaleCount");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleCountGreaterThan(Integer value) {
            addCriterion("goods_sale_count >", value, "goodsSaleCount");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_sale_count >=", value, "goodsSaleCount");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleCountLessThan(Integer value) {
            addCriterion("goods_sale_count <", value, "goodsSaleCount");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleCountLessThanOrEqualTo(Integer value) {
            addCriterion("goods_sale_count <=", value, "goodsSaleCount");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleCountIn(List<Integer> values) {
            addCriterion("goods_sale_count in", values, "goodsSaleCount");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleCountNotIn(List<Integer> values) {
            addCriterion("goods_sale_count not in", values, "goodsSaleCount");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleCountBetween(Integer value1, Integer value2) {
            addCriterion("goods_sale_count between", value1, value2, "goodsSaleCount");
            return (Criteria) this;
        }

        public Criteria andGoodsSaleCountNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_sale_count not between", value1, value2, "goodsSaleCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectCountIsNull() {
            addCriterion("goods_collect_count is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectCountIsNotNull() {
            addCriterion("goods_collect_count is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectCountEqualTo(Integer value) {
            addCriterion("goods_collect_count =", value, "goodsCollectCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectCountNotEqualTo(Integer value) {
            addCriterion("goods_collect_count <>", value, "goodsCollectCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectCountGreaterThan(Integer value) {
            addCriterion("goods_collect_count >", value, "goodsCollectCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_collect_count >=", value, "goodsCollectCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectCountLessThan(Integer value) {
            addCriterion("goods_collect_count <", value, "goodsCollectCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectCountLessThanOrEqualTo(Integer value) {
            addCriterion("goods_collect_count <=", value, "goodsCollectCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectCountIn(List<Integer> values) {
            addCriterion("goods_collect_count in", values, "goodsCollectCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectCountNotIn(List<Integer> values) {
            addCriterion("goods_collect_count not in", values, "goodsCollectCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectCountBetween(Integer value1, Integer value2) {
            addCriterion("goods_collect_count between", value1, value2, "goodsCollectCount");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectCountNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_collect_count not between", value1, value2, "goodsCollectCount");
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

        public Criteria andGoodsAddTimeIsNull() {
            addCriterion("goods_add_time is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAddTimeIsNotNull() {
            addCriterion("goods_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAddTimeEqualTo(Date value) {
            addCriterion("goods_add_time =", value, "goodsAddTime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddTimeNotEqualTo(Date value) {
            addCriterion("goods_add_time <>", value, "goodsAddTime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddTimeGreaterThan(Date value) {
            addCriterion("goods_add_time >", value, "goodsAddTime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("goods_add_time >=", value, "goodsAddTime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddTimeLessThan(Date value) {
            addCriterion("goods_add_time <", value, "goodsAddTime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("goods_add_time <=", value, "goodsAddTime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddTimeIn(List<Date> values) {
            addCriterion("goods_add_time in", values, "goodsAddTime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddTimeNotIn(List<Date> values) {
            addCriterion("goods_add_time not in", values, "goodsAddTime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddTimeBetween(Date value1, Date value2) {
            addCriterion("goods_add_time between", value1, value2, "goodsAddTime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("goods_add_time not between", value1, value2, "goodsAddTime");
            return (Criteria) this;
        }

        public Criteria andGoodsEditTimeIsNull() {
            addCriterion("goods_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andGoodsEditTimeIsNotNull() {
            addCriterion("goods_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsEditTimeEqualTo(Date value) {
            addCriterion("goods_edit_time =", value, "goodsEditTime");
            return (Criteria) this;
        }

        public Criteria andGoodsEditTimeNotEqualTo(Date value) {
            addCriterion("goods_edit_time <>", value, "goodsEditTime");
            return (Criteria) this;
        }

        public Criteria andGoodsEditTimeGreaterThan(Date value) {
            addCriterion("goods_edit_time >", value, "goodsEditTime");
            return (Criteria) this;
        }

        public Criteria andGoodsEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("goods_edit_time >=", value, "goodsEditTime");
            return (Criteria) this;
        }

        public Criteria andGoodsEditTimeLessThan(Date value) {
            addCriterion("goods_edit_time <", value, "goodsEditTime");
            return (Criteria) this;
        }

        public Criteria andGoodsEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("goods_edit_time <=", value, "goodsEditTime");
            return (Criteria) this;
        }

        public Criteria andGoodsEditTimeIn(List<Date> values) {
            addCriterion("goods_edit_time in", values, "goodsEditTime");
            return (Criteria) this;
        }

        public Criteria andGoodsEditTimeNotIn(List<Date> values) {
            addCriterion("goods_edit_time not in", values, "goodsEditTime");
            return (Criteria) this;
        }

        public Criteria andGoodsEditTimeBetween(Date value1, Date value2) {
            addCriterion("goods_edit_time between", value1, value2, "goodsEditTime");
            return (Criteria) this;
        }

        public Criteria andGoodsEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("goods_edit_time not between", value1, value2, "goodsEditTime");
            return (Criteria) this;
        }

        public Criteria andGoodsSellTimeIsNull() {
            addCriterion("goods_sell_time is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSellTimeIsNotNull() {
            addCriterion("goods_sell_time is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSellTimeEqualTo(Date value) {
            addCriterion("goods_sell_time =", value, "goodsSellTime");
            return (Criteria) this;
        }

        public Criteria andGoodsSellTimeNotEqualTo(Date value) {
            addCriterion("goods_sell_time <>", value, "goodsSellTime");
            return (Criteria) this;
        }

        public Criteria andGoodsSellTimeGreaterThan(Date value) {
            addCriterion("goods_sell_time >", value, "goodsSellTime");
            return (Criteria) this;
        }

        public Criteria andGoodsSellTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("goods_sell_time >=", value, "goodsSellTime");
            return (Criteria) this;
        }

        public Criteria andGoodsSellTimeLessThan(Date value) {
            addCriterion("goods_sell_time <", value, "goodsSellTime");
            return (Criteria) this;
        }

        public Criteria andGoodsSellTimeLessThanOrEqualTo(Date value) {
            addCriterion("goods_sell_time <=", value, "goodsSellTime");
            return (Criteria) this;
        }

        public Criteria andGoodsSellTimeIn(List<Date> values) {
            addCriterion("goods_sell_time in", values, "goodsSellTime");
            return (Criteria) this;
        }

        public Criteria andGoodsSellTimeNotIn(List<Date> values) {
            addCriterion("goods_sell_time not in", values, "goodsSellTime");
            return (Criteria) this;
        }

        public Criteria andGoodsSellTimeBetween(Date value1, Date value2) {
            addCriterion("goods_sell_time between", value1, value2, "goodsSellTime");
            return (Criteria) this;
        }

        public Criteria andGoodsSellTimeNotBetween(Date value1, Date value2) {
            addCriterion("goods_sell_time not between", value1, value2, "goodsSellTime");
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

        public Criteria andGoodsIntegralIsNull() {
            addCriterion("goods_integral is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIntegralIsNotNull() {
            addCriterion("goods_integral is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIntegralEqualTo(Integer value) {
            addCriterion("goods_integral =", value, "goodsIntegral");
            return (Criteria) this;
        }

        public Criteria andGoodsIntegralNotEqualTo(Integer value) {
            addCriterion("goods_integral <>", value, "goodsIntegral");
            return (Criteria) this;
        }

        public Criteria andGoodsIntegralGreaterThan(Integer value) {
            addCriterion("goods_integral >", value, "goodsIntegral");
            return (Criteria) this;
        }

        public Criteria andGoodsIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_integral >=", value, "goodsIntegral");
            return (Criteria) this;
        }

        public Criteria andGoodsIntegralLessThan(Integer value) {
            addCriterion("goods_integral <", value, "goodsIntegral");
            return (Criteria) this;
        }

        public Criteria andGoodsIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("goods_integral <=", value, "goodsIntegral");
            return (Criteria) this;
        }

        public Criteria andGoodsIntegralIn(List<Integer> values) {
            addCriterion("goods_integral in", values, "goodsIntegral");
            return (Criteria) this;
        }

        public Criteria andGoodsIntegralNotIn(List<Integer> values) {
            addCriterion("goods_integral not in", values, "goodsIntegral");
            return (Criteria) this;
        }

        public Criteria andGoodsIntegralBetween(Integer value1, Integer value2) {
            addCriterion("goods_integral between", value1, value2, "goodsIntegral");
            return (Criteria) this;
        }

        public Criteria andGoodsIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_integral not between", value1, value2, "goodsIntegral");
            return (Criteria) this;
        }

        public Criteria andIsTailorMadeIsNull() {
            addCriterion("is_tailor_made is null");
            return (Criteria) this;
        }

        public Criteria andIsTailorMadeIsNotNull() {
            addCriterion("is_tailor_made is not null");
            return (Criteria) this;
        }

        public Criteria andIsTailorMadeEqualTo(Integer value) {
            addCriterion("is_tailor_made =", value, "isTailorMade");
            return (Criteria) this;
        }

        public Criteria andIsTailorMadeNotEqualTo(Integer value) {
            addCriterion("is_tailor_made <>", value, "isTailorMade");
            return (Criteria) this;
        }

        public Criteria andIsTailorMadeGreaterThan(Integer value) {
            addCriterion("is_tailor_made >", value, "isTailorMade");
            return (Criteria) this;
        }

        public Criteria andIsTailorMadeGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_tailor_made >=", value, "isTailorMade");
            return (Criteria) this;
        }

        public Criteria andIsTailorMadeLessThan(Integer value) {
            addCriterion("is_tailor_made <", value, "isTailorMade");
            return (Criteria) this;
        }

        public Criteria andIsTailorMadeLessThanOrEqualTo(Integer value) {
            addCriterion("is_tailor_made <=", value, "isTailorMade");
            return (Criteria) this;
        }

        public Criteria andIsTailorMadeIn(List<Integer> values) {
            addCriterion("is_tailor_made in", values, "isTailorMade");
            return (Criteria) this;
        }

        public Criteria andIsTailorMadeNotIn(List<Integer> values) {
            addCriterion("is_tailor_made not in", values, "isTailorMade");
            return (Criteria) this;
        }

        public Criteria andIsTailorMadeBetween(Integer value1, Integer value2) {
            addCriterion("is_tailor_made between", value1, value2, "isTailorMade");
            return (Criteria) this;
        }

        public Criteria andIsTailorMadeNotBetween(Integer value1, Integer value2) {
            addCriterion("is_tailor_made not between", value1, value2, "isTailorMade");
            return (Criteria) this;
        }

        public Criteria andGoodsExt1IsNull() {
            addCriterion("goods_ext1 is null");
            return (Criteria) this;
        }

        public Criteria andGoodsExt1IsNotNull() {
            addCriterion("goods_ext1 is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsExt1EqualTo(String value) {
            addCriterion("goods_ext1 =", value, "goodsExt1");
            return (Criteria) this;
        }

        public Criteria andGoodsExt1NotEqualTo(String value) {
            addCriterion("goods_ext1 <>", value, "goodsExt1");
            return (Criteria) this;
        }

        public Criteria andGoodsExt1GreaterThan(String value) {
            addCriterion("goods_ext1 >", value, "goodsExt1");
            return (Criteria) this;
        }

        public Criteria andGoodsExt1GreaterThanOrEqualTo(String value) {
            addCriterion("goods_ext1 >=", value, "goodsExt1");
            return (Criteria) this;
        }

        public Criteria andGoodsExt1LessThan(String value) {
            addCriterion("goods_ext1 <", value, "goodsExt1");
            return (Criteria) this;
        }

        public Criteria andGoodsExt1LessThanOrEqualTo(String value) {
            addCriterion("goods_ext1 <=", value, "goodsExt1");
            return (Criteria) this;
        }

        public Criteria andGoodsExt1Like(String value) {
            addCriterion("goods_ext1 like", value, "goodsExt1");
            return (Criteria) this;
        }

        public Criteria andGoodsExt1NotLike(String value) {
            addCriterion("goods_ext1 not like", value, "goodsExt1");
            return (Criteria) this;
        }

        public Criteria andGoodsExt1In(List<String> values) {
            addCriterion("goods_ext1 in", values, "goodsExt1");
            return (Criteria) this;
        }

        public Criteria andGoodsExt1NotIn(List<String> values) {
            addCriterion("goods_ext1 not in", values, "goodsExt1");
            return (Criteria) this;
        }

        public Criteria andGoodsExt1Between(String value1, String value2) {
            addCriterion("goods_ext1 between", value1, value2, "goodsExt1");
            return (Criteria) this;
        }

        public Criteria andGoodsExt1NotBetween(String value1, String value2) {
            addCriterion("goods_ext1 not between", value1, value2, "goodsExt1");
            return (Criteria) this;
        }

        public Criteria andGoodsExt2IsNull() {
            addCriterion("goods_ext2 is null");
            return (Criteria) this;
        }

        public Criteria andGoodsExt2IsNotNull() {
            addCriterion("goods_ext2 is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsExt2EqualTo(String value) {
            addCriterion("goods_ext2 =", value, "goodsExt2");
            return (Criteria) this;
        }

        public Criteria andGoodsExt2NotEqualTo(String value) {
            addCriterion("goods_ext2 <>", value, "goodsExt2");
            return (Criteria) this;
        }

        public Criteria andGoodsExt2GreaterThan(String value) {
            addCriterion("goods_ext2 >", value, "goodsExt2");
            return (Criteria) this;
        }

        public Criteria andGoodsExt2GreaterThanOrEqualTo(String value) {
            addCriterion("goods_ext2 >=", value, "goodsExt2");
            return (Criteria) this;
        }

        public Criteria andGoodsExt2LessThan(String value) {
            addCriterion("goods_ext2 <", value, "goodsExt2");
            return (Criteria) this;
        }

        public Criteria andGoodsExt2LessThanOrEqualTo(String value) {
            addCriterion("goods_ext2 <=", value, "goodsExt2");
            return (Criteria) this;
        }

        public Criteria andGoodsExt2Like(String value) {
            addCriterion("goods_ext2 like", value, "goodsExt2");
            return (Criteria) this;
        }

        public Criteria andGoodsExt2NotLike(String value) {
            addCriterion("goods_ext2 not like", value, "goodsExt2");
            return (Criteria) this;
        }

        public Criteria andGoodsExt2In(List<String> values) {
            addCriterion("goods_ext2 in", values, "goodsExt2");
            return (Criteria) this;
        }

        public Criteria andGoodsExt2NotIn(List<String> values) {
            addCriterion("goods_ext2 not in", values, "goodsExt2");
            return (Criteria) this;
        }

        public Criteria andGoodsExt2Between(String value1, String value2) {
            addCriterion("goods_ext2 between", value1, value2, "goodsExt2");
            return (Criteria) this;
        }

        public Criteria andGoodsExt2NotBetween(String value1, String value2) {
            addCriterion("goods_ext2 not between", value1, value2, "goodsExt2");
            return (Criteria) this;
        }

        public Criteria andGoodsExt3IsNull() {
            addCriterion("goods_ext3 is null");
            return (Criteria) this;
        }

        public Criteria andGoodsExt3IsNotNull() {
            addCriterion("goods_ext3 is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsExt3EqualTo(String value) {
            addCriterion("goods_ext3 =", value, "goodsExt3");
            return (Criteria) this;
        }

        public Criteria andGoodsExt3NotEqualTo(String value) {
            addCriterion("goods_ext3 <>", value, "goodsExt3");
            return (Criteria) this;
        }

        public Criteria andGoodsExt3GreaterThan(String value) {
            addCriterion("goods_ext3 >", value, "goodsExt3");
            return (Criteria) this;
        }

        public Criteria andGoodsExt3GreaterThanOrEqualTo(String value) {
            addCriterion("goods_ext3 >=", value, "goodsExt3");
            return (Criteria) this;
        }

        public Criteria andGoodsExt3LessThan(String value) {
            addCriterion("goods_ext3 <", value, "goodsExt3");
            return (Criteria) this;
        }

        public Criteria andGoodsExt3LessThanOrEqualTo(String value) {
            addCriterion("goods_ext3 <=", value, "goodsExt3");
            return (Criteria) this;
        }

        public Criteria andGoodsExt3Like(String value) {
            addCriterion("goods_ext3 like", value, "goodsExt3");
            return (Criteria) this;
        }

        public Criteria andGoodsExt3NotLike(String value) {
            addCriterion("goods_ext3 not like", value, "goodsExt3");
            return (Criteria) this;
        }

        public Criteria andGoodsExt3In(List<String> values) {
            addCriterion("goods_ext3 in", values, "goodsExt3");
            return (Criteria) this;
        }

        public Criteria andGoodsExt3NotIn(List<String> values) {
            addCriterion("goods_ext3 not in", values, "goodsExt3");
            return (Criteria) this;
        }

        public Criteria andGoodsExt3Between(String value1, String value2) {
            addCriterion("goods_ext3 between", value1, value2, "goodsExt3");
            return (Criteria) this;
        }

        public Criteria andGoodsExt3NotBetween(String value1, String value2) {
            addCriterion("goods_ext3 not between", value1, value2, "goodsExt3");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 商品公共内容表
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