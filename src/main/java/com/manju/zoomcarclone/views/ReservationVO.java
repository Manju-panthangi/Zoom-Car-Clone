package com.manju.zoomcarclone.views;

import com.manju.zoomcarclone.models.ParkingStation;


import java.util.Date;

public class ReservationVO {
    private String accountId;
    private String carId;
    private String pickupDate;
    private String returnDate;
    private ParkingStation pickupLocation;
    private ParkingStation returnLocation;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(String pickupDate) {
        this.pickupDate = pickupDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
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
