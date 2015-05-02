<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<spring:url value="/resources/" var="resources"/>

<html>
<head>
    <jsp:include page="../static/bootstapCFG.jsp" />
    <link rel="stylesheet" href="${resources}css/style.css">
</head>
<body>
    <div class="wrapper">
        <jsp:include page="../static/header.jsp" />
        <div class="container main-block">
            <div class="form-order">
                <form class="form-horizontal">
                    <div class="h3 text-center">New order</div>
                    <div class="form-group">
                        <label class="col-xs-3 control-label" for="selectName">Name: </label>
                        <div class="col-xs-9">
                            <select class="form-control" id="selectName">
                                <option>Name 1</option>
                                <option>Name 2</option>
                                <option>Name 3</option>
                                <option>Name 4</option>
                                <option>Name 5</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-xs-3 control-label" for="inputDate">Order date: </label>
                        <div class="col-xs-9">
                            <input type="date" class="form-control" id="inputDate"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-xs-3 control-label" for="selectClient">Client: </label>
                        <div class="col-xs-9">
                            <select class="form-control col-xs-10" id="selectClient">
                                <option>Client 1</option>
                                <option>Client 2</option>
                                <option>Client 3</option>
                                <option>Client 4</option>
                                <option>Client 5</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-xs-3 control-label" for="productType">Product type: </label>
                        <div class="col-xs-9">
                            <select class="form-control" id="productType">
                                <option>Type 1</option>
                                <option>Type 2</option>
                                <option>Type 3</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group text-center">
                        <button class="btn btn-cfg" type="submit">Next</button>
                    </div>
                </form>
            </div>
        </div>
        <jsp:include page="../static/footer.jsp" />
    </div>
</body>
</html>
