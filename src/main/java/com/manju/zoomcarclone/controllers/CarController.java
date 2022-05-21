package com.manju.zoomcarclone.controllers;

import com.manju.zoomcarclone.views.CarVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class CarController {

    @GetMapping()
    List<CarVO> search(){
        return null;
    }
    
    @PostMapping("/reserve")
    void reserve(){

    }

    @PostMapping("/checkOut")
    void checkOut(){

    }

    @PostMapping("/return")
    void returnCar(){

    }

}
