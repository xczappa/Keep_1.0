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


..<br>
<br>


<c:forEach items="${categories}" var="category">
    ${category.title}<br>
    <c:forEach items="${category.tasks}" var="task">
        <a href="task/done/${task.id}">v</a> <a href="task/delete/${task.id}">x</a>   <a href="task/edit/${task.id}">${task.text}</a>  ${task.priority.title} ${task.active}<br>
    </c:forEach>
    <br>
</c:forEach>

</body>
</html>
