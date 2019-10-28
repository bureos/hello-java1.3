<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- pageEncoding也需要修改为UTF-8 -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>非法字符验证表单</title>
</head>
<body>
   <form action="ShowContent.jsp" method="post">
       用户名: <input type="text" name="username"/><br>
      发言<br>
    <textarea name="charContent" rows="20" cols="40"></textarea><br>
    <input type="submit" value="发送" />
	  <input type="reset" value="重置" />
   </form>
</body>
</html>