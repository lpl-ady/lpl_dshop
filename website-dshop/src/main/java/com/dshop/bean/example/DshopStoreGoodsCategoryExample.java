/*
 * DshopStoreGoodsCategoryExample.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.bean.example;

import java.util.ArrayList;
import java.util.List;

public class DshopStoreGoodsCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DshopStoreGoodsCategoryExample() {
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
     * 店铺商品分类表
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

        public Criteria andSgcIdIsNull() {
            addCriterion("sgc_id is null");
            return (Criteria) this;
        }

        public Criteria andSgcIdIsNotNull() {
            addCriterion("sgc_id is not null");
            return (Criteria) this;
        }

        public Criteria andSgcIdEqualTo(Integer value) {
            addCriterion("sgc_id =", value, "sgcId");
            return (Criteria) this;
        }

        public Criteria andSgcIdNotEqualTo(Integer value) {
            addCriterion("sgc_id <>", value, "sgcId");
            return (Criteria) this;
        }

        public Criteria andSgcIdGreaterThan(Integer value) {
            addCriterion("sgc_id >", value, "sgcId");
            return (Criteria) this;
        }

        public Criteria andSgcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sgc_id >=", value, "sgcId");
            return (Criteria) this;
        }

        public Criteria andSgcIdLessThan(Integer value) {
            addCriterion("sgc_id <", value, "sgcId");
            return (Criteria) this;
        }

        public Criteria andSgcIdLessThanOrEqualTo(Integer value) {
            addCriterion("sgc_id <=", value, "sgcId");
            return (Criteria) this;
        }

        public Criteria andSgcIdIn(List<Integer> values) {
            addCriterion("sgc_id in", values, "sgcId");
            return (Criteria) this;
        }

        public Criteria andSgcIdNotIn(List<Integer> values) {
            addCriterion("sgc_id not in", values, "sgcId");
            return (Criteria) this;
        }

        public Criteria andSgcIdBetween(Integer value1, Integer value2) {
            addCriterion("sgc_id between", value1, value2, "sgcId");
            return (Criteria) this;
        }

        public Criteria andSgcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sgc_id not between", value1, value2, "sgcId");
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

        public Criteria andSgcParentIdIsNull() {
            addCriterion("sgc_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andSgcParentIdIsNotNull() {
            addCriterion("sgc_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andSgcParentIdEqualTo(Integer value) {
            addCriterion("sgc_parent_id =", value, "sgcParentId");
            return (Criteria) this;
        }

        public Criteria andSgcParentIdNotEqualTo(Integer value) {
            addCriterion("sgc_parent_id <>", value, "sgcParentId");
            return (Criteria) this;
        }

        public Criteria andSgcParentIdGreaterThan(Integer value) {
            addCriterion("sgc_parent_id >", value, "sgcParentId");
            return (Criteria) this;
        }

        public Criteria andSgcParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sgc_parent_id >=", value, "sgcParentId");
            return (Criteria) this;
        }

        public Criteria andSgcParentIdLessThan(Integer value) {
            addCriterion("sgc_parent_id <", value, "sgcParentId");
            return (Criteria) this;
        }

        public Criteria andSgcParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("sgc_parent_id <=", value, "sgcParentId");
            return (Criteria) this;
        }

        public Criteria andSgcParentIdIn(List<Integer> values) {
            addCriterion("sgc_parent_id in", values, "sgcParentId");
            return (Criteria) this;
        }

        public Criteria andSgcParentIdNotIn(List<Integer> values) {
            addCriterion("sgc_parent_id not in", values, "sgcParentId");
            return (Criteria) this;
        }

        public Criteria andSgcParentIdBetween(Integer value1, Integer value2) {
            addCriterion("sgc_parent_id between", value1, value2, "sgcParentId");
            return (Criteria) this;
        }

        public Criteria andSgcParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sgc_parent_id not between", value1, value2, "sgcParentId");
            return (Criteria) this;
        }

        public Criteria andSgcCategoryNameIsNull() {
            addCriterion("sgc_category_name is null");
            return (Criteria) this;
        }

        public Criteria andSgcCategoryNameIsNotNull() {
            addCriterion("sgc_category_name is not null");
            return (Criteria) this;
        }

        public Criteria andSgcCategoryNameEqualTo(String value) {
            addCriterion("sgc_category_name =", value, "sgcCategoryName");
            return (Criteria) this;
        }

        public Criteria andSgcCategoryNameNotEqualTo(String value) {
            addCriterion("sgc_category_name <>", value, "sgcCategoryName");
            return (Criteria) this;
        }

        public Criteria andSgcCategoryNameGreaterThan(String value) {
            addCriterion("sgc_category_name >", value, "sgcCategoryName");
            return (Criteria) this;
        }

        public Criteria andSgcCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("sgc_category_name >=", value, "sgcCategoryName");
            return (Criteria) this;
        }

        public Criteria andSgcCategoryNameLessThan(String value) {
            addCriterion("sgc_category_name <", value, "sgcCategoryName");
            return (Criteria) this;
        }

        public Criteria andSgcCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("sgc_category_name <=", value, "sgcCategoryName");
            return (Criteria) this;
        }

        public Criteria andSgcCategoryNameLike(String value) {
            addCriterion("sgc_category_name like", value, "sgcCategoryName");
            return (Criteria) this;
        }

        public Criteria andSgcCategoryNameNotLike(String value) {
            addCriterion("sgc_category_name not like", value, "sgcCategoryName");
            return (Criteria) this;
        }

        public Criteria andSgcCategoryNameIn(List<String> values) {
            addCriterion("sgc_category_name in", values, "sgcCategoryName");
            return (Criteria) this;
        }

        public Criteria andSgcCategoryNameNotIn(List<String> values) {
            addCriterion("sgc_category_name not in", values, "sgcCategoryName");
            return (Criteria) this;
        }

        public Criteria andSgcCategoryNameBetween(String value1, String value2) {
            addCriterion("sgc_category_name between", value1, value2, "sgcCategoryName");
            return (Criteria) this;
        }

        public Criteria andSgcCategoryNameNotBetween(String value1, String value2) {
            addCriterion("sgc_category_name not between", value1, value2, "sgcCategoryName");
            return (Criteria) this;
        }

        public Criteria andSgcStatusIsNull() {
            addCriterion("sgc_status is null");
            return (Criteria) this;
        }

        public Criteria andSgcStatusIsNotNull() {
            addCriterion("sgc_status is not null");
            return (Criteria) this;
        }

        public Criteria andSgcStatusEqualTo(Boolean value) {
            addCriterion("sgc_status =", value, "sgcStatus");
            return (Criteria) this;
        }

        public Criteria andSgcStatusNotEqualTo(Boolean value) {
            addCriterion("sgc_status <>", value, "sgcStatus");
            return (Criteria) this;
        }

        public Criteria andSgcStatusGreaterThan(Boolean value) {
            addCriterion("sgc_status >", value, "sgcStatus");
            return (Criteria) this;
        }

        public Criteria andSgcStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sgc_status >=", value, "sgcStatus");
            return (Criteria) this;
        }

        public Criteria andSgcStatusLessThan(Boolean value) {
            addCriterion("sgc_status <", value, "sgcStatus");
            return (Criteria) this;
        }

        public Criteria andSgcStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("sgc_status <=", value, "sgcStatus");
            return (Criteria) this;
        }

        public Criteria andSgcStatusIn(List<Boolean> values) {
            addCriterion("sgc_status in", values, "sgcStatus");
            return (Criteria) this;
        }

        public Criteria andSgcStatusNotIn(List<Boolean> values) {
            addCriterion("sgc_status not in", values, "sgcStatus");
            return (Criteria) this;
        }

        public Criteria andSgcStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("sgc_status between", value1, value2, "sgcStatus");
            return (Criteria) this;
        }

        public Criteria andSgcStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sgc_status not between", value1, value2, "sgcStatus");
            return (Criteria) this;
        }

        public Criteria andSgcSortIsNull() {
            addCriterion("sgc_sort is null");
            return (Criteria) this;
        }

        public Criteria andSgcSortIsNotNull() {
            addCriterion("sgc_sort is not null");
            return (Criteria) this;
        }

        public Criteria andSgcSortEqualTo(Integer value) {
            addCriterion("sgc_sort =", value, "sgcSort");
            return (Criteria) this;
        }

        public Criteria andSgcSortNotEqualTo(Integer value) {
            addCriterion("sgc_sort <>", value, "sgcSort");
            return (Criteria) this;
        }

        public Criteria andSgcSortGreaterThan(Integer value) {
            addCriterion("sgc_sort >", value, "sgcSort");
            return (Criteria) this;
        }

        public Criteria andSgcSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sgc_sort >=", value, "sgcSort");
            return (Criteria) this;
        }

        public Criteria andSgcSortLessThan(Integer value) {
            addCriterion("sgc_sort <", value, "sgcSort");
            return (Criteria) this;
        }

        public Criteria andSgcSortLessThanOrEqualTo(Integer value) {
            addCriterion("sgc_sort <=", value, "sgcSort");
            return (Criteria) this;
        }

        public Criteria andSgcSortIn(List<Integer> values) {
            addCriterion("sgc_sort in", values, "sgcSort");
            return (Criteria) this;
        }

        public Criteria andSgcSortNotIn(List<Integer> values) {
            addCriterion("sgc_sort not in", values, "sgcSort");
            return (Criteria) this;
        }

        public Criteria andSgcSortBetween(Integer value1, Integer value2) {
            addCriterion("sgc_sort between", value1, value2, "sgcSort");
            return (Criteria) this;
        }

        public Criteria andSgcSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sgc_sort not between", value1, value2, "sgcSort");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 店铺商品分类表
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