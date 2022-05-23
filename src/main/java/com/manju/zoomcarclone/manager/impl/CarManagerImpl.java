package com.manju.zoomcarclone.manager.impl;

import com.manju.zoomcarclone.dao.CarDAO;
import com.manju.zoomcarclone.manager.CarManager;
import com.manju.zoomcarclone.models.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class CarManagerImpl implements CarManager {
    @Autowired
    private CarDAO carDAO;
    @Override
    public void addCar(Car car) {
        carDAO.addCar(car);
    }

    @Override
    public void modifyCar(String id,Car car) {
        carDAO.modifyCar(id, car);
    }

    @Override
    public void deleteCar(String id) {
        carDAO.deleteCar(id);
    }

    @Override
    public List<Car> getCatalog() {
        return carDAO.getCatalog().values().stream().collect(
                Collectors.toCollection(ArrayList::new));
    }

    @Override
    public Car getCarById(String id) {
        return carDAO.getCarById(id);
    }
}
