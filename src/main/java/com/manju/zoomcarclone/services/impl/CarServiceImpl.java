package com.manju.zoomcarclone.services.impl;

import com.manju.zoomcarclone.manager.CarManager;
import com.manju.zoomcarclone.manager.impl.CarManagerImpl;
import com.manju.zoomcarclone.models.Car;
import com.manju.zoomcarclone.models.CarStatus;
import com.manju.zoomcarclone.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarManager carManager;
    @Override
    public void addCar(Car car) {
        //TODO Shorten UUID length if possible
        String carId = UUID.randomUUID().toString();
        car.setCarId(carId);
        car.setStatus(CarStatus.AVAILABLE);
        carManager.addCar(car);
    }

    @Override
    public void modifyCar(String id,Car car) {
        carManager.modifyCar(id, car);
    }

    @Override
    public void deleteCar(String id) {
        carManager.deleteCar(id);
    }

    @Override
    public List<Car> getCatalog() {
        return carManager.getCatalog();
    }

    @Override
    public Car getCarById(String id) {
        return carManager.getCarById(id);
    }
}
