/*
 * DshopGoodsBrowseExample.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.bean.example;

import java.util.ArrayList;
import java.util.List;

public class DshopGoodsBrowseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DshopGoodsBrowseExample() {
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
     * 商品浏览历史表
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

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Integer value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Integer value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Integer value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Integer value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Integer> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Integer> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
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

        public Criteria andBrowseTimeIsNull() {
            addCriterion("browse_time is null");
            return (Criteria) this;
        }

        public Criteria andBrowseTimeIsNotNull() {
            addCriterion("browse_time is not null");
            return (Criteria) this;
        }

        public Criteria andBrowseTimeEqualTo(Integer value) {
            addCriterion("browse_time =", value, "browseTime");
            return (Criteria) this;
        }

        public Criteria andBrowseTimeNotEqualTo(Integer value) {
            addCriterion("browse_time <>", value, "browseTime");
            return (Criteria) this;
        }

        public Criteria andBrowseTimeGreaterThan(Integer value) {
            addCriterion("browse_time >", value, "browseTime");
            return (Criteria) this;
        }

        public Criteria andBrowseTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("browse_time >=", value, "browseTime");
            return (Criteria) this;
        }

        public Criteria andBrowseTimeLessThan(Integer value) {
            addCriterion("browse_time <", value, "browseTime");
            return (Criteria) this;
        }

        public Criteria andBrowseTimeLessThanOrEqualTo(Integer value) {
            addCriterion("browse_time <=", value, "browseTime");
            return (Criteria) this;
        }

        public Criteria andBrowseTimeIn(List<Integer> values) {
            addCriterion("browse_time in", values, "browseTime");
            return (Criteria) this;
        }

        public Criteria andBrowseTimeNotIn(List<Integer> values) {
            addCriterion("browse_time not in", values, "browseTime");
            return (Criteria) this;
        }

        public Criteria andBrowseTimeBetween(Integer value1, Integer value2) {
            addCriterion("browse_time between", value1, value2, "browseTime");
            return (Criteria) this;
        }

        public Criteria andBrowseTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("browse_time not between", value1, value2, "browseTime");
            return (Criteria) this;
        }

        public Criteria andBrowseExt1IsNull() {
            addCriterion("browse_ext1 is null");
            return (Criteria) this;
        }

        public Criteria andBrowseExt1IsNotNull() {
            addCriterion("browse_ext1 is not null");
            return (Criteria) this;
        }

        public Criteria andBrowseExt1EqualTo(String value) {
            addCriterion("browse_ext1 =", value, "browseExt1");
            return (Criteria) this;
        }

        public Criteria andBrowseExt1NotEqualTo(String value) {
            addCriterion("browse_ext1 <>", value, "browseExt1");
            return (Criteria) this;
        }

        public Criteria andBrowseExt1GreaterThan(String value) {
            addCriterion("browse_ext1 >", value, "browseExt1");
            return (Criteria) this;
        }

        public Criteria andBrowseExt1GreaterThanOrEqualTo(String value) {
            addCriterion("browse_ext1 >=", value, "browseExt1");
            return (Criteria) this;
        }

        public Criteria andBrowseExt1LessThan(String value) {
            addCriterion("browse_ext1 <", value, "browseExt1");
            return (Criteria) this;
        }

        public Criteria andBrowseExt1LessThanOrEqualTo(String value) {
            addCriterion("browse_ext1 <=", value, "browseExt1");
            return (Criteria) this;
        }

        public Criteria andBrowseExt1Like(String value) {
            addCriterion("browse_ext1 like", value, "browseExt1");
            return (Criteria) this;
        }

        public Criteria andBrowseExt1NotLike(String value) {
            addCriterion("browse_ext1 not like", value, "browseExt1");
            return (Criteria) this;
        }

        public Criteria andBrowseExt1In(List<String> values) {
            addCriterion("browse_ext1 in", values, "browseExt1");
            return (Criteria) this;
        }

        public Criteria andBrowseExt1NotIn(List<String> values) {
            addCriterion("browse_ext1 not in", values, "browseExt1");
            return (Criteria) this;
        }

        public Criteria andBrowseExt1Between(String value1, String value2) {
            addCriterion("browse_ext1 between", value1, value2, "browseExt1");
            return (Criteria) this;
        }

        public Criteria andBrowseExt1NotBetween(String value1, String value2) {
            addCriterion("browse_ext1 not between", value1, value2, "browseExt1");
            return (Criteria) this;
        }

        public Criteria andBrowseExt2IsNull() {
            addCriterion("browse_ext2 is null");
            return (Criteria) this;
        }

        public Criteria andBrowseExt2IsNotNull() {
            addCriterion("browse_ext2 is not null");
            return (Criteria) this;
        }

        public Criteria andBrowseExt2EqualTo(String value) {
            addCriterion("browse_ext2 =", value, "browseExt2");
            return (Criteria) this;
        }

        public Criteria andBrowseExt2NotEqualTo(String value) {
            addCriterion("browse_ext2 <>", value, "browseExt2");
            return (Criteria) this;
        }

        public Criteria andBrowseExt2GreaterThan(String value) {
            addCriterion("browse_ext2 >", value, "browseExt2");
            return (Criteria) this;
        }

        public Criteria andBrowseExt2GreaterThanOrEqualTo(String value) {
            addCriterion("browse_ext2 >=", value, "browseExt2");
            return (Criteria) this;
        }

        public Criteria andBrowseExt2LessThan(String value) {
            addCriterion("browse_ext2 <", value, "browseExt2");
            return (Criteria) this;
        }

        public Criteria andBrowseExt2LessThanOrEqualTo(String value) {
            addCriterion("browse_ext2 <=", value, "browseExt2");
            return (Criteria) this;
        }

        public Criteria andBrowseExt2Like(String value) {
            addCriterion("browse_ext2 like", value, "browseExt2");
            return (Criteria) this;
        }

        public Criteria andBrowseExt2NotLike(String value) {
            addCriterion("browse_ext2 not like", value, "browseExt2");
            return (Criteria) this;
        }

        public Criteria andBrowseExt2In(List<String> values) {
            addCriterion("browse_ext2 in", values, "browseExt2");
            return (Criteria) this;
        }

        public Criteria andBrowseExt2NotIn(List<String> values) {
            addCriterion("browse_ext2 not in", values, "browseExt2");
            return (Criteria) this;
        }

        public Criteria andBrowseExt2Between(String value1, String value2) {
            addCriterion("browse_ext2 between", value1, value2, "browseExt2");
            return (Criteria) this;
        }

        public Criteria andBrowseExt2NotBetween(String value1, String value2) {
            addCriterion("browse_ext2 not between", value1, value2, "browseExt2");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 商品浏览历史表
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