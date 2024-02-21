package com.Flight_reservation_app.service;

import com.Flight_reservation_app.dto.ReservationRequest;
import com.Flight_reservation_app.entity.Reservation;

public interface ReservationService {
   
	Reservation bookFlight(ReservationRequest request);
	
}
