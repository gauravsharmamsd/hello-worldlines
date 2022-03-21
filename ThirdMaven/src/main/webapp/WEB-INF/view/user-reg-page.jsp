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
<h1 align="center">REGISTER HERE</h1>

<form:form action="reg-success" method="GET" modelAttribute="userReg">
<div align="center">
<label>Name:</label>
<form:input path="name"/>.
<br>
<label>UserName:</label>
<form:input path="userName"/>
<br>
<label>Password:</label>
<form:password path="password"/>
<br>
<label>CountryName</label>
<form:select path="country">
<form:option value="Ind" label="India"></form:option>
<form:option value="USA" label="United State"></form:option>
<form:option value="pak" label="Pakistan"></form:option>
</form:select>
<br>
<label>Hobby:</label>
Cricket:<form:checkbox path="hobbies" value="cricket"/>
Reading:<form:checkbox path="hobbies" value="reading"/>
Studying:<form:checkbox path="hobbies" value="sty"/>


<br>
<label>Gender:</label>
Male:<form:radiobutton path="gender" value="male"/>
Female:<form:radiobutton path="gender" value="female"/>
<br>

<input type="submit" value="register"/>
</div>
</form:form>
</body>
</html>