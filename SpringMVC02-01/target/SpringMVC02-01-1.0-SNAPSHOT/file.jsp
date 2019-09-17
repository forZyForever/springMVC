<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/10
  Time: 21:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<%--上传文件的表单enctype为mulit--%>
<form action="/file/upload03" method="post" enctype="multipart/form-data">
    选择文件:<input type="file" name="upload"><br>
    <input type="submit" value="上传">
</form>
</body>
</html>
