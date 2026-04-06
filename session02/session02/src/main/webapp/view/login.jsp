<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%-- Import JSTL để dùng các thẻ core nếu cần --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Đăng nhập hệ thống</title>
    <style>
        body { font-family: Arial, sans-serif; display: flex; justify-content: center; align-items: center; height: 100vh; margin: 0; background-color: #f0f2f5; }
        .login-container { background: white; padding: 30px; border-radius: 8px; box-shadow: 0 4px 12px rgba(0,0,0,0.1); width: 350px; }
        h2 { text-align: center; color: #1c1e21; }
        .form-group { margin-bottom: 15px; }
        label { display: block; margin-bottom: 5px; font-weight: bold; }
        input[type="text"], input[type="password"] { width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px; box-sizing: border-box; }
        button { width: 100%; padding: 10px; background-color: #007bff; border: none; color: white; font-size: 16px; border-radius: 4px; cursor: pointer; }
        button:hover { background-color: #0056b3; }
        .error-msg { color: red; background: #fff2f2; padding: 10px; border-radius: 4px; margin-bottom: 15px; text-align: center; font-size: 14px; }
    </style>
</head>
<body>

<div class="login-container">
    <h2>Đăng nhập</h2>

    <%-- Hiển thị thông báo lỗi từ Request Scope (Model) --%>
    <c:if test="${not empty error}">
        <div class="error-msg">
                ${error}
        </div>
    </c:if>

    <form action="${pageContext.request.contextPath}/login" method="post">
        <div class="form-group">
            <label>Tên đăng nhập:</label>
            <input type="text" name="username" placeholder="admin hoặc staff" required>
        </div>

        <div class="form-group">
            <label>Mật khẩu:</label>
            <input type="password" name="password" placeholder="admin123 hoặc staff123" required>
        </div>

        <button type="submit">Đăng nhập</button>
    </form>

    <div style="margin-top: 15px; font-size: 12px; color: #666; text-align: center;">
        <p>Gợi ý: admin/admin123 hoặc staff/staff123</p>
    </div>
</div>

</body>
</html>