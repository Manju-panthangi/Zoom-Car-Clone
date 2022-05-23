package com.manju.zoomcarclone.services;

import com.manju.zoomcarclone.models.Car;

import java.util.List;
import java.util.Map;

public interface CarService {
    public void addCar(Car car);
    public void modifyCar(String id,Car car);
    public void deleteCar(String id);
    public List<Car> getCatalog();
    public Car getCarById(String id);
}
