<%--
  Created by IntelliJ IDEA.
  User: ssc
  Date: 2017/9/1
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="UserServlet">
    id:<input type="text" name="id" id="uid"><br>
    用户名:<input type="text" name="name" id="uname"><br>
    密码:<input type="password" name="password" id="upassword"><br>
    <input type="submit" value="注册">
</form>
</body>
</html>
