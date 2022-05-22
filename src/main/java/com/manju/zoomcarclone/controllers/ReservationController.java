package com.manju.zoomcarclone.controllers;

import com.manju.zoomcarclone.models.Reservation;
import com.manju.zoomcarclone.views.CarVO;
import com.manju.zoomcarclone.views.ReservationVO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class ReservationController {
/**
    @GetMapping()
    List<CarVO> search(){
        return null;
    }
*/
    @GetMapping("/{id}")
    Reservation getReservationById(@PathVariable String id){
        return null;
    }

    @PostMapping("/reserve")
    void createReservation(@RequestBody ReservationVO reservation){

    }

    @PutMapping("/reserve/edit/{id}")
    void editReservation(@PathVariable String id,@RequestBody ReservationVO reservation){

    }

    @PutMapping("/reserve/cancel/{id}")
    void cancelReservation(@PathVariable String id){

    }
/**
    @PostMapping("/checkOut")
    void checkOut(String id, @RequestBody ReservationVO reservation){

    }

    @PostMapping("/return")
    void returnCar(){

    }
*/
}
