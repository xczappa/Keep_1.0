<%--
  Created by IntelliJ IDEA.
  User: xczappa
  Date: 07.11.18
  Time: 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>User</title>
</head>
<body>

<h3>User - dodawnie/edycja</h3>


<form:form action="/user/add" method="post" modelAttribute="user">

    <form:hidden path="id"/>
    Imię: <form:input path="firstName"/><br>
    <form:errors path="firstName"/><br>
    Nazwisko: <form:input path="lastName"/><br>
    <form:errors path="lastName"/><br>
    Email: <form:input path="email"/><br>
    <form:errors path="email"/><br>
    <input type="submit" value="ZAPISZ">
</form:form>



</body>
</html>
