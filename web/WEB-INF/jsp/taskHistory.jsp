<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/22
  Time: 21:24
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
    <title>历史记录</title>
    <meta name="viewport" content="width=device-width, initial-scale=1,user-scalable=no">
    <link rel="stylesheet" href="<%=basePath%>resource/css/base.css">
</head>
<body>
<div class="wrap">
    <c:forEach var="task" items="${taskList}">
        <div style="margin-bottom:20px;">
            <p>我的答案：${task.myAnswer}</p>
            <p>消息ID：${task.newsId}</p>
            <p>时间:<fmt:formatDate value="${task.creatTime}"/></p>
        </div>
    </c:forEach>
</div>
</body>
</html>
