/*
 * DshopGoodsCombinationExample.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.bean.example;

import java.util.ArrayList;
import java.util.List;

public class DshopGoodsCombinationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DshopGoodsCombinationExample() {
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
     * 商品推荐组合表
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

        public Criteria andCombIdIsNull() {
            addCriterion("comb_id is null");
            return (Criteria) this;
        }

        public Criteria andCombIdIsNotNull() {
            addCriterion("comb_id is not null");
            return (Criteria) this;
        }

        public Criteria andCombIdEqualTo(Integer value) {
            addCriterion("comb_id =", value, "combId");
            return (Criteria) this;
        }

        public Criteria andCombIdNotEqualTo(Integer value) {
            addCriterion("comb_id <>", value, "combId");
            return (Criteria) this;
        }

        public Criteria andCombIdGreaterThan(Integer value) {
            addCriterion("comb_id >", value, "combId");
            return (Criteria) this;
        }

        public Criteria andCombIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("comb_id >=", value, "combId");
            return (Criteria) this;
        }

        public Criteria andCombIdLessThan(Integer value) {
            addCriterion("comb_id <", value, "combId");
            return (Criteria) this;
        }

        public Criteria andCombIdLessThanOrEqualTo(Integer value) {
            addCriterion("comb_id <=", value, "combId");
            return (Criteria) this;
        }

        public Criteria andCombIdIn(List<Integer> values) {
            addCriterion("comb_id in", values, "combId");
            return (Criteria) this;
        }

        public Criteria andCombIdNotIn(List<Integer> values) {
            addCriterion("comb_id not in", values, "combId");
            return (Criteria) this;
        }

        public Criteria andCombIdBetween(Integer value1, Integer value2) {
            addCriterion("comb_id between", value1, value2, "combId");
            return (Criteria) this;
        }

        public Criteria andCombIdNotBetween(Integer value1, Integer value2) {
            addCriterion("comb_id not between", value1, value2, "combId");
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

        public Criteria andCombGoodsidIsNull() {
            addCriterion("comb_goodsid is null");
            return (Criteria) this;
        }

        public Criteria andCombGoodsidIsNotNull() {
            addCriterion("comb_goodsid is not null");
            return (Criteria) this;
        }

        public Criteria andCombGoodsidEqualTo(Integer value) {
            addCriterion("comb_goodsid =", value, "combGoodsid");
            return (Criteria) this;
        }

        public Criteria andCombGoodsidNotEqualTo(Integer value) {
            addCriterion("comb_goodsid <>", value, "combGoodsid");
            return (Criteria) this;
        }

        public Criteria andCombGoodsidGreaterThan(Integer value) {
            addCriterion("comb_goodsid >", value, "combGoodsid");
            return (Criteria) this;
        }

        public Criteria andCombGoodsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("comb_goodsid >=", value, "combGoodsid");
            return (Criteria) this;
        }

        public Criteria andCombGoodsidLessThan(Integer value) {
            addCriterion("comb_goodsid <", value, "combGoodsid");
            return (Criteria) this;
        }

        public Criteria andCombGoodsidLessThanOrEqualTo(Integer value) {
            addCriterion("comb_goodsid <=", value, "combGoodsid");
            return (Criteria) this;
        }

        public Criteria andCombGoodsidIn(List<Integer> values) {
            addCriterion("comb_goodsid in", values, "combGoodsid");
            return (Criteria) this;
        }

        public Criteria andCombGoodsidNotIn(List<Integer> values) {
            addCriterion("comb_goodsid not in", values, "combGoodsid");
            return (Criteria) this;
        }

        public Criteria andCombGoodsidBetween(Integer value1, Integer value2) {
            addCriterion("comb_goodsid between", value1, value2, "combGoodsid");
            return (Criteria) this;
        }

        public Criteria andCombGoodsidNotBetween(Integer value1, Integer value2) {
            addCriterion("comb_goodsid not between", value1, value2, "combGoodsid");
            return (Criteria) this;
        }

        public Criteria andCombExt1IsNull() {
            addCriterion("comb_ext1 is null");
            return (Criteria) this;
        }

        public Criteria andCombExt1IsNotNull() {
            addCriterion("comb_ext1 is not null");
            return (Criteria) this;
        }

        public Criteria andCombExt1EqualTo(String value) {
            addCriterion("comb_ext1 =", value, "combExt1");
            return (Criteria) this;
        }

        public Criteria andCombExt1NotEqualTo(String value) {
            addCriterion("comb_ext1 <>", value, "combExt1");
            return (Criteria) this;
        }

        public Criteria andCombExt1GreaterThan(String value) {
            addCriterion("comb_ext1 >", value, "combExt1");
            return (Criteria) this;
        }

        public Criteria andCombExt1GreaterThanOrEqualTo(String value) {
            addCriterion("comb_ext1 >=", value, "combExt1");
            return (Criteria) this;
        }

        public Criteria andCombExt1LessThan(String value) {
            addCriterion("comb_ext1 <", value, "combExt1");
            return (Criteria) this;
        }

        public Criteria andCombExt1LessThanOrEqualTo(String value) {
            addCriterion("comb_ext1 <=", value, "combExt1");
            return (Criteria) this;
        }

        public Criteria andCombExt1Like(String value) {
            addCriterion("comb_ext1 like", value, "combExt1");
            return (Criteria) this;
        }

        public Criteria andCombExt1NotLike(String value) {
            addCriterion("comb_ext1 not like", value, "combExt1");
            return (Criteria) this;
        }

        public Criteria andCombExt1In(List<String> values) {
            addCriterion("comb_ext1 in", values, "combExt1");
            return (Criteria) this;
        }

        public Criteria andCombExt1NotIn(List<String> values) {
            addCriterion("comb_ext1 not in", values, "combExt1");
            return (Criteria) this;
        }

        public Criteria andCombExt1Between(String value1, String value2) {
            addCriterion("comb_ext1 between", value1, value2, "combExt1");
            return (Criteria) this;
        }

        public Criteria andCombExt1NotBetween(String value1, String value2) {
            addCriterion("comb_ext1 not between", value1, value2, "combExt1");
            return (Criteria) this;
        }

        public Criteria andCombExt2IsNull() {
            addCriterion("comb_ext2 is null");
            return (Criteria) this;
        }

        public Criteria andCombExt2IsNotNull() {
            addCriterion("comb_ext2 is not null");
            return (Criteria) this;
        }

        public Criteria andCombExt2EqualTo(String value) {
            addCriterion("comb_ext2 =", value, "combExt2");
            return (Criteria) this;
        }

        public Criteria andCombExt2NotEqualTo(String value) {
            addCriterion("comb_ext2 <>", value, "combExt2");
            return (Criteria) this;
        }

        public Criteria andCombExt2GreaterThan(String value) {
            addCriterion("comb_ext2 >", value, "combExt2");
            return (Criteria) this;
        }

        public Criteria andCombExt2GreaterThanOrEqualTo(String value) {
            addCriterion("comb_ext2 >=", value, "combExt2");
            return (Criteria) this;
        }

        public Criteria andCombExt2LessThan(String value) {
            addCriterion("comb_ext2 <", value, "combExt2");
            return (Criteria) this;
        }

        public Criteria andCombExt2LessThanOrEqualTo(String value) {
            addCriterion("comb_ext2 <=", value, "combExt2");
            return (Criteria) this;
        }

        public Criteria andCombExt2Like(String value) {
            addCriterion("comb_ext2 like", value, "combExt2");
            return (Criteria) this;
        }

        public Criteria andCombExt2NotLike(String value) {
            addCriterion("comb_ext2 not like", value, "combExt2");
            return (Criteria) this;
        }

        public Criteria andCombExt2In(List<String> values) {
            addCriterion("comb_ext2 in", values, "combExt2");
            return (Criteria) this;
        }

        public Criteria andCombExt2NotIn(List<String> values) {
            addCriterion("comb_ext2 not in", values, "combExt2");
            return (Criteria) this;
        }

        public Criteria andCombExt2Between(String value1, String value2) {
            addCriterion("comb_ext2 between", value1, value2, "combExt2");
            return (Criteria) this;
        }

        public Criteria andCombExt2NotBetween(String value1, String value2) {
            addCriterion("comb_ext2 not between", value1, value2, "combExt2");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 商品推荐组合表
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