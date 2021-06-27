<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tam giác</title>
</head>
<body>
<h1>TAM GIÁC</h1>
<form action="lab2-bai1" method="post">
    <input type="text" name="a" placeholder="Cạnh a" style="margin-bottom: 10px;"> <br>
    <input type="text" name="b" placeholder="Cạnh b" style="margin-bottom: 10px;"><br>
    <input type="text" name="c" placeholder="Cạnh c" style="margin-bottom: 10px;"><br>
    <hr>
    <button formaction="/lab2-bai1/chu-vi">Tính chu vi</button>
    <button formaction="/lab2-bai1/dien-tich">Tính diện tích</button>
</form>
<h4>${ketqua}</h4>
</body>
</html>
