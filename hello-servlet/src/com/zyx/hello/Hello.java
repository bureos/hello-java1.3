package com.zyx.hello;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 * ���е�url�����ϱ����Ͼ��Ǹ�servlet,����ʹ��ע��ķ�ʽʵ�ּ򵥵�servlet·������.
 */
//ServletRequest�Ƚӿ���servlet-api.jar��.
@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hello() {
        super();
        System.out.println("Hello servlet loaded!");
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath()+"\n");
		response.getWriter().println("url:"+request.getRequestURI());
		Enumeration<String> headers=request.getHeaderNames();
		while(headers.hasMoreElements()){
			String headName= headers.nextElement();
			System.out.println(headName+":"+request.getHeader(headName));
			response.getWriter().println(headName+":"+request.getHeader(headName));
		}
		response.getWriter().close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.getWriter().println("response from post method!!");
	}

}
