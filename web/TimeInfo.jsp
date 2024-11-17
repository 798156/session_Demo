<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Jsp统一显示时间</title>
</head>
<body>
    <%  //里面可以写java代码
        Date data=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String today=sdf.format(data);
        response.getWriter().write("当前时间:"+today);//当前时间:2024-07-10 09:51:03
    %>
    当前时间:<%=today%><%--一样效果--%>

</body>
</html>
