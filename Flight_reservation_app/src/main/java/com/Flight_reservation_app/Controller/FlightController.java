package com.Flight_reservation_app.Controller;



import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Flight_reservation_app.entity.Flight;
import com.Flight_reservation_app.repository.FlightRepository;

@Controller
public class FlightController {
    @Autowired
	private FlightRepository flightRepo;
    
    
	@RequestMapping("/findFlights")
	 public String findFlights(@RequestParam("from") String from, 
			 @RequestParam("to") String to,
			 @RequestParam("deparaturedate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date deparaturedate,
			 ModelMap model) {
		
		List<Flight> findflights = flightRepo.findflights(from, to, deparaturedate);
		model.addAttribute("findflights", findflights);
		//System.out.println(findflights);
		return"displayFlights";
	}
	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") long flightId,ModelMap model) {
		//System.out.println(flightId);
		Flight flight = flightRepo.findById(flightId).get();
		model.addAttribute("flight", flight);
		return "showReservation";
	}
}
