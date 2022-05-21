package com.manju.zoomcarclone.views;

import com.manju.zoomcarclone.models.CarType;
import com.manju.zoomcarclone.models.ParkingStation;

public class CarVO {
    private String registrationNumber;
    private String make;
    private String model;
    private CarType type;
    private int yearOfManufacture;
    private ParkingStation station;

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

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public ParkingStation getStation() {
        return station;
    }

    public void setStation(ParkingStation station) {
        this.station = station;
    }
}
