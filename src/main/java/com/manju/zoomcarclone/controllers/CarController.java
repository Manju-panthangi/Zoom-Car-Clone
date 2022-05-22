package com.manju.zoomcarclone.controllers;

import com.manju.zoomcarclone.models.Car;
import com.manju.zoomcarclone.services.CarService;
import com.manju.zoomcarclone.services.impl.CarServiceImpl;
import com.manju.zoomcarclone.views.CarVO;
import com.manju.zoomcarclone.views.mappers.CarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarMapper carMapper;
    @Autowired
    private CarService carService;


    @GetMapping("/list")
    List<Car> getCarCatalog(){
        return null;
    }

    @GetMapping("/{id}")
    Car getCarById(@PathVariable String id){
        return null;
    }

    @PostMapping("/add")
    void addCar(@RequestBody CarVO carVo){
        Car car = carMapper.fromView(carVo);
        carService.addCar(car);
    }

    @PutMapping("/modify/{id}")
    void modifyCar(@PathVariable String id,@RequestBody CarVO car){

    }

    @DeleteMapping("/delete/{id}")
    void deleteCar(@PathVariable String id){

    }
}
