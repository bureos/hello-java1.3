package demo.jiandan;

public class HelloServiceImpl implements HelloService{

	@Override
	public String hello(String name) {
		return "hello dubbo,"+name;
	}
    
}
