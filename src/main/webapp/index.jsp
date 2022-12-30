<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    </title>요청 실습</title>
</head>
<body>
<a href="res.jsp?name=park">GET요청</a>
<form method="post" action="res.jsp">
    이름:<input type="text" name="nickname"/>
    <input type="submit"/>전송
</form>
</body>
</html>