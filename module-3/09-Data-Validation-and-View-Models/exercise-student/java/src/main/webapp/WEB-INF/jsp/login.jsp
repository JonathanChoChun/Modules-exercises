<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="pageTitle" value="Home Page"/>
<%@include file="common/header.jspf" %>

<h2>New User Registration</h2>

<c:url var="loginFormURL" value="/login"/>
<form:form method="post" action="${loginFormURL}" modelAttribute="login">

    <label for="email">Email</label>
    <form:input path="email" placeholder="enter email"/>
    <form:errors path="email" cssClass="error"/>
    <br>
    <br>
    <label for="password">Password</label>
    <form:input path="password" placeholder="enter password"/>
    <form:errors path="password" cssClass="error"/>

    <input type="submit" value="Submit" >



</form:form>

<%@include file="common/footer.jspf" %>
