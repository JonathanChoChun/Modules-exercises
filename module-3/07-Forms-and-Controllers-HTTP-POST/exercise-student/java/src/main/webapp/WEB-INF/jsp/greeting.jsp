<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Hello Spring MVC</title>
		<link href="<c:url value="/css/style.css"/>" rel="stylesheet" type="text/css" />
	</head>
	<body>
<%--	<c:param name="name" value="Jon"></c:param>--%>

	<h1>Hello, <c:out value="${param.name}" />!</h1>


	<c:forEach items="${reviews}" var="review">
		<div class="review">
		<h3><c:out value="${review.title} (${review.username})"></c:out></h3><br>
		<c:out value="${review.dateSubmitted}"></c:out><br><br>
			<div class="rating">
				<c:set value="${review.rating}" var="rating"></c:set>
				<c:set value="${5-rating}" var="remainingStars"></c:set>
				<c:forEach var="i" begin="1" end="${rating}" >
					<span class="filled">&#9734;</span>
				</c:forEach>

				<c:forEach var="i" begin="1" end="${remainingStars}" >
					<span>&#9734;</span>
				</c:forEach>
			</div>
		<c:out value="${review.text}"></c:out><br><br>
		</div>
	</c:forEach>
	</body>
</html>