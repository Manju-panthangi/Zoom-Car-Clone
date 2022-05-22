package com.manju.zoomcarclone.dao;

import com.manju.zoomcarclone.models.Reservation;

public interface ReservationDAO {
    public void createReservation(Reservation reservation);
    public void editReservation(Reservation reservation);
    public void cancelReservation(Reservation reservation);
    public Reservation getReservationById(String id);
}
