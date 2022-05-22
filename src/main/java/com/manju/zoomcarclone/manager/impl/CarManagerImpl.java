package com.manju.zoomcarclone.manager.impl;

import com.manju.zoomcarclone.dao.CarDAO;
import com.manju.zoomcarclone.manager.CarManager;
import com.manju.zoomcarclone.models.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarManagerImpl implements CarManager {
    @Autowired
    private CarDAO carDAO;
    @Override
    public void addCar(Car car) {
        carDAO.addCar(car);
    }

    @Override
    public void modifyCar(Car car) {

    }

    @Override
    public void deleteCar(Car car) {

    }

    @Override
    public List<Car> getCatalog() {
        return carDAO.getCatalog();
    }

    @Override
    public Car getCarById() {
        return null;
    }
}
