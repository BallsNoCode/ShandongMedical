package com.kkb.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DrugExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DrugExample() {
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

        public Criteria andDr_idIsNull() {
            addCriterion("dr_id is null");
            return (Criteria) this;
        }

        public Criteria andDr_idIsNotNull() {
            addCriterion("dr_id is not null");
            return (Criteria) this;
        }

        public Criteria andDr_idEqualTo(Integer value) {
            addCriterion("dr_id =", value, "dr_id");
            return (Criteria) this;
        }

        public Criteria andDr_idNotEqualTo(Integer value) {
            addCriterion("dr_id <>", value, "dr_id");
            return (Criteria) this;
        }

        public Criteria andDr_idGreaterThan(Integer value) {
            addCriterion("dr_id >", value, "dr_id");
            return (Criteria) this;
        }

        public Criteria andDr_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("dr_id >=", value, "dr_id");
            return (Criteria) this;
        }

        public Criteria andDr_idLessThan(Integer value) {
            addCriterion("dr_id <", value, "dr_id");
            return (Criteria) this;
        }

        public Criteria andDr_idLessThanOrEqualTo(Integer value) {
            addCriterion("dr_id <=", value, "dr_id");
            return (Criteria) this;
        }

        public Criteria andDr_idIn(List<Integer> values) {
            addCriterion("dr_id in", values, "dr_id");
            return (Criteria) this;
        }

        public Criteria andDr_idNotIn(List<Integer> values) {
            addCriterion("dr_id not in", values, "dr_id");
            return (Criteria) this;
        }

        public Criteria andDr_idBetween(Integer value1, Integer value2) {
            addCriterion("dr_id between", value1, value2, "dr_id");
            return (Criteria) this;
        }

        public Criteria andDr_idNotBetween(Integer value1, Integer value2) {
            addCriterion("dr_id not between", value1, value2, "dr_id");
            return (Criteria) this;
        }

        public Criteria andDr_urlIsNull() {
            addCriterion("dr_url is null");
            return (Criteria) this;
        }

        public Criteria andDr_urlIsNotNull() {
            addCriterion("dr_url is not null");
            return (Criteria) this;
        }

        public Criteria andDr_urlEqualTo(String value) {
            addCriterion("dr_url =", value, "dr_url");
            return (Criteria) this;
        }

        public Criteria andDr_urlNotEqualTo(String value) {
            addCriterion("dr_url <>", value, "dr_url");
            return (Criteria) this;
        }

        public Criteria andDr_urlGreaterThan(String value) {
            addCriterion("dr_url >", value, "dr_url");
            return (Criteria) this;
        }

        public Criteria andDr_urlGreaterThanOrEqualTo(String value) {
            addCriterion("dr_url >=", value, "dr_url");
            return (Criteria) this;
        }

        public Criteria andDr_urlLessThan(String value) {
            addCriterion("dr_url <", value, "dr_url");
            return (Criteria) this;
        }

        public Criteria andDr_urlLessThanOrEqualTo(String value) {
            addCriterion("dr_url <=", value, "dr_url");
            return (Criteria) this;
        }

        public Criteria andDr_urlLike(String value) {
            addCriterion("dr_url like", value, "dr_url");
            return (Criteria) this;
        }

        public Criteria andDr_urlNotLike(String value) {
            addCriterion("dr_url not like", value, "dr_url");
            return (Criteria) this;
        }

        public Criteria andDr_urlIn(List<String> values) {
            addCriterion("dr_url in", values, "dr_url");
            return (Criteria) this;
        }

        public Criteria andDr_urlNotIn(List<String> values) {
            addCriterion("dr_url not in", values, "dr_url");
            return (Criteria) this;
        }

        public Criteria andDr_urlBetween(String value1, String value2) {
            addCriterion("dr_url between", value1, value2, "dr_url");
            return (Criteria) this;
        }

        public Criteria andDr_urlNotBetween(String value1, String value2) {
            addCriterion("dr_url not between", value1, value2, "dr_url");
            return (Criteria) this;
        }

        public Criteria andDr_inPriceIsNull() {
            addCriterion("dr_inPrice is null");
            return (Criteria) this;
        }

        public Criteria andDr_inPriceIsNotNull() {
            addCriterion("dr_inPrice is not null");
            return (Criteria) this;
        }

        public Criteria andDr_inPriceEqualTo(BigDecimal value) {
            addCriterion("dr_inPrice =", value, "dr_inPrice");
            return (Criteria) this;
        }

        public Criteria andDr_inPriceNotEqualTo(BigDecimal value) {
            addCriterion("dr_inPrice <>", value, "dr_inPrice");
            return (Criteria) this;
        }

        public Criteria andDr_inPriceGreaterThan(BigDecimal value) {
            addCriterion("dr_inPrice >", value, "dr_inPrice");
            return (Criteria) this;
        }

        public Criteria andDr_inPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dr_inPrice >=", value, "dr_inPrice");
            return (Criteria) this;
        }

        public Criteria andDr_inPriceLessThan(BigDecimal value) {
            addCriterion("dr_inPrice <", value, "dr_inPrice");
            return (Criteria) this;
        }

        public Criteria andDr_inPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dr_inPrice <=", value, "dr_inPrice");
            return (Criteria) this;
        }

        public Criteria andDr_inPriceIn(List<BigDecimal> values) {
            addCriterion("dr_inPrice in", values, "dr_inPrice");
            return (Criteria) this;
        }

        public Criteria andDr_inPriceNotIn(List<BigDecimal> values) {
            addCriterion("dr_inPrice not in", values, "dr_inPrice");
            return (Criteria) this;
        }

        public Criteria andDr_inPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dr_inPrice between", value1, value2, "dr_inPrice");
            return (Criteria) this;
        }

        public Criteria andDr_inPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dr_inPrice not between", value1, value2, "dr_inPrice");
            return (Criteria) this;
        }

        public Criteria andDr_outPriceIsNull() {
            addCriterion("dr_outPrice is null");
            return (Criteria) this;
        }

        public Criteria andDr_outPriceIsNotNull() {
            addCriterion("dr_outPrice is not null");
            return (Criteria) this;
        }

        public Criteria andDr_outPriceEqualTo(BigDecimal value) {
            addCriterion("dr_outPrice =", value, "dr_outPrice");
            return (Criteria) this;
        }

        public Criteria andDr_outPriceNotEqualTo(BigDecimal value) {
            addCriterion("dr_outPrice <>", value, "dr_outPrice");
            return (Criteria) this;
        }

        public Criteria andDr_outPriceGreaterThan(BigDecimal value) {
            addCriterion("dr_outPrice >", value, "dr_outPrice");
            return (Criteria) this;
        }

        public Criteria andDr_outPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dr_outPrice >=", value, "dr_outPrice");
            return (Criteria) this;
        }

        public Criteria andDr_outPriceLessThan(BigDecimal value) {
            addCriterion("dr_outPrice <", value, "dr_outPrice");
            return (Criteria) this;
        }

        public Criteria andDr_outPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dr_outPrice <=", value, "dr_outPrice");
            return (Criteria) this;
        }

        public Criteria andDr_outPriceIn(List<BigDecimal> values) {
            addCriterion("dr_outPrice in", values, "dr_outPrice");
            return (Criteria) this;
        }

        public Criteria andDr_outPriceNotIn(List<BigDecimal> values) {
            addCriterion("dr_outPrice not in", values, "dr_outPrice");
            return (Criteria) this;
        }

        public Criteria andDr_outPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dr_outPrice between", value1, value2, "dr_outPrice");
            return (Criteria) this;
        }

        public Criteria andDr_outPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dr_outPrice not between", value1, value2, "dr_outPrice");
            return (Criteria) this;
        }

        public Criteria andDr_nameIsNull() {
            addCriterion("dr_name is null");
            return (Criteria) this;
        }

        public Criteria andDr_nameIsNotNull() {
            addCriterion("dr_name is not null");
            return (Criteria) this;
        }

        public Criteria andDr_nameEqualTo(String value) {
            addCriterion("dr_name =", value, "dr_name");
            return (Criteria) this;
        }

        public Criteria andDr_nameNotEqualTo(String value) {
            addCriterion("dr_name <>", value, "dr_name");
            return (Criteria) this;
        }

        public Criteria andDr_nameGreaterThan(String value) {
            addCriterion("dr_name >", value, "dr_name");
            return (Criteria) this;
        }

        public Criteria andDr_nameGreaterThanOrEqualTo(String value) {
            addCriterion("dr_name >=", value, "dr_name");
            return (Criteria) this;
        }

        public Criteria andDr_nameLessThan(String value) {
            addCriterion("dr_name <", value, "dr_name");
            return (Criteria) this;
        }

        public Criteria andDr_nameLessThanOrEqualTo(String value) {
            addCriterion("dr_name <=", value, "dr_name");
            return (Criteria) this;
        }

        public Criteria andDr_nameLike(String value) {
            addCriterion("dr_name like", value, "dr_name");
            return (Criteria) this;
        }

        public Criteria andDr_nameNotLike(String value) {
            addCriterion("dr_name not like", value, "dr_name");
            return (Criteria) this;
        }

        public Criteria andDr_nameIn(List<String> values) {
            addCriterion("dr_name in", values, "dr_name");
            return (Criteria) this;
        }

        public Criteria andDr_nameNotIn(List<String> values) {
            addCriterion("dr_name not in", values, "dr_name");
            return (Criteria) this;
        }

        public Criteria andDr_nameBetween(String value1, String value2) {
            addCriterion("dr_name between", value1, value2, "dr_name");
            return (Criteria) this;
        }

        public Criteria andDr_nameNotBetween(String value1, String value2) {
            addCriterion("dr_name not between", value1, value2, "dr_name");
            return (Criteria) this;
        }

        public Criteria andDr_typeIsNull() {
            addCriterion("dr_type is null");
            return (Criteria) this;
        }

        public Criteria andDr_typeIsNotNull() {
            addCriterion("dr_type is not null");
            return (Criteria) this;
        }

        public Criteria andDr_typeEqualTo(String value) {
            addCriterion("dr_type =", value, "dr_type");
            return (Criteria) this;
        }

        public Criteria andDr_typeNotEqualTo(String value) {
            addCriterion("dr_type <>", value, "dr_type");
            return (Criteria) this;
        }

        public Criteria andDr_typeGreaterThan(String value) {
            addCriterion("dr_type >", value, "dr_type");
            return (Criteria) this;
        }

        public Criteria andDr_typeGreaterThanOrEqualTo(String value) {
            addCriterion("dr_type >=", value, "dr_type");
            return (Criteria) this;
        }

        public Criteria andDr_typeLessThan(String value) {
            addCriterion("dr_type <", value, "dr_type");
            return (Criteria) this;
        }

        public Criteria andDr_typeLessThanOrEqualTo(String value) {
            addCriterion("dr_type <=", value, "dr_type");
            return (Criteria) this;
        }

        public Criteria andDr_typeLike(String value) {
            addCriterion("dr_type like", value, "dr_type");
            return (Criteria) this;
        }

        public Criteria andDr_typeNotLike(String value) {
            addCriterion("dr_type not like", value, "dr_type");
            return (Criteria) this;
        }

        public Criteria andDr_typeIn(List<String> values) {
            addCriterion("dr_type in", values, "dr_type");
            return (Criteria) this;
        }

        public Criteria andDr_typeNotIn(List<String> values) {
            addCriterion("dr_type not in", values, "dr_type");
            return (Criteria) this;
        }

        public Criteria andDr_typeBetween(String value1, String value2) {
            addCriterion("dr_type between", value1, value2, "dr_type");
            return (Criteria) this;
        }

        public Criteria andDr_typeNotBetween(String value1, String value2) {
            addCriterion("dr_type not between", value1, value2, "dr_type");
            return (Criteria) this;
        }

        public Criteria andDr_simDescIsNull() {
            addCriterion("dr_simDesc is null");
            return (Criteria) this;
        }

        public Criteria andDr_simDescIsNotNull() {
            addCriterion("dr_simDesc is not null");
            return (Criteria) this;
        }

        public Criteria andDr_simDescEqualTo(String value) {
            addCriterion("dr_simDesc =", value, "dr_simDesc");
            return (Criteria) this;
        }

        public Criteria andDr_simDescNotEqualTo(String value) {
            addCriterion("dr_simDesc <>", value, "dr_simDesc");
            return (Criteria) this;
        }

        public Criteria andDr_simDescGreaterThan(String value) {
            addCriterion("dr_simDesc >", value, "dr_simDesc");
            return (Criteria) this;
        }

        public Criteria andDr_simDescGreaterThanOrEqualTo(String value) {
            addCriterion("dr_simDesc >=", value, "dr_simDesc");
            return (Criteria) this;
        }

        public Criteria andDr_simDescLessThan(String value) {
            addCriterion("dr_simDesc <", value, "dr_simDesc");
            return (Criteria) this;
        }

        public Criteria andDr_simDescLessThanOrEqualTo(String value) {
            addCriterion("dr_simDesc <=", value, "dr_simDesc");
            return (Criteria) this;
        }

        public Criteria andDr_simDescLike(String value) {
            addCriterion("dr_simDesc like", value, "dr_simDesc");
            return (Criteria) this;
        }

        public Criteria andDr_simDescNotLike(String value) {
            addCriterion("dr_simDesc not like", value, "dr_simDesc");
            return (Criteria) this;
        }

        public Criteria andDr_simDescIn(List<String> values) {
            addCriterion("dr_simDesc in", values, "dr_simDesc");
            return (Criteria) this;
        }

        public Criteria andDr_simDescNotIn(List<String> values) {
            addCriterion("dr_simDesc not in", values, "dr_simDesc");
            return (Criteria) this;
        }

        public Criteria andDr_simDescBetween(String value1, String value2) {
            addCriterion("dr_simDesc between", value1, value2, "dr_simDesc");
            return (Criteria) this;
        }

        public Criteria andDr_simDescNotBetween(String value1, String value2) {
            addCriterion("dr_simDesc not between", value1, value2, "dr_simDesc");
            return (Criteria) this;
        }

        public Criteria andDr_IsNull() {
            addCriterion("dr_ is null");
            return (Criteria) this;
        }

        public Criteria andDr_IsNotNull() {
            addCriterion("dr_ is not null");
            return (Criteria) this;
        }

        public Criteria andDr_EqualTo(String value) {
            addCriterion("dr_ =", value, "dr_");
            return (Criteria) this;
        }

        public Criteria andDr_NotEqualTo(String value) {
            addCriterion("dr_ <>", value, "dr_");
            return (Criteria) this;
        }

        public Criteria andDr_GreaterThan(String value) {
            addCriterion("dr_ >", value, "dr_");
            return (Criteria) this;
        }

        public Criteria andDr_GreaterThanOrEqualTo(String value) {
            addCriterion("dr_ >=", value, "dr_");
            return (Criteria) this;
        }

        public Criteria andDr_LessThan(String value) {
            addCriterion("dr_ <", value, "dr_");
            return (Criteria) this;
        }

        public Criteria andDr_LessThanOrEqualTo(String value) {
            addCriterion("dr_ <=", value, "dr_");
            return (Criteria) this;
        }

        public Criteria andDr_Like(String value) {
            addCriterion("dr_ like", value, "dr_");
            return (Criteria) this;
        }

        public Criteria andDr_NotLike(String value) {
            addCriterion("dr_ not like", value, "dr_");
            return (Criteria) this;
        }

        public Criteria andDr_In(List<String> values) {
            addCriterion("dr_ in", values, "dr_");
            return (Criteria) this;
        }

        public Criteria andDr_NotIn(List<String> values) {
            addCriterion("dr_ not in", values, "dr_");
            return (Criteria) this;
        }

        public Criteria andDr_Between(String value1, String value2) {
            addCriterion("dr_ between", value1, value2, "dr_");
            return (Criteria) this;
        }

        public Criteria andDr_NotBetween(String value1, String value2) {
            addCriterion("dr_ not between", value1, value2, "dr_");
            return (Criteria) this;
        }

        public Criteria andDr_detaDescIsNull() {
            addCriterion("dr_detaDesc is null");
            return (Criteria) this;
        }

        public Criteria andDr_detaDescIsNotNull() {
            addCriterion("dr_detaDesc is not null");
            return (Criteria) this;
        }

        public Criteria andDr_detaDescEqualTo(String value) {
            addCriterion("dr_detaDesc =", value, "dr_detaDesc");
            return (Criteria) this;
        }

        public Criteria andDr_detaDescNotEqualTo(String value) {
            addCriterion("dr_detaDesc <>", value, "dr_detaDesc");
            return (Criteria) this;
        }

        public Criteria andDr_detaDescGreaterThan(String value) {
            addCriterion("dr_detaDesc >", value, "dr_detaDesc");
            return (Criteria) this;
        }

        public Criteria andDr_detaDescGreaterThanOrEqualTo(String value) {
            addCriterion("dr_detaDesc >=", value, "dr_detaDesc");
            return (Criteria) this;
        }

        public Criteria andDr_detaDescLessThan(String value) {
            addCriterion("dr_detaDesc <", value, "dr_detaDesc");
            return (Criteria) this;
        }

        public Criteria andDr_detaDescLessThanOrEqualTo(String value) {
            addCriterion("dr_detaDesc <=", value, "dr_detaDesc");
            return (Criteria) this;
        }

        public Criteria andDr_detaDescLike(String value) {
            addCriterion("dr_detaDesc like", value, "dr_detaDesc");
            return (Criteria) this;
        }

        public Criteria andDr_detaDescNotLike(String value) {
            addCriterion("dr_detaDesc not like", value, "dr_detaDesc");
            return (Criteria) this;
        }

        public Criteria andDr_detaDescIn(List<String> values) {
            addCriterion("dr_detaDesc in", values, "dr_detaDesc");
            return (Criteria) this;
        }

        public Criteria andDr_detaDescNotIn(List<String> values) {
            addCriterion("dr_detaDesc not in", values, "dr_detaDesc");
            return (Criteria) this;
        }

        public Criteria andDr_detaDescBetween(String value1, String value2) {
            addCriterion("dr_detaDesc between", value1, value2, "dr_detaDesc");
            return (Criteria) this;
        }

        public Criteria andDr_detaDescNotBetween(String value1, String value2) {
            addCriterion("dr_detaDesc not between", value1, value2, "dr_detaDesc");
            return (Criteria) this;
        }

        public Criteria andDr_fatoryIsNull() {
            addCriterion("dr_fatory is null");
            return (Criteria) this;
        }

        public Criteria andDr_fatoryIsNotNull() {
            addCriterion("dr_fatory is not null");
            return (Criteria) this;
        }

        public Criteria andDr_fatoryEqualTo(String value) {
            addCriterion("dr_fatory =", value, "dr_fatory");
            return (Criteria) this;
        }

        public Criteria andDr_fatoryNotEqualTo(String value) {
            addCriterion("dr_fatory <>", value, "dr_fatory");
            return (Criteria) this;
        }

        public Criteria andDr_fatoryGreaterThan(String value) {
            addCriterion("dr_fatory >", value, "dr_fatory");
            return (Criteria) this;
        }

        public Criteria andDr_fatoryGreaterThanOrEqualTo(String value) {
            addCriterion("dr_fatory >=", value, "dr_fatory");
            return (Criteria) this;
        }

        public Criteria andDr_fatoryLessThan(String value) {
            addCriterion("dr_fatory <", value, "dr_fatory");
            return (Criteria) this;
        }

        public Criteria andDr_fatoryLessThanOrEqualTo(String value) {
            addCriterion("dr_fatory <=", value, "dr_fatory");
            return (Criteria) this;
        }

        public Criteria andDr_fatoryLike(String value) {
            addCriterion("dr_fatory like", value, "dr_fatory");
            return (Criteria) this;
        }

        public Criteria andDr_fatoryNotLike(String value) {
            addCriterion("dr_fatory not like", value, "dr_fatory");
            return (Criteria) this;
        }

        public Criteria andDr_fatoryIn(List<String> values) {
            addCriterion("dr_fatory in", values, "dr_fatory");
            return (Criteria) this;
        }

        public Criteria andDr_fatoryNotIn(List<String> values) {
            addCriterion("dr_fatory not in", values, "dr_fatory");
            return (Criteria) this;
        }

        public Criteria andDr_fatoryBetween(String value1, String value2) {
            addCriterion("dr_fatory between", value1, value2, "dr_fatory");
            return (Criteria) this;
        }

        public Criteria andDr_fatoryNotBetween(String value1, String value2) {
            addCriterion("dr_fatory not between", value1, value2, "dr_fatory");
            return (Criteria) this;
        }

        public Criteria andDr_directionIsNull() {
            addCriterion("dr_direction is null");
            return (Criteria) this;
        }

        public Criteria andDr_directionIsNotNull() {
            addCriterion("dr_direction is not null");
            return (Criteria) this;
        }

        public Criteria andDr_directionEqualTo(String value) {
            addCriterion("dr_direction =", value, "dr_direction");
            return (Criteria) this;
        }

        public Criteria andDr_directionNotEqualTo(String value) {
            addCriterion("dr_direction <>", value, "dr_direction");
            return (Criteria) this;
        }

        public Criteria andDr_directionGreaterThan(String value) {
            addCriterion("dr_direction >", value, "dr_direction");
            return (Criteria) this;
        }

        public Criteria andDr_directionGreaterThanOrEqualTo(String value) {
            addCriterion("dr_direction >=", value, "dr_direction");
            return (Criteria) this;
        }

        public Criteria andDr_directionLessThan(String value) {
            addCriterion("dr_direction <", value, "dr_direction");
            return (Criteria) this;
        }

        public Criteria andDr_directionLessThanOrEqualTo(String value) {
            addCriterion("dr_direction <=", value, "dr_direction");
            return (Criteria) this;
        }

        public Criteria andDr_directionLike(String value) {
            addCriterion("dr_direction like", value, "dr_direction");
            return (Criteria) this;
        }

        public Criteria andDr_directionNotLike(String value) {
            addCriterion("dr_direction not like", value, "dr_direction");
            return (Criteria) this;
        }

        public Criteria andDr_directionIn(List<String> values) {
            addCriterion("dr_direction in", values, "dr_direction");
            return (Criteria) this;
        }

        public Criteria andDr_directionNotIn(List<String> values) {
            addCriterion("dr_direction not in", values, "dr_direction");
            return (Criteria) this;
        }

        public Criteria andDr_directionBetween(String value1, String value2) {
            addCriterion("dr_direction between", value1, value2, "dr_direction");
            return (Criteria) this;
        }

        public Criteria andDr_directionNotBetween(String value1, String value2) {
            addCriterion("dr_direction not between", value1, value2, "dr_direction");
            return (Criteria) this;
        }

        public Criteria andDr_remarkIsNull() {
            addCriterion("dr_remark is null");
            return (Criteria) this;
        }

        public Criteria andDr_remarkIsNotNull() {
            addCriterion("dr_remark is not null");
            return (Criteria) this;
        }

        public Criteria andDr_remarkEqualTo(String value) {
            addCriterion("dr_remark =", value, "dr_remark");
            return (Criteria) this;
        }

        public Criteria andDr_remarkNotEqualTo(String value) {
            addCriterion("dr_remark <>", value, "dr_remark");
            return (Criteria) this;
        }

        public Criteria andDr_remarkGreaterThan(String value) {
            addCriterion("dr_remark >", value, "dr_remark");
            return (Criteria) this;
        }

        public Criteria andDr_remarkGreaterThanOrEqualTo(String value) {
            addCriterion("dr_remark >=", value, "dr_remark");
            return (Criteria) this;
        }

        public Criteria andDr_remarkLessThan(String value) {
            addCriterion("dr_remark <", value, "dr_remark");
            return (Criteria) this;
        }

        public Criteria andDr_remarkLessThanOrEqualTo(String value) {
            addCriterion("dr_remark <=", value, "dr_remark");
            return (Criteria) this;
        }

        public Criteria andDr_remarkLike(String value) {
            addCriterion("dr_remark like", value, "dr_remark");
            return (Criteria) this;
        }

        public Criteria andDr_remarkNotLike(String value) {
            addCriterion("dr_remark not like", value, "dr_remark");
            return (Criteria) this;
        }

        public Criteria andDr_remarkIn(List<String> values) {
            addCriterion("dr_remark in", values, "dr_remark");
            return (Criteria) this;
        }

        public Criteria andDr_remarkNotIn(List<String> values) {
            addCriterion("dr_remark not in", values, "dr_remark");
            return (Criteria) this;
        }

        public Criteria andDr_remarkBetween(String value1, String value2) {
            addCriterion("dr_remark between", value1, value2, "dr_remark");
            return (Criteria) this;
        }

        public Criteria andDr_remarkNotBetween(String value1, String value2) {
            addCriterion("dr_remark not between", value1, value2, "dr_remark");
            return (Criteria) this;
        }

        public Criteria andDr_numberIsNull() {
            addCriterion("dr_number is null");
            return (Criteria) this;
        }

        public Criteria andDr_numberIsNotNull() {
            addCriterion("dr_number is not null");
            return (Criteria) this;
        }

        public Criteria andDr_numberEqualTo(Integer value) {
            addCriterion("dr_number =", value, "dr_number");
            return (Criteria) this;
        }

        public Criteria andDr_numberNotEqualTo(Integer value) {
            addCriterion("dr_number <>", value, "dr_number");
            return (Criteria) this;
        }

        public Criteria andDr_numberGreaterThan(Integer value) {
            addCriterion("dr_number >", value, "dr_number");
            return (Criteria) this;
        }

        public Criteria andDr_numberGreaterThanOrEqualTo(Integer value) {
            addCriterion("dr_number >=", value, "dr_number");
            return (Criteria) this;
        }

        public Criteria andDr_numberLessThan(Integer value) {
            addCriterion("dr_number <", value, "dr_number");
            return (Criteria) this;
        }

        public Criteria andDr_numberLessThanOrEqualTo(Integer value) {
            addCriterion("dr_number <=", value, "dr_number");
            return (Criteria) this;
        }

        public Criteria andDr_numberIn(List<Integer> values) {
            addCriterion("dr_number in", values, "dr_number");
            return (Criteria) this;
        }

        public Criteria andDr_numberNotIn(List<Integer> values) {
            addCriterion("dr_number not in", values, "dr_number");
            return (Criteria) this;
        }

        public Criteria andDr_numberBetween(Integer value1, Integer value2) {
            addCriterion("dr_number between", value1, value2, "dr_number");
            return (Criteria) this;
        }

        public Criteria andDr_numberNotBetween(Integer value1, Integer value2) {
            addCriterion("dr_number not between", value1, value2, "dr_number");
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