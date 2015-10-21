<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<spring:url value="/resources/" var="resources"/>

<html>
<head>
    <jsp:include page="../static/bootstapCFG.jsp"/>
    <script src="${resources}js/application.js"></script>
    <link rel="stylesheet" href="${resources}css/style.css">
</head>
<body>
<div class="wrapper">
    <jsp:include page="../static/header.jsp"/>
    <div class="container main-block">
        <div id="table-block">
            <table class="table table-bordered">
                <caption><h3 align="center">Выполненые заказы</h3></caption>
                <tr>
                    <th>№</th>
                    <th>Название заказа</th>
                    <th>Кра
                        сочн
                    </th>
                    <th>Тираж
                        экз
                    </th>
                    <th>Тираж
                        лист
                    </th>
                    <th>Оборот</th>
                    <th>Формат</th>
                    <th>Пост печ.</th>
                    <th>Бумага</th>
                    <th>Наличие макета</th>
                    <th>Срок сдачи</th>
                    <th>Порезка бумаги</th>
                    <th>Путевка</th>
                    <th>Формы</th>
                    <th>Печать</th>
                    <th>Состояние</th>
                </tr>
                <tr>
                    <td>1</td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td>2</td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td>3</td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
            </table>
        </div>
        <a class="btn btn-default btn-cfg" href="Orders.po">Вернуться</a>
    </div>
    <jsp:include page="../static/footer.jsp"/>
</div>
</body>
</html>

