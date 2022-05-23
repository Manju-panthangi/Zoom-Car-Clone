package com.manju.zoomcarclone.dao;

import com.manju.zoomcarclone.models.Car;

import java.util.List;
import java.util.Map;

public interface CarDAO {
    public void addCar(Car car);
    public void modifyCar(String id,Car car);
    public void deleteCar(String id);
    public Map<String,Car> getCatalog();
    public Car getCarById(String id);
}
