/*
 * DshopStoreMsgTemplateExample.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.bean.example;

import java.util.ArrayList;
import java.util.List;

public class DshopStoreMsgTemplateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DshopStoreMsgTemplateExample() {
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
     * 商家消息模板
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

        public Criteria andSmtNameIsNull() {
            addCriterion("smt_name is null");
            return (Criteria) this;
        }

        public Criteria andSmtNameIsNotNull() {
            addCriterion("smt_name is not null");
            return (Criteria) this;
        }

        public Criteria andSmtNameEqualTo(String value) {
            addCriterion("smt_name =", value, "smtName");
            return (Criteria) this;
        }

        public Criteria andSmtNameNotEqualTo(String value) {
            addCriterion("smt_name <>", value, "smtName");
            return (Criteria) this;
        }

        public Criteria andSmtNameGreaterThan(String value) {
            addCriterion("smt_name >", value, "smtName");
            return (Criteria) this;
        }

        public Criteria andSmtNameGreaterThanOrEqualTo(String value) {
            addCriterion("smt_name >=", value, "smtName");
            return (Criteria) this;
        }

        public Criteria andSmtNameLessThan(String value) {
            addCriterion("smt_name <", value, "smtName");
            return (Criteria) this;
        }

        public Criteria andSmtNameLessThanOrEqualTo(String value) {
            addCriterion("smt_name <=", value, "smtName");
            return (Criteria) this;
        }

        public Criteria andSmtNameLike(String value) {
            addCriterion("smt_name like", value, "smtName");
            return (Criteria) this;
        }

        public Criteria andSmtNameNotLike(String value) {
            addCriterion("smt_name not like", value, "smtName");
            return (Criteria) this;
        }

        public Criteria andSmtNameIn(List<String> values) {
            addCriterion("smt_name in", values, "smtName");
            return (Criteria) this;
        }

        public Criteria andSmtNameNotIn(List<String> values) {
            addCriterion("smt_name not in", values, "smtName");
            return (Criteria) this;
        }

        public Criteria andSmtNameBetween(String value1, String value2) {
            addCriterion("smt_name between", value1, value2, "smtName");
            return (Criteria) this;
        }

        public Criteria andSmtNameNotBetween(String value1, String value2) {
            addCriterion("smt_name not between", value1, value2, "smtName");
            return (Criteria) this;
        }

        public Criteria andSmtMessageSwitchIsNull() {
            addCriterion("smt_message_switch is null");
            return (Criteria) this;
        }

        public Criteria andSmtMessageSwitchIsNotNull() {
            addCriterion("smt_message_switch is not null");
            return (Criteria) this;
        }

        public Criteria andSmtMessageSwitchEqualTo(Byte value) {
            addCriterion("smt_message_switch =", value, "smtMessageSwitch");
            return (Criteria) this;
        }

        public Criteria andSmtMessageSwitchNotEqualTo(Byte value) {
            addCriterion("smt_message_switch <>", value, "smtMessageSwitch");
            return (Criteria) this;
        }

        public Criteria andSmtMessageSwitchGreaterThan(Byte value) {
            addCriterion("smt_message_switch >", value, "smtMessageSwitch");
            return (Criteria) this;
        }

        public Criteria andSmtMessageSwitchGreaterThanOrEqualTo(Byte value) {
            addCriterion("smt_message_switch >=", value, "smtMessageSwitch");
            return (Criteria) this;
        }

        public Criteria andSmtMessageSwitchLessThan(Byte value) {
            addCriterion("smt_message_switch <", value, "smtMessageSwitch");
            return (Criteria) this;
        }

        public Criteria andSmtMessageSwitchLessThanOrEqualTo(Byte value) {
            addCriterion("smt_message_switch <=", value, "smtMessageSwitch");
            return (Criteria) this;
        }

        public Criteria andSmtMessageSwitchIn(List<Byte> values) {
            addCriterion("smt_message_switch in", values, "smtMessageSwitch");
            return (Criteria) this;
        }

        public Criteria andSmtMessageSwitchNotIn(List<Byte> values) {
            addCriterion("smt_message_switch not in", values, "smtMessageSwitch");
            return (Criteria) this;
        }

        public Criteria andSmtMessageSwitchBetween(Byte value1, Byte value2) {
            addCriterion("smt_message_switch between", value1, value2, "smtMessageSwitch");
            return (Criteria) this;
        }

        public Criteria andSmtMessageSwitchNotBetween(Byte value1, Byte value2) {
            addCriterion("smt_message_switch not between", value1, value2, "smtMessageSwitch");
            return (Criteria) this;
        }

        public Criteria andSmtMessageContentIsNull() {
            addCriterion("smt_message_content is null");
            return (Criteria) this;
        }

        public Criteria andSmtMessageContentIsNotNull() {
            addCriterion("smt_message_content is not null");
            return (Criteria) this;
        }

        public Criteria andSmtMessageContentEqualTo(String value) {
            addCriterion("smt_message_content =", value, "smtMessageContent");
            return (Criteria) this;
        }

        public Criteria andSmtMessageContentNotEqualTo(String value) {
            addCriterion("smt_message_content <>", value, "smtMessageContent");
            return (Criteria) this;
        }

        public Criteria andSmtMessageContentGreaterThan(String value) {
            addCriterion("smt_message_content >", value, "smtMessageContent");
            return (Criteria) this;
        }

        public Criteria andSmtMessageContentGreaterThanOrEqualTo(String value) {
            addCriterion("smt_message_content >=", value, "smtMessageContent");
            return (Criteria) this;
        }

        public Criteria andSmtMessageContentLessThan(String value) {
            addCriterion("smt_message_content <", value, "smtMessageContent");
            return (Criteria) this;
        }

        public Criteria andSmtMessageContentLessThanOrEqualTo(String value) {
            addCriterion("smt_message_content <=", value, "smtMessageContent");
            return (Criteria) this;
        }

        public Criteria andSmtMessageContentLike(String value) {
            addCriterion("smt_message_content like", value, "smtMessageContent");
            return (Criteria) this;
        }

        public Criteria andSmtMessageContentNotLike(String value) {
            addCriterion("smt_message_content not like", value, "smtMessageContent");
            return (Criteria) this;
        }

        public Criteria andSmtMessageContentIn(List<String> values) {
            addCriterion("smt_message_content in", values, "smtMessageContent");
            return (Criteria) this;
        }

        public Criteria andSmtMessageContentNotIn(List<String> values) {
            addCriterion("smt_message_content not in", values, "smtMessageContent");
            return (Criteria) this;
        }

        public Criteria andSmtMessageContentBetween(String value1, String value2) {
            addCriterion("smt_message_content between", value1, value2, "smtMessageContent");
            return (Criteria) this;
        }

        public Criteria andSmtMessageContentNotBetween(String value1, String value2) {
            addCriterion("smt_message_content not between", value1, value2, "smtMessageContent");
            return (Criteria) this;
        }

        public Criteria andSmtShortSwitchIsNull() {
            addCriterion("smt_short_switch is null");
            return (Criteria) this;
        }

        public Criteria andSmtShortSwitchIsNotNull() {
            addCriterion("smt_short_switch is not null");
            return (Criteria) this;
        }

        public Criteria andSmtShortSwitchEqualTo(Byte value) {
            addCriterion("smt_short_switch =", value, "smtShortSwitch");
            return (Criteria) this;
        }

        public Criteria andSmtShortSwitchNotEqualTo(Byte value) {
            addCriterion("smt_short_switch <>", value, "smtShortSwitch");
            return (Criteria) this;
        }

        public Criteria andSmtShortSwitchGreaterThan(Byte value) {
            addCriterion("smt_short_switch >", value, "smtShortSwitch");
            return (Criteria) this;
        }

        public Criteria andSmtShortSwitchGreaterThanOrEqualTo(Byte value) {
            addCriterion("smt_short_switch >=", value, "smtShortSwitch");
            return (Criteria) this;
        }

        public Criteria andSmtShortSwitchLessThan(Byte value) {
            addCriterion("smt_short_switch <", value, "smtShortSwitch");
            return (Criteria) this;
        }

        public Criteria andSmtShortSwitchLessThanOrEqualTo(Byte value) {
            addCriterion("smt_short_switch <=", value, "smtShortSwitch");
            return (Criteria) this;
        }

        public Criteria andSmtShortSwitchIn(List<Byte> values) {
            addCriterion("smt_short_switch in", values, "smtShortSwitch");
            return (Criteria) this;
        }

        public Criteria andSmtShortSwitchNotIn(List<Byte> values) {
            addCriterion("smt_short_switch not in", values, "smtShortSwitch");
            return (Criteria) this;
        }

        public Criteria andSmtShortSwitchBetween(Byte value1, Byte value2) {
            addCriterion("smt_short_switch between", value1, value2, "smtShortSwitch");
            return (Criteria) this;
        }

        public Criteria andSmtShortSwitchNotBetween(Byte value1, Byte value2) {
            addCriterion("smt_short_switch not between", value1, value2, "smtShortSwitch");
            return (Criteria) this;
        }

        public Criteria andSmtShortContentIsNull() {
            addCriterion("smt_short_content is null");
            return (Criteria) this;
        }

        public Criteria andSmtShortContentIsNotNull() {
            addCriterion("smt_short_content is not null");
            return (Criteria) this;
        }

        public Criteria andSmtShortContentEqualTo(String value) {
            addCriterion("smt_short_content =", value, "smtShortContent");
            return (Criteria) this;
        }

        public Criteria andSmtShortContentNotEqualTo(String value) {
            addCriterion("smt_short_content <>", value, "smtShortContent");
            return (Criteria) this;
        }

        public Criteria andSmtShortContentGreaterThan(String value) {
            addCriterion("smt_short_content >", value, "smtShortContent");
            return (Criteria) this;
        }

        public Criteria andSmtShortContentGreaterThanOrEqualTo(String value) {
            addCriterion("smt_short_content >=", value, "smtShortContent");
            return (Criteria) this;
        }

        public Criteria andSmtShortContentLessThan(String value) {
            addCriterion("smt_short_content <", value, "smtShortContent");
            return (Criteria) this;
        }

        public Criteria andSmtShortContentLessThanOrEqualTo(String value) {
            addCriterion("smt_short_content <=", value, "smtShortContent");
            return (Criteria) this;
        }

        public Criteria andSmtShortContentLike(String value) {
            addCriterion("smt_short_content like", value, "smtShortContent");
            return (Criteria) this;
        }

        public Criteria andSmtShortContentNotLike(String value) {
            addCriterion("smt_short_content not like", value, "smtShortContent");
            return (Criteria) this;
        }

        public Criteria andSmtShortContentIn(List<String> values) {
            addCriterion("smt_short_content in", values, "smtShortContent");
            return (Criteria) this;
        }

        public Criteria andSmtShortContentNotIn(List<String> values) {
            addCriterion("smt_short_content not in", values, "smtShortContent");
            return (Criteria) this;
        }

        public Criteria andSmtShortContentBetween(String value1, String value2) {
            addCriterion("smt_short_content between", value1, value2, "smtShortContent");
            return (Criteria) this;
        }

        public Criteria andSmtShortContentNotBetween(String value1, String value2) {
            addCriterion("smt_short_content not between", value1, value2, "smtShortContent");
            return (Criteria) this;
        }

        public Criteria andSmtMailSwitchIsNull() {
            addCriterion("smt_mail_switch is null");
            return (Criteria) this;
        }

        public Criteria andSmtMailSwitchIsNotNull() {
            addCriterion("smt_mail_switch is not null");
            return (Criteria) this;
        }

        public Criteria andSmtMailSwitchEqualTo(Byte value) {
            addCriterion("smt_mail_switch =", value, "smtMailSwitch");
            return (Criteria) this;
        }

        public Criteria andSmtMailSwitchNotEqualTo(Byte value) {
            addCriterion("smt_mail_switch <>", value, "smtMailSwitch");
            return (Criteria) this;
        }

        public Criteria andSmtMailSwitchGreaterThan(Byte value) {
            addCriterion("smt_mail_switch >", value, "smtMailSwitch");
            return (Criteria) this;
        }

        public Criteria andSmtMailSwitchGreaterThanOrEqualTo(Byte value) {
            addCriterion("smt_mail_switch >=", value, "smtMailSwitch");
            return (Criteria) this;
        }

        public Criteria andSmtMailSwitchLessThan(Byte value) {
            addCriterion("smt_mail_switch <", value, "smtMailSwitch");
            return (Criteria) this;
        }

        public Criteria andSmtMailSwitchLessThanOrEqualTo(Byte value) {
            addCriterion("smt_mail_switch <=", value, "smtMailSwitch");
            return (Criteria) this;
        }

        public Criteria andSmtMailSwitchIn(List<Byte> values) {
            addCriterion("smt_mail_switch in", values, "smtMailSwitch");
            return (Criteria) this;
        }

        public Criteria andSmtMailSwitchNotIn(List<Byte> values) {
            addCriterion("smt_mail_switch not in", values, "smtMailSwitch");
            return (Criteria) this;
        }

        public Criteria andSmtMailSwitchBetween(Byte value1, Byte value2) {
            addCriterion("smt_mail_switch between", value1, value2, "smtMailSwitch");
            return (Criteria) this;
        }

        public Criteria andSmtMailSwitchNotBetween(Byte value1, Byte value2) {
            addCriterion("smt_mail_switch not between", value1, value2, "smtMailSwitch");
            return (Criteria) this;
        }

        public Criteria andSmtMailSubjectIsNull() {
            addCriterion("smt_mail_subject is null");
            return (Criteria) this;
        }

        public Criteria andSmtMailSubjectIsNotNull() {
            addCriterion("smt_mail_subject is not null");
            return (Criteria) this;
        }

        public Criteria andSmtMailSubjectEqualTo(String value) {
            addCriterion("smt_mail_subject =", value, "smtMailSubject");
            return (Criteria) this;
        }

        public Criteria andSmtMailSubjectNotEqualTo(String value) {
            addCriterion("smt_mail_subject <>", value, "smtMailSubject");
            return (Criteria) this;
        }

        public Criteria andSmtMailSubjectGreaterThan(String value) {
            addCriterion("smt_mail_subject >", value, "smtMailSubject");
            return (Criteria) this;
        }

        public Criteria andSmtMailSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("smt_mail_subject >=", value, "smtMailSubject");
            return (Criteria) this;
        }

        public Criteria andSmtMailSubjectLessThan(String value) {
            addCriterion("smt_mail_subject <", value, "smtMailSubject");
            return (Criteria) this;
        }

        public Criteria andSmtMailSubjectLessThanOrEqualTo(String value) {
            addCriterion("smt_mail_subject <=", value, "smtMailSubject");
            return (Criteria) this;
        }

        public Criteria andSmtMailSubjectLike(String value) {
            addCriterion("smt_mail_subject like", value, "smtMailSubject");
            return (Criteria) this;
        }

        public Criteria andSmtMailSubjectNotLike(String value) {
            addCriterion("smt_mail_subject not like", value, "smtMailSubject");
            return (Criteria) this;
        }

        public Criteria andSmtMailSubjectIn(List<String> values) {
            addCriterion("smt_mail_subject in", values, "smtMailSubject");
            return (Criteria) this;
        }

        public Criteria andSmtMailSubjectNotIn(List<String> values) {
            addCriterion("smt_mail_subject not in", values, "smtMailSubject");
            return (Criteria) this;
        }

        public Criteria andSmtMailSubjectBetween(String value1, String value2) {
            addCriterion("smt_mail_subject between", value1, value2, "smtMailSubject");
            return (Criteria) this;
        }

        public Criteria andSmtMailSubjectNotBetween(String value1, String value2) {
            addCriterion("smt_mail_subject not between", value1, value2, "smtMailSubject");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 商家消息模板
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