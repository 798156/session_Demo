<%--
  Created by IntelliJ IDEA.
  User: liuji
  Date: 2024/7/11
  Time: 上午10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>header</title>
</head>
<body>
<div class="header">
    <div class="container">
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li><a href="#">首页</a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                                商品分类 <span class="caret"></span></a>
                        </li>
                        <li><a href="#">热销</a></li>
                        <li><a href="#">新品</a></li>
                        <li><a href="#" class="active">注册</a></li>
                        <li><a href="#">登录</a></li>
                    </ul>
                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>
        <div class="header-info">
            <div class="header-right">
                <span class="glyphicon glyphicon-search"></span>
            </div>
            <div class="header-right">
                <span class="glyphicon glyphicon-shopping-carth"></span>
            </div>
        </div>
    </div>
</div>
</body>
</html>
