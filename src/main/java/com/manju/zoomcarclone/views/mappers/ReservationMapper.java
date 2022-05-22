package com.manju.zoomcarclone.views.mappers;

import com.manju.zoomcarclone.models.Reservation;
import com.manju.zoomcarclone.views.ReservationVO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReservationMapper {
    public Reservation fromView(ReservationVO reservationVo) throws ParseException {
        Reservation reservation = new Reservation();

        if(reservationVo==null){
            return null;
        }

        SimpleDateFormat format = new SimpleDateFormat("yy/MM/dd HH:mm:ss");

        Date pickUpDate = format.parse(reservationVo.getPickupDate());
        Date returnDate = format.parse(reservationVo.getReturnDate());

        reservation.setPickupDate(pickUpDate);
        reservation.setReturnDate(returnDate);

        reservation.setPickupLocation(reservationVo.getPickupLocation());
        reservation.setReturnLocation(reservationVo.getReturnLocation());

        return reservation;

    }

    public ReservationVO toView(Reservation reservation){

        ReservationVO reservationVo = new ReservationVO();

        if(reservation==null){
            return null;
        }

        SimpleDateFormat formatter = new SimpleDateFormat("yy/MM/dd HH:mm:ss");

        String pickUpDate = formatter.format(reservation.getPickupDate());
        String returnDate = formatter.format(reservation.getReturnDate());

        reservationVo.setPickupDate(pickUpDate);
        reservationVo.setReturnDate(returnDate);
        reservationVo.setPickupLocation(reservation.getPickupLocation());
        reservationVo.setReturnLocation(reservation.getReturnLocation());

        return reservationVo;
    }

}
