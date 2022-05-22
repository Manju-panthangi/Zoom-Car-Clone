package com.manju.zoomcarclone.services;

import com.manju.zoomcarclone.models.Reservation;

public interface ReservationService {
    public void createReservation(Reservation reservation);
    public void editReservation(Reservation reservation);
    public void cancelReservation(Reservation reservation);
    public Reservation getReservationById(String id);
}
