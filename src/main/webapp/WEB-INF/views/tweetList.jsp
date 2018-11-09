<%--
  Created by IntelliJ IDEA.
  Tweet: xczappa
  Date: 06.11.18
  Time: 11:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Tweet</title>
</head>
<body>

<h3> Tweets - lista </h3>
<a href="/tweet/add">Dodaj nowego TWEETA</a><br><br>

<table border="3">
    <tr>

        <td>Tytul</td>
        <td>Text</td>
        <td>User</td>

    </tr>
    <c:forEach items="${tweets}" var="tweet">
        <tr>
            <td>${tweet.title}</td>
            <td> ${tweet.tweetText}</td>
            <td> ${tweet.user.lastName} </td>

        </tr>
    </c:forEach>
</table>

<br><br>
<a href="/user/all">>> Users <<</a>



</body>
</html>
