<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>用户表单</title>
</head>
<body>
<!-- 访问登录确认页面 -->
	<form action="LoginConf.jsp" method="post">
	  <table>
	    <tr>
	      <td  colspan="2">用户登录</td>
	    </tr>
	    <tr>
	    	<td>用户名</td>
	    	<td><input type="text" name="username" /></td>
	    </tr>
	    <tr>
	        <td>密码</td>
	        <td><input type="password" name="password" /></td>
	    </tr>
	    <tr>
	        <td  colspan="2">
	          <input type="submit" value="发送" />
	          <input type="reset" value="重置" />
	        </td>
	    </tr>
	  </table>
	</form>
</body>
</html>