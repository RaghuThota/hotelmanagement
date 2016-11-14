<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adding New Hotel Info Into Database</title>
<style type="text/css">
#mytoptable {
	border-width: 1;
	border: solid;
	border-color: white;
	background-color: black;
	width: 100%;
}

#myheading {
	font-style: italic;
	font-family: New Century Schoolbook;
	text-align: center;
	color: white
}
</style>
</head>
<body bgcolor="#EBEBEB">
<table id="mytoptable">
	<tr>
		<td>
		<h1 id="myheading">Hotel Booking Management System</h1>
		</td>
	</tr>
</table>
<br>
<br>
<br>
<s:form action="addHotel">
	<table bgcolor="#C7C7C7" align="center">
		<tr>
			<td><s:textfield name="hotelName" label="HOTEL_NAME"></s:textfield></td>
		</tr>
		<tr>
			<td><s:select name="city"
				list="{'Mumbai','Bangalore','Chennai','Hyderabad','Pune','Noida'}"
				label="CITY" headerValue="Bangalore"></s:select></td>
		</tr>
		<tr>
			<td><s:textarea name="address" label="ADDRESS"></s:textarea></td>
		</tr>
		<tr>
			<td><s:textarea name="description" label="DESCRIPTION"></s:textarea></td>
		</tr>
		<tr>
			<td><s:textfield name="avg_rate_night"
				label="AVG_RATE_PER_NIGHT"></s:textfield></td>
		</tr>
		<tr>
			<td><s:textfield name="phoneNo1" label="PHONE_NO1"></s:textfield></td>
		</tr>
		<tr>
			<td><s:textfield name="phoneNo2" label="PHONE_NO2"></s:textfield></td>
		</tr>
		<tr>
			<td><s:select name="rating" list="{'3*','4*','5*'}"
				label="RATING" headerValue="5*"></s:select></td>
		</tr>
		<tr>
			<td><s:textfield name="email" label="EMAIL"></s:textfield></td>
		</tr>
		<tr>
			<td><s:textfield name="fax" label="FAX"></s:textfield></td>
		</tr>
		<tr>
			<td><s:submit value="Add"></s:submit></td>
		</tr>
	</table>

</s:form>
</body>
</html>