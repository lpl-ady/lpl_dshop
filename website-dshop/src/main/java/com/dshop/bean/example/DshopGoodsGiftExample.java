/*
 * DshopGoodsGiftExample.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.bean.example;

import java.util.ArrayList;
import java.util.List;

public class DshopGoodsGiftExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DshopGoodsGiftExample() {
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
     * 商品赠品表
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

        public Criteria andGiftIdIsNull() {
            addCriterion("gift_id is null");
            return (Criteria) this;
        }

        public Criteria andGiftIdIsNotNull() {
            addCriterion("gift_id is not null");
            return (Criteria) this;
        }

        public Criteria andGiftIdEqualTo(Integer value) {
            addCriterion("gift_id =", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdNotEqualTo(Integer value) {
            addCriterion("gift_id <>", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdGreaterThan(Integer value) {
            addCriterion("gift_id >", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("gift_id >=", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdLessThan(Integer value) {
            addCriterion("gift_id <", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdLessThanOrEqualTo(Integer value) {
            addCriterion("gift_id <=", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdIn(List<Integer> values) {
            addCriterion("gift_id in", values, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdNotIn(List<Integer> values) {
            addCriterion("gift_id not in", values, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdBetween(Integer value1, Integer value2) {
            addCriterion("gift_id between", value1, value2, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdNotBetween(Integer value1, Integer value2) {
            addCriterion("gift_id not between", value1, value2, "giftId");
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

        public Criteria andGiftGoodsIdIsNull() {
            addCriterion("gift_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsIdIsNotNull() {
            addCriterion("gift_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsIdEqualTo(Integer value) {
            addCriterion("gift_goods_id =", value, "giftGoodsId");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsIdNotEqualTo(Integer value) {
            addCriterion("gift_goods_id <>", value, "giftGoodsId");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsIdGreaterThan(Integer value) {
            addCriterion("gift_goods_id >", value, "giftGoodsId");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("gift_goods_id >=", value, "giftGoodsId");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsIdLessThan(Integer value) {
            addCriterion("gift_goods_id <", value, "giftGoodsId");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("gift_goods_id <=", value, "giftGoodsId");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsIdIn(List<Integer> values) {
            addCriterion("gift_goods_id in", values, "giftGoodsId");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsIdNotIn(List<Integer> values) {
            addCriterion("gift_goods_id not in", values, "giftGoodsId");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("gift_goods_id between", value1, value2, "giftGoodsId");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("gift_goods_id not between", value1, value2, "giftGoodsId");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsNameIsNull() {
            addCriterion("gift_goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsNameIsNotNull() {
            addCriterion("gift_goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsNameEqualTo(String value) {
            addCriterion("gift_goods_name =", value, "giftGoodsName");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsNameNotEqualTo(String value) {
            addCriterion("gift_goods_name <>", value, "giftGoodsName");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsNameGreaterThan(String value) {
            addCriterion("gift_goods_name >", value, "giftGoodsName");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("gift_goods_name >=", value, "giftGoodsName");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsNameLessThan(String value) {
            addCriterion("gift_goods_name <", value, "giftGoodsName");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("gift_goods_name <=", value, "giftGoodsName");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsNameLike(String value) {
            addCriterion("gift_goods_name like", value, "giftGoodsName");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsNameNotLike(String value) {
            addCriterion("gift_goods_name not like", value, "giftGoodsName");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsNameIn(List<String> values) {
            addCriterion("gift_goods_name in", values, "giftGoodsName");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsNameNotIn(List<String> values) {
            addCriterion("gift_goods_name not in", values, "giftGoodsName");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsNameBetween(String value1, String value2) {
            addCriterion("gift_goods_name between", value1, value2, "giftGoodsName");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsNameNotBetween(String value1, String value2) {
            addCriterion("gift_goods_name not between", value1, value2, "giftGoodsName");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsImageIsNull() {
            addCriterion("gift_goods_image is null");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsImageIsNotNull() {
            addCriterion("gift_goods_image is not null");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsImageEqualTo(String value) {
            addCriterion("gift_goods_image =", value, "giftGoodsImage");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsImageNotEqualTo(String value) {
            addCriterion("gift_goods_image <>", value, "giftGoodsImage");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsImageGreaterThan(String value) {
            addCriterion("gift_goods_image >", value, "giftGoodsImage");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsImageGreaterThanOrEqualTo(String value) {
            addCriterion("gift_goods_image >=", value, "giftGoodsImage");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsImageLessThan(String value) {
            addCriterion("gift_goods_image <", value, "giftGoodsImage");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsImageLessThanOrEqualTo(String value) {
            addCriterion("gift_goods_image <=", value, "giftGoodsImage");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsImageLike(String value) {
            addCriterion("gift_goods_image like", value, "giftGoodsImage");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsImageNotLike(String value) {
            addCriterion("gift_goods_image not like", value, "giftGoodsImage");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsImageIn(List<String> values) {
            addCriterion("gift_goods_image in", values, "giftGoodsImage");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsImageNotIn(List<String> values) {
            addCriterion("gift_goods_image not in", values, "giftGoodsImage");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsImageBetween(String value1, String value2) {
            addCriterion("gift_goods_image between", value1, value2, "giftGoodsImage");
            return (Criteria) this;
        }

        public Criteria andGiftGoodsImageNotBetween(String value1, String value2) {
            addCriterion("gift_goods_image not between", value1, value2, "giftGoodsImage");
            return (Criteria) this;
        }

        public Criteria andGiftAmountIsNull() {
            addCriterion("gift_amount is null");
            return (Criteria) this;
        }

        public Criteria andGiftAmountIsNotNull() {
            addCriterion("gift_amount is not null");
            return (Criteria) this;
        }

        public Criteria andGiftAmountEqualTo(Byte value) {
            addCriterion("gift_amount =", value, "giftAmount");
            return (Criteria) this;
        }

        public Criteria andGiftAmountNotEqualTo(Byte value) {
            addCriterion("gift_amount <>", value, "giftAmount");
            return (Criteria) this;
        }

        public Criteria andGiftAmountGreaterThan(Byte value) {
            addCriterion("gift_amount >", value, "giftAmount");
            return (Criteria) this;
        }

        public Criteria andGiftAmountGreaterThanOrEqualTo(Byte value) {
            addCriterion("gift_amount >=", value, "giftAmount");
            return (Criteria) this;
        }

        public Criteria andGiftAmountLessThan(Byte value) {
            addCriterion("gift_amount <", value, "giftAmount");
            return (Criteria) this;
        }

        public Criteria andGiftAmountLessThanOrEqualTo(Byte value) {
            addCriterion("gift_amount <=", value, "giftAmount");
            return (Criteria) this;
        }

        public Criteria andGiftAmountIn(List<Byte> values) {
            addCriterion("gift_amount in", values, "giftAmount");
            return (Criteria) this;
        }

        public Criteria andGiftAmountNotIn(List<Byte> values) {
            addCriterion("gift_amount not in", values, "giftAmount");
            return (Criteria) this;
        }

        public Criteria andGiftAmountBetween(Byte value1, Byte value2) {
            addCriterion("gift_amount between", value1, value2, "giftAmount");
            return (Criteria) this;
        }

        public Criteria andGiftAmountNotBetween(Byte value1, Byte value2) {
            addCriterion("gift_amount not between", value1, value2, "giftAmount");
            return (Criteria) this;
        }

        public Criteria andGiftExt1IsNull() {
            addCriterion("gift_ext1 is null");
            return (Criteria) this;
        }

        public Criteria andGiftExt1IsNotNull() {
            addCriterion("gift_ext1 is not null");
            return (Criteria) this;
        }

        public Criteria andGiftExt1EqualTo(String value) {
            addCriterion("gift_ext1 =", value, "giftExt1");
            return (Criteria) this;
        }

        public Criteria andGiftExt1NotEqualTo(String value) {
            addCriterion("gift_ext1 <>", value, "giftExt1");
            return (Criteria) this;
        }

        public Criteria andGiftExt1GreaterThan(String value) {
            addCriterion("gift_ext1 >", value, "giftExt1");
            return (Criteria) this;
        }

        public Criteria andGiftExt1GreaterThanOrEqualTo(String value) {
            addCriterion("gift_ext1 >=", value, "giftExt1");
            return (Criteria) this;
        }

        public Criteria andGiftExt1LessThan(String value) {
            addCriterion("gift_ext1 <", value, "giftExt1");
            return (Criteria) this;
        }

        public Criteria andGiftExt1LessThanOrEqualTo(String value) {
            addCriterion("gift_ext1 <=", value, "giftExt1");
            return (Criteria) this;
        }

        public Criteria andGiftExt1Like(String value) {
            addCriterion("gift_ext1 like", value, "giftExt1");
            return (Criteria) this;
        }

        public Criteria andGiftExt1NotLike(String value) {
            addCriterion("gift_ext1 not like", value, "giftExt1");
            return (Criteria) this;
        }

        public Criteria andGiftExt1In(List<String> values) {
            addCriterion("gift_ext1 in", values, "giftExt1");
            return (Criteria) this;
        }

        public Criteria andGiftExt1NotIn(List<String> values) {
            addCriterion("gift_ext1 not in", values, "giftExt1");
            return (Criteria) this;
        }

        public Criteria andGiftExt1Between(String value1, String value2) {
            addCriterion("gift_ext1 between", value1, value2, "giftExt1");
            return (Criteria) this;
        }

        public Criteria andGiftExt1NotBetween(String value1, String value2) {
            addCriterion("gift_ext1 not between", value1, value2, "giftExt1");
            return (Criteria) this;
        }

        public Criteria andGiftExt2IsNull() {
            addCriterion("gift_ext2 is null");
            return (Criteria) this;
        }

        public Criteria andGiftExt2IsNotNull() {
            addCriterion("gift_ext2 is not null");
            return (Criteria) this;
        }

        public Criteria andGiftExt2EqualTo(String value) {
            addCriterion("gift_ext2 =", value, "giftExt2");
            return (Criteria) this;
        }

        public Criteria andGiftExt2NotEqualTo(String value) {
            addCriterion("gift_ext2 <>", value, "giftExt2");
            return (Criteria) this;
        }

        public Criteria andGiftExt2GreaterThan(String value) {
            addCriterion("gift_ext2 >", value, "giftExt2");
            return (Criteria) this;
        }

        public Criteria andGiftExt2GreaterThanOrEqualTo(String value) {
            addCriterion("gift_ext2 >=", value, "giftExt2");
            return (Criteria) this;
        }

        public Criteria andGiftExt2LessThan(String value) {
            addCriterion("gift_ext2 <", value, "giftExt2");
            return (Criteria) this;
        }

        public Criteria andGiftExt2LessThanOrEqualTo(String value) {
            addCriterion("gift_ext2 <=", value, "giftExt2");
            return (Criteria) this;
        }

        public Criteria andGiftExt2Like(String value) {
            addCriterion("gift_ext2 like", value, "giftExt2");
            return (Criteria) this;
        }

        public Criteria andGiftExt2NotLike(String value) {
            addCriterion("gift_ext2 not like", value, "giftExt2");
            return (Criteria) this;
        }

        public Criteria andGiftExt2In(List<String> values) {
            addCriterion("gift_ext2 in", values, "giftExt2");
            return (Criteria) this;
        }

        public Criteria andGiftExt2NotIn(List<String> values) {
            addCriterion("gift_ext2 not in", values, "giftExt2");
            return (Criteria) this;
        }

        public Criteria andGiftExt2Between(String value1, String value2) {
            addCriterion("gift_ext2 between", value1, value2, "giftExt2");
            return (Criteria) this;
        }

        public Criteria andGiftExt2NotBetween(String value1, String value2) {
            addCriterion("gift_ext2 not between", value1, value2, "giftExt2");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 商品赠品表
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