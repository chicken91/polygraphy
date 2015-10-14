<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<spring:url value="/resources/" var="resources"/>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Polygraphy application</title>

<link rel="stylesheet" href="${resources}css/bootstrap.css">
<link rel="stylesheet" href="${resources}css/bootstrap-theme.css">
<%--<link rel="stylesheet" href="${resources}css/non-responsive.css">--%>

<script src="${resources}js/jquery-2.1.3.js"></script>
<script src="${resources}js/bootstrap.js"></script>

<c:set var="req" value="${pageContext.request}"/>
<c:set var="url" value="${req.requestURL}"/>
<c:set var="uri" value="${req.requestURI}"/>
<base href="${fn:substring(url, 0, fn:length(url) - fn:length(uri))}${req.contextPath}/">
