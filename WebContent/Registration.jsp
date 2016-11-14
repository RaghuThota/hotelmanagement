<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
<script type="text/javascript" src="validation.js"></script>

<%@include file="Header.jsp"%>

<body background="img.jpg">

		<h1><font color="'blue">Rgistration Form....</font></h1>
		

<s:form action="register">
	<table bgcolor="" align="center">
		<tr>
			<td><s:textfield name="userName" label="USERNAME" id='employname' onkeyup="return isName()"></s:textfield>
			</td>
			<td id='nameErr'></td>
		</tr>
		<tr>
			<td><s:password name="password" label="PASSWORD" id='password' onkeyup="return isPassword()"></s:password></td>
		<td id='passwordErr'></td></tr>
		<tr>
			<td><s:textfield name="email" label="EMAIL" id='email' onkeyup="return isEmail()"></s:textfield></td>
	<td id='emailErr'></td>
		</tr>
		<tr>
			<td><s:textfield name="address" label="ADDRESS"  id='address' onkeyup="return isAddress()"></s:textfield></td>
			<td id='addressErr'></td></tr>
		<tr>
			<td><s:select name="role" label="ROLE"
				list="{'Customer','Employee'}"></s:select></td>
		</tr>
		<tr>
			<td><s:textfield name="phNo" label="PHONE NO" id='phone' onkeyup="return isPhone()"></s:textfield></td>
		<td id='phoneErr'></td>
		</tr>
		<tr>
			<td><s:textfield name="mobNo" label="MOBILE NO"></s:textfield></td>
		</tr>
		<tr>
			<td><s:submit value="REGISTER"></s:submit></td>
		</tr>

	</table>
</s:form>
</body>
</html>