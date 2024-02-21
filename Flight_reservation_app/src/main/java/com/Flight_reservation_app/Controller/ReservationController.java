  package com.Flight_reservation_app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Flight_reservation_app.dto.ReservationRequest;
import com.Flight_reservation_app.entity.Reservation;
import com.Flight_reservation_app.service.ReservationService;

@Controller
public class ReservationController {
	 @Autowired
	private ReservationService reservationservice;

	@RequestMapping("/Reservation")
	public String completeReservation(@ModelAttribute ReservationRequest request,ModelMap model) {
	  System.out.println(request.getFlightId());
	  System.out.println(request.getFirstName());
	  System.out.println(request.getLastName());
	  System.out.println(request.getEmail());
	  Reservation reservation = reservationservice.bookFlight(request);
	  model.addAttribute("reservation", reservation);
		return "confirmReservation";
	}
	

	
}
