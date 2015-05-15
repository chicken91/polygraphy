<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<spring:url value="/resources/" var="resources"/>

<html>
<head>
    <jsp:include page="static/bootstapCFG.jsp" />
    <link rel="stylesheet" href="${resources}css/style.css">
</head>
<body>
<div class="wrapper">
    <jsp:include page="static/header.jsp" />
    <div class="container main-block">
        <div class="form-main">
            <form:form modelAttribute="user" action="startApplication.po" class="form-group text-center"  method="post">
                <h3>Please sign in</h3>
                <form:input path="username" type="text" class="form-control" placeholder="Login"/>
                <form:input path="password" type="password" class="form-control" placeholder="Password"/>
                <form:button class="btn btn-cfg" type="submit">Sign in</form:button>
            </form:form>
        </div>
    </div>
    <jsp:include page="static/footer.jsp" />
</div>
</body>
</html>