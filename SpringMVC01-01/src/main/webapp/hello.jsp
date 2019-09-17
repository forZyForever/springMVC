<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/9
  Time: 20:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/mvc/hello/params" method="post">
    姓名:<input type="text" name="username"><br>
    密码:<input type="text" name="password"><br>
    地址:<input type="text" name="address"><br>
    日期:<input type="text" name="date"><br>
    身份证号码:<input type="text" name="IdCard.cardNum"><br>
    身份证地址:<input type="text" name="IdCard.cardAddress"><br>
    第一个手机名称:<input type="text" name="mobiles[0].name"><br>
    第一个手机价钱:<input type="text" name="mobiles[0].money"><br>
    第二个手机名称:<input type="text" name="mobiles[1].name"><br>
    第二个手机价钱:<input type="text" name="mobiles[1].money">
    <input type="submit" value="注册">
</form>
</body>
</html>
