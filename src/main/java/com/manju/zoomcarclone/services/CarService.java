package com.manju.zoomcarclone.services;

import com.manju.zoomcarclone.models.Car;

import java.util.List;

public interface CarService {
    public void addCar(Car car);
    public void modifyCar(Car car);
    public void deleteCar(Car car);
    public List<Car> getCatalog();
    public Car getCarById();
}
