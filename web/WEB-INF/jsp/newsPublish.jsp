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
            margin-bottom:10px;
        }
        .loginForm select{
            box-sizing: border-box;
            width: 80%;
            padding: 5px 8px;
            border: 1px solid #e0e0e0;
            margin-bottom:20px;
        }
    </style>
</head>
<body>
<form action="<%=basePath%>news/insert" class="loginForm" method="post">
    <input name="title" type="text" placeholder="标题">
    <textarea  style="resize: none;box-sizing: border-box;width: 80%;padding: 5px 8px;height: 150px;border: 1px solid
    #e0e0e0;margin-top: 20px;margin-bottom: 20px;"  name="content" placeholder="消息内容"></textarea>
    <input type="text" placeholder="提问" name="question">
    <input type="text" placeholder="答案A" name="answer1">
    <input type="text" placeholder="答案B" name="answer2">
    <input type="text" placeholder="答案C" name="answer3">
    <input type="text" placeholder="答案D" name="answer4"><br />
    <select name="rightAnswer">
        <option value="A">A</option>
        <option VALUE="B">B</option>
        <option VALUE="C">C</option>
        <option VALUE="D">D</option>
    </select><br />
    <input class="c_submitBtn" type="submit" value="发布">
</form>
</body>
</html>
