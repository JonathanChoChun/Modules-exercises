<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="pageTitle" value="Product Tile View" />
</c:import>

<div id="masonry-page">
	<c:import url="/WEB-INF/jsp/common/filters.jsp">
		<%-- Modify the baseRoute to apply filters to the current route. --%>
		<c:param name="baseRoute" value="/products/tiles" />
	</c:import>

	<!-- Container for all of the Products -->
	<!-- The list of products is available using the `products` variable -->
	<div id="grid" class="main-content">

		<!-- The following HTML shows different examples of what HTML
		 could be rendered based on different rules. For purposes
		 of demonstration we've written it out so you can see it
		 when you load the page up. -->

		<!-- Standard Product -->
		<c:forEach var="product" items="${requestScope.products}">
			<c:set var="topSellerOrSoldOut" value=""></c:set>
			<c:if test="${product.topSeller}">
				<c:set var="topSellerOrSoldOut" value="top-seller"></c:set>
			</c:if>

			<c:if test="${product.remainingStock==0}">
				<c:set var="topSellerOrSoldOut" value="sold-out"></c:set>
			</c:if>
			<div class="tile ${topSellerOrSoldOut} ">
				<c:if test="${product.remainingStock==0}">
				<span class="banner">Sold Out</span>
				</c:if>
				<!-- Link to the Detail page using the product id (e.g. products/detail?id=1) -->
				<a class="product-image" href="<c:url value="/products/detail?id=${product.id}"/>">
					<img src="<c:url value="/images/product-images/${product.imageName}" />" />
				</a>
				<div class="details">
					<p class="name">
						<a href="#">${product.name}</a>
					</p>

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

					<c:if test="${product.topSeller}">
						<br />
						<p class="product-alert">Top Seller</p>
					</c:if>


					<c:if test="${product.remainingStock>0 and product.remainingStock<=5}">
						<span class="product-alert">${product.remainingStock} remaining!</span>
					</c:if>
					<p class="price"><fmt:formatNumber currencySymbol="$" value="${product.price}" type="CURRENCY"/></p>
				</div>
			</div>

		</c:forEach>




	</div>
</div>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />