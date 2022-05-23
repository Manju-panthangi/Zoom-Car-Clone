package com.manju.zoomcarclone.controllers;

import com.manju.zoomcarclone.models.Reservation;
import com.manju.zoomcarclone.services.ReservationService;
import com.manju.zoomcarclone.views.CarVO;
import com.manju.zoomcarclone.views.ReservationVO;
import com.manju.zoomcarclone.views.mappers.ReservationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

    @Autowired
    private ReservationMapper reservationMapper;
    @Autowired
    private ReservationService reservationService;

    @GetMapping("/{id}")
    public Reservation getReservationById(@PathVariable String id){
        return reservationService.getReservationById(id);
    }

    @PostMapping("/create")
    public void createReservation(@RequestBody ReservationVO reservationVo) throws ParseException {
        Reservation reservation = reservationMapper.fromView(reservationVo);
        reservationService.createReservation(reservation);

    }

    @PutMapping("modify/{id}")
    public void editReservation(@PathVariable String id,@RequestBody ReservationVO reservationVo) throws ParseException {
        Reservation reservation = reservationMapper.fromView(reservationVo);
        reservationService.editReservation(reservation.getReservationId(),reservation);

    }

    @PostMapping("cancel/{id}")
    public void cancelReservation(@PathVariable String id){
        reservationService.cancelReservation(id);
    }

}
