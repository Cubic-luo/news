<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/5/24
  Time: 21:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>登录</title>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1,user-scalable=no">
    <link rel="stylesheet" href="<%=basePath%>resource/css/base.css">
    <style>
        .loginForm {
            text-align: center;
            padding-top: 20px;
        }

        .loginForm div {
            margin-top: 10px;
        }
        .loginForm a{
            color: orange;
        }
        .loginForm input {
            box-sizing: border-box;
            width: 80%;
            padding: 5px 8px;
            border: 1px solid #e0e0e0;
        }

        .submitBtn {
            background-color: green;
            color: #fff;
            margin-top: 10px;
        }
    </style>
</head>
<body>
<form action="<%=basePath%>user/login" class="loginForm" method="post">
    <%--csrf token--%>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
    <div>
        <input type="text" placeholder="输入用户名" name="username">
    </div>
    <div>
        <input type="password" placeholder="输入密码" name="password">
    </div>
    <div>
        <input type="submit" class="submitBtn" value="登录">
    </div>
    <div style="text-align: right;padding-right: 10%;padding-top: 10px;">还没有账号？<a href="<%=basePath%>user/showRegister">立即注册</a></div>
</form>
</body>
</html>
