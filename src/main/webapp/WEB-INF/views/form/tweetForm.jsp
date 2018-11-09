<%--
  Created by IntelliJ IDEA.
  Tweet: xczappa
  Date: 07.11.18
  Time: 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Tweet</title>
</head>
<body>

<h3>Tweet - dodawnie/edycja</h3>


<form:form action="/tweet/add" method="post" modelAttribute="tweet">

    <form:hidden path="id"/>
    Tytul: <form:input path="title"/><br>
    <form:errors path="title"/><br>
    Text: <form:textarea rows="5" cols="40" path="tweetText"/><br>
    <form:errors path="tweetText"/><br>
    User: <form:select path="user" items="${users}" itemLabel="lastName" itemValue="id"/><br>
    <input type="submit" value="ZAPISZ">
</form:form>



</body>
</html>
