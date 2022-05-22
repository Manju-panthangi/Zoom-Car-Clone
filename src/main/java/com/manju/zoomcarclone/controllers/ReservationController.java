package com.manju.zoomcarclone.controllers;

import com.manju.zoomcarclone.models.Reservation;
import com.manju.zoomcarclone.views.CarVO;
import com.manju.zoomcarclone.views.ReservationVO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

    @GetMapping("/{id}")
    Reservation getReservationById(@PathVariable String id){
        return null;
    }

    @PostMapping("/create")
    void createReservation(@RequestBody ReservationVO reservation){

    }

    @PutMapping("modify/{id}")
    void editReservation(@PathVariable String id,@RequestBody ReservationVO reservation){

    }

    @PutMapping("cancel/{id}")
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
