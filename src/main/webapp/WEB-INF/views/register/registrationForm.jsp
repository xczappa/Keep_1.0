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

<h1>rejestracja</h1>


<form:form method="post" modelAttribute="registrationDto">


    Login: <form:input path="login"/><br>
    Email: <form:input path="email"/><br>
    Password: <form:password path="password"/><br>
    Powtorz pass: <form:password path="passwordRepeat"/><br>
    <form:errors path="password"/><br>
    <input type="submit" value="zaloguj sie">
</form:form>

</body>
</html>
