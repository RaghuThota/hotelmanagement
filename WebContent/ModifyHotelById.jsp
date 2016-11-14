<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modify Hotel By Id</title>
<body bgcolor="" background="img.jpg">
<style type="text/css">
#mytoptable {
	border-width: 1;
	
	border-color: gray;
	background-color:gray;
	width: 100%;
}

#myheading {
	font-style: italic;
	font-family: New Century Schoolbook;
	text-align: center;
	color: white;
}
</style>
</head>
<body background="img.jpg">
<table id="mytoptable">
	<tr>
		<td>
		<h1 id="myheading">CheapStays.com</h1>
		</td>
	</tr>
</table>
<br>
<br>
<br>
<a href="RetrieveHotel.action"><font id="links">view hotel details</font></a>
<p align="center">
<s:form action="retrieveForModify">
<s:select name="hotelId" label="HOTEL ID" list="#request['hotelList']"/>
<s:submit value="SUBMIT"></s:submit>
</s:form>
</p>
</body>
</html>