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
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript">
    function check() {
        var str=document.upload.file.value;
        if(str.length==0){
            alert("请选择文件上传");
            return false;
        }
        return true;
    }
</script>
<body>
<h2>欢迎您：${user.username}</h2>
<form name="upload" method="post" action="/userlogin/uploading"  enctype="multipart/form-data" onsubmit="return check()">
    文件:<input  type="file" name="file"/>
    <input id="queryBtn" type="submit" value="提交">
</form>
</body>



</html>
