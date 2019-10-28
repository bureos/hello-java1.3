package demo.daili;

public class TargetTest implements TargetIntf{
    
	@Override
	public String say(String name){
		return "hello "+name;
	}
	
}
