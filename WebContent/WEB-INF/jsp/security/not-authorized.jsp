<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<spring:url value="/resources/" var="resources"/>

<html>
<head>
    <jsp:include page="../static/bootstapCFG.jsp"/>
    <link rel="stylesheet" href="${resources}css/style.css">
</head>
<body>
<jsp:include page="../static/header.jsp"/>
<div class="container main">
    <div align="center">
        <h1>You are not authorized!</h1>
        <a class="btn btn-cfg" href="index.po">Back</a>
    </div>
</div>
<jsp:include page="../static/footer.jsp"/>
</body>
</html>