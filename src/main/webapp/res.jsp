<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-12-29
  Time: 오후 12:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Insert title here</title>
</head>
<body>
    <%
        String name = request.getParameter("name");
        String nickname = request.getParameter("nickname");
    %>
    이름:<%=name%><br/>
    별명:<%=nickname%>
</body>
</html>
