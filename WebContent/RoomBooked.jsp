<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="img.jpg">
<%@include file="Header.jsp"%>
<br>
</br>
Room is Booked
<table>
   <tr>
      <th>Booking Id</th>
      <th>User Id</th>
      <th>From Date</th>
      <th>To Date</th>
      <th>Amount</th>
   </tr>
   
   <tr>
     <td> <s:property value="%{session.bookingId}"/> </td>
     <td> <s:property value="%{session.userId}"/> </td>
     <td> <s:property value="%{session.fromDate}"/> </td>
     <td> <s:property value="%{session.toDate}"/> </td>
     <td> <s:property value="%{session.amount}"/> </td>
   </tr>

<a href="CustomerEmployee.jsp"><font id="links" color="red"> Home </font></a>


</table>
</body>
</html>