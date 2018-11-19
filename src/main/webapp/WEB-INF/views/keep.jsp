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
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head>
    <link rel="stylesheet" href="/css/style.css">
    <title>Home</title>
</head>
<body>
<br>
<div align="center" class="menu">
    <table>
        <tr>
            <td width="288px" align="center"><a href="task/add"> DODAJ ZADANIE </a></td>
            <td width="288px" align="center"><a href="category/add"> DODAJ KATEGORIE </a></td>
        </tr>
    </table>
</div>


<br>
<br>

<c:forEach items="${categories}" var="category">
    <table border="1px" width="33%" align="center" text-align="center" class="keep">
        <tr>
            <th colspan="4" bgcolor="#f0ffff" align="left">
                <a href="category/edit/${category.id}">${category.title}</a>
                <a href="category/delete/${category.id}"><img src="/del.jpg" height="10px"/></a>
            </th>
        </tr>
        <tr>
            <c:forEach items="${category.tasks}" var="task">
            <td width="50px" align="center">
                <a href="task/done/${task.id}"><img src="/checked.png" width="25px" height="25px"></a></td>
            <td width="50px" align="center">
                <a href="task/delete/${task.id}"><img src="/del.jpg" height="20px"/></a></td>
            <td align="center" <c:if test="${task.active == false}"> style="text-decoration: line-through"</c:if> <c:if
                    test="${task.past == true}"> style="background-color: palevioletred"</c:if> ><a
                    href="task/edit/${task.id}">${task.text}</a></td>
                <%-- <td> ${task.priority.title}<br></td> --%>
        </tr>
        </c:forEach>

    </table>
    <br>
    <br>

</c:forEach>
<br>
<br>

<div align="center">
    <h3>Statystyki</h3>

    <table border="1" class="keep" width="20%">
        <tr bgcolor="#a9a9a9" style="text-decoration-style: double" align="center">
            <td width="150px">
                Owner
            </td>
            <td>
                liczba zadań
            </td>
        </tr>

        <tr>
            <c:forEach items="${users}" var="user">
            <td align="center">
                <a href="task/byUser/${user.id}">${user.userName}</a>

            </td>
            <td align="center">
                    ${user.activeTasksCountt}<br>
            </td>
        </tr>
        </c:forEach>


    </table>


    <br><br>

    <table border="1" width="20%" align="center">
        <tr bgcolor="#a9a9a9" style="text-decoration-style: double" align="center">
            <td width="150px">
                Priorytet
            </td>
            <td>
                liczba zadań
            </td>
        </tr>
        <tr align="center">
            <c:forEach items="${priorities}" var="priority">
            <td align="center">
                    ${priority.title}
            </td>
            <td align="center">
                    ${priority.activeTasksCount}
            </td>
        </tr>
        </c:forEach>
    </table>
    <br>


</div>

</body>
</html>
