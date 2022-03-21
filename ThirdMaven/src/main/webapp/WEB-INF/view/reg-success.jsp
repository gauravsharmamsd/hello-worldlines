<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ page isELIgnored="false" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>hiiii</h1>
	${data.name}
	
	<br> 
	
	<c:forEach var="temp" items="${data.password}">
	${temp}
	</c:forEach>
	
	<br> ${data.userName }
	<br>

	<c:forEach var="emp" items="${data.hobbies}">
	${emp}
	</c:forEach>
</body>
</html>