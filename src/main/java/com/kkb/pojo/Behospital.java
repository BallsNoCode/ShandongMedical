package com.kkb.pojo;

import java.math.BigDecimal;

public class Behospital {
    private Integer beH_id;

    private String beH_nursePeoPle;

    private String beH_patBed;

    private BigDecimal beH_antecedent;

    private String beH_illness;

    private Integer beH_closePrice;

    private Integer beH_state;

    public Integer getBeH_id() {
        return beH_id;
    }

    public void setBeH_id(Integer beH_id) {
        this.beH_id = beH_id;
    }

    public String getBeH_nursePeoPle() {
        return beH_nursePeoPle;
    }

    public void setBeH_nursePeoPle(String beH_nursePeoPle) {
        this.beH_nursePeoPle = beH_nursePeoPle == null ? null : beH_nursePeoPle.trim();
    }

    public String getBeH_patBed() {
        return beH_patBed;
    }

    public void setBeH_patBed(String beH_patBed) {
        this.beH_patBed = beH_patBed == null ? null : beH_patBed.trim();
    }

    public BigDecimal getBeH_antecedent() {
        return beH_antecedent;
    }

    public void setBeH_antecedent(BigDecimal beH_antecedent) {
        this.beH_antecedent = beH_antecedent;
    }

    public String getBeH_illness() {
        return beH_illness;
    }

    public void setBeH_illness(String beH_illness) {
        this.beH_illness = beH_illness == null ? null : beH_illness.trim();
    }

    public Integer getBeH_closePrice() {
        return beH_closePrice;
    }

    public void setBeH_closePrice(Integer beH_closePrice) {
        this.beH_closePrice = beH_closePrice;
    }

    public Integer getBeH_state() {
        return beH_state;
    }

    public void setBeH_state(Integer beH_state) {
        this.beH_state = beH_state;
    }
}