<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: liuji
  Date: 2024/7/10
  Time: 下午8:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  buffer="0kb"%>
<%--buffer="0kb"改变缓存区大小，得到
First line
Second line--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    out.println("First line <br/>");//先放入缓冲区，再在整个jsp文件结束的时候输出
    PrintWriter writer=response.getWriter();
    writer.write("Second line <br/>");
//    Second line
//    First line
%>
</body>
</html>
