<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body bgcolor="wheat">
<%@include file="Header.jsp"%>
<br><br><br><br><br><br><br><br><br>

<div id="content">
<s:form action="login">
	<table bgcolor="#DBA901" align="right">
		<tr>
			<td><s:textfield name="userId" label="USER ID" /></td>
		</tr>
		<tr>
			<td><s:password name="password" label="PASSWORD" /></td>
		</tr>
		<tr>
			<td><s:submit value="Sign In"></s:submit></td>
		</tr>
		<tr><td>Not a memeber yet?<a href="Registration.jsp">Register Here</a></td></tr>
	</table>
	
</s:form>
</div>
<br><br><br><br><br><br>
<%@include file="Footer.jsp"%>
</body>
</html>