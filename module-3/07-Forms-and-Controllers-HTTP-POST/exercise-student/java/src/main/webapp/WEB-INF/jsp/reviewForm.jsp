<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Student
  Date: 8/30/2022
  Time: 12:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Review Submit Form</title>
</head>
<body>

<h1>Fill the review form below</h1>
<form method="post" action=<c:url value="/reviewInput"></c:url>>
    <label for="username"><strong>Username:</strong></label>
    <input type="text" id="username" name="username" required><br><br>

    <p><strong>Rating(1-5 stars):</strong></p>
    <input type="radio" id="one" name="rating" value="1" required>
    <label for="one">1</label><br>
    <input type="radio" id="two" name="rating" value="2">
    <label for="two">2</label><br>
    <input type="radio" id="three" name="rating" value="3">
    <label for="three">3</label><br>
    <input type="radio" id="four" name="rating" value="4">
    <label for="four">4</label><br>
    <input type="radio" id="five" name="rating" value="5">
    <label for="five">5</label><br>
    <br>
    <label for="title"><p><strong>Title:</strong></p></label>
    <input type="text" id="title" name="title" required><br><br>
    <p><label for="text"><strong>Review text:</strong></label></p>
    <textarea id="text" name="text" rows="4" cols="50"></textarea>
    <br><br><br>
    <input type="submit" value="Submit" />

</form>

</body>
</html>
