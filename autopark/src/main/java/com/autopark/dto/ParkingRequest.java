package com.autopark.dto;


public class ParkingRequest {
    private String vehicleNumber;
    private String vehicleModel;
    private double charges;

    public ParkingRequest() {
    }

    public ParkingRequest(String vehicleNumber, String vehicleModel, double charges) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleModel = vehicleModel;
        this.charges = charges;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public double getCharges() {
        return charges;
    }

    public void setCharges(double charges) {
        this.charges = charges;
    }
}
