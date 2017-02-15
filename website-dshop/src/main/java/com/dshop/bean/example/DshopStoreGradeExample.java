/*
 * DshopStoreGradeExample.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.bean.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DshopStoreGradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DshopStoreGradeExample() {
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
     * 店铺等级表
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

        public Criteria andGradeIdIsNull() {
            addCriterion("grade_id is null");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNotNull() {
            addCriterion("grade_id is not null");
            return (Criteria) this;
        }

        public Criteria andGradeIdEqualTo(Integer value) {
            addCriterion("grade_id =", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotEqualTo(Integer value) {
            addCriterion("grade_id <>", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThan(Integer value) {
            addCriterion("grade_id >", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade_id >=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThan(Integer value) {
            addCriterion("grade_id <", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThanOrEqualTo(Integer value) {
            addCriterion("grade_id <=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdIn(List<Integer> values) {
            addCriterion("grade_id in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotIn(List<Integer> values) {
            addCriterion("grade_id not in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdBetween(Integer value1, Integer value2) {
            addCriterion("grade_id between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("grade_id not between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeNameIsNull() {
            addCriterion("grade_name is null");
            return (Criteria) this;
        }

        public Criteria andGradeNameIsNotNull() {
            addCriterion("grade_name is not null");
            return (Criteria) this;
        }

        public Criteria andGradeNameEqualTo(String value) {
            addCriterion("grade_name =", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotEqualTo(String value) {
            addCriterion("grade_name <>", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameGreaterThan(String value) {
            addCriterion("grade_name >", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameGreaterThanOrEqualTo(String value) {
            addCriterion("grade_name >=", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameLessThan(String value) {
            addCriterion("grade_name <", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameLessThanOrEqualTo(String value) {
            addCriterion("grade_name <=", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameLike(String value) {
            addCriterion("grade_name like", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotLike(String value) {
            addCriterion("grade_name not like", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameIn(List<String> values) {
            addCriterion("grade_name in", values, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotIn(List<String> values) {
            addCriterion("grade_name not in", values, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameBetween(String value1, String value2) {
            addCriterion("grade_name between", value1, value2, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotBetween(String value1, String value2) {
            addCriterion("grade_name not between", value1, value2, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeGoodsLimitIsNull() {
            addCriterion("grade_goods_limit is null");
            return (Criteria) this;
        }

        public Criteria andGradeGoodsLimitIsNotNull() {
            addCriterion("grade_goods_limit is not null");
            return (Criteria) this;
        }

        public Criteria andGradeGoodsLimitEqualTo(Integer value) {
            addCriterion("grade_goods_limit =", value, "gradeGoodsLimit");
            return (Criteria) this;
        }

        public Criteria andGradeGoodsLimitNotEqualTo(Integer value) {
            addCriterion("grade_goods_limit <>", value, "gradeGoodsLimit");
            return (Criteria) this;
        }

        public Criteria andGradeGoodsLimitGreaterThan(Integer value) {
            addCriterion("grade_goods_limit >", value, "gradeGoodsLimit");
            return (Criteria) this;
        }

        public Criteria andGradeGoodsLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade_goods_limit >=", value, "gradeGoodsLimit");
            return (Criteria) this;
        }

        public Criteria andGradeGoodsLimitLessThan(Integer value) {
            addCriterion("grade_goods_limit <", value, "gradeGoodsLimit");
            return (Criteria) this;
        }

        public Criteria andGradeGoodsLimitLessThanOrEqualTo(Integer value) {
            addCriterion("grade_goods_limit <=", value, "gradeGoodsLimit");
            return (Criteria) this;
        }

        public Criteria andGradeGoodsLimitIn(List<Integer> values) {
            addCriterion("grade_goods_limit in", values, "gradeGoodsLimit");
            return (Criteria) this;
        }

        public Criteria andGradeGoodsLimitNotIn(List<Integer> values) {
            addCriterion("grade_goods_limit not in", values, "gradeGoodsLimit");
            return (Criteria) this;
        }

        public Criteria andGradeGoodsLimitBetween(Integer value1, Integer value2) {
            addCriterion("grade_goods_limit between", value1, value2, "gradeGoodsLimit");
            return (Criteria) this;
        }

        public Criteria andGradeGoodsLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("grade_goods_limit not between", value1, value2, "gradeGoodsLimit");
            return (Criteria) this;
        }

        public Criteria andGradeAlbumLimitIsNull() {
            addCriterion("grade_album_limit is null");
            return (Criteria) this;
        }

        public Criteria andGradeAlbumLimitIsNotNull() {
            addCriterion("grade_album_limit is not null");
            return (Criteria) this;
        }

        public Criteria andGradeAlbumLimitEqualTo(Integer value) {
            addCriterion("grade_album_limit =", value, "gradeAlbumLimit");
            return (Criteria) this;
        }

        public Criteria andGradeAlbumLimitNotEqualTo(Integer value) {
            addCriterion("grade_album_limit <>", value, "gradeAlbumLimit");
            return (Criteria) this;
        }

        public Criteria andGradeAlbumLimitGreaterThan(Integer value) {
            addCriterion("grade_album_limit >", value, "gradeAlbumLimit");
            return (Criteria) this;
        }

        public Criteria andGradeAlbumLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade_album_limit >=", value, "gradeAlbumLimit");
            return (Criteria) this;
        }

        public Criteria andGradeAlbumLimitLessThan(Integer value) {
            addCriterion("grade_album_limit <", value, "gradeAlbumLimit");
            return (Criteria) this;
        }

        public Criteria andGradeAlbumLimitLessThanOrEqualTo(Integer value) {
            addCriterion("grade_album_limit <=", value, "gradeAlbumLimit");
            return (Criteria) this;
        }

        public Criteria andGradeAlbumLimitIn(List<Integer> values) {
            addCriterion("grade_album_limit in", values, "gradeAlbumLimit");
            return (Criteria) this;
        }

        public Criteria andGradeAlbumLimitNotIn(List<Integer> values) {
            addCriterion("grade_album_limit not in", values, "gradeAlbumLimit");
            return (Criteria) this;
        }

        public Criteria andGradeAlbumLimitBetween(Integer value1, Integer value2) {
            addCriterion("grade_album_limit between", value1, value2, "gradeAlbumLimit");
            return (Criteria) this;
        }

        public Criteria andGradeAlbumLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("grade_album_limit not between", value1, value2, "gradeAlbumLimit");
            return (Criteria) this;
        }

        public Criteria andGradeSpaceLimitIsNull() {
            addCriterion("grade_space_limit is null");
            return (Criteria) this;
        }

        public Criteria andGradeSpaceLimitIsNotNull() {
            addCriterion("grade_space_limit is not null");
            return (Criteria) this;
        }

        public Criteria andGradeSpaceLimitEqualTo(Integer value) {
            addCriterion("grade_space_limit =", value, "gradeSpaceLimit");
            return (Criteria) this;
        }

        public Criteria andGradeSpaceLimitNotEqualTo(Integer value) {
            addCriterion("grade_space_limit <>", value, "gradeSpaceLimit");
            return (Criteria) this;
        }

        public Criteria andGradeSpaceLimitGreaterThan(Integer value) {
            addCriterion("grade_space_limit >", value, "gradeSpaceLimit");
            return (Criteria) this;
        }

        public Criteria andGradeSpaceLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade_space_limit >=", value, "gradeSpaceLimit");
            return (Criteria) this;
        }

        public Criteria andGradeSpaceLimitLessThan(Integer value) {
            addCriterion("grade_space_limit <", value, "gradeSpaceLimit");
            return (Criteria) this;
        }

        public Criteria andGradeSpaceLimitLessThanOrEqualTo(Integer value) {
            addCriterion("grade_space_limit <=", value, "gradeSpaceLimit");
            return (Criteria) this;
        }

        public Criteria andGradeSpaceLimitIn(List<Integer> values) {
            addCriterion("grade_space_limit in", values, "gradeSpaceLimit");
            return (Criteria) this;
        }

        public Criteria andGradeSpaceLimitNotIn(List<Integer> values) {
            addCriterion("grade_space_limit not in", values, "gradeSpaceLimit");
            return (Criteria) this;
        }

        public Criteria andGradeSpaceLimitBetween(Integer value1, Integer value2) {
            addCriterion("grade_space_limit between", value1, value2, "gradeSpaceLimit");
            return (Criteria) this;
        }

        public Criteria andGradeSpaceLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("grade_space_limit not between", value1, value2, "gradeSpaceLimit");
            return (Criteria) this;
        }

        public Criteria andGradeTemplateNumberIsNull() {
            addCriterion("grade_template_number is null");
            return (Criteria) this;
        }

        public Criteria andGradeTemplateNumberIsNotNull() {
            addCriterion("grade_template_number is not null");
            return (Criteria) this;
        }

        public Criteria andGradeTemplateNumberEqualTo(Byte value) {
            addCriterion("grade_template_number =", value, "gradeTemplateNumber");
            return (Criteria) this;
        }

        public Criteria andGradeTemplateNumberNotEqualTo(Byte value) {
            addCriterion("grade_template_number <>", value, "gradeTemplateNumber");
            return (Criteria) this;
        }

        public Criteria andGradeTemplateNumberGreaterThan(Byte value) {
            addCriterion("grade_template_number >", value, "gradeTemplateNumber");
            return (Criteria) this;
        }

        public Criteria andGradeTemplateNumberGreaterThanOrEqualTo(Byte value) {
            addCriterion("grade_template_number >=", value, "gradeTemplateNumber");
            return (Criteria) this;
        }

        public Criteria andGradeTemplateNumberLessThan(Byte value) {
            addCriterion("grade_template_number <", value, "gradeTemplateNumber");
            return (Criteria) this;
        }

        public Criteria andGradeTemplateNumberLessThanOrEqualTo(Byte value) {
            addCriterion("grade_template_number <=", value, "gradeTemplateNumber");
            return (Criteria) this;
        }

        public Criteria andGradeTemplateNumberIn(List<Byte> values) {
            addCriterion("grade_template_number in", values, "gradeTemplateNumber");
            return (Criteria) this;
        }

        public Criteria andGradeTemplateNumberNotIn(List<Byte> values) {
            addCriterion("grade_template_number not in", values, "gradeTemplateNumber");
            return (Criteria) this;
        }

        public Criteria andGradeTemplateNumberBetween(Byte value1, Byte value2) {
            addCriterion("grade_template_number between", value1, value2, "gradeTemplateNumber");
            return (Criteria) this;
        }

        public Criteria andGradeTemplateNumberNotBetween(Byte value1, Byte value2) {
            addCriterion("grade_template_number not between", value1, value2, "gradeTemplateNumber");
            return (Criteria) this;
        }

        public Criteria andGradeTemplateIsNull() {
            addCriterion("grade_template is null");
            return (Criteria) this;
        }

        public Criteria andGradeTemplateIsNotNull() {
            addCriterion("grade_template is not null");
            return (Criteria) this;
        }

        public Criteria andGradeTemplateEqualTo(String value) {
            addCriterion("grade_template =", value, "gradeTemplate");
            return (Criteria) this;
        }

        public Criteria andGradeTemplateNotEqualTo(String value) {
            addCriterion("grade_template <>", value, "gradeTemplate");
            return (Criteria) this;
        }

        public Criteria andGradeTemplateGreaterThan(String value) {
            addCriterion("grade_template >", value, "gradeTemplate");
            return (Criteria) this;
        }

        public Criteria andGradeTemplateGreaterThanOrEqualTo(String value) {
            addCriterion("grade_template >=", value, "gradeTemplate");
            return (Criteria) this;
        }

        public Criteria andGradeTemplateLessThan(String value) {
            addCriterion("grade_template <", value, "gradeTemplate");
            return (Criteria) this;
        }

        public Criteria andGradeTemplateLessThanOrEqualTo(String value) {
            addCriterion("grade_template <=", value, "gradeTemplate");
            return (Criteria) this;
        }

        public Criteria andGradeTemplateLike(String value) {
            addCriterion("grade_template like", value, "gradeTemplate");
            return (Criteria) this;
        }

        public Criteria andGradeTemplateNotLike(String value) {
            addCriterion("grade_template not like", value, "gradeTemplate");
            return (Criteria) this;
        }

        public Criteria andGradeTemplateIn(List<String> values) {
            addCriterion("grade_template in", values, "gradeTemplate");
            return (Criteria) this;
        }

        public Criteria andGradeTemplateNotIn(List<String> values) {
            addCriterion("grade_template not in", values, "gradeTemplate");
            return (Criteria) this;
        }

        public Criteria andGradeTemplateBetween(String value1, String value2) {
            addCriterion("grade_template between", value1, value2, "gradeTemplate");
            return (Criteria) this;
        }

        public Criteria andGradeTemplateNotBetween(String value1, String value2) {
            addCriterion("grade_template not between", value1, value2, "gradeTemplate");
            return (Criteria) this;
        }

        public Criteria andGradePriceIsNull() {
            addCriterion("grade_price is null");
            return (Criteria) this;
        }

        public Criteria andGradePriceIsNotNull() {
            addCriterion("grade_price is not null");
            return (Criteria) this;
        }

        public Criteria andGradePriceEqualTo(BigDecimal value) {
            addCriterion("grade_price =", value, "gradePrice");
            return (Criteria) this;
        }

        public Criteria andGradePriceNotEqualTo(BigDecimal value) {
            addCriterion("grade_price <>", value, "gradePrice");
            return (Criteria) this;
        }

        public Criteria andGradePriceGreaterThan(BigDecimal value) {
            addCriterion("grade_price >", value, "gradePrice");
            return (Criteria) this;
        }

        public Criteria andGradePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("grade_price >=", value, "gradePrice");
            return (Criteria) this;
        }

        public Criteria andGradePriceLessThan(BigDecimal value) {
            addCriterion("grade_price <", value, "gradePrice");
            return (Criteria) this;
        }

        public Criteria andGradePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("grade_price <=", value, "gradePrice");
            return (Criteria) this;
        }

        public Criteria andGradePriceIn(List<BigDecimal> values) {
            addCriterion("grade_price in", values, "gradePrice");
            return (Criteria) this;
        }

        public Criteria andGradePriceNotIn(List<BigDecimal> values) {
            addCriterion("grade_price not in", values, "gradePrice");
            return (Criteria) this;
        }

        public Criteria andGradePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("grade_price between", value1, value2, "gradePrice");
            return (Criteria) this;
        }

        public Criteria andGradePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("grade_price not between", value1, value2, "gradePrice");
            return (Criteria) this;
        }

        public Criteria andGradeFunctionIsNull() {
            addCriterion("grade_function is null");
            return (Criteria) this;
        }

        public Criteria andGradeFunctionIsNotNull() {
            addCriterion("grade_function is not null");
            return (Criteria) this;
        }

        public Criteria andGradeFunctionEqualTo(String value) {
            addCriterion("grade_function =", value, "gradeFunction");
            return (Criteria) this;
        }

        public Criteria andGradeFunctionNotEqualTo(String value) {
            addCriterion("grade_function <>", value, "gradeFunction");
            return (Criteria) this;
        }

        public Criteria andGradeFunctionGreaterThan(String value) {
            addCriterion("grade_function >", value, "gradeFunction");
            return (Criteria) this;
        }

        public Criteria andGradeFunctionGreaterThanOrEqualTo(String value) {
            addCriterion("grade_function >=", value, "gradeFunction");
            return (Criteria) this;
        }

        public Criteria andGradeFunctionLessThan(String value) {
            addCriterion("grade_function <", value, "gradeFunction");
            return (Criteria) this;
        }

        public Criteria andGradeFunctionLessThanOrEqualTo(String value) {
            addCriterion("grade_function <=", value, "gradeFunction");
            return (Criteria) this;
        }

        public Criteria andGradeFunctionLike(String value) {
            addCriterion("grade_function like", value, "gradeFunction");
            return (Criteria) this;
        }

        public Criteria andGradeFunctionNotLike(String value) {
            addCriterion("grade_function not like", value, "gradeFunction");
            return (Criteria) this;
        }

        public Criteria andGradeFunctionIn(List<String> values) {
            addCriterion("grade_function in", values, "gradeFunction");
            return (Criteria) this;
        }

        public Criteria andGradeFunctionNotIn(List<String> values) {
            addCriterion("grade_function not in", values, "gradeFunction");
            return (Criteria) this;
        }

        public Criteria andGradeFunctionBetween(String value1, String value2) {
            addCriterion("grade_function between", value1, value2, "gradeFunction");
            return (Criteria) this;
        }

        public Criteria andGradeFunctionNotBetween(String value1, String value2) {
            addCriterion("grade_function not between", value1, value2, "gradeFunction");
            return (Criteria) this;
        }

        public Criteria andGradeSortIsNull() {
            addCriterion("grade_sort is null");
            return (Criteria) this;
        }

        public Criteria andGradeSortIsNotNull() {
            addCriterion("grade_sort is not null");
            return (Criteria) this;
        }

        public Criteria andGradeSortEqualTo(Byte value) {
            addCriterion("grade_sort =", value, "gradeSort");
            return (Criteria) this;
        }

        public Criteria andGradeSortNotEqualTo(Byte value) {
            addCriterion("grade_sort <>", value, "gradeSort");
            return (Criteria) this;
        }

        public Criteria andGradeSortGreaterThan(Byte value) {
            addCriterion("grade_sort >", value, "gradeSort");
            return (Criteria) this;
        }

        public Criteria andGradeSortGreaterThanOrEqualTo(Byte value) {
            addCriterion("grade_sort >=", value, "gradeSort");
            return (Criteria) this;
        }

        public Criteria andGradeSortLessThan(Byte value) {
            addCriterion("grade_sort <", value, "gradeSort");
            return (Criteria) this;
        }

        public Criteria andGradeSortLessThanOrEqualTo(Byte value) {
            addCriterion("grade_sort <=", value, "gradeSort");
            return (Criteria) this;
        }

        public Criteria andGradeSortIn(List<Byte> values) {
            addCriterion("grade_sort in", values, "gradeSort");
            return (Criteria) this;
        }

        public Criteria andGradeSortNotIn(List<Byte> values) {
            addCriterion("grade_sort not in", values, "gradeSort");
            return (Criteria) this;
        }

        public Criteria andGradeSortBetween(Byte value1, Byte value2) {
            addCriterion("grade_sort between", value1, value2, "gradeSort");
            return (Criteria) this;
        }

        public Criteria andGradeSortNotBetween(Byte value1, Byte value2) {
            addCriterion("grade_sort not between", value1, value2, "gradeSort");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 店铺等级表
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