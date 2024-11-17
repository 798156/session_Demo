<%--
  Created by IntelliJ IDEA.
  User: liuji
  Date: 2024/7/10
  Time: 下午9:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //页面域 存值
    pageContext.setAttribute("str","Java");
    //页面域取值
    String str=(String)pageContext.getAttribute("str");
    //请求域 存值
    ServletRequest request1=pageContext.getRequest();
    request1.setAttribute("str","JavaWeb");
    //请求域取值
    String str1=(String)request1.getAttribute("str");
%>
<%
    out.println("page范围:"+str+"<br>");
    out.println("request1范围:"+str1+"<br>");
//page范围:Java
//request1范围:JavaWeb
%>
</body>
</html>
