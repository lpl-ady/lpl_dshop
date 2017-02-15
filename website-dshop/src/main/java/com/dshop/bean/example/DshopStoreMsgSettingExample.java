/*
 * DshopStoreMsgSettingExample.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.bean.example;

import java.util.ArrayList;
import java.util.List;

public class DshopStoreMsgSettingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DshopStoreMsgSettingExample() {
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
     * 店铺消息接收设置
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

        public Criteria andSmsMessageSwitchIsNull() {
            addCriterion("sms_message_switch is null");
            return (Criteria) this;
        }

        public Criteria andSmsMessageSwitchIsNotNull() {
            addCriterion("sms_message_switch is not null");
            return (Criteria) this;
        }

        public Criteria andSmsMessageSwitchEqualTo(Byte value) {
            addCriterion("sms_message_switch =", value, "smsMessageSwitch");
            return (Criteria) this;
        }

        public Criteria andSmsMessageSwitchNotEqualTo(Byte value) {
            addCriterion("sms_message_switch <>", value, "smsMessageSwitch");
            return (Criteria) this;
        }

        public Criteria andSmsMessageSwitchGreaterThan(Byte value) {
            addCriterion("sms_message_switch >", value, "smsMessageSwitch");
            return (Criteria) this;
        }

        public Criteria andSmsMessageSwitchGreaterThanOrEqualTo(Byte value) {
            addCriterion("sms_message_switch >=", value, "smsMessageSwitch");
            return (Criteria) this;
        }

        public Criteria andSmsMessageSwitchLessThan(Byte value) {
            addCriterion("sms_message_switch <", value, "smsMessageSwitch");
            return (Criteria) this;
        }

        public Criteria andSmsMessageSwitchLessThanOrEqualTo(Byte value) {
            addCriterion("sms_message_switch <=", value, "smsMessageSwitch");
            return (Criteria) this;
        }

        public Criteria andSmsMessageSwitchIn(List<Byte> values) {
            addCriterion("sms_message_switch in", values, "smsMessageSwitch");
            return (Criteria) this;
        }

        public Criteria andSmsMessageSwitchNotIn(List<Byte> values) {
            addCriterion("sms_message_switch not in", values, "smsMessageSwitch");
            return (Criteria) this;
        }

        public Criteria andSmsMessageSwitchBetween(Byte value1, Byte value2) {
            addCriterion("sms_message_switch between", value1, value2, "smsMessageSwitch");
            return (Criteria) this;
        }

        public Criteria andSmsMessageSwitchNotBetween(Byte value1, Byte value2) {
            addCriterion("sms_message_switch not between", value1, value2, "smsMessageSwitch");
            return (Criteria) this;
        }

        public Criteria andSmsShortSwitchIsNull() {
            addCriterion("sms_short_switch is null");
            return (Criteria) this;
        }

        public Criteria andSmsShortSwitchIsNotNull() {
            addCriterion("sms_short_switch is not null");
            return (Criteria) this;
        }

        public Criteria andSmsShortSwitchEqualTo(Byte value) {
            addCriterion("sms_short_switch =", value, "smsShortSwitch");
            return (Criteria) this;
        }

        public Criteria andSmsShortSwitchNotEqualTo(Byte value) {
            addCriterion("sms_short_switch <>", value, "smsShortSwitch");
            return (Criteria) this;
        }

        public Criteria andSmsShortSwitchGreaterThan(Byte value) {
            addCriterion("sms_short_switch >", value, "smsShortSwitch");
            return (Criteria) this;
        }

        public Criteria andSmsShortSwitchGreaterThanOrEqualTo(Byte value) {
            addCriterion("sms_short_switch >=", value, "smsShortSwitch");
            return (Criteria) this;
        }

        public Criteria andSmsShortSwitchLessThan(Byte value) {
            addCriterion("sms_short_switch <", value, "smsShortSwitch");
            return (Criteria) this;
        }

        public Criteria andSmsShortSwitchLessThanOrEqualTo(Byte value) {
            addCriterion("sms_short_switch <=", value, "smsShortSwitch");
            return (Criteria) this;
        }

        public Criteria andSmsShortSwitchIn(List<Byte> values) {
            addCriterion("sms_short_switch in", values, "smsShortSwitch");
            return (Criteria) this;
        }

        public Criteria andSmsShortSwitchNotIn(List<Byte> values) {
            addCriterion("sms_short_switch not in", values, "smsShortSwitch");
            return (Criteria) this;
        }

        public Criteria andSmsShortSwitchBetween(Byte value1, Byte value2) {
            addCriterion("sms_short_switch between", value1, value2, "smsShortSwitch");
            return (Criteria) this;
        }

        public Criteria andSmsShortSwitchNotBetween(Byte value1, Byte value2) {
            addCriterion("sms_short_switch not between", value1, value2, "smsShortSwitch");
            return (Criteria) this;
        }

        public Criteria andSmsMailSwitchIsNull() {
            addCriterion("sms_mail_switch is null");
            return (Criteria) this;
        }

        public Criteria andSmsMailSwitchIsNotNull() {
            addCriterion("sms_mail_switch is not null");
            return (Criteria) this;
        }

        public Criteria andSmsMailSwitchEqualTo(Byte value) {
            addCriterion("sms_mail_switch =", value, "smsMailSwitch");
            return (Criteria) this;
        }

        public Criteria andSmsMailSwitchNotEqualTo(Byte value) {
            addCriterion("sms_mail_switch <>", value, "smsMailSwitch");
            return (Criteria) this;
        }

        public Criteria andSmsMailSwitchGreaterThan(Byte value) {
            addCriterion("sms_mail_switch >", value, "smsMailSwitch");
            return (Criteria) this;
        }

        public Criteria andSmsMailSwitchGreaterThanOrEqualTo(Byte value) {
            addCriterion("sms_mail_switch >=", value, "smsMailSwitch");
            return (Criteria) this;
        }

        public Criteria andSmsMailSwitchLessThan(Byte value) {
            addCriterion("sms_mail_switch <", value, "smsMailSwitch");
            return (Criteria) this;
        }

        public Criteria andSmsMailSwitchLessThanOrEqualTo(Byte value) {
            addCriterion("sms_mail_switch <=", value, "smsMailSwitch");
            return (Criteria) this;
        }

        public Criteria andSmsMailSwitchIn(List<Byte> values) {
            addCriterion("sms_mail_switch in", values, "smsMailSwitch");
            return (Criteria) this;
        }

        public Criteria andSmsMailSwitchNotIn(List<Byte> values) {
            addCriterion("sms_mail_switch not in", values, "smsMailSwitch");
            return (Criteria) this;
        }

        public Criteria andSmsMailSwitchBetween(Byte value1, Byte value2) {
            addCriterion("sms_mail_switch between", value1, value2, "smsMailSwitch");
            return (Criteria) this;
        }

        public Criteria andSmsMailSwitchNotBetween(Byte value1, Byte value2) {
            addCriterion("sms_mail_switch not between", value1, value2, "smsMailSwitch");
            return (Criteria) this;
        }

        public Criteria andSmsShortNumberIsNull() {
            addCriterion("sms_short_number is null");
            return (Criteria) this;
        }

        public Criteria andSmsShortNumberIsNotNull() {
            addCriterion("sms_short_number is not null");
            return (Criteria) this;
        }

        public Criteria andSmsShortNumberEqualTo(String value) {
            addCriterion("sms_short_number =", value, "smsShortNumber");
            return (Criteria) this;
        }

        public Criteria andSmsShortNumberNotEqualTo(String value) {
            addCriterion("sms_short_number <>", value, "smsShortNumber");
            return (Criteria) this;
        }

        public Criteria andSmsShortNumberGreaterThan(String value) {
            addCriterion("sms_short_number >", value, "smsShortNumber");
            return (Criteria) this;
        }

        public Criteria andSmsShortNumberGreaterThanOrEqualTo(String value) {
            addCriterion("sms_short_number >=", value, "smsShortNumber");
            return (Criteria) this;
        }

        public Criteria andSmsShortNumberLessThan(String value) {
            addCriterion("sms_short_number <", value, "smsShortNumber");
            return (Criteria) this;
        }

        public Criteria andSmsShortNumberLessThanOrEqualTo(String value) {
            addCriterion("sms_short_number <=", value, "smsShortNumber");
            return (Criteria) this;
        }

        public Criteria andSmsShortNumberLike(String value) {
            addCriterion("sms_short_number like", value, "smsShortNumber");
            return (Criteria) this;
        }

        public Criteria andSmsShortNumberNotLike(String value) {
            addCriterion("sms_short_number not like", value, "smsShortNumber");
            return (Criteria) this;
        }

        public Criteria andSmsShortNumberIn(List<String> values) {
            addCriterion("sms_short_number in", values, "smsShortNumber");
            return (Criteria) this;
        }

        public Criteria andSmsShortNumberNotIn(List<String> values) {
            addCriterion("sms_short_number not in", values, "smsShortNumber");
            return (Criteria) this;
        }

        public Criteria andSmsShortNumberBetween(String value1, String value2) {
            addCriterion("sms_short_number between", value1, value2, "smsShortNumber");
            return (Criteria) this;
        }

        public Criteria andSmsShortNumberNotBetween(String value1, String value2) {
            addCriterion("sms_short_number not between", value1, value2, "smsShortNumber");
            return (Criteria) this;
        }

        public Criteria andSmsMailNumberIsNull() {
            addCriterion("sms_mail_number is null");
            return (Criteria) this;
        }

        public Criteria andSmsMailNumberIsNotNull() {
            addCriterion("sms_mail_number is not null");
            return (Criteria) this;
        }

        public Criteria andSmsMailNumberEqualTo(String value) {
            addCriterion("sms_mail_number =", value, "smsMailNumber");
            return (Criteria) this;
        }

        public Criteria andSmsMailNumberNotEqualTo(String value) {
            addCriterion("sms_mail_number <>", value, "smsMailNumber");
            return (Criteria) this;
        }

        public Criteria andSmsMailNumberGreaterThan(String value) {
            addCriterion("sms_mail_number >", value, "smsMailNumber");
            return (Criteria) this;
        }

        public Criteria andSmsMailNumberGreaterThanOrEqualTo(String value) {
            addCriterion("sms_mail_number >=", value, "smsMailNumber");
            return (Criteria) this;
        }

        public Criteria andSmsMailNumberLessThan(String value) {
            addCriterion("sms_mail_number <", value, "smsMailNumber");
            return (Criteria) this;
        }

        public Criteria andSmsMailNumberLessThanOrEqualTo(String value) {
            addCriterion("sms_mail_number <=", value, "smsMailNumber");
            return (Criteria) this;
        }

        public Criteria andSmsMailNumberLike(String value) {
            addCriterion("sms_mail_number like", value, "smsMailNumber");
            return (Criteria) this;
        }

        public Criteria andSmsMailNumberNotLike(String value) {
            addCriterion("sms_mail_number not like", value, "smsMailNumber");
            return (Criteria) this;
        }

        public Criteria andSmsMailNumberIn(List<String> values) {
            addCriterion("sms_mail_number in", values, "smsMailNumber");
            return (Criteria) this;
        }

        public Criteria andSmsMailNumberNotIn(List<String> values) {
            addCriterion("sms_mail_number not in", values, "smsMailNumber");
            return (Criteria) this;
        }

        public Criteria andSmsMailNumberBetween(String value1, String value2) {
            addCriterion("sms_mail_number between", value1, value2, "smsMailNumber");
            return (Criteria) this;
        }

        public Criteria andSmsMailNumberNotBetween(String value1, String value2) {
            addCriterion("sms_mail_number not between", value1, value2, "smsMailNumber");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 店铺消息接收设置
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