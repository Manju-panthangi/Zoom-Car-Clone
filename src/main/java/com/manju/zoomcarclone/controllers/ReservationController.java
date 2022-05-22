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
    public Reservation getReservationById(@PathVariable String id){
        return null;
    }

    @PostMapping("/create")
    public void createReservation(@RequestBody ReservationVO reservation){

    }

    @PutMapping("modify/{id}")
    public void editReservation(@PathVariable String id,@RequestBody ReservationVO reservation){

    }

    @PostMapping("cancel/{id}")
    public void cancelReservation(@PathVariable String id){

    }

}
