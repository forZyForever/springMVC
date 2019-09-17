<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<script src="js/jquery-3.3.1.js"></script>
<script>
    function checkUsername(value) {
        $.post("/user/check", "username="+value, function (result) {
            if (result.flag) {
                    if (result.data){
                        $("#uspan").html("用户名已存在")
                    } else{
                        $("#uspan").html("用户名可以使用")
                    }
            } else {
                $("#uspan").html("服务器异常")
            }
        },"json")
    }
</script>
<body>

<input type="text" name="username" onblur="checkUsername(this.value)"><span id="uspan" style="color: red"></span>

</body>
</html>
