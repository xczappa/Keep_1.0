<%--
  Created by IntelliJ IDEA.
  User: xczappa
  Date: 06.11.18
  Time: 11:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>User</title>
</head>
<body>

<h3> Users - lista </h3>
<a href="/user/add">Dodaj nowego USERA</a><br><br>

<table border="3">
    <tr>
        <td>Imie</td>
        <td>Nazwisko</td>
        <td>Email</td>
        <td>Akcja</td>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.firstName}</td>
            <td> ${user.lastName}</td>
            <td> ${user.email} </td>
            <td><a href="/user/delete/${user.id}">usuń</a> <a href="/user/edit/${user.id}">edytuj</a></td>
        </tr>
    </c:forEach>
</table>

<br><br>

<a href="/tweet/all">>> Tweets <<</a>


</body>
</html>
