<%--
  Created by IntelliJ IDEA.
  User: liuji
  Date: 2024/7/10
  Time: 下午12:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    当前页面
    <%--引入被包含的页面--%>
    <jsp:include page="included.jsp" flush="true"/>
</body>
</html>