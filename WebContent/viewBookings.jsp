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
<jsp:include page="Header.jsp"/>
<br/>
<br/>

<table border=1 height=50% width=50% bgcolor="">
<tr>
<th>BookingId</th>
<th>RoomId</th>
<th>UserId</th>
<th>Booked-From</th>
<th>Booked_To</th>
<th>No Of Adults</th>
<th>No Of Children</th>
<th>AVG_RATE_PER_Night</th>
</tr>
<s:iterator value="session['list']">
<tr>
<td>
<s:property value="bookingId"/>
</td>
<td>
<s:property value="roomId"/>
</td>
<td>
<s:property value="userId"/>
</td>
<td>
<s:property value="fromDate"/>
</td>
<td>
<s:property value="toDate"/>
</td>
<td>
<s:property value="noOfAdults"/>
</td>
<td>
<s:property value="noOfChildren"/>
</td>
<td>
<s:property value="amount"/>
</td>
<td>

</td>
<td>

</td>
<td>

</td>
</tr>
</s:iterator>
</table>
</body>
</html>