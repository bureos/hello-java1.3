package demo.jiekouchouxiangshixian;

public class MyDemoImpl extends AbstractDemoImpl{

	@Override
	public String sayHello(String name) {
		super.method1();
		
		return "我的 "+name;
	}
    
	
	public static void main(String[] args) {
		DemoIntf demo = new MyDemoImpl();
		System.out.println(demo.sayHello("111"));
		
		
	}
	
}
