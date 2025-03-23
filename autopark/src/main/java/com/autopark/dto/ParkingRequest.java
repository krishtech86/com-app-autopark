package com.autopark.dto;

public class ParkingRequest {

    private String vehicleNumber;

    private String vehicleModel;

    private String charges;

    public ParkingRequest(){

    }

    public ParkingRequest(String vehicleNumber, String vehicleModel, String charges) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleModel = vehicleModel;
        this.charges = charges;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public ParkingRequest setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
        return this;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public ParkingRequest setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
        return this;
    }

    public String getCharges() {
        return charges;
    }

    public ParkingRequest setCharges(String charges) {
        this.charges = charges;
        return this;
    }
}
