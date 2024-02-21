package com.Flight_reservation_app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Flight_reservation_app.dto.ReservationRequest;
import com.Flight_reservation_app.entity.Flight;
import com.Flight_reservation_app.entity.Passenger;
import com.Flight_reservation_app.entity.Reservation;
import com.Flight_reservation_app.repository.FlightRepository;
import com.Flight_reservation_app.repository.PassengerRepository;
import com.Flight_reservation_app.repository.ReservationRepository;
@Service
public class ReservationServiceimpl implements ReservationService {
	 
	@Autowired
	private PassengerRepository passengerRepo;
	@Autowired
	private FlightRepository flightRepo;
	
	@Autowired
	private ReservationRepository reservationRepo;

	public Reservation bookFlight(ReservationRequest request) {
		 String firstName=request.getFirstName();
		 String lastName=request.getLastName();
		 String email=request.getEmail();
		 String phone=request.getPhone();
		            
		 
		 Passenger passenger = new Passenger();
		// passenger.setId(request.getFlightId());
		 passenger.setFirstName(firstName);
		 passenger.setLastName(lastName);
		 passenger.setEmail(email);
		 passenger.setPhone(phone);
		 
		 Passenger savedPasseneger = passengerRepo.save(passenger);
		 Optional<Flight> findById = flightRepo.findById(request.getFlightId());
		 Reservation reservation =new Reservation();
		
	 reservation.setFlight(findById.get());
		reservation.setPassenger(savedPasseneger);
		 reservation.setCheckedIn(false);
		 reservationRepo.save(reservation);
		return reservation;
	}
}
