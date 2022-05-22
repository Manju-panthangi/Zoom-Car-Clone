package com.manju.zoomcarclone.models;

import java.util.Date;

public class Payment extends Bill{
    private Date paymentDate;
    private PaymentStatus status;

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }
}
