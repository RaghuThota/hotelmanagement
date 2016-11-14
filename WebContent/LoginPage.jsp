<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>

<script type="text/javascript" src="validation.js"></script>
</head>
<body background="img.jpg">
<%@include file="Header.jsp"%>
<br><br><br><br><br><br><br><br><br>

<div id="content">
<s:form action="login">
<h1 align="center"><font color="blue">Login Form.......</font></h1>
	<table  align="center">
	
		<tr>
			<td><s:textfield name="userId" label="USER ID" id='userid' onkeyup="return isUserid()" /></td>
			<td id='useridErr'></td></tr>
		<tr>
			<td><s:password name="password" label="PASSWORD" id='lpassword' onkeyup="return isLoginPassword()" /></td>
		<td id='lpasswordErr'></td></tr>
		<tr>
			<td><s:submit value="Sign In"></s:submit></td>
		</tr>
		<tr><td>Not a member yet?<a href="Registration.jsp">Register Here</a></td></tr>
	</table>
	
</s:form>
</div>
<br><br><br><br><br><br>
<!--<%@include file="Footer.jsp"%>-->
</body>
</html>