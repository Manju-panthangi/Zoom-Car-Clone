package com.manju.zoomcarclone.manager;

import com.manju.zoomcarclone.models.Car;

import java.util.List;

public interface CarManager {
    public void addCar(Car car);
    public void modifyCar(Car car);
    public void deleteCar(Car car);
    public List<Car> getCatalog();
    public Car getCarById();
}
