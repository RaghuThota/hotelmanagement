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
	<s:form action="modifyHotel">
		<table id="mydisptable" align="center">
			<tr>
				<td><s:textfield name="hotelId" label="HOTEL ID"
					value="%{#hot.hotelId}" readonly="true"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textfield name="hotelName" label="HOTEL NAME"
					value="%{#hot.hotelName}"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textarea name="address" label="ADDRESS"
					value="%{#hot.address}"></s:textarea></td>
			</tr>
			<tr>
				<td><s:textfield name="city" label="CITY" value="%{#hot.city}"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textarea name="description" label="DESCRIPTION"
					value="%{#hot.description}"></s:textarea></td>
			</tr>
			<tr>
				<td><s:textfield name="phoneNo1" label="PHONE NO:1"
					value="%{#hot.phoneNo1}"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textfield name="phoneNo2" label="PHONE NO:2"
					value="%{#hot.phoneNo2}"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textfield name="avg_rate_night" label="Rate/Night"
					value="%{#hot.avg_rate_night}"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textfield name="rating" label="RATING"
					value="%{#hot.rating}"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textfield name="email" label="EMAIL"
					value="%{#hot.email}"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textfield name="fax" label="FAX" value="%{#hot.fax}"></s:textfield></td>
			</tr>
			<tr>
				<td><s:submit value="UPDATE HOTEL"></s:submit></td>
			</tr>
		</table>
	</s:form>
</s:iterator>
</body>
</html>