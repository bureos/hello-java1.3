<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>用户表单</title>
</head>
<body>
	<form action="ShowUser.jsp" method="post">
	    用户名:<input type="text" name="username" /> <br>
	    密码: <input type="password" name="password" /> <br>
	  <input type="submit" value="发送" />
	  <input type="reset" value="重置" />
	</form>
</body>
</html>