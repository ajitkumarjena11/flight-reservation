<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Complete Reservation</title>
</head>
<body>
	<h2>Flight Details</h2>
	Flight Number:${flight.id}
	</br> operating Airline :${flight.operatingAirline}
	</br> Departure City:${flight.deparatureCity}
	</br> Arrival City:${flight.arrivalCity}
	</br> Departure Date:${flight.dateOfDeparture}
	</br>
	<h2>Enter passeneger Details</h2>
	<pre>
	<form action="Reservation" method="post">
	
		first Name :<input type="text" name="firstName" />   
		Last Name :<input type="text" name="lastName" /> 
		Email :<input type="text" name="email" />
		Phone Number :<input type="text" name="phone" /> 
		<input type="hidden" name="flightId" value="${flight.id}" />
		<input type="submit" value="Complete Reservation" />
        
	</form>
     </pre>
</body>
</html>