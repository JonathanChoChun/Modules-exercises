<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="title" value="Favorite Season" />
</c:import>

<form method="POST" action="<c:url value="/FavoriteThings/Page3"></c:url> ">
	<h3>What is your favorite season?</h3>
	<div class="block-choice">
		<div class="selection">
			<input type="radio" name="favoriteSeason" id="Spring" value="Spring">
			<label for="Spring">Spring</label>
		</div>
		<div class="selection">
			<input type="radio" name="favoriteSeason" id="Summer" value="Summer">
			<label for="Summer">Summer</label>
		</div>
		<div class="selection">
			<input type="radio" name="favoriteSeason" id="Fall" value="Fall">
				<label for="Fall">Fall</label>
		</div>
		<div class="selection">
			<input type="radio" name="favoriteSeason" id="Winter" value="Winter">
			<label for="Winter">Winter</label>
		</div>
	</div>

	<button type="submit">Next >>></button>
</form>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />