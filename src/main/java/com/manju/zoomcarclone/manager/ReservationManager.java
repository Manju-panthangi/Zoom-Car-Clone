package com.manju.zoomcarclone.manager;

import com.manju.zoomcarclone.models.Reservation;

public interface ReservationManager {
    public void createReservation(Reservation reservation);
    public void editReservation(String id,Reservation reservation);
    public void cancelReservation(String id);
    public Reservation getReservationById(String id);
}
