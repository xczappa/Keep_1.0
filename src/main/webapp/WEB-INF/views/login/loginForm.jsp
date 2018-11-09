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

<h1>Logowanie</h1>


<form:form method="post" modelAttribute="loginDto">


    Login: <form:input path="login"/><br>
    Password: <form:password path="password"/><br>
    <input type="submit" value="zaloguj sie">
</form:form>

</body>
</html>
