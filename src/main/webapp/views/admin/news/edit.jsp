<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/commont/taglib.jsp" %>
<c:url var="APIurl" value="/api-admin-new"/>
<c:url var="NewURL" value="/admin/new"/>
<html>
<head>
    <title>Chỉnh sửa bài viết</title>
</head>
<body>
<div class="main-content" style="margin-left: 30px;">
    <div class="main-content-inner">
        <div class="breadcrumbs" id="breadcrumbs">
            <ul class="breadcrumb">
                <h3 class="active" style="display: inline-block">Chỉnh sửa bài viết</h3>
                <a href="/admin/new" class="btn btn-primary" style="margin-left: 60%;">Quay lại</a>
            </ul><!-- /.breadcrumb -->
        </div>
        <div class="page-content">
            <div class="row">
                <div class="col-xs-12">
                    <form id="formSubmit">
                        <div class="form-group">
                            <label class="col-sm-3 control-label no-padding-right">Thể loại</label>
                            <div class="col-sm-9">
                                <select class="form-control" id="categoryCode" name="categoryCode">
                                    <option value="">Chọn thể loại</option>
                                    <c:forEach var="categoryItem" items="${category}">
                                        <option value="${categoryItem.id}">${categoryItem.name}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                        <br/>
                        <div class="form-group">
                            <label class="col-sm-3 control-label no-padding-right">Tiêu đề</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" id="title" name="title"
                                       <c:if test="${empty model}">value="" </c:if>
                                       <c:if test="${not empty model}">value="${model.title}" </c:if>
                                />
                            </div>
                        </div>
                        <br/>
                        <div class="form-group">
                            <label class="col-sm-3 control-label no-padding-right">Hình đại diện</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" id="thumbnail" name="thumbnail"
                                       <c:if test="${empty model}">value="" </c:if>
                                       <c:if test="${not empty model}">value="${model.thumbnail}" </c:if>
                                />
                            </div>
                        </div>
                        <br/>
                        <div class="form-group">
                            <label class="col-sm-3 control-label no-padding-right">Mô tả ngắn</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" id="shortDescription" name="shortDescription"
                                       <c:if test="${empty model}">value="" </c:if>
                                       <c:if test="${not empty model}">value="${model.shortDescription}" </c:if>
                                />
                            </div>
                        </div>
                        <br/>
                        <div class="form-group">
                            <label class="col-sm-3 control-label no-padding-right">Nội dung</label>
                            <div class="col-sm-9">
                                <textarea rows="" cols="" id="content" name="content"
                                          style="width: 820px;height: 175px; padding: 0">
                                        <c:if test="${empty model}"></c:if>
                                        <c:if test="${not empty model}">${model.content}</c:if>
                                </textarea>
                            </div>
                        </div>
                        <br/>
                        <input type="hidden" value=${type} id="id" name="type"/>
                        <div class="form-group">
                            <div class="col-sm-12">
                                <c:if test="${type == 'add'}">
                                    <button type="submit" class="btn btn-warning">Thêm bài viết</button>
                                </c:if>
                                <c:if test="${type == 'edit'}">
                                    <button type="submit" class="btn btn-warning">Cập nhật bài viết</button>
                                </c:if>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
