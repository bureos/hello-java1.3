package com.zyx.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class HelloWorldTag extends TagSupport {
 
    private static final long serialVersionUID = -3382691015235241708L;
 
    @Override
    public int doStartTag() {
        try {
            pageContext.getOut().write("Hello World");
            return super.doStartTag();
        } catch (JspException e) {
            e.printStackTrace();
            return 0;
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }
}