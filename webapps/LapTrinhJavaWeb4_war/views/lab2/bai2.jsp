<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 12/22/2020
  Time: 11:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Đăng kí</title>
</head>
<body>
<div class="container" style="margin: 0 auto; width: 300px; height: 500px;">
    <form action="dang-ki" method="post">
        <h1>Đăng ký</h1>
        Tên đăng nhập: <input type="text" style="margin-left: 20px;" name="username"> <br> <br>
        Mật khẩu: <input type="text" style="margin-left: 54px;" name="password"> <br> <br>
        Giới tính: <input type="radio" name="gender" style="margin-left: 60px;" value="Nam">Nam <input type="radio"
                                                                                                       name="gender" value="Nữ">Nữ <br>
        <br>
        <input type="checkbox" style="margin-left: 124px;" name="married"> Đã có gia đình <br> <br>
        Quốc tịch: <select name="country" style="margin-left: 52px;">
        <option value="Việt Nam">Việt Nam</option>
        <option value="Mỹ">Mỹ</option>
        <option value="Hàn Quốc">Hàn Quốc</option>
    </select> <br> <br>
        Sở thích: <input type="checkbox" style="margin-left: 62px;" name="hobbies" value="Đọc sách"> Đọc sách
        <input type="checkbox" name="hobbies" value="Du lịch"> Du lịch
        <input type="checkbox" style="margin-left: 124px;" name="hobbies" value="Âm nhạc"> Âm nhạc
        <input type="checkbox" name="hobbies" value="Khác"> Khác <br> <br>
        Ghi chú: <br> <textarea name="notes" id="" cols="30" rows="5"
                                style="margin-left: 110px; width: 180px; margin-top: -15px;"></textarea>
        <hr>
        <button>Đăng kí</button>
    </form>
</div>
</body>
</html>
