<%@include file="../commont/taglib.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><dec:title default="Trang chủ"/></title>
    <link href="../template/admin/dist/css/styles.css" rel="stylesheet"/>
    <link href="../template/admin/dist/css/cbbsapxep.css" rel="stylesheet"/>
    <link href="https://cdn.datatables.net/1.10.20/css/dataTables.bootstrap4.min.css" rel="stylesheet"
          crossorigin="anonymous"/>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/js/all.min.js"
            crossorigin="anonymous"></script>

</head>
<body>
<%@include file="/commont/admin/header.jsp" %>

<div id="layoutSidenav">
    <%@include file="/commont/admin/menu.jsp" %>
    <div id="layoutSidenav_content">
        <dec:body/>
        <%@include file="/commont/admin/footer.jsp" %>
    </div>
</div>


<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
        crossorigin="anonymous"></script>
<script src="../template/admin/dist/js/scripts.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/    Chart.js/2.8.0/Chart.min.js" crossorigin="anonymous"></script>
<script src="../template/admin/dist/assets/demo/chart-area-demo.js"></script>
<script src="../template/admin/dist/assets/demo/chart-bar-demo.js"></script>
<script src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js" crossorigin="anonymous"></script>
<script src="https://cdn.datatables.net/1.10.20/js/dataTables.bootstrap4.min.js" crossorigin="anonymous"></script>
<script src="../template/admin/dist/assets/demo/datatables-demo.js"></script>
</body>
</html>
