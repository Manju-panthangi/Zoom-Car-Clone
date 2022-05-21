package models;

import java.util.Date;

public class CarReservation {
    private String reservationId;
    private Date creationDate;
    private ReservationStatus ReservationStatus;
    private Date pickupDate;
    private Date returnDate;
    private ParkingStation pickupLocation;
    private ParkingStation returnLocation;

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public models.ReservationStatus getReservationStatus() {
        return ReservationStatus;
    }

    public void setReservationStatus(models.ReservationStatus reservationStatus) {
        ReservationStatus = reservationStatus;
    }

    public Date getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(Date pickupDate) {
        this.pickupDate = pickupDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public ParkingStation getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(ParkingStation pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public ParkingStation getReturnLocation() {
        return returnLocation;
    }

    public void setReturnLocation(ParkingStation returnLocation) {
        this.returnLocation = returnLocation;
    }
}
