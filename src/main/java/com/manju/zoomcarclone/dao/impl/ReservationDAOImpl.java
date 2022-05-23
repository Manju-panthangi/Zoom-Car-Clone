package com.manju.zoomcarclone.dao.impl;

import com.manju.zoomcarclone.dao.ReservationDAO;
import com.manju.zoomcarclone.models.Reservation;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ReservationDAOImpl implements ReservationDAO {
    private Map<String,Reservation> reservationIdVsReservation = new HashMap<>();
    private Map<String,Reservation> accountIdVsReservation = new HashMap<>();


    @Override
    public void createReservation(Reservation reservation) {
        if(reservation!=null) {
            reservationIdVsReservation.put(reservation.getReservationId(), reservation);
            accountIdVsReservation.put(reservation.getAccountId(), reservation);
        }
    }

    @Override
    public void editReservation(String id,Reservation reservation) {
        if(reservationIdVsReservation.containsKey(id)){
            reservationIdVsReservation.put(id,reservation);
        }
    }

    @Override
    public void cancelReservation(String id) {
        if(reservationIdVsReservation.containsKey(id)){
            reservationIdVsReservation.remove(id);
        }
    }

    @Override
    public Reservation getReservationById(String id) {
        if(reservationIdVsReservation.containsKey(id)){
            return reservationIdVsReservation.get(id);
        }
        return null;
    }


}
