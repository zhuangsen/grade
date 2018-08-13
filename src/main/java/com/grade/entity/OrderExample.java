package com.grade.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTask_idIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTask_idIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTask_idEqualTo(Integer value) {
            addCriterion("task_id =", value, "task_id");
            return (Criteria) this;
        }

        public Criteria andTask_idNotEqualTo(Integer value) {
            addCriterion("task_id <>", value, "task_id");
            return (Criteria) this;
        }

        public Criteria andTask_idGreaterThan(Integer value) {
            addCriterion("task_id >", value, "task_id");
            return (Criteria) this;
        }

        public Criteria andTask_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_id >=", value, "task_id");
            return (Criteria) this;
        }

        public Criteria andTask_idLessThan(Integer value) {
            addCriterion("task_id <", value, "task_id");
            return (Criteria) this;
        }

        public Criteria andTask_idLessThanOrEqualTo(Integer value) {
            addCriterion("task_id <=", value, "task_id");
            return (Criteria) this;
        }

        public Criteria andTask_idIn(List<Integer> values) {
            addCriterion("task_id in", values, "task_id");
            return (Criteria) this;
        }

        public Criteria andTask_idNotIn(List<Integer> values) {
            addCriterion("task_id not in", values, "task_id");
            return (Criteria) this;
        }

        public Criteria andTask_idBetween(Integer value1, Integer value2) {
            addCriterion("task_id between", value1, value2, "task_id");
            return (Criteria) this;
        }

        public Criteria andTask_idNotBetween(Integer value1, Integer value2) {
            addCriterion("task_id not between", value1, value2, "task_id");
            return (Criteria) this;
        }

        public Criteria andTask_nameIsNull() {
            addCriterion("task_name is null");
            return (Criteria) this;
        }

        public Criteria andTask_nameIsNotNull() {
            addCriterion("task_name is not null");
            return (Criteria) this;
        }

        public Criteria andTask_nameEqualTo(String value) {
            addCriterion("task_name =", value, "task_name");
            return (Criteria) this;
        }

        public Criteria andTask_nameNotEqualTo(String value) {
            addCriterion("task_name <>", value, "task_name");
            return (Criteria) this;
        }

        public Criteria andTask_nameGreaterThan(String value) {
            addCriterion("task_name >", value, "task_name");
            return (Criteria) this;
        }

        public Criteria andTask_nameGreaterThanOrEqualTo(String value) {
            addCriterion("task_name >=", value, "task_name");
            return (Criteria) this;
        }

        public Criteria andTask_nameLessThan(String value) {
            addCriterion("task_name <", value, "task_name");
            return (Criteria) this;
        }

        public Criteria andTask_nameLessThanOrEqualTo(String value) {
            addCriterion("task_name <=", value, "task_name");
            return (Criteria) this;
        }

        public Criteria andTask_nameLike(String value) {
            addCriterion("task_name like", value, "task_name");
            return (Criteria) this;
        }

        public Criteria andTask_nameNotLike(String value) {
            addCriterion("task_name not like", value, "task_name");
            return (Criteria) this;
        }

        public Criteria andTask_nameIn(List<String> values) {
            addCriterion("task_name in", values, "task_name");
            return (Criteria) this;
        }

        public Criteria andTask_nameNotIn(List<String> values) {
            addCriterion("task_name not in", values, "task_name");
            return (Criteria) this;
        }

        public Criteria andTask_nameBetween(String value1, String value2) {
            addCriterion("task_name between", value1, value2, "task_name");
            return (Criteria) this;
        }

        public Criteria andTask_nameNotBetween(String value1, String value2) {
            addCriterion("task_name not between", value1, value2, "task_name");
            return (Criteria) this;
        }

        public Criteria andOrder_idIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrder_idIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_idEqualTo(String value) {
            addCriterion("order_id =", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idNotEqualTo(String value) {
            addCriterion("order_id <>", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idGreaterThan(String value) {
            addCriterion("order_id >", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idLessThan(String value) {
            addCriterion("order_id <", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idLike(String value) {
            addCriterion("order_id like", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idNotLike(String value) {
            addCriterion("order_id not like", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idIn(List<String> values) {
            addCriterion("order_id in", values, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idNotIn(List<String> values) {
            addCriterion("order_id not in", values, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "order_id");
            return (Criteria) this;
        }

        public Criteria andPackage_nameIsNull() {
            addCriterion("package_name is null");
            return (Criteria) this;
        }

        public Criteria andPackage_nameIsNotNull() {
            addCriterion("package_name is not null");
            return (Criteria) this;
        }

        public Criteria andPackage_nameEqualTo(String value) {
            addCriterion("package_name =", value, "package_name");
            return (Criteria) this;
        }

        public Criteria andPackage_nameNotEqualTo(String value) {
            addCriterion("package_name <>", value, "package_name");
            return (Criteria) this;
        }

        public Criteria andPackage_nameGreaterThan(String value) {
            addCriterion("package_name >", value, "package_name");
            return (Criteria) this;
        }

        public Criteria andPackage_nameGreaterThanOrEqualTo(String value) {
            addCriterion("package_name >=", value, "package_name");
            return (Criteria) this;
        }

        public Criteria andPackage_nameLessThan(String value) {
            addCriterion("package_name <", value, "package_name");
            return (Criteria) this;
        }

        public Criteria andPackage_nameLessThanOrEqualTo(String value) {
            addCriterion("package_name <=", value, "package_name");
            return (Criteria) this;
        }

        public Criteria andPackage_nameLike(String value) {
            addCriterion("package_name like", value, "package_name");
            return (Criteria) this;
        }

        public Criteria andPackage_nameNotLike(String value) {
            addCriterion("package_name not like", value, "package_name");
            return (Criteria) this;
        }

        public Criteria andPackage_nameIn(List<String> values) {
            addCriterion("package_name in", values, "package_name");
            return (Criteria) this;
        }

        public Criteria andPackage_nameNotIn(List<String> values) {
            addCriterion("package_name not in", values, "package_name");
            return (Criteria) this;
        }

        public Criteria andPackage_nameBetween(String value1, String value2) {
            addCriterion("package_name between", value1, value2, "package_name");
            return (Criteria) this;
        }

        public Criteria andPackage_nameNotBetween(String value1, String value2) {
            addCriterion("package_name not between", value1, value2, "package_name");
            return (Criteria) this;
        }

        public Criteria andApp_codeIsNull() {
            addCriterion("app_code is null");
            return (Criteria) this;
        }

        public Criteria andApp_codeIsNotNull() {
            addCriterion("app_code is not null");
            return (Criteria) this;
        }

        public Criteria andApp_codeEqualTo(String value) {
            addCriterion("app_code =", value, "app_code");
            return (Criteria) this;
        }

        public Criteria andApp_codeNotEqualTo(String value) {
            addCriterion("app_code <>", value, "app_code");
            return (Criteria) this;
        }

        public Criteria andApp_codeGreaterThan(String value) {
            addCriterion("app_code >", value, "app_code");
            return (Criteria) this;
        }

        public Criteria andApp_codeGreaterThanOrEqualTo(String value) {
            addCriterion("app_code >=", value, "app_code");
            return (Criteria) this;
        }

        public Criteria andApp_codeLessThan(String value) {
            addCriterion("app_code <", value, "app_code");
            return (Criteria) this;
        }

        public Criteria andApp_codeLessThanOrEqualTo(String value) {
            addCriterion("app_code <=", value, "app_code");
            return (Criteria) this;
        }

        public Criteria andApp_codeLike(String value) {
            addCriterion("app_code like", value, "app_code");
            return (Criteria) this;
        }

        public Criteria andApp_codeNotLike(String value) {
            addCriterion("app_code not like", value, "app_code");
            return (Criteria) this;
        }

        public Criteria andApp_codeIn(List<String> values) {
            addCriterion("app_code in", values, "app_code");
            return (Criteria) this;
        }

        public Criteria andApp_codeNotIn(List<String> values) {
            addCriterion("app_code not in", values, "app_code");
            return (Criteria) this;
        }

        public Criteria andApp_codeBetween(String value1, String value2) {
            addCriterion("app_code between", value1, value2, "app_code");
            return (Criteria) this;
        }

        public Criteria andApp_codeNotBetween(String value1, String value2) {
            addCriterion("app_code not between", value1, value2, "app_code");
            return (Criteria) this;
        }

        public Criteria andAppsignIsNull() {
            addCriterion("appsign is null");
            return (Criteria) this;
        }

        public Criteria andAppsignIsNotNull() {
            addCriterion("appsign is not null");
            return (Criteria) this;
        }

        public Criteria andAppsignEqualTo(String value) {
            addCriterion("appsign =", value, "appsign");
            return (Criteria) this;
        }

        public Criteria andAppsignNotEqualTo(String value) {
            addCriterion("appsign <>", value, "appsign");
            return (Criteria) this;
        }

        public Criteria andAppsignGreaterThan(String value) {
            addCriterion("appsign >", value, "appsign");
            return (Criteria) this;
        }

        public Criteria andAppsignGreaterThanOrEqualTo(String value) {
            addCriterion("appsign >=", value, "appsign");
            return (Criteria) this;
        }

        public Criteria andAppsignLessThan(String value) {
            addCriterion("appsign <", value, "appsign");
            return (Criteria) this;
        }

        public Criteria andAppsignLessThanOrEqualTo(String value) {
            addCriterion("appsign <=", value, "appsign");
            return (Criteria) this;
        }

        public Criteria andAppsignLike(String value) {
            addCriterion("appsign like", value, "appsign");
            return (Criteria) this;
        }

        public Criteria andAppsignNotLike(String value) {
            addCriterion("appsign not like", value, "appsign");
            return (Criteria) this;
        }

        public Criteria andAppsignIn(List<String> values) {
            addCriterion("appsign in", values, "appsign");
            return (Criteria) this;
        }

        public Criteria andAppsignNotIn(List<String> values) {
            addCriterion("appsign not in", values, "appsign");
            return (Criteria) this;
        }

        public Criteria andAppsignBetween(String value1, String value2) {
            addCriterion("appsign between", value1, value2, "appsign");
            return (Criteria) this;
        }

        public Criteria andAppsignNotBetween(String value1, String value2) {
            addCriterion("appsign not between", value1, value2, "appsign");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(String value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(String value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(String value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(String value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(String value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(String value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLike(String value) {
            addCriterion("ctime like", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotLike(String value) {
            addCriterion("ctime not like", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<String> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<String> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(String value1, String value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(String value1, String value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andDeviceidIsNull() {
            addCriterion("deviceid is null");
            return (Criteria) this;
        }

        public Criteria andDeviceidIsNotNull() {
            addCriterion("deviceid is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceidEqualTo(String value) {
            addCriterion("deviceid =", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidNotEqualTo(String value) {
            addCriterion("deviceid <>", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidGreaterThan(String value) {
            addCriterion("deviceid >", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidGreaterThanOrEqualTo(String value) {
            addCriterion("deviceid >=", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidLessThan(String value) {
            addCriterion("deviceid <", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidLessThanOrEqualTo(String value) {
            addCriterion("deviceid <=", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidLike(String value) {
            addCriterion("deviceid like", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidNotLike(String value) {
            addCriterion("deviceid not like", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidIn(List<String> values) {
            addCriterion("deviceid in", values, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidNotIn(List<String> values) {
            addCriterion("deviceid not in", values, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidBetween(String value1, String value2) {
            addCriterion("deviceid between", value1, value2, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidNotBetween(String value1, String value2) {
            addCriterion("deviceid not between", value1, value2, "deviceid");
            return (Criteria) this;
        }

        public Criteria andEventIsNull() {
            addCriterion("event is null");
            return (Criteria) this;
        }

        public Criteria andEventIsNotNull() {
            addCriterion("event is not null");
            return (Criteria) this;
        }

        public Criteria andEventEqualTo(String value) {
            addCriterion("event =", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventNotEqualTo(String value) {
            addCriterion("event <>", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventGreaterThan(String value) {
            addCriterion("event >", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventGreaterThanOrEqualTo(String value) {
            addCriterion("event >=", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventLessThan(String value) {
            addCriterion("event <", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventLessThanOrEqualTo(String value) {
            addCriterion("event <=", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventLike(String value) {
            addCriterion("event like", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventNotLike(String value) {
            addCriterion("event not like", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventIn(List<String> values) {
            addCriterion("event in", values, "event");
            return (Criteria) this;
        }

        public Criteria andEventNotIn(List<String> values) {
            addCriterion("event not in", values, "event");
            return (Criteria) this;
        }

        public Criteria andEventBetween(String value1, String value2) {
            addCriterion("event between", value1, value2, "event");
            return (Criteria) this;
        }

        public Criteria andEventNotBetween(String value1, String value2) {
            addCriterion("event not between", value1, value2, "event");
            return (Criteria) this;
        }

        public Criteria andMeridIsNull() {
            addCriterion("merid is null");
            return (Criteria) this;
        }

        public Criteria andMeridIsNotNull() {
            addCriterion("merid is not null");
            return (Criteria) this;
        }

        public Criteria andMeridEqualTo(String value) {
            addCriterion("merid =", value, "merid");
            return (Criteria) this;
        }

        public Criteria andMeridNotEqualTo(String value) {
            addCriterion("merid <>", value, "merid");
            return (Criteria) this;
        }

        public Criteria andMeridGreaterThan(String value) {
            addCriterion("merid >", value, "merid");
            return (Criteria) this;
        }

        public Criteria andMeridGreaterThanOrEqualTo(String value) {
            addCriterion("merid >=", value, "merid");
            return (Criteria) this;
        }

        public Criteria andMeridLessThan(String value) {
            addCriterion("merid <", value, "merid");
            return (Criteria) this;
        }

        public Criteria andMeridLessThanOrEqualTo(String value) {
            addCriterion("merid <=", value, "merid");
            return (Criteria) this;
        }

        public Criteria andMeridLike(String value) {
            addCriterion("merid like", value, "merid");
            return (Criteria) this;
        }

        public Criteria andMeridNotLike(String value) {
            addCriterion("merid not like", value, "merid");
            return (Criteria) this;
        }

        public Criteria andMeridIn(List<String> values) {
            addCriterion("merid in", values, "merid");
            return (Criteria) this;
        }

        public Criteria andMeridNotIn(List<String> values) {
            addCriterion("merid not in", values, "merid");
            return (Criteria) this;
        }

        public Criteria andMeridBetween(String value1, String value2) {
            addCriterion("merid between", value1, value2, "merid");
            return (Criteria) this;
        }

        public Criteria andMeridNotBetween(String value1, String value2) {
            addCriterion("merid not between", value1, value2, "merid");
            return (Criteria) this;
        }

        public Criteria andMernameIsNull() {
            addCriterion("mername is null");
            return (Criteria) this;
        }

        public Criteria andMernameIsNotNull() {
            addCriterion("mername is not null");
            return (Criteria) this;
        }

        public Criteria andMernameEqualTo(String value) {
            addCriterion("mername =", value, "mername");
            return (Criteria) this;
        }

        public Criteria andMernameNotEqualTo(String value) {
            addCriterion("mername <>", value, "mername");
            return (Criteria) this;
        }

        public Criteria andMernameGreaterThan(String value) {
            addCriterion("mername >", value, "mername");
            return (Criteria) this;
        }

        public Criteria andMernameGreaterThanOrEqualTo(String value) {
            addCriterion("mername >=", value, "mername");
            return (Criteria) this;
        }

        public Criteria andMernameLessThan(String value) {
            addCriterion("mername <", value, "mername");
            return (Criteria) this;
        }

        public Criteria andMernameLessThanOrEqualTo(String value) {
            addCriterion("mername <=", value, "mername");
            return (Criteria) this;
        }

        public Criteria andMernameLike(String value) {
            addCriterion("mername like", value, "mername");
            return (Criteria) this;
        }

        public Criteria andMernameNotLike(String value) {
            addCriterion("mername not like", value, "mername");
            return (Criteria) this;
        }

        public Criteria andMernameIn(List<String> values) {
            addCriterion("mername in", values, "mername");
            return (Criteria) this;
        }

        public Criteria andMernameNotIn(List<String> values) {
            addCriterion("mername not in", values, "mername");
            return (Criteria) this;
        }

        public Criteria andMernameBetween(String value1, String value2) {
            addCriterion("mername between", value1, value2, "mername");
            return (Criteria) this;
        }

        public Criteria andMernameNotBetween(String value1, String value2) {
            addCriterion("mername not between", value1, value2, "mername");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(BigDecimal value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(BigDecimal value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(BigDecimal value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(BigDecimal value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<BigDecimal> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<BigDecimal> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andSignIsNull() {
            addCriterion("sign is null");
            return (Criteria) this;
        }

        public Criteria andSignIsNotNull() {
            addCriterion("sign is not null");
            return (Criteria) this;
        }

        public Criteria andSignEqualTo(String value) {
            addCriterion("sign =", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotEqualTo(String value) {
            addCriterion("sign <>", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignGreaterThan(String value) {
            addCriterion("sign >", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignGreaterThanOrEqualTo(String value) {
            addCriterion("sign >=", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLessThan(String value) {
            addCriterion("sign <", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLessThanOrEqualTo(String value) {
            addCriterion("sign <=", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLike(String value) {
            addCriterion("sign like", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotLike(String value) {
            addCriterion("sign not like", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignIn(List<String> values) {
            addCriterion("sign in", values, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotIn(List<String> values) {
            addCriterion("sign not in", values, "sign");
            return (Criteria) this;
        }

        public Criteria andSignBetween(String value1, String value2) {
            addCriterion("sign between", value1, value2, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotBetween(String value1, String value2) {
            addCriterion("sign not between", value1, value2, "sign");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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