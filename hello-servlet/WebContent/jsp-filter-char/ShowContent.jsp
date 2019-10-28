<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示发言内容</title>
</head>
<body>
<!-- param 表示的就是param内置对象 -->
    <h1>发言成功</h1>
    用户名: ${param.username} <br/>
  发言内容: ${param.charContent }
</body>
</html>