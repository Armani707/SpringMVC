<%--
  Created by IntelliJ IDEA.
  User: lukas
  Date: 12.05.2023
  Time: 21:35
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${peopleuser}" var="peoples">
    <tr>
        <th>${peoples.name}</th>
        <th>${peoples.id}</th>
        <th>${peoples.age}</th>

    </tr>
</c:forEach>
</body>
</html>
