<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
<p align="center">
<s:form action="deleteHotel">
	<s:textfield name="hotelId" label="HOTEL ID"></s:textfield>
	<s:submit value="SUBMIT"></s:submit>
</s:form>
</p>
</body>
</html>