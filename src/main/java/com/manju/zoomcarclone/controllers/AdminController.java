package com.manju.zoomcarclone.controllers;

import com.manju.zoomcarclone.views.CarVO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @PostMapping("/add")
    void addCar(@RequestBody CarVO car){

    }
    @PutMapping("/modify")
    void modifyCar(@RequestBody CarVO car){

    }

    @DeleteMapping("/delete")
    void deleteCar(String carId){

    }

}
