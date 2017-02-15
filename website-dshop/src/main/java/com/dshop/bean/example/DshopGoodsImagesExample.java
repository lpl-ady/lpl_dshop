/*
 * DshopGoodsImagesExample.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.bean.example;

import java.util.ArrayList;
import java.util.List;

public class DshopGoodsImagesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DshopGoodsImagesExample() {
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
     * 商品图片
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

        public Criteria andGoodsImageIdIsNull() {
            addCriterion("goods_image_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIdIsNotNull() {
            addCriterion("goods_image_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIdEqualTo(Integer value) {
            addCriterion("goods_image_id =", value, "goodsImageId");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIdNotEqualTo(Integer value) {
            addCriterion("goods_image_id <>", value, "goodsImageId");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIdGreaterThan(Integer value) {
            addCriterion("goods_image_id >", value, "goodsImageId");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_image_id >=", value, "goodsImageId");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIdLessThan(Integer value) {
            addCriterion("goods_image_id <", value, "goodsImageId");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_image_id <=", value, "goodsImageId");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIdIn(List<Integer> values) {
            addCriterion("goods_image_id in", values, "goodsImageId");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIdNotIn(List<Integer> values) {
            addCriterion("goods_image_id not in", values, "goodsImageId");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_image_id between", value1, value2, "goodsImageId");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_image_id not between", value1, value2, "goodsImageId");
            return (Criteria) this;
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

        public Criteria andGoodsAttrIdIsNull() {
            addCriterion("goods_attr_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrIdIsNotNull() {
            addCriterion("goods_attr_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrIdEqualTo(Integer value) {
            addCriterion("goods_attr_id =", value, "goodsAttrId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrIdNotEqualTo(Integer value) {
            addCriterion("goods_attr_id <>", value, "goodsAttrId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrIdGreaterThan(Integer value) {
            addCriterion("goods_attr_id >", value, "goodsAttrId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_attr_id >=", value, "goodsAttrId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrIdLessThan(Integer value) {
            addCriterion("goods_attr_id <", value, "goodsAttrId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_attr_id <=", value, "goodsAttrId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrIdIn(List<Integer> values) {
            addCriterion("goods_attr_id in", values, "goodsAttrId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrIdNotIn(List<Integer> values) {
            addCriterion("goods_attr_id not in", values, "goodsAttrId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_attr_id between", value1, value2, "goodsAttrId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_attr_id not between", value1, value2, "goodsAttrId");
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

        public Criteria andGoodsImageSortIsNull() {
            addCriterion("goods_image_sort is null");
            return (Criteria) this;
        }

        public Criteria andGoodsImageSortIsNotNull() {
            addCriterion("goods_image_sort is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsImageSortEqualTo(Byte value) {
            addCriterion("goods_image_sort =", value, "goodsImageSort");
            return (Criteria) this;
        }

        public Criteria andGoodsImageSortNotEqualTo(Byte value) {
            addCriterion("goods_image_sort <>", value, "goodsImageSort");
            return (Criteria) this;
        }

        public Criteria andGoodsImageSortGreaterThan(Byte value) {
            addCriterion("goods_image_sort >", value, "goodsImageSort");
            return (Criteria) this;
        }

        public Criteria andGoodsImageSortGreaterThanOrEqualTo(Byte value) {
            addCriterion("goods_image_sort >=", value, "goodsImageSort");
            return (Criteria) this;
        }

        public Criteria andGoodsImageSortLessThan(Byte value) {
            addCriterion("goods_image_sort <", value, "goodsImageSort");
            return (Criteria) this;
        }

        public Criteria andGoodsImageSortLessThanOrEqualTo(Byte value) {
            addCriterion("goods_image_sort <=", value, "goodsImageSort");
            return (Criteria) this;
        }

        public Criteria andGoodsImageSortIn(List<Byte> values) {
            addCriterion("goods_image_sort in", values, "goodsImageSort");
            return (Criteria) this;
        }

        public Criteria andGoodsImageSortNotIn(List<Byte> values) {
            addCriterion("goods_image_sort not in", values, "goodsImageSort");
            return (Criteria) this;
        }

        public Criteria andGoodsImageSortBetween(Byte value1, Byte value2) {
            addCriterion("goods_image_sort between", value1, value2, "goodsImageSort");
            return (Criteria) this;
        }

        public Criteria andGoodsImageSortNotBetween(Byte value1, Byte value2) {
            addCriterion("goods_image_sort not between", value1, value2, "goodsImageSort");
            return (Criteria) this;
        }

        public Criteria andGoodsImageExt1IsNull() {
            addCriterion("goods_image_ext1 is null");
            return (Criteria) this;
        }

        public Criteria andGoodsImageExt1IsNotNull() {
            addCriterion("goods_image_ext1 is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsImageExt1EqualTo(String value) {
            addCriterion("goods_image_ext1 =", value, "goodsImageExt1");
            return (Criteria) this;
        }

        public Criteria andGoodsImageExt1NotEqualTo(String value) {
            addCriterion("goods_image_ext1 <>", value, "goodsImageExt1");
            return (Criteria) this;
        }

        public Criteria andGoodsImageExt1GreaterThan(String value) {
            addCriterion("goods_image_ext1 >", value, "goodsImageExt1");
            return (Criteria) this;
        }

        public Criteria andGoodsImageExt1GreaterThanOrEqualTo(String value) {
            addCriterion("goods_image_ext1 >=", value, "goodsImageExt1");
            return (Criteria) this;
        }

        public Criteria andGoodsImageExt1LessThan(String value) {
            addCriterion("goods_image_ext1 <", value, "goodsImageExt1");
            return (Criteria) this;
        }

        public Criteria andGoodsImageExt1LessThanOrEqualTo(String value) {
            addCriterion("goods_image_ext1 <=", value, "goodsImageExt1");
            return (Criteria) this;
        }

        public Criteria andGoodsImageExt1Like(String value) {
            addCriterion("goods_image_ext1 like", value, "goodsImageExt1");
            return (Criteria) this;
        }

        public Criteria andGoodsImageExt1NotLike(String value) {
            addCriterion("goods_image_ext1 not like", value, "goodsImageExt1");
            return (Criteria) this;
        }

        public Criteria andGoodsImageExt1In(List<String> values) {
            addCriterion("goods_image_ext1 in", values, "goodsImageExt1");
            return (Criteria) this;
        }

        public Criteria andGoodsImageExt1NotIn(List<String> values) {
            addCriterion("goods_image_ext1 not in", values, "goodsImageExt1");
            return (Criteria) this;
        }

        public Criteria andGoodsImageExt1Between(String value1, String value2) {
            addCriterion("goods_image_ext1 between", value1, value2, "goodsImageExt1");
            return (Criteria) this;
        }

        public Criteria andGoodsImageExt1NotBetween(String value1, String value2) {
            addCriterion("goods_image_ext1 not between", value1, value2, "goodsImageExt1");
            return (Criteria) this;
        }

        public Criteria andGoodsImageExt2IsNull() {
            addCriterion("goods_image_ext2 is null");
            return (Criteria) this;
        }

        public Criteria andGoodsImageExt2IsNotNull() {
            addCriterion("goods_image_ext2 is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsImageExt2EqualTo(String value) {
            addCriterion("goods_image_ext2 =", value, "goodsImageExt2");
            return (Criteria) this;
        }

        public Criteria andGoodsImageExt2NotEqualTo(String value) {
            addCriterion("goods_image_ext2 <>", value, "goodsImageExt2");
            return (Criteria) this;
        }

        public Criteria andGoodsImageExt2GreaterThan(String value) {
            addCriterion("goods_image_ext2 >", value, "goodsImageExt2");
            return (Criteria) this;
        }

        public Criteria andGoodsImageExt2GreaterThanOrEqualTo(String value) {
            addCriterion("goods_image_ext2 >=", value, "goodsImageExt2");
            return (Criteria) this;
        }

        public Criteria andGoodsImageExt2LessThan(String value) {
            addCriterion("goods_image_ext2 <", value, "goodsImageExt2");
            return (Criteria) this;
        }

        public Criteria andGoodsImageExt2LessThanOrEqualTo(String value) {
            addCriterion("goods_image_ext2 <=", value, "goodsImageExt2");
            return (Criteria) this;
        }

        public Criteria andGoodsImageExt2Like(String value) {
            addCriterion("goods_image_ext2 like", value, "goodsImageExt2");
            return (Criteria) this;
        }

        public Criteria andGoodsImageExt2NotLike(String value) {
            addCriterion("goods_image_ext2 not like", value, "goodsImageExt2");
            return (Criteria) this;
        }

        public Criteria andGoodsImageExt2In(List<String> values) {
            addCriterion("goods_image_ext2 in", values, "goodsImageExt2");
            return (Criteria) this;
        }

        public Criteria andGoodsImageExt2NotIn(List<String> values) {
            addCriterion("goods_image_ext2 not in", values, "goodsImageExt2");
            return (Criteria) this;
        }

        public Criteria andGoodsImageExt2Between(String value1, String value2) {
            addCriterion("goods_image_ext2 between", value1, value2, "goodsImageExt2");
            return (Criteria) this;
        }

        public Criteria andGoodsImageExt2NotBetween(String value1, String value2) {
            addCriterion("goods_image_ext2 not between", value1, value2, "goodsImageExt2");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 商品图片
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