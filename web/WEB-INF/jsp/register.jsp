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

        .loginForm a {
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
        .error{
            font-size: 14px;
            text-align: left;
            padding-left:10%;
        }
    </style>
</head>
<body>
<form action="<%=basePath%>user/register" class="loginForm" method="post">
    <%--csrf token--%>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
    <div>
        <input type="text" placeholder="输入用户名" name="username">
    </div>
    <div>
        <input id="password" type="password" placeholder="输入密码" name="password">
    </div>
    <div>
        <input type="password" placeholder="确认密码" name="password2">
    </div>
    <div>
        <input type="submit" class="submitBtn" value="注册">
    </div>
    <div style="text-align: right;padding-right: 10%;padding-top: 10px;">已有账号？<a href="<%=basePath%>user/login">立即登录</a>
    </div>
</form>
<script src="<%=basePath%>resource/js/jquery.min.js"></script>
<script src="<%=basePath%>resource/js/Validation.js"></script>
<script type="application/javascript">
    $().ready(function () {
        $(".loginForm").validate({
            errorElement: "div",
            rules: {
                username: {
                    required: true,
                },
                password: {
                    required: true,
                    minlength: 6,
                    maxlength: 16
                },
                password2: {
                    equalTo: "#password"
                }
            },

            messages: {
                username: {
                    required: "用户名不能为空",
                },
                password: {
                    required: "请输入密码",
                    minlength: "密码为6到16位",
                    maxlength: "密码为6到16位"
                },
                password2: {
                    equalTo: "两次密码不同"
                }
            }
        })
    })
</script>
</body>
</html>
