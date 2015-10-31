<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<div class="container main-header">
    <nav class="navbar navbar-default" role="navigation" style="max-height: 70px">
        <div class="navbar-header">
            <a class="navbar-brand" href="../Application/Form.po">Polygraphy LOGO</a>
        </div>

        <div class="h3 navbar-text" style="float: left">
            Polygraphy application
        </div>

        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><security:authentication property="principal.username"/><b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <sec:authorize access="hasAnyRole('ROLE_GOD', 'ROLE_ADMIN')">
                            <li><a href="../UserManagement/Users.po">Менеджер пользователей</a></li>
                            <li class="divider"></li>
                        </sec:authorize>
                        <li><a href="../${pageContext.request.contextPath}/Security/Logout.po">Выйти</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </nav>
    <hr>
</div>
