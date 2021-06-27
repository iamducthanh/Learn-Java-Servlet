<%@ include file="/commons/taglib.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Small Business - Start Bootstrap Template</title>

<!-- Bootstrap core CSS -->
<link
	href="<c:url value = '/template/web/vendor/bootstrap/css/bootstrap.min.css' />"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="<c:url value = '/template/web/css/small-business.css'/>"
	rel="stylesheet">


</head>

<body>
	<%@ include file="/commons/web/header.jsp"%>
	<dec:body/>
	<%@ include file="/commons/web/footer.jsp"%>



	<!-- Bootstrap core JavaScript -->
	<script
		src="<c:url value = '/template/web/vendor/jquery/jquery.min.js'/>"></script>
	<script
		src="<c:url value = '/template/web/vendor/bootstrap/js/bootstrap.bundle.min.js'/>"></script>

</body>

</html>
