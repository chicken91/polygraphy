<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<spring:url value="/resources/" var="resources"/>
<html>
    <head>
        <title>Polygraphy application</title>
    </head>
    <body>
        <p><%=new Date()%></p>
        <h1>Start polygraphy</h1>
    </body>
</html>