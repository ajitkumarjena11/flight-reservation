<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Search Flights</title>
</head>
<body>
     <h2>Find Flights</h2>
     <pre>
     <form action="findFlights" method="post">
     From <input type="text" name="from"/>
      TO <input type="text" name="to"/>
      deparaturedate :<input type="text" name="deparaturedate"/>
      <input type="submit" value="search"/>
     </form>
     </pre>
</body>
</html>