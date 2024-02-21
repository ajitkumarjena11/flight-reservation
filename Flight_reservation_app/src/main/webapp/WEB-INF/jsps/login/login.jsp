<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Login</title>
</head>
<body>
         <h2>Login here</h2>
         <form action="verifyLogin"  method="post">
         Email <input type="text" name="emailId"/>
         password <input type="text" name="password"/>
         <input type="submit" name="Save"/>
         
         </form>
         ${error}
</body>
</html>