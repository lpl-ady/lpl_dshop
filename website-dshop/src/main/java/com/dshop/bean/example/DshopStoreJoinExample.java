/*
 * DshopStoreJoinExample.java
 * Copyright(C) dshop
 * All rights reserved.
 * -----------------------------------------------
 */
package com.dshop.bean.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DshopStoreJoinExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DshopStoreJoinExample() {
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
     * 店铺入驻表
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceIdIsNull() {
            addCriterion("company_province_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceIdIsNotNull() {
            addCriterion("company_province_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceIdEqualTo(Integer value) {
            addCriterion("company_province_id =", value, "companyProvinceId");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceIdNotEqualTo(Integer value) {
            addCriterion("company_province_id <>", value, "companyProvinceId");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceIdGreaterThan(Integer value) {
            addCriterion("company_province_id >", value, "companyProvinceId");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_province_id >=", value, "companyProvinceId");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceIdLessThan(Integer value) {
            addCriterion("company_province_id <", value, "companyProvinceId");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_province_id <=", value, "companyProvinceId");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceIdIn(List<Integer> values) {
            addCriterion("company_province_id in", values, "companyProvinceId");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceIdNotIn(List<Integer> values) {
            addCriterion("company_province_id not in", values, "companyProvinceId");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceIdBetween(Integer value1, Integer value2) {
            addCriterion("company_province_id between", value1, value2, "companyProvinceId");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_province_id not between", value1, value2, "companyProvinceId");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNull() {
            addCriterion("company_address is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNotNull() {
            addCriterion("company_address is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressEqualTo(String value) {
            addCriterion("company_address =", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotEqualTo(String value) {
            addCriterion("company_address <>", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThan(String value) {
            addCriterion("company_address >", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("company_address >=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThan(String value) {
            addCriterion("company_address <", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThanOrEqualTo(String value) {
            addCriterion("company_address <=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLike(String value) {
            addCriterion("company_address like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotLike(String value) {
            addCriterion("company_address not like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIn(List<String> values) {
            addCriterion("company_address in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotIn(List<String> values) {
            addCriterion("company_address not in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressBetween(String value1, String value2) {
            addCriterion("company_address between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotBetween(String value1, String value2) {
            addCriterion("company_address not between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressDetailIsNull() {
            addCriterion("company_address_detail is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressDetailIsNotNull() {
            addCriterion("company_address_detail is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressDetailEqualTo(String value) {
            addCriterion("company_address_detail =", value, "companyAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressDetailNotEqualTo(String value) {
            addCriterion("company_address_detail <>", value, "companyAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressDetailGreaterThan(String value) {
            addCriterion("company_address_detail >", value, "companyAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressDetailGreaterThanOrEqualTo(String value) {
            addCriterion("company_address_detail >=", value, "companyAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressDetailLessThan(String value) {
            addCriterion("company_address_detail <", value, "companyAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressDetailLessThanOrEqualTo(String value) {
            addCriterion("company_address_detail <=", value, "companyAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressDetailLike(String value) {
            addCriterion("company_address_detail like", value, "companyAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressDetailNotLike(String value) {
            addCriterion("company_address_detail not like", value, "companyAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressDetailIn(List<String> values) {
            addCriterion("company_address_detail in", values, "companyAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressDetailNotIn(List<String> values) {
            addCriterion("company_address_detail not in", values, "companyAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressDetailBetween(String value1, String value2) {
            addCriterion("company_address_detail between", value1, value2, "companyAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressDetailNotBetween(String value1, String value2) {
            addCriterion("company_address_detail not between", value1, value2, "companyAddressDetail");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIsNull() {
            addCriterion("company_phone is null");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIsNotNull() {
            addCriterion("company_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneEqualTo(String value) {
            addCriterion("company_phone =", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotEqualTo(String value) {
            addCriterion("company_phone <>", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneGreaterThan(String value) {
            addCriterion("company_phone >", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("company_phone >=", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLessThan(String value) {
            addCriterion("company_phone <", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLessThanOrEqualTo(String value) {
            addCriterion("company_phone <=", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLike(String value) {
            addCriterion("company_phone like", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotLike(String value) {
            addCriterion("company_phone not like", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIn(List<String> values) {
            addCriterion("company_phone in", values, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotIn(List<String> values) {
            addCriterion("company_phone not in", values, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneBetween(String value1, String value2) {
            addCriterion("company_phone between", value1, value2, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotBetween(String value1, String value2) {
            addCriterion("company_phone not between", value1, value2, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyEmployeeCountIsNull() {
            addCriterion("company_employee_count is null");
            return (Criteria) this;
        }

        public Criteria andCompanyEmployeeCountIsNotNull() {
            addCriterion("company_employee_count is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEmployeeCountEqualTo(Integer value) {
            addCriterion("company_employee_count =", value, "companyEmployeeCount");
            return (Criteria) this;
        }

        public Criteria andCompanyEmployeeCountNotEqualTo(Integer value) {
            addCriterion("company_employee_count <>", value, "companyEmployeeCount");
            return (Criteria) this;
        }

        public Criteria andCompanyEmployeeCountGreaterThan(Integer value) {
            addCriterion("company_employee_count >", value, "companyEmployeeCount");
            return (Criteria) this;
        }

        public Criteria andCompanyEmployeeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_employee_count >=", value, "companyEmployeeCount");
            return (Criteria) this;
        }

        public Criteria andCompanyEmployeeCountLessThan(Integer value) {
            addCriterion("company_employee_count <", value, "companyEmployeeCount");
            return (Criteria) this;
        }

        public Criteria andCompanyEmployeeCountLessThanOrEqualTo(Integer value) {
            addCriterion("company_employee_count <=", value, "companyEmployeeCount");
            return (Criteria) this;
        }

        public Criteria andCompanyEmployeeCountIn(List<Integer> values) {
            addCriterion("company_employee_count in", values, "companyEmployeeCount");
            return (Criteria) this;
        }

        public Criteria andCompanyEmployeeCountNotIn(List<Integer> values) {
            addCriterion("company_employee_count not in", values, "companyEmployeeCount");
            return (Criteria) this;
        }

        public Criteria andCompanyEmployeeCountBetween(Integer value1, Integer value2) {
            addCriterion("company_employee_count between", value1, value2, "companyEmployeeCount");
            return (Criteria) this;
        }

        public Criteria andCompanyEmployeeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("company_employee_count not between", value1, value2, "companyEmployeeCount");
            return (Criteria) this;
        }

        public Criteria andCompanyRegisteredCapitalIsNull() {
            addCriterion("company_registered_capital is null");
            return (Criteria) this;
        }

        public Criteria andCompanyRegisteredCapitalIsNotNull() {
            addCriterion("company_registered_capital is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyRegisteredCapitalEqualTo(Integer value) {
            addCriterion("company_registered_capital =", value, "companyRegisteredCapital");
            return (Criteria) this;
        }

        public Criteria andCompanyRegisteredCapitalNotEqualTo(Integer value) {
            addCriterion("company_registered_capital <>", value, "companyRegisteredCapital");
            return (Criteria) this;
        }

        public Criteria andCompanyRegisteredCapitalGreaterThan(Integer value) {
            addCriterion("company_registered_capital >", value, "companyRegisteredCapital");
            return (Criteria) this;
        }

        public Criteria andCompanyRegisteredCapitalGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_registered_capital >=", value, "companyRegisteredCapital");
            return (Criteria) this;
        }

        public Criteria andCompanyRegisteredCapitalLessThan(Integer value) {
            addCriterion("company_registered_capital <", value, "companyRegisteredCapital");
            return (Criteria) this;
        }

        public Criteria andCompanyRegisteredCapitalLessThanOrEqualTo(Integer value) {
            addCriterion("company_registered_capital <=", value, "companyRegisteredCapital");
            return (Criteria) this;
        }

        public Criteria andCompanyRegisteredCapitalIn(List<Integer> values) {
            addCriterion("company_registered_capital in", values, "companyRegisteredCapital");
            return (Criteria) this;
        }

        public Criteria andCompanyRegisteredCapitalNotIn(List<Integer> values) {
            addCriterion("company_registered_capital not in", values, "companyRegisteredCapital");
            return (Criteria) this;
        }

        public Criteria andCompanyRegisteredCapitalBetween(Integer value1, Integer value2) {
            addCriterion("company_registered_capital between", value1, value2, "companyRegisteredCapital");
            return (Criteria) this;
        }

        public Criteria andCompanyRegisteredCapitalNotBetween(Integer value1, Integer value2) {
            addCriterion("company_registered_capital not between", value1, value2, "companyRegisteredCapital");
            return (Criteria) this;
        }

        public Criteria andContactsNameIsNull() {
            addCriterion("contacts_name is null");
            return (Criteria) this;
        }

        public Criteria andContactsNameIsNotNull() {
            addCriterion("contacts_name is not null");
            return (Criteria) this;
        }

        public Criteria andContactsNameEqualTo(String value) {
            addCriterion("contacts_name =", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotEqualTo(String value) {
            addCriterion("contacts_name <>", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameGreaterThan(String value) {
            addCriterion("contacts_name >", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameGreaterThanOrEqualTo(String value) {
            addCriterion("contacts_name >=", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameLessThan(String value) {
            addCriterion("contacts_name <", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameLessThanOrEqualTo(String value) {
            addCriterion("contacts_name <=", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameLike(String value) {
            addCriterion("contacts_name like", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotLike(String value) {
            addCriterion("contacts_name not like", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameIn(List<String> values) {
            addCriterion("contacts_name in", values, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotIn(List<String> values) {
            addCriterion("contacts_name not in", values, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameBetween(String value1, String value2) {
            addCriterion("contacts_name between", value1, value2, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotBetween(String value1, String value2) {
            addCriterion("contacts_name not between", value1, value2, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneIsNull() {
            addCriterion("contacts_phone is null");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneIsNotNull() {
            addCriterion("contacts_phone is not null");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneEqualTo(String value) {
            addCriterion("contacts_phone =", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneNotEqualTo(String value) {
            addCriterion("contacts_phone <>", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneGreaterThan(String value) {
            addCriterion("contacts_phone >", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("contacts_phone >=", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneLessThan(String value) {
            addCriterion("contacts_phone <", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneLessThanOrEqualTo(String value) {
            addCriterion("contacts_phone <=", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneLike(String value) {
            addCriterion("contacts_phone like", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneNotLike(String value) {
            addCriterion("contacts_phone not like", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneIn(List<String> values) {
            addCriterion("contacts_phone in", values, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneNotIn(List<String> values) {
            addCriterion("contacts_phone not in", values, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneBetween(String value1, String value2) {
            addCriterion("contacts_phone between", value1, value2, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneNotBetween(String value1, String value2) {
            addCriterion("contacts_phone not between", value1, value2, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsEmailIsNull() {
            addCriterion("contacts_email is null");
            return (Criteria) this;
        }

        public Criteria andContactsEmailIsNotNull() {
            addCriterion("contacts_email is not null");
            return (Criteria) this;
        }

        public Criteria andContactsEmailEqualTo(String value) {
            addCriterion("contacts_email =", value, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailNotEqualTo(String value) {
            addCriterion("contacts_email <>", value, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailGreaterThan(String value) {
            addCriterion("contacts_email >", value, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailGreaterThanOrEqualTo(String value) {
            addCriterion("contacts_email >=", value, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailLessThan(String value) {
            addCriterion("contacts_email <", value, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailLessThanOrEqualTo(String value) {
            addCriterion("contacts_email <=", value, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailLike(String value) {
            addCriterion("contacts_email like", value, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailNotLike(String value) {
            addCriterion("contacts_email not like", value, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailIn(List<String> values) {
            addCriterion("contacts_email in", values, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailNotIn(List<String> values) {
            addCriterion("contacts_email not in", values, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailBetween(String value1, String value2) {
            addCriterion("contacts_email between", value1, value2, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andContactsEmailNotBetween(String value1, String value2) {
            addCriterion("contacts_email not between", value1, value2, "contactsEmail");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberIsNull() {
            addCriterion("business_licence_number is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberIsNotNull() {
            addCriterion("business_licence_number is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberEqualTo(String value) {
            addCriterion("business_licence_number =", value, "businessLicenceNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberNotEqualTo(String value) {
            addCriterion("business_licence_number <>", value, "businessLicenceNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberGreaterThan(String value) {
            addCriterion("business_licence_number >", value, "businessLicenceNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberGreaterThanOrEqualTo(String value) {
            addCriterion("business_licence_number >=", value, "businessLicenceNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberLessThan(String value) {
            addCriterion("business_licence_number <", value, "businessLicenceNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberLessThanOrEqualTo(String value) {
            addCriterion("business_licence_number <=", value, "businessLicenceNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberLike(String value) {
            addCriterion("business_licence_number like", value, "businessLicenceNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberNotLike(String value) {
            addCriterion("business_licence_number not like", value, "businessLicenceNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberIn(List<String> values) {
            addCriterion("business_licence_number in", values, "businessLicenceNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberNotIn(List<String> values) {
            addCriterion("business_licence_number not in", values, "businessLicenceNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberBetween(String value1, String value2) {
            addCriterion("business_licence_number between", value1, value2, "businessLicenceNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberNotBetween(String value1, String value2) {
            addCriterion("business_licence_number not between", value1, value2, "businessLicenceNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceAddressIsNull() {
            addCriterion("business_licence_address is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceAddressIsNotNull() {
            addCriterion("business_licence_address is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceAddressEqualTo(String value) {
            addCriterion("business_licence_address =", value, "businessLicenceAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceAddressNotEqualTo(String value) {
            addCriterion("business_licence_address <>", value, "businessLicenceAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceAddressGreaterThan(String value) {
            addCriterion("business_licence_address >", value, "businessLicenceAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceAddressGreaterThanOrEqualTo(String value) {
            addCriterion("business_licence_address >=", value, "businessLicenceAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceAddressLessThan(String value) {
            addCriterion("business_licence_address <", value, "businessLicenceAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceAddressLessThanOrEqualTo(String value) {
            addCriterion("business_licence_address <=", value, "businessLicenceAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceAddressLike(String value) {
            addCriterion("business_licence_address like", value, "businessLicenceAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceAddressNotLike(String value) {
            addCriterion("business_licence_address not like", value, "businessLicenceAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceAddressIn(List<String> values) {
            addCriterion("business_licence_address in", values, "businessLicenceAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceAddressNotIn(List<String> values) {
            addCriterion("business_licence_address not in", values, "businessLicenceAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceAddressBetween(String value1, String value2) {
            addCriterion("business_licence_address between", value1, value2, "businessLicenceAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceAddressNotBetween(String value1, String value2) {
            addCriterion("business_licence_address not between", value1, value2, "businessLicenceAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceStartIsNull() {
            addCriterion("business_licence_start is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceStartIsNotNull() {
            addCriterion("business_licence_start is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceStartEqualTo(Date value) {
            addCriterionForJDBCDate("business_licence_start =", value, "businessLicenceStart");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceStartNotEqualTo(Date value) {
            addCriterionForJDBCDate("business_licence_start <>", value, "businessLicenceStart");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceStartGreaterThan(Date value) {
            addCriterionForJDBCDate("business_licence_start >", value, "businessLicenceStart");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceStartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("business_licence_start >=", value, "businessLicenceStart");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceStartLessThan(Date value) {
            addCriterionForJDBCDate("business_licence_start <", value, "businessLicenceStart");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceStartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("business_licence_start <=", value, "businessLicenceStart");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceStartIn(List<Date> values) {
            addCriterionForJDBCDate("business_licence_start in", values, "businessLicenceStart");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceStartNotIn(List<Date> values) {
            addCriterionForJDBCDate("business_licence_start not in", values, "businessLicenceStart");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceStartBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("business_licence_start between", value1, value2, "businessLicenceStart");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceStartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("business_licence_start not between", value1, value2, "businessLicenceStart");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceEndIsNull() {
            addCriterion("business_licence_end is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceEndIsNotNull() {
            addCriterion("business_licence_end is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceEndEqualTo(Date value) {
            addCriterionForJDBCDate("business_licence_end =", value, "businessLicenceEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceEndNotEqualTo(Date value) {
            addCriterionForJDBCDate("business_licence_end <>", value, "businessLicenceEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceEndGreaterThan(Date value) {
            addCriterionForJDBCDate("business_licence_end >", value, "businessLicenceEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("business_licence_end >=", value, "businessLicenceEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceEndLessThan(Date value) {
            addCriterionForJDBCDate("business_licence_end <", value, "businessLicenceEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("business_licence_end <=", value, "businessLicenceEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceEndIn(List<Date> values) {
            addCriterionForJDBCDate("business_licence_end in", values, "businessLicenceEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceEndNotIn(List<Date> values) {
            addCriterionForJDBCDate("business_licence_end not in", values, "businessLicenceEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceEndBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("business_licence_end between", value1, value2, "businessLicenceEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("business_licence_end not between", value1, value2, "businessLicenceEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessSphereIsNull() {
            addCriterion("business_sphere is null");
            return (Criteria) this;
        }

        public Criteria andBusinessSphereIsNotNull() {
            addCriterion("business_sphere is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessSphereEqualTo(String value) {
            addCriterion("business_sphere =", value, "businessSphere");
            return (Criteria) this;
        }

        public Criteria andBusinessSphereNotEqualTo(String value) {
            addCriterion("business_sphere <>", value, "businessSphere");
            return (Criteria) this;
        }

        public Criteria andBusinessSphereGreaterThan(String value) {
            addCriterion("business_sphere >", value, "businessSphere");
            return (Criteria) this;
        }

        public Criteria andBusinessSphereGreaterThanOrEqualTo(String value) {
            addCriterion("business_sphere >=", value, "businessSphere");
            return (Criteria) this;
        }

        public Criteria andBusinessSphereLessThan(String value) {
            addCriterion("business_sphere <", value, "businessSphere");
            return (Criteria) this;
        }

        public Criteria andBusinessSphereLessThanOrEqualTo(String value) {
            addCriterion("business_sphere <=", value, "businessSphere");
            return (Criteria) this;
        }

        public Criteria andBusinessSphereLike(String value) {
            addCriterion("business_sphere like", value, "businessSphere");
            return (Criteria) this;
        }

        public Criteria andBusinessSphereNotLike(String value) {
            addCriterion("business_sphere not like", value, "businessSphere");
            return (Criteria) this;
        }

        public Criteria andBusinessSphereIn(List<String> values) {
            addCriterion("business_sphere in", values, "businessSphere");
            return (Criteria) this;
        }

        public Criteria andBusinessSphereNotIn(List<String> values) {
            addCriterion("business_sphere not in", values, "businessSphere");
            return (Criteria) this;
        }

        public Criteria andBusinessSphereBetween(String value1, String value2) {
            addCriterion("business_sphere between", value1, value2, "businessSphere");
            return (Criteria) this;
        }

        public Criteria andBusinessSphereNotBetween(String value1, String value2) {
            addCriterion("business_sphere not between", value1, value2, "businessSphere");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberElcIsNull() {
            addCriterion("business_licence_number_elc is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberElcIsNotNull() {
            addCriterion("business_licence_number_elc is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberElcEqualTo(String value) {
            addCriterion("business_licence_number_elc =", value, "businessLicenceNumberElc");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberElcNotEqualTo(String value) {
            addCriterion("business_licence_number_elc <>", value, "businessLicenceNumberElc");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberElcGreaterThan(String value) {
            addCriterion("business_licence_number_elc >", value, "businessLicenceNumberElc");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberElcGreaterThanOrEqualTo(String value) {
            addCriterion("business_licence_number_elc >=", value, "businessLicenceNumberElc");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberElcLessThan(String value) {
            addCriterion("business_licence_number_elc <", value, "businessLicenceNumberElc");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberElcLessThanOrEqualTo(String value) {
            addCriterion("business_licence_number_elc <=", value, "businessLicenceNumberElc");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberElcLike(String value) {
            addCriterion("business_licence_number_elc like", value, "businessLicenceNumberElc");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberElcNotLike(String value) {
            addCriterion("business_licence_number_elc not like", value, "businessLicenceNumberElc");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberElcIn(List<String> values) {
            addCriterion("business_licence_number_elc in", values, "businessLicenceNumberElc");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberElcNotIn(List<String> values) {
            addCriterion("business_licence_number_elc not in", values, "businessLicenceNumberElc");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberElcBetween(String value1, String value2) {
            addCriterion("business_licence_number_elc between", value1, value2, "businessLicenceNumberElc");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNumberElcNotBetween(String value1, String value2) {
            addCriterion("business_licence_number_elc not between", value1, value2, "businessLicenceNumberElc");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeIsNull() {
            addCriterion("organization_code is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeIsNotNull() {
            addCriterion("organization_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeEqualTo(String value) {
            addCriterion("organization_code =", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotEqualTo(String value) {
            addCriterion("organization_code <>", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeGreaterThan(String value) {
            addCriterion("organization_code >", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("organization_code >=", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeLessThan(String value) {
            addCriterion("organization_code <", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeLessThanOrEqualTo(String value) {
            addCriterion("organization_code <=", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeLike(String value) {
            addCriterion("organization_code like", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotLike(String value) {
            addCriterion("organization_code not like", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeIn(List<String> values) {
            addCriterion("organization_code in", values, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotIn(List<String> values) {
            addCriterion("organization_code not in", values, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeBetween(String value1, String value2) {
            addCriterion("organization_code between", value1, value2, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotBetween(String value1, String value2) {
            addCriterion("organization_code not between", value1, value2, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeElectronicIsNull() {
            addCriterion("organization_code_electronic is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeElectronicIsNotNull() {
            addCriterion("organization_code_electronic is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeElectronicEqualTo(String value) {
            addCriterion("organization_code_electronic =", value, "organizationCodeElectronic");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeElectronicNotEqualTo(String value) {
            addCriterion("organization_code_electronic <>", value, "organizationCodeElectronic");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeElectronicGreaterThan(String value) {
            addCriterion("organization_code_electronic >", value, "organizationCodeElectronic");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeElectronicGreaterThanOrEqualTo(String value) {
            addCriterion("organization_code_electronic >=", value, "organizationCodeElectronic");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeElectronicLessThan(String value) {
            addCriterion("organization_code_electronic <", value, "organizationCodeElectronic");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeElectronicLessThanOrEqualTo(String value) {
            addCriterion("organization_code_electronic <=", value, "organizationCodeElectronic");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeElectronicLike(String value) {
            addCriterion("organization_code_electronic like", value, "organizationCodeElectronic");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeElectronicNotLike(String value) {
            addCriterion("organization_code_electronic not like", value, "organizationCodeElectronic");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeElectronicIn(List<String> values) {
            addCriterion("organization_code_electronic in", values, "organizationCodeElectronic");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeElectronicNotIn(List<String> values) {
            addCriterion("organization_code_electronic not in", values, "organizationCodeElectronic");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeElectronicBetween(String value1, String value2) {
            addCriterion("organization_code_electronic between", value1, value2, "organizationCodeElectronic");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeElectronicNotBetween(String value1, String value2) {
            addCriterion("organization_code_electronic not between", value1, value2, "organizationCodeElectronic");
            return (Criteria) this;
        }

        public Criteria andGeneralTaxpayerIsNull() {
            addCriterion("general_taxpayer is null");
            return (Criteria) this;
        }

        public Criteria andGeneralTaxpayerIsNotNull() {
            addCriterion("general_taxpayer is not null");
            return (Criteria) this;
        }

        public Criteria andGeneralTaxpayerEqualTo(String value) {
            addCriterion("general_taxpayer =", value, "generalTaxpayer");
            return (Criteria) this;
        }

        public Criteria andGeneralTaxpayerNotEqualTo(String value) {
            addCriterion("general_taxpayer <>", value, "generalTaxpayer");
            return (Criteria) this;
        }

        public Criteria andGeneralTaxpayerGreaterThan(String value) {
            addCriterion("general_taxpayer >", value, "generalTaxpayer");
            return (Criteria) this;
        }

        public Criteria andGeneralTaxpayerGreaterThanOrEqualTo(String value) {
            addCriterion("general_taxpayer >=", value, "generalTaxpayer");
            return (Criteria) this;
        }

        public Criteria andGeneralTaxpayerLessThan(String value) {
            addCriterion("general_taxpayer <", value, "generalTaxpayer");
            return (Criteria) this;
        }

        public Criteria andGeneralTaxpayerLessThanOrEqualTo(String value) {
            addCriterion("general_taxpayer <=", value, "generalTaxpayer");
            return (Criteria) this;
        }

        public Criteria andGeneralTaxpayerLike(String value) {
            addCriterion("general_taxpayer like", value, "generalTaxpayer");
            return (Criteria) this;
        }

        public Criteria andGeneralTaxpayerNotLike(String value) {
            addCriterion("general_taxpayer not like", value, "generalTaxpayer");
            return (Criteria) this;
        }

        public Criteria andGeneralTaxpayerIn(List<String> values) {
            addCriterion("general_taxpayer in", values, "generalTaxpayer");
            return (Criteria) this;
        }

        public Criteria andGeneralTaxpayerNotIn(List<String> values) {
            addCriterion("general_taxpayer not in", values, "generalTaxpayer");
            return (Criteria) this;
        }

        public Criteria andGeneralTaxpayerBetween(String value1, String value2) {
            addCriterion("general_taxpayer between", value1, value2, "generalTaxpayer");
            return (Criteria) this;
        }

        public Criteria andGeneralTaxpayerNotBetween(String value1, String value2) {
            addCriterion("general_taxpayer not between", value1, value2, "generalTaxpayer");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameIsNull() {
            addCriterion("bank_account_name is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameIsNotNull() {
            addCriterion("bank_account_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameEqualTo(String value) {
            addCriterion("bank_account_name =", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotEqualTo(String value) {
            addCriterion("bank_account_name <>", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameGreaterThan(String value) {
            addCriterion("bank_account_name >", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account_name >=", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameLessThan(String value) {
            addCriterion("bank_account_name <", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameLessThanOrEqualTo(String value) {
            addCriterion("bank_account_name <=", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameLike(String value) {
            addCriterion("bank_account_name like", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotLike(String value) {
            addCriterion("bank_account_name not like", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameIn(List<String> values) {
            addCriterion("bank_account_name in", values, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotIn(List<String> values) {
            addCriterion("bank_account_name not in", values, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameBetween(String value1, String value2) {
            addCriterion("bank_account_name between", value1, value2, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotBetween(String value1, String value2) {
            addCriterion("bank_account_name not between", value1, value2, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNumberIsNull() {
            addCriterion("bank_account_number is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNumberIsNotNull() {
            addCriterion("bank_account_number is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNumberEqualTo(String value) {
            addCriterion("bank_account_number =", value, "bankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBankAccountNumberNotEqualTo(String value) {
            addCriterion("bank_account_number <>", value, "bankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBankAccountNumberGreaterThan(String value) {
            addCriterion("bank_account_number >", value, "bankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBankAccountNumberGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account_number >=", value, "bankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBankAccountNumberLessThan(String value) {
            addCriterion("bank_account_number <", value, "bankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBankAccountNumberLessThanOrEqualTo(String value) {
            addCriterion("bank_account_number <=", value, "bankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBankAccountNumberLike(String value) {
            addCriterion("bank_account_number like", value, "bankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBankAccountNumberNotLike(String value) {
            addCriterion("bank_account_number not like", value, "bankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBankAccountNumberIn(List<String> values) {
            addCriterion("bank_account_number in", values, "bankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBankAccountNumberNotIn(List<String> values) {
            addCriterion("bank_account_number not in", values, "bankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBankAccountNumberBetween(String value1, String value2) {
            addCriterion("bank_account_number between", value1, value2, "bankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBankAccountNumberNotBetween(String value1, String value2) {
            addCriterion("bank_account_number not between", value1, value2, "bankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("bank_name =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("bank_name <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("bank_name like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("bank_name not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("bank_name in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNull() {
            addCriterion("bank_code is null");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNotNull() {
            addCriterion("bank_code is not null");
            return (Criteria) this;
        }

        public Criteria andBankCodeEqualTo(String value) {
            addCriterion("bank_code =", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotEqualTo(String value) {
            addCriterion("bank_code <>", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThan(String value) {
            addCriterion("bank_code >", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bank_code >=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThan(String value) {
            addCriterion("bank_code <", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThanOrEqualTo(String value) {
            addCriterion("bank_code <=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLike(String value) {
            addCriterion("bank_code like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotLike(String value) {
            addCriterion("bank_code not like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeIn(List<String> values) {
            addCriterion("bank_code in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotIn(List<String> values) {
            addCriterion("bank_code not in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeBetween(String value1, String value2) {
            addCriterion("bank_code between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotBetween(String value1, String value2) {
            addCriterion("bank_code not between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankAddressIsNull() {
            addCriterion("bank_address is null");
            return (Criteria) this;
        }

        public Criteria andBankAddressIsNotNull() {
            addCriterion("bank_address is not null");
            return (Criteria) this;
        }

        public Criteria andBankAddressEqualTo(String value) {
            addCriterion("bank_address =", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressNotEqualTo(String value) {
            addCriterion("bank_address <>", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressGreaterThan(String value) {
            addCriterion("bank_address >", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressGreaterThanOrEqualTo(String value) {
            addCriterion("bank_address >=", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressLessThan(String value) {
            addCriterion("bank_address <", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressLessThanOrEqualTo(String value) {
            addCriterion("bank_address <=", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressLike(String value) {
            addCriterion("bank_address like", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressNotLike(String value) {
            addCriterion("bank_address not like", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressIn(List<String> values) {
            addCriterion("bank_address in", values, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressNotIn(List<String> values) {
            addCriterion("bank_address not in", values, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressBetween(String value1, String value2) {
            addCriterion("bank_address between", value1, value2, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressNotBetween(String value1, String value2) {
            addCriterion("bank_address not between", value1, value2, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankLicenceElectronicIsNull() {
            addCriterion("bank_licence_electronic is null");
            return (Criteria) this;
        }

        public Criteria andBankLicenceElectronicIsNotNull() {
            addCriterion("bank_licence_electronic is not null");
            return (Criteria) this;
        }

        public Criteria andBankLicenceElectronicEqualTo(String value) {
            addCriterion("bank_licence_electronic =", value, "bankLicenceElectronic");
            return (Criteria) this;
        }

        public Criteria andBankLicenceElectronicNotEqualTo(String value) {
            addCriterion("bank_licence_electronic <>", value, "bankLicenceElectronic");
            return (Criteria) this;
        }

        public Criteria andBankLicenceElectronicGreaterThan(String value) {
            addCriterion("bank_licence_electronic >", value, "bankLicenceElectronic");
            return (Criteria) this;
        }

        public Criteria andBankLicenceElectronicGreaterThanOrEqualTo(String value) {
            addCriterion("bank_licence_electronic >=", value, "bankLicenceElectronic");
            return (Criteria) this;
        }

        public Criteria andBankLicenceElectronicLessThan(String value) {
            addCriterion("bank_licence_electronic <", value, "bankLicenceElectronic");
            return (Criteria) this;
        }

        public Criteria andBankLicenceElectronicLessThanOrEqualTo(String value) {
            addCriterion("bank_licence_electronic <=", value, "bankLicenceElectronic");
            return (Criteria) this;
        }

        public Criteria andBankLicenceElectronicLike(String value) {
            addCriterion("bank_licence_electronic like", value, "bankLicenceElectronic");
            return (Criteria) this;
        }

        public Criteria andBankLicenceElectronicNotLike(String value) {
            addCriterion("bank_licence_electronic not like", value, "bankLicenceElectronic");
            return (Criteria) this;
        }

        public Criteria andBankLicenceElectronicIn(List<String> values) {
            addCriterion("bank_licence_electronic in", values, "bankLicenceElectronic");
            return (Criteria) this;
        }

        public Criteria andBankLicenceElectronicNotIn(List<String> values) {
            addCriterion("bank_licence_electronic not in", values, "bankLicenceElectronic");
            return (Criteria) this;
        }

        public Criteria andBankLicenceElectronicBetween(String value1, String value2) {
            addCriterion("bank_licence_electronic between", value1, value2, "bankLicenceElectronic");
            return (Criteria) this;
        }

        public Criteria andBankLicenceElectronicNotBetween(String value1, String value2) {
            addCriterion("bank_licence_electronic not between", value1, value2, "bankLicenceElectronic");
            return (Criteria) this;
        }

        public Criteria andIsSettlementAccountIsNull() {
            addCriterion("is_settlement_account is null");
            return (Criteria) this;
        }

        public Criteria andIsSettlementAccountIsNotNull() {
            addCriterion("is_settlement_account is not null");
            return (Criteria) this;
        }

        public Criteria andIsSettlementAccountEqualTo(Boolean value) {
            addCriterion("is_settlement_account =", value, "isSettlementAccount");
            return (Criteria) this;
        }

        public Criteria andIsSettlementAccountNotEqualTo(Boolean value) {
            addCriterion("is_settlement_account <>", value, "isSettlementAccount");
            return (Criteria) this;
        }

        public Criteria andIsSettlementAccountGreaterThan(Boolean value) {
            addCriterion("is_settlement_account >", value, "isSettlementAccount");
            return (Criteria) this;
        }

        public Criteria andIsSettlementAccountGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_settlement_account >=", value, "isSettlementAccount");
            return (Criteria) this;
        }

        public Criteria andIsSettlementAccountLessThan(Boolean value) {
            addCriterion("is_settlement_account <", value, "isSettlementAccount");
            return (Criteria) this;
        }

        public Criteria andIsSettlementAccountLessThanOrEqualTo(Boolean value) {
            addCriterion("is_settlement_account <=", value, "isSettlementAccount");
            return (Criteria) this;
        }

        public Criteria andIsSettlementAccountIn(List<Boolean> values) {
            addCriterion("is_settlement_account in", values, "isSettlementAccount");
            return (Criteria) this;
        }

        public Criteria andIsSettlementAccountNotIn(List<Boolean> values) {
            addCriterion("is_settlement_account not in", values, "isSettlementAccount");
            return (Criteria) this;
        }

        public Criteria andIsSettlementAccountBetween(Boolean value1, Boolean value2) {
            addCriterion("is_settlement_account between", value1, value2, "isSettlementAccount");
            return (Criteria) this;
        }

        public Criteria andIsSettlementAccountNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_settlement_account not between", value1, value2, "isSettlementAccount");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNameIsNull() {
            addCriterion("settlement_bank_account_name is null");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNameIsNotNull() {
            addCriterion("settlement_bank_account_name is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNameEqualTo(String value) {
            addCriterion("settlement_bank_account_name =", value, "settlementBankAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNameNotEqualTo(String value) {
            addCriterion("settlement_bank_account_name <>", value, "settlementBankAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNameGreaterThan(String value) {
            addCriterion("settlement_bank_account_name >", value, "settlementBankAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("settlement_bank_account_name >=", value, "settlementBankAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNameLessThan(String value) {
            addCriterion("settlement_bank_account_name <", value, "settlementBankAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNameLessThanOrEqualTo(String value) {
            addCriterion("settlement_bank_account_name <=", value, "settlementBankAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNameLike(String value) {
            addCriterion("settlement_bank_account_name like", value, "settlementBankAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNameNotLike(String value) {
            addCriterion("settlement_bank_account_name not like", value, "settlementBankAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNameIn(List<String> values) {
            addCriterion("settlement_bank_account_name in", values, "settlementBankAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNameNotIn(List<String> values) {
            addCriterion("settlement_bank_account_name not in", values, "settlementBankAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNameBetween(String value1, String value2) {
            addCriterion("settlement_bank_account_name between", value1, value2, "settlementBankAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNameNotBetween(String value1, String value2) {
            addCriterion("settlement_bank_account_name not between", value1, value2, "settlementBankAccountName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNumberIsNull() {
            addCriterion("settlement_bank_account_number is null");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNumberIsNotNull() {
            addCriterion("settlement_bank_account_number is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNumberEqualTo(String value) {
            addCriterion("settlement_bank_account_number =", value, "settlementBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNumberNotEqualTo(String value) {
            addCriterion("settlement_bank_account_number <>", value, "settlementBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNumberGreaterThan(String value) {
            addCriterion("settlement_bank_account_number >", value, "settlementBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNumberGreaterThanOrEqualTo(String value) {
            addCriterion("settlement_bank_account_number >=", value, "settlementBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNumberLessThan(String value) {
            addCriterion("settlement_bank_account_number <", value, "settlementBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNumberLessThanOrEqualTo(String value) {
            addCriterion("settlement_bank_account_number <=", value, "settlementBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNumberLike(String value) {
            addCriterion("settlement_bank_account_number like", value, "settlementBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNumberNotLike(String value) {
            addCriterion("settlement_bank_account_number not like", value, "settlementBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNumberIn(List<String> values) {
            addCriterion("settlement_bank_account_number in", values, "settlementBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNumberNotIn(List<String> values) {
            addCriterion("settlement_bank_account_number not in", values, "settlementBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNumberBetween(String value1, String value2) {
            addCriterion("settlement_bank_account_number between", value1, value2, "settlementBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAccountNumberNotBetween(String value1, String value2) {
            addCriterion("settlement_bank_account_number not between", value1, value2, "settlementBankAccountNumber");
            return (Criteria) this;
        }

        public Criteria andSettlementBankNameIsNull() {
            addCriterion("settlement_bank_name is null");
            return (Criteria) this;
        }

        public Criteria andSettlementBankNameIsNotNull() {
            addCriterion("settlement_bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementBankNameEqualTo(String value) {
            addCriterion("settlement_bank_name =", value, "settlementBankName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankNameNotEqualTo(String value) {
            addCriterion("settlement_bank_name <>", value, "settlementBankName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankNameGreaterThan(String value) {
            addCriterion("settlement_bank_name >", value, "settlementBankName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("settlement_bank_name >=", value, "settlementBankName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankNameLessThan(String value) {
            addCriterion("settlement_bank_name <", value, "settlementBankName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankNameLessThanOrEqualTo(String value) {
            addCriterion("settlement_bank_name <=", value, "settlementBankName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankNameLike(String value) {
            addCriterion("settlement_bank_name like", value, "settlementBankName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankNameNotLike(String value) {
            addCriterion("settlement_bank_name not like", value, "settlementBankName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankNameIn(List<String> values) {
            addCriterion("settlement_bank_name in", values, "settlementBankName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankNameNotIn(List<String> values) {
            addCriterion("settlement_bank_name not in", values, "settlementBankName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankNameBetween(String value1, String value2) {
            addCriterion("settlement_bank_name between", value1, value2, "settlementBankName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankNameNotBetween(String value1, String value2) {
            addCriterion("settlement_bank_name not between", value1, value2, "settlementBankName");
            return (Criteria) this;
        }

        public Criteria andSettlementBankCodeIsNull() {
            addCriterion("settlement_bank_code is null");
            return (Criteria) this;
        }

        public Criteria andSettlementBankCodeIsNotNull() {
            addCriterion("settlement_bank_code is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementBankCodeEqualTo(String value) {
            addCriterion("settlement_bank_code =", value, "settlementBankCode");
            return (Criteria) this;
        }

        public Criteria andSettlementBankCodeNotEqualTo(String value) {
            addCriterion("settlement_bank_code <>", value, "settlementBankCode");
            return (Criteria) this;
        }

        public Criteria andSettlementBankCodeGreaterThan(String value) {
            addCriterion("settlement_bank_code >", value, "settlementBankCode");
            return (Criteria) this;
        }

        public Criteria andSettlementBankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("settlement_bank_code >=", value, "settlementBankCode");
            return (Criteria) this;
        }

        public Criteria andSettlementBankCodeLessThan(String value) {
            addCriterion("settlement_bank_code <", value, "settlementBankCode");
            return (Criteria) this;
        }

        public Criteria andSettlementBankCodeLessThanOrEqualTo(String value) {
            addCriterion("settlement_bank_code <=", value, "settlementBankCode");
            return (Criteria) this;
        }

        public Criteria andSettlementBankCodeLike(String value) {
            addCriterion("settlement_bank_code like", value, "settlementBankCode");
            return (Criteria) this;
        }

        public Criteria andSettlementBankCodeNotLike(String value) {
            addCriterion("settlement_bank_code not like", value, "settlementBankCode");
            return (Criteria) this;
        }

        public Criteria andSettlementBankCodeIn(List<String> values) {
            addCriterion("settlement_bank_code in", values, "settlementBankCode");
            return (Criteria) this;
        }

        public Criteria andSettlementBankCodeNotIn(List<String> values) {
            addCriterion("settlement_bank_code not in", values, "settlementBankCode");
            return (Criteria) this;
        }

        public Criteria andSettlementBankCodeBetween(String value1, String value2) {
            addCriterion("settlement_bank_code between", value1, value2, "settlementBankCode");
            return (Criteria) this;
        }

        public Criteria andSettlementBankCodeNotBetween(String value1, String value2) {
            addCriterion("settlement_bank_code not between", value1, value2, "settlementBankCode");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAddressIsNull() {
            addCriterion("settlement_bank_address is null");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAddressIsNotNull() {
            addCriterion("settlement_bank_address is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAddressEqualTo(String value) {
            addCriterion("settlement_bank_address =", value, "settlementBankAddress");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAddressNotEqualTo(String value) {
            addCriterion("settlement_bank_address <>", value, "settlementBankAddress");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAddressGreaterThan(String value) {
            addCriterion("settlement_bank_address >", value, "settlementBankAddress");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAddressGreaterThanOrEqualTo(String value) {
            addCriterion("settlement_bank_address >=", value, "settlementBankAddress");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAddressLessThan(String value) {
            addCriterion("settlement_bank_address <", value, "settlementBankAddress");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAddressLessThanOrEqualTo(String value) {
            addCriterion("settlement_bank_address <=", value, "settlementBankAddress");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAddressLike(String value) {
            addCriterion("settlement_bank_address like", value, "settlementBankAddress");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAddressNotLike(String value) {
            addCriterion("settlement_bank_address not like", value, "settlementBankAddress");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAddressIn(List<String> values) {
            addCriterion("settlement_bank_address in", values, "settlementBankAddress");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAddressNotIn(List<String> values) {
            addCriterion("settlement_bank_address not in", values, "settlementBankAddress");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAddressBetween(String value1, String value2) {
            addCriterion("settlement_bank_address between", value1, value2, "settlementBankAddress");
            return (Criteria) this;
        }

        public Criteria andSettlementBankAddressNotBetween(String value1, String value2) {
            addCriterion("settlement_bank_address not between", value1, value2, "settlementBankAddress");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateIsNull() {
            addCriterion("tax_registration_certificate is null");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateIsNotNull() {
            addCriterion("tax_registration_certificate is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateEqualTo(String value) {
            addCriterion("tax_registration_certificate =", value, "taxRegistrationCertificate");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateNotEqualTo(String value) {
            addCriterion("tax_registration_certificate <>", value, "taxRegistrationCertificate");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateGreaterThan(String value) {
            addCriterion("tax_registration_certificate >", value, "taxRegistrationCertificate");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateGreaterThanOrEqualTo(String value) {
            addCriterion("tax_registration_certificate >=", value, "taxRegistrationCertificate");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateLessThan(String value) {
            addCriterion("tax_registration_certificate <", value, "taxRegistrationCertificate");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateLessThanOrEqualTo(String value) {
            addCriterion("tax_registration_certificate <=", value, "taxRegistrationCertificate");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateLike(String value) {
            addCriterion("tax_registration_certificate like", value, "taxRegistrationCertificate");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateNotLike(String value) {
            addCriterion("tax_registration_certificate not like", value, "taxRegistrationCertificate");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateIn(List<String> values) {
            addCriterion("tax_registration_certificate in", values, "taxRegistrationCertificate");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateNotIn(List<String> values) {
            addCriterion("tax_registration_certificate not in", values, "taxRegistrationCertificate");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateBetween(String value1, String value2) {
            addCriterion("tax_registration_certificate between", value1, value2, "taxRegistrationCertificate");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertificateNotBetween(String value1, String value2) {
            addCriterion("tax_registration_certificate not between", value1, value2, "taxRegistrationCertificate");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdIsNull() {
            addCriterion("taxpayer_id is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdIsNotNull() {
            addCriterion("taxpayer_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdEqualTo(String value) {
            addCriterion("taxpayer_id =", value, "taxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdNotEqualTo(String value) {
            addCriterion("taxpayer_id <>", value, "taxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdGreaterThan(String value) {
            addCriterion("taxpayer_id >", value, "taxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdGreaterThanOrEqualTo(String value) {
            addCriterion("taxpayer_id >=", value, "taxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdLessThan(String value) {
            addCriterion("taxpayer_id <", value, "taxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdLessThanOrEqualTo(String value) {
            addCriterion("taxpayer_id <=", value, "taxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdLike(String value) {
            addCriterion("taxpayer_id like", value, "taxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdNotLike(String value) {
            addCriterion("taxpayer_id not like", value, "taxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdIn(List<String> values) {
            addCriterion("taxpayer_id in", values, "taxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdNotIn(List<String> values) {
            addCriterion("taxpayer_id not in", values, "taxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdBetween(String value1, String value2) {
            addCriterion("taxpayer_id between", value1, value2, "taxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxpayerIdNotBetween(String value1, String value2) {
            addCriterion("taxpayer_id not between", value1, value2, "taxpayerId");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertifElcIsNull() {
            addCriterion("tax_registration_certif_elc is null");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertifElcIsNotNull() {
            addCriterion("tax_registration_certif_elc is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertifElcEqualTo(String value) {
            addCriterion("tax_registration_certif_elc =", value, "taxRegistrationCertifElc");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertifElcNotEqualTo(String value) {
            addCriterion("tax_registration_certif_elc <>", value, "taxRegistrationCertifElc");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertifElcGreaterThan(String value) {
            addCriterion("tax_registration_certif_elc >", value, "taxRegistrationCertifElc");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertifElcGreaterThanOrEqualTo(String value) {
            addCriterion("tax_registration_certif_elc >=", value, "taxRegistrationCertifElc");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertifElcLessThan(String value) {
            addCriterion("tax_registration_certif_elc <", value, "taxRegistrationCertifElc");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertifElcLessThanOrEqualTo(String value) {
            addCriterion("tax_registration_certif_elc <=", value, "taxRegistrationCertifElc");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertifElcLike(String value) {
            addCriterion("tax_registration_certif_elc like", value, "taxRegistrationCertifElc");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertifElcNotLike(String value) {
            addCriterion("tax_registration_certif_elc not like", value, "taxRegistrationCertifElc");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertifElcIn(List<String> values) {
            addCriterion("tax_registration_certif_elc in", values, "taxRegistrationCertifElc");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertifElcNotIn(List<String> values) {
            addCriterion("tax_registration_certif_elc not in", values, "taxRegistrationCertifElc");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertifElcBetween(String value1, String value2) {
            addCriterion("tax_registration_certif_elc between", value1, value2, "taxRegistrationCertifElc");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationCertifElcNotBetween(String value1, String value2) {
            addCriterion("tax_registration_certif_elc not between", value1, value2, "taxRegistrationCertifElc");
            return (Criteria) this;
        }

        public Criteria andSellerNameIsNull() {
            addCriterion("seller_name is null");
            return (Criteria) this;
        }

        public Criteria andSellerNameIsNotNull() {
            addCriterion("seller_name is not null");
            return (Criteria) this;
        }

        public Criteria andSellerNameEqualTo(String value) {
            addCriterion("seller_name =", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotEqualTo(String value) {
            addCriterion("seller_name <>", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThan(String value) {
            addCriterion("seller_name >", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThanOrEqualTo(String value) {
            addCriterion("seller_name >=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThan(String value) {
            addCriterion("seller_name <", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThanOrEqualTo(String value) {
            addCriterion("seller_name <=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLike(String value) {
            addCriterion("seller_name like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotLike(String value) {
            addCriterion("seller_name not like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameIn(List<String> values) {
            addCriterion("seller_name in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotIn(List<String> values) {
            addCriterion("seller_name not in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameBetween(String value1, String value2) {
            addCriterion("seller_name between", value1, value2, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotBetween(String value1, String value2) {
            addCriterion("seller_name not between", value1, value2, "sellerName");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNull() {
            addCriterion("store_name is null");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNotNull() {
            addCriterion("store_name is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNameEqualTo(String value) {
            addCriterion("store_name =", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotEqualTo(String value) {
            addCriterion("store_name <>", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThan(String value) {
            addCriterion("store_name >", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("store_name >=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThan(String value) {
            addCriterion("store_name <", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThanOrEqualTo(String value) {
            addCriterion("store_name <=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLike(String value) {
            addCriterion("store_name like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotLike(String value) {
            addCriterion("store_name not like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameIn(List<String> values) {
            addCriterion("store_name in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotIn(List<String> values) {
            addCriterion("store_name not in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameBetween(String value1, String value2) {
            addCriterion("store_name between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotBetween(String value1, String value2) {
            addCriterion("store_name not between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreClassIdsIsNull() {
            addCriterion("store_class_ids is null");
            return (Criteria) this;
        }

        public Criteria andStoreClassIdsIsNotNull() {
            addCriterion("store_class_ids is not null");
            return (Criteria) this;
        }

        public Criteria andStoreClassIdsEqualTo(String value) {
            addCriterion("store_class_ids =", value, "storeClassIds");
            return (Criteria) this;
        }

        public Criteria andStoreClassIdsNotEqualTo(String value) {
            addCriterion("store_class_ids <>", value, "storeClassIds");
            return (Criteria) this;
        }

        public Criteria andStoreClassIdsGreaterThan(String value) {
            addCriterion("store_class_ids >", value, "storeClassIds");
            return (Criteria) this;
        }

        public Criteria andStoreClassIdsGreaterThanOrEqualTo(String value) {
            addCriterion("store_class_ids >=", value, "storeClassIds");
            return (Criteria) this;
        }

        public Criteria andStoreClassIdsLessThan(String value) {
            addCriterion("store_class_ids <", value, "storeClassIds");
            return (Criteria) this;
        }

        public Criteria andStoreClassIdsLessThanOrEqualTo(String value) {
            addCriterion("store_class_ids <=", value, "storeClassIds");
            return (Criteria) this;
        }

        public Criteria andStoreClassIdsLike(String value) {
            addCriterion("store_class_ids like", value, "storeClassIds");
            return (Criteria) this;
        }

        public Criteria andStoreClassIdsNotLike(String value) {
            addCriterion("store_class_ids not like", value, "storeClassIds");
            return (Criteria) this;
        }

        public Criteria andStoreClassIdsIn(List<String> values) {
            addCriterion("store_class_ids in", values, "storeClassIds");
            return (Criteria) this;
        }

        public Criteria andStoreClassIdsNotIn(List<String> values) {
            addCriterion("store_class_ids not in", values, "storeClassIds");
            return (Criteria) this;
        }

        public Criteria andStoreClassIdsBetween(String value1, String value2) {
            addCriterion("store_class_ids between", value1, value2, "storeClassIds");
            return (Criteria) this;
        }

        public Criteria andStoreClassIdsNotBetween(String value1, String value2) {
            addCriterion("store_class_ids not between", value1, value2, "storeClassIds");
            return (Criteria) this;
        }

        public Criteria andStoreClassNamesIsNull() {
            addCriterion("store_class_names is null");
            return (Criteria) this;
        }

        public Criteria andStoreClassNamesIsNotNull() {
            addCriterion("store_class_names is not null");
            return (Criteria) this;
        }

        public Criteria andStoreClassNamesEqualTo(String value) {
            addCriterion("store_class_names =", value, "storeClassNames");
            return (Criteria) this;
        }

        public Criteria andStoreClassNamesNotEqualTo(String value) {
            addCriterion("store_class_names <>", value, "storeClassNames");
            return (Criteria) this;
        }

        public Criteria andStoreClassNamesGreaterThan(String value) {
            addCriterion("store_class_names >", value, "storeClassNames");
            return (Criteria) this;
        }

        public Criteria andStoreClassNamesGreaterThanOrEqualTo(String value) {
            addCriterion("store_class_names >=", value, "storeClassNames");
            return (Criteria) this;
        }

        public Criteria andStoreClassNamesLessThan(String value) {
            addCriterion("store_class_names <", value, "storeClassNames");
            return (Criteria) this;
        }

        public Criteria andStoreClassNamesLessThanOrEqualTo(String value) {
            addCriterion("store_class_names <=", value, "storeClassNames");
            return (Criteria) this;
        }

        public Criteria andStoreClassNamesLike(String value) {
            addCriterion("store_class_names like", value, "storeClassNames");
            return (Criteria) this;
        }

        public Criteria andStoreClassNamesNotLike(String value) {
            addCriterion("store_class_names not like", value, "storeClassNames");
            return (Criteria) this;
        }

        public Criteria andStoreClassNamesIn(List<String> values) {
            addCriterion("store_class_names in", values, "storeClassNames");
            return (Criteria) this;
        }

        public Criteria andStoreClassNamesNotIn(List<String> values) {
            addCriterion("store_class_names not in", values, "storeClassNames");
            return (Criteria) this;
        }

        public Criteria andStoreClassNamesBetween(String value1, String value2) {
            addCriterion("store_class_names between", value1, value2, "storeClassNames");
            return (Criteria) this;
        }

        public Criteria andStoreClassNamesNotBetween(String value1, String value2) {
            addCriterion("store_class_names not between", value1, value2, "storeClassNames");
            return (Criteria) this;
        }

        public Criteria andJoininStatusIsNull() {
            addCriterion("joinin_status is null");
            return (Criteria) this;
        }

        public Criteria andJoininStatusIsNotNull() {
            addCriterion("joinin_status is not null");
            return (Criteria) this;
        }

        public Criteria andJoininStatusEqualTo(String value) {
            addCriterion("joinin_status =", value, "joininStatus");
            return (Criteria) this;
        }

        public Criteria andJoininStatusNotEqualTo(String value) {
            addCriterion("joinin_status <>", value, "joininStatus");
            return (Criteria) this;
        }

        public Criteria andJoininStatusGreaterThan(String value) {
            addCriterion("joinin_status >", value, "joininStatus");
            return (Criteria) this;
        }

        public Criteria andJoininStatusGreaterThanOrEqualTo(String value) {
            addCriterion("joinin_status >=", value, "joininStatus");
            return (Criteria) this;
        }

        public Criteria andJoininStatusLessThan(String value) {
            addCriterion("joinin_status <", value, "joininStatus");
            return (Criteria) this;
        }

        public Criteria andJoininStatusLessThanOrEqualTo(String value) {
            addCriterion("joinin_status <=", value, "joininStatus");
            return (Criteria) this;
        }

        public Criteria andJoininStatusLike(String value) {
            addCriterion("joinin_status like", value, "joininStatus");
            return (Criteria) this;
        }

        public Criteria andJoininStatusNotLike(String value) {
            addCriterion("joinin_status not like", value, "joininStatus");
            return (Criteria) this;
        }

        public Criteria andJoininStatusIn(List<String> values) {
            addCriterion("joinin_status in", values, "joininStatus");
            return (Criteria) this;
        }

        public Criteria andJoininStatusNotIn(List<String> values) {
            addCriterion("joinin_status not in", values, "joininStatus");
            return (Criteria) this;
        }

        public Criteria andJoininStatusBetween(String value1, String value2) {
            addCriterion("joinin_status between", value1, value2, "joininStatus");
            return (Criteria) this;
        }

        public Criteria andJoininStatusNotBetween(String value1, String value2) {
            addCriterion("joinin_status not between", value1, value2, "joininStatus");
            return (Criteria) this;
        }

        public Criteria andJoininMessageIsNull() {
            addCriterion("joinin_message is null");
            return (Criteria) this;
        }

        public Criteria andJoininMessageIsNotNull() {
            addCriterion("joinin_message is not null");
            return (Criteria) this;
        }

        public Criteria andJoininMessageEqualTo(String value) {
            addCriterion("joinin_message =", value, "joininMessage");
            return (Criteria) this;
        }

        public Criteria andJoininMessageNotEqualTo(String value) {
            addCriterion("joinin_message <>", value, "joininMessage");
            return (Criteria) this;
        }

        public Criteria andJoininMessageGreaterThan(String value) {
            addCriterion("joinin_message >", value, "joininMessage");
            return (Criteria) this;
        }

        public Criteria andJoininMessageGreaterThanOrEqualTo(String value) {
            addCriterion("joinin_message >=", value, "joininMessage");
            return (Criteria) this;
        }

        public Criteria andJoininMessageLessThan(String value) {
            addCriterion("joinin_message <", value, "joininMessage");
            return (Criteria) this;
        }

        public Criteria andJoininMessageLessThanOrEqualTo(String value) {
            addCriterion("joinin_message <=", value, "joininMessage");
            return (Criteria) this;
        }

        public Criteria andJoininMessageLike(String value) {
            addCriterion("joinin_message like", value, "joininMessage");
            return (Criteria) this;
        }

        public Criteria andJoininMessageNotLike(String value) {
            addCriterion("joinin_message not like", value, "joininMessage");
            return (Criteria) this;
        }

        public Criteria andJoininMessageIn(List<String> values) {
            addCriterion("joinin_message in", values, "joininMessage");
            return (Criteria) this;
        }

        public Criteria andJoininMessageNotIn(List<String> values) {
            addCriterion("joinin_message not in", values, "joininMessage");
            return (Criteria) this;
        }

        public Criteria andJoininMessageBetween(String value1, String value2) {
            addCriterion("joinin_message between", value1, value2, "joininMessage");
            return (Criteria) this;
        }

        public Criteria andJoininMessageNotBetween(String value1, String value2) {
            addCriterion("joinin_message not between", value1, value2, "joininMessage");
            return (Criteria) this;
        }

        public Criteria andJoininYearIsNull() {
            addCriterion("joinin_year is null");
            return (Criteria) this;
        }

        public Criteria andJoininYearIsNotNull() {
            addCriterion("joinin_year is not null");
            return (Criteria) this;
        }

        public Criteria andJoininYearEqualTo(Byte value) {
            addCriterion("joinin_year =", value, "joininYear");
            return (Criteria) this;
        }

        public Criteria andJoininYearNotEqualTo(Byte value) {
            addCriterion("joinin_year <>", value, "joininYear");
            return (Criteria) this;
        }

        public Criteria andJoininYearGreaterThan(Byte value) {
            addCriterion("joinin_year >", value, "joininYear");
            return (Criteria) this;
        }

        public Criteria andJoininYearGreaterThanOrEqualTo(Byte value) {
            addCriterion("joinin_year >=", value, "joininYear");
            return (Criteria) this;
        }

        public Criteria andJoininYearLessThan(Byte value) {
            addCriterion("joinin_year <", value, "joininYear");
            return (Criteria) this;
        }

        public Criteria andJoininYearLessThanOrEqualTo(Byte value) {
            addCriterion("joinin_year <=", value, "joininYear");
            return (Criteria) this;
        }

        public Criteria andJoininYearIn(List<Byte> values) {
            addCriterion("joinin_year in", values, "joininYear");
            return (Criteria) this;
        }

        public Criteria andJoininYearNotIn(List<Byte> values) {
            addCriterion("joinin_year not in", values, "joininYear");
            return (Criteria) this;
        }

        public Criteria andJoininYearBetween(Byte value1, Byte value2) {
            addCriterion("joinin_year between", value1, value2, "joininYear");
            return (Criteria) this;
        }

        public Criteria andJoininYearNotBetween(Byte value1, Byte value2) {
            addCriterion("joinin_year not between", value1, value2, "joininYear");
            return (Criteria) this;
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

        public Criteria andGradeInfoIsNull() {
            addCriterion("grade_info is null");
            return (Criteria) this;
        }

        public Criteria andGradeInfoIsNotNull() {
            addCriterion("grade_info is not null");
            return (Criteria) this;
        }

        public Criteria andGradeInfoEqualTo(String value) {
            addCriterion("grade_info =", value, "gradeInfo");
            return (Criteria) this;
        }

        public Criteria andGradeInfoNotEqualTo(String value) {
            addCriterion("grade_info <>", value, "gradeInfo");
            return (Criteria) this;
        }

        public Criteria andGradeInfoGreaterThan(String value) {
            addCriterion("grade_info >", value, "gradeInfo");
            return (Criteria) this;
        }

        public Criteria andGradeInfoGreaterThanOrEqualTo(String value) {
            addCriterion("grade_info >=", value, "gradeInfo");
            return (Criteria) this;
        }

        public Criteria andGradeInfoLessThan(String value) {
            addCriterion("grade_info <", value, "gradeInfo");
            return (Criteria) this;
        }

        public Criteria andGradeInfoLessThanOrEqualTo(String value) {
            addCriterion("grade_info <=", value, "gradeInfo");
            return (Criteria) this;
        }

        public Criteria andGradeInfoLike(String value) {
            addCriterion("grade_info like", value, "gradeInfo");
            return (Criteria) this;
        }

        public Criteria andGradeInfoNotLike(String value) {
            addCriterion("grade_info not like", value, "gradeInfo");
            return (Criteria) this;
        }

        public Criteria andGradeInfoIn(List<String> values) {
            addCriterion("grade_info in", values, "gradeInfo");
            return (Criteria) this;
        }

        public Criteria andGradeInfoNotIn(List<String> values) {
            addCriterion("grade_info not in", values, "gradeInfo");
            return (Criteria) this;
        }

        public Criteria andGradeInfoBetween(String value1, String value2) {
            addCriterion("grade_info between", value1, value2, "gradeInfo");
            return (Criteria) this;
        }

        public Criteria andGradeInfoNotBetween(String value1, String value2) {
            addCriterion("grade_info not between", value1, value2, "gradeInfo");
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

        public Criteria andStoreClassCommisRatesIsNull() {
            addCriterion("store_class_commis_rates is null");
            return (Criteria) this;
        }

        public Criteria andStoreClassCommisRatesIsNotNull() {
            addCriterion("store_class_commis_rates is not null");
            return (Criteria) this;
        }

        public Criteria andStoreClassCommisRatesEqualTo(String value) {
            addCriterion("store_class_commis_rates =", value, "storeClassCommisRates");
            return (Criteria) this;
        }

        public Criteria andStoreClassCommisRatesNotEqualTo(String value) {
            addCriterion("store_class_commis_rates <>", value, "storeClassCommisRates");
            return (Criteria) this;
        }

        public Criteria andStoreClassCommisRatesGreaterThan(String value) {
            addCriterion("store_class_commis_rates >", value, "storeClassCommisRates");
            return (Criteria) this;
        }

        public Criteria andStoreClassCommisRatesGreaterThanOrEqualTo(String value) {
            addCriterion("store_class_commis_rates >=", value, "storeClassCommisRates");
            return (Criteria) this;
        }

        public Criteria andStoreClassCommisRatesLessThan(String value) {
            addCriterion("store_class_commis_rates <", value, "storeClassCommisRates");
            return (Criteria) this;
        }

        public Criteria andStoreClassCommisRatesLessThanOrEqualTo(String value) {
            addCriterion("store_class_commis_rates <=", value, "storeClassCommisRates");
            return (Criteria) this;
        }

        public Criteria andStoreClassCommisRatesLike(String value) {
            addCriterion("store_class_commis_rates like", value, "storeClassCommisRates");
            return (Criteria) this;
        }

        public Criteria andStoreClassCommisRatesNotLike(String value) {
            addCriterion("store_class_commis_rates not like", value, "storeClassCommisRates");
            return (Criteria) this;
        }

        public Criteria andStoreClassCommisRatesIn(List<String> values) {
            addCriterion("store_class_commis_rates in", values, "storeClassCommisRates");
            return (Criteria) this;
        }

        public Criteria andStoreClassCommisRatesNotIn(List<String> values) {
            addCriterion("store_class_commis_rates not in", values, "storeClassCommisRates");
            return (Criteria) this;
        }

        public Criteria andStoreClassCommisRatesBetween(String value1, String value2) {
            addCriterion("store_class_commis_rates between", value1, value2, "storeClassCommisRates");
            return (Criteria) this;
        }

        public Criteria andStoreClassCommisRatesNotBetween(String value1, String value2) {
            addCriterion("store_class_commis_rates not between", value1, value2, "storeClassCommisRates");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertificateIsNull() {
            addCriterion("paying_money_certificate is null");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertificateIsNotNull() {
            addCriterion("paying_money_certificate is not null");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertificateEqualTo(String value) {
            addCriterion("paying_money_certificate =", value, "payingMoneyCertificate");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertificateNotEqualTo(String value) {
            addCriterion("paying_money_certificate <>", value, "payingMoneyCertificate");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertificateGreaterThan(String value) {
            addCriterion("paying_money_certificate >", value, "payingMoneyCertificate");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertificateGreaterThanOrEqualTo(String value) {
            addCriterion("paying_money_certificate >=", value, "payingMoneyCertificate");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertificateLessThan(String value) {
            addCriterion("paying_money_certificate <", value, "payingMoneyCertificate");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertificateLessThanOrEqualTo(String value) {
            addCriterion("paying_money_certificate <=", value, "payingMoneyCertificate");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertificateLike(String value) {
            addCriterion("paying_money_certificate like", value, "payingMoneyCertificate");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertificateNotLike(String value) {
            addCriterion("paying_money_certificate not like", value, "payingMoneyCertificate");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertificateIn(List<String> values) {
            addCriterion("paying_money_certificate in", values, "payingMoneyCertificate");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertificateNotIn(List<String> values) {
            addCriterion("paying_money_certificate not in", values, "payingMoneyCertificate");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertificateBetween(String value1, String value2) {
            addCriterion("paying_money_certificate between", value1, value2, "payingMoneyCertificate");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertificateNotBetween(String value1, String value2) {
            addCriterion("paying_money_certificate not between", value1, value2, "payingMoneyCertificate");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertifExpIsNull() {
            addCriterion("paying_money_certif_exp is null");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertifExpIsNotNull() {
            addCriterion("paying_money_certif_exp is not null");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertifExpEqualTo(String value) {
            addCriterion("paying_money_certif_exp =", value, "payingMoneyCertifExp");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertifExpNotEqualTo(String value) {
            addCriterion("paying_money_certif_exp <>", value, "payingMoneyCertifExp");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertifExpGreaterThan(String value) {
            addCriterion("paying_money_certif_exp >", value, "payingMoneyCertifExp");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertifExpGreaterThanOrEqualTo(String value) {
            addCriterion("paying_money_certif_exp >=", value, "payingMoneyCertifExp");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertifExpLessThan(String value) {
            addCriterion("paying_money_certif_exp <", value, "payingMoneyCertifExp");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertifExpLessThanOrEqualTo(String value) {
            addCriterion("paying_money_certif_exp <=", value, "payingMoneyCertifExp");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertifExpLike(String value) {
            addCriterion("paying_money_certif_exp like", value, "payingMoneyCertifExp");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertifExpNotLike(String value) {
            addCriterion("paying_money_certif_exp not like", value, "payingMoneyCertifExp");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertifExpIn(List<String> values) {
            addCriterion("paying_money_certif_exp in", values, "payingMoneyCertifExp");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertifExpNotIn(List<String> values) {
            addCriterion("paying_money_certif_exp not in", values, "payingMoneyCertifExp");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertifExpBetween(String value1, String value2) {
            addCriterion("paying_money_certif_exp between", value1, value2, "payingMoneyCertifExp");
            return (Criteria) this;
        }

        public Criteria andPayingMoneyCertifExpNotBetween(String value1, String value2) {
            addCriterion("paying_money_certif_exp not between", value1, value2, "payingMoneyCertifExp");
            return (Criteria) this;
        }

        public Criteria andPayingAmountIsNull() {
            addCriterion("paying_amount is null");
            return (Criteria) this;
        }

        public Criteria andPayingAmountIsNotNull() {
            addCriterion("paying_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPayingAmountEqualTo(BigDecimal value) {
            addCriterion("paying_amount =", value, "payingAmount");
            return (Criteria) this;
        }

        public Criteria andPayingAmountNotEqualTo(BigDecimal value) {
            addCriterion("paying_amount <>", value, "payingAmount");
            return (Criteria) this;
        }

        public Criteria andPayingAmountGreaterThan(BigDecimal value) {
            addCriterion("paying_amount >", value, "payingAmount");
            return (Criteria) this;
        }

        public Criteria andPayingAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("paying_amount >=", value, "payingAmount");
            return (Criteria) this;
        }

        public Criteria andPayingAmountLessThan(BigDecimal value) {
            addCriterion("paying_amount <", value, "payingAmount");
            return (Criteria) this;
        }

        public Criteria andPayingAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("paying_amount <=", value, "payingAmount");
            return (Criteria) this;
        }

        public Criteria andPayingAmountIn(List<BigDecimal> values) {
            addCriterion("paying_amount in", values, "payingAmount");
            return (Criteria) this;
        }

        public Criteria andPayingAmountNotIn(List<BigDecimal> values) {
            addCriterion("paying_amount not in", values, "payingAmount");
            return (Criteria) this;
        }

        public Criteria andPayingAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("paying_amount between", value1, value2, "payingAmount");
            return (Criteria) this;
        }

        public Criteria andPayingAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("paying_amount not between", value1, value2, "payingAmount");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontIsNull() {
            addCriterion("id_card_front is null");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontIsNotNull() {
            addCriterion("id_card_front is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontEqualTo(String value) {
            addCriterion("id_card_front =", value, "idCardFront");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontNotEqualTo(String value) {
            addCriterion("id_card_front <>", value, "idCardFront");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontGreaterThan(String value) {
            addCriterion("id_card_front >", value, "idCardFront");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontGreaterThanOrEqualTo(String value) {
            addCriterion("id_card_front >=", value, "idCardFront");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontLessThan(String value) {
            addCriterion("id_card_front <", value, "idCardFront");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontLessThanOrEqualTo(String value) {
            addCriterion("id_card_front <=", value, "idCardFront");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontLike(String value) {
            addCriterion("id_card_front like", value, "idCardFront");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontNotLike(String value) {
            addCriterion("id_card_front not like", value, "idCardFront");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontIn(List<String> values) {
            addCriterion("id_card_front in", values, "idCardFront");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontNotIn(List<String> values) {
            addCriterion("id_card_front not in", values, "idCardFront");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontBetween(String value1, String value2) {
            addCriterion("id_card_front between", value1, value2, "idCardFront");
            return (Criteria) this;
        }

        public Criteria andIdCardFrontNotBetween(String value1, String value2) {
            addCriterion("id_card_front not between", value1, value2, "idCardFront");
            return (Criteria) this;
        }

        public Criteria andIdCardVersoIsNull() {
            addCriterion("id_card_verso is null");
            return (Criteria) this;
        }

        public Criteria andIdCardVersoIsNotNull() {
            addCriterion("id_card_verso is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardVersoEqualTo(String value) {
            addCriterion("id_card_verso =", value, "idCardVerso");
            return (Criteria) this;
        }

        public Criteria andIdCardVersoNotEqualTo(String value) {
            addCriterion("id_card_verso <>", value, "idCardVerso");
            return (Criteria) this;
        }

        public Criteria andIdCardVersoGreaterThan(String value) {
            addCriterion("id_card_verso >", value, "idCardVerso");
            return (Criteria) this;
        }

        public Criteria andIdCardVersoGreaterThanOrEqualTo(String value) {
            addCriterion("id_card_verso >=", value, "idCardVerso");
            return (Criteria) this;
        }

        public Criteria andIdCardVersoLessThan(String value) {
            addCriterion("id_card_verso <", value, "idCardVerso");
            return (Criteria) this;
        }

        public Criteria andIdCardVersoLessThanOrEqualTo(String value) {
            addCriterion("id_card_verso <=", value, "idCardVerso");
            return (Criteria) this;
        }

        public Criteria andIdCardVersoLike(String value) {
            addCriterion("id_card_verso like", value, "idCardVerso");
            return (Criteria) this;
        }

        public Criteria andIdCardVersoNotLike(String value) {
            addCriterion("id_card_verso not like", value, "idCardVerso");
            return (Criteria) this;
        }

        public Criteria andIdCardVersoIn(List<String> values) {
            addCriterion("id_card_verso in", values, "idCardVerso");
            return (Criteria) this;
        }

        public Criteria andIdCardVersoNotIn(List<String> values) {
            addCriterion("id_card_verso not in", values, "idCardVerso");
            return (Criteria) this;
        }

        public Criteria andIdCardVersoBetween(String value1, String value2) {
            addCriterion("id_card_verso between", value1, value2, "idCardVerso");
            return (Criteria) this;
        }

        public Criteria andIdCardVersoNotBetween(String value1, String value2) {
            addCriterion("id_card_verso not between", value1, value2, "idCardVerso");
            return (Criteria) this;
        }

        public Criteria andImpowerBookIsNull() {
            addCriterion("impower_book is null");
            return (Criteria) this;
        }

        public Criteria andImpowerBookIsNotNull() {
            addCriterion("impower_book is not null");
            return (Criteria) this;
        }

        public Criteria andImpowerBookEqualTo(String value) {
            addCriterion("impower_book =", value, "impowerBook");
            return (Criteria) this;
        }

        public Criteria andImpowerBookNotEqualTo(String value) {
            addCriterion("impower_book <>", value, "impowerBook");
            return (Criteria) this;
        }

        public Criteria andImpowerBookGreaterThan(String value) {
            addCriterion("impower_book >", value, "impowerBook");
            return (Criteria) this;
        }

        public Criteria andImpowerBookGreaterThanOrEqualTo(String value) {
            addCriterion("impower_book >=", value, "impowerBook");
            return (Criteria) this;
        }

        public Criteria andImpowerBookLessThan(String value) {
            addCriterion("impower_book <", value, "impowerBook");
            return (Criteria) this;
        }

        public Criteria andImpowerBookLessThanOrEqualTo(String value) {
            addCriterion("impower_book <=", value, "impowerBook");
            return (Criteria) this;
        }

        public Criteria andImpowerBookLike(String value) {
            addCriterion("impower_book like", value, "impowerBook");
            return (Criteria) this;
        }

        public Criteria andImpowerBookNotLike(String value) {
            addCriterion("impower_book not like", value, "impowerBook");
            return (Criteria) this;
        }

        public Criteria andImpowerBookIn(List<String> values) {
            addCriterion("impower_book in", values, "impowerBook");
            return (Criteria) this;
        }

        public Criteria andImpowerBookNotIn(List<String> values) {
            addCriterion("impower_book not in", values, "impowerBook");
            return (Criteria) this;
        }

        public Criteria andImpowerBookBetween(String value1, String value2) {
            addCriterion("impower_book between", value1, value2, "impowerBook");
            return (Criteria) this;
        }

        public Criteria andImpowerBookNotBetween(String value1, String value2) {
            addCriterion("impower_book not between", value1, value2, "impowerBook");
            return (Criteria) this;
        }

        public Criteria andCollectionProveIsNull() {
            addCriterion("collection_prove is null");
            return (Criteria) this;
        }

        public Criteria andCollectionProveIsNotNull() {
            addCriterion("collection_prove is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionProveEqualTo(String value) {
            addCriterion("collection_prove =", value, "collectionProve");
            return (Criteria) this;
        }

        public Criteria andCollectionProveNotEqualTo(String value) {
            addCriterion("collection_prove <>", value, "collectionProve");
            return (Criteria) this;
        }

        public Criteria andCollectionProveGreaterThan(String value) {
            addCriterion("collection_prove >", value, "collectionProve");
            return (Criteria) this;
        }

        public Criteria andCollectionProveGreaterThanOrEqualTo(String value) {
            addCriterion("collection_prove >=", value, "collectionProve");
            return (Criteria) this;
        }

        public Criteria andCollectionProveLessThan(String value) {
            addCriterion("collection_prove <", value, "collectionProve");
            return (Criteria) this;
        }

        public Criteria andCollectionProveLessThanOrEqualTo(String value) {
            addCriterion("collection_prove <=", value, "collectionProve");
            return (Criteria) this;
        }

        public Criteria andCollectionProveLike(String value) {
            addCriterion("collection_prove like", value, "collectionProve");
            return (Criteria) this;
        }

        public Criteria andCollectionProveNotLike(String value) {
            addCriterion("collection_prove not like", value, "collectionProve");
            return (Criteria) this;
        }

        public Criteria andCollectionProveIn(List<String> values) {
            addCriterion("collection_prove in", values, "collectionProve");
            return (Criteria) this;
        }

        public Criteria andCollectionProveNotIn(List<String> values) {
            addCriterion("collection_prove not in", values, "collectionProve");
            return (Criteria) this;
        }

        public Criteria andCollectionProveBetween(String value1, String value2) {
            addCriterion("collection_prove between", value1, value2, "collectionProve");
            return (Criteria) this;
        }

        public Criteria andCollectionProveNotBetween(String value1, String value2) {
            addCriterion("collection_prove not between", value1, value2, "collectionProve");
            return (Criteria) this;
        }

        public Criteria andStoreContractIdIsNull() {
            addCriterion("store_contract_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreContractIdIsNotNull() {
            addCriterion("store_contract_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreContractIdEqualTo(String value) {
            addCriterion("store_contract_id =", value, "storeContractId");
            return (Criteria) this;
        }

        public Criteria andStoreContractIdNotEqualTo(String value) {
            addCriterion("store_contract_id <>", value, "storeContractId");
            return (Criteria) this;
        }

        public Criteria andStoreContractIdGreaterThan(String value) {
            addCriterion("store_contract_id >", value, "storeContractId");
            return (Criteria) this;
        }

        public Criteria andStoreContractIdGreaterThanOrEqualTo(String value) {
            addCriterion("store_contract_id >=", value, "storeContractId");
            return (Criteria) this;
        }

        public Criteria andStoreContractIdLessThan(String value) {
            addCriterion("store_contract_id <", value, "storeContractId");
            return (Criteria) this;
        }

        public Criteria andStoreContractIdLessThanOrEqualTo(String value) {
            addCriterion("store_contract_id <=", value, "storeContractId");
            return (Criteria) this;
        }

        public Criteria andStoreContractIdLike(String value) {
            addCriterion("store_contract_id like", value, "storeContractId");
            return (Criteria) this;
        }

        public Criteria andStoreContractIdNotLike(String value) {
            addCriterion("store_contract_id not like", value, "storeContractId");
            return (Criteria) this;
        }

        public Criteria andStoreContractIdIn(List<String> values) {
            addCriterion("store_contract_id in", values, "storeContractId");
            return (Criteria) this;
        }

        public Criteria andStoreContractIdNotIn(List<String> values) {
            addCriterion("store_contract_id not in", values, "storeContractId");
            return (Criteria) this;
        }

        public Criteria andStoreContractIdBetween(String value1, String value2) {
            addCriterion("store_contract_id between", value1, value2, "storeContractId");
            return (Criteria) this;
        }

        public Criteria andStoreContractIdNotBetween(String value1, String value2) {
            addCriterion("store_contract_id not between", value1, value2, "storeContractId");
            return (Criteria) this;
        }

        public Criteria andStoreContractFileIsNull() {
            addCriterion("store_contract_file is null");
            return (Criteria) this;
        }

        public Criteria andStoreContractFileIsNotNull() {
            addCriterion("store_contract_file is not null");
            return (Criteria) this;
        }

        public Criteria andStoreContractFileEqualTo(String value) {
            addCriterion("store_contract_file =", value, "storeContractFile");
            return (Criteria) this;
        }

        public Criteria andStoreContractFileNotEqualTo(String value) {
            addCriterion("store_contract_file <>", value, "storeContractFile");
            return (Criteria) this;
        }

        public Criteria andStoreContractFileGreaterThan(String value) {
            addCriterion("store_contract_file >", value, "storeContractFile");
            return (Criteria) this;
        }

        public Criteria andStoreContractFileGreaterThanOrEqualTo(String value) {
            addCriterion("store_contract_file >=", value, "storeContractFile");
            return (Criteria) this;
        }

        public Criteria andStoreContractFileLessThan(String value) {
            addCriterion("store_contract_file <", value, "storeContractFile");
            return (Criteria) this;
        }

        public Criteria andStoreContractFileLessThanOrEqualTo(String value) {
            addCriterion("store_contract_file <=", value, "storeContractFile");
            return (Criteria) this;
        }

        public Criteria andStoreContractFileLike(String value) {
            addCriterion("store_contract_file like", value, "storeContractFile");
            return (Criteria) this;
        }

        public Criteria andStoreContractFileNotLike(String value) {
            addCriterion("store_contract_file not like", value, "storeContractFile");
            return (Criteria) this;
        }

        public Criteria andStoreContractFileIn(List<String> values) {
            addCriterion("store_contract_file in", values, "storeContractFile");
            return (Criteria) this;
        }

        public Criteria andStoreContractFileNotIn(List<String> values) {
            addCriterion("store_contract_file not in", values, "storeContractFile");
            return (Criteria) this;
        }

        public Criteria andStoreContractFileBetween(String value1, String value2) {
            addCriterion("store_contract_file between", value1, value2, "storeContractFile");
            return (Criteria) this;
        }

        public Criteria andStoreContractFileNotBetween(String value1, String value2) {
            addCriterion("store_contract_file not between", value1, value2, "storeContractFile");
            return (Criteria) this;
        }

        public Criteria andBrandImageIsNull() {
            addCriterion("brand_image is null");
            return (Criteria) this;
        }

        public Criteria andBrandImageIsNotNull() {
            addCriterion("brand_image is not null");
            return (Criteria) this;
        }

        public Criteria andBrandImageEqualTo(String value) {
            addCriterion("brand_image =", value, "brandImage");
            return (Criteria) this;
        }

        public Criteria andBrandImageNotEqualTo(String value) {
            addCriterion("brand_image <>", value, "brandImage");
            return (Criteria) this;
        }

        public Criteria andBrandImageGreaterThan(String value) {
            addCriterion("brand_image >", value, "brandImage");
            return (Criteria) this;
        }

        public Criteria andBrandImageGreaterThanOrEqualTo(String value) {
            addCriterion("brand_image >=", value, "brandImage");
            return (Criteria) this;
        }

        public Criteria andBrandImageLessThan(String value) {
            addCriterion("brand_image <", value, "brandImage");
            return (Criteria) this;
        }

        public Criteria andBrandImageLessThanOrEqualTo(String value) {
            addCriterion("brand_image <=", value, "brandImage");
            return (Criteria) this;
        }

        public Criteria andBrandImageLike(String value) {
            addCriterion("brand_image like", value, "brandImage");
            return (Criteria) this;
        }

        public Criteria andBrandImageNotLike(String value) {
            addCriterion("brand_image not like", value, "brandImage");
            return (Criteria) this;
        }

        public Criteria andBrandImageIn(List<String> values) {
            addCriterion("brand_image in", values, "brandImage");
            return (Criteria) this;
        }

        public Criteria andBrandImageNotIn(List<String> values) {
            addCriterion("brand_image not in", values, "brandImage");
            return (Criteria) this;
        }

        public Criteria andBrandImageBetween(String value1, String value2) {
            addCriterion("brand_image between", value1, value2, "brandImage");
            return (Criteria) this;
        }

        public Criteria andBrandImageNotBetween(String value1, String value2) {
            addCriterion("brand_image not between", value1, value2, "brandImage");
            return (Criteria) this;
        }

        public Criteria andTrademarksImpowerBookIsNull() {
            addCriterion("trademarks_impower_book is null");
            return (Criteria) this;
        }

        public Criteria andTrademarksImpowerBookIsNotNull() {
            addCriterion("trademarks_impower_book is not null");
            return (Criteria) this;
        }

        public Criteria andTrademarksImpowerBookEqualTo(String value) {
            addCriterion("trademarks_impower_book =", value, "trademarksImpowerBook");
            return (Criteria) this;
        }

        public Criteria andTrademarksImpowerBookNotEqualTo(String value) {
            addCriterion("trademarks_impower_book <>", value, "trademarksImpowerBook");
            return (Criteria) this;
        }

        public Criteria andTrademarksImpowerBookGreaterThan(String value) {
            addCriterion("trademarks_impower_book >", value, "trademarksImpowerBook");
            return (Criteria) this;
        }

        public Criteria andTrademarksImpowerBookGreaterThanOrEqualTo(String value) {
            addCriterion("trademarks_impower_book >=", value, "trademarksImpowerBook");
            return (Criteria) this;
        }

        public Criteria andTrademarksImpowerBookLessThan(String value) {
            addCriterion("trademarks_impower_book <", value, "trademarksImpowerBook");
            return (Criteria) this;
        }

        public Criteria andTrademarksImpowerBookLessThanOrEqualTo(String value) {
            addCriterion("trademarks_impower_book <=", value, "trademarksImpowerBook");
            return (Criteria) this;
        }

        public Criteria andTrademarksImpowerBookLike(String value) {
            addCriterion("trademarks_impower_book like", value, "trademarksImpowerBook");
            return (Criteria) this;
        }

        public Criteria andTrademarksImpowerBookNotLike(String value) {
            addCriterion("trademarks_impower_book not like", value, "trademarksImpowerBook");
            return (Criteria) this;
        }

        public Criteria andTrademarksImpowerBookIn(List<String> values) {
            addCriterion("trademarks_impower_book in", values, "trademarksImpowerBook");
            return (Criteria) this;
        }

        public Criteria andTrademarksImpowerBookNotIn(List<String> values) {
            addCriterion("trademarks_impower_book not in", values, "trademarksImpowerBook");
            return (Criteria) this;
        }

        public Criteria andTrademarksImpowerBookBetween(String value1, String value2) {
            addCriterion("trademarks_impower_book between", value1, value2, "trademarksImpowerBook");
            return (Criteria) this;
        }

        public Criteria andTrademarksImpowerBookNotBetween(String value1, String value2) {
            addCriterion("trademarks_impower_book not between", value1, value2, "trademarksImpowerBook");
            return (Criteria) this;
        }

        public Criteria andQualityControlReportIsNull() {
            addCriterion("quality_control_report is null");
            return (Criteria) this;
        }

        public Criteria andQualityControlReportIsNotNull() {
            addCriterion("quality_control_report is not null");
            return (Criteria) this;
        }

        public Criteria andQualityControlReportEqualTo(String value) {
            addCriterion("quality_control_report =", value, "qualityControlReport");
            return (Criteria) this;
        }

        public Criteria andQualityControlReportNotEqualTo(String value) {
            addCriterion("quality_control_report <>", value, "qualityControlReport");
            return (Criteria) this;
        }

        public Criteria andQualityControlReportGreaterThan(String value) {
            addCriterion("quality_control_report >", value, "qualityControlReport");
            return (Criteria) this;
        }

        public Criteria andQualityControlReportGreaterThanOrEqualTo(String value) {
            addCriterion("quality_control_report >=", value, "qualityControlReport");
            return (Criteria) this;
        }

        public Criteria andQualityControlReportLessThan(String value) {
            addCriterion("quality_control_report <", value, "qualityControlReport");
            return (Criteria) this;
        }

        public Criteria andQualityControlReportLessThanOrEqualTo(String value) {
            addCriterion("quality_control_report <=", value, "qualityControlReport");
            return (Criteria) this;
        }

        public Criteria andQualityControlReportLike(String value) {
            addCriterion("quality_control_report like", value, "qualityControlReport");
            return (Criteria) this;
        }

        public Criteria andQualityControlReportNotLike(String value) {
            addCriterion("quality_control_report not like", value, "qualityControlReport");
            return (Criteria) this;
        }

        public Criteria andQualityControlReportIn(List<String> values) {
            addCriterion("quality_control_report in", values, "qualityControlReport");
            return (Criteria) this;
        }

        public Criteria andQualityControlReportNotIn(List<String> values) {
            addCriterion("quality_control_report not in", values, "qualityControlReport");
            return (Criteria) this;
        }

        public Criteria andQualityControlReportBetween(String value1, String value2) {
            addCriterion("quality_control_report between", value1, value2, "qualityControlReport");
            return (Criteria) this;
        }

        public Criteria andQualityControlReportNotBetween(String value1, String value2) {
            addCriterion("quality_control_report not between", value1, value2, "qualityControlReport");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 店铺入驻表
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