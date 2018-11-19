<%--
  Created by IntelliJ IDEA.
  Category: xczappa
  Date: 07.11.18
  Time: 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="../css/bootstrap.min.css">
<script src="../js/bootstrap.min.js"></script>

<html>
<head>
    <title>Category Form</title>
</head>
<body>

<h3>Dodawanie/edycja KATEGORII</h3>


<form:form action="/app/category/add" method="post" modelAttribute="category">

    <form:hidden path="id"/>
    Tytuł: <form:input path="title"/><br>
    <form:errors path="title"/><br>
    <input type="submit" value="ZAPISZ">
</form:form>



</body>
</html>
