package com.manju.zoomcarclone.models;

import java.util.Date;

public class Bill extends Reservation{
    private Double baseCharge;
    private Double taxCharge;
    private Double penaltyCharge;
    private Double other;
    private Double totalAmount;
    private Date billingDate;

    public Double getBaseCharge() {
        return baseCharge;
    }

    public void setBaseCharge(Double baseCharge) {
        this.baseCharge = baseCharge;
    }

    public Double getTaxCharge() {
        return taxCharge;
    }

    public void setTaxCharge(Double taxCharge) {
        this.taxCharge = taxCharge;
    }

    public Double getPenaltyCharge() {
        return penaltyCharge;
    }

    public void setPenaltyCharge(Double penaltyCharge) {
        this.penaltyCharge = penaltyCharge;
    }

    public Double getOther() {
        return other;
    }

    public void setOther(Double other) {
        this.other = other;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Date getBillingDate() {
        return billingDate;
    }

    public void setBillingDate(Date billingDate) {
        this.billingDate = billingDate;
    }
}
