<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>update form</title>
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

#mydisptable {
    border-width: 1;
	border: solid;
	border-color: red;
	background-color: #C7C7C7
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
<s:iterator value="session['list']" var="hot">
	<s:form action="modifyRoom">
		<table id="mydisptable" align="center">
			<tr>
				<td><s:textfield name="hotelId" label="HOTEL ID"
					value="%{#hot.hotelId}" readonly="true"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textfield name="roomId" label="ROOM ID"
					value="%{#hot.roomId}" readonly="true"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textarea name="roomNo" label="ROOM NO"
					value="%{#hot.roomNo}"></s:textarea></td>
			</tr>
			<tr>
				<td><s:textfield name="roomType" label="ROOM TYPE" value="%{#hot.roomType}"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textarea name="perNightRate" label="PER NIGHT RATE"
					value="%{#hot.perNightRate}"></s:textarea></td>
			</tr>
			<tr>
				<td><s:textfield name="availability" label="AVAILABILTY"
					value="%{#hot.availability}"></s:textfield></td>
			</tr>
			
			<tr>
				<td><s:submit value="UPDATE ROOM"></s:submit></td>
			</tr>
		</table>
	</s:form>
</s:iterator>
</body>
</html>