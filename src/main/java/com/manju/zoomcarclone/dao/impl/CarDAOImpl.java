package com.manju.zoomcarclone.dao.impl;

import com.manju.zoomcarclone.dao.CarDAO;
import com.manju.zoomcarclone.models.Car;
import com.manju.zoomcarclone.models.CarStatus;
import com.manju.zoomcarclone.models.CarType;
import com.manju.zoomcarclone.models.ParkingStation;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class CarDAOImpl implements CarDAO {
    private Map<String,Car> carIdVsCar;
    public CarDAOImpl(){
        carIdVsCar = new HashMap<>();
        initCarData();
    }

    @Override
    public void addCar(Car car) {
        if(car != null) {
            carIdVsCar.put(car.getCarId(), car);
        }
    }

    @Override
    public void modifyCar(String id,Car car) {
        if(carIdVsCar.containsKey(id)){
            carIdVsCar.put(id,car);
        }
    }

    @Override
    public void deleteCar(String id) {
        if(carIdVsCar.containsKey(id)){
            carIdVsCar.remove(id);
        }
    }

    @Override
    public Map<String,Car> getCatalog() {
        return this.carIdVsCar;
    }

    @Override
    public Car getCarById(String id) {
        if(carIdVsCar.containsKey(id)){
            return carIdVsCar.get(id);
        }
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

        carIdVsCar.put(car.getCarId(), car);
    }
}
