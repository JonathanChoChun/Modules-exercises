<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="common/header.jsp">
	<c:param name="title" value="Fibonacci"></c:param>
</c:import>

<nav id="page-options">
	<ul>
		<c:set var="numberOfItems" value="20" />
		<c:url var="fibonacciRoute" value="fibonacci.jsp">
			<c:param value="${ numberOfItems }" name="max" />
		</c:url>
		<li>
			<a href="<c:out value="${ fibonacciRoute }" />"><c:out value="${ numberOfItems }" /></a>
		</li>

		<c:set var="numberOfItems" value="50" />
		<c:url var="fibonacciRoute" value="fibonacci.jsp">
			<c:param value="${ numberOfItems }" name="max" />
		</c:url>
		<li>
			<a href="<c:out value="${ fibonacciRoute }" />"><c:out value="${ numberOfItems }" /></a>
		</li>

		<c:set var="numberOfItems" value="100" />
		<c:url var="fibonacciRoute" value="fibonacci.jsp">
			<c:param value="${ numberOfItems }" name="max" />
		</c:url>
		<li>
			<a href="<c:out value="${ fibonacciRoute }" />"><c:out value="${ numberOfItems }" /></a>
		</li>
	</ul>
</nav>


<c:set var="previousNumber" value="0" />
<c:set var="currentNumber" value="1" />

<ul id="fibonacci">
	<li>${previousNumber}</li>
	<li>${currentNumber}</li>
	<c:forEach var="i" begin="1" end="${ param.max }">
		<c:set var="temp" value="${previousNumber}" />
		<c:set var="previousNumber" value="${currentNumber}" />
		<c:set var="currentNumber" value="${temp+currentNumber}"/>

<%--		<c:out value="${currentNumber}"></c:out>--%>
		<c:if test="${currentNumber <param.max and currentNumber>0}">
			<li>${currentNumber}</li>
		</c:if>
	</c:forEach>
</ul>


<c:import url="common/footer.jsp"></c:import>