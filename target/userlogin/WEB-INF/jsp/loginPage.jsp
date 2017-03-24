<%--
  Created by IntelliJ IDEA.
  User: airmacx
  Date: 17-3-22
  Time: 下午6:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

    <title>用户登录</title>
</head>

<script type="text/javascript">
    function openReg() {
        window.location="reg";
    }

        function myCheck()
        {
            var name=document.form1.username.value;
            var password=document.form1.password.value;
            if(name==""){
                alert("请输入用户名");
                return false;
            }
            if(password==""){
                alert("请输入密码");
                return false;
            }
            return true;

        }

</script>

<body>

<div class="col-md-3 col-md-offset-4">
    <div class="col-md-offset-4"> <h1>用户登录</h1></div>

    <table>
        <form name="form1" role="form" action="/userlogin/logining" method="post" id="myform" onsubmit="return myCheck()">
            <div class="form-group">
                <label  class="col-sm-3 control-label">用户名：</label>
                <input type="text" class="form-control" id="username" name="username"/>
            </div>
            <div class="form-group">
                <label  class="col-sm-3 control-label">密码：</label>
                <input type="password" class="form-control" id="password" name="password"/>
            </div>
            <div class="form-group">
                <div class="col-md-offset-4 col-sm-10">
                    <input type="submit" class="btn btn-primary" value="提交" id="login" />
                    <button type="button" class="btn btn-primary" onclick="openReg()">注册</button>
                </div>
            </div>
        </form>
    </table>
</div>
</body>

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</html>
