package com.manju.zoomcarclone.controllers;

import com.manju.zoomcarclone.models.Car;
import com.manju.zoomcarclone.views.CarVO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {
    @GetMapping("/list")
    List<Car> getCarCatalog(){
        return null;
    }

    @GetMapping("/{id}")
    Car getCarById(@PathVariable String id){
        return null;
    }

    @PostMapping("/add")
    void addCar(@RequestBody CarVO car){

    }

    @PutMapping("/modify/{id}")
    void modifyCar(@PathVariable String id,@RequestBody CarVO car){

    }

    @DeleteMapping("/delete/{id}")
    void deleteCar(@PathVariable String id){

    }
}
