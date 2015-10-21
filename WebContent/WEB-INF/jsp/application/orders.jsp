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
        <div id="href-group">
            <a class="btn btn-default btn-lg btn-cfg" href="Form.po">Новый заказ</a>
            <a class="btn btn-default btn-lg btn-cfg" href="CompletedOrders.po">Выполненые работы</a>
        </div>
        <div id="table-block">
            <table class="table table-bordered">
                <caption><h3 align="center">Текущий график</h3></caption>
                <tr>
                    <th>№</th>
                    <th style="-webkit-writing-mode: vertical-rl; writing-mode:tb-rl;">Название заказа</th>
                    <th>Кра
                        сочн
                    </th>
                    <th>Тираж
                        экз
                    </th>
                    <th>Тираж
                        лист
                    </th>
                    <th style="-webkit-writing-mode: vertical-rl; writing-mode:tb-rl;">Оборот</th>
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
                    <td style="border: 1px solid #ffffff">???</td>
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
                    <td style="border: 1px solid #ffffff">???</td>
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
                    <td style="border: 1px solid #ffffff">???</td>
                </tr>
            </table>
        </div>
    </div>
    <jsp:include page="../static/footer.jsp"/>
</div>
</body>
</html>
