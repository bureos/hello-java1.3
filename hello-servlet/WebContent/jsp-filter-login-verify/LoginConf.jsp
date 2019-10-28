<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录判断</title>
</head>
<!-- 在这个例子中,判断登录是否成功是写死的代码,如果说要通过数据库的方式,可以在loginForm页面调用一个Servlet,在
     servlet里愿意怎么处理怎么处理. -->
<body>
    <center>
        <%
           String username=request.getParameter("username");
           String password=request.getParameter("password");
        %>
        <%
          if("James".equals(username) && "1234".equals(password)){
        	  session.setAttribute("username", username);
        %>
             <jsp:forward page="LoginSuccess.jsp"></jsp:forward>
        <%
          }else{
        %>
          <jsp:forward page="LoginFailure.jsp"></jsp:forward>
        <%
        }
        %>
    </center>
</body>
</html>