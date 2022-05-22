package com.manju.zoomcarclone.views;

import com.manju.zoomcarclone.models.ActivityType;

import java.util.Date;

public class ActivityVO {
    private String reservationId;
    private ActivityType type;
    private String dateTimeStamp;


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

    public ActivityType getType() {
        return type;
    }

    public void setType(ActivityType type) {
        this.type = type;
    }
}
