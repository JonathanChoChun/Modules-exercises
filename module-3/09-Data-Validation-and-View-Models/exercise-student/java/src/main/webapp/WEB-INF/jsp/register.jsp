<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="pageTitle" value="Home Page"/>
<%@include file="common/header.jspf" %>

<h2>New User Registration</h2>

<c:url var="registrationFormURL" value="/register"/>
<form:form method="post" action="${registrationFormURL}" modelAttribute="registration">

    <label for="firstName">First Name</label>
    <form:input path="firstName" placeholder="enter first name"/>
    <form:errors path="firstName" cssClass="error"/>
    <br>
    <br>
    <label for="lastName">Last Name</label>
    <form:input path="lastName" placeholder="enter last name"/>
    <form:errors path="lastName" cssClass="error"/>
    <br>
    <br>
    <label for="email">Email</label>
    <form:input path="email" placeholder="enter email"/>
    <form:errors path="email" cssClass="error"/>
    <br>
    <br>
    <label for="confirmEmail">Confirm Email</label>
    <form:input path="confirmEmail" placeholder="confirm email address"/>
    <form:errors path="emailMatching" cssClass="error"/>
    <br>
    <br>
    <label for="password">Password</label>
    <form:input path="password" placeholder="enter password"/>
    <form:errors path="password" cssClass="error"/>
    <br>
    <br>
    <label for="confirmPassword">Confirm password</label>
    <form:input path="confirmPassword"  placeholder="confirm password"/>
    <form:errors path="passwordMatching" cssClass="error"/>
    <br>
    <br>
    <label for="birthday">Birthday</label>
    <form:input path="birthday"  placeholder="enter birth date"/>
    <form:errors path="birthday" cssClass="error"/>
    <br>
    <br>
    <label for="numberOfTickets"># of Tickets</label>
    <form:input path="numberOfTickets"  placeholder="enter number of tickets"/>
    <form:errors path="numberOfTickets" cssClass="error"/>
    <br>
    <br>
    <input type="submit" value="Submit" >



</form:form>

<%@include file="common/footer.jspf" %>
