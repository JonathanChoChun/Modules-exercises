<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Hello Spring MVC</title>
	</head>
	<body>
<%--		<c:param name="name" value="Learner"></c:param>--%>
<%----%>
		<h1>Hello, <c:out value="${param.name}" />!</h1>
	</body>
</html>