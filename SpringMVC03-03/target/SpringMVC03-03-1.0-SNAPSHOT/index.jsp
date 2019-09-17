<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>转账业务</h2>
<form action="/account/trade" method="post">
    转账人:<input type="text" name="jack"><br>
    收款人:<input type="text" name="rose"><br>
    转账金额:<input type="text" name="money"><br>
    <input type="submit" value="转账">
</form>
</body>
</html>
