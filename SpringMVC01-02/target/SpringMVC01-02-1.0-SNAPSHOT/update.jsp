<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/12
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/user/update" method="post">
    <input type="hidden" name="id" value="1">
    <input type="text" name="username">
    <input type="text" name="password">
    <input type="submit" value="提交">
</form>
</body>
</html>
