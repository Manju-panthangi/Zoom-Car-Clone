package com.manju.zoomcarclone.services.impl;

import com.manju.zoomcarclone.manager.ReservationManager;
import com.manju.zoomcarclone.models.Reservation;
import com.manju.zoomcarclone.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ReservationServiceImpl implements ReservationService {
    @Autowired
    private ReservationManager reservationManager;
    @Override
    public void createReservation(Reservation reservation) {
        String reservationId = UUID.randomUUID().toString();
        reservation.setReservationId(reservationId);
        reservationManager.createReservation(reservation);
    }

    @Override
    public void editReservation(String id,Reservation reservation) {
        reservationManager.editReservation(id, reservation);
    }

    @Override
    public void cancelReservation(String id) {
        reservationManager.cancelReservation(id);
    }

    @Override
    public Reservation getReservationById(String id) {
        return reservationManager.getReservationById(id);
    }
}
