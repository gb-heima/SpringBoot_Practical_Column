<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" align="center" width="50%">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Age</th>
    </tr>
    <c:forEach items="${list}" var="user">
        <tr>
            <td>${user.userid}</td>
            <td>${user.username}</td>
            <td>${user.userage}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
