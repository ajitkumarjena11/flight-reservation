package com.Flight_reservation_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Flight_reservation_app.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
