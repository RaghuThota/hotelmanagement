<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="Header.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="validation.js"></script>
<script type="text/javascript" src="/HotelManagementSystem/js/calendar.js"></script>

<script type="text/javascript" src="/HotelManagementSystem/js/calendar-en.js"></script>

<script type="text/javascript" src="/HotelManagementSystem/js/calendar-setup.js"></script>

<link rel="stylesheet" type="text/css" href="/HotelManagementSystem/css/calendar-win2k-1.css">
</head>
<body background="img.jpg">

<h1 align="center"><b><u>Book Room</u></b></h1><p>
<s:form action="RoomBooked" onsubmit="return finalValidation()">
<table align="center">
 
  
  <tr>
     <td>
       <s:textfield name="roomNo" readonly="true"  label="Room Number" value="%{session.roomNo}"></s:textfield>
       <s:hidden name="roomId" id="roomId" value="%{session.roomId}"></s:hidden>
     </td>
  </tr>
  
    <tr>
     <td><s:textfield name="userId" label="User ID" readonly="true" value="%{session.userId}"></s:textfield></td>
  </tr>
  
   <tr>
     <td><s:textfield name="fromDate" label="From Date" id='Date1' onchange="return checkdate1()"></s:textfield></td>
        <td>  <input type="button" id="trigger1" name=button" value="calender"></input>
         <td id='dateErr1'><script type="text/javascript">

                                Calendar.setup( 
                                 { 
                                   inputField  : "Date1",         // ID of the input field 
                                   ifFormat    : "%d/%m/%Y",    // the date format 
                                   button      : "trigger1"       // ID of the button 
                                  } 
                               );
 
          </script>
     </td>
     
  </tr>
  
   <tr>
     <td><s:textfield name="toDate" label="To Date" id='Date2' onchange="return checkdate()"></s:textfield></td>
      <td><input type="button" id="trigger2" name=button" value="calender"></input>
        <td id='dateErr2'>  <script type="text/javascript"> 

                                Calendar.setup( 
                                 { 
                                   inputField  : "Date2",         // ID of the input field 
                                   ifFormat    : "%d/%m/%Y",    // the date format 
                                   button      : "trigger2"       // ID of the button 
                                  } 
                               );
 
          </script>
     </td>
  
  </tr>
  
   <tr>
     <td><s:select  name="noOfAdults" list="{'1','2','3','4','5'}"  label="No of Adults"></s:select></td>
  </tr>
  
   <tr>
     <td><s:select  name="noOfChildren" list="{'1','2','3','4','5'}"  label="No of Children"></s:select></td>
  </tr>
  
   
  
   
  
   
  <tr>
  <td><s:submit value="Book Room"></s:submit></td>
  </tr>
  
  
</table>




</s:form>

</body>
</html>