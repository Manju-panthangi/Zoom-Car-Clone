package com.manju.zoomcarclone.views.mappers;

import com.manju.zoomcarclone.models.Reservation;
import com.manju.zoomcarclone.views.ReservationVO;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ReservationMapper {
    public Reservation fromView(ReservationVO reservationVo) throws ParseException {
        Reservation reservation = new Reservation();

        if(reservationVo==null){
            return null;
        }

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy HH:mm:ss");

        Date pickUpDate = format.parse(reservationVo.getPickupDate());
        Date returnDate = format.parse(reservationVo.getReturnDate());

        reservation.setPickupDate(pickUpDate);
        reservation.setReturnDate(returnDate);

        reservation.setCarId(reservation.getCarId());
        reservation.setPickupLocation(reservationVo.getPickupLocation());
        reservation.setReturnLocation(reservationVo.getReturnLocation());
        reservation.setAccountId(reservationVo.getAccountId());

        return reservation;

    }

    public ReservationVO toView(Reservation reservation){

        ReservationVO reservationVo = new ReservationVO();

        if(reservation==null){
            return null;
        }

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy HH:mm:ss");

        String pickUpDate = formatter.format(reservation.getPickupDate());
        String returnDate = formatter.format(reservation.getReturnDate());

        reservationVo.setPickupDate(pickUpDate);
        reservationVo.setReturnDate(returnDate);
        reservationVo.setCarId(reservation.getCarId());
        reservationVo.setPickupLocation(reservation.getPickupLocation());
        reservationVo.setReturnLocation(reservation.getReturnLocation());
        reservationVo.setAccountId(reservation.getAccountId());

        return reservationVo;
    }

}
