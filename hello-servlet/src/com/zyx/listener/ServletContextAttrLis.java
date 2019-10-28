package com.zyx.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.annotation.WebListener;

@WebListener
public class ServletContextAttrLis implements ServletContextAttributeListener{

	@Override
	public void attributeAdded(ServletContextAttributeEvent arg0) {
		System.out.println("新增了属性"+arg0.getName()+",值"+arg0.getValue());
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent arg0) {
		System.out.println("删除了属性"+arg0.getName()+",值"+arg0.getValue());
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent arg0) {
		System.out.println("替换了属性"+arg0.getName()+",值"+arg0.getValue());
		
	}

}
