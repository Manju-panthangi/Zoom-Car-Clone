package com.manju.zoomcarclone.views;

import com.manju.zoomcarclone.models.ParkingStation;


import java.util.Date;

public class ReservationVO {
    private Date pickupDate;
    private Date returnDate;
    private ParkingStation pickupLocation;
    private ParkingStation returnLocation;

    public Date getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(Date pickupDate) {
        this.pickupDate = pickupDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public ParkingStation getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(ParkingStation pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public ParkingStation getReturnLocation() {
        return returnLocation;
    }

    public void setReturnLocation(ParkingStation returnLocation) {
        this.returnLocation = returnLocation;
    }
}
