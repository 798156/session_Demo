<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>example02</title>
</head>
<body>
<%--声明标识,可以定义方法和变量--%>
    <%!
        int c=3;
        public int add(int a,int b){
            return a+b+c;
        }
    %>
<%--代码片段，调用方法--%>
    <%
        out.println(add(1,2));
    %>
</body>
</html>
