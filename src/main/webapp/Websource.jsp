<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-12-29
  Time: 오후 12:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
