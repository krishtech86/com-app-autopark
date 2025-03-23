package com.autopark.model;

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
    private Boolean isAvailable;

    @OneToOne(mappedBy = "parkingSlot")
    private Booking booking;

    public ParkingSlot(){

    }

    public ParkingSlot(String slotNumber, Boolean isAvailable) {
        this.slotNumber = slotNumber;
        this.isAvailable = isAvailable;
    }

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

    public Boolean getAvailable() {
        return isAvailable;
    }

    public ParkingSlot setAvailable(Boolean available) {
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
}
