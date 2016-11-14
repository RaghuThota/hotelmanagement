<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="img.jpg">
<%@include file="Header.jsp"%>
<h2 align="center"><font color="red" >REPORTS</font></h2>
<table bordercolor="black">
<tr>
<td><a href="RetrieveHotel.action">view list of all hotels</a></td>

<tr>

<td><a href="BookingListAction">View Bookings of specific hotel</a></td>

</tr>
<tr>

<td><a href="GuestListAction">View guest list of specific hotel</a></td>



</tr>
<tr>

<td><a href="viewDateBookings.jsp">View bookings for specified date</a></td>

</tr>


</table>
</body>
</html>