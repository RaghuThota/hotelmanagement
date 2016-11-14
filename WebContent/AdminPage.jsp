<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Page</title>
</head>

<body background="img.jpg">
<%@include file="Header.jsp"%>
<div id="content">
<br><br><br>
<center><font color="#CC6600">WELCOME!!!!! ADMINISTRATOR</font></center>
<br><br><br>
<table border="1" align="left" width="100%" height="150" bordercolor="">
<tr><td>
<table align="center">
<caption><font color="cyan">HOTEL</font></caption>
    <tr><td>&nbsp;</td></tr>
	<tr>
		<td><a href="AddHotels.jsp"><font id="links">Add Hotels</font></a></td>
		<td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td>
	   	<td><a href="ModifyHotelByIdAction"><font id="links">Modify Hotel</font></a></td>
	   	<td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td>
     	<td><a href="DeleteHotelByIdAction"><font id="links">Delete Hotel</font></a></td>
     	<td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td>
		<td><a href="RetrieveHotel"><font id="links">Retrieve Hotel</font></a></td>
		<td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td>
		<td><a href="Reports.jsp"><font id="links">Reports</font></a></td>
		
	</tr>
</table>
</td></tr>
</table>
<br><br><br><br><br><br><br><br><br><br>
<table border="1" align="left" width="100%" height="150" bordercolor="black">
<tr><td>
<table align="center">
<caption><font color="cyan">ROOMS</font></caption>
<tr><td>&nbsp;</td></tr>
	<tr>
		<td><a href="PrepareRoomAction"><font id="links">Add Rooms</font></a></td>
		<td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td>
		<td><a href="DeleteRoomsAction"><font id="links">Delete Rooms</font></a></td>
		<td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td>
		<td><a href="ModifyRoomsByIdAction"><font id="links">Modify Rooms</font></a></td>
		
	</tr>
	

</table>
</td></tr>
</table>
</div>
<br><br><br><br><br><br><br><br><br><br>
<%@ include file="Footer.jsp"%>
</body>
</html>