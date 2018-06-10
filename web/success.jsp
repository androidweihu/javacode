<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/6/10/010
  Time: 23:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录成功页面</title>
</head>
<body>
欢迎您:<%
    String name=request.getParameter("userName");
    out.write(name);
%>

<a href="/home.jsp">跳转到主页</a>
</body>
</html>
