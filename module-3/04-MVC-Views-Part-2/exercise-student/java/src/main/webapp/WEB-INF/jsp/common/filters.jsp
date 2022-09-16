<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Container for Filter Choices
        Each link should take the user to this current page and use any combination of the following
        querystring parameters to filter the page:
        - maxPrice (number)
        - minPrice (number)
        - minRating (number)
        - category (string) - Home, Apparel, Jewelry, Garden

        NOTE: A parameter is passed to this view that is called `baseRoute`. `baseRoute`
        refers to the page that the filters should be associated with. For instance, if you are on the products
        page, the value of the `baseRoute` should be the route for products and on the tiles page, should be the
        route for tiles.
        -->
<div id="filter-options">
	<h3>Refine By</h3>
	<c:url var="Under_25" value="${baseRoute}">
		<c:param name="maxPrice" value="25"></c:param>
	</c:url>
	<c:url var="between_25_50" value="${baseRoute}">
		<c:param name="maxPrice" value="50"></c:param>
		<c:param name="minPrice" value="25"></c:param>
	</c:url>
	<c:url var="above_50" value="${baseRoute}">
		<c:param name="minPrice" value="50"></c:param>
	</c:url>
	<ul>
		<li><a href="${Under_25}">Under $25</a></li>
		<li><a href="${between_25_50}">$25 to $50</a></li>
		<li><a href="${above_50}">$50 &amp; Above</a></li>
	</ul>

	<c:url var="meanRating4" value="${baseRoute}">
		<c:param name="minRating" value="4"></c:param>
	</c:url>
	<c:url var="meanRating3" value="${baseRoute}">
		<c:param name="minRating" value="3"></c:param>
	</c:url>
	<c:url var="meanRating2" value="${baseRoute}">
		<c:param name="minRating" value="2"></c:param>
	</c:url>
	<c:url var="meanRating1" value="${baseRoute}">
		<c:param name="minRating" value="1"></c:param>
	</c:url>
	<p>Avg. Review</p>
	<ul>
		<li>
			<a class="rating" href="${meanRating4}">
				<span class="filled">&#9734;</span>
				<span class="filled">&#9734;</span>
				<span class="filled">&#9734;</span>
				<span class="filled">&#9734;</span>
				<span>&#9734;</span> &amp; Up
			</a>
		</li>
		<li>
			<a class="rating" href="${meanRating3}">
				<span class="filled">&#9734;</span>
				<span class="filled">&#9734;</span>
				<span class="filled">&#9734;</span>
				<span>&#9734;</span>
				<span>&#9734;</span> &amp; Up
			</a>
		</li>
		<li>
			<a class="rating" href="${meanRating2}">
				<span class="filled">&#9734;</span>
				<span class="filled">&#9734;</span>
				<span>&#9734;</span>
				<span>&#9734;</span>
				<span>&#9734;</span> &amp; Up
			</a>
		</li>
		<li>
			<a class="rating" href="${meanRating1}">
				<span class="filled">&#9734;</span>
				<span>&#9734;</span>
				<span>&#9734;</span>
				<span>&#9734;</span>
				<span>&#9734;</span> &amp; Up
			</a>
		</li>
	</ul>
	<p>Category</p>

	<c:url var="homeURL" value="${baseRoute}">
		<c:param name="category" value="Home"></c:param>
	</c:url>
	<c:url var="apparelURL" value="${baseRoute}">
		<c:param name="category" value="Apparel"></c:param>
	</c:url>
	<c:url var="jewelryURL" value="${baseRoute}">
		<c:param name="category" value="Jewelry"></c:param>
	</c:url>
	<c:url var="gardenURL" value="${baseRoute}">
		<c:param name="category" value="Garden"></c:param>
	</c:url>
	<ul>
		<li><a href="${homeURL}">Home</a></li>
		<li><a href="${apparelURL}">Apparel</a></li>
		<li><a href="${jewelryURL}">Jewelry</a></li>
		<li><a href="${gardenURL}">Garden</a></li>
	</ul>
</div>
