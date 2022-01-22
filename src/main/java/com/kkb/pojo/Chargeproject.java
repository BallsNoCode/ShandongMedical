package com.kkb.pojo;

import java.math.BigDecimal;

public class Chargeproject {
    private Integer chaP_id;

    private String chaP_name;

    private BigDecimal chaP_money;

    public Integer getChaP_id() {
        return chaP_id;
    }

    public void setChaP_id(Integer chaP_id) {
        this.chaP_id = chaP_id;
    }

    public String getChaP_name() {
        return chaP_name;
    }

    public void setChaP_name(String chaP_name) {
        this.chaP_name = chaP_name == null ? null : chaP_name.trim();
    }

    public BigDecimal getChaP_money() {
        return chaP_money;
    }

    public void setChaP_money(BigDecimal chaP_money) {
        this.chaP_money = chaP_money;
    }
}