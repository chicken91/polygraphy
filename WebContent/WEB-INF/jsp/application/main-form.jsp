<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<spring:url value="/resources/" var="resources"/>

<html>
<head>
    <jsp:include page="../static/bootstapCFG.jsp"/>
    <link rel="stylesheet" href="${resources}css/style.css">
    <script src="${resources}js/application.js"></script>
</head>
<body>
<div class="wrapper">
    <sec:authorize access="isAuthenticated()">
        <jsp:include page="../static/header.jsp"/>
    </sec:authorize>
    <div class="container main-block">
        <div class="form-order">
            <form>
                <div class="h3 text-center">New order</div>
                <div class="form-block">
                    <div class="form-label">
                        <label class="form-element" for="selectName">Name: </label>
                    </div>
                    <div class="form-input">
                        <select class="form-control form-element" id="selectName">
                            <option>Name 1</option>
                            <option>Name 2</option>
                            <option>Name 3</option>
                            <option>Name 4</option>
                            <option>Name 5</option>
                        </select>
                    </div>
                </div>
                <div class="form-block">
                    <div class="form-label">
                        <label class="form-element" for="inputDate">Order date: </label>
                    </div>
                    <div class="form-input">
                        <input type="date" class="form-control form-element" id="inputDate"/>
                    </div>
                </div>
                <div class="form-block">
                    <div class="form-label">
                        <label class="form-element" for="selectClient">Client: </label>
                    </div>
                    <div class="form-input">
                        <select class="form-control form-element" id="selectClient">
                            <option>Client 1</option>
                            <option>Client 2</option>
                            <option>Client 3</option>
                            <option>Client 4</option>
                            <option>Client 5</option>
                        </select>
                    </div>
                </div>
                <div class="form-block">
                    <div class="form-label">
                        <label class="form-element" for="productType">Product type: </label>
                    </div>
                    <div class="form-input">
                        <select class="form-control form-element" id="productType">
                            <option>Type 1</option>
                            <option>Type 2</option>
                            <option>Type 3</option>
                        </select>
                    </div>
                </div>
                <div class="form-block text-center">
                    <button class="btn btn-cfg" type="button" onclick="orders()">Next</button>
                </div>
            </form>
        </div>
    </div>
    <jsp:include page="../static/footer.jsp"/>
</div>
</body>
</html>
