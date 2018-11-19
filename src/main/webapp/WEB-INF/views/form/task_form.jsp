<%--
  Created by IntelliJ IDEA.
  Task: xczappa
  Date: 07.11.18
  Time: 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Task Form</title>
</head>
<body>

<h3>Dodawanie/edycja ZADANIA</h3>

<form:form action="/app/task/add" method="post" modelAttribute="task">

    <form:hidden path="id"/>
    <form:hidden path="created"/>
    <form:hidden path="active"/>
    <form:hidden path="completed"/>
    Wybierz kategorie: <form:select path="category" items="${categoriez}" itemLabel="title" itemValue="id"/><br><br>
    Treść: <form:textarea cols="99" rows="1" path="text"/><br>
    <form:errors path="text"/><br>
    Wybierz ownera: <form:select path="user" items="${userz}" itemValue="id" itemLabel="userName"/><br><br>
    Określ priorytet: <form:select path="priority" items="${priorytiz}" itemLabel="title" itemValue="id"/><br><br>
    Deadline: <form:input type="date" path="deadLinee"/><br><br>
    <br>
    <input type="submit" value="ZAPISZ">

</form:form>

</body>
</html>
