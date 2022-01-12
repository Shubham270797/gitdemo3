<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center style="border: solid;">
<center><h2><b>Customer Detail</b></h2></center>
<form action="AddCustomerInfo" method="post">
<label><b>First Name:</b></label><input type="text" name="firstName" placeholder="Enter First Name"/>
<br>
<label><b>Last Name:</b></label><input type="text" name="lastName" placeholder="Enter Last Name"/>
<br>
<label><b>Address:</b></label><input type="text" name="address" placeholder="Enter Address"/>
<br>
<input type="submit" name="submit" value="Add-info"/>
<br>
</form>
</center>
</body>
</html>