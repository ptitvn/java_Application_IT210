<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<head>
    <title>Trang Chào Mừng</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 40px; line-height: 1.6; }
        .container { border: 1px solid #ddd; padding: 20px; border-radius: 8px; width: 400px; }
        h2 { color: #2c3e50; }
        .info { font-weight: bold; color: #e67e22; }
    </style>
</head>
<body>
<div class="container">
    <h2>Chào mừng nhân viên mới!</h2>
    <p>Họ và tên: <span class="info">${staffName}</span></p>
    <p>Bộ phận: <span class="info">${department}</span></p>
    <hr>
    <p>Chúc bạn một ngày làm việc hiệu quả!</p>
</div>
</body>
</html>