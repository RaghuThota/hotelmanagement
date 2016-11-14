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
in search page

<h1 align="center"><b><u>Search Hotel</u></b></h1><p>
<s:form action="bookRoom">
<table align="center">
  
  
   <tr>
     <td><s:select name="hotelId" list="hotelList" listValue="hotelName" listKey="hotelId" label="Hotel Name">
    
     </s:select></td>
  </tr>
  
   
  <tr>
  <td><s:submit value="Select Hotel"></s:submit></td>
  </tr>
  
  <tr>
  <td><s:label name="roomNotAvailable"></s:label></td>
  </tr>
</table>



</s:form>

</body>
</html>