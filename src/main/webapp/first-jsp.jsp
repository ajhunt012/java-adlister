<%--
  Created by IntelliJ IDEA.
  User: jayarredondo
  Date: 1/26/23
  Time: 2:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP TEST</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<%@include file="navbar.jsp"%>
<%!
    String name = "Icon";
    int count = 0;
%>
<h1>Hello from <%= name %></h1>
<h1>15 + 15 =  <%= 15 + 15 %></h1>
<h1>Count: <%= count++ %></h1>

<br>
<br>

<%-- Using JSP Tags --%>
<h1>Welcome, <%= request.getParameter("username") %></h1>

<%-- Using Expression Language --%>
<h1>Welcome ${param.username}</h1>

<% request.setAttribute("color", "purple"); %>
<p style="background-color: ${color}">This is highlighted in purple!</p>

<%@include file="login-form.html"%>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

<p>Color</p>


<%--  Can still use JS  --%>
<script>
    alert("Hello from Javascript!");
</script>
</body>
</html>