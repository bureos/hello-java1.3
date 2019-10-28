package com.zyx.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ServletContextLis implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("contextDestroyed");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("contextInitialized");
	}

}
