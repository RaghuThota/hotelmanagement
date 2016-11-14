<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>update form</title>
<script type="text/javascript" src="validation.js"></script>
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
<s:iterator value="session['list']" var="hot">
	<s:form action="modifyRoom" id="modroom">
		<table  align="center" >
			<tr>
				<td><s:textfield name="hotelId" label="HOTEL ID"
					value="%{#hot.hotelId}" readonly="true"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textfield name="roomId" label="ROOM ID"
					value="%{#hot.roomId}" readonly="true"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textfield name="roomNo" label="ROOM NO" id="rate" onkeyup="return isNumber()"
					value="%{#hot.roomNo}" ></s:textfield></td>
					<td id='rateErr'></td>
			</tr>
			<tr>
				<td><s:select name="roomType" label="ROOM TYPE" value="%{#hot.roomType}" 
				list="{'A/C','NONA/C','DELUXE'}"></s:select></td>
			</tr>
			<tr>
				<td><s:textfield name="perNightRate" label="PER NIGHT RATE" id="rate2" onkeyup="return isNumber2()"
					value="%{#hot.perNightRate}"></s:textfield></td>
					<td id='rateErr2'></td>
			</tr>
			<tr>
				<td><s:select name="availability" label="AVAILABILTY" list="{'yes','no'}"
					value="%{#hot.availability }"></s:select></td>
			</tr>
			
			<tr>
				<td><s:submit value="UPDATE ROOM" onclick="return valmodroom()"></s:submit></td>
			</tr>
		</table>
	</s:form>
</s:iterator>
</body>
</html>