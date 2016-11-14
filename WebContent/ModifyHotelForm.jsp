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
	<s:form action="modifyHotel" id="modifyhotel">
		<table  align="center" >
			<tr>
				<td><s:textfield name="hotelId" label="HOTEL ID" 
					value="%{#hot.hotelId}" readonly="true"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textfield name="hotelName" label="HOTEL NAME" id='hotelname' onkeyup="return isHotelName()"
					value="%{#hot.hotelName}"></s:textfield></td>
					<td id='hotelnameErr'></td>
			</tr>
			<tr>
				<td><s:textarea name="address" label="ADDRESS" id='address' onkeyup="return isAddress()"
					value="%{#hot.address}"></s:textarea></td>
					<td id='addressErr'></td>
			</tr>
			<tr>
				<td><s:textfield name="city" label="CITY" value="%{#hot.city}"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textarea name="description" label="DESCRIPTION"
					value="%{#hot.description}"></s:textarea></td>
			</tr>
			<tr>
				<td><s:textfield name="phoneNo1" label="PHONE NO:1" id='phone' onkeyup="return isPhone()"
					value="%{#hot.phoneNo1}"></s:textfield></td>
					<td id='phoneErr'></td>
			</tr>
			<tr>
				<td><s:textfield name="phoneNo2" label="PHONE NO:2"
					value="%{#hot.phoneNo2}"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textfield name="avg_rate_night" label="Rate/Night" id="rate2" onkeyup="return isNumber2()"
					value="%{#hot.avg_rate_night}"></s:textfield></td>
					<td id='rateErr2'></td>
			</tr>
			<tr>
				<td><s:textfield name="rating" label="RATING"
					value="%{#hot.rating}"></s:textfield></td>
			</tr>
			<tr>
				<td><s:textfield name="email" label="EMAIL" id='email' onkeyup="return isEmail()"
					value="%{#hot.email}"></s:textfield></td>
					<td id='emailErr'></td>
			</tr>
			<tr>
				<td><s:textfield name="fax" label="FAX" value="%{#hot.fax}"></s:textfield></td>
			</tr>
			<tr>
				<td><s:submit value="UPDATE HOTEL" onclick="return valmodifyhotel()"></s:submit></td>
			</tr>
		</table>
	</s:form>
</s:iterator>
</body>
</html>