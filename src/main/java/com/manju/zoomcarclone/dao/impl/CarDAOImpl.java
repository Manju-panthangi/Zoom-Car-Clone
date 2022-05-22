package com.manju.zoomcarclone.dao.impl;

import com.manju.zoomcarclone.dao.CarDAO;
import com.manju.zoomcarclone.models.Car;
import com.manju.zoomcarclone.models.CarStatus;
import com.manju.zoomcarclone.models.CarType;
import com.manju.zoomcarclone.models.ParkingStation;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class CarDAOImpl implements CarDAO {
    private ArrayList<Car> carCatalog;
    public CarDAOImpl(){
        carCatalog = new ArrayList<>();
        initCarData();
    }

    @Override
    public void addCar(Car car) {
        carCatalog.add(car);
    }

    @Override
    public void modifyCar(Car car) {

    }

    @Override
    public void deleteCar(Car car) {

    }

    @Override
    public List<Car> getCatalog() {
        return this.carCatalog;
    }

    @Override
    public Car getCarById() {
        return null;
    }

    private void initCarData(){
        Car car = new Car();
        car.setCarId(UUID.randomUUID().toString());
        car.setRegistrationNumber("TS09EM4445");
        car.setMake("Skoda");
        car.setModel("Superb");
        car.setType(CarType.PREMIUM);
        car.setStation(ParkingStation.CHIKKADPALLI);
        car.setYearOfManufacture(2015);
        car.setStatus(CarStatus.AVAILABLE);

        carCatalog.add(car);
    }
}
