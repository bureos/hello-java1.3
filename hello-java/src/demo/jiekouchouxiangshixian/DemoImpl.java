package demo.jiekouchouxiangshixian;

public class DemoImpl implements DemoIntf {

	@Override
	public String sayHello(String name) {
		
		System.out.println("实现类");
		return "hello "+name;
	}
	
	public static void main(String[] args) {
		
		System.out.println(new DemoImpl().sayHello("jack"));
		DemoIntf demo = new DemoImpl();
		System.out.println(demo.sayHello("tom"));
		
	}
    
}
