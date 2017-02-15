/*
 * DshopStoreRepeatOpenExample.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.bean.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DshopStoreRepeatOpenExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DshopStoreRepeatOpenExample() {
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
     * 店铺续签表
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

        public Criteria andRepeatIdIsNull() {
            addCriterion("repeat_id is null");
            return (Criteria) this;
        }

        public Criteria andRepeatIdIsNotNull() {
            addCriterion("repeat_id is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatIdEqualTo(Integer value) {
            addCriterion("repeat_id =", value, "repeatId");
            return (Criteria) this;
        }

        public Criteria andRepeatIdNotEqualTo(Integer value) {
            addCriterion("repeat_id <>", value, "repeatId");
            return (Criteria) this;
        }

        public Criteria andRepeatIdGreaterThan(Integer value) {
            addCriterion("repeat_id >", value, "repeatId");
            return (Criteria) this;
        }

        public Criteria andRepeatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("repeat_id >=", value, "repeatId");
            return (Criteria) this;
        }

        public Criteria andRepeatIdLessThan(Integer value) {
            addCriterion("repeat_id <", value, "repeatId");
            return (Criteria) this;
        }

        public Criteria andRepeatIdLessThanOrEqualTo(Integer value) {
            addCriterion("repeat_id <=", value, "repeatId");
            return (Criteria) this;
        }

        public Criteria andRepeatIdIn(List<Integer> values) {
            addCriterion("repeat_id in", values, "repeatId");
            return (Criteria) this;
        }

        public Criteria andRepeatIdNotIn(List<Integer> values) {
            addCriterion("repeat_id not in", values, "repeatId");
            return (Criteria) this;
        }

        public Criteria andRepeatIdBetween(Integer value1, Integer value2) {
            addCriterion("repeat_id between", value1, value2, "repeatId");
            return (Criteria) this;
        }

        public Criteria andRepeatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("repeat_id not between", value1, value2, "repeatId");
            return (Criteria) this;
        }

        public Criteria andRepeatStoreIdIsNull() {
            addCriterion("repeat_store_id is null");
            return (Criteria) this;
        }

        public Criteria andRepeatStoreIdIsNotNull() {
            addCriterion("repeat_store_id is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatStoreIdEqualTo(Integer value) {
            addCriterion("repeat_store_id =", value, "repeatStoreId");
            return (Criteria) this;
        }

        public Criteria andRepeatStoreIdNotEqualTo(Integer value) {
            addCriterion("repeat_store_id <>", value, "repeatStoreId");
            return (Criteria) this;
        }

        public Criteria andRepeatStoreIdGreaterThan(Integer value) {
            addCriterion("repeat_store_id >", value, "repeatStoreId");
            return (Criteria) this;
        }

        public Criteria andRepeatStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("repeat_store_id >=", value, "repeatStoreId");
            return (Criteria) this;
        }

        public Criteria andRepeatStoreIdLessThan(Integer value) {
            addCriterion("repeat_store_id <", value, "repeatStoreId");
            return (Criteria) this;
        }

        public Criteria andRepeatStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("repeat_store_id <=", value, "repeatStoreId");
            return (Criteria) this;
        }

        public Criteria andRepeatStoreIdIn(List<Integer> values) {
            addCriterion("repeat_store_id in", values, "repeatStoreId");
            return (Criteria) this;
        }

        public Criteria andRepeatStoreIdNotIn(List<Integer> values) {
            addCriterion("repeat_store_id not in", values, "repeatStoreId");
            return (Criteria) this;
        }

        public Criteria andRepeatStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("repeat_store_id between", value1, value2, "repeatStoreId");
            return (Criteria) this;
        }

        public Criteria andRepeatStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("repeat_store_id not between", value1, value2, "repeatStoreId");
            return (Criteria) this;
        }

        public Criteria andRepeatStoreNameIsNull() {
            addCriterion("repeat_store_name is null");
            return (Criteria) this;
        }

        public Criteria andRepeatStoreNameIsNotNull() {
            addCriterion("repeat_store_name is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatStoreNameEqualTo(String value) {
            addCriterion("repeat_store_name =", value, "repeatStoreName");
            return (Criteria) this;
        }

        public Criteria andRepeatStoreNameNotEqualTo(String value) {
            addCriterion("repeat_store_name <>", value, "repeatStoreName");
            return (Criteria) this;
        }

        public Criteria andRepeatStoreNameGreaterThan(String value) {
            addCriterion("repeat_store_name >", value, "repeatStoreName");
            return (Criteria) this;
        }

        public Criteria andRepeatStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("repeat_store_name >=", value, "repeatStoreName");
            return (Criteria) this;
        }

        public Criteria andRepeatStoreNameLessThan(String value) {
            addCriterion("repeat_store_name <", value, "repeatStoreName");
            return (Criteria) this;
        }

        public Criteria andRepeatStoreNameLessThanOrEqualTo(String value) {
            addCriterion("repeat_store_name <=", value, "repeatStoreName");
            return (Criteria) this;
        }

        public Criteria andRepeatStoreNameLike(String value) {
            addCriterion("repeat_store_name like", value, "repeatStoreName");
            return (Criteria) this;
        }

        public Criteria andRepeatStoreNameNotLike(String value) {
            addCriterion("repeat_store_name not like", value, "repeatStoreName");
            return (Criteria) this;
        }

        public Criteria andRepeatStoreNameIn(List<String> values) {
            addCriterion("repeat_store_name in", values, "repeatStoreName");
            return (Criteria) this;
        }

        public Criteria andRepeatStoreNameNotIn(List<String> values) {
            addCriterion("repeat_store_name not in", values, "repeatStoreName");
            return (Criteria) this;
        }

        public Criteria andRepeatStoreNameBetween(String value1, String value2) {
            addCriterion("repeat_store_name between", value1, value2, "repeatStoreName");
            return (Criteria) this;
        }

        public Criteria andRepeatStoreNameNotBetween(String value1, String value2) {
            addCriterion("repeat_store_name not between", value1, value2, "repeatStoreName");
            return (Criteria) this;
        }

        public Criteria andRepeatGradeIdIsNull() {
            addCriterion("repeat_grade_id is null");
            return (Criteria) this;
        }

        public Criteria andRepeatGradeIdIsNotNull() {
            addCriterion("repeat_grade_id is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatGradeIdEqualTo(Short value) {
            addCriterion("repeat_grade_id =", value, "repeatGradeId");
            return (Criteria) this;
        }

        public Criteria andRepeatGradeIdNotEqualTo(Short value) {
            addCriterion("repeat_grade_id <>", value, "repeatGradeId");
            return (Criteria) this;
        }

        public Criteria andRepeatGradeIdGreaterThan(Short value) {
            addCriterion("repeat_grade_id >", value, "repeatGradeId");
            return (Criteria) this;
        }

        public Criteria andRepeatGradeIdGreaterThanOrEqualTo(Short value) {
            addCriterion("repeat_grade_id >=", value, "repeatGradeId");
            return (Criteria) this;
        }

        public Criteria andRepeatGradeIdLessThan(Short value) {
            addCriterion("repeat_grade_id <", value, "repeatGradeId");
            return (Criteria) this;
        }

        public Criteria andRepeatGradeIdLessThanOrEqualTo(Short value) {
            addCriterion("repeat_grade_id <=", value, "repeatGradeId");
            return (Criteria) this;
        }

        public Criteria andRepeatGradeIdIn(List<Short> values) {
            addCriterion("repeat_grade_id in", values, "repeatGradeId");
            return (Criteria) this;
        }

        public Criteria andRepeatGradeIdNotIn(List<Short> values) {
            addCriterion("repeat_grade_id not in", values, "repeatGradeId");
            return (Criteria) this;
        }

        public Criteria andRepeatGradeIdBetween(Short value1, Short value2) {
            addCriterion("repeat_grade_id between", value1, value2, "repeatGradeId");
            return (Criteria) this;
        }

        public Criteria andRepeatGradeIdNotBetween(Short value1, Short value2) {
            addCriterion("repeat_grade_id not between", value1, value2, "repeatGradeId");
            return (Criteria) this;
        }

        public Criteria andRepeatGradeNameIsNull() {
            addCriterion("repeat_grade_name is null");
            return (Criteria) this;
        }

        public Criteria andRepeatGradeNameIsNotNull() {
            addCriterion("repeat_grade_name is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatGradeNameEqualTo(String value) {
            addCriterion("repeat_grade_name =", value, "repeatGradeName");
            return (Criteria) this;
        }

        public Criteria andRepeatGradeNameNotEqualTo(String value) {
            addCriterion("repeat_grade_name <>", value, "repeatGradeName");
            return (Criteria) this;
        }

        public Criteria andRepeatGradeNameGreaterThan(String value) {
            addCriterion("repeat_grade_name >", value, "repeatGradeName");
            return (Criteria) this;
        }

        public Criteria andRepeatGradeNameGreaterThanOrEqualTo(String value) {
            addCriterion("repeat_grade_name >=", value, "repeatGradeName");
            return (Criteria) this;
        }

        public Criteria andRepeatGradeNameLessThan(String value) {
            addCriterion("repeat_grade_name <", value, "repeatGradeName");
            return (Criteria) this;
        }

        public Criteria andRepeatGradeNameLessThanOrEqualTo(String value) {
            addCriterion("repeat_grade_name <=", value, "repeatGradeName");
            return (Criteria) this;
        }

        public Criteria andRepeatGradeNameLike(String value) {
            addCriterion("repeat_grade_name like", value, "repeatGradeName");
            return (Criteria) this;
        }

        public Criteria andRepeatGradeNameNotLike(String value) {
            addCriterion("repeat_grade_name not like", value, "repeatGradeName");
            return (Criteria) this;
        }

        public Criteria andRepeatGradeNameIn(List<String> values) {
            addCriterion("repeat_grade_name in", values, "repeatGradeName");
            return (Criteria) this;
        }

        public Criteria andRepeatGradeNameNotIn(List<String> values) {
            addCriterion("repeat_grade_name not in", values, "repeatGradeName");
            return (Criteria) this;
        }

        public Criteria andRepeatGradeNameBetween(String value1, String value2) {
            addCriterion("repeat_grade_name between", value1, value2, "repeatGradeName");
            return (Criteria) this;
        }

        public Criteria andRepeatGradeNameNotBetween(String value1, String value2) {
            addCriterion("repeat_grade_name not between", value1, value2, "repeatGradeName");
            return (Criteria) this;
        }

        public Criteria andRepeatGradePriceIsNull() {
            addCriterion("repeat_grade_price is null");
            return (Criteria) this;
        }

        public Criteria andRepeatGradePriceIsNotNull() {
            addCriterion("repeat_grade_price is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatGradePriceEqualTo(BigDecimal value) {
            addCriterion("repeat_grade_price =", value, "repeatGradePrice");
            return (Criteria) this;
        }

        public Criteria andRepeatGradePriceNotEqualTo(BigDecimal value) {
            addCriterion("repeat_grade_price <>", value, "repeatGradePrice");
            return (Criteria) this;
        }

        public Criteria andRepeatGradePriceGreaterThan(BigDecimal value) {
            addCriterion("repeat_grade_price >", value, "repeatGradePrice");
            return (Criteria) this;
        }

        public Criteria andRepeatGradePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repeat_grade_price >=", value, "repeatGradePrice");
            return (Criteria) this;
        }

        public Criteria andRepeatGradePriceLessThan(BigDecimal value) {
            addCriterion("repeat_grade_price <", value, "repeatGradePrice");
            return (Criteria) this;
        }

        public Criteria andRepeatGradePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repeat_grade_price <=", value, "repeatGradePrice");
            return (Criteria) this;
        }

        public Criteria andRepeatGradePriceIn(List<BigDecimal> values) {
            addCriterion("repeat_grade_price in", values, "repeatGradePrice");
            return (Criteria) this;
        }

        public Criteria andRepeatGradePriceNotIn(List<BigDecimal> values) {
            addCriterion("repeat_grade_price not in", values, "repeatGradePrice");
            return (Criteria) this;
        }

        public Criteria andRepeatGradePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repeat_grade_price between", value1, value2, "repeatGradePrice");
            return (Criteria) this;
        }

        public Criteria andRepeatGradePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repeat_grade_price not between", value1, value2, "repeatGradePrice");
            return (Criteria) this;
        }

        public Criteria andRepeatYearIsNull() {
            addCriterion("repeat_year is null");
            return (Criteria) this;
        }

        public Criteria andRepeatYearIsNotNull() {
            addCriterion("repeat_year is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatYearEqualTo(Byte value) {
            addCriterion("repeat_year =", value, "repeatYear");
            return (Criteria) this;
        }

        public Criteria andRepeatYearNotEqualTo(Byte value) {
            addCriterion("repeat_year <>", value, "repeatYear");
            return (Criteria) this;
        }

        public Criteria andRepeatYearGreaterThan(Byte value) {
            addCriterion("repeat_year >", value, "repeatYear");
            return (Criteria) this;
        }

        public Criteria andRepeatYearGreaterThanOrEqualTo(Byte value) {
            addCriterion("repeat_year >=", value, "repeatYear");
            return (Criteria) this;
        }

        public Criteria andRepeatYearLessThan(Byte value) {
            addCriterion("repeat_year <", value, "repeatYear");
            return (Criteria) this;
        }

        public Criteria andRepeatYearLessThanOrEqualTo(Byte value) {
            addCriterion("repeat_year <=", value, "repeatYear");
            return (Criteria) this;
        }

        public Criteria andRepeatYearIn(List<Byte> values) {
            addCriterion("repeat_year in", values, "repeatYear");
            return (Criteria) this;
        }

        public Criteria andRepeatYearNotIn(List<Byte> values) {
            addCriterion("repeat_year not in", values, "repeatYear");
            return (Criteria) this;
        }

        public Criteria andRepeatYearBetween(Byte value1, Byte value2) {
            addCriterion("repeat_year between", value1, value2, "repeatYear");
            return (Criteria) this;
        }

        public Criteria andRepeatYearNotBetween(Byte value1, Byte value2) {
            addCriterion("repeat_year not between", value1, value2, "repeatYear");
            return (Criteria) this;
        }

        public Criteria andRepeatStartTimeIsNull() {
            addCriterion("repeat_start_time is null");
            return (Criteria) this;
        }

        public Criteria andRepeatStartTimeIsNotNull() {
            addCriterion("repeat_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatStartTimeEqualTo(Integer value) {
            addCriterion("repeat_start_time =", value, "repeatStartTime");
            return (Criteria) this;
        }

        public Criteria andRepeatStartTimeNotEqualTo(Integer value) {
            addCriterion("repeat_start_time <>", value, "repeatStartTime");
            return (Criteria) this;
        }

        public Criteria andRepeatStartTimeGreaterThan(Integer value) {
            addCriterion("repeat_start_time >", value, "repeatStartTime");
            return (Criteria) this;
        }

        public Criteria andRepeatStartTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("repeat_start_time >=", value, "repeatStartTime");
            return (Criteria) this;
        }

        public Criteria andRepeatStartTimeLessThan(Integer value) {
            addCriterion("repeat_start_time <", value, "repeatStartTime");
            return (Criteria) this;
        }

        public Criteria andRepeatStartTimeLessThanOrEqualTo(Integer value) {
            addCriterion("repeat_start_time <=", value, "repeatStartTime");
            return (Criteria) this;
        }

        public Criteria andRepeatStartTimeIn(List<Integer> values) {
            addCriterion("repeat_start_time in", values, "repeatStartTime");
            return (Criteria) this;
        }

        public Criteria andRepeatStartTimeNotIn(List<Integer> values) {
            addCriterion("repeat_start_time not in", values, "repeatStartTime");
            return (Criteria) this;
        }

        public Criteria andRepeatStartTimeBetween(Integer value1, Integer value2) {
            addCriterion("repeat_start_time between", value1, value2, "repeatStartTime");
            return (Criteria) this;
        }

        public Criteria andRepeatStartTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("repeat_start_time not between", value1, value2, "repeatStartTime");
            return (Criteria) this;
        }

        public Criteria andRepeatEndTimeIsNull() {
            addCriterion("repeat_end_time is null");
            return (Criteria) this;
        }

        public Criteria andRepeatEndTimeIsNotNull() {
            addCriterion("repeat_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatEndTimeEqualTo(Integer value) {
            addCriterion("repeat_end_time =", value, "repeatEndTime");
            return (Criteria) this;
        }

        public Criteria andRepeatEndTimeNotEqualTo(Integer value) {
            addCriterion("repeat_end_time <>", value, "repeatEndTime");
            return (Criteria) this;
        }

        public Criteria andRepeatEndTimeGreaterThan(Integer value) {
            addCriterion("repeat_end_time >", value, "repeatEndTime");
            return (Criteria) this;
        }

        public Criteria andRepeatEndTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("repeat_end_time >=", value, "repeatEndTime");
            return (Criteria) this;
        }

        public Criteria andRepeatEndTimeLessThan(Integer value) {
            addCriterion("repeat_end_time <", value, "repeatEndTime");
            return (Criteria) this;
        }

        public Criteria andRepeatEndTimeLessThanOrEqualTo(Integer value) {
            addCriterion("repeat_end_time <=", value, "repeatEndTime");
            return (Criteria) this;
        }

        public Criteria andRepeatEndTimeIn(List<Integer> values) {
            addCriterion("repeat_end_time in", values, "repeatEndTime");
            return (Criteria) this;
        }

        public Criteria andRepeatEndTimeNotIn(List<Integer> values) {
            addCriterion("repeat_end_time not in", values, "repeatEndTime");
            return (Criteria) this;
        }

        public Criteria andRepeatEndTimeBetween(Integer value1, Integer value2) {
            addCriterion("repeat_end_time between", value1, value2, "repeatEndTime");
            return (Criteria) this;
        }

        public Criteria andRepeatEndTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("repeat_end_time not between", value1, value2, "repeatEndTime");
            return (Criteria) this;
        }

        public Criteria andRepeatPayAmountIsNull() {
            addCriterion("repeat_pay_amount is null");
            return (Criteria) this;
        }

        public Criteria andRepeatPayAmountIsNotNull() {
            addCriterion("repeat_pay_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatPayAmountEqualTo(BigDecimal value) {
            addCriterion("repeat_pay_amount =", value, "repeatPayAmount");
            return (Criteria) this;
        }

        public Criteria andRepeatPayAmountNotEqualTo(BigDecimal value) {
            addCriterion("repeat_pay_amount <>", value, "repeatPayAmount");
            return (Criteria) this;
        }

        public Criteria andRepeatPayAmountGreaterThan(BigDecimal value) {
            addCriterion("repeat_pay_amount >", value, "repeatPayAmount");
            return (Criteria) this;
        }

        public Criteria andRepeatPayAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repeat_pay_amount >=", value, "repeatPayAmount");
            return (Criteria) this;
        }

        public Criteria andRepeatPayAmountLessThan(BigDecimal value) {
            addCriterion("repeat_pay_amount <", value, "repeatPayAmount");
            return (Criteria) this;
        }

        public Criteria andRepeatPayAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repeat_pay_amount <=", value, "repeatPayAmount");
            return (Criteria) this;
        }

        public Criteria andRepeatPayAmountIn(List<BigDecimal> values) {
            addCriterion("repeat_pay_amount in", values, "repeatPayAmount");
            return (Criteria) this;
        }

        public Criteria andRepeatPayAmountNotIn(List<BigDecimal> values) {
            addCriterion("repeat_pay_amount not in", values, "repeatPayAmount");
            return (Criteria) this;
        }

        public Criteria andRepeatPayAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repeat_pay_amount between", value1, value2, "repeatPayAmount");
            return (Criteria) this;
        }

        public Criteria andRepeatPayAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repeat_pay_amount not between", value1, value2, "repeatPayAmount");
            return (Criteria) this;
        }

        public Criteria andRepeatPayCertIsNull() {
            addCriterion("repeat_pay_cert is null");
            return (Criteria) this;
        }

        public Criteria andRepeatPayCertIsNotNull() {
            addCriterion("repeat_pay_cert is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatPayCertEqualTo(String value) {
            addCriterion("repeat_pay_cert =", value, "repeatPayCert");
            return (Criteria) this;
        }

        public Criteria andRepeatPayCertNotEqualTo(String value) {
            addCriterion("repeat_pay_cert <>", value, "repeatPayCert");
            return (Criteria) this;
        }

        public Criteria andRepeatPayCertGreaterThan(String value) {
            addCriterion("repeat_pay_cert >", value, "repeatPayCert");
            return (Criteria) this;
        }

        public Criteria andRepeatPayCertGreaterThanOrEqualTo(String value) {
            addCriterion("repeat_pay_cert >=", value, "repeatPayCert");
            return (Criteria) this;
        }

        public Criteria andRepeatPayCertLessThan(String value) {
            addCriterion("repeat_pay_cert <", value, "repeatPayCert");
            return (Criteria) this;
        }

        public Criteria andRepeatPayCertLessThanOrEqualTo(String value) {
            addCriterion("repeat_pay_cert <=", value, "repeatPayCert");
            return (Criteria) this;
        }

        public Criteria andRepeatPayCertLike(String value) {
            addCriterion("repeat_pay_cert like", value, "repeatPayCert");
            return (Criteria) this;
        }

        public Criteria andRepeatPayCertNotLike(String value) {
            addCriterion("repeat_pay_cert not like", value, "repeatPayCert");
            return (Criteria) this;
        }

        public Criteria andRepeatPayCertIn(List<String> values) {
            addCriterion("repeat_pay_cert in", values, "repeatPayCert");
            return (Criteria) this;
        }

        public Criteria andRepeatPayCertNotIn(List<String> values) {
            addCriterion("repeat_pay_cert not in", values, "repeatPayCert");
            return (Criteria) this;
        }

        public Criteria andRepeatPayCertBetween(String value1, String value2) {
            addCriterion("repeat_pay_cert between", value1, value2, "repeatPayCert");
            return (Criteria) this;
        }

        public Criteria andRepeatPayCertNotBetween(String value1, String value2) {
            addCriterion("repeat_pay_cert not between", value1, value2, "repeatPayCert");
            return (Criteria) this;
        }

        public Criteria andRepeatPayCertExplainIsNull() {
            addCriterion("repeat_pay_cert_explain is null");
            return (Criteria) this;
        }

        public Criteria andRepeatPayCertExplainIsNotNull() {
            addCriterion("repeat_pay_cert_explain is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatPayCertExplainEqualTo(String value) {
            addCriterion("repeat_pay_cert_explain =", value, "repeatPayCertExplain");
            return (Criteria) this;
        }

        public Criteria andRepeatPayCertExplainNotEqualTo(String value) {
            addCriterion("repeat_pay_cert_explain <>", value, "repeatPayCertExplain");
            return (Criteria) this;
        }

        public Criteria andRepeatPayCertExplainGreaterThan(String value) {
            addCriterion("repeat_pay_cert_explain >", value, "repeatPayCertExplain");
            return (Criteria) this;
        }

        public Criteria andRepeatPayCertExplainGreaterThanOrEqualTo(String value) {
            addCriterion("repeat_pay_cert_explain >=", value, "repeatPayCertExplain");
            return (Criteria) this;
        }

        public Criteria andRepeatPayCertExplainLessThan(String value) {
            addCriterion("repeat_pay_cert_explain <", value, "repeatPayCertExplain");
            return (Criteria) this;
        }

        public Criteria andRepeatPayCertExplainLessThanOrEqualTo(String value) {
            addCriterion("repeat_pay_cert_explain <=", value, "repeatPayCertExplain");
            return (Criteria) this;
        }

        public Criteria andRepeatPayCertExplainLike(String value) {
            addCriterion("repeat_pay_cert_explain like", value, "repeatPayCertExplain");
            return (Criteria) this;
        }

        public Criteria andRepeatPayCertExplainNotLike(String value) {
            addCriterion("repeat_pay_cert_explain not like", value, "repeatPayCertExplain");
            return (Criteria) this;
        }

        public Criteria andRepeatPayCertExplainIn(List<String> values) {
            addCriterion("repeat_pay_cert_explain in", values, "repeatPayCertExplain");
            return (Criteria) this;
        }

        public Criteria andRepeatPayCertExplainNotIn(List<String> values) {
            addCriterion("repeat_pay_cert_explain not in", values, "repeatPayCertExplain");
            return (Criteria) this;
        }

        public Criteria andRepeatPayCertExplainBetween(String value1, String value2) {
            addCriterion("repeat_pay_cert_explain between", value1, value2, "repeatPayCertExplain");
            return (Criteria) this;
        }

        public Criteria andRepeatPayCertExplainNotBetween(String value1, String value2) {
            addCriterion("repeat_pay_cert_explain not between", value1, value2, "repeatPayCertExplain");
            return (Criteria) this;
        }

        public Criteria andRepeatCreateTimeIsNull() {
            addCriterion("repeat_create_time is null");
            return (Criteria) this;
        }

        public Criteria andRepeatCreateTimeIsNotNull() {
            addCriterion("repeat_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatCreateTimeEqualTo(Integer value) {
            addCriterion("repeat_create_time =", value, "repeatCreateTime");
            return (Criteria) this;
        }

        public Criteria andRepeatCreateTimeNotEqualTo(Integer value) {
            addCriterion("repeat_create_time <>", value, "repeatCreateTime");
            return (Criteria) this;
        }

        public Criteria andRepeatCreateTimeGreaterThan(Integer value) {
            addCriterion("repeat_create_time >", value, "repeatCreateTime");
            return (Criteria) this;
        }

        public Criteria andRepeatCreateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("repeat_create_time >=", value, "repeatCreateTime");
            return (Criteria) this;
        }

        public Criteria andRepeatCreateTimeLessThan(Integer value) {
            addCriterion("repeat_create_time <", value, "repeatCreateTime");
            return (Criteria) this;
        }

        public Criteria andRepeatCreateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("repeat_create_time <=", value, "repeatCreateTime");
            return (Criteria) this;
        }

        public Criteria andRepeatCreateTimeIn(List<Integer> values) {
            addCriterion("repeat_create_time in", values, "repeatCreateTime");
            return (Criteria) this;
        }

        public Criteria andRepeatCreateTimeNotIn(List<Integer> values) {
            addCriterion("repeat_create_time not in", values, "repeatCreateTime");
            return (Criteria) this;
        }

        public Criteria andRepeatCreateTimeBetween(Integer value1, Integer value2) {
            addCriterion("repeat_create_time between", value1, value2, "repeatCreateTime");
            return (Criteria) this;
        }

        public Criteria andRepeatCreateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("repeat_create_time not between", value1, value2, "repeatCreateTime");
            return (Criteria) this;
        }

        public Criteria andRepeatStatusIsNull() {
            addCriterion("repeat_status is null");
            return (Criteria) this;
        }

        public Criteria andRepeatStatusIsNotNull() {
            addCriterion("repeat_status is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatStatusEqualTo(Byte value) {
            addCriterion("repeat_status =", value, "repeatStatus");
            return (Criteria) this;
        }

        public Criteria andRepeatStatusNotEqualTo(Byte value) {
            addCriterion("repeat_status <>", value, "repeatStatus");
            return (Criteria) this;
        }

        public Criteria andRepeatStatusGreaterThan(Byte value) {
            addCriterion("repeat_status >", value, "repeatStatus");
            return (Criteria) this;
        }

        public Criteria andRepeatStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("repeat_status >=", value, "repeatStatus");
            return (Criteria) this;
        }

        public Criteria andRepeatStatusLessThan(Byte value) {
            addCriterion("repeat_status <", value, "repeatStatus");
            return (Criteria) this;
        }

        public Criteria andRepeatStatusLessThanOrEqualTo(Byte value) {
            addCriterion("repeat_status <=", value, "repeatStatus");
            return (Criteria) this;
        }

        public Criteria andRepeatStatusIn(List<Byte> values) {
            addCriterion("repeat_status in", values, "repeatStatus");
            return (Criteria) this;
        }

        public Criteria andRepeatStatusNotIn(List<Byte> values) {
            addCriterion("repeat_status not in", values, "repeatStatus");
            return (Criteria) this;
        }

        public Criteria andRepeatStatusBetween(Byte value1, Byte value2) {
            addCriterion("repeat_status between", value1, value2, "repeatStatus");
            return (Criteria) this;
        }

        public Criteria andRepeatStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("repeat_status not between", value1, value2, "repeatStatus");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 店铺续签表
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