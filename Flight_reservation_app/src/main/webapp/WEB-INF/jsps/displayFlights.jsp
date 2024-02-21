<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Flights</title>
</head>
<body>
	<h2>Flight search result</h2>
	<table border="1">
		<tr>
			<th>Airlines</th>
			<th>Departure City</th>
			<th>Arrival City</th>
			<th>Departure Time</th>
			<th>Select Flight</th>
		</tr>
		<c:forEach items="${findflights}" var="findflights">
			<tr>
				<td>${findflights.operatingAirline}</td>
				<td>${findflights.deparatureCity}</td>
				<td>${findflights.arrivalCity}</td>
				<td>${findflights.estimatedDepartureTime}</td>
				<td><a href="showCompleteReservation?flightId=${findflights.id}">select</a> </td>
			</tr>

		</c:forEach>
		

	</table>
	
</body>
</html>