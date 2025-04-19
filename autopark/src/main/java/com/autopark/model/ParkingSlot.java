package com.autopark.model;


import com.autopark.dto.ParkingRequest;
import jakarta.persistence.*;

@Entity
@Table(name = "parking_slots")
public class ParkingSlot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String slotNumber;

    @Column(nullable = false)
    private boolean isAvailable;

    @OneToOne(mappedBy = "parkingSlot")
    private Booking booking;

    private String vehicleNumber;
    private String vehicleModel;
    public ParkingSlot() {
    }

    public ParkingSlot(String slotNumber, boolean isAvailable) {
        this.slotNumber = slotNumber;
        this.isAvailable = isAvailable;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public ParkingSlot setId(Long id) {
        this.id = id;
        return this;
    }

    public String getSlotNumber() {
        return slotNumber;
    }

    public ParkingSlot setSlotNumber(String slotNumber) {
        this.slotNumber = slotNumber;
        return this;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public ParkingSlot setAvailable(boolean available) {
        isAvailable = available;
        return this;
    }

    public Booking getBooking() {
        return booking;
    }

    public ParkingSlot setBooking(Booking booking) {
        this.booking = booking;
        return this;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public ParkingSlot setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
        return this;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public ParkingSlot setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
        return this;
    }
}

