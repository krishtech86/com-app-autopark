package com.autopark.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToOne
    @JoinColumn(name = "slot_id", nullable = false)
    private ParkingSlot parkingSlot;

    @OneToOne(mappedBy = "booking", cascade = CascadeType.ALL, orphanRemoval = true)
    private Payment payment;

    @Column(nullable = false)
    private String vehicleNumber;

    @Column(nullable = false)
    private String vehicleModel;

    @Column(nullable = false)
    private double charges;

    @Column(nullable = false)
    private LocalDateTime bookingDate;

    @Column
    private LocalDateTime exitDate;

    public Booking(){

    }

    public Booking(Long id, User user, ParkingSlot parkingSlot, String vehicleNumber,
                   String vehicleModel, double charges, LocalDateTime bookingDate) {
        this.id = id;
        this.user = user;
        this.parkingSlot = parkingSlot;
        this.vehicleNumber = vehicleNumber;
        this.vehicleModel = vehicleModel;
        this.charges = charges;
        this.bookingDate = bookingDate;
    }

    public Long getId() {
        return id;
    }

    public Booking setId(Long id) {
        this.id = id;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Booking setUser(User user) {
        this.user = user;
        return this;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public Booking setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
        return this;
    }

    public Payment getPayment() {
        return payment;
    }

    public Booking setPayment(Payment payment) {
        this.payment = payment;
        return this;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public Booking setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
        return this;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public Booking setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
        return this;
    }

    public double getCharges() {
        return charges;
    }

    public Booking setCharges(double charges) {
        this.charges = charges;
        return this;
    }

    public LocalDateTime getBookingDate() {
        return bookingDate;
    }

    public Booking setBookingDate(LocalDateTime bookingDate) {
        this.bookingDate = bookingDate;
        return this;
    }

    public LocalDateTime getExitDate() {
        return exitDate;
    }

    public Booking setExitDate(LocalDateTime exitDate) {
        this.exitDate = exitDate;
        return this;
    }
}
