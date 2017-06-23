<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/5/26
  Time: 15:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>新闻管理</title>
    <meta name="viewport" content="width=device-width, initial-scale=1,user-scalable=no">
    <link rel="stylesheet" href="<%=basePath%>resource/css/base.css">
    <style>
        body {
            background: #F5F5F5;
        }

        .news {
            font-size: 16px;
            padding: 10px;
            border-top: 1px solid #e0e0e0;
            border-bottom: 1px solid #e0e0e0;
            margin-bottom: 10px;
            background: #fff;
        }
    </style>
</head>
<body>
<c:forEach items="${newsList}" var="news">
    <div class="news">
        <p>${news.title}</p>
        <div>小编：${news.user.username}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;时间:<fmt:formatDate
                value="${news.creatTime}" type="both"/></div>
        <p><a style="display: block;color: #000;text-align: right;margin-top:10px;"
              href="<%=basePath%>news/${news.id}/delete">删除</a></p>
    </div>
</c:forEach>
<a href="<%=basePath%>" style="margin-top:10px;background: #fff;color: #000;display: block;font-size: 16px;padding-top:10px;padding-left:10px;">返回主页</a>
</body>
</html>
