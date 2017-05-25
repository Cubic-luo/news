<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/5/24
  Time: 21:33
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
    <title>个人中心</title>
    <meta name="viewport" content="width=device-width, initial-scale=1,user-scalable=no">
</head>
<body>
<%--用户头像和用户名--%>
<div style="border-bottom: 1px solid #e0e0e0;padding-bottom:8px;margin-bottom:10px;">
    <img style="width: 60px;height: 60px;vertical-align: middle;margin-right:20px;border-radius: 50%;" src="<%=basePath%>resource/img/${user.imgUrl}" alt="头像">${user.username}
</div>
<div><a style="color: #000;display: block;text-align: center;" href="<%=basePath%>logout">退出登录</a></div>
</body>
</html>
