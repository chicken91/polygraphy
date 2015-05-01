<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<spring:url value="/resources/" var="resources"/>

<html lang="en">
    <head>
        <jsp:include page="static/bootstapCFG.jsp" />
        <link rel="stylesheet" href="${resources}css/style.css">
    </head>
    <body>
        <div class="container main">
            <div class="form-main">
                <form class="form-group text-center" role="form">
                    <h3>Please sign in</h3>
                    <input type="text" class="form-control" placeholder="Login" required autofocus>
                    <input type="password" class="form-control" placeholder="Password" required>
                    <input type="password" class="form-control" placeholder="Confirm password" required>
                    <label class="checkbox">
                        <input type="checkbox" value="remember-me"> Remember me
                    </label>
                    <button class="btn btn-color" type="submit">Sign in</button>
                </form>
            </div>
        </div>
    <jsp:include page="static/footer.jsp" />
    </body>
</html>