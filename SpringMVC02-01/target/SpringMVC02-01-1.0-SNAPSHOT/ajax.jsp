<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/10
  Time: 20:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<script src="js/jquery-3.3.1.js"></script>
<script>
    /*ajax异步请求json格式数据请求发往服务器*/
    $.post({
        url:"/hello/ajax",
        data:'{"id":1,"username":"刘亦菲","password":"chn","nickname":"cc"}',
        contentType:"application/json;charset=utf-8",
        dataType:"json",
        success:function (result) {/*此处result代表返回的user*/
            alert(result.username+":"+result.nickname)
        }

    })
</script>
<h1>异步请求</h1>
</body>
</html>
