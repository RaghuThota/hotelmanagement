<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adding New Hotel Info Into Database</title>

<script type="text/javascript" src="validation.js"></script>
<%@include file="Header.jsp"%>
</head>
<body bgcolor="" background="img.jpg">
<table id="mytoptable">
	<tr>
		<td>
		<h1><font color="blue">Add hotels.....</font></h1>
		</td>
	</tr>
</table>

<s:form action="addHotel"  id="add">
	<table bgcolor="" align="center">
		<tr>
			<td><s:textfield name="hotelName" label="HOTEL_NAME" id='hotelname' onkeyup="return isHotelName()"></s:textfield></td>
		<td id='hotelnameErr'></td></tr>
		<tr>
			<td><s:select name="city"
				list="{'Mumbai','Bangalore','Chennai','Hyderabad','Pune','Noida'}"
				label="CITY" headerValue="Bangalore"></s:select></td>
		</tr>
		<tr>
			<td><s:textarea name="address" label="ADDRESS" id='address' onkeyup="return isAddress()"></s:textarea></td>
		<td id='addressErr'></td></tr>
		<tr>
			<td><s:textarea name="description" label="DESCRIPTION"></s:textarea></td>
		</tr>
		<tr>
			<td><s:textfield name="avg_rate_night" label="AVG_RATE_PER_NIGHT" id="rate2" onkeyup="return isNumber2()"></s:textfield></td>
		<td id='rateErr2'></td></tr>
		<tr>
			<td><s:textfield name="phoneNo1" label="PHONE_NO1" id='phone' onkeyup="return isPhone()"></s:textfield></td>
		<td id='phoneErr'></td></tr>
		<tr>
			<td><s:textfield name="phoneNo2" label="PHONE_NO2"></s:textfield></td>
		</tr>
		<tr>
			<td><s:select name="rating" list="{'3*','4*','5*'}"
				label="RATING" headerValue="5*"></s:select></td>
		</tr>
		<tr>
			<td><s:textfield name="email" label="EMAIL" id='email' onkeyup="return isEmail()"></s:textfield></td>
			<td id='emailErr'></td>
		</tr>
		<tr>
			<td><s:textfield name="fax" label="FAX"></s:textfield></td>
		</tr>
		<tr>
			<td><s:submit value="Add" onclick="return validateform()"></s:submit></td>
		</tr>
	</table>

</s:form>
</body>
</html>