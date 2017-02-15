/*
 * DshopStoreMsgExample.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.bean.example;

import java.util.ArrayList;
import java.util.List;

public class DshopStoreMsgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DshopStoreMsgExample() {
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
     * 店铺消息表
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

        public Criteria andStoreMsgIdIsNull() {
            addCriterion("store_msg_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreMsgIdIsNotNull() {
            addCriterion("store_msg_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreMsgIdEqualTo(Integer value) {
            addCriterion("store_msg_id =", value, "storeMsgId");
            return (Criteria) this;
        }

        public Criteria andStoreMsgIdNotEqualTo(Integer value) {
            addCriterion("store_msg_id <>", value, "storeMsgId");
            return (Criteria) this;
        }

        public Criteria andStoreMsgIdGreaterThan(Integer value) {
            addCriterion("store_msg_id >", value, "storeMsgId");
            return (Criteria) this;
        }

        public Criteria andStoreMsgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_msg_id >=", value, "storeMsgId");
            return (Criteria) this;
        }

        public Criteria andStoreMsgIdLessThan(Integer value) {
            addCriterion("store_msg_id <", value, "storeMsgId");
            return (Criteria) this;
        }

        public Criteria andStoreMsgIdLessThanOrEqualTo(Integer value) {
            addCriterion("store_msg_id <=", value, "storeMsgId");
            return (Criteria) this;
        }

        public Criteria andStoreMsgIdIn(List<Integer> values) {
            addCriterion("store_msg_id in", values, "storeMsgId");
            return (Criteria) this;
        }

        public Criteria andStoreMsgIdNotIn(List<Integer> values) {
            addCriterion("store_msg_id not in", values, "storeMsgId");
            return (Criteria) this;
        }

        public Criteria andStoreMsgIdBetween(Integer value1, Integer value2) {
            addCriterion("store_msg_id between", value1, value2, "storeMsgId");
            return (Criteria) this;
        }

        public Criteria andStoreMsgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("store_msg_id not between", value1, value2, "storeMsgId");
            return (Criteria) this;
        }

        public Criteria andSmtCodeIsNull() {
            addCriterion("smt_code is null");
            return (Criteria) this;
        }

        public Criteria andSmtCodeIsNotNull() {
            addCriterion("smt_code is not null");
            return (Criteria) this;
        }

        public Criteria andSmtCodeEqualTo(String value) {
            addCriterion("smt_code =", value, "smtCode");
            return (Criteria) this;
        }

        public Criteria andSmtCodeNotEqualTo(String value) {
            addCriterion("smt_code <>", value, "smtCode");
            return (Criteria) this;
        }

        public Criteria andSmtCodeGreaterThan(String value) {
            addCriterion("smt_code >", value, "smtCode");
            return (Criteria) this;
        }

        public Criteria andSmtCodeGreaterThanOrEqualTo(String value) {
            addCriterion("smt_code >=", value, "smtCode");
            return (Criteria) this;
        }

        public Criteria andSmtCodeLessThan(String value) {
            addCriterion("smt_code <", value, "smtCode");
            return (Criteria) this;
        }

        public Criteria andSmtCodeLessThanOrEqualTo(String value) {
            addCriterion("smt_code <=", value, "smtCode");
            return (Criteria) this;
        }

        public Criteria andSmtCodeLike(String value) {
            addCriterion("smt_code like", value, "smtCode");
            return (Criteria) this;
        }

        public Criteria andSmtCodeNotLike(String value) {
            addCriterion("smt_code not like", value, "smtCode");
            return (Criteria) this;
        }

        public Criteria andSmtCodeIn(List<String> values) {
            addCriterion("smt_code in", values, "smtCode");
            return (Criteria) this;
        }

        public Criteria andSmtCodeNotIn(List<String> values) {
            addCriterion("smt_code not in", values, "smtCode");
            return (Criteria) this;
        }

        public Criteria andSmtCodeBetween(String value1, String value2) {
            addCriterion("smt_code between", value1, value2, "smtCode");
            return (Criteria) this;
        }

        public Criteria andSmtCodeNotBetween(String value1, String value2) {
            addCriterion("smt_code not between", value1, value2, "smtCode");
            return (Criteria) this;
        }

        public Criteria andStoreMsgContentIsNull() {
            addCriterion("store_msg_content is null");
            return (Criteria) this;
        }

        public Criteria andStoreMsgContentIsNotNull() {
            addCriterion("store_msg_content is not null");
            return (Criteria) this;
        }

        public Criteria andStoreMsgContentEqualTo(String value) {
            addCriterion("store_msg_content =", value, "storeMsgContent");
            return (Criteria) this;
        }

        public Criteria andStoreMsgContentNotEqualTo(String value) {
            addCriterion("store_msg_content <>", value, "storeMsgContent");
            return (Criteria) this;
        }

        public Criteria andStoreMsgContentGreaterThan(String value) {
            addCriterion("store_msg_content >", value, "storeMsgContent");
            return (Criteria) this;
        }

        public Criteria andStoreMsgContentGreaterThanOrEqualTo(String value) {
            addCriterion("store_msg_content >=", value, "storeMsgContent");
            return (Criteria) this;
        }

        public Criteria andStoreMsgContentLessThan(String value) {
            addCriterion("store_msg_content <", value, "storeMsgContent");
            return (Criteria) this;
        }

        public Criteria andStoreMsgContentLessThanOrEqualTo(String value) {
            addCriterion("store_msg_content <=", value, "storeMsgContent");
            return (Criteria) this;
        }

        public Criteria andStoreMsgContentLike(String value) {
            addCriterion("store_msg_content like", value, "storeMsgContent");
            return (Criteria) this;
        }

        public Criteria andStoreMsgContentNotLike(String value) {
            addCriterion("store_msg_content not like", value, "storeMsgContent");
            return (Criteria) this;
        }

        public Criteria andStoreMsgContentIn(List<String> values) {
            addCriterion("store_msg_content in", values, "storeMsgContent");
            return (Criteria) this;
        }

        public Criteria andStoreMsgContentNotIn(List<String> values) {
            addCriterion("store_msg_content not in", values, "storeMsgContent");
            return (Criteria) this;
        }

        public Criteria andStoreMsgContentBetween(String value1, String value2) {
            addCriterion("store_msg_content between", value1, value2, "storeMsgContent");
            return (Criteria) this;
        }

        public Criteria andStoreMsgContentNotBetween(String value1, String value2) {
            addCriterion("store_msg_content not between", value1, value2, "storeMsgContent");
            return (Criteria) this;
        }

        public Criteria andStoreMsgAddTimeIsNull() {
            addCriterion("store_msg_add_time is null");
            return (Criteria) this;
        }

        public Criteria andStoreMsgAddTimeIsNotNull() {
            addCriterion("store_msg_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andStoreMsgAddTimeEqualTo(Integer value) {
            addCriterion("store_msg_add_time =", value, "storeMsgAddTime");
            return (Criteria) this;
        }

        public Criteria andStoreMsgAddTimeNotEqualTo(Integer value) {
            addCriterion("store_msg_add_time <>", value, "storeMsgAddTime");
            return (Criteria) this;
        }

        public Criteria andStoreMsgAddTimeGreaterThan(Integer value) {
            addCriterion("store_msg_add_time >", value, "storeMsgAddTime");
            return (Criteria) this;
        }

        public Criteria andStoreMsgAddTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_msg_add_time >=", value, "storeMsgAddTime");
            return (Criteria) this;
        }

        public Criteria andStoreMsgAddTimeLessThan(Integer value) {
            addCriterion("store_msg_add_time <", value, "storeMsgAddTime");
            return (Criteria) this;
        }

        public Criteria andStoreMsgAddTimeLessThanOrEqualTo(Integer value) {
            addCriterion("store_msg_add_time <=", value, "storeMsgAddTime");
            return (Criteria) this;
        }

        public Criteria andStoreMsgAddTimeIn(List<Integer> values) {
            addCriterion("store_msg_add_time in", values, "storeMsgAddTime");
            return (Criteria) this;
        }

        public Criteria andStoreMsgAddTimeNotIn(List<Integer> values) {
            addCriterion("store_msg_add_time not in", values, "storeMsgAddTime");
            return (Criteria) this;
        }

        public Criteria andStoreMsgAddTimeBetween(Integer value1, Integer value2) {
            addCriterion("store_msg_add_time between", value1, value2, "storeMsgAddTime");
            return (Criteria) this;
        }

        public Criteria andStoreMsgAddTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("store_msg_add_time not between", value1, value2, "storeMsgAddTime");
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

        public Criteria andStoreMsgStatusIsNull() {
            addCriterion("store_msg_status is null");
            return (Criteria) this;
        }

        public Criteria andStoreMsgStatusIsNotNull() {
            addCriterion("store_msg_status is not null");
            return (Criteria) this;
        }

        public Criteria andStoreMsgStatusEqualTo(Boolean value) {
            addCriterion("store_msg_status =", value, "storeMsgStatus");
            return (Criteria) this;
        }

        public Criteria andStoreMsgStatusNotEqualTo(Boolean value) {
            addCriterion("store_msg_status <>", value, "storeMsgStatus");
            return (Criteria) this;
        }

        public Criteria andStoreMsgStatusGreaterThan(Boolean value) {
            addCriterion("store_msg_status >", value, "storeMsgStatus");
            return (Criteria) this;
        }

        public Criteria andStoreMsgStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("store_msg_status >=", value, "storeMsgStatus");
            return (Criteria) this;
        }

        public Criteria andStoreMsgStatusLessThan(Boolean value) {
            addCriterion("store_msg_status <", value, "storeMsgStatus");
            return (Criteria) this;
        }

        public Criteria andStoreMsgStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("store_msg_status <=", value, "storeMsgStatus");
            return (Criteria) this;
        }

        public Criteria andStoreMsgStatusIn(List<Boolean> values) {
            addCriterion("store_msg_status in", values, "storeMsgStatus");
            return (Criteria) this;
        }

        public Criteria andStoreMsgStatusNotIn(List<Boolean> values) {
            addCriterion("store_msg_status not in", values, "storeMsgStatus");
            return (Criteria) this;
        }

        public Criteria andStoreMsgStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("store_msg_status between", value1, value2, "storeMsgStatus");
            return (Criteria) this;
        }

        public Criteria andStoreMsgStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("store_msg_status not between", value1, value2, "storeMsgStatus");
            return (Criteria) this;
        }

        public Criteria andStoreMsgReadUseridIsNull() {
            addCriterion("store_msg_read_userid is null");
            return (Criteria) this;
        }

        public Criteria andStoreMsgReadUseridIsNotNull() {
            addCriterion("store_msg_read_userid is not null");
            return (Criteria) this;
        }

        public Criteria andStoreMsgReadUseridEqualTo(String value) {
            addCriterion("store_msg_read_userid =", value, "storeMsgReadUserid");
            return (Criteria) this;
        }

        public Criteria andStoreMsgReadUseridNotEqualTo(String value) {
            addCriterion("store_msg_read_userid <>", value, "storeMsgReadUserid");
            return (Criteria) this;
        }

        public Criteria andStoreMsgReadUseridGreaterThan(String value) {
            addCriterion("store_msg_read_userid >", value, "storeMsgReadUserid");
            return (Criteria) this;
        }

        public Criteria andStoreMsgReadUseridGreaterThanOrEqualTo(String value) {
            addCriterion("store_msg_read_userid >=", value, "storeMsgReadUserid");
            return (Criteria) this;
        }

        public Criteria andStoreMsgReadUseridLessThan(String value) {
            addCriterion("store_msg_read_userid <", value, "storeMsgReadUserid");
            return (Criteria) this;
        }

        public Criteria andStoreMsgReadUseridLessThanOrEqualTo(String value) {
            addCriterion("store_msg_read_userid <=", value, "storeMsgReadUserid");
            return (Criteria) this;
        }

        public Criteria andStoreMsgReadUseridLike(String value) {
            addCriterion("store_msg_read_userid like", value, "storeMsgReadUserid");
            return (Criteria) this;
        }

        public Criteria andStoreMsgReadUseridNotLike(String value) {
            addCriterion("store_msg_read_userid not like", value, "storeMsgReadUserid");
            return (Criteria) this;
        }

        public Criteria andStoreMsgReadUseridIn(List<String> values) {
            addCriterion("store_msg_read_userid in", values, "storeMsgReadUserid");
            return (Criteria) this;
        }

        public Criteria andStoreMsgReadUseridNotIn(List<String> values) {
            addCriterion("store_msg_read_userid not in", values, "storeMsgReadUserid");
            return (Criteria) this;
        }

        public Criteria andStoreMsgReadUseridBetween(String value1, String value2) {
            addCriterion("store_msg_read_userid between", value1, value2, "storeMsgReadUserid");
            return (Criteria) this;
        }

        public Criteria andStoreMsgReadUseridNotBetween(String value1, String value2) {
            addCriterion("store_msg_read_userid not between", value1, value2, "storeMsgReadUserid");
            return (Criteria) this;
        }

        public Criteria andStoreMsgReadTimeIsNull() {
            addCriterion("store_msg_read_time is null");
            return (Criteria) this;
        }

        public Criteria andStoreMsgReadTimeIsNotNull() {
            addCriterion("store_msg_read_time is not null");
            return (Criteria) this;
        }

        public Criteria andStoreMsgReadTimeEqualTo(Integer value) {
            addCriterion("store_msg_read_time =", value, "storeMsgReadTime");
            return (Criteria) this;
        }

        public Criteria andStoreMsgReadTimeNotEqualTo(Integer value) {
            addCriterion("store_msg_read_time <>", value, "storeMsgReadTime");
            return (Criteria) this;
        }

        public Criteria andStoreMsgReadTimeGreaterThan(Integer value) {
            addCriterion("store_msg_read_time >", value, "storeMsgReadTime");
            return (Criteria) this;
        }

        public Criteria andStoreMsgReadTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_msg_read_time >=", value, "storeMsgReadTime");
            return (Criteria) this;
        }

        public Criteria andStoreMsgReadTimeLessThan(Integer value) {
            addCriterion("store_msg_read_time <", value, "storeMsgReadTime");
            return (Criteria) this;
        }

        public Criteria andStoreMsgReadTimeLessThanOrEqualTo(Integer value) {
            addCriterion("store_msg_read_time <=", value, "storeMsgReadTime");
            return (Criteria) this;
        }

        public Criteria andStoreMsgReadTimeIn(List<Integer> values) {
            addCriterion("store_msg_read_time in", values, "storeMsgReadTime");
            return (Criteria) this;
        }

        public Criteria andStoreMsgReadTimeNotIn(List<Integer> values) {
            addCriterion("store_msg_read_time not in", values, "storeMsgReadTime");
            return (Criteria) this;
        }

        public Criteria andStoreMsgReadTimeBetween(Integer value1, Integer value2) {
            addCriterion("store_msg_read_time between", value1, value2, "storeMsgReadTime");
            return (Criteria) this;
        }

        public Criteria andStoreMsgReadTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("store_msg_read_time not between", value1, value2, "storeMsgReadTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 店铺消息表
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