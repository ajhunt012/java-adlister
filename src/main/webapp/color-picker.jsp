<%--
  Created by IntelliJ IDEA.
  User: austinhunt
  Date: 2/3/23
  Time: 11:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Color Picker</title>
</head>
<body>

<form action="/pick-color" method="post">
  <label for ="color">What's your favorite color?</label>
  <input type="text" id="color" name="color">
  <input type="submit" value="Submit Color">
</form>

</body>
</html>
