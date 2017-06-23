<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/5/24
  Time: 21:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>个人中心</title>
    <meta name="viewport" content="width=device-width, initial-scale=1,user-scalable=no">
    <link rel="stylesheet" href="<%=basePath%>resource/css/base.css">
    <style>
        .list a {
            display: block;
            line-height: 2em;
            color: #000;
            border-bottom: 1px solid #e0e0e0;
            margin-bottom: 10px;
            font-size: 16px;
        }
    </style>
</head>
<body style="padding:10px;">
<%--用户头像和用户名--%>
<div style="padding-bottom:8px;margin-bottom:50px;font-size: 18px;">
    <img style="width: 60px;height: 60px;margin-right:20px;border-radius: 50%;"
         src="<%=basePath%>resource/img/${user.imgUrl}" alt="头像">${user.username}
</div>
<div>积分余额：${user.point}</div>
<div class="list">
    <a href="<%=basePath%>logout">退出登录</a>
    <a href="<%=basePath%>">回到主页</a>
    <%--增加新闻开始--%>
    <a href="<%=basePath%>news/publish">发布广告</a>
    <a href="<%=basePath%>task/history">历史记录</a>
    <%--增加新闻结束--%>
    <%--当管理员登录时才显示管理页面的通道--%>
    <sec:authorize access="hasRole(1)">
        <a href="<%=basePath%>news/manage">广告管理</a>
    </sec:authorize>
</div>
</body>
</html>
