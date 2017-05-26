<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/5/26
  Time: 17:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>发布新闻</title>
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
<form action="<%=basePath%>news/insert" class="loginForm" method="post">
    <input name="title" type="text" placeholder="标题">
    <input name="author" type="hidden" value="<sec:authentication property='principal.username'/>">
    <textarea  style="resize: none;box-sizing: border-box;width: 80%;padding: 5px 8px;height: 150px;border: 1px solid
    #e0e0e0;margin-top: 20px;"  name="content" placeholder="新闻内容"></textarea>

    <input class="submitBtn" type="submit" value="发布">
</form>
</body>
</html>
