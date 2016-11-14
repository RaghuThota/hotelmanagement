<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@include file="Header.jsp"%>
<body background="img.jpg">
<h1 align="center"><b><u>Book Room</u></b></h1><p>


<s:form action="bookUserDetails">
<table align="center">
 
  <tr>
     <td><s:textfield readonly="true"   name="hotelId" label="Hotel ID" value="%{session.hotelId}"></s:textfield></td>
  </tr>
  
  
   <tr>
     <td><s:select  name="roomType" list="roomTypeList"  listValue="roomType" listKey="roomType" label="Room Type" ></s:select></td>
  </tr>
  
   
  <tr>
  <td><s:submit value="Book Your Rooms"></s:submit></td>
  <td><s:label name="roomNotAvailable"></s:label></td>
  </tr>
  
  
</table>




</s:form>

</body>
</html>