<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/24/2021
  Time: 3:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@include file="/commont/taglib.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Danh sách bài viết</title>
</head>
<body>
<main>
    <div class="container-fluid">
        <h1 class="mt-4" name="thanh">Dashboard</h1>
        <a class="breadcrumb mb-4" href="<c:url value="/admin/new?sort=asc"/> ">
            <li class="breadcrumb-item active">Dashboard</li>
        </a>

        <div class="card mb-4">
            <div class="card-header">
                <i class="fas fa-table mr-1"></i>
                DataTable Example
            </div>
            <div class="card-body">
                <div id="app-cover" style="z-index: 1">
                    <div id="select-box">
                        <input type="checkbox" id="options-view-button"/>
                        <div id="select-button" class="brd">
                            <div id="selected-value" style="margin-bottom: 20px">
                                <span class="sortCbb">Sắp xếp theo</span>
                            </div>
                        </div>
                        <div id="options">
                            <div class="option">
                                <input
                                        type="radio"
                                        class="s-c top"
                                        name="platform"
                                        value="codepen"
                                />
                                <input
                                        type="radio"
                                        class="s-c bottom"
                                        name="platform"
                                        value="codepen"
                                />
                                <span class="label">Sắp xếp theo</span>
                                <span class="opt-val">Sắp xếp theo</span>
                            </div>
                            <div class="option">
                                <input
                                        type="radio"
                                        class="s-c top"
                                        name="platform"
                                        value="dribbble"
                                />
                                <input
                                        type="radio"
                                        class="s-c bottom"
                                        name="platform"
                                        value="dribbble"
                                />
                                <span class="label">Giá tăng dần</span>
                                <span class="opt-val">Giá tăng dần</span>
                            </div>
                            <div class="option">
                                <input
                                        type="radio"
                                        class="s-c top"
                                        name="platform"
                                        value="behance"
                                />
                                <input
                                        type="radio"
                                        class="s-c bottom"
                                        name="platform"
                                        value="behance"
                                />
                                <span class="label">Giá giảm dần</span>
                                <span class="opt-val">Giá giảm dần</span>
                            </div>
                            <div id="option-bg"></div>
                        </div>
                    </div>
                </div>
                <div class="table-responsive">
                    <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                        <thead>
                        <tr>
                            <th>Tiêu đề</th>
                            <th>Mô tả ngắn</th>
                            <th>Hình ảnh nhỏ</th>
                        </tr>
                        </thead>
                        <tfoot>
                        <tr>
                        <tr>
                            <th>Tiêu đề</th>
                            <th>Mô tả ngắn</th>
                            <th>Hình ảnh nhỏ</th>
                        </tr>
                        </tr>
                        </tfoot>
                        <tbody>
                        <c:forEach var="newItem" items="${model}">
                            <tr>
                                <td>${newItem.title}</td>
                                <td>${newItem.shortDescription}</td>
                                <td style="width: 100px;"><img src="${newItem.thumbnail}"
                                                               style="width: 50px; height: 50px"/></td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</main>
<script>
    const closeCbb = (sort) => {
        document.getElementById('options-view-button').checked = false;
        if(sort == null){
            window.location = `new`;
        } else {
            window.location = "new?sort=" + sort;
        }

    }
    document.getElementsByClassName('option')[0].onclick = closeCbb.bind(this, null);
    document.getElementsByClassName('option')[1].onclick = closeCbb.bind(this, "asc");
    document.getElementsByClassName('option')[2].onclick = closeCbb.bind(this,"desc");
</script>
</body>
</html>
