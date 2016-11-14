<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="img.jpg">
    <%@include file="Header.jsp"%>
     <table border = "1">



<tr>
<td>Booking ID</td>
<td>Room Id</td>
<td>User ID</td>
<td>From date</td>
<td>To date</td>
<td>No of Adults</td>
<td>No of Children</td>
<td>Amount</td>

</tr>

  <s:iterator value="#session.bookList" var="book">
     <tr>
       <td><s:property value="#book.getBookingId()"/></td>
       <td><s:property value="#book.getRoomId()"/></td>
        <td><s:property value="#book.getUserId()"/></td>
         <td><s:property value="#book.getFromDate()"/></td>
          <td><s:property value="#book.getToDate()"/></td>
           <td><s:property value="#book.getNoOfAdults()"/></td>
            <td><s:property value="#book.getNoOfChildren()"/></td>
            <td><s:property value="#book.getAmount()"/></td>

            
      
     </tr>
  </s:iterator>


</table>
  
</body>
</html>