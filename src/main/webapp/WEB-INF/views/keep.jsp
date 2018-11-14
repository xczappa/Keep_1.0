<%--
  Created by IntelliJ IDEA.
  User: xczappa
  Date: 13.11.18
  Time: 11:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Home</title>
</head>
<body>

<a href="task/add"> Dodaj nowe zadanie </a><br>
<a href="category/add"> Dodaj nową kategorie zadań </a><br>


<br>
<br>


<c:forEach items="${categories}" var="category">
    <table border="1" width="33%">
        <tr>
            <th colspan="2">
                <a href="category/edit/${category.id}">${category.title}</a><br>
            </th>
        </tr>
        <tr>
            <c:forEach items="${category.tasks}" var="task">
                <td width="20px" bgcolor="aqua">
                    <a href="task/done/${task.id}">v</a> <a href="task/delete/${task.id}">x</a> </td><td>  <a href="task/edit/${task.id}">${task.text}</a>  ${task.priority.title} ${task.active}<br></td>
                </tr>
            </c:forEach>

    </table>
    <br>
    <br>
</c:forEach>

</body>
</html>
