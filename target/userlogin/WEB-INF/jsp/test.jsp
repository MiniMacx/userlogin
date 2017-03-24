<%--
  Created by IntelliJ IDEA.
  User: airmacx
  Date: 17-3-24
  Time: 下午10:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>提交表单页</title>
    <script type="text/javascript">
        function myCheck()
        {
            for(var i=0;i<document.form1.elements.length-1;i++)
            {
                if(document.form1.elements[i].value=="")
                {
                    alert("当前表单不能有空项");
                    document.form1.elements[i].focus();
                    return false;
                }
            }
            return true;

        }
    </script>
</head>
<body>
<form name="form1" method="post" action="page2.html" onSubmit="return myCheck()">
    用户名:<input type="text" name="username"><br>
    性别:<input type="text" name="sex"><br>
    出生时间:<input type="text" name="birthday"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
