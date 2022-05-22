package com.manju.zoomcarclone.views.mappers;

import com.manju.zoomcarclone.models.Car;
import com.manju.zoomcarclone.models.CarType;
import com.manju.zoomcarclone.models.ParkingStation;
import com.manju.zoomcarclone.views.CarVO;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {
    public Car fromView(CarVO carVo){
        Car car = new Car();
        if(carVo==null){
            return null;
        }

        car.setRegistrationNumber(carVo.getRegistrationNumber());
        car.setMake(carVo.getMake());
        car.setModel(carVo.getModel());
        car.setType(CarType.valueOf(carVo.getType()));
        car.setYearOfManufacture(carVo.getYearOfManufacture());
        car.setStation(ParkingStation.valueOf(carVo.getStation()));

        return car;
    }
    public CarVO toView(Car car){
        CarVO carVo = new CarVO();

        if(car==null){
            return null;
        }
        carVo.setRegistrationNumber(car.getRegistrationNumber());
        carVo.setMake(car.getMake());
        carVo.setModel(car.getModel());
        carVo.setType(car.getType().toString());
        carVo.setYearOfManufacture(car.getYearOfManufacture());
        carVo.setStation(car.getStation().toString());

        return carVo;
    }
}
