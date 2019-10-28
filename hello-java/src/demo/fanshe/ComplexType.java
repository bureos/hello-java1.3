package demo.fanshe;

public class ComplexType {
    private int a;
    protected Integer b;
    private String str;
    
    public ComplexType(){
    	
    }
    
    public ComplexType(int a){
    	this.a = a;
    }
    
    public ComplexType(int a, Integer b, String str){
    	this.a = a;
    	this.b = b;
    	this.str = str;
    }
    
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public Integer getB() {
		return b;
	}
	public void setB(Integer b) {
		this.b = b;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
    public void test1(){
    	return ;
    }
    
    public String test2(String str1,Integer aa){
    	return "";
    }
	
}
