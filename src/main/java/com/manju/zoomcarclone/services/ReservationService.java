package com.manju.zoomcarclone.services;

import com.manju.zoomcarclone.models.Reservation;

public interface ReservationService {
    public void createReservation(Reservation reservation);
    public void editReservation(String id,Reservation reservation);
    public void cancelReservation(String id);
    public Reservation getReservationById(String id);
}
