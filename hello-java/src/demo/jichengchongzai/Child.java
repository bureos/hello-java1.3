package demo.jichengchongzai;

public class Child extends Parent{
    public void childMethod(){
    	System.out.println("child method");
    }
	
    // 重载
	@Override
	public void test1() {
		System.out.println("my test1");
		super.test1();
		System.out.println("my test2");
	}
}
