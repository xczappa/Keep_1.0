<%--
  Created by IntelliJ IDEA.
  User: xczappa
  Date: 09.11.18
  Time: 14:00
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Form</title>
</head>
<body>
<br>
<div align="center">
<h2>Zaloguj się</h2>


<form:form method="post" modelAttribute="loginDto">
    Login: <form:input path="login"/><br>
    Password: <form:password path="password"/><br>
    <br>
    <input type="submit" value="Zaloguj się">
</form:form>
    <br>
    <a href="registration"> Nie masz konta? Zarejestruj się </a>

</div>
</body>
</html>
