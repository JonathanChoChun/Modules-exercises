<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Films List"/>

<%@include file="common/header.jspf"%>


<form method="get" action=<c:url value="/filmSearch"></c:url>>
    <div class="formElement">
    <label for="minLength" >Minimum Length:</label>
    <input type="number" id="minLength" name="minLength" placeholder="Enter a number"/>
    </div>

    <div class="formElement">
    <label for="maxLength" >Maximum Length:</label>
    <input type="number" id="maxLength" name="maxLength" placeholder="Enter a number"/>
    </div>
    <div class="formElement">
    <label for="genre" >Genre:</label>
    <select id="genre" name="genre">
        <c:forEach var="genre" items="${genres}">
            <option value="${genre}">${genre}</option>
        </c:forEach>
    </select>
    </div>
    <div class="formElement">
    <input type="submit" value="Search"/>
    </div>
</form>

<table class="table">
<tr>
    <th>Title</th>
    <th>Description</th>
    <th>Release Year</th>
    <th>Length</th>
    <th>Rating</th>

</tr>
<c:forEach items="${films}" var="film">
    <tr>
        <td><c:out value="${film.title}"/></td>
        <td><c:out value="${film.description}"/></td>
        <td><c:out value="${film.releaseYear}"/></td>
        <td><c:out value="${film.length}"/></td>
        <td><c:out value="${film.rating}"/></td>
    </tr>
</c:forEach>
</table>


<%@include file="common/footer.jspf"%>