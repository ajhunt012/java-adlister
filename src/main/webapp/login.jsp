<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: austinhunt
  Date: 1/30/23
  Time: 11:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="login.jsp" method="post">
    <label>Username:</label>
    <input type="text" name="username" /><br><br>
    <label>Password:</label>
    <input type="password" name="password" /><br><br>
    <input type="submit" value="Submit">
</form>

<form>
<%
String username = request.getParameter("username");
String password = request.getParameter("password");

if (username != null && username.equals("admin") && password != null && password.equals("password")) {
response.sendRedirect("profile.jsp");
} else {
}
%>
</form>


</body>
</html>
