package demo.jichengchongzai;

public class Test {
    
	public static void main(String[] args) {
		Child child = new Child();
		System.out.println("-----------");
		child.parentMethod();
		System.out.println("-----------");
		child.childMethod();
		System.out.println("-----------");
		child.test1();
	}
}
