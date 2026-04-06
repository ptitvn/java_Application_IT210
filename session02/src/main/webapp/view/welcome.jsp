<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <title>Chào mừng nhân viên</title>
</head>
<body>
<h2>Xin chào, <c:out value="${staffName}"/>!</h2>
<p>Bạn thuộc phòng ban: <strong><c:out value="${department}"/></strong></p>
</body>
</html>
