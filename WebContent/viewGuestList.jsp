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
<th>CustomerId</th>
<th>Customer Name</th>
<th>Address</th>
<th>Mobile Number</th>
<th>Phone Number</th>
<th>Email</th>
</tr>
<s:iterator value="session['list']">
<tr>
<td>
<s:property value="userId"/>
</td>
<td>
<s:property value="userName"/>
</td>
<td>
<s:property value="address"/>
</td>
<td>
<s:property value="mobNo"/>
</td>
<td>
<s:property value="phNo"/>
</td>
<td>
<s:property value="email"/>
</td>
</tr>
</s:iterator>
</table>
</body>
</html>