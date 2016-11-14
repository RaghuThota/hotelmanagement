<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adding Rooms</title>
<script type="text/javascript" src="validation.js"></script>
<style type="text/css">
<style type="text/css">
#mytoptable {
	border-width: 1;
	
	border-color: gray;
	background-color:gray;
	width: 100%;
}

#myheading {
	font-style: italic;
	font-family: New Century Schoolbook;
	text-align: center;
	color: white;
}
</style>
</head>
<body background="img.jpg">
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
<p align="left">
<a href="RetrieveHotel.action"><font id="links">view Hotel details</font></a>
</p>

<s:form action="addRooms" id="addrooms">
	<table bgcolor="" align="center">
		
		<tr>
			<td><s:select name="hotelId" label="HOTEL ID" list="#request['hotelList']"></s:select>
			</td>
		</tr>
		<tr>
			<td><s:textfield name="roomNo" label="ROOM NO" id="rate" onkeyup="return isNumber()"></s:textfield></td>
		<td id='rateErr'></td></tr>
		<tr>
			<td><s:select name="availability" label="AVAILABILITY" list="{'yes','no'}"></s:select></td>
		</tr>
		<tr>
			<td><s:select name="roomType" label="ROOM TYPE" list="{'A/C','NONA/C','DELUXE'}"/>
			</td>
		</tr>
		<tr>
			<td><s:textfield name="perNightRate" label="PER NIGHT RATE" id="rate2" onkeyup="return isNumber2()"></s:textfield></td>
			<td id='rateErr2'></td>
		</tr>
		<tr>
		     <td><s:file name="photoPath" label="Upload Photo" required="true"  id="photo" onfocus="isPhoto()"/></td>
		     <td id='photoErr2'></td>
		 </tr>
		<tr>
			<td><s:submit value="ADD ROOMS" onclick="return valaddroom()"></s:submit></td>
		</tr>
	</table>
</s:form>
</body>
</html>