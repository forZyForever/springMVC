<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/12
  Time: 21:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>欢迎${sessionScope.user.nickname}登录</h1>
<a href="/WEB-INF/pages/car.jsp">前往购物车</a>
</body>
</html>
