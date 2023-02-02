<%--
  Created by IntelliJ IDEA.
  User: austinhunt
  Date: 1/30/23
  Time: 4:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Pizza Order Form</title>
</head>
<body>
<h1>Pizza Order Form</h1>
<form action="/pizza-order"  method="post">
    <label for="crust" >Crust Type:</label>
    <select name="crust" id="crust">
        <option value="thin">Thin</option>
        <option value="thick">Thick</option>
        <option value="stuffed">Stuffed</option>
    </select>
    <br>
    <label for="sauce">Sauce Type:</label>
    <select name="sauce" id="sauce">
        <option value="marinara">Marinara</option>
        <option value="alfredo">Alfredo</option>
        <option value="bbq">BBQ</option>
    </select>
    <br>
    <label for="size">Size:</label>
    <select name="size" id="size">
        <option value="small">Small</option>
        <option value="medium">Medium</option>
        <option value="large">Large</option>
    </select>
    <input type="checkbox" id="pepperoni" name="toppings" value="pepperoni"> <label for="pepperoni">Pepperoni</label>
    <input type="checkbox" id="mushrooms" name="toppings" value="mushrooms"> <label for="mushrooms">Mushrooms</label>
    <input type="checkbox" id="black olives" name="toppings" value="black olives"> <label for="black olives">Black Olives</label>
 <label for="address">Deliver to:</label>
    <input type="text" id="address" name="address" />
    <input type="submit" value="Submit">


</form>
</body>
</html>