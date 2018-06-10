<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/6/11/011
  Time: 0:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp语法</title>
</head>
<body>
<%--jsp注释，安全，不耗流量--%>
<!-- html注释不安全，消耗流量，少用-->
<%!
//    全局变量
    int a=10;
%>
<%
    int num=1;
    out.write(num+"");
    num++;
    a++;


%>

<%=num
%>

<%=a
%>
</body>
</html>
