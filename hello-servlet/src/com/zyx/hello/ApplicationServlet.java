package com.zyx.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/App")
public class ApplicationServlet extends HttpServlet{
   /**
	 * 
	 */
	private static final long serialVersionUID = -5524363498987335479L;

    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取ServletContext的两种方法
    	ServletContext application = getServletContext();
        ServletContext application2 = req.getServletContext();
        System.out.println(application);
        System.out.println(application2);
        PrintWriter out = resp.getWriter();
        application.setAttribute("name", "aaa");
        out.write("<html>");
        out.write("<h1>"+application.getAttribute("name")+"</h1>");
        out.write("</html>");
    }
}
