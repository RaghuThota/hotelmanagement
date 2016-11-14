<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="/HotelManagementSystem/js/calendar.js"></script>

<script type="text/javascript" src="/HotelManagementSystem/js/calendar-en.js"></script>

<script type="text/javascript" src="/HotelManagementSystem/js/calendar-setup.js"></script>

<link rel="stylesheet" type="text/css" href="/HotelManagementSystem/css/calendar-win2k-1.css">
</head>
<body background="img.jpg">
<%@include file="Header.jsp"%>
<h1 align="center"><b><u>Book Room</u></b></h1><p>
<s:form action="viewBookingAction">
<table align="center">
 
 
  
   <tr>
     <td><s:textfield name="fromDate" label="Enter Date" id="date1"></s:textfield></td>
        <td>  <input type="button" id="trigger1" name=button" value="calender"></input>
          <script type="text/javascript"> 

                                Calendar.setup( 
                                 { 
                                   inputField  : "date1",         // ID of the input field 
                                   ifFormat    : "%d/%m/%Y",    // the date format 
                                   button      : "trigger1"       // ID of the button 
                                  } 
                               );
 
          </script>
     </td>
  </tr>
  
   
  <tr>
  <td><s:submit value="View Details"></s:submit></td>
  </tr>
  
  
</table>




</s:form>

</body>
</html>