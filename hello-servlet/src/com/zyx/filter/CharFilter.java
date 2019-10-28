package com.zyx.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharFilter implements Filter{

	@Override
	public void destroy() {
		System.out.println("非法字符过滤器init");
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
	    arg0.setCharacterEncoding("UTF-8");
	    String content = arg0.getParameter("charContent");
	    if(content!=null){
	    	if(content.indexOf("晕")==-1){
	    		arg2.doFilter(arg0, arg1);
	    	}else{
	    		arg0.getRequestDispatcher("SendFailure.jsp").forward(arg0, arg1);
	    	}
	    }else{
	    	arg2.doFilter(arg0, arg1);
	    }
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("非法字符过滤器 init ");
	}

}
