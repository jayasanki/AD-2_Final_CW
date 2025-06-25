package com.example.vehicle_manage.repository;

import com.example.vehicle_manage.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    List<Vehicle> findByUserId(String userId);
    List<Vehicle> findByCurrentParkingSpaceId(Long parkingSpaceId);
    Vehicle findByLicensePlate(String licensePlate);
} 