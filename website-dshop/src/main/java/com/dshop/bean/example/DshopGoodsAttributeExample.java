/*
 * DshopGoodsAttributeExample.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.bean.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DshopGoodsAttributeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DshopGoodsAttributeExample() {
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
     * 
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

        public Criteria andGoodsAttrNameIsNull() {
            addCriterion("goods_attr_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrNameIsNotNull() {
            addCriterion("goods_attr_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrNameEqualTo(String value) {
            addCriterion("goods_attr_name =", value, "goodsAttrName");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrNameNotEqualTo(String value) {
            addCriterion("goods_attr_name <>", value, "goodsAttrName");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrNameGreaterThan(String value) {
            addCriterion("goods_attr_name >", value, "goodsAttrName");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_attr_name >=", value, "goodsAttrName");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrNameLessThan(String value) {
            addCriterion("goods_attr_name <", value, "goodsAttrName");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrNameLessThanOrEqualTo(String value) {
            addCriterion("goods_attr_name <=", value, "goodsAttrName");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrNameLike(String value) {
            addCriterion("goods_attr_name like", value, "goodsAttrName");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrNameNotLike(String value) {
            addCriterion("goods_attr_name not like", value, "goodsAttrName");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrNameIn(List<String> values) {
            addCriterion("goods_attr_name in", values, "goodsAttrName");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrNameNotIn(List<String> values) {
            addCriterion("goods_attr_name not in", values, "goodsAttrName");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrNameBetween(String value1, String value2) {
            addCriterion("goods_attr_name between", value1, value2, "goodsAttrName");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrNameNotBetween(String value1, String value2) {
            addCriterion("goods_attr_name not between", value1, value2, "goodsAttrName");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrValueIsNull() {
            addCriterion("goods_attr_value is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrValueIsNotNull() {
            addCriterion("goods_attr_value is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrValueEqualTo(String value) {
            addCriterion("goods_attr_value =", value, "goodsAttrValue");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrValueNotEqualTo(String value) {
            addCriterion("goods_attr_value <>", value, "goodsAttrValue");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrValueGreaterThan(String value) {
            addCriterion("goods_attr_value >", value, "goodsAttrValue");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrValueGreaterThanOrEqualTo(String value) {
            addCriterion("goods_attr_value >=", value, "goodsAttrValue");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrValueLessThan(String value) {
            addCriterion("goods_attr_value <", value, "goodsAttrValue");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrValueLessThanOrEqualTo(String value) {
            addCriterion("goods_attr_value <=", value, "goodsAttrValue");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrValueLike(String value) {
            addCriterion("goods_attr_value like", value, "goodsAttrValue");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrValueNotLike(String value) {
            addCriterion("goods_attr_value not like", value, "goodsAttrValue");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrValueIn(List<String> values) {
            addCriterion("goods_attr_value in", values, "goodsAttrValue");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrValueNotIn(List<String> values) {
            addCriterion("goods_attr_value not in", values, "goodsAttrValue");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrValueBetween(String value1, String value2) {
            addCriterion("goods_attr_value between", value1, value2, "goodsAttrValue");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrValueNotBetween(String value1, String value2) {
            addCriterion("goods_attr_value not between", value1, value2, "goodsAttrValue");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrCostpriceIsNull() {
            addCriterion("goods_attr_costprice is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrCostpriceIsNotNull() {
            addCriterion("goods_attr_costprice is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrCostpriceEqualTo(BigDecimal value) {
            addCriterion("goods_attr_costprice =", value, "goodsAttrCostprice");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrCostpriceNotEqualTo(BigDecimal value) {
            addCriterion("goods_attr_costprice <>", value, "goodsAttrCostprice");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrCostpriceGreaterThan(BigDecimal value) {
            addCriterion("goods_attr_costprice >", value, "goodsAttrCostprice");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrCostpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_attr_costprice >=", value, "goodsAttrCostprice");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrCostpriceLessThan(BigDecimal value) {
            addCriterion("goods_attr_costprice <", value, "goodsAttrCostprice");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrCostpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_attr_costprice <=", value, "goodsAttrCostprice");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrCostpriceIn(List<BigDecimal> values) {
            addCriterion("goods_attr_costprice in", values, "goodsAttrCostprice");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrCostpriceNotIn(List<BigDecimal> values) {
            addCriterion("goods_attr_costprice not in", values, "goodsAttrCostprice");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrCostpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_attr_costprice between", value1, value2, "goodsAttrCostprice");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrCostpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_attr_costprice not between", value1, value2, "goodsAttrCostprice");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrTopriceIsNull() {
            addCriterion("goods_attr_toprice is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrTopriceIsNotNull() {
            addCriterion("goods_attr_toprice is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrTopriceEqualTo(BigDecimal value) {
            addCriterion("goods_attr_toprice =", value, "goodsAttrToprice");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrTopriceNotEqualTo(BigDecimal value) {
            addCriterion("goods_attr_toprice <>", value, "goodsAttrToprice");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrTopriceGreaterThan(BigDecimal value) {
            addCriterion("goods_attr_toprice >", value, "goodsAttrToprice");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrTopriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_attr_toprice >=", value, "goodsAttrToprice");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrTopriceLessThan(BigDecimal value) {
            addCriterion("goods_attr_toprice <", value, "goodsAttrToprice");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrTopriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_attr_toprice <=", value, "goodsAttrToprice");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrTopriceIn(List<BigDecimal> values) {
            addCriterion("goods_attr_toprice in", values, "goodsAttrToprice");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrTopriceNotIn(List<BigDecimal> values) {
            addCriterion("goods_attr_toprice not in", values, "goodsAttrToprice");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrTopriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_attr_toprice between", value1, value2, "goodsAttrToprice");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrTopriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_attr_toprice not between", value1, value2, "goodsAttrToprice");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrStockIsNull() {
            addCriterion("goods_attr_stock is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrStockIsNotNull() {
            addCriterion("goods_attr_stock is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrStockEqualTo(Integer value) {
            addCriterion("goods_attr_stock =", value, "goodsAttrStock");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrStockNotEqualTo(Integer value) {
            addCriterion("goods_attr_stock <>", value, "goodsAttrStock");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrStockGreaterThan(Integer value) {
            addCriterion("goods_attr_stock >", value, "goodsAttrStock");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_attr_stock >=", value, "goodsAttrStock");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrStockLessThan(Integer value) {
            addCriterion("goods_attr_stock <", value, "goodsAttrStock");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrStockLessThanOrEqualTo(Integer value) {
            addCriterion("goods_attr_stock <=", value, "goodsAttrStock");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrStockIn(List<Integer> values) {
            addCriterion("goods_attr_stock in", values, "goodsAttrStock");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrStockNotIn(List<Integer> values) {
            addCriterion("goods_attr_stock not in", values, "goodsAttrStock");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrStockBetween(Integer value1, Integer value2) {
            addCriterion("goods_attr_stock between", value1, value2, "goodsAttrStock");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrStockNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_attr_stock not between", value1, value2, "goodsAttrStock");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 
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