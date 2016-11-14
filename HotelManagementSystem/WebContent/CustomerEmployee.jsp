<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Employee Page</title>
</head>
<body bgcolor="wheat">
<%@include file="Header.jsp"%>
<br><br><br>
<div id="content">
<p align="center"><font color="green" style=""> <b><s:property value="#session.userName"/>!!!</b></font><br>
</p>
<br><br><br>
<font color="brown"><h3><b>Select any of the option</b></h3></font>
<table width="100%" align="center">

<tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td><a href="getHotelName.action">Search Hotel Room</a></td>
    <td>&nbsp;</td>
    <td><a href="BookingStatus.jsp">Check Booking Status</a></td>
   </tr>
</table>
</div>
<br><br><br><br><br>
<%@include file="Footer.jsp"%>
</body>
</html>