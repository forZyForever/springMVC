<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/12
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="color: red"></div>
<form action="/user/register" method="post">
   用户名: <input type="text" name="username">
    密码:<input type="text" name="password">
    昵称:<input type="text" name="nickname">
    <input type="submit" value="注册">
</form>
</body>
</html>
