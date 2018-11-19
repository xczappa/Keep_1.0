<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: xczappa
  Date: 16.11.18
  Time: 10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <link rel="stylesheet" href="/css/style.css">
    <title>Tasks By User</title>
</head>
<body>
<br>
<div align="center" class="menu">
    <table>
        <tr>
            <td width="288px" align="center"><a href="../../task/add"> DODAJ ZADANIE </a></td>
            <td width="288px" align="center"><a href="../../task/main"> STRONA GŁÓWNA </a></td>
            <td width="288px" align="center"><a href="../../category/add"> DODAJ KATEGORIE </a></td>
        </tr>
    </table>
</div>

<br><br>

<table border="1" class="keep" align="center" width="33%">
    <tr align="center" style="background-color: aqua" bgcolor="#a9a9a9">
        <td bgcolor="#a9a9a9">
            zadanie
        </td>
        <td width="15%" bgcolor="#a9a9a9">
            utworzono
        </td>
        <td width="15%" bgcolor="#a9a9a9">
            modyfikowano
        </td>
        <td width="15%" bgcolor="#a9a9a9">
            deadline
        </td>

    </tr>
    <c:forEach items="${tasks}" var="task">


        <tr align="center">
            <td <c:if test="${task.active == false}"> style="text-decoration: line-through"</c:if> <c:if
                    test="${task.past == true}"> style="background-color: palevioletred"</c:if>>
                <a href="../../task/edit/${task.id}">${task.text}</a>
            </td>
            <td>
                    ${task.created}
            </td>
            <td>
                    ${task.updated}
            </td>
            <td>
                    ${task.deadLinee}
            </td>


        </tr>
    </c:forEach>
</table>

</body>
</html>
