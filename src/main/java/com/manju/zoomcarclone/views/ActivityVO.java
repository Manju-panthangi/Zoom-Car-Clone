package com.manju.zoomcarclone.views;

import com.manju.zoomcarclone.models.ActivityType;

import java.util.Date;

public class ActivityVO {
    private String reservationId;
    private ActivityType type;

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
