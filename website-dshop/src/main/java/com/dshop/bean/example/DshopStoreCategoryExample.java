/*
 * DshopStoreCategoryExample.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.bean.example;

import java.util.ArrayList;
import java.util.List;

public class DshopStoreCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DshopStoreCategoryExample() {
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
     * 店铺分类表
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

        public Criteria andScIdIsNull() {
            addCriterion("sc_id is null");
            return (Criteria) this;
        }

        public Criteria andScIdIsNotNull() {
            addCriterion("sc_id is not null");
            return (Criteria) this;
        }

        public Criteria andScIdEqualTo(Integer value) {
            addCriterion("sc_id =", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdNotEqualTo(Integer value) {
            addCriterion("sc_id <>", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdGreaterThan(Integer value) {
            addCriterion("sc_id >", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sc_id >=", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdLessThan(Integer value) {
            addCriterion("sc_id <", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdLessThanOrEqualTo(Integer value) {
            addCriterion("sc_id <=", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdIn(List<Integer> values) {
            addCriterion("sc_id in", values, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdNotIn(List<Integer> values) {
            addCriterion("sc_id not in", values, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdBetween(Integer value1, Integer value2) {
            addCriterion("sc_id between", value1, value2, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sc_id not between", value1, value2, "scId");
            return (Criteria) this;
        }

        public Criteria andScNameIsNull() {
            addCriterion("sc_name is null");
            return (Criteria) this;
        }

        public Criteria andScNameIsNotNull() {
            addCriterion("sc_name is not null");
            return (Criteria) this;
        }

        public Criteria andScNameEqualTo(String value) {
            addCriterion("sc_name =", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameNotEqualTo(String value) {
            addCriterion("sc_name <>", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameGreaterThan(String value) {
            addCriterion("sc_name >", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameGreaterThanOrEqualTo(String value) {
            addCriterion("sc_name >=", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameLessThan(String value) {
            addCriterion("sc_name <", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameLessThanOrEqualTo(String value) {
            addCriterion("sc_name <=", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameLike(String value) {
            addCriterion("sc_name like", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameNotLike(String value) {
            addCriterion("sc_name not like", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameIn(List<String> values) {
            addCriterion("sc_name in", values, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameNotIn(List<String> values) {
            addCriterion("sc_name not in", values, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameBetween(String value1, String value2) {
            addCriterion("sc_name between", value1, value2, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameNotBetween(String value1, String value2) {
            addCriterion("sc_name not between", value1, value2, "scName");
            return (Criteria) this;
        }

        public Criteria andScBailIsNull() {
            addCriterion("sc_bail is null");
            return (Criteria) this;
        }

        public Criteria andScBailIsNotNull() {
            addCriterion("sc_bail is not null");
            return (Criteria) this;
        }

        public Criteria andScBailEqualTo(Integer value) {
            addCriterion("sc_bail =", value, "scBail");
            return (Criteria) this;
        }

        public Criteria andScBailNotEqualTo(Integer value) {
            addCriterion("sc_bail <>", value, "scBail");
            return (Criteria) this;
        }

        public Criteria andScBailGreaterThan(Integer value) {
            addCriterion("sc_bail >", value, "scBail");
            return (Criteria) this;
        }

        public Criteria andScBailGreaterThanOrEqualTo(Integer value) {
            addCriterion("sc_bail >=", value, "scBail");
            return (Criteria) this;
        }

        public Criteria andScBailLessThan(Integer value) {
            addCriterion("sc_bail <", value, "scBail");
            return (Criteria) this;
        }

        public Criteria andScBailLessThanOrEqualTo(Integer value) {
            addCriterion("sc_bail <=", value, "scBail");
            return (Criteria) this;
        }

        public Criteria andScBailIn(List<Integer> values) {
            addCriterion("sc_bail in", values, "scBail");
            return (Criteria) this;
        }

        public Criteria andScBailNotIn(List<Integer> values) {
            addCriterion("sc_bail not in", values, "scBail");
            return (Criteria) this;
        }

        public Criteria andScBailBetween(Integer value1, Integer value2) {
            addCriterion("sc_bail between", value1, value2, "scBail");
            return (Criteria) this;
        }

        public Criteria andScBailNotBetween(Integer value1, Integer value2) {
            addCriterion("sc_bail not between", value1, value2, "scBail");
            return (Criteria) this;
        }

        public Criteria andScSortIsNull() {
            addCriterion("sc_sort is null");
            return (Criteria) this;
        }

        public Criteria andScSortIsNotNull() {
            addCriterion("sc_sort is not null");
            return (Criteria) this;
        }

        public Criteria andScSortEqualTo(Boolean value) {
            addCriterion("sc_sort =", value, "scSort");
            return (Criteria) this;
        }

        public Criteria andScSortNotEqualTo(Boolean value) {
            addCriterion("sc_sort <>", value, "scSort");
            return (Criteria) this;
        }

        public Criteria andScSortGreaterThan(Boolean value) {
            addCriterion("sc_sort >", value, "scSort");
            return (Criteria) this;
        }

        public Criteria andScSortGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sc_sort >=", value, "scSort");
            return (Criteria) this;
        }

        public Criteria andScSortLessThan(Boolean value) {
            addCriterion("sc_sort <", value, "scSort");
            return (Criteria) this;
        }

        public Criteria andScSortLessThanOrEqualTo(Boolean value) {
            addCriterion("sc_sort <=", value, "scSort");
            return (Criteria) this;
        }

        public Criteria andScSortIn(List<Boolean> values) {
            addCriterion("sc_sort in", values, "scSort");
            return (Criteria) this;
        }

        public Criteria andScSortNotIn(List<Boolean> values) {
            addCriterion("sc_sort not in", values, "scSort");
            return (Criteria) this;
        }

        public Criteria andScSortBetween(Boolean value1, Boolean value2) {
            addCriterion("sc_sort between", value1, value2, "scSort");
            return (Criteria) this;
        }

        public Criteria andScSortNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sc_sort not between", value1, value2, "scSort");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 店铺分类表
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