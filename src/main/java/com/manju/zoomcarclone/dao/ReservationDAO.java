package com.manju.zoomcarclone.dao;

import com.manju.zoomcarclone.models.Reservation;

public interface ReservationDAO {
    public void createReservation(Reservation reservation);
    public void editReservation(String id,Reservation reservation);
    public void cancelReservation(String id);
    public Reservation getReservationById(String id);
}
