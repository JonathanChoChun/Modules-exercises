<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="pageTitle" value="Product Details" />
</c:import>

<!-- Container for the Product -->
<!-- The current product is available using the `product` variable -->
<div id="product-detail">
	<img src="<c:url value="/images/product-images/${product.imageName}" />" />
	<div class="product-description">
		<h3>${product.name}</h3>

		<!-- .filled will make the star solid -->
		<div class="rating">
			<c:set value="${product.averageRating.intValue()}" var="rating"></c:set>
			<c:set value="${5-rating}" var="remainingStars"></c:set>
			<c:forEach var="i" begin="1" end="${rating}" >
				<span class="filled">&#9734;</span>
			</c:forEach>

			<c:forEach var="i" begin="1" end="${remainingStars}" >
				<span>&#9734;</span>
			</c:forEach>

		</div>

		<!-- Include this if the product has a Remaining Stock of 5 or less -->
		<c:if test="${requestScope.product.remainingStock>0 and requestScope.product.remainingStock<=5}">
		<p class="alert-remaining">BUY NOW! Only ${requestScope.product.remainingStock} left!</p>
		</c:if>
		<p class="description"> ${requestScope.product.description}</p>
		<p class="price"><fmt:formatNumber currencySymbol="$" value="${product.price}" type="CURRENCY"/></p>

		<!-- If item is in stock -->
		<c:if test="${requestScope.product.remainingStock>0}">
			<button class="action">Add to Cart</button>
		</c:if>
		<c:if test="${requestScope.product.remainingStock==0}">
			<button disabled>Sold Out</button>
		</c:if>
	</div>
</div>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />