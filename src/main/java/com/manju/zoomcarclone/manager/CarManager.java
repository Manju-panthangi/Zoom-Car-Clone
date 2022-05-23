package com.manju.zoomcarclone.manager;

import com.manju.zoomcarclone.models.Car;

import java.util.List;
import java.util.Map;

public interface CarManager {
    public void addCar(Car car);
    public void modifyCar(String id,Car car);
    public void deleteCar(String id);
    public List<Car> getCatalog();
    public Car getCarById(String id);
}
