package com.manju.zoomcarclone.manager;

import com.manju.zoomcarclone.models.Reservation;

public interface ReservationManager {
    public void createReservation(Reservation reservation);
    public void editReservation(Reservation reservation);
    public void cancelReservation(Reservation reservation);
    public Reservation getReservationById(String id);
}
