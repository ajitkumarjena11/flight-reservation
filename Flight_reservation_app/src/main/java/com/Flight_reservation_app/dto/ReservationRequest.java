package com.Flight_reservation_app.dto;

//import javax.persistence.Id;

public class ReservationRequest {
    
	private long flightId;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String phone;

	public long getFlightId() {
		return flightId;
	}
	
	public void setFlightId(long flightId) {
		this.flightId = flightId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}	
}
