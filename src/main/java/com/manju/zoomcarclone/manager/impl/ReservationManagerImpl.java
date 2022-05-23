package com.manju.zoomcarclone.manager.impl;

import com.manju.zoomcarclone.dao.ReservationDAO;
import com.manju.zoomcarclone.manager.ReservationManager;
import com.manju.zoomcarclone.models.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationManagerImpl implements ReservationManager {
    @Autowired
    private ReservationDAO reservationDAO;
    @Override
    public void createReservation(Reservation reservation) {
        reservationDAO.createReservation(reservation);
    }

    @Override
    public void editReservation(String id,Reservation reservation) {
        reservationDAO.editReservation(id, reservation);
    }

    @Override
    public void cancelReservation(String id) {
        reservationDAO.cancelReservation(id);
    }

    @Override
    public Reservation getReservationById(String id) {
        return reservationDAO.getReservationById(id);
    }
}
