<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Customers List"/>

<%@include file="common/header.jspf"%>

<form method="get" action=<c:url value="/customerSearch"></c:url>>
    <div class="formElement">
        <input type="text" id="nameSearch" name="nameSearch" placeholder="Search"/>
    </div>

    <div class="formElement">
        <label for="sort" >Sort:</label>
        <select id="sort" name="sort">
            <option value="last_name">Last Name</option>
            <option value="first_name">First Name</option>
            <option value="active">Active</option>

        </select>
    </div>
    <div class="formElement">
        <input type="submit" value="Search"/>
    </div>
</form>

<table class="table">
    <tr>
        <th>Name</th>
        <th>Email</th>
        <th>Active</th>

    </tr>
    <c:forEach items="${customers}" var="customer">
        <tr>
            <td><c:out value="${customer.firstName} ${customer.lastName}"/></td>
            <td><c:out value="${customer.email}"/></td>
            <td><c:out value="${customer.active}"/></td>
        </tr>
    </c:forEach>
</table>

<%@include file="common/footer.jspf"%>