package models;

public class Car {
    private int carId;
    private String licenseNumber;
    private String make;
    private String model;
    private CarType type;
    private int yearOfManufacture;
    private CarStatus status;
    private ParkingStation station;

    public ParkingStation getStation() {
        return station;
    }

    public void setStation(ParkingStation station) {
        this.station = station;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public int getId() {
        return carId;
    }

    public void setId(int id) {
        this.carId = id;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public CarStatus getStatus() {
        return status;
    }

    public void setStatus(CarStatus status) {
        this.status = status;
    }
}
