package com.zyx.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/servlet/LoginConf")
public class LoginConfServlet extends HttpServlet{
   /**
	 * 
	 */
	private static final long serialVersionUID = -5524363498987335479L;

    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    PrintWriter pw = resp.getWriter();
	    pw.write("LoginConfServlet");
    }
    @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    String username=req.getParameter("username");
	    String password=req.getParameter("password");
	    HttpSession session = req.getSession();
	    if(username.equals("James") && password.equals("1234")){
	    	session.setAttribute("login", "true");
	    	//注意处理路径不一致的问题,可能的话，就从contextPath开始，拼一个完整的路径
	    	//或者，使用相对路径，比如当前是/servlet/LoginConf,上一层就是顶层目录，自然可以访问到jsp的那几个目录
	    	//
	    	req.getRequestDispatcher("../jsp-filter-login-verify-use-servlet/LoginSuccess.jsp").forward(req, resp);;
	    }else{
	    	req.getRequestDispatcher("../jsp-filter-login-verify-use-servlet/LoginFailure.jsp").forward(req, resp);;
	    }
	    
	    
    }
}
