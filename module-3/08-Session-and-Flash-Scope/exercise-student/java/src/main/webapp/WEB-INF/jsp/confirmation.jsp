<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="title" value="Favorite Summary" />
</c:import>

<h3>Favorite Color: </h3>${sessionScope.favoriteThing.favoriteColor}<br>
<h3>Favorite Food: </h3>${sessionScope.favoriteThing.favoriteFood}<br>
<h3>Favorite Season: </h3>${sessionScope.favoriteThing.favoriteSeason}<br>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />