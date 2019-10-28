package demo.feignconsumer;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.exception.MyException;

@ControllerAdvice(basePackages = {"demo.feignconsumer"})
public class ExceptionHandle {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public String handle(Exception e) {
    	System.out.println("异常类:"+e.getClass());
    	e.printStackTrace();
        if (e instanceof MyException) {
        	MyException myException = (MyException) e;
        	System.err.println("我拦截到了错误码和信息:"+myException.toString());
        	return new String(myException.toString());
        }else{
            return new String("未知错误:"+e.getMessage());
        }
    }
}