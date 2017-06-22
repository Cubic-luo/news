<%@ page import="java.util.Date" %><%--
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
</head>
<body>
<div style="padding:0 10px;font-size: 16px;">
    <h1 class="c_Title">${news.title}</h1>
    <div style="margin-bottom:10px;">${news.content}</div>
    <div>请回答如下问题：<br />${news.question}</div>
    <form action="<%=basePath%>task/insert" method="post" style="margin-bottom:30px;">
        <%--csrf token--%>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
        <input type="hidden" name="newsId" value="${news.id}">
        <div><input type="radio" name="myAnswer" VALUE="A" id="answer1"><label for="answer1">${news.answer1}</label></div>
        <div><input type="radio" name="myAnswer" VALUE="B"  id="answer2"><label for="answer2">${news.answer2}</label></div>
        <div><input type="radio" name="myAnswer" VALUE="C"  id="answer3"><label for="answer3">${news.answer3}</label></div>
        <div><input type="radio" name="myAnswer" VALUE="D"  id="answer4"><label for="answer4">${news.answer4}</label></div>
        <div><input class="c_submitBtn" type="submit" value="提交"></div>
    </form>
    <div>本文由：${news.user.username}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;发布于:<fmt:formatDate
            value="${news.creatTime}" type="both"/></div>
</div>
</body>
</html>
