/*
 * DshopStoreBindCategoryExample.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.bean.example;

import java.util.ArrayList;
import java.util.List;

public class DshopStoreBindCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DshopStoreBindCategoryExample() {
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
     * 店铺可发布商品类目表
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

        public Criteria andSbcIdIsNull() {
            addCriterion("sbc_id is null");
            return (Criteria) this;
        }

        public Criteria andSbcIdIsNotNull() {
            addCriterion("sbc_id is not null");
            return (Criteria) this;
        }

        public Criteria andSbcIdEqualTo(Integer value) {
            addCriterion("sbc_id =", value, "sbcId");
            return (Criteria) this;
        }

        public Criteria andSbcIdNotEqualTo(Integer value) {
            addCriterion("sbc_id <>", value, "sbcId");
            return (Criteria) this;
        }

        public Criteria andSbcIdGreaterThan(Integer value) {
            addCriterion("sbc_id >", value, "sbcId");
            return (Criteria) this;
        }

        public Criteria andSbcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sbc_id >=", value, "sbcId");
            return (Criteria) this;
        }

        public Criteria andSbcIdLessThan(Integer value) {
            addCriterion("sbc_id <", value, "sbcId");
            return (Criteria) this;
        }

        public Criteria andSbcIdLessThanOrEqualTo(Integer value) {
            addCriterion("sbc_id <=", value, "sbcId");
            return (Criteria) this;
        }

        public Criteria andSbcIdIn(List<Integer> values) {
            addCriterion("sbc_id in", values, "sbcId");
            return (Criteria) this;
        }

        public Criteria andSbcIdNotIn(List<Integer> values) {
            addCriterion("sbc_id not in", values, "sbcId");
            return (Criteria) this;
        }

        public Criteria andSbcIdBetween(Integer value1, Integer value2) {
            addCriterion("sbc_id between", value1, value2, "sbcId");
            return (Criteria) this;
        }

        public Criteria andSbcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sbc_id not between", value1, value2, "sbcId");
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

        public Criteria andCommisRateIsNull() {
            addCriterion("commis_rate is null");
            return (Criteria) this;
        }

        public Criteria andCommisRateIsNotNull() {
            addCriterion("commis_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCommisRateEqualTo(Byte value) {
            addCriterion("commis_rate =", value, "commisRate");
            return (Criteria) this;
        }

        public Criteria andCommisRateNotEqualTo(Byte value) {
            addCriterion("commis_rate <>", value, "commisRate");
            return (Criteria) this;
        }

        public Criteria andCommisRateGreaterThan(Byte value) {
            addCriterion("commis_rate >", value, "commisRate");
            return (Criteria) this;
        }

        public Criteria andCommisRateGreaterThanOrEqualTo(Byte value) {
            addCriterion("commis_rate >=", value, "commisRate");
            return (Criteria) this;
        }

        public Criteria andCommisRateLessThan(Byte value) {
            addCriterion("commis_rate <", value, "commisRate");
            return (Criteria) this;
        }

        public Criteria andCommisRateLessThanOrEqualTo(Byte value) {
            addCriterion("commis_rate <=", value, "commisRate");
            return (Criteria) this;
        }

        public Criteria andCommisRateIn(List<Byte> values) {
            addCriterion("commis_rate in", values, "commisRate");
            return (Criteria) this;
        }

        public Criteria andCommisRateNotIn(List<Byte> values) {
            addCriterion("commis_rate not in", values, "commisRate");
            return (Criteria) this;
        }

        public Criteria andCommisRateBetween(Byte value1, Byte value2) {
            addCriterion("commis_rate between", value1, value2, "commisRate");
            return (Criteria) this;
        }

        public Criteria andCommisRateNotBetween(Byte value1, Byte value2) {
            addCriterion("commis_rate not between", value1, value2, "commisRate");
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

        public Criteria andSbcStatusIsNull() {
            addCriterion("sbc_status is null");
            return (Criteria) this;
        }

        public Criteria andSbcStatusIsNotNull() {
            addCriterion("sbc_status is not null");
            return (Criteria) this;
        }

        public Criteria andSbcStatusEqualTo(Byte value) {
            addCriterion("sbc_status =", value, "sbcStatus");
            return (Criteria) this;
        }

        public Criteria andSbcStatusNotEqualTo(Byte value) {
            addCriterion("sbc_status <>", value, "sbcStatus");
            return (Criteria) this;
        }

        public Criteria andSbcStatusGreaterThan(Byte value) {
            addCriterion("sbc_status >", value, "sbcStatus");
            return (Criteria) this;
        }

        public Criteria andSbcStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("sbc_status >=", value, "sbcStatus");
            return (Criteria) this;
        }

        public Criteria andSbcStatusLessThan(Byte value) {
            addCriterion("sbc_status <", value, "sbcStatus");
            return (Criteria) this;
        }

        public Criteria andSbcStatusLessThanOrEqualTo(Byte value) {
            addCriterion("sbc_status <=", value, "sbcStatus");
            return (Criteria) this;
        }

        public Criteria andSbcStatusIn(List<Byte> values) {
            addCriterion("sbc_status in", values, "sbcStatus");
            return (Criteria) this;
        }

        public Criteria andSbcStatusNotIn(List<Byte> values) {
            addCriterion("sbc_status not in", values, "sbcStatus");
            return (Criteria) this;
        }

        public Criteria andSbcStatusBetween(Byte value1, Byte value2) {
            addCriterion("sbc_status between", value1, value2, "sbcStatus");
            return (Criteria) this;
        }

        public Criteria andSbcStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("sbc_status not between", value1, value2, "sbcStatus");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 店铺可发布商品类目表
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