<%--
  Created by IntelliJ IDEA.
  User: airmacx
  Date: 17-3-22
  Time: 下午5:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <title>用户注册</title>
</head>
<body>

    <div class="col-md-3 col-md-offset-4">
        <div class="col-md-offset-4"> <h1>用户注册</h1></div>

        <table >
            <form role="form" action="/userlogin/regging" method="post" id="myform">
                <div class="form-group">
                    <label  class="col-sm-3 control-label">用户名：</label>
                    <input type="text" class="form-control" id="username" name="username"/>
                </div>
                <div class="form-group">
                    <label  class="col-sm-3 control-label">密码：</label>
                    <input type="password" class="form-control" id="password" name="password"/>
                </div>
                <div class="form-group">
                    <div class="col-md-offset-5 col-sm-10">
                        <input type="submit" class="btn btn-primary btn-lg" value="提交" id="login" />
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
