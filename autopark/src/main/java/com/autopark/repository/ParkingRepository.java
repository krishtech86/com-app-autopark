package com.autopark.repository;

import com.autopark.model.ParkingSlot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ParkingRepository extends JpaRepository<ParkingSlot, Long> {

    // find all available parking slots
    List<ParkingSlot> findByIsAvailableTrue();

    //find a specefic parking slot by its number
    Optional<ParkingSlot> findBySlotNumber(String slotNumber);
}
