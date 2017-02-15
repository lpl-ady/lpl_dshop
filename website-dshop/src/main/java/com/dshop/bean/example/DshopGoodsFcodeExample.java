/*
 * DshopGoodsFcodeExample.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.bean.example;

import java.util.ArrayList;
import java.util.List;

public class DshopGoodsFcodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DshopGoodsFcodeExample() {
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
     * 商品F码
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

        public Criteria andFcodeIdIsNull() {
            addCriterion("fcode_id is null");
            return (Criteria) this;
        }

        public Criteria andFcodeIdIsNotNull() {
            addCriterion("fcode_id is not null");
            return (Criteria) this;
        }

        public Criteria andFcodeIdEqualTo(Integer value) {
            addCriterion("fcode_id =", value, "fcodeId");
            return (Criteria) this;
        }

        public Criteria andFcodeIdNotEqualTo(Integer value) {
            addCriterion("fcode_id <>", value, "fcodeId");
            return (Criteria) this;
        }

        public Criteria andFcodeIdGreaterThan(Integer value) {
            addCriterion("fcode_id >", value, "fcodeId");
            return (Criteria) this;
        }

        public Criteria andFcodeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fcode_id >=", value, "fcodeId");
            return (Criteria) this;
        }

        public Criteria andFcodeIdLessThan(Integer value) {
            addCriterion("fcode_id <", value, "fcodeId");
            return (Criteria) this;
        }

        public Criteria andFcodeIdLessThanOrEqualTo(Integer value) {
            addCriterion("fcode_id <=", value, "fcodeId");
            return (Criteria) this;
        }

        public Criteria andFcodeIdIn(List<Integer> values) {
            addCriterion("fcode_id in", values, "fcodeId");
            return (Criteria) this;
        }

        public Criteria andFcodeIdNotIn(List<Integer> values) {
            addCriterion("fcode_id not in", values, "fcodeId");
            return (Criteria) this;
        }

        public Criteria andFcodeIdBetween(Integer value1, Integer value2) {
            addCriterion("fcode_id between", value1, value2, "fcodeId");
            return (Criteria) this;
        }

        public Criteria andFcodeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fcode_id not between", value1, value2, "fcodeId");
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

        public Criteria andFcodeCodeIsNull() {
            addCriterion("fcode_code is null");
            return (Criteria) this;
        }

        public Criteria andFcodeCodeIsNotNull() {
            addCriterion("fcode_code is not null");
            return (Criteria) this;
        }

        public Criteria andFcodeCodeEqualTo(String value) {
            addCriterion("fcode_code =", value, "fcodeCode");
            return (Criteria) this;
        }

        public Criteria andFcodeCodeNotEqualTo(String value) {
            addCriterion("fcode_code <>", value, "fcodeCode");
            return (Criteria) this;
        }

        public Criteria andFcodeCodeGreaterThan(String value) {
            addCriterion("fcode_code >", value, "fcodeCode");
            return (Criteria) this;
        }

        public Criteria andFcodeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("fcode_code >=", value, "fcodeCode");
            return (Criteria) this;
        }

        public Criteria andFcodeCodeLessThan(String value) {
            addCriterion("fcode_code <", value, "fcodeCode");
            return (Criteria) this;
        }

        public Criteria andFcodeCodeLessThanOrEqualTo(String value) {
            addCriterion("fcode_code <=", value, "fcodeCode");
            return (Criteria) this;
        }

        public Criteria andFcodeCodeLike(String value) {
            addCriterion("fcode_code like", value, "fcodeCode");
            return (Criteria) this;
        }

        public Criteria andFcodeCodeNotLike(String value) {
            addCriterion("fcode_code not like", value, "fcodeCode");
            return (Criteria) this;
        }

        public Criteria andFcodeCodeIn(List<String> values) {
            addCriterion("fcode_code in", values, "fcodeCode");
            return (Criteria) this;
        }

        public Criteria andFcodeCodeNotIn(List<String> values) {
            addCriterion("fcode_code not in", values, "fcodeCode");
            return (Criteria) this;
        }

        public Criteria andFcodeCodeBetween(String value1, String value2) {
            addCriterion("fcode_code between", value1, value2, "fcodeCode");
            return (Criteria) this;
        }

        public Criteria andFcodeCodeNotBetween(String value1, String value2) {
            addCriterion("fcode_code not between", value1, value2, "fcodeCode");
            return (Criteria) this;
        }

        public Criteria andFcodeStatusIsNull() {
            addCriterion("fcode_status is null");
            return (Criteria) this;
        }

        public Criteria andFcodeStatusIsNotNull() {
            addCriterion("fcode_status is not null");
            return (Criteria) this;
        }

        public Criteria andFcodeStatusEqualTo(Byte value) {
            addCriterion("fcode_status =", value, "fcodeStatus");
            return (Criteria) this;
        }

        public Criteria andFcodeStatusNotEqualTo(Byte value) {
            addCriterion("fcode_status <>", value, "fcodeStatus");
            return (Criteria) this;
        }

        public Criteria andFcodeStatusGreaterThan(Byte value) {
            addCriterion("fcode_status >", value, "fcodeStatus");
            return (Criteria) this;
        }

        public Criteria andFcodeStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("fcode_status >=", value, "fcodeStatus");
            return (Criteria) this;
        }

        public Criteria andFcodeStatusLessThan(Byte value) {
            addCriterion("fcode_status <", value, "fcodeStatus");
            return (Criteria) this;
        }

        public Criteria andFcodeStatusLessThanOrEqualTo(Byte value) {
            addCriterion("fcode_status <=", value, "fcodeStatus");
            return (Criteria) this;
        }

        public Criteria andFcodeStatusIn(List<Byte> values) {
            addCriterion("fcode_status in", values, "fcodeStatus");
            return (Criteria) this;
        }

        public Criteria andFcodeStatusNotIn(List<Byte> values) {
            addCriterion("fcode_status not in", values, "fcodeStatus");
            return (Criteria) this;
        }

        public Criteria andFcodeStatusBetween(Byte value1, Byte value2) {
            addCriterion("fcode_status between", value1, value2, "fcodeStatus");
            return (Criteria) this;
        }

        public Criteria andFcodeStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("fcode_status not between", value1, value2, "fcodeStatus");
            return (Criteria) this;
        }

        public Criteria andFcodeExt1IsNull() {
            addCriterion("fcode_ext1 is null");
            return (Criteria) this;
        }

        public Criteria andFcodeExt1IsNotNull() {
            addCriterion("fcode_ext1 is not null");
            return (Criteria) this;
        }

        public Criteria andFcodeExt1EqualTo(String value) {
            addCriterion("fcode_ext1 =", value, "fcodeExt1");
            return (Criteria) this;
        }

        public Criteria andFcodeExt1NotEqualTo(String value) {
            addCriterion("fcode_ext1 <>", value, "fcodeExt1");
            return (Criteria) this;
        }

        public Criteria andFcodeExt1GreaterThan(String value) {
            addCriterion("fcode_ext1 >", value, "fcodeExt1");
            return (Criteria) this;
        }

        public Criteria andFcodeExt1GreaterThanOrEqualTo(String value) {
            addCriterion("fcode_ext1 >=", value, "fcodeExt1");
            return (Criteria) this;
        }

        public Criteria andFcodeExt1LessThan(String value) {
            addCriterion("fcode_ext1 <", value, "fcodeExt1");
            return (Criteria) this;
        }

        public Criteria andFcodeExt1LessThanOrEqualTo(String value) {
            addCriterion("fcode_ext1 <=", value, "fcodeExt1");
            return (Criteria) this;
        }

        public Criteria andFcodeExt1Like(String value) {
            addCriterion("fcode_ext1 like", value, "fcodeExt1");
            return (Criteria) this;
        }

        public Criteria andFcodeExt1NotLike(String value) {
            addCriterion("fcode_ext1 not like", value, "fcodeExt1");
            return (Criteria) this;
        }

        public Criteria andFcodeExt1In(List<String> values) {
            addCriterion("fcode_ext1 in", values, "fcodeExt1");
            return (Criteria) this;
        }

        public Criteria andFcodeExt1NotIn(List<String> values) {
            addCriterion("fcode_ext1 not in", values, "fcodeExt1");
            return (Criteria) this;
        }

        public Criteria andFcodeExt1Between(String value1, String value2) {
            addCriterion("fcode_ext1 between", value1, value2, "fcodeExt1");
            return (Criteria) this;
        }

        public Criteria andFcodeExt1NotBetween(String value1, String value2) {
            addCriterion("fcode_ext1 not between", value1, value2, "fcodeExt1");
            return (Criteria) this;
        }

        public Criteria andFcodeExt2IsNull() {
            addCriterion("fcode_ext2 is null");
            return (Criteria) this;
        }

        public Criteria andFcodeExt2IsNotNull() {
            addCriterion("fcode_ext2 is not null");
            return (Criteria) this;
        }

        public Criteria andFcodeExt2EqualTo(String value) {
            addCriterion("fcode_ext2 =", value, "fcodeExt2");
            return (Criteria) this;
        }

        public Criteria andFcodeExt2NotEqualTo(String value) {
            addCriterion("fcode_ext2 <>", value, "fcodeExt2");
            return (Criteria) this;
        }

        public Criteria andFcodeExt2GreaterThan(String value) {
            addCriterion("fcode_ext2 >", value, "fcodeExt2");
            return (Criteria) this;
        }

        public Criteria andFcodeExt2GreaterThanOrEqualTo(String value) {
            addCriterion("fcode_ext2 >=", value, "fcodeExt2");
            return (Criteria) this;
        }

        public Criteria andFcodeExt2LessThan(String value) {
            addCriterion("fcode_ext2 <", value, "fcodeExt2");
            return (Criteria) this;
        }

        public Criteria andFcodeExt2LessThanOrEqualTo(String value) {
            addCriterion("fcode_ext2 <=", value, "fcodeExt2");
            return (Criteria) this;
        }

        public Criteria andFcodeExt2Like(String value) {
            addCriterion("fcode_ext2 like", value, "fcodeExt2");
            return (Criteria) this;
        }

        public Criteria andFcodeExt2NotLike(String value) {
            addCriterion("fcode_ext2 not like", value, "fcodeExt2");
            return (Criteria) this;
        }

        public Criteria andFcodeExt2In(List<String> values) {
            addCriterion("fcode_ext2 in", values, "fcodeExt2");
            return (Criteria) this;
        }

        public Criteria andFcodeExt2NotIn(List<String> values) {
            addCriterion("fcode_ext2 not in", values, "fcodeExt2");
            return (Criteria) this;
        }

        public Criteria andFcodeExt2Between(String value1, String value2) {
            addCriterion("fcode_ext2 between", value1, value2, "fcodeExt2");
            return (Criteria) this;
        }

        public Criteria andFcodeExt2NotBetween(String value1, String value2) {
            addCriterion("fcode_ext2 not between", value1, value2, "fcodeExt2");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 商品F码
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