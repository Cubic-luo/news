<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/5/19
  Time: 0:14
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
    <title>首页</title>
    <meta name="viewport" content="width=device-width, initial-scale=1,user-scalable=no">
    <link rel="stylesheet" href="<%=basePath%>resource/css/base.css">
    <link rel="stylesheet" href="<%=basePath%>resource/css/index.css">
</head>
<body>
<%--新闻列表开始--%>
<div class="wrap">
    <c:forEach var="news" items="${newsList}">
        <a href="<%=basePath%>news/${news.id}/showDetail" class="newsList">
            <h1 class="c_Title">${news.title}</h1>
            <div class="content">${news.content}</div>
            <div class="time">${news.user.username}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<fmt:formatDate value="${news.creatTime}" type="both" /></div>
        </a>
    </c:forEach>
</div>
<%--新闻列表结束--%>
<%--底部菜单开始--%>
    <a class="menu" href="<%=basePath%>user"><img src="<%=basePath%>resource/img/i1.jpg" alt="">个人中心</a>
<%--底部菜单结束--%>
</body>
</html>
