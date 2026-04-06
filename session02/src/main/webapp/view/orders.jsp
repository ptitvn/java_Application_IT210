<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>Danh sách đơn hàng</title>
    <style>
        table { border-collapse: collapse; width: 80%; margin-top: 10px; }
        th, td { border: 1px solid #ddd; padding: 8px; text-align: left; }
        th { background-color: #f2f2f2; }
    </style>
</head>
<body>

<h2>Xin chào, ${sessionScope.loggedUser}! (Vai trò: ${sessionScope.role})</h2>
<a href="<c:url value='/logout'/>">Đăng xuất</a>

<hr>

<table>
    <tr>
        <th>Mã đơn</th>
        <th>Sản phẩm</th>
        <th>Tổng tiền</th>
        <th>Ngày đặt</th>
    </tr>
    <c:forEach var="o" items="${orderList}">
        <tr>
            <td>${o.id}</td>
            <td>${o.productName}</td>
            <td>
                <fmt:formatNumber value="${o.amount}" type="currency" currencySymbol="VNĐ" />
            </td>
            <td>
                <fmt:formatDate value="${o.orderDate}" pattern="dd/MM/yyyy" />
            </td>
        </tr>
    </c:forEach>
</table>

<p style="margin-top: 20px; font-weight: bold;">
    Tổng lượt xem đơn hàng toàn hệ thống:
    <span style="color: blue;">${applicationScope.totalViewCount}</span>
</p>

</body>
</html>