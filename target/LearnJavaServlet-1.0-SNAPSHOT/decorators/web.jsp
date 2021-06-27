<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/20/2021
  Time: 10:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@include file="../commont/taglib.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<!-- Bootstrap core CSS -->
<link href="<c:url value='/template/web/vendor/bootstrap/css/bootstrap.min.css' />" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="<c:url value='/template/web/css/shop-homepage.css' />" rel="stylesheet">
<head>
    <title>Title</title>
</head>
<body>
<%--header--%>
<%@include file="../commont/web/header.jsp"%>

<%--container--%>
<div class="container">
    <dec:body/>
</div>

<%--footer--%>
<%@include file="../commont/web/footer.jsp"%>

<!-- Bootstrap core JavaScript -->
<script src="<c:url value= '/template/web/vendor/jquery/jquery.min.js'/>"></script>
<script src="<c:url value='/template/web/vendor/bootstrap/js/bootstrap.bundle.min.js'/>"></script>
</body>
</html>
