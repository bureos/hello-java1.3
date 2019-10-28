package com.zyx.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LoginFilter implements Filter{

	@Override
	public void destroy() {
	}
    
	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) arg0;
		HttpSession session=request.getSession();
		String login=(String) session.getAttribute("username");
		String contextPath = request.getContextPath();
		System.out.println("contextPath is "+contextPath);
		System.out.println("uri is "+request.getRequestURI());
		String compareString=contextPath+"/jsp-filter-login-verify/LoginConf.jsp";
		if(compareString.equals(request.getRequestURI())){
			arg2.doFilter(arg0, arg1); //如果是判断页面本身,则跳过
		}else{
			/*if(login==null || login==""){
				//非判断页面,并且没有用户名
				request.getRequestDispatcher("LoginFailure.jsp").forward(arg0, arg1);
			}else*/{
				arg2.doFilter(arg0, arg1);
			}
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	}

}
