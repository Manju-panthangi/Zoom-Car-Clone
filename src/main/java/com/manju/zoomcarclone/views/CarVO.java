package com.manju.zoomcarclone.views;

import com.manju.zoomcarclone.models.CarType;
import com.manju.zoomcarclone.models.ParkingStation;

public class CarVO {
    private String registrationNumber;
    private String make;
    private String model;
    private String carType;
    private int yearOfManufacture;
    private String station;

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return carType;
    }

    public void setType(String type) {
        this.carType = type;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }
}
