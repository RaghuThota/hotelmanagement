<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border=1 height=50% width=50%>
<tr>
<th>HOTEL ID</th>
<th>HOTEL NAME</th>
<th>CITY</th>
<th>ADDRESS</th>
<th>DESCRIPTION</th>
<th>PHONE NO1</th>
<th>PHONE NO2</th>
<th>AVG_RATE_PER_NIGHT</th>
<th>RATING</th>
<th>EMAIL</th>
<th>FAX</th>
</tr>
<s:iterator value="session['list']">
<tr>
<td>
<s:property value="hotelId"/>
</td>
<td>
<s:property value="hotelName"/>
</td>
<td>
<s:property value="city"/>
</td>
<td>
<s:property value="address"/>
</td>
<td>
<s:property value="description"/>
</td>
<td>
<s:property value="phoneNo1"/>
</td>
<td>
<s:property value="phoneNo2"/>
</td>
<td>
<s:property value="avg_rate_night"/>
</td>
<td>
<s:property value="rating"/>
</td>
<td>
<s:property value="email"/>
</td>
<td>
<s:property value="fax"/>
</td>
</tr>
</s:iterator>
</table>
</body>
</html>