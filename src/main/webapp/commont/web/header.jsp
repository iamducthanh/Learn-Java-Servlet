<!-- Navigation -->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
        <a class="navbar-brand" href="#">Start Bootstrap</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="#">Home
                        <span class="sr-only">(current)</span>
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">About</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Services</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Contact</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" id="userDropdown" href="#" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fas fa-user fa-fw"></i>
                        <c:if test="${empty USERMODEL}">Tài khoản</c:if>
                        <c:if test="${not empty USERMODEL}">${USERMODEL.username}</c:if>
                    </a>
                    <div class="dropdown-menu dropdown-menu-right" aria-labelledby="userDropdown">
                        <a class="dropdown-item" href="#">Settings</a>
                        <a class="dropdown-item" href="#">Activity Log</a>
                        <div class="dropdown-divider"></div>
                        <c:if test="${empty USERMODEL}" >
                            <a class="dropdown-item" href="<c:url value="/dang-nhap?action=login"/> ">Đăng nhập</a>
                        </c:if>
                        <c:if test="${not empty USERMODEL && USERMODEL.vaiTro == 'ADMIN'}" >
                            <a class="dropdown-item" href="<c:url value="/admin/trang-chu"/> ">Admin</a>
                        </c:if>
                        <c:if test="${not empty USERMODEL}" >
                            <a class="dropdown-item" href="<c:url value="/dang-nhap?action=logout"/> ">Đăng xuất</a>
                        </c:if>
                    </div>
                </li>
            </ul>
        </div>
    </div>
</nav>