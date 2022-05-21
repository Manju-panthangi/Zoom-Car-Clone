package com.manju.zoomcarclone.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class CarController {

    @GetMapping()
    @PostMapping("/register")
    void register(){

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
