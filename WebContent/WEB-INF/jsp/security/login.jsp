<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<spring:url value="/resources/" var="resources"/>

<html>
<head>
    <jsp:include page="../static/bootstapCFG.jsp"/>
    <link rel="stylesheet" href="${resources}css/style.css">
</head>
<body>
<div class="wrapper">
    <div class="container main-block">
        <div class="form-main">
            <form action="<c:url value="/j_spring_security_check"/>" class="form-group text-center" method="POST">
                <h3>Please sign in</h3>
                <input type="text" name='j_username' class="form-control" placeholder="Login"/>
                <input type="password" name='j_password' class="form-control" placeholder="Password"/>
                <button class="btn btn-cfg" type="submit">Sign in</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>