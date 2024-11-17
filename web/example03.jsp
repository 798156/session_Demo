<%@ page import="javax.xml.crypto.Data" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: liuji
  Date: 2024/7/10
  Time: 上午10:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>example03</title>
</head>
<body>
<%--声明标识,可以定义方法和变量--%>
    <%!
        int a=1,b=2;
    %>
<%--jsp表达式--%>
    <%=a+b%>
    <!-- <%=new Date()%>-->    <!-- Wed Jul 10 10:17:31 CST 2024-->

</body>
</html>
