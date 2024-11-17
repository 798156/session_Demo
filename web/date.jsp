<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--日期--%>
<%
    Date data = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String date = sdf.format(data);
    response.getWriter().write("当前时间:"+date);
%>
当前的时间:<%=date%>
</body>
</html>
