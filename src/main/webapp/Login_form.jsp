<%--
  Created by IntelliJ IDEA.
  User: Student
  Date: 8/27/2024
  Time: 2:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action = "test-parameter" method="post"> <%--clien ส่งไปให้server --%>
        User name:<input type="text" name="username"><br>
        Password: <input type="password" name="password">
        <input type="submit"/>
    </form>
</body>
</html>
