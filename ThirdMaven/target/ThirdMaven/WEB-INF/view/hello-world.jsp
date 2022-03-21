<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center"> Gaurav kaushik..</h1><hr><hr>
<!--<form action="process-homepage"  method="get">
<div align="center">
<p>
<label for="yn">
Your name</label>
<input type="text" id="yn" name="userName">
</p>
<p>
<label for="cn">
Crush name</label>
<input type="text" id="cn" name="crushName">
</p>
<input type="submit" value="calculat"></div>
</form>-->
<form:form action="process-homepage"  method="get" modelAttribute="info" >
<div align="center">
<p>
<label for="yn">
Your name</label>
<form:input  id="yn" path="userName"/>
</p>
<p>
<label for="cn">
Crush name</label>
<form:input  id="cn" path="crushName"/>
</p>
<input type="submit" value="calculat"></div>
</form:form>
</body>
</html>