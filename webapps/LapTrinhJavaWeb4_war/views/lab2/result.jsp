<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 12/23/2020
  Time: 3:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thông tin đăng kí</title>
</head>
<body>
<div class="container" style="width: 500px; margin: 0 auto;">
    <h1>Thông tin đăng kí</h1>
    <li>Tên đăng nhập: <b>${username}</b></li>
    <li>Mật khẩu: <b>${password}</b></li>
    <li>Giới tính: <b>${gender}</b></li>
    <li>Tình trạng hôn nhân: <b>${married}</b></li>
    <li>Quốc tịch: <b>${country}</b></li>
    <li>Sở thích: <b>${hobbies}</b></li>
    <li>Ghi chú: <b>${notes}</b></li>
</div>
</body>
</html>
