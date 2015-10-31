<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<spring:url value="/resources/" var="resources"/>

<html>
<head>
    <jsp:include page="../static/bootstapCFG.jsp"/>
    <link rel="stylesheet" href="${resources}css/style.css">
    <script src="${resources}js/userManagement.js"></script>

</head>
<body>
<div class="wrapper">
    <jsp:include page="../static/header.jsp"/>
    <div class="container main-block">

        <div id="table-block">
            <c:url var="dataUrl" value="/UserManagement/getUsersTableData.po"/>
            <table id="userManagementTable" class="table" data-toggle="table" data-url="${dataUrl}" data-method="post"
                   data-cache="false" data-search="true" data-clear-search="true" data-search-align="left"
                   data-pagination="true" data-sort-order="desc">
                <thead>
                <tr>
                    <th data-field="name" data-align="center" data-sortable="true" data-width="200">
                        Пользователь
                    </th>
                    <th data-field="email" data-align="center" data-width="200">
                        Email
                    </th>
                    <th data-field="role" data-align="center" data-width="200">
                        Роль
                    </th>
                </tr>
                </thead>
            </table>
        </div>


        <div class="modal" id="userManagementModal">
            <div class="modal-dialog" style="width: 400px">
                <div class="modal-content">
                    <div class="modal-header modal-header-info">
                        Хедер
                    </div>
                    <div class="modal-body" id="modal-body-text">
                        <div class="form-user-management">
                            <form class="form-group text-center">
                                <div class="h3 text-center">Информация</div>
                                <div class="form-block">
                                    <div class="form-label">
                                        <label class="form-element" for="modal-login-input">Логин </label>
                                    </div>
                                    <div class="form-input">
                                        <input type="text" class="form-control form-element" id="modal-login-input"/>
                                    </div>
                                </div>
                                <div class="form-block">
                                    <div class="form-label">
                                        <label class="form-element" for="modal-email-input">Email </label>
                                    </div>
                                    <div class="form-input">
                                        <input type="text" class="form-control form-element" id="modal-email-input"/>
                                    </div>
                                </div>
                                <div class="form-block">
                                    <div class="form-label">
                                        <label class="form-element" for="modal-role-input">Роль </label>
                                    </div>
                                    <div class="form-input">
                                        <select class="form-control form-element" id="modal-role-input">
                                            <c:forEach items="${RolesList}" var="role">
                                                <option>${role}</option>
                                            </c:forEach>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-block">
                                    <div class="form-label">
                                        <label class="form-element" for="modal-password-input">Новый пароль </label>
                                    </div>
                                    <div class="form-input">
                                        <input type="password" class="form-control form-element" id="modal-password-input"/>
                                    </div>
                                </div>
                                <div class="form-block" style="margin-top: 50px">
                                    <div class="form-label">
                                        <label class="form-element" for="modal-admin-password-input">Ваш пароль </label>
                                    </div>
                                    <div class="form-input">
                                        <input type="password" class="form-control form-element" id="modal-admin-password-input"/>
                                    </div>
                                </div>
                                <div class="form-block text-center">
                                    <button class="btn btn-cfg" type="button" onclick="editUser()">Изменить</button>
                                </div>
                            </form>
                        </div>
                    </div>
                    <div class="modal-footer">
                        Футер
                    </div>
                </div>
            </div>
        </div>

    </div>
    <jsp:include page="../static/footer.jsp"/>
</div>
</body>
</html>

