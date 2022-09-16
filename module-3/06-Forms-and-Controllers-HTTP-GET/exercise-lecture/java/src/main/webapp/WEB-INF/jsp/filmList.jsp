<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Films List"/>

<%@include file="common/header.jspf"%>
<table>
    <tr>
        <th>Title</th>
    </tr>
    <c:forEach items="${films}" var="film">
        <tr>
            <td>
                <c:out value="${film.title}"/>
            </td>
        </tr>
    </c:forEach>
</table>
<%@include file="common/footer.jspf"%>