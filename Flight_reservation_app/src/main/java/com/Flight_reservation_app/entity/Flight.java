package com.Flight_reservation_app.entity;

import java.sql.Timestamp;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Flight  extends AbstractEntity{
	
	
	@Column(name="FLIGHTS_NUMBER")
	private String  flightNumber;
	@Column(name = "OPERATING_AIRLINES")
	private String  operatingAirline;
	@Column(name="DEPARTURE_CITY")
	private String  deparatureCity;
	@Column(name="ARRIVAL_CITY")
	private String  arrivalCity;
	@Temporal(TemporalType.DATE)
	 @Column(name = "DATE_OF_DEPARATURE")
	private Date  dateOfDeparture;
	@Column(name = "ESTIMATED_DEPARTURE_TIME")
	private Timestamp estimatedDepartureTime;

	
	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getOperatingAirline() {
		return operatingAirline;
	}

	public void setOperatingAirline(String operatingAirline) {
		this.operatingAirline = operatingAirline;
	}

	public String getDeparatureCity() {
		return deparatureCity;
	}

	public void setDeparatureCity(String deparatureCity) {
		this.deparatureCity = deparatureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}

	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}

	public Timestamp getEstimatedDepartureTime() {
		return estimatedDepartureTime;
	}

	public void setEstimatedDepartureTime(Timestamp estimatedDepartureTime) {
		this.estimatedDepartureTime = estimatedDepartureTime;
	}
}
