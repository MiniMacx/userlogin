<%--
  Created by IntelliJ IDEA.
  User: airmacx
  Date: 17-3-22
  Time: 下午5:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>欢迎界面</title>
</head>
<body>
<h1>登陆成功！</h1>
<sf:form method="post" action="/userlogin/uploading" enctype="multipart/form-data">
    文件:<input type="file" name="file">
    <input type="submit" value="提交">
</sf:form>
</body>
</html>
