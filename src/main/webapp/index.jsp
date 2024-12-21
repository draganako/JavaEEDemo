<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
</head>
<body>
<h3>Enter your information</h3>
 
<form action="ProcessData" method="post">
<label>First Name : </label>
<input type="text" name="fname"><br>
<br>
<label>Last Name : </label>
<input type="text" name="lname"><br>
<br>
<label>Phone : </label>
<input type="text" name="phone"><br>
<br>
<input type="submit" value="Send">
</form>
 
</body>
</html>