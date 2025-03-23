package com.autopark.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private double amount;

    @Column(nullable = false)
    private LocalDateTime paymentDate;

    @Column(nullable = false)
    private String paymentMethod;

    @OneToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;

    public Payment(){

    }

    public Payment(Long id, double amount, LocalDateTime paymentDate, String paymentMethod) {
        this.id = id;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
    }

    public Long getId() {
        return id;
    }

    public Payment setId(Long id) {
        this.id = id;
        return this;
    }

    public double getAmount() {
        return amount;
    }

    public Payment setAmount(double amount) {
        this.amount = amount;
        return this;
    }

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    public Payment setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
        return this;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public Payment setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    public Booking getBooking() {
        return booking;
    }

    public Payment setBooking(Booking booking) {
        this.booking = booking;
        return this;
    }
}
