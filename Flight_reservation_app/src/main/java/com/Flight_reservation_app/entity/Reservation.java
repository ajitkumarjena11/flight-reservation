 package com.Flight_reservation_app.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Reservation extends  AbstractEntity{
   
   private boolean checkedIn;
   
   private int numberOfBags;
     
   @OneToOne
   @JoinColumn(name = "PASSANGER_ID")
   private Passenger passenger;
   
   @OneToOne  
   @JoinColumn(name = "FLIGHT_ID")
   private Flight flight;

   public boolean isCheckedIn() {
	return checkedIn;
   }

   public void setCheckedIn(boolean checkedIn) {
	this.checkedIn = checkedIn;
}

  public int getNumberOfBags() {
	return numberOfBags;
}

  public void setNumberOfBags(int numberOfBags) {
	this.numberOfBags = numberOfBags;
}

   public Passenger getPassenger() {
	return passenger;
}

  public void setPassenger(Passenger passenger) {
	this.passenger = passenger;
}

 public Flight getFlight() {
	return flight;
}

   public void setFlight(Flight flight) {
	this.flight = flight;
}	
}
