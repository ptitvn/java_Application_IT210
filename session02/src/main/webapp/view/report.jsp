<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Báo cáo điểm - BT2</title>
    <style>
        table { width: 50%; border-collapse: collapse; margin-top: 20px; }
        th, td { padding: 10px; text-align: left; }
        .high-score { color: red; font-weight: bold; }
    </style>
</head>
<body>

<h1>${reportTitle}</h1>

<table border="1">
    <thead>
    <tr>
        <th>STT</th>
        <th>Họ tên</th>
        <th>Điểm</th>
        <th>Xếp loại</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="sv" items="${studentList}" varStatus="status">
        <tr>
            <td>${status.index + 1}</td>
            <td><c:out value="${sv.fullName}" /></td>
            <td>${sv.score}</td>
            <td>
                <c:choose>
                    <c:when test="${sv.score >= 90}">
                        <span class="high-score">${sv.rank}</span>
                    </c:when>
                    <c:otherwise>
                        ${sv.rank}
                    </c:otherwise>
                </c:choose>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>