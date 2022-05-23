package com.manju.zoomcarclone.controllers;

import com.manju.zoomcarclone.models.Car;
import com.manju.zoomcarclone.services.CarService;
import com.manju.zoomcarclone.services.impl.CarServiceImpl;
import com.manju.zoomcarclone.views.CarVO;
import com.manju.zoomcarclone.views.mappers.CarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarMapper carMapper;
    @Autowired
    private CarService carService;


    @GetMapping("/list")
    public List<Car> getCarCatalog(){
        return carService.getCatalog();
    }

    @GetMapping("/{id}")
    public Car getCarById(@PathVariable String id){
        return carService.getCarById(id);
    }

    @PostMapping("/add")
    public void addCar(@RequestBody CarVO carVo){
        Car car = carMapper.fromView(carVo);
        carService.addCar(car);
    }

    @PutMapping("/modify/{id}")
    public void modifyCar(@PathVariable String id,@RequestBody CarVO carVo){
        Car car = carMapper.fromView(carVo);
        carService.modifyCar(id,car);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCar(@PathVariable String id){
        carService.deleteCar(id);
    }
}
