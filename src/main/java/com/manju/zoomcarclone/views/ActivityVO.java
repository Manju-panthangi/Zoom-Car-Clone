package com.manju.zoomcarclone.views;

import com.manju.zoomcarclone.models.ActivityType;

import java.util.Date;

public class ActivityVO {
    private String reservationId;
    private String accountId;
    private String activityType;
    private String dateTimeStamp;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public String getDateTimeStamp() {
        return dateTimeStamp;
    }

    public void setDateTimeStamp(String dateTimeStamp) {
        this.dateTimeStamp = dateTimeStamp;
    }

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public String getType() {
        return activityType;
    }

    public void setType(String type) {
        this.activityType = type;
    }
}
