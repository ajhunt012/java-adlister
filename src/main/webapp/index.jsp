<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><%= "some title" %></title>
</head>
<body>
    <c:if test="true">
        <h1>Variable names should be very descriptive</h1>
    </c:if>
    <c:if test="false">
        <h1>single letter variable names are good</h1>
    </c:if>
<div class="container">
    <h1>Here is where the Ads go!</h1>

    <c:forEach var="ad" items="${ads}">

        <div>
    <h2><c:out value = "${ad.title}" /></h2>
    <p><c:out value = "${ad.description}" /></p>
        </div>
    </c:forEach>

</div>
</body>
</html>
